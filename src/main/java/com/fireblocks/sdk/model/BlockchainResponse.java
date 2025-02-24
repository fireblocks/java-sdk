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

/** BlockchainResponse */
@JsonPropertyOrder({
    BlockchainResponse.JSON_PROPERTY_ID,
    BlockchainResponse.JSON_PROPERTY_LEGACY_ID,
    BlockchainResponse.JSON_PROPERTY_DISPLAY_NAME,
    BlockchainResponse.JSON_PROPERTY_NATIVE_ASSET_ID,
    BlockchainResponse.JSON_PROPERTY_ONCHAIN,
    BlockchainResponse.JSON_PROPERTY_METADATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BlockchainResponse {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_LEGACY_ID = "legacyId";
    private String legacyId;

    public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
    private String displayName;

    public static final String JSON_PROPERTY_NATIVE_ASSET_ID = "nativeAssetId";
    private String nativeAssetId;

    public static final String JSON_PROPERTY_ONCHAIN = "onchain";
    private BlockchainOnchain onchain;

    public static final String JSON_PROPERTY_METADATA = "metadata";
    private BlockchainMetadata metadata;

    public BlockchainResponse() {}

    public BlockchainResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the blockchain
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

    public BlockchainResponse legacyId(String legacyId) {
        this.legacyId = legacyId;
        return this;
    }

    /**
     * The old blockchain ID representation of the blockchain
     *
     * @return legacyId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_LEGACY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getLegacyId() {
        return legacyId;
    }

    @JsonProperty(JSON_PROPERTY_LEGACY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLegacyId(String legacyId) {
        this.legacyId = legacyId;
    }

    public BlockchainResponse displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * The name of the blockchain
     *
     * @return displayName
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public BlockchainResponse nativeAssetId(String nativeAssetId) {
        this.nativeAssetId = nativeAssetId;
        return this;
    }

    /**
     * Native asset ID of this blockchain
     *
     * @return nativeAssetId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_NATIVE_ASSET_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getNativeAssetId() {
        return nativeAssetId;
    }

    @JsonProperty(JSON_PROPERTY_NATIVE_ASSET_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setNativeAssetId(String nativeAssetId) {
        this.nativeAssetId = nativeAssetId;
    }

    public BlockchainResponse onchain(BlockchainOnchain onchain) {
        this.onchain = onchain;
        return this;
    }

    /**
     * Get onchain
     *
     * @return onchain
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ONCHAIN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BlockchainOnchain getOnchain() {
        return onchain;
    }

    @JsonProperty(JSON_PROPERTY_ONCHAIN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOnchain(BlockchainOnchain onchain) {
        this.onchain = onchain;
    }

    public BlockchainResponse metadata(BlockchainMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get metadata
     *
     * @return metadata
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_METADATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BlockchainMetadata getMetadata() {
        return metadata;
    }

    @JsonProperty(JSON_PROPERTY_METADATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setMetadata(BlockchainMetadata metadata) {
        this.metadata = metadata;
    }

    /** Return true if this BlockchainResponse object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BlockchainResponse blockchainResponse = (BlockchainResponse) o;
        return Objects.equals(this.id, blockchainResponse.id)
                && Objects.equals(this.legacyId, blockchainResponse.legacyId)
                && Objects.equals(this.displayName, blockchainResponse.displayName)
                && Objects.equals(this.nativeAssetId, blockchainResponse.nativeAssetId)
                && Objects.equals(this.onchain, blockchainResponse.onchain)
                && Objects.equals(this.metadata, blockchainResponse.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, legacyId, displayName, nativeAssetId, onchain, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BlockchainResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    legacyId: ").append(toIndentedString(legacyId)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    nativeAssetId: ").append(toIndentedString(nativeAssetId)).append("\n");
        sb.append("    onchain: ").append(toIndentedString(onchain)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

        // add `legacyId` to the URL query string
        if (getLegacyId() != null) {
            joiner.add(
                    String.format(
                            "%slegacyId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getLegacyId()), StandardCharsets.UTF_8)
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

        // add `nativeAssetId` to the URL query string
        if (getNativeAssetId() != null) {
            joiner.add(
                    String.format(
                            "%snativeAssetId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getNativeAssetId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `onchain` to the URL query string
        if (getOnchain() != null) {
            joiner.add(getOnchain().toUrlQueryString(prefix + "onchain" + suffix));
        }

        // add `metadata` to the URL query string
        if (getMetadata() != null) {
            joiner.add(getMetadata().toUrlQueryString(prefix + "metadata" + suffix));
        }

        return joiner.toString();
    }
}
