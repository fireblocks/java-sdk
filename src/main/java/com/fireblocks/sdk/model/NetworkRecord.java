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
import com.fireblocks.sdk.model.DestinationTransferPeerPathResponse;
import com.fireblocks.sdk.model.RewardInfo;
import com.fireblocks.sdk.model.SourceTransferPeerPathResponse;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * NetworkRecord
 */
@JsonPropertyOrder({
  NetworkRecord.JSON_PROPERTY_SOURCE,
  NetworkRecord.JSON_PROPERTY_DESTINATION,
  NetworkRecord.JSON_PROPERTY_TX_HASH,
  NetworkRecord.JSON_PROPERTY_NETWORK_FEE,
  NetworkRecord.JSON_PROPERTY_ASSET_ID,
  NetworkRecord.JSON_PROPERTY_NET_AMOUNT,
  NetworkRecord.JSON_PROPERTY_IS_DROPPED,
  NetworkRecord.JSON_PROPERTY_TYPE,
  NetworkRecord.JSON_PROPERTY_DESTINATION_ADDRESS,
  NetworkRecord.JSON_PROPERTY_SOURCE_ADDRESS,
  NetworkRecord.JSON_PROPERTY_AMOUNT_U_S_D,
  NetworkRecord.JSON_PROPERTY_INDEX,
  NetworkRecord.JSON_PROPERTY_REWARD_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetworkRecord {
  public static final String JSON_PROPERTY_SOURCE = "source";
  private SourceTransferPeerPathResponse source;

  public static final String JSON_PROPERTY_DESTINATION = "destination";
  private DestinationTransferPeerPathResponse destination;

  public static final String JSON_PROPERTY_TX_HASH = "txHash";
  private String txHash;

  public static final String JSON_PROPERTY_NETWORK_FEE = "networkFee";
  private String networkFee;

  public static final String JSON_PROPERTY_ASSET_ID = "assetId";
  private String assetId;

  public static final String JSON_PROPERTY_NET_AMOUNT = "netAmount";
  private String netAmount;

  public static final String JSON_PROPERTY_IS_DROPPED = "isDropped";
  private Boolean isDropped;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_DESTINATION_ADDRESS = "destinationAddress";
  private String destinationAddress;

  public static final String JSON_PROPERTY_SOURCE_ADDRESS = "sourceAddress";
  private String sourceAddress;

  public static final String JSON_PROPERTY_AMOUNT_U_S_D = "amountUSD";
  private String amountUSD;

  public static final String JSON_PROPERTY_INDEX = "index";
  private BigDecimal index;

  public static final String JSON_PROPERTY_REWARD_INFO = "rewardInfo";
  private RewardInfo rewardInfo;

  public NetworkRecord() { 
  }

  public NetworkRecord source(SourceTransferPeerPathResponse source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SourceTransferPeerPathResponse getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(SourceTransferPeerPathResponse source) {
    this.source = source;
  }


  public NetworkRecord destination(DestinationTransferPeerPathResponse destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DestinationTransferPeerPathResponse getDestination() {
    return destination;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestination(DestinationTransferPeerPathResponse destination) {
    this.destination = destination;
  }


  public NetworkRecord txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }

   /**
   * Get txHash
   * @return txHash
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TX_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTxHash() {
    return txHash;
  }


  @JsonProperty(JSON_PROPERTY_TX_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }


  public NetworkRecord networkFee(String networkFee) {
    this.networkFee = networkFee;
    return this;
  }

   /**
   * Get networkFee
   * @return networkFee
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetworkFee() {
    return networkFee;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkFee(String networkFee) {
    this.networkFee = networkFee;
  }


  public NetworkRecord assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
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


  public NetworkRecord netAmount(String netAmount) {
    this.netAmount = netAmount;
    return this;
  }

   /**
   * The net amount of the transaction, after fee deduction
   * @return netAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NET_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetAmount() {
    return netAmount;
  }


  @JsonProperty(JSON_PROPERTY_NET_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetAmount(String netAmount) {
    this.netAmount = netAmount;
  }


  public NetworkRecord isDropped(Boolean isDropped) {
    this.isDropped = isDropped;
    return this;
  }

   /**
   * Get isDropped
   * @return isDropped
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DROPPED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDropped() {
    return isDropped;
  }


  @JsonProperty(JSON_PROPERTY_IS_DROPPED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDropped(Boolean isDropped) {
    this.isDropped = isDropped;
  }


  public NetworkRecord type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public NetworkRecord destinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }

   /**
   * Get destinationAddress
   * @return destinationAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESTINATION_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDestinationAddress() {
    return destinationAddress;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }


  public NetworkRecord sourceAddress(String sourceAddress) {
    this.sourceAddress = sourceAddress;
    return this;
  }

   /**
   * Get sourceAddress
   * @return sourceAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceAddress() {
    return sourceAddress;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceAddress(String sourceAddress) {
    this.sourceAddress = sourceAddress;
  }


  public NetworkRecord amountUSD(String amountUSD) {
    this.amountUSD = amountUSD;
    return this;
  }

   /**
   * Get amountUSD
   * @return amountUSD
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_U_S_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmountUSD() {
    return amountUSD;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_U_S_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountUSD(String amountUSD) {
    this.amountUSD = amountUSD;
  }


  public NetworkRecord index(BigDecimal index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndex(BigDecimal index) {
    this.index = index;
  }


  public NetworkRecord rewardInfo(RewardInfo rewardInfo) {
    this.rewardInfo = rewardInfo;
    return this;
  }

   /**
   * Get rewardInfo
   * @return rewardInfo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REWARD_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RewardInfo getRewardInfo() {
    return rewardInfo;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRewardInfo(RewardInfo rewardInfo) {
    this.rewardInfo = rewardInfo;
  }


  /**
   * Return true if this NetworkRecord object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkRecord networkRecord = (NetworkRecord) o;
    return Objects.equals(this.source, networkRecord.source) &&
        Objects.equals(this.destination, networkRecord.destination) &&
        Objects.equals(this.txHash, networkRecord.txHash) &&
        Objects.equals(this.networkFee, networkRecord.networkFee) &&
        Objects.equals(this.assetId, networkRecord.assetId) &&
        Objects.equals(this.netAmount, networkRecord.netAmount) &&
        Objects.equals(this.isDropped, networkRecord.isDropped) &&
        Objects.equals(this.type, networkRecord.type) &&
        Objects.equals(this.destinationAddress, networkRecord.destinationAddress) &&
        Objects.equals(this.sourceAddress, networkRecord.sourceAddress) &&
        Objects.equals(this.amountUSD, networkRecord.amountUSD) &&
        Objects.equals(this.index, networkRecord.index) &&
        Objects.equals(this.rewardInfo, networkRecord.rewardInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, destination, txHash, networkFee, assetId, netAmount, isDropped, type, destinationAddress, sourceAddress, amountUSD, index, rewardInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkRecord {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    networkFee: ").append(toIndentedString(networkFee)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
    sb.append("    isDropped: ").append(toIndentedString(isDropped)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
    sb.append("    sourceAddress: ").append(toIndentedString(sourceAddress)).append("\n");
    sb.append("    amountUSD: ").append(toIndentedString(amountUSD)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    rewardInfo: ").append(toIndentedString(rewardInfo)).append("\n");
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
