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
import java.util.UUID;

/** VaultAccountsTagAttachmentsRequest */
@JsonPropertyOrder({
    VaultAccountsTagAttachmentsRequest.JSON_PROPERTY_TAG_IDS,
    VaultAccountsTagAttachmentsRequest.JSON_PROPERTY_VAULT_ACCOUNT_IDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VaultAccountsTagAttachmentsRequest {
    public static final String JSON_PROPERTY_TAG_IDS = "tagIds";
    private List<UUID> tagIds = new ArrayList<>();

    public static final String JSON_PROPERTY_VAULT_ACCOUNT_IDS = "vaultAccountIds";
    private List<String> vaultAccountIds = new ArrayList<>();

    public VaultAccountsTagAttachmentsRequest() {}

    public VaultAccountsTagAttachmentsRequest tagIds(List<UUID> tagIds) {
        this.tagIds = tagIds;
        return this;
    }

    public VaultAccountsTagAttachmentsRequest addTagIdsItem(UUID tagIdsItem) {
        if (this.tagIds == null) {
            this.tagIds = new ArrayList<>();
        }
        this.tagIds.add(tagIdsItem);
        return this;
    }

    /**
     * The IDs of the tags to attach
     *
     * @return tagIds
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TAG_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<UUID> getTagIds() {
        return tagIds;
    }

    @JsonProperty(JSON_PROPERTY_TAG_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTagIds(List<UUID> tagIds) {
        this.tagIds = tagIds;
    }

    public VaultAccountsTagAttachmentsRequest vaultAccountIds(List<String> vaultAccountIds) {
        this.vaultAccountIds = vaultAccountIds;
        return this;
    }

    public VaultAccountsTagAttachmentsRequest addVaultAccountIdsItem(String vaultAccountIdsItem) {
        if (this.vaultAccountIds == null) {
            this.vaultAccountIds = new ArrayList<>();
        }
        this.vaultAccountIds.add(vaultAccountIdsItem);
        return this;
    }

    /**
     * The IDs of the vault accounts to attach tags to
     *
     * @return vaultAccountIds
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_VAULT_ACCOUNT_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getVaultAccountIds() {
        return vaultAccountIds;
    }

    @JsonProperty(JSON_PROPERTY_VAULT_ACCOUNT_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setVaultAccountIds(List<String> vaultAccountIds) {
        this.vaultAccountIds = vaultAccountIds;
    }

    /** Return true if this VaultAccountsTagAttachmentsRequest object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VaultAccountsTagAttachmentsRequest vaultAccountsTagAttachmentsRequest =
                (VaultAccountsTagAttachmentsRequest) o;
        return Objects.equals(this.tagIds, vaultAccountsTagAttachmentsRequest.tagIds)
                && Objects.equals(
                        this.vaultAccountIds, vaultAccountsTagAttachmentsRequest.vaultAccountIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagIds, vaultAccountIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VaultAccountsTagAttachmentsRequest {\n");
        sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
        sb.append("    vaultAccountIds: ").append(toIndentedString(vaultAccountIds)).append("\n");
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

        // add `tagIds` to the URL query string
        if (getTagIds() != null) {
            for (int i = 0; i < getTagIds().size(); i++) {
                if (getTagIds().get(i) != null) {
                    joiner.add(
                            String.format(
                                    "%stagIds%s%s=%s",
                                    prefix,
                                    suffix,
                                    "".equals(suffix)
                                            ? ""
                                            : String.format(
                                                    "%s%d%s", containerPrefix, i, containerSuffix),
                                    URLEncoder.encode(
                                                    String.valueOf(getTagIds().get(i)),
                                                    StandardCharsets.UTF_8)
                                            .replaceAll("\\+", "%20")));
                }
            }
        }

        // add `vaultAccountIds` to the URL query string
        if (getVaultAccountIds() != null) {
            for (int i = 0; i < getVaultAccountIds().size(); i++) {
                joiner.add(
                        String.format(
                                "%svaultAccountIds%s%s=%s",
                                prefix,
                                suffix,
                                "".equals(suffix)
                                        ? ""
                                        : String.format(
                                                "%s%d%s", containerPrefix, i, containerSuffix),
                                URLEncoder.encode(
                                                String.valueOf(getVaultAccountIds().get(i)),
                                                StandardCharsets.UTF_8)
                                        .replaceAll("\\+", "%20")));
            }
        }

        return joiner.toString();
    }
}
