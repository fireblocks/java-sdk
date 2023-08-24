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
 * This field is relevant only for Algorand transactions. Both &#x60;srcRewards&#x60; and &#x60;destRewards&#x60; will appear only for Vault to Vault transactions, otherwise you will receive only the Fireblocks’ side of the transaction.
 */
@JsonPropertyOrder({
  RewardInfo.JSON_PROPERTY_SRC_REWARDS,
  RewardInfo.JSON_PROPERTY_DEST_REWARDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RewardInfo {
  public static final String JSON_PROPERTY_SRC_REWARDS = "srcRewards";
  private String srcRewards;

  public static final String JSON_PROPERTY_DEST_REWARDS = "destRewards";
  private String destRewards;

  public RewardInfo() { 
  }

  public RewardInfo srcRewards(String srcRewards) {
    this.srcRewards = srcRewards;
    return this;
  }

   /**
   * Get srcRewards
   * @return srcRewards
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SRC_REWARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSrcRewards() {
    return srcRewards;
  }


  @JsonProperty(JSON_PROPERTY_SRC_REWARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSrcRewards(String srcRewards) {
    this.srcRewards = srcRewards;
  }


  public RewardInfo destRewards(String destRewards) {
    this.destRewards = destRewards;
    return this;
  }

   /**
   * Get destRewards
   * @return destRewards
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEST_REWARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDestRewards() {
    return destRewards;
  }


  @JsonProperty(JSON_PROPERTY_DEST_REWARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestRewards(String destRewards) {
    this.destRewards = destRewards;
  }


  /**
   * Return true if this RewardInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardInfo rewardInfo = (RewardInfo) o;
    return Objects.equals(this.srcRewards, rewardInfo.srcRewards) &&
        Objects.equals(this.destRewards, rewardInfo.destRewards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(srcRewards, destRewards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardInfo {\n");
    sb.append("    srcRewards: ").append(toIndentedString(srcRewards)).append("\n");
    sb.append("    destRewards: ").append(toIndentedString(destRewards)).append("\n");
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
