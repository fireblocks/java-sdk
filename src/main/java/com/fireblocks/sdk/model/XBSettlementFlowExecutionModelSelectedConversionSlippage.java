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
import com.fireblocks.sdk.model.XBSettlementFlowSelectedConversionSlippageReason;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * Indicates the selected slippage used during the flow since override logic may have taken place.
 */
@JsonPropertyOrder({
  XBSettlementFlowExecutionModelSelectedConversionSlippage.JSON_PROPERTY_BASIS_POINTS,
  XBSettlementFlowExecutionModelSelectedConversionSlippage.JSON_PROPERTY_REASON
})
@JsonTypeName("XBSettlementFlowExecutionModel_selectedConversionSlippage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class XBSettlementFlowExecutionModelSelectedConversionSlippage {
  public static final String JSON_PROPERTY_BASIS_POINTS = "basisPoints";
  private BigDecimal basisPoints;

  public static final String JSON_PROPERTY_REASON = "reason";
  private XBSettlementFlowSelectedConversionSlippageReason reason;

  public XBSettlementFlowExecutionModelSelectedConversionSlippage() { 
  }

  public XBSettlementFlowExecutionModelSelectedConversionSlippage basisPoints(BigDecimal basisPoints) {
    this.basisPoints = basisPoints;
    return this;
  }

   /**
   * Get basisPoints
   * @return basisPoints
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BASIS_POINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getBasisPoints() {
    return basisPoints;
  }


  @JsonProperty(JSON_PROPERTY_BASIS_POINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBasisPoints(BigDecimal basisPoints) {
    this.basisPoints = basisPoints;
  }


  public XBSettlementFlowExecutionModelSelectedConversionSlippage reason(XBSettlementFlowSelectedConversionSlippageReason reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public XBSettlementFlowSelectedConversionSlippageReason getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReason(XBSettlementFlowSelectedConversionSlippageReason reason) {
    this.reason = reason;
  }


  /**
   * Return true if this XBSettlementFlowExecutionModel_selectedConversionSlippage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XBSettlementFlowExecutionModelSelectedConversionSlippage xbSettlementFlowExecutionModelSelectedConversionSlippage = (XBSettlementFlowExecutionModelSelectedConversionSlippage) o;
    return Objects.equals(this.basisPoints, xbSettlementFlowExecutionModelSelectedConversionSlippage.basisPoints) &&
        Objects.equals(this.reason, xbSettlementFlowExecutionModelSelectedConversionSlippage.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basisPoints, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XBSettlementFlowExecutionModelSelectedConversionSlippage {\n");
    sb.append("    basisPoints: ").append(toIndentedString(basisPoints)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

