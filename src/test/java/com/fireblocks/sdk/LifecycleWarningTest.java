
import com.fireblocks.sdk.LifecycleWarning;
import java.net.http.HttpHeaders;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

public class LifecycleWarningTest {

    private static final String SUNSET = "Fri, 15 Jan 2027 00:00:00 GMT";
    private static final String MIGRATION_GUIDE =
            "https://developer.fireblocks.com/docs/v2-migration";
    private static final String SUCCESSOR = "https://api.fireblocks.io/v1/transactions_v2";

    private Logger lifecycleLogger;
    private List<LogRecord> records;
    private Handler captureHandler;
    private boolean previousUseParentHandlers;

    @Before
    public void setUp() {
        records = new ArrayList<>();
        captureHandler =
                new Handler() {
                    @Override
                    public void publish(LogRecord record) {
                        records.add(record);
                    }

                    @Override
                    public void flush() {}

                    @Override
                    public void close() {}
                };
        lifecycleLogger = Logger.getLogger(LifecycleWarning.LOGGER_NAME);
        previousUseParentHandlers = lifecycleLogger.getUseParentHandlers();
        lifecycleLogger.setUseParentHandlers(false);
        lifecycleLogger.addHandler(captureHandler);
        lifecycleLogger.setLevel(Level.ALL);
    }

    @After
    public void tearDown() {
        lifecycleLogger.removeHandler(captureHandler);
        lifecycleLogger.setUseParentHandlers(previousUseParentHandlers);
        lifecycleLogger.setLevel(null);
    }

    private static HttpHeaders headers(Map<String, List<String>> values) {
        return HttpHeaders.of(values, (k, v) -> true);
    }

    private static HttpHeaders headersOf(String state, String sunset, String link) {
        Map<String, List<String>> values = new LinkedHashMap<>();
        if (state != null) {
            values.put(LifecycleWarning.LIFECYCLE_STATE_HEADER, Collections.singletonList(state));
        }
        if (sunset != null) {
            values.put(LifecycleWarning.SUNSET_HEADER, Collections.singletonList(sunset));
        }
        if (link != null) {
            values.put(LifecycleWarning.LINK_HEADER, Collections.singletonList(link));
        }
        return headers(values);
    }

    private static HttpHeaders state(String value) {
        return headersOf(value, null, null);
    }

    /**
     * A JVM cannot clear environment variables, so a developer who exported
     * FIREBLOCKS_SDK_SUPPRESS_LIFECYCLE_WARNING in their shell would see the tests that expect a
     * logged warning fail. Skip those instead.
     */
    private static void assumeSuppressionNotSet() {
        Assume.assumeFalse(
                "FIREBLOCKS_SDK_SUPPRESS_LIFECYCLE_WARNING is set in this environment",
                LifecycleWarning.isSuppressed(System.getenv(LifecycleWarning.SUPPRESS_ENV_VAR)));
    }

    /** Most tests do not care about the status; 200 is a plain success. */
    private static String buildMessage(HttpHeaders headers, String operationId) {
        return LifecycleWarning.buildMessage(headers, operationId, 200);
    }

    private static void warn(HttpHeaders headers, String operationId) {
        LifecycleWarning.warn(headers, operationId, 200);
    }

    // --- emission -----------------------------------------------------------

    @Test
    public void emitsOneWarningForNonGaState() {
        assumeSuppressionNotSet();
        warn(state("beta"), "createTransaction");
        Assert.assertEquals(1, records.size());
        Assert.assertTrue(records.get(0).getMessage().contains("createTransaction"));
        Assert.assertTrue(records.get(0).getMessage().contains("beta"));
        Assert.assertEquals(Level.WARNING, records.get(0).getLevel());
    }

    @Test
    public void emitsPerExecutionNotOncePerOperation() {
        assumeSuppressionNotSet();
        warn(state("beta"), "createTransaction");
        warn(state("beta"), "createTransaction");
        Assert.assertEquals(2, records.size());
    }

    @Test
    public void emitsForEachDistinctOperation() {
        assumeSuppressionNotSet();
        warn(state("beta"), "createTransaction");
        LifecycleWarning.warn(state("closed"), "getVaultAccount", 200);
        Assert.assertEquals(2, records.size());
    }

