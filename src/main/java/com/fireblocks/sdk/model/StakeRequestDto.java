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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * StakeRequestDto
 */
@JsonPropertyOrder({
  StakeRequestDto.JSON_PROPERTY_VAULT_ACCOUNT_ID,
  StakeRequestDto.JSON_PROPERTY_PROVIDER_ID,
  StakeRequestDto.JSON_PROPERTY_STAKE_AMOUNT,
  StakeRequestDto.JSON_PROPERTY_TX_NOTE,
  StakeRequestDto.JSON_PROPERTY_FEE,
  StakeRequestDto.JSON_PROPERTY_FEE_LEVEL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StakeRequestDto {
  public static final String JSON_PROPERTY_VAULT_ACCOUNT_ID = "vaultAccountId";
  private String vaultAccountId;

  public static final String JSON_PROPERTY_PROVIDER_ID = "providerId";
  private String providerId;

  public static final String JSON_PROPERTY_STAKE_AMOUNT = "stakeAmount";
  private String stakeAmount;

  public static final String JSON_PROPERTY_TX_NOTE = "txNote";
  private String txNote;

  public static final String JSON_PROPERTY_FEE = "fee";
  private String fee;

  public static final String JSON_PROPERTY_FEE_LEVEL = "feeLevel";
  private String feeLevel;

  public StakeRequestDto() { 
  }

  public StakeRequestDto vaultAccountId(String vaultAccountId) {
    this.vaultAccountId = vaultAccountId;
    return this;
  }

   /**
   * The source vault account to stake from
   * @return vaultAccountId
  **/
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


  public StakeRequestDto providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * The ID of the provider
   * @return providerId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProviderId() {
    return providerId;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }


  public StakeRequestDto stakeAmount(String stakeAmount) {
    this.stakeAmount = stakeAmount;
    return this;
  }

   /**
   * Amount of tokens to stake
   * @return stakeAmount
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STAKE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStakeAmount() {
    return stakeAmount;
  }


  @JsonProperty(JSON_PROPERTY_STAKE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStakeAmount(String stakeAmount) {
    this.stakeAmount = stakeAmount;
  }


  public StakeRequestDto txNote(String txNote) {
    this.txNote = txNote;
    return this;
  }

   /**
   * The note to associate with the stake transactions.
   * @return txNote
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TX_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTxNote() {
    return txNote;
  }


  @JsonProperty(JSON_PROPERTY_TX_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTxNote(String txNote) {
    this.txNote = txNote;
  }


  public StakeRequestDto fee(String fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Represents the fee for a transaction, which can be specified as a percentage value. Only one of fee/feeLevel is required.
   * @return fee
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFee() {
    return fee;
  }


  @JsonProperty(JSON_PROPERTY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFee(String fee) {
    this.fee = fee;
  }


  public StakeRequestDto feeLevel(String feeLevel) {
    this.feeLevel = feeLevel;
    return this;
  }

   /**
   * Represents the fee level for a transaction, which can be set as slow, medium, or fast. Only one of fee/feeLevel is required.
   * @return feeLevel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFeeLevel() {
    return feeLevel;
  }


  @JsonProperty(JSON_PROPERTY_FEE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeeLevel(String feeLevel) {
    this.feeLevel = feeLevel;
  }


  /**
   * Return true if this StakeRequestDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StakeRequestDto stakeRequestDto = (StakeRequestDto) o;
    return Objects.equals(this.vaultAccountId, stakeRequestDto.vaultAccountId) &&
        Objects.equals(this.providerId, stakeRequestDto.providerId) &&
        Objects.equals(this.stakeAmount, stakeRequestDto.stakeAmount) &&
        Objects.equals(this.txNote, stakeRequestDto.txNote) &&
        Objects.equals(this.fee, stakeRequestDto.fee) &&
        Objects.equals(this.feeLevel, stakeRequestDto.feeLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vaultAccountId, providerId, stakeAmount, txNote, fee, feeLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StakeRequestDto {\n");
    sb.append("    vaultAccountId: ").append(toIndentedString(vaultAccountId)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    stakeAmount: ").append(toIndentedString(stakeAmount)).append("\n");
    sb.append("    txNote: ").append(toIndentedString(txNote)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    feeLevel: ").append(toIndentedString(feeLevel)).append("\n");
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

    // add `vaultAccountId` to the URL query string
    if (getVaultAccountId() != null) {
      joiner.add(String.format("%svaultAccountId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVaultAccountId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `providerId` to the URL query string
    if (getProviderId() != null) {
      joiner.add(String.format("%sproviderId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProviderId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `stakeAmount` to the URL query string
    if (getStakeAmount() != null) {
      joiner.add(String.format("%sstakeAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStakeAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `txNote` to the URL query string
    if (getTxNote() != null) {
      joiner.add(String.format("%stxNote%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTxNote()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fee` to the URL query string
    if (getFee() != null) {
      joiner.add(String.format("%sfee%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFee()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `feeLevel` to the URL query string
    if (getFeeLevel() != null) {
      joiner.add(String.format("%sfeeLevel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFeeLevel()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

