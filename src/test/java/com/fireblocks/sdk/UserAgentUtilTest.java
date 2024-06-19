import static org.mockito.Mockito.*;

import com.fireblocks.sdk.AdditionalOptions;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.SystemWrapper;
import com.fireblocks.sdk.UserAgentUtil;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class UserAgentUtilTest {

    @Test
    public void testGetUserAgentWithAnonymousPlatform() {
        AdditionalOptions additionalOptions = new AdditionalOptions().isAnonymousPlatform(true);
        String userAgent = UserAgentUtil.getUserAgent(additionalOptions);
        Assert.assertEquals("fireblocks/sdk/java/" + Configuration.VERSION, userAgent);
    }

    @Test
    public void testGetUserAgentWithoutAnonymousPlatform() {
        AdditionalOptions additionalOptions = new AdditionalOptions().isAnonymousPlatform(false);

        try (MockedStatic<SystemWrapper> mockedSystem = Mockito.mockStatic(SystemWrapper.class)) {
            mockedSystem.when(() -> SystemWrapper.getProperty("os.name")).thenReturn("macOS");
            mockedSystem.when(() -> SystemWrapper.getProperty("os.version")).thenReturn("10.15.7");
            mockedSystem.when(() -> SystemWrapper.getProperty("os.arch")).thenReturn("x86_64");
            String userAgent = UserAgentUtil.getUserAgent(additionalOptions);
            Assert.assertEquals(
                    String.format(
                            "fireblocks/sdk/java/%s (macOS 10.15.7; x86_64)",
                            Configuration.VERSION),
                    userAgent);
        }
    }

    @Test
    public void testGetUserAgentWithCustomUserAgent() {
        AdditionalOptions additionalOptions =
                new AdditionalOptions().userAgent("customUserAgent").isAnonymousPlatform(false);

        try (MockedStatic<SystemWrapper> mockedSystem = Mockito.mockStatic(SystemWrapper.class)) {
            mockedSystem.when(() -> SystemWrapper.getProperty("os.name")).thenReturn("macOS");
            mockedSystem.when(() -> SystemWrapper.getProperty("os.version")).thenReturn("10.15.7");
            mockedSystem.when(() -> SystemWrapper.getProperty("os.arch")).thenReturn("x86_64");
            String userAgent = UserAgentUtil.getUserAgent(additionalOptions);
            Assert.assertEquals(
                    String.format(
                            "customUserAgent fireblocks/sdk/java/%s (macOS 10.15.7; x86_64)",
                            Configuration.VERSION),
                    userAgent);
        }
    }
}