    // --- silence ------------------------------------------------------------

    @Test
    public void staysSilentForGaAndUnrecognisedStates() {
        String[] silent = {
            "ga",
            "internal",
            "unlisted",
            "private_beta",
            "quantum_preview",
            "",
            "   ",
            "private beta",
            "private-beta",
            "<script>"
        };
        for (String value : silent) {
            Assert.assertNull("expected silence for: " + value, buildMessage(state(value), "op"));
        }
    }

    @Test
    public void staysSilentWhenHeaderIsAbsent() {
        Assert.assertNull(buildMessage(headers(new LinkedHashMap<>()), "op"));
        Assert.assertNull(buildMessage(null, "op"));
    }

    @Test
    public void staysSilentWithoutAnOperationId() {
        warn(state("beta"), null);
        warn(state("beta"), "");
        Assert.assertTrue(records.isEmpty());
    }

    @Test
    public void unknownStateDoesNotThrow() {
        warn(state("quantum_preview"), "op");
        Assert.assertTrue(records.isEmpty());
    }

    // --- case handling ------------------------------------------------------

    @Test
    public void warnsOnUppercaseStateValue() {
        String message = buildMessage(headersOf("DEPRECATED", SUNSET, null), "op");
        Assert.assertNotNull(message);
        Assert.assertTrue(message.contains("deprecated"));
    }

    @Test
    public void headerNameLookupIsCaseInsensitive() {
        Map<String, List<String>> values = new LinkedHashMap<>();
        values.put("fireblocks-lifecycle-state", Collections.singletonList("beta"));
        Assert.assertNotNull(buildMessage(headers(values), "op"));
    }

    @Test
    public void rendersStateVerbatimAsSnakeCase() {
        String message = buildMessage(state("beta"), "op");
        Assert.assertTrue(message.contains("'beta'"));
        Assert.assertFalse(message.contains("Private Beta"));
    }

    // --- deprecated message shapes ------------------------------------------

    @Test
    public void deprecatedWithoutLinksHasSunsetOnly() {
        Assert.assertEquals(
                "Operation 'op' is deprecated and will stop working after " + SUNSET + ".",
                buildMessage(headersOf("deprecated", SUNSET, null), "op"));
    }

    @Test
    public void deprecatedWithSuccessorOnly() {
        String link = "<" + SUCCESSOR + ">; rel=\"successor-version\"";
        Assert.assertEquals(
                "Operation 'op' is deprecated and will stop working after "
                        + SUNSET
                        + ". Use "
                        + SUCCESSOR
                        + " instead.",
                buildMessage(headersOf("deprecated", SUNSET, link), "op"));
    }

    @Test
    public void deprecatedWithMigrationGuideOnly() {
        String link = "<" + MIGRATION_GUIDE + ">; rel=\"deprecation\"";
        Assert.assertEquals(
                "Operation 'op' is deprecated and will stop working after "
                        + SUNSET
                        + ". Migration guide: "
                        + MIGRATION_GUIDE,
                buildMessage(headersOf("deprecated", SUNSET, link), "op"));
    }

    @Test
    public void deprecatedWithBothLinksOrdersSuccessorFirst() {
        String link =
                "<"
                        + MIGRATION_GUIDE
                        + ">; rel=\"deprecation\", <"
                        + SUCCESSOR
                        + ">; rel=\"successor-version\"";
        Assert.assertEquals(
                "Operation 'op' is deprecated and will stop working after "
                        + SUNSET
                        + ". Use "
                        + SUCCESSOR
                        + " instead. Migration guide: "
                        + MIGRATION_GUIDE,
                buildMessage(headersOf("deprecated", SUNSET, link), "op"));
    }

    @Test
    public void deprecatedWithoutSunsetDegradesGracefully() {
        Assert.assertEquals(
                "Operation 'op' is deprecated.", buildMessage(state("deprecated"), "op"));
    }

    // --- Link parsing -------------------------------------------------------

    @Test
    public void linkUriContainingACommaIsNotSplit() {
        String url = "https://developer.fireblocks.com/docs/a,b";
        String link = "<" + url + ">; rel=\"deprecation\"";
        Assert.assertTrue(
                buildMessage(headersOf("deprecated", SUNSET, link), "op")
                        .endsWith("Migration guide: " + url));
    }

