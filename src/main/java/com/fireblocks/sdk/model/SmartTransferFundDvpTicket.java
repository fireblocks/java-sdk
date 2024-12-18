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
import java.util.Objects;
import java.util.StringJoiner;

/** SmartTransferFundDvpTicket */
@JsonPropertyOrder({
    SmartTransferFundDvpTicket.JSON_PROPERTY_FEE,
    SmartTransferFundDvpTicket.JSON_PROPERTY_FEE_LEVEL,
    SmartTransferFundDvpTicket.JSON_PROPERTY_NOTE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SmartTransferFundDvpTicket {
    public static final String JSON_PROPERTY_FEE = "fee";
    private String fee;

    /** Transaction fee level. */
    public enum FeeLevelEnum {
        LOW("LOW"),

        MEDIUM("MEDIUM"),

        HIGH("HIGH");

        private String value;

        FeeLevelEnum(String value) {
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
        public static FeeLevelEnum fromValue(String value) {
            for (FeeLevelEnum b : FeeLevelEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_FEE_LEVEL = "feeLevel";
    private FeeLevelEnum feeLevel;

    public static final String JSON_PROPERTY_NOTE = "note";
    private String note;

    public SmartTransferFundDvpTicket() {}

    public SmartTransferFundDvpTicket fee(String fee) {
        this.fee = fee;
        return this;
    }

    /**
     * Transaction fee
     *
     * @return fee
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_FEE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFee() {
        return fee;
    }

    @JsonProperty(JSON_PROPERTY_FEE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFee(String fee) {
        this.fee = fee;
    }

    public SmartTransferFundDvpTicket feeLevel(FeeLevelEnum feeLevel) {
        this.feeLevel = feeLevel;
        return this;
    }

    /**
     * Transaction fee level.
     *
     * @return feeLevel
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_FEE_LEVEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public FeeLevelEnum getFeeLevel() {
        return feeLevel;
    }

    @JsonProperty(JSON_PROPERTY_FEE_LEVEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFeeLevel(FeeLevelEnum feeLevel) {
        this.feeLevel = feeLevel;
    }

    public SmartTransferFundDvpTicket note(String note) {
        this.note = note;
        return this;
    }

    /**
     * Transaction note
     *
     * @return note
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_NOTE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getNote() {
        return note;
    }

    @JsonProperty(JSON_PROPERTY_NOTE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNote(String note) {
        this.note = note;
    }

    /** Return true if this SmartTransferFundDvpTicket object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmartTransferFundDvpTicket smartTransferFundDvpTicket = (SmartTransferFundDvpTicket) o;
        return Objects.equals(this.fee, smartTransferFundDvpTicket.fee)
                && Objects.equals(this.feeLevel, smartTransferFundDvpTicket.feeLevel)
                && Objects.equals(this.note, smartTransferFundDvpTicket.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fee, feeLevel, note);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartTransferFundDvpTicket {\n");
        sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
        sb.append("    feeLevel: ").append(toIndentedString(feeLevel)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

        // add `fee` to the URL query string
        if (getFee() != null) {
            joiner.add(
                    String.format(
                            "%sfee%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getFee()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `feeLevel` to the URL query string
        if (getFeeLevel() != null) {
            joiner.add(
                    String.format(
                            "%sfeeLevel%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getFeeLevel()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `note` to the URL query string
        if (getNote() != null) {
            joiner.add(
                    String.format(
                            "%snote%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getNote()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}