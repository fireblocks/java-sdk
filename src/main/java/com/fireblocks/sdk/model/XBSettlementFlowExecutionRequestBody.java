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
 * XBSettlementFlowExecutionRequestBody
 */
@JsonPropertyOrder({
  XBSettlementFlowExecutionRequestBody.JSON_PROPERTY_CONVERSION_SLIPPAGE_BASIS_POINTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class XBSettlementFlowExecutionRequestBody {
  public static final String JSON_PROPERTY_CONVERSION_SLIPPAGE_BASIS_POINTS = "conversionSlippageBasisPoints";
  private Integer conversionSlippageBasisPoints = 10000;

  public XBSettlementFlowExecutionRequestBody() { 
  }

  public XBSettlementFlowExecutionRequestBody conversionSlippageBasisPoints(Integer conversionSlippageBasisPoints) {
    this.conversionSlippageBasisPoints = conversionSlippageBasisPoints;
    return this;
  }

   /**
   * Slippage configuarion in basis points, the default value is 10% 
   * minimum: 0
   * maximum: 10000
   * @return conversionSlippageBasisPoints
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSION_SLIPPAGE_BASIS_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConversionSlippageBasisPoints() {
    return conversionSlippageBasisPoints;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_SLIPPAGE_BASIS_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionSlippageBasisPoints(Integer conversionSlippageBasisPoints) {
    this.conversionSlippageBasisPoints = conversionSlippageBasisPoints;
  }


  /**
   * Return true if this XBSettlementFlowExecutionRequestBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XBSettlementFlowExecutionRequestBody xbSettlementFlowExecutionRequestBody = (XBSettlementFlowExecutionRequestBody) o;
    return Objects.equals(this.conversionSlippageBasisPoints, xbSettlementFlowExecutionRequestBody.conversionSlippageBasisPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionSlippageBasisPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XBSettlementFlowExecutionRequestBody {\n");
    sb.append("    conversionSlippageBasisPoints: ").append(toIndentedString(conversionSlippageBasisPoints)).append("\n");
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