    @Test
    public void unquotedRelIsAccepted() {
        String link = "<" + SUCCESSOR + ">; rel=successor-version";
        Assert.assertTrue(
                buildMessage(headersOf("deprecated", SUNSET, link), "op")
                        .contains("Use " + SUCCESSOR + " instead."));
    }

    @Test
    public void repeatedLinkHeadersAreBothRead() {
        Map<String, List<String>> values = new LinkedHashMap<>();
        values.put(
                LifecycleWarning.LIFECYCLE_STATE_HEADER, Collections.singletonList("deprecated"));
        values.put(LifecycleWarning.SUNSET_HEADER, Collections.singletonList(SUNSET));
        values.put(
                LifecycleWarning.LINK_HEADER,
                Arrays.asList(
                        "<" + MIGRATION_GUIDE + ">; rel=\"deprecation\"",
                        "<" + SUCCESSOR + ">; rel=\"successor-version\""));
        String message = buildMessage(headers(values), "op");
        Assert.assertTrue(message.contains("Use " + SUCCESSOR + " instead."));
        Assert.assertTrue(message.contains("Migration guide: " + MIGRATION_GUIDE));
    }

    @Test
    public void relAfterOtherParametersIsParsed() {
        String link = "<" + MIGRATION_GUIDE + ">; type=\"text/html\"; rel=\"deprecation\"";
        Assert.assertTrue(
                buildMessage(headersOf("deprecated", SUNSET, link), "op")
                        .endsWith("Migration guide: " + MIGRATION_GUIDE));
    }

    @Test
    public void parameterAfterRelIsIgnored() {
        String link = "<" + MIGRATION_GUIDE + ">; rel=\"deprecation\"; title=\"Migrate to v2\"";
        Assert.assertTrue(
                buildMessage(headersOf("deprecated", SUNSET, link), "op")
                        .endsWith("Migration guide: " + MIGRATION_GUIDE));
    }

    @Test
    public void relListingSeveralRelationsServesEachOfThem() {
        String link = "<" + MIGRATION_GUIDE + ">; rel=\"deprecation successor-version\"";
        Assert.assertEquals(
                "Operation 'op' is deprecated and will stop working after "
                        + SUNSET
                        + ". Use "
                        + MIGRATION_GUIDE
                        + " instead. Migration guide: "
                        + MIGRATION_GUIDE,
                buildMessage(headersOf("deprecated", SUNSET, link), "op"));
    }

    @Test
    public void twoLinksEachWithLeadingParameters() {
        String link =
                "<"
                        + MIGRATION_GUIDE
                        + ">; type=\"text/html\"; rel=\"deprecation\", <"
                        + SUCCESSOR
                        + ">; title=\"v2\"; rel=\"successor-version\"";
        Assert.assertEquals(
                "Operation 'op' is deprecated and will stop working after "
                        + SUNSET
                        + ". Use "
                        + SUCCESSOR
                        + " instead. Migration guide: "
                        + MIGRATION_GUIDE,
                buildMessage(headersOf("deprecated", SUNSET, link), "op"));
    }

    @Test
    public void relValueIsCaseInsensitive() {
        String link = "<" + MIGRATION_GUIDE + ">; REL=\"Deprecation\"";
        Assert.assertTrue(
                buildMessage(headersOf("deprecated", SUNSET, link), "op")
                        .endsWith("Migration guide: " + MIGRATION_GUIDE));
    }

    @Test
    public void unknownRelationsAreIgnored() {
        String link = "<" + SUCCESSOR + ">; rel=\"something-else\"";
        Assert.assertEquals(
                "Operation 'op' is deprecated and will stop working after " + SUNSET + ".",
                buildMessage(headersOf("deprecated", SUNSET, link), "op"));
    }

    @Test
    public void malformedLinkHeaderDoesNotThrow() {
        Assert.assertEquals(
                "Operation 'op' is deprecated and will stop working after " + SUNSET + ".",
                buildMessage(headersOf("deprecated", SUNSET, "not a link header"), "op"));
    }

    // --- namespace ----------------------------------------------------------

