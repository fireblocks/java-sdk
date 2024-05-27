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
import com.fireblocks.sdk.model.ConfigOperationStatus;
import com.fireblocks.sdk.model.DisbursementOperationConfigParams;
import com.fireblocks.sdk.model.DisbursementOperationType;
import com.fireblocks.sdk.model.DisbursementValidationFailure;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DisbursementConfigOperation
 */
@JsonPropertyOrder({
  DisbursementConfigOperation.JSON_PROPERTY_OPERATION_ID,
  DisbursementConfigOperation.JSON_PROPERTY_TYPE,
  DisbursementConfigOperation.JSON_PROPERTY_PARAMS,
  DisbursementConfigOperation.JSON_PROPERTY_STATUS,
  DisbursementConfigOperation.JSON_PROPERTY_VALIDATION_FAILURE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DisbursementConfigOperation {
  public static final String JSON_PROPERTY_OPERATION_ID = "operationId";
  private String operationId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DisbursementOperationType type;

  public static final String JSON_PROPERTY_PARAMS = "params";
  private DisbursementOperationConfigParams params;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ConfigOperationStatus status;

  public static final String JSON_PROPERTY_VALIDATION_FAILURE = "validationFailure";
  private DisbursementValidationFailure validationFailure;

  public DisbursementConfigOperation() { 
  }

  public DisbursementConfigOperation operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

   /**
   * Get operationId
   * @return operationId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPERATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOperationId() {
    return operationId;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }


  public DisbursementConfigOperation type(DisbursementOperationType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DisbursementOperationType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(DisbursementOperationType type) {
    this.type = type;
  }


  public DisbursementConfigOperation params(DisbursementOperationConfigParams params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PARAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DisbursementOperationConfigParams getParams() {
    return params;
  }


  @JsonProperty(JSON_PROPERTY_PARAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParams(DisbursementOperationConfigParams params) {
    this.params = params;
  }


  public DisbursementConfigOperation status(ConfigOperationStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConfigOperationStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(ConfigOperationStatus status) {
    this.status = status;
  }


  public DisbursementConfigOperation validationFailure(DisbursementValidationFailure validationFailure) {
    this.validationFailure = validationFailure;
    return this;
  }

   /**
   * Get validationFailure
   * @return validationFailure
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALIDATION_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DisbursementValidationFailure getValidationFailure() {
    return validationFailure;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidationFailure(DisbursementValidationFailure validationFailure) {
    this.validationFailure = validationFailure;
  }


  /**
   * Return true if this DisbursementConfigOperation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisbursementConfigOperation disbursementConfigOperation = (DisbursementConfigOperation) o;
    return Objects.equals(this.operationId, disbursementConfigOperation.operationId) &&
        Objects.equals(this.type, disbursementConfigOperation.type) &&
        Objects.equals(this.params, disbursementConfigOperation.params) &&
        Objects.equals(this.status, disbursementConfigOperation.status) &&
        Objects.equals(this.validationFailure, disbursementConfigOperation.validationFailure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, type, params, status, validationFailure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisbursementConfigOperation {\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    validationFailure: ").append(toIndentedString(validationFailure)).append("\n");
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

    // add `operationId` to the URL query string
    if (getOperationId() != null) {
      joiner.add(String.format("%soperationId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOperationId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `params` to the URL query string
    if (getParams() != null) {
      joiner.add(getParams().toUrlQueryString(prefix + "params" + suffix));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `validationFailure` to the URL query string
    if (getValidationFailure() != null) {
      joiner.add(getValidationFailure().toUrlQueryString(prefix + "validationFailure" + suffix));
    }

    return joiner.toString();
  }
}

