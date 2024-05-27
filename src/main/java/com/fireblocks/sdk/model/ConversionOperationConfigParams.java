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
 * ConversionOperationConfigParams
 */
@JsonPropertyOrder({
  ConversionOperationConfigParams.JSON_PROPERTY_AMOUNT,
  ConversionOperationConfigParams.JSON_PROPERTY_ACCOUNT_ID,
  ConversionOperationConfigParams.JSON_PROPERTY_SRC_ASSET_ID,
  ConversionOperationConfigParams.JSON_PROPERTY_DEST_ASSET_ID,
  ConversionOperationConfigParams.JSON_PROPERTY_SLIPPAGE_BASIS_POINTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionOperationConfigParams {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_SRC_ASSET_ID = "srcAssetId";
  private String srcAssetId;

  public static final String JSON_PROPERTY_DEST_ASSET_ID = "destAssetId";
  private String destAssetId;

  public static final String JSON_PROPERTY_SLIPPAGE_BASIS_POINTS = "slippageBasisPoints";
  private Integer slippageBasisPoints;

  public ConversionOperationConfigParams() { 
  }

  public ConversionOperationConfigParams amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ConversionOperationConfigParams accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ConversionOperationConfigParams srcAssetId(String srcAssetId) {
    this.srcAssetId = srcAssetId;
    return this;
  }

   /**
   * Get srcAssetId
   * @return srcAssetId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SRC_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSrcAssetId() {
    return srcAssetId;
  }


  @JsonProperty(JSON_PROPERTY_SRC_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSrcAssetId(String srcAssetId) {
    this.srcAssetId = srcAssetId;
  }


  public ConversionOperationConfigParams destAssetId(String destAssetId) {
    this.destAssetId = destAssetId;
    return this;
  }

   /**
   * Get destAssetId
   * @return destAssetId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEST_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDestAssetId() {
    return destAssetId;
  }


  @JsonProperty(JSON_PROPERTY_DEST_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestAssetId(String destAssetId) {
    this.destAssetId = destAssetId;
  }


  public ConversionOperationConfigParams slippageBasisPoints(Integer slippageBasisPoints) {
    this.slippageBasisPoints = slippageBasisPoints;
    return this;
  }

   /**
   * Get slippageBasisPoints
   * minimum: 0
   * maximum: 10000
   * @return slippageBasisPoints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLIPPAGE_BASIS_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSlippageBasisPoints() {
    return slippageBasisPoints;
  }


  @JsonProperty(JSON_PROPERTY_SLIPPAGE_BASIS_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlippageBasisPoints(Integer slippageBasisPoints) {
    this.slippageBasisPoints = slippageBasisPoints;
  }


  /**
   * Return true if this ConversionOperationConfigParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionOperationConfigParams conversionOperationConfigParams = (ConversionOperationConfigParams) o;
    return Objects.equals(this.amount, conversionOperationConfigParams.amount) &&
        Objects.equals(this.accountId, conversionOperationConfigParams.accountId) &&
        Objects.equals(this.srcAssetId, conversionOperationConfigParams.srcAssetId) &&
        Objects.equals(this.destAssetId, conversionOperationConfigParams.destAssetId) &&
        Objects.equals(this.slippageBasisPoints, conversionOperationConfigParams.slippageBasisPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, accountId, srcAssetId, destAssetId, slippageBasisPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionOperationConfigParams {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    srcAssetId: ").append(toIndentedString(srcAssetId)).append("\n");
    sb.append("    destAssetId: ").append(toIndentedString(destAssetId)).append("\n");
    sb.append("    slippageBasisPoints: ").append(toIndentedString(slippageBasisPoints)).append("\n");
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

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `accountId` to the URL query string
    if (getAccountId() != null) {
      joiner.add(String.format("%saccountId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccountId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `srcAssetId` to the URL query string
    if (getSrcAssetId() != null) {
      joiner.add(String.format("%ssrcAssetId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSrcAssetId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `destAssetId` to the URL query string
    if (getDestAssetId() != null) {
      joiner.add(String.format("%sdestAssetId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDestAssetId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `slippageBasisPoints` to the URL query string
    if (getSlippageBasisPoints() != null) {
      joiner.add(String.format("%sslippageBasisPoints%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSlippageBasisPoints()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

