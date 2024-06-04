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


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;

/** CreateValidationKeyDto */
@JsonPropertyOrder({
    CreateValidationKeyDto.JSON_PROPERTY_PUBLIC_KEY_PEM,
    CreateValidationKeyDto.JSON_PROPERTY_DAYS_TILL_EXPIRED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateValidationKeyDto {
    public static final String JSON_PROPERTY_PUBLIC_KEY_PEM = "publicKeyPem";
    private String publicKeyPem;

    public static final String JSON_PROPERTY_DAYS_TILL_EXPIRED = "daysTillExpired";
    private BigDecimal daysTillExpired;

    public CreateValidationKeyDto() {}

    public CreateValidationKeyDto publicKeyPem(String publicKeyPem) {
        this.publicKeyPem = publicKeyPem;
        return this;
    }

    /**
     * The PEM encoded public key of the validation key being added
     *
     * @return publicKeyPem
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PUBLIC_KEY_PEM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getPublicKeyPem() {
        return publicKeyPem;
    }

    @JsonProperty(JSON_PROPERTY_PUBLIC_KEY_PEM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPublicKeyPem(String publicKeyPem) {
        this.publicKeyPem = publicKeyPem;
    }

    public CreateValidationKeyDto daysTillExpired(BigDecimal daysTillExpired) {
        this.daysTillExpired = daysTillExpired;
        return this;
    }

    /**
     * The number of days from the date the validation key was added until it expires minimum: 1
     *
     * @return daysTillExpired
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_DAYS_TILL_EXPIRED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BigDecimal getDaysTillExpired() {
        return daysTillExpired;
    }

    @JsonProperty(JSON_PROPERTY_DAYS_TILL_EXPIRED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDaysTillExpired(BigDecimal daysTillExpired) {
        this.daysTillExpired = daysTillExpired;
    }

    /** Return true if this CreateValidationKeyDto object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateValidationKeyDto createValidationKeyDto = (CreateValidationKeyDto) o;
        return Objects.equals(this.publicKeyPem, createValidationKeyDto.publicKeyPem)
                && Objects.equals(this.daysTillExpired, createValidationKeyDto.daysTillExpired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicKeyPem, daysTillExpired);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateValidationKeyDto {\n");
        sb.append("    publicKeyPem: ").append(toIndentedString(publicKeyPem)).append("\n");
        sb.append("    daysTillExpired: ").append(toIndentedString(daysTillExpired)).append("\n");
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

        // add `publicKeyPem` to the URL query string
        if (getPublicKeyPem() != null) {
            joiner.add(
                    String.format(
                            "%spublicKeyPem%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getPublicKeyPem()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `daysTillExpired` to the URL query string
        if (getDaysTillExpired() != null) {
            joiner.add(
                    String.format(
                            "%sdaysTillExpired%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getDaysTillExpired()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}