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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/** GetMpcKeysResponse */
@JsonPropertyOrder({
    GetMpcKeysResponse.JSON_PROPERTY_TENANT_ID,
    GetMpcKeysResponse.JSON_PROPERTY_KEYS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetMpcKeysResponse {
    public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
    private String tenantId;

    public static final String JSON_PROPERTY_KEYS = "keys";
    private List<MpcKey> keys = new ArrayList<>();

    public GetMpcKeysResponse() {}

    public GetMpcKeysResponse tenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * The workspace id of the keys
     *
     * @return tenantId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTenantId() {
        return tenantId;
    }

    @JsonProperty(JSON_PROPERTY_TENANT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public GetMpcKeysResponse keys(List<MpcKey> keys) {
        this.keys = keys;
        return this;
    }

    public GetMpcKeysResponse addKeysItem(MpcKey keysItem) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.add(keysItem);
        return this;
    }

    /**
     * The keys that are associated with the workspace
     *
     * @return keys
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_KEYS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<MpcKey> getKeys() {
        return keys;
    }

    @JsonProperty(JSON_PROPERTY_KEYS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setKeys(List<MpcKey> keys) {
        this.keys = keys;
    }

    /** Return true if this GetMpcKeysResponse object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetMpcKeysResponse getMpcKeysResponse = (GetMpcKeysResponse) o;
        return Objects.equals(this.tenantId, getMpcKeysResponse.tenantId)
                && Objects.equals(this.keys, getMpcKeysResponse.keys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId, keys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMpcKeysResponse {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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

        // add `tenantId` to the URL query string
        if (getTenantId() != null) {
            joiner.add(
                    String.format(
                            "%stenantId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getTenantId()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `keys` to the URL query string
        if (getKeys() != null) {
            for (int i = 0; i < getKeys().size(); i++) {
                if (getKeys().get(i) != null) {
                    joiner.add(
                            getKeys()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%skeys%s%s",
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
