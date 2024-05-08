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

/** TokenLinkDto */
@JsonPropertyOrder({
    TokenLinkDto.JSON_PROPERTY_ID,
    TokenLinkDto.JSON_PROPERTY_STATUS,
    TokenLinkDto.JSON_PROPERTY_TYPE,
    TokenLinkDto.JSON_PROPERTY_REF_ID,
    TokenLinkDto.JSON_PROPERTY_DISPLAY_NAME,
    TokenLinkDto.JSON_PROPERTY_TOKEN_METADATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TokenLinkDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    /** The token status */
    public enum StatusEnum {
        PENDING("PENDING"),

        COMPLETED("COMPLETED");

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_STATUS = "status";
    private StatusEnum status;

    /** The type of token */
    public enum TypeEnum {
        FUNGIBLE_TOKEN("FUNGIBLE_TOKEN"),

        NON_FUNGIBLE_TOKEN("NON_FUNGIBLE_TOKEN"),

        TOKEN_UTILITY("TOKEN_UTILITY"),

        TOKEN_EXTENSION("TOKEN_EXTENSION");

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

    public static final String JSON_PROPERTY_REF_ID = "refId";
    private String refId;

    public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
    private String displayName;

    public static final String JSON_PROPERTY_TOKEN_METADATA = "tokenMetadata";
    private TokenLinkDtoTokenMetadata tokenMetadata;

    public TokenLinkDto() {}

    public TokenLinkDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The token link id
     *
     * @return id
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public TokenLinkDto status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The token status
     *
     * @return status
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public StatusEnum getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public TokenLinkDto type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of token
     *
     * @return type
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TypeEnum getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public TokenLinkDto refId(String refId) {
        this.refId = refId;
        return this;
    }

    /**
     * The Fireblocks&#39; reference id. Can be a Fireblocks&#39; supported asset, collectionId or
     * contractId
     *
     * @return refId
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_REF_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRefId() {
        return refId;
    }

    @JsonProperty(JSON_PROPERTY_REF_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRefId(String refId) {
        this.refId = refId;
    }

    public TokenLinkDto displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * The token display name. If was not provided, would be taken from the contract template name
     *
     * @return displayName
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TokenLinkDto tokenMetadata(TokenLinkDtoTokenMetadata tokenMetadata) {
        this.tokenMetadata = tokenMetadata;
        return this;
    }

    /**
     * Get tokenMetadata
     *
     * @return tokenMetadata
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TOKEN_METADATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TokenLinkDtoTokenMetadata getTokenMetadata() {
        return tokenMetadata;
    }

    @JsonProperty(JSON_PROPERTY_TOKEN_METADATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTokenMetadata(TokenLinkDtoTokenMetadata tokenMetadata) {
        this.tokenMetadata = tokenMetadata;
    }

    /** Return true if this TokenLinkDto object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenLinkDto tokenLinkDto = (TokenLinkDto) o;
        return Objects.equals(this.id, tokenLinkDto.id)
                && Objects.equals(this.status, tokenLinkDto.status)
                && Objects.equals(this.type, tokenLinkDto.type)
                && Objects.equals(this.refId, tokenLinkDto.refId)
                && Objects.equals(this.displayName, tokenLinkDto.displayName)
                && Objects.equals(this.tokenMetadata, tokenLinkDto.tokenMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, type, refId, displayName, tokenMetadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenLinkDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    tokenMetadata: ").append(toIndentedString(tokenMetadata)).append("\n");
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

        // add `id` to the URL query string
        if (getId() != null) {
            joiner.add(
                    String.format(
                            "%sid%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `status` to the URL query string
        if (getStatus() != null) {
            joiner.add(
                    String.format(
                            "%sstatus%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8)
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

        // add `refId` to the URL query string
        if (getRefId() != null) {
            joiner.add(
                    String.format(
                            "%srefId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getRefId()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `displayName` to the URL query string
        if (getDisplayName() != null) {
            joiner.add(
                    String.format(
                            "%sdisplayName%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getDisplayName()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `tokenMetadata` to the URL query string
        if (getTokenMetadata() != null) {
            joiner.add(getTokenMetadata().toUrlQueryString(prefix + "tokenMetadata" + suffix));
        }

        return joiner.toString();
    }
}
