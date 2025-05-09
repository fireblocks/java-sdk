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
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;

/** TravelRuleAddress */
@JsonPropertyOrder({
    TravelRuleAddress.JSON_PROPERTY_STREET,
    TravelRuleAddress.JSON_PROPERTY_CITY,
    TravelRuleAddress.JSON_PROPERTY_STATE,
    TravelRuleAddress.JSON_PROPERTY_POSTAL_CODE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TravelRuleAddress {
    public static final String JSON_PROPERTY_STREET = "street";
    private String street;

    public static final String JSON_PROPERTY_CITY = "city";
    private String city;

    public static final String JSON_PROPERTY_STATE = "state";
    private String state;

    public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
    private String postalCode;

    public TravelRuleAddress() {}

    public TravelRuleAddress street(String street) {
        this.street = street;
        return this;
    }

    /**
     * Street address
     *
     * @return street
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_STREET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStreet() {
        return street;
    }

    @JsonProperty(JSON_PROPERTY_STREET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStreet(String street) {
        this.street = street;
    }

    public TravelRuleAddress city(String city) {
        this.city = city;
        return this;
    }

    /**
     * City
     *
     * @return city
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCity() {
        return city;
    }

    @JsonProperty(JSON_PROPERTY_CITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCity(String city) {
        this.city = city;
    }

    public TravelRuleAddress state(String state) {
        this.state = state;
        return this;
    }

    /**
     * State or province
     *
     * @return state
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getState() {
        return state;
    }

    @JsonProperty(JSON_PROPERTY_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setState(String state) {
        this.state = state;
    }

    public TravelRuleAddress postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Postal or ZIP code
     *
     * @return postalCode
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /** Return true if this TravelRuleAddress object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TravelRuleAddress travelRuleAddress = (TravelRuleAddress) o;
        return Objects.equals(this.street, travelRuleAddress.street)
                && Objects.equals(this.city, travelRuleAddress.city)
                && Objects.equals(this.state, travelRuleAddress.state)
                && Objects.equals(this.postalCode, travelRuleAddress.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, state, postalCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TravelRuleAddress {\n");
        sb.append("    street: ").append(toIndentedString(street)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

        // add `street` to the URL query string
        if (getStreet() != null) {
            joiner.add(
                    String.format(
                            "%sstreet%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getStreet()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `city` to the URL query string
        if (getCity() != null) {
            joiner.add(
                    String.format(
                            "%scity%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getCity()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `state` to the URL query string
        if (getState() != null) {
            joiner.add(
                    String.format(
                            "%sstate%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getState()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `postalCode` to the URL query string
        if (getPostalCode() != null) {
            joiner.add(
                    String.format(
                            "%spostalCode%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getPostalCode()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
