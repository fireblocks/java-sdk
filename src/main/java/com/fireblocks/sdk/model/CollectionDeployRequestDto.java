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

/** CollectionDeployRequestDto */
@JsonPropertyOrder({
    CollectionDeployRequestDto.JSON_PROPERTY_BASE_ASSET_ID,
    CollectionDeployRequestDto.JSON_PROPERTY_VAULT_ACCOUNT_ID,
    CollectionDeployRequestDto.JSON_PROPERTY_TYPE,
    CollectionDeployRequestDto.JSON_PROPERTY_NAME,
    CollectionDeployRequestDto.JSON_PROPERTY_SYMBOL,
    CollectionDeployRequestDto.JSON_PROPERTY_ADMIN_ADDRESS,
    CollectionDeployRequestDto.JSON_PROPERTY_DISPLAY_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CollectionDeployRequestDto {
    public static final String JSON_PROPERTY_BASE_ASSET_ID = "baseAssetId";
    private String baseAssetId;

    public static final String JSON_PROPERTY_VAULT_ACCOUNT_ID = "vaultAccountId";
    private String vaultAccountId;

    public static final String JSON_PROPERTY_TYPE = "type";
    private CollectionType type;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_SYMBOL = "symbol";
    private String symbol;

    public static final String JSON_PROPERTY_ADMIN_ADDRESS = "adminAddress";
    private String adminAddress;

    public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
    private String displayName;

    public CollectionDeployRequestDto() {}

    public CollectionDeployRequestDto baseAssetId(String baseAssetId) {
        this.baseAssetId = baseAssetId;
        return this;
    }

    /**
     * The blockchain base assetId
     *
     * @return baseAssetId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_BASE_ASSET_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBaseAssetId() {
        return baseAssetId;
    }

    @JsonProperty(JSON_PROPERTY_BASE_ASSET_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBaseAssetId(String baseAssetId) {
        this.baseAssetId = baseAssetId;
    }

    public CollectionDeployRequestDto vaultAccountId(String vaultAccountId) {
        this.vaultAccountId = vaultAccountId;
        return this;
    }

    /**
     * The id of the vault account that initiated the request to issue the token
     *
     * @return vaultAccountId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_VAULT_ACCOUNT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getVaultAccountId() {
        return vaultAccountId;
    }

    @JsonProperty(JSON_PROPERTY_VAULT_ACCOUNT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setVaultAccountId(String vaultAccountId) {
        this.vaultAccountId = vaultAccountId;
    }

    public CollectionDeployRequestDto type(CollectionType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CollectionType getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(CollectionType type) {
        this.type = type;
    }

    public CollectionDeployRequestDto name(String name) {
        this.name = name;
        return this;
    }

    /**
     * A string that represents the name of the collection
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

    public CollectionDeployRequestDto symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * A string that represents the symbol of the collection
     *
     * @return symbol
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_SYMBOL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty(JSON_PROPERTY_SYMBOL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public CollectionDeployRequestDto adminAddress(String adminAddress) {
        this.adminAddress = adminAddress;
        return this;
    }

    /**
     * The EVM address of the user that will be set as the admin user of the collection
     *
     * @return adminAddress
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ADMIN_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getAdminAddress() {
        return adminAddress;
    }

    @JsonProperty(JSON_PROPERTY_ADMIN_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAdminAddress(String adminAddress) {
        this.adminAddress = adminAddress;
    }

    public CollectionDeployRequestDto displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * A string to display as a name of the collection
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

    /** Return true if this CollectionDeployRequestDto object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectionDeployRequestDto collectionDeployRequestDto = (CollectionDeployRequestDto) o;
        return Objects.equals(this.baseAssetId, collectionDeployRequestDto.baseAssetId)
                && Objects.equals(this.vaultAccountId, collectionDeployRequestDto.vaultAccountId)
                && Objects.equals(this.type, collectionDeployRequestDto.type)
                && Objects.equals(this.name, collectionDeployRequestDto.name)
                && Objects.equals(this.symbol, collectionDeployRequestDto.symbol)
                && Objects.equals(this.adminAddress, collectionDeployRequestDto.adminAddress)
                && Objects.equals(this.displayName, collectionDeployRequestDto.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                baseAssetId, vaultAccountId, type, name, symbol, adminAddress, displayName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectionDeployRequestDto {\n");
        sb.append("    baseAssetId: ").append(toIndentedString(baseAssetId)).append("\n");
        sb.append("    vaultAccountId: ").append(toIndentedString(vaultAccountId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("    adminAddress: ").append(toIndentedString(adminAddress)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

        // add `baseAssetId` to the URL query string
        if (getBaseAssetId() != null) {
            joiner.add(
                    String.format(
                            "%sbaseAssetId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getBaseAssetId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `vaultAccountId` to the URL query string
        if (getVaultAccountId() != null) {
            joiner.add(
                    String.format(
                            "%svaultAccountId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getVaultAccountId()),
                                            StandardCharsets.UTF_8)
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

        // add `symbol` to the URL query string
        if (getSymbol() != null) {
            joiner.add(
                    String.format(
                            "%ssymbol%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getSymbol()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `adminAddress` to the URL query string
        if (getAdminAddress() != null) {
            joiner.add(
                    String.format(
                            "%sadminAddress%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getAdminAddress()),
                                            StandardCharsets.UTF_8)
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

        return joiner.toString();
    }
}