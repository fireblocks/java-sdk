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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * SetConfirmationsThresholdRequest
 */
@JsonPropertyOrder({
  SetConfirmationsThresholdRequest.JSON_PROPERTY_NUM_OF_CONFIRMATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SetConfirmationsThresholdRequest {
  public static final String JSON_PROPERTY_NUM_OF_CONFIRMATIONS = "numOfConfirmations";
  private BigDecimal numOfConfirmations;

  public SetConfirmationsThresholdRequest() { 
  }

  public SetConfirmationsThresholdRequest numOfConfirmations(BigDecimal numOfConfirmations) {
    this.numOfConfirmations = numOfConfirmations;
    return this;
  }

   /**
   * Get numOfConfirmations
   * @return numOfConfirmations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_OF_CONFIRMATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNumOfConfirmations() {
    return numOfConfirmations;
  }


  @JsonProperty(JSON_PROPERTY_NUM_OF_CONFIRMATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumOfConfirmations(BigDecimal numOfConfirmations) {
    this.numOfConfirmations = numOfConfirmations;
  }


  /**
   * Return true if this SetConfirmationsThresholdRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetConfirmationsThresholdRequest setConfirmationsThresholdRequest = (SetConfirmationsThresholdRequest) o;
    return Objects.equals(this.numOfConfirmations, setConfirmationsThresholdRequest.numOfConfirmations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numOfConfirmations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetConfirmationsThresholdRequest {\n");
    sb.append("    numOfConfirmations: ").append(toIndentedString(numOfConfirmations)).append("\n");
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

