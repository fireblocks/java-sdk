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

/** AssetMedia */
@JsonPropertyOrder({
    AssetMedia.JSON_PROPERTY_URL,
    AssetMedia.JSON_PROPERTY_TYPE,
    AssetMedia.JSON_PROPERTY_ATTRIBUTES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssetMedia {
    public static final String JSON_PROPERTY_URL = "url";
    private String url;

    /** Media type */
    public enum TypeEnum {
        SVG_XML("image/svg+xml"),

        PNG("image/png");

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_TYPE = "type";
    private TypeEnum type;

    public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
    private AssetMediaAttributes attributes;

    public AssetMedia() {}

    public AssetMedia url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Media URL
     *
     * @return url
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getUrl() {
        return url;
    }

    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUrl(String url) {
        this.url = url;
    }

    public AssetMedia type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Media type
     *
     * @return type
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TypeEnum getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AssetMedia attributes(AssetMediaAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get attributes
     *
     * @return attributes
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public AssetMediaAttributes getAttributes() {
        return attributes;
    }

    @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAttributes(AssetMediaAttributes attributes) {
        this.attributes = attributes;
    }

    /** Return true if this AssetMedia object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssetMedia assetMedia = (AssetMedia) o;
        return Objects.equals(this.url, assetMedia.url)
                && Objects.equals(this.type, assetMedia.type)
                && Objects.equals(this.attributes, assetMedia.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, type, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetMedia {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

        // add `url` to the URL query string
        if (getUrl() != null) {
            joiner.add(
                    String.format(
                            "%surl%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getUrl()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `type` to the URL query string
        if (getType() != null) {
            joiner.add(
                    String.format(
                            "%stype%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `attributes` to the URL query string
        if (getAttributes() != null) {
            joiner.add(getAttributes().toUrlQueryString(prefix + "attributes" + suffix));
        }

        return joiner.toString();
    }
}
