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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * AssetWallet
 */
@JsonPropertyOrder({
  AssetWallet.JSON_PROPERTY_VAULT_ID,
  AssetWallet.JSON_PROPERTY_ASSET_ID,
  AssetWallet.JSON_PROPERTY_AVAILABLE,
  AssetWallet.JSON_PROPERTY_TOTAL,
  AssetWallet.JSON_PROPERTY_PENDING,
  AssetWallet.JSON_PROPERTY_STAKED,
  AssetWallet.JSON_PROPERTY_FROZEN,
  AssetWallet.JSON_PROPERTY_LOCKED_AMOUNT,
  AssetWallet.JSON_PROPERTY_BLOCK_HEIGHT,
  AssetWallet.JSON_PROPERTY_BLOCK_HASH,
  AssetWallet.JSON_PROPERTY_CREATION_TIMESTAMP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssetWallet {
  public static final String JSON_PROPERTY_VAULT_ID = "vaultId";
  private String vaultId;

  public static final String JSON_PROPERTY_ASSET_ID = "assetId";
  private String assetId;

  public static final String JSON_PROPERTY_AVAILABLE = "available";
  private String available;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private String total;

  public static final String JSON_PROPERTY_PENDING = "pending";
  private String pending;

  public static final String JSON_PROPERTY_STAKED = "staked";
  private String staked;

  public static final String JSON_PROPERTY_FROZEN = "frozen";
  private String frozen;

  public static final String JSON_PROPERTY_LOCKED_AMOUNT = "lockedAmount";
  private String lockedAmount;

  public static final String JSON_PROPERTY_BLOCK_HEIGHT = "blockHeight";
  private String blockHeight;

  public static final String JSON_PROPERTY_BLOCK_HASH = "blockHash";
  private String blockHash;

  public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
  private String creationTimestamp;

  public AssetWallet() { 
  }

  public AssetWallet vaultId(String vaultId) {
    this.vaultId = vaultId;
    return this;
  }

   /**
   * ID of the vault account. You can [get the vault account by this ID](https://developers.fireblocks.com/reference/get_vault-accounts-vaultaccountid) to retrieve vault properties such as its name, auto fueling, hidden on UI or customer reference ID.
   * @return vaultId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VAULT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVaultId() {
    return vaultId;
  }


  @JsonProperty(JSON_PROPERTY_VAULT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVaultId(String vaultId) {
    this.vaultId = vaultId;
  }


  public AssetWallet assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * ID of the asset. You can get more information about this asset by using the [supported assets API](https://developers.fireblocks.com/reference/get_supported-assets)
   * @return assetId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssetId() {
    return assetId;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public AssetWallet available(String available) {
    this.available = available;
    return this;
  }

   /**
   * Available balance, available to use in a transaction.
   * @return available
  **/
  @javax.annotation.Nullable
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


  public AssetWallet total(String total) {
    this.total = total;
    return this;
  }

   /**
   * Total balance at the asset wallet, as seen at the blockchain explorers. This includes balance available, and any kind of unavailable balance such as locked, frozen, or others.
   * @return total
  **/
  @javax.annotation.Nullable
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


  public AssetWallet pending(String pending) {
    this.pending = pending;
    return this;
  }

   /**
   * Pending balance.
   * @return pending
  **/
  @javax.annotation.Nullable
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


  public AssetWallet staked(String staked) {
    this.staked = staked;
    return this;
  }

   /**
   * Staked balance.
   * @return staked
  **/
  @javax.annotation.Nullable
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


  public AssetWallet frozen(String frozen) {
    this.frozen = frozen;
    return this;
  }

   /**
   * Funds frozen due to the anti-money laundering policy at this workspace.
   * @return frozen
  **/
  @javax.annotation.Nullable
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


  public AssetWallet lockedAmount(String lockedAmount) {
    this.lockedAmount = lockedAmount;
    return this;
  }

   /**
   * Locked balance.
   * @return lockedAmount
  **/
  @javax.annotation.Nullable
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


  public AssetWallet blockHeight(String blockHeight) {
    this.blockHeight = blockHeight;
    return this;
  }

   /**
   * The height (number) of the block of the balance. Can by empty.
   * @return blockHeight
  **/
  @javax.annotation.Nullable
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


  public AssetWallet blockHash(String blockHash) {
    this.blockHash = blockHash;
    return this;
  }

   /**
   * The hash of the block of the balance. Can by empty.
   * @return blockHash
  **/
  @javax.annotation.Nullable
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


  public AssetWallet creationTimestamp(String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

   /**
   * Unix timestamp of the time the asset wallet was created.
   * @return creationTimestamp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreationTimestamp() {
    return creationTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationTimestamp(String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }


  /**
   * Return true if this AssetWallet object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetWallet assetWallet = (AssetWallet) o;
    return Objects.equals(this.vaultId, assetWallet.vaultId) &&
        Objects.equals(this.assetId, assetWallet.assetId) &&
        Objects.equals(this.available, assetWallet.available) &&
        Objects.equals(this.total, assetWallet.total) &&
        Objects.equals(this.pending, assetWallet.pending) &&
        Objects.equals(this.staked, assetWallet.staked) &&
        Objects.equals(this.frozen, assetWallet.frozen) &&
        Objects.equals(this.lockedAmount, assetWallet.lockedAmount) &&
        Objects.equals(this.blockHeight, assetWallet.blockHeight) &&
        Objects.equals(this.blockHash, assetWallet.blockHash) &&
        Objects.equals(this.creationTimestamp, assetWallet.creationTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vaultId, assetId, available, total, pending, staked, frozen, lockedAmount, blockHeight, blockHash, creationTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetWallet {\n");
    sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    staked: ").append(toIndentedString(staked)).append("\n");
    sb.append("    frozen: ").append(toIndentedString(frozen)).append("\n");
    sb.append("    lockedAmount: ").append(toIndentedString(lockedAmount)).append("\n");
    sb.append("    blockHeight: ").append(toIndentedString(blockHeight)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

