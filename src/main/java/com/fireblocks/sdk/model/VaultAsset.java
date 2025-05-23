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

/** VaultAsset */
@JsonPropertyOrder({
    VaultAsset.JSON_PROPERTY_ID,
    VaultAsset.JSON_PROPERTY_TOTAL,
    VaultAsset.JSON_PROPERTY_BALANCE,
    VaultAsset.JSON_PROPERTY_AVAILABLE,
    VaultAsset.JSON_PROPERTY_PENDING,
    VaultAsset.JSON_PROPERTY_FROZEN,
    VaultAsset.JSON_PROPERTY_LOCKED_AMOUNT,
    VaultAsset.JSON_PROPERTY_STAKED,
    VaultAsset.JSON_PROPERTY_TOTAL_STAKED_C_P_U,
    VaultAsset.JSON_PROPERTY_TOTAL_STAKED_NETWORK,
    VaultAsset.JSON_PROPERTY_SELF_STAKED_C_P_U,
    VaultAsset.JSON_PROPERTY_SELF_STAKED_NETWORK,
    VaultAsset.JSON_PROPERTY_PENDING_REFUND_C_P_U,
    VaultAsset.JSON_PROPERTY_PENDING_REFUND_NETWORK,
    VaultAsset.JSON_PROPERTY_BLOCK_HEIGHT,
    VaultAsset.JSON_PROPERTY_BLOCK_HASH,
    VaultAsset.JSON_PROPERTY_REWARDS_INFO
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VaultAsset {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_TOTAL = "total";
    private String total;

    public static final String JSON_PROPERTY_BALANCE = "balance";
    private String balance;

    public static final String JSON_PROPERTY_AVAILABLE = "available";
    private String available;

    public static final String JSON_PROPERTY_PENDING = "pending";
    private String pending;

    public static final String JSON_PROPERTY_FROZEN = "frozen";
    private String frozen;

    public static final String JSON_PROPERTY_LOCKED_AMOUNT = "lockedAmount";
    private String lockedAmount;

    public static final String JSON_PROPERTY_STAKED = "staked";
    private String staked;

    public static final String JSON_PROPERTY_TOTAL_STAKED_C_P_U = "totalStakedCPU";
    private String totalStakedCPU;

    public static final String JSON_PROPERTY_TOTAL_STAKED_NETWORK = "totalStakedNetwork";
    private String totalStakedNetwork;

    public static final String JSON_PROPERTY_SELF_STAKED_C_P_U = "selfStakedCPU";
    private String selfStakedCPU;

    public static final String JSON_PROPERTY_SELF_STAKED_NETWORK = "selfStakedNetwork";
    private String selfStakedNetwork;

    public static final String JSON_PROPERTY_PENDING_REFUND_C_P_U = "pendingRefundCPU";
    private String pendingRefundCPU;

    public static final String JSON_PROPERTY_PENDING_REFUND_NETWORK = "pendingRefundNetwork";
    private String pendingRefundNetwork;

    public static final String JSON_PROPERTY_BLOCK_HEIGHT = "blockHeight";
    private String blockHeight;

    public static final String JSON_PROPERTY_BLOCK_HASH = "blockHash";
    private String blockHash;

    public static final String JSON_PROPERTY_REWARDS_INFO = "rewardsInfo";
    private RewardsInfo rewardsInfo;

    public VaultAsset() {}

    public VaultAsset id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(String id) {
        this.id = id;
    }

    public VaultAsset total(String total) {
        this.total = total;
        return this;
    }

    /**
     * The total wallet balance. In EOS this value includes the network balance, self staking and
     * pending refund. For all other coins it is the balance as it appears on the blockchain.
     *
     * @return total
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TOTAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTotal() {
        return total;
    }

    @JsonProperty(JSON_PROPERTY_TOTAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTotal(String total) {
        this.total = total;
    }

    public VaultAsset balance(String balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Deprecated - replaced by \&quot;total\&quot;
     *
     * @return balance
     * @deprecated
     */
    @Deprecated
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_BALANCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBalance() {
        return balance;
    }

    @JsonProperty(JSON_PROPERTY_BALANCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBalance(String balance) {
        this.balance = balance;
    }

    public VaultAsset available(String available) {
        this.available = available;
        return this;
    }

    /**
     * Funds available for transfer. Equals the blockchain balance minus any locked amounts
     *
     * @return available
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_AVAILABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAvailable() {
        return available;
    }

    @JsonProperty(JSON_PROPERTY_AVAILABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAvailable(String available) {
        this.available = available;
    }

    public VaultAsset pending(String pending) {
        this.pending = pending;
        return this;
    }

    /**
     * The cumulative balance of all transactions pending to be cleared
     *
     * @return pending
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PENDING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPending() {
        return pending;
    }

    @JsonProperty(JSON_PROPERTY_PENDING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPending(String pending) {
        this.pending = pending;
    }

    public VaultAsset frozen(String frozen) {
        this.frozen = frozen;
        return this;
    }

    /**
     * The cumulative frozen balance
     *
     * @return frozen
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_FROZEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFrozen() {
        return frozen;
    }

    @JsonProperty(JSON_PROPERTY_FROZEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFrozen(String frozen) {
        this.frozen = frozen;
    }

    public VaultAsset lockedAmount(String lockedAmount) {
        this.lockedAmount = lockedAmount;
        return this;
    }

    /**
     * Funds in outgoing transactions that are not yet published to the network
     *
     * @return lockedAmount
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_LOCKED_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLockedAmount() {
        return lockedAmount;
    }

    @JsonProperty(JSON_PROPERTY_LOCKED_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLockedAmount(String lockedAmount) {
        this.lockedAmount = lockedAmount;
    }

    public VaultAsset staked(String staked) {
        this.staked = staked;
        return this;
    }

    /**
     * Staked balance
     *
     * @return staked
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_STAKED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStaked() {
        return staked;
    }

    @JsonProperty(JSON_PROPERTY_STAKED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStaked(String staked) {
        this.staked = staked;
    }

    public VaultAsset totalStakedCPU(String totalStakedCPU) {
        this.totalStakedCPU = totalStakedCPU;
        return this;
    }

    /**
     * Deprecated
     *
     * @return totalStakedCPU
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TOTAL_STAKED_C_P_U)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTotalStakedCPU() {
        return totalStakedCPU;
    }

    @JsonProperty(JSON_PROPERTY_TOTAL_STAKED_C_P_U)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTotalStakedCPU(String totalStakedCPU) {
        this.totalStakedCPU = totalStakedCPU;
    }

    public VaultAsset totalStakedNetwork(String totalStakedNetwork) {
        this.totalStakedNetwork = totalStakedNetwork;
        return this;
    }

    /**
     * Deprecated
     *
     * @return totalStakedNetwork
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TOTAL_STAKED_NETWORK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTotalStakedNetwork() {
        return totalStakedNetwork;
    }

    @JsonProperty(JSON_PROPERTY_TOTAL_STAKED_NETWORK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTotalStakedNetwork(String totalStakedNetwork) {
        this.totalStakedNetwork = totalStakedNetwork;
    }

    public VaultAsset selfStakedCPU(String selfStakedCPU) {
        this.selfStakedCPU = selfStakedCPU;
        return this;
    }

    /**
     * Deprecated
     *
     * @return selfStakedCPU
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_SELF_STAKED_C_P_U)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSelfStakedCPU() {
        return selfStakedCPU;
    }

    @JsonProperty(JSON_PROPERTY_SELF_STAKED_C_P_U)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSelfStakedCPU(String selfStakedCPU) {
        this.selfStakedCPU = selfStakedCPU;
    }

    public VaultAsset selfStakedNetwork(String selfStakedNetwork) {
        this.selfStakedNetwork = selfStakedNetwork;
        return this;
    }

    /**
     * Deprecated
     *
     * @return selfStakedNetwork
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_SELF_STAKED_NETWORK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSelfStakedNetwork() {
        return selfStakedNetwork;
    }

    @JsonProperty(JSON_PROPERTY_SELF_STAKED_NETWORK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSelfStakedNetwork(String selfStakedNetwork) {
        this.selfStakedNetwork = selfStakedNetwork;
    }

    public VaultAsset pendingRefundCPU(String pendingRefundCPU) {
        this.pendingRefundCPU = pendingRefundCPU;
        return this;
    }

    /**
     * Deprecated
     *
     * @return pendingRefundCPU
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PENDING_REFUND_C_P_U)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPendingRefundCPU() {
        return pendingRefundCPU;
    }

    @JsonProperty(JSON_PROPERTY_PENDING_REFUND_C_P_U)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPendingRefundCPU(String pendingRefundCPU) {
        this.pendingRefundCPU = pendingRefundCPU;
    }

    public VaultAsset pendingRefundNetwork(String pendingRefundNetwork) {
        this.pendingRefundNetwork = pendingRefundNetwork;
        return this;
    }

    /**
     * Deprecated
     *
     * @return pendingRefundNetwork
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PENDING_REFUND_NETWORK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPendingRefundNetwork() {
        return pendingRefundNetwork;
    }

    @JsonProperty(JSON_PROPERTY_PENDING_REFUND_NETWORK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPendingRefundNetwork(String pendingRefundNetwork) {
        this.pendingRefundNetwork = pendingRefundNetwork;
    }

    public VaultAsset blockHeight(String blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }

    /**
     * Get blockHeight
     *
     * @return blockHeight
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_BLOCK_HEIGHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBlockHeight() {
        return blockHeight;
    }

    @JsonProperty(JSON_PROPERTY_BLOCK_HEIGHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBlockHeight(String blockHeight) {
        this.blockHeight = blockHeight;
    }

    public VaultAsset blockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }

    /**
     * Get blockHash
     *
     * @return blockHash
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_BLOCK_HASH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBlockHash() {
        return blockHash;
    }

    @JsonProperty(JSON_PROPERTY_BLOCK_HASH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    public VaultAsset rewardsInfo(RewardsInfo rewardsInfo) {
        this.rewardsInfo = rewardsInfo;
        return this;
    }

    /**
     * Get rewardsInfo
     *
     * @return rewardsInfo
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_REWARDS_INFO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RewardsInfo getRewardsInfo() {
        return rewardsInfo;
    }

    @JsonProperty(JSON_PROPERTY_REWARDS_INFO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRewardsInfo(RewardsInfo rewardsInfo) {
        this.rewardsInfo = rewardsInfo;
    }

    /** Return true if this VaultAsset object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VaultAsset vaultAsset = (VaultAsset) o;
        return Objects.equals(this.id, vaultAsset.id)
                && Objects.equals(this.total, vaultAsset.total)
                && Objects.equals(this.balance, vaultAsset.balance)
                && Objects.equals(this.available, vaultAsset.available)
                && Objects.equals(this.pending, vaultAsset.pending)
                && Objects.equals(this.frozen, vaultAsset.frozen)
                && Objects.equals(this.lockedAmount, vaultAsset.lockedAmount)
                && Objects.equals(this.staked, vaultAsset.staked)
                && Objects.equals(this.totalStakedCPU, vaultAsset.totalStakedCPU)
                && Objects.equals(this.totalStakedNetwork, vaultAsset.totalStakedNetwork)
                && Objects.equals(this.selfStakedCPU, vaultAsset.selfStakedCPU)
                && Objects.equals(this.selfStakedNetwork, vaultAsset.selfStakedNetwork)
                && Objects.equals(this.pendingRefundCPU, vaultAsset.pendingRefundCPU)
                && Objects.equals(this.pendingRefundNetwork, vaultAsset.pendingRefundNetwork)
                && Objects.equals(this.blockHeight, vaultAsset.blockHeight)
                && Objects.equals(this.blockHash, vaultAsset.blockHash)
                && Objects.equals(this.rewardsInfo, vaultAsset.rewardsInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                total,
                balance,
                available,
                pending,
                frozen,
                lockedAmount,
                staked,
                totalStakedCPU,
                totalStakedNetwork,
                selfStakedCPU,
                selfStakedNetwork,
                pendingRefundCPU,
                pendingRefundNetwork,
                blockHeight,
                blockHash,
                rewardsInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VaultAsset {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    available: ").append(toIndentedString(available)).append("\n");
        sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
        sb.append("    frozen: ").append(toIndentedString(frozen)).append("\n");
        sb.append("    lockedAmount: ").append(toIndentedString(lockedAmount)).append("\n");
        sb.append("    staked: ").append(toIndentedString(staked)).append("\n");
        sb.append("    totalStakedCPU: ").append(toIndentedString(totalStakedCPU)).append("\n");
        sb.append("    totalStakedNetwork: ")
                .append(toIndentedString(totalStakedNetwork))
                .append("\n");
        sb.append("    selfStakedCPU: ").append(toIndentedString(selfStakedCPU)).append("\n");
        sb.append("    selfStakedNetwork: ")
                .append(toIndentedString(selfStakedNetwork))
                .append("\n");
        sb.append("    pendingRefundCPU: ").append(toIndentedString(pendingRefundCPU)).append("\n");
        sb.append("    pendingRefundNetwork: ")
                .append(toIndentedString(pendingRefundNetwork))
                .append("\n");
        sb.append("    blockHeight: ").append(toIndentedString(blockHeight)).append("\n");
        sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
        sb.append("    rewardsInfo: ").append(toIndentedString(rewardsInfo)).append("\n");
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

        // add `total` to the URL query string
        if (getTotal() != null) {
            joiner.add(
                    String.format(
                            "%stotal%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getTotal()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `balance` to the URL query string
        if (getBalance() != null) {
            joiner.add(
                    String.format(
                            "%sbalance%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getBalance()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `available` to the URL query string
        if (getAvailable() != null) {
            joiner.add(
                    String.format(
                            "%savailable%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getAvailable()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `pending` to the URL query string
        if (getPending() != null) {
            joiner.add(
                    String.format(
                            "%spending%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getPending()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `frozen` to the URL query string
        if (getFrozen() != null) {
            joiner.add(
                    String.format(
                            "%sfrozen%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getFrozen()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `lockedAmount` to the URL query string
        if (getLockedAmount() != null) {
            joiner.add(
                    String.format(
                            "%slockedAmount%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getLockedAmount()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `staked` to the URL query string
        if (getStaked() != null) {
            joiner.add(
                    String.format(
                            "%sstaked%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getStaked()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `totalStakedCPU` to the URL query string
        if (getTotalStakedCPU() != null) {
            joiner.add(
                    String.format(
                            "%stotalStakedCPU%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getTotalStakedCPU()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `totalStakedNetwork` to the URL query string
        if (getTotalStakedNetwork() != null) {
            joiner.add(
                    String.format(
                            "%stotalStakedNetwork%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getTotalStakedNetwork()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `selfStakedCPU` to the URL query string
        if (getSelfStakedCPU() != null) {
            joiner.add(
                    String.format(
                            "%sselfStakedCPU%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getSelfStakedCPU()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `selfStakedNetwork` to the URL query string
        if (getSelfStakedNetwork() != null) {
            joiner.add(
                    String.format(
                            "%sselfStakedNetwork%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getSelfStakedNetwork()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `pendingRefundCPU` to the URL query string
        if (getPendingRefundCPU() != null) {
            joiner.add(
                    String.format(
                            "%spendingRefundCPU%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getPendingRefundCPU()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `pendingRefundNetwork` to the URL query string
        if (getPendingRefundNetwork() != null) {
            joiner.add(
                    String.format(
                            "%spendingRefundNetwork%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getPendingRefundNetwork()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `blockHeight` to the URL query string
        if (getBlockHeight() != null) {
            joiner.add(
                    String.format(
                            "%sblockHeight%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getBlockHeight()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `blockHash` to the URL query string
        if (getBlockHash() != null) {
            joiner.add(
                    String.format(
                            "%sblockHash%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getBlockHash()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `rewardsInfo` to the URL query string
        if (getRewardsInfo() != null) {
            joiner.add(getRewardsInfo().toUrlQueryString(prefix + "rewardsInfo" + suffix));
        }

        return joiner.toString();
    }
}
