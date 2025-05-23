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

/** AssetMetadata */
@JsonPropertyOrder({AssetMetadata.JSON_PROPERTY_SCOPE, AssetMetadata.JSON_PROPERTY_DEPRECATED})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssetMetadata {
    /** The scope of the asset */
    public enum ScopeEnum {
        GLOBAL("Global"),

        LOCAL("Local");

        private String value;

        ScopeEnum(String value) {
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
        public static ScopeEnum fromValue(String value) {
            for (ScopeEnum b : ScopeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_SCOPE = "scope";
    private ScopeEnum scope;

    public static final String JSON_PROPERTY_DEPRECATED = "deprecated";
    private Boolean deprecated;

    public AssetMetadata() {}

    public AssetMetadata scope(ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * The scope of the asset
     *
     * @return scope
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_SCOPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ScopeEnum getScope() {
        return scope;
    }

    @JsonProperty(JSON_PROPERTY_SCOPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setScope(ScopeEnum scope) {
        this.scope = scope;
    }

    public AssetMetadata deprecated(Boolean deprecated) {
        this.deprecated = deprecated;
        return this;
    }

    /**
     * Is asset deprecated
     *
     * @return deprecated
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_DEPRECATED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getDeprecated() {
        return deprecated;
    }

    @JsonProperty(JSON_PROPERTY_DEPRECATED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    /** Return true if this AssetMetadata object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssetMetadata assetMetadata = (AssetMetadata) o;
        return Objects.equals(this.scope, assetMetadata.scope)
                && Objects.equals(this.deprecated, assetMetadata.deprecated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scope, deprecated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetMetadata {\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
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

        // add `scope` to the URL query string
        if (getScope() != null) {
            joiner.add(
                    String.format(
                            "%sscope%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getScope()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `deprecated` to the URL query string
        if (getDeprecated() != null) {
            joiner.add(
                    String.format(
                            "%sdeprecated%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getDeprecated()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
