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
import com.fireblocks.sdk.model.XBSettlementAsset;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * XBSettlementFlowSetupStep
 */
@JsonPropertyOrder({
  XBSettlementFlowSetupStep.JSON_PROPERTY_ACCOUNT_ID,
  XBSettlementFlowSetupStep.JSON_PROPERTY_INPUT_AMOUNT,
  XBSettlementFlowSetupStep.JSON_PROPERTY_OUTPUT_AMOUNT,
  XBSettlementFlowSetupStep.JSON_PROPERTY_ESTIMATED_FEE_AMOUNT,
  XBSettlementFlowSetupStep.JSON_PROPERTY_ESTIMATED_TIME,
  XBSettlementFlowSetupStep.JSON_PROPERTY_IS_SIGN_REQUIRED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class XBSettlementFlowSetupStep {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_INPUT_AMOUNT = "inputAmount";
  private XBSettlementAsset inputAmount;

  public static final String JSON_PROPERTY_OUTPUT_AMOUNT = "outputAmount";
  private XBSettlementAsset outputAmount;

  public static final String JSON_PROPERTY_ESTIMATED_FEE_AMOUNT = "estimatedFeeAmount";
  private XBSettlementAsset estimatedFeeAmount;

  public static final String JSON_PROPERTY_ESTIMATED_TIME = "estimatedTime";
  private BigDecimal estimatedTime;

  public static final String JSON_PROPERTY_IS_SIGN_REQUIRED = "isSignRequired";
  private Boolean isSignRequired;

  public XBSettlementFlowSetupStep() { 
  }

  public XBSettlementFlowSetupStep accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public XBSettlementFlowSetupStep inputAmount(XBSettlementAsset inputAmount) {
    this.inputAmount = inputAmount;
    return this;
  }

   /**
   * Get inputAmount
   * @return inputAmount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INPUT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public XBSettlementAsset getInputAmount() {
    return inputAmount;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInputAmount(XBSettlementAsset inputAmount) {
    this.inputAmount = inputAmount;
  }


  public XBSettlementFlowSetupStep outputAmount(XBSettlementAsset outputAmount) {
    this.outputAmount = outputAmount;
    return this;
  }

   /**
   * Get outputAmount
   * @return outputAmount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OUTPUT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public XBSettlementAsset getOutputAmount() {
    return outputAmount;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOutputAmount(XBSettlementAsset outputAmount) {
    this.outputAmount = outputAmount;
  }


  public XBSettlementFlowSetupStep estimatedFeeAmount(XBSettlementAsset estimatedFeeAmount) {
    this.estimatedFeeAmount = estimatedFeeAmount;
    return this;
  }

   /**
   * Get estimatedFeeAmount
   * @return estimatedFeeAmount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ESTIMATED_FEE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public XBSettlementAsset getEstimatedFeeAmount() {
    return estimatedFeeAmount;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATED_FEE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEstimatedFeeAmount(XBSettlementAsset estimatedFeeAmount) {
    this.estimatedFeeAmount = estimatedFeeAmount;
  }


  public XBSettlementFlowSetupStep estimatedTime(BigDecimal estimatedTime) {
    this.estimatedTime = estimatedTime;
    return this;
  }

   /**
   * The estimated time for executing the step.
   * @return estimatedTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ESTIMATED_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getEstimatedTime() {
    return estimatedTime;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATED_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEstimatedTime(BigDecimal estimatedTime) {
    this.estimatedTime = estimatedTime;
  }


  public XBSettlementFlowSetupStep isSignRequired(Boolean isSignRequired) {
    this.isSignRequired = isSignRequired;
    return this;
  }

   /**
   * Whether or not signing is required for executing the step.
   * @return isSignRequired
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_SIGN_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsSignRequired() {
    return isSignRequired;
  }


  @JsonProperty(JSON_PROPERTY_IS_SIGN_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsSignRequired(Boolean isSignRequired) {
    this.isSignRequired = isSignRequired;
  }


  /**
   * Return true if this XBSettlementFlowSetupStep object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XBSettlementFlowSetupStep xbSettlementFlowSetupStep = (XBSettlementFlowSetupStep) o;
    return Objects.equals(this.accountId, xbSettlementFlowSetupStep.accountId) &&
        Objects.equals(this.inputAmount, xbSettlementFlowSetupStep.inputAmount) &&
        Objects.equals(this.outputAmount, xbSettlementFlowSetupStep.outputAmount) &&
        Objects.equals(this.estimatedFeeAmount, xbSettlementFlowSetupStep.estimatedFeeAmount) &&
        Objects.equals(this.estimatedTime, xbSettlementFlowSetupStep.estimatedTime) &&
        Objects.equals(this.isSignRequired, xbSettlementFlowSetupStep.isSignRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, inputAmount, outputAmount, estimatedFeeAmount, estimatedTime, isSignRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XBSettlementFlowSetupStep {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    inputAmount: ").append(toIndentedString(inputAmount)).append("\n");
    sb.append("    outputAmount: ").append(toIndentedString(outputAmount)).append("\n");
    sb.append("    estimatedFeeAmount: ").append(toIndentedString(estimatedFeeAmount)).append("\n");
    sb.append("    estimatedTime: ").append(toIndentedString(estimatedTime)).append("\n");
    sb.append("    isSignRequired: ").append(toIndentedString(isSignRequired)).append("\n");
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

