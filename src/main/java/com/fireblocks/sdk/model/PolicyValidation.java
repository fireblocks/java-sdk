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
import com.fireblocks.sdk.model.PolicyCheckResult;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * Policy validation object
 */
@JsonPropertyOrder({
  PolicyValidation.JSON_PROPERTY_STATUS,
  PolicyValidation.JSON_PROPERTY_CHECK_RESULT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PolicyValidation {
  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_CHECK_RESULT = "checkResult";
  private PolicyCheckResult checkResult;

  public PolicyValidation() { 
  }

  public PolicyValidation status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Validation status
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public PolicyValidation checkResult(PolicyCheckResult checkResult) {
    this.checkResult = checkResult;
    return this;
  }

   /**
   * Get checkResult
   * @return checkResult
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHECK_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PolicyCheckResult getCheckResult() {
    return checkResult;
  }


  @JsonProperty(JSON_PROPERTY_CHECK_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCheckResult(PolicyCheckResult checkResult) {
    this.checkResult = checkResult;
  }


  /**
   * Return true if this PolicyValidation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyValidation policyValidation = (PolicyValidation) o;
    return Objects.equals(this.status, policyValidation.status) &&
        Objects.equals(this.checkResult, policyValidation.checkResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, checkResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyValidation {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    checkResult: ").append(toIndentedString(checkResult)).append("\n");
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

