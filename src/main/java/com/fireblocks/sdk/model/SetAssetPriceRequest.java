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

/** SetAssetPriceRequest */
@JsonPropertyOrder({
    SetAssetPriceRequest.JSON_PROPERTY_CURRENCY,
    SetAssetPriceRequest.JSON_PROPERTY_PRICE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SetAssetPriceRequest {
    public static final String JSON_PROPERTY_CURRENCY = "currency";
    private String currency;

    public static final String JSON_PROPERTY_PRICE = "price";
    private BigDecimal price;

    public SetAssetPriceRequest() {}

    public SetAssetPriceRequest currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Currency (according to ISO 4217 currency codes)
     *
     * @return currency
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CURRENCY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCurrency() {
        return currency;
    }

    @JsonProperty(JSON_PROPERTY_CURRENCY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public SetAssetPriceRequest price(BigDecimal price) {
        this.price = price;
        return this;
    }

    /**
     * Price in currency
     *
     * @return price
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PRICE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BigDecimal getPrice() {
        return price;
    }

    @JsonProperty(JSON_PROPERTY_PRICE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /** Return true if this SetAssetPriceRequest object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetAssetPriceRequest setAssetPriceRequest = (SetAssetPriceRequest) o;
        return Objects.equals(this.currency, setAssetPriceRequest.currency)
                && Objects.equals(this.price, setAssetPriceRequest.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, price);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAssetPriceRequest {\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

        // add `currency` to the URL query string
        if (getCurrency() != null) {
            joiner.add(
                    String.format(
                            "%scurrency%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getCurrency()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `price` to the URL query string
        if (getPrice() != null) {
            joiner.add(
                    String.format(
                            "%sprice%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getPrice()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
