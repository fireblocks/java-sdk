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

/** CollectionBurnResponseDto */
@JsonPropertyOrder({CollectionBurnResponseDto.JSON_PROPERTY_TX_ID})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CollectionBurnResponseDto {
    public static final String JSON_PROPERTY_TX_ID = "txId";
    private String txId;

    public CollectionBurnResponseDto() {}

    public CollectionBurnResponseDto txId(String txId) {
        this.txId = txId;
        return this;
    }

    /**
     * Transaction Id for the burn operation
     *
     * @return txId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TX_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTxId() {
        return txId;
    }

    @JsonProperty(JSON_PROPERTY_TX_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTxId(String txId) {
        this.txId = txId;
    }

    /** Return true if this CollectionBurnResponseDto object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectionBurnResponseDto collectionBurnResponseDto = (CollectionBurnResponseDto) o;
        return Objects.equals(this.txId, collectionBurnResponseDto.txId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(txId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectionBurnResponseDto {\n");
        sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
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

        // add `txId` to the URL query string
        if (getTxId() != null) {
            joiner.add(
                    String.format(
                            "%stxId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getTxId()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
