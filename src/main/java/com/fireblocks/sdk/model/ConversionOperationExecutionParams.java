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
import com.fireblocks.sdk.model.ConversionOperationExecutionParamsExecutionParams;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ConversionOperationExecutionParams
 */
@JsonPropertyOrder({
  ConversionOperationExecutionParams.JSON_PROPERTY_CONFIG_OPERATION_ID,
  ConversionOperationExecutionParams.JSON_PROPERTY_EXECUTION_PARAMS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionOperationExecutionParams {
  public static final String JSON_PROPERTY_CONFIG_OPERATION_ID = "configOperationId";
  private String configOperationId;

  public static final String JSON_PROPERTY_EXECUTION_PARAMS = "executionParams";
  private ConversionOperationExecutionParamsExecutionParams executionParams;

  public ConversionOperationExecutionParams() { 
  }

  public ConversionOperationExecutionParams configOperationId(String configOperationId) {
    this.configOperationId = configOperationId;
    return this;
  }

   /**
   * Get configOperationId
   * @return configOperationId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONFIG_OPERATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConfigOperationId() {
    return configOperationId;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG_OPERATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfigOperationId(String configOperationId) {
    this.configOperationId = configOperationId;
  }


  public ConversionOperationExecutionParams executionParams(ConversionOperationExecutionParamsExecutionParams executionParams) {
    this.executionParams = executionParams;
    return this;
  }

   /**
   * Get executionParams
   * @return executionParams
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTION_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionOperationExecutionParamsExecutionParams getExecutionParams() {
    return executionParams;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTION_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecutionParams(ConversionOperationExecutionParamsExecutionParams executionParams) {
    this.executionParams = executionParams;
  }


  /**
   * Return true if this ConversionOperationExecutionParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionOperationExecutionParams conversionOperationExecutionParams = (ConversionOperationExecutionParams) o;
    return Objects.equals(this.configOperationId, conversionOperationExecutionParams.configOperationId) &&
        Objects.equals(this.executionParams, conversionOperationExecutionParams.executionParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configOperationId, executionParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionOperationExecutionParams {\n");
    sb.append("    configOperationId: ").append(toIndentedString(configOperationId)).append("\n");
    sb.append("    executionParams: ").append(toIndentedString(executionParams)).append("\n");
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

    // add `configOperationId` to the URL query string
    if (getConfigOperationId() != null) {
      joiner.add(String.format("%sconfigOperationId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConfigOperationId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `executionParams` to the URL query string
    if (getExecutionParams() != null) {
      joiner.add(getExecutionParams().toUrlQueryString(prefix + "executionParams" + suffix));
    }

    return joiner.toString();
  }
}

