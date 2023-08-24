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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fireblocks.sdk.model.XBSettlementFlowExecutionStep;
import com.fireblocks.sdk.model.XBSettlementStepType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * XBSettlementFlowStepsExecutionRecord
 */
@JsonPropertyOrder({
  XBSettlementFlowStepsExecutionRecord.JSON_PROPERTY_STEP_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class XBSettlementFlowStepsExecutionRecord {
  public static final String JSON_PROPERTY_STEP_TYPE = "stepType";
  private XBSettlementStepType stepType;

  public XBSettlementFlowStepsExecutionRecord() { 
  }

  public XBSettlementFlowStepsExecutionRecord stepType(XBSettlementStepType stepType) {
    this.stepType = stepType;
    return this;
  }

   /**
   * Get stepType
   * @return stepType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XBSettlementStepType getStepType() {
    return stepType;
  }


  @JsonProperty(JSON_PROPERTY_STEP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStepType(XBSettlementStepType stepType) {
    this.stepType = stepType;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, XBSettlementFlowExecutionStep> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public XBSettlementFlowStepsExecutionRecord putAdditionalProperty(String key, XBSettlementFlowExecutionStep value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, XBSettlementFlowExecutionStep> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public XBSettlementFlowExecutionStep getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this XBSettlementFlowStepsExecutionRecord object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XBSettlementFlowStepsExecutionRecord xbSettlementFlowStepsExecutionRecord = (XBSettlementFlowStepsExecutionRecord) o;
    return Objects.equals(this.stepType, xbSettlementFlowStepsExecutionRecord.stepType)&&
        Objects.equals(this.additionalProperties, xbSettlementFlowStepsExecutionRecord.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XBSettlementFlowStepsExecutionRecord {\n");
    sb.append("    stepType: ").append(toIndentedString(stepType)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

