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

/** TravelRuleValidateLegalPersonNameIdentifier */
@JsonPropertyOrder({
    TravelRuleValidateLegalPersonNameIdentifier.JSON_PROPERTY_LEGAL_PERSON_NAME,
    TravelRuleValidateLegalPersonNameIdentifier.JSON_PROPERTY_LEGAL_PERSON_NAME_IDENTIFIER_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TravelRuleValidateLegalPersonNameIdentifier {
    public static final String JSON_PROPERTY_LEGAL_PERSON_NAME = "legalPersonName";
    private String legalPersonName;

    /**
     * Specifies the type of name for a legal person. Acceptable values are: - &#39;REGISTERED&#39;:
     * The official registered name. - &#39;TRADE&#39;: A trading name or DBA (Doing Business As)
     * name. - &#39;OTHER&#39;: Any other type of name.
     */
    public enum LegalPersonNameIdentifierTypeEnum {
        REGISTERED("REGISTERED"),

        TRADE("TRADE"),

        OTHER("OTHER");

        private String value;

        LegalPersonNameIdentifierTypeEnum(String value) {
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
        public static LegalPersonNameIdentifierTypeEnum fromValue(String value) {
            for (LegalPersonNameIdentifierTypeEnum b : LegalPersonNameIdentifierTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_LEGAL_PERSON_NAME_IDENTIFIER_TYPE =
            "legalPersonNameIdentifierType";
    private LegalPersonNameIdentifierTypeEnum legalPersonNameIdentifierType;

    public TravelRuleValidateLegalPersonNameIdentifier() {}

    public TravelRuleValidateLegalPersonNameIdentifier legalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }

    /**
     * Name by which the legal person is known.
     *
     * @return legalPersonName
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_LEGAL_PERSON_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLegalPersonName() {
        return legalPersonName;
    }

    @JsonProperty(JSON_PROPERTY_LEGAL_PERSON_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
    }

    public TravelRuleValidateLegalPersonNameIdentifier legalPersonNameIdentifierType(
            LegalPersonNameIdentifierTypeEnum legalPersonNameIdentifierType) {
        this.legalPersonNameIdentifierType = legalPersonNameIdentifierType;
        return this;
    }

    /**
     * Specifies the type of name for a legal person. Acceptable values are: - &#39;REGISTERED&#39;:
     * The official registered name. - &#39;TRADE&#39;: A trading name or DBA (Doing Business As)
     * name. - &#39;OTHER&#39;: Any other type of name.
     *
     * @return legalPersonNameIdentifierType
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_LEGAL_PERSON_NAME_IDENTIFIER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public LegalPersonNameIdentifierTypeEnum getLegalPersonNameIdentifierType() {
        return legalPersonNameIdentifierType;
    }

    @JsonProperty(JSON_PROPERTY_LEGAL_PERSON_NAME_IDENTIFIER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLegalPersonNameIdentifierType(
            LegalPersonNameIdentifierTypeEnum legalPersonNameIdentifierType) {
        this.legalPersonNameIdentifierType = legalPersonNameIdentifierType;
    }

    /** Return true if this TravelRuleValidateLegalPersonNameIdentifier object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TravelRuleValidateLegalPersonNameIdentifier travelRuleValidateLegalPersonNameIdentifier =
                (TravelRuleValidateLegalPersonNameIdentifier) o;
        return Objects.equals(
                        this.legalPersonName,
                        travelRuleValidateLegalPersonNameIdentifier.legalPersonName)
                && Objects.equals(
                        this.legalPersonNameIdentifierType,
                        travelRuleValidateLegalPersonNameIdentifier.legalPersonNameIdentifierType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(legalPersonName, legalPersonNameIdentifierType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TravelRuleValidateLegalPersonNameIdentifier {\n");
        sb.append("    legalPersonName: ").append(toIndentedString(legalPersonName)).append("\n");
        sb.append("    legalPersonNameIdentifierType: ")
                .append(toIndentedString(legalPersonNameIdentifierType))
                .append("\n");
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

        // add `legalPersonName` to the URL query string
        if (getLegalPersonName() != null) {
            joiner.add(
                    String.format(
                            "%slegalPersonName%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getLegalPersonName()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `legalPersonNameIdentifierType` to the URL query string
        if (getLegalPersonNameIdentifierType() != null) {
            joiner.add(
                    String.format(
                            "%slegalPersonNameIdentifierType%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getLegalPersonNameIdentifierType()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