    @Test
    public void usesDedicatedChildNamespace() {
        Assert.assertEquals("com.fireblocks.sdk.lifecycle", LifecycleWarning.LOGGER_NAME);
        Assert.assertTrue(LifecycleWarning.LOGGER_NAME.startsWith("com.fireblocks.sdk."));
        Assert.assertNotEquals("com.fireblocks.sdk", LifecycleWarning.LOGGER_NAME);
    }

    @Test
    public void mutingTheNamespaceSilencesWarnings() {
        lifecycleLogger.setLevel(Level.SEVERE);
        warn(state("beta"), "createTransaction");
        Assert.assertTrue(records.isEmpty());
    }

    // --- beta wording, closed handling and HTTP status ----------------

    private static final String BETA_TEXT =
            "Operation 'op' is in 'beta' lifecycle state and is not generally available."
                    + " It may change or be removed without notice.";
    private static final String CLOSED_TEXT =
            "Operation 'op' has been closed and is no longer supported."
                    + " Your access is provided under a temporary exception and may be revoked."
                    + " Contact your Customer Success Manager for migration support";

    @Test
    public void betaMessageText() {
        Assert.assertEquals(BETA_TEXT, LifecycleWarning.buildMessage(state("beta"), "op", 200));
    }

    @Test
    public void betaWarnsRegardlessOfStatus() {
        for (int status : new int[] {200, 400, 403, 500}) {
            Assert.assertEquals(
                    "status " + status,
                    BETA_TEXT,
                    LifecycleWarning.buildMessage(state("beta"), "op", status));
        }
    }

    @Test
    public void closedWith410IsSilent() {
        Assert.assertNull(LifecycleWarning.buildMessage(state("closed"), "op", 410));
    }

    @Test
    public void closedWithAnyOtherStatusGetsTheExceptionMessage() {
        for (int status : new int[] {200, 204, 400, 401, 403, 404, 500}) {
            Assert.assertEquals(
                    "status " + status,
                    CLOSED_TEXT,
                    LifecycleWarning.buildMessage(state("closed"), "op", status));
        }
    }

    @Test
    public void closedMessageDoesNotNameTheState() {
        String message =
                LifecycleWarning.buildMessage(state("closed"), "getContractTemplates", 200);
        Assert.assertTrue(message.startsWith("Operation 'getContractTemplates' has been closed"));
        Assert.assertFalse(message.contains("lifecycle state"));
    }

    @Test
    public void deprecatedIsUnchangedByStatus() {
        for (int status : new int[] {200, 404, 410}) {
            Assert.assertEquals(
                    "status " + status,
                    "Operation 'op' is deprecated and will stop working after " + SUNSET + ".",
                    LifecycleWarning.buildMessage(
                            headersOf("deprecated", SUNSET, null), "op", status));
        }
    }

    @Test
    public void closedWith410LogsNothing() {
        LifecycleWarning.warn(state("closed"), "op", 410);
        Assert.assertTrue(records.isEmpty());
    }

    @Test
    public void closedWith200LogsTheExceptionMessage() {
        assumeSuppressionNotSet();
        LifecycleWarning.warn(state("closed"), "op", 200);
        Assert.assertEquals(1, records.size());
        Assert.assertEquals(CLOSED_TEXT, records.get(0).getMessage());
    }

    // --- suppression via environment variable -------------------------------
    // JVM tests cannot set env vars, so the value check is tested directly.

    @Test
    public void usesTheDocumentedEnvVarName() {
        Assert.assertEquals(
                "FIREBLOCKS_SDK_SUPPRESS_LIFECYCLE_WARNING", LifecycleWarning.SUPPRESS_ENV_VAR);
    }

    @Test
    public void isSuppressedForSetValues() {
        for (String value : new String[] {"1", "true", "yes"}) {
            Assert.assertTrue(
                    "expected suppress for: " + value, LifecycleWarning.isSuppressed(value));
        }
    }

    @Test
    public void isNotSuppressedForUnsetEmptyZeroOrFalse() {
        for (String value : new String[] {null, "", "0", "false"}) {
            Assert.assertFalse(
                    "expected no suppress for: " + value, LifecycleWarning.isSuppressed(value));
        }
    }
}
