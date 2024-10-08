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

/** CollectionTokenMetadataDto */
@JsonPropertyOrder({
    CollectionTokenMetadataDto.JSON_PROPERTY_NAME,
    CollectionTokenMetadataDto.JSON_PROPERTY_DESCRIPTION,
    CollectionTokenMetadataDto.JSON_PROPERTY_IMAGE,
    CollectionTokenMetadataDto.JSON_PROPERTY_ANIMATION_URL,
    CollectionTokenMetadataDto.JSON_PROPERTY_EXTERNAL_URL,
    CollectionTokenMetadataDto.JSON_PROPERTY_ATTRIBUTES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CollectionTokenMetadataDto {
    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_IMAGE = "image";
    private String image;

    public static final String JSON_PROPERTY_ANIMATION_URL = "animation_url";
    private String animationUrl;

    public static final String JSON_PROPERTY_EXTERNAL_URL = "external_url";
    private String externalUrl;

    public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
    private List<CollectionTokenMetadataAttributeDto> attributes;

    public CollectionTokenMetadataDto() {}

    public CollectionTokenMetadataDto name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Token&#39;s name
     *
     * @return name
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(String name) {
        this.name = name;
    }

    public CollectionTokenMetadataDto description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Token&#39;s description
     *
     * @return description
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDescription(String description) {
        this.description = description;
    }

    public CollectionTokenMetadataDto image(String image) {
        this.image = image;
        return this;
    }

    /**
     * Token&#39;s image URL
     *
     * @return image
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_IMAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getImage() {
        return image;
    }

    @JsonProperty(JSON_PROPERTY_IMAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setImage(String image) {
        this.image = image;
    }

    public CollectionTokenMetadataDto animationUrl(String animationUrl) {
        this.animationUrl = animationUrl;
        return this;
    }

    /**
     * Token&#39;s animation URL
     *
     * @return animationUrl
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ANIMATION_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAnimationUrl() {
        return animationUrl;
    }

    @JsonProperty(JSON_PROPERTY_ANIMATION_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAnimationUrl(String animationUrl) {
        this.animationUrl = animationUrl;
    }

    public CollectionTokenMetadataDto externalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
        return this;
    }

    /**
     * Token&#39;s external URL
     *
     * @return externalUrl
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_EXTERNAL_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getExternalUrl() {
        return externalUrl;
    }

    @JsonProperty(JSON_PROPERTY_EXTERNAL_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public CollectionTokenMetadataDto attributes(
            List<CollectionTokenMetadataAttributeDto> attributes) {
        this.attributes = attributes;
        return this;
    }

    public CollectionTokenMetadataDto addAttributesItem(
            CollectionTokenMetadataAttributeDto attributesItem) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(attributesItem);
        return this;
    }

    /**
     * Token&#39;s metadata attributes
     *
     * @return attributes
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<CollectionTokenMetadataAttributeDto> getAttributes() {
        return attributes;
    }

    @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAttributes(List<CollectionTokenMetadataAttributeDto> attributes) {
        this.attributes = attributes;
    }

    /** Return true if this CollectionTokenMetadataDto object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectionTokenMetadataDto collectionTokenMetadataDto = (CollectionTokenMetadataDto) o;
        return Objects.equals(this.name, collectionTokenMetadataDto.name)
                && Objects.equals(this.description, collectionTokenMetadataDto.description)
                && Objects.equals(this.image, collectionTokenMetadataDto.image)
                && Objects.equals(this.animationUrl, collectionTokenMetadataDto.animationUrl)
                && Objects.equals(this.externalUrl, collectionTokenMetadataDto.externalUrl)
                && Objects.equals(this.attributes, collectionTokenMetadataDto.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, image, animationUrl, externalUrl, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectionTokenMetadataDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    animationUrl: ").append(toIndentedString(animationUrl)).append("\n");
        sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
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

        // add `name` to the URL query string
        if (getName() != null) {
            joiner.add(
                    String.format(
                            "%sname%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `description` to the URL query string
        if (getDescription() != null) {
            joiner.add(
                    String.format(
                            "%sdescription%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getDescription()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `image` to the URL query string
        if (getImage() != null) {
            joiner.add(
                    String.format(
                            "%simage%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getImage()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `animation_url` to the URL query string
        if (getAnimationUrl() != null) {
            joiner.add(
                    String.format(
                            "%sanimation_url%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getAnimationUrl()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `external_url` to the URL query string
        if (getExternalUrl() != null) {
            joiner.add(
                    String.format(
                            "%sexternal_url%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getExternalUrl()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `attributes` to the URL query string
        if (getAttributes() != null) {
            for (int i = 0; i < getAttributes().size(); i++) {
                if (getAttributes().get(i) != null) {
                    joiner.add(
                            getAttributes()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%sattributes%s%s",
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
