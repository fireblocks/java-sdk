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
 * The details of the requested amount to transfer.
 */
@JsonPropertyOrder({
  AmountInfo.JSON_PROPERTY_AMOUNT,
  AmountInfo.JSON_PROPERTY_REQUESTED_AMOUNT,
  AmountInfo.JSON_PROPERTY_NET_AMOUNT,
  AmountInfo.JSON_PROPERTY_AMOUNT_U_S_D
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AmountInfo {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_REQUESTED_AMOUNT = "requestedAmount";
  private String requestedAmount;

  public static final String JSON_PROPERTY_NET_AMOUNT = "netAmount";
  private String netAmount;

  public static final String JSON_PROPERTY_AMOUNT_U_S_D = "amountUSD";
  private String amountUSD;

  public AmountInfo() { 
  }

  public AmountInfo amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * If the transfer is a withdrawal from an exchange, the actual amount that was requested to be transferred. Otherwise, the requested amount.
   * @return amount
  **/
  @javax.annotation.Nullable
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


  public AmountInfo requestedAmount(String requestedAmount) {
    this.requestedAmount = requestedAmount;
    return this;
  }

   /**
   * The amount requested by the user.
   * @return requestedAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUESTED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestedAmount() {
    return requestedAmount;
  }


  @JsonProperty(JSON_PROPERTY_REQUESTED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestedAmount(String requestedAmount) {
    this.requestedAmount = requestedAmount;
  }


  public AmountInfo netAmount(String netAmount) {
    this.netAmount = netAmount;
    return this;
  }

   /**
   * The net amount of the transaction, after fee deduction.
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


  public AmountInfo amountUSD(String amountUSD) {
    this.amountUSD = amountUSD;
    return this;
  }

   /**
   * The USD value of the requested amount.
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


  /**
   * Return true if this AmountInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmountInfo amountInfo = (AmountInfo) o;
    return Objects.equals(this.amount, amountInfo.amount) &&
        Objects.equals(this.requestedAmount, amountInfo.requestedAmount) &&
        Objects.equals(this.netAmount, amountInfo.netAmount) &&
        Objects.equals(this.amountUSD, amountInfo.amountUSD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, requestedAmount, netAmount, amountUSD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmountInfo {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    requestedAmount: ").append(toIndentedString(requestedAmount)).append("\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
    sb.append("    amountUSD: ").append(toIndentedString(amountUSD)).append("\n");
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
