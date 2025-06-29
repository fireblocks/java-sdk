/*
 * Fireblocks API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.6.2
 * Contact: support@fireblocks.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.fireblocks.sdk.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/** The result of the Compliance AML/Travel Rule screening. */
@JsonPropertyOrder({
    ComplianceResults.JSON_PROPERTY_AML,
    ComplianceResults.JSON_PROPERTY_TR,
    ComplianceResults.JSON_PROPERTY_AML_LIST,
    ComplianceResults.JSON_PROPERTY_STATUS,
    ComplianceResults.JSON_PROPERTY_AML_REGISTRATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ComplianceResults {
    public static final String JSON_PROPERTY_AML = "aml";
    private List<ComplianceScreeningResult> aml;

    public static final String JSON_PROPERTY_TR = "tr";
    private List<ComplianceScreeningResult> tr;

    public static final String JSON_PROPERTY_AML_LIST = "amlList";
    private List<ComplianceScreeningResult> amlList;

    /** Status of compliance result screening. */
    public enum StatusEnum {
        STARTED("Started"),

        AMLSTARTED("AMLStarted"),

        AMLCOMPLETED("AMLCompleted"),

        AMLFAILED("AMLFailed"),

        AMLINBACKGROUND("AMLInBackground"),

        TRSTARTED("TRStarted"),

        TRCOMPLETED("TRCompleted"),

        TRFAILED("TRFailed"),

        COMPLETED("Completed"),

        REGISTRATIONSTARTED("RegistrationStarted"),

        AMLREGISTRATIONSTARTED("AMLRegistrationStarted"),

        AMLREGISTRATIONCOMPLETED("AMLRegistrationCompleted"),

        TRUPDATESTARTED("TRUpdateStarted"),

        TRUPDATECOMPLETED("TRUpdateCompleted"),

        UPDATECOMPLETED("UpdateCompleted"),

        INCOMINGSTARTED("IncomingStarted"),

        AMLINCOMINGSTARTED("AMLIncomingStarted"),

        AMLINCOMINGCOMPLETED("AMLIncomingCompleted"),

        AMLINCOMINGFAILED("AMLIncomingFailed"),

        AMLINCOMINGINBACKGROUND("AMLIncomingInBackground"),

        TRINCOMINGSTARTED("TRIncomingStarted"),

        TRINCOMINGCOMPLETED("TRIncomingCompleted"),

        TRINCOMINGFAILED("TRIncomingFailed"),

        INCOMINGCOMPLETED("IncomingCompleted");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_STATUS = "status";
    private StatusEnum status;

    public static final String JSON_PROPERTY_AML_REGISTRATION = "amlRegistration";
    private List<AmlRegistrationResult> amlRegistration;

    public ComplianceResults() {}

    public ComplianceResults aml(List<ComplianceScreeningResult> aml) {
        this.aml = aml;
        return this;
    }

    public ComplianceResults addAmlItem(ComplianceScreeningResult amlItem) {
        if (this.aml == null) {
            this.aml = new ArrayList<>();
        }
        this.aml.add(amlItem);
        return this;
    }

    /**
     * The end result of the AML screening.
     *
     * @return aml
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_AML)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<ComplianceScreeningResult> getAml() {
        return aml;
    }

    @JsonProperty(JSON_PROPERTY_AML)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAml(List<ComplianceScreeningResult> aml) {
        this.aml = aml;
    }

    public ComplianceResults tr(List<ComplianceScreeningResult> tr) {
        this.tr = tr;
        return this;
    }

    public ComplianceResults addTrItem(ComplianceScreeningResult trItem) {
        if (this.tr == null) {
            this.tr = new ArrayList<>();
        }
        this.tr.add(trItem);
        return this;
    }

    /**
     * The result of the Travel Rule screening.
     *
     * @return tr
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<ComplianceScreeningResult> getTr() {
        return tr;
    }

    @JsonProperty(JSON_PROPERTY_TR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTr(List<ComplianceScreeningResult> tr) {
        this.tr = tr;
    }

    public ComplianceResults amlList(List<ComplianceScreeningResult> amlList) {
        this.amlList = amlList;
        return this;
    }

    public ComplianceResults addAmlListItem(ComplianceScreeningResult amlListItem) {
        if (this.amlList == null) {
            this.amlList = new ArrayList<>();
        }
        this.amlList.add(amlListItem);
        return this;
    }

    /**
     * The list of all results of the AML screening.
     *
     * @return amlList
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_AML_LIST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<ComplianceScreeningResult> getAmlList() {
        return amlList;
    }

    @JsonProperty(JSON_PROPERTY_AML_LIST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAmlList(List<ComplianceScreeningResult> amlList) {
        this.amlList = amlList;
    }

    public ComplianceResults status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Status of compliance result screening.
     *
     * @return status
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public StatusEnum getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ComplianceResults amlRegistration(List<AmlRegistrationResult> amlRegistration) {
        this.amlRegistration = amlRegistration;
        return this;
    }

    public ComplianceResults addAmlRegistrationItem(AmlRegistrationResult amlRegistrationItem) {
        if (this.amlRegistration == null) {
            this.amlRegistration = new ArrayList<>();
        }
        this.amlRegistration.add(amlRegistrationItem);
        return this;
    }

    /**
     * The results of the AML address registration.
     *
     * @return amlRegistration
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_AML_REGISTRATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<AmlRegistrationResult> getAmlRegistration() {
        return amlRegistration;
    }

    @JsonProperty(JSON_PROPERTY_AML_REGISTRATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAmlRegistration(List<AmlRegistrationResult> amlRegistration) {
        this.amlRegistration = amlRegistration;
    }

    /** Return true if this ComplianceResults object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComplianceResults complianceResults = (ComplianceResults) o;
        return Objects.equals(this.aml, complianceResults.aml)
                && Objects.equals(this.tr, complianceResults.tr)
                && Objects.equals(this.amlList, complianceResults.amlList)
                && Objects.equals(this.status, complianceResults.status)
                && Objects.equals(this.amlRegistration, complianceResults.amlRegistration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aml, tr, amlList, status, amlRegistration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComplianceResults {\n");
        sb.append("    aml: ").append(toIndentedString(aml)).append("\n");
        sb.append("    tr: ").append(toIndentedString(tr)).append("\n");
        sb.append("    amlList: ").append(toIndentedString(amlList)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    amlRegistration: ").append(toIndentedString(amlRegistration)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Convert the instance into URL query string.
     *
     * @return URL query string
     */
    public String toUrlQueryString() {
        return toUrlQueryString(null);
    }

    /**
     * Convert the instance into URL query string.
     *
     * @param prefix prefix of the query string
     * @return URL query string
     */
    public String toUrlQueryString(String prefix) {
        String suffix = "";
        String containerSuffix = "";
        String containerPrefix = "";
        if (prefix == null) {
            // style=form, explode=true, e.g. /pet?name=cat&type=manx
            prefix = "";
        } else {
            // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
            prefix = prefix + "[";
            suffix = "]";
            containerSuffix = "]";
            containerPrefix = "[";
        }

        StringJoiner joiner = new StringJoiner("&");

        // add `aml` to the URL query string
        if (getAml() != null) {
            for (int i = 0; i < getAml().size(); i++) {
                if (getAml().get(i) != null) {
                    joiner.add(
                            getAml().get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%saml%s%s",
                                                    prefix,
                                                    suffix,
                                                    "".equals(suffix)
                                                            ? ""
                                                            : String.format(
                                                                    "%s%d%s",
                                                                    containerPrefix,
                                                                    i,
                                                                    containerSuffix))));
                }
            }
        }

        // add `tr` to the URL query string
        if (getTr() != null) {
            for (int i = 0; i < getTr().size(); i++) {
                if (getTr().get(i) != null) {
                    joiner.add(
                            getTr().get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%str%s%s",
                                                    prefix,
                                                    suffix,
                                                    "".equals(suffix)
                                                            ? ""
                                                            : String.format(
                                                                    "%s%d%s",
                                                                    containerPrefix,
                                                                    i,
                                                                    containerSuffix))));
                }
            }
        }

        // add `amlList` to the URL query string
        if (getAmlList() != null) {
            for (int i = 0; i < getAmlList().size(); i++) {
                if (getAmlList().get(i) != null) {
                    joiner.add(
                            getAmlList()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%samlList%s%s",
                                                    prefix,
                                                    suffix,
                                                    "".equals(suffix)
                                                            ? ""
                                                            : String.format(
                                                                    "%s%d%s",
                                                                    containerPrefix,
                                                                    i,
                                                                    containerSuffix))));
                }
            }
        }

        // add `status` to the URL query string
        if (getStatus() != null) {
            joiner.add(
                    String.format(
                            "%sstatus%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `amlRegistration` to the URL query string
        if (getAmlRegistration() != null) {
            for (int i = 0; i < getAmlRegistration().size(); i++) {
                if (getAmlRegistration().get(i) != null) {
                    joiner.add(
                            getAmlRegistration()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%samlRegistration%s%s",
                                                    prefix,
                                                    suffix,
                                                    "".equals(suffix)
                                                            ? ""
                                                            : String.format(
                                                                    "%s%d%s",
                                                                    containerPrefix,
                                                                    i,
                                                                    containerSuffix))));
                }
            }
        }

        return joiner.toString();
    }
}
