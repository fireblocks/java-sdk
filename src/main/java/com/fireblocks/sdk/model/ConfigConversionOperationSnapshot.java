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
import com.fireblocks.sdk.model.ConversionOperationConfigParams;
import com.fireblocks.sdk.model.ConversionOperationType;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ConfigConversionOperationSnapshot
 */
@JsonPropertyOrder({
  ConfigConversionOperationSnapshot.JSON_PROPERTY_OPERATION_ID,
  ConfigConversionOperationSnapshot.JSON_PROPERTY_TYPE,
  ConfigConversionOperationSnapshot.JSON_PROPERTY_PARAMS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfigConversionOperationSnapshot {
  public static final String JSON_PROPERTY_OPERATION_ID = "operationId";
  private String operationId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ConversionOperationType type;

  public static final String JSON_PROPERTY_PARAMS = "params";
  private ConversionOperationConfigParams params;

  public ConfigConversionOperationSnapshot() { 
  }

  public ConfigConversionOperationSnapshot operationId(String operationId) {
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


  public ConfigConversionOperationSnapshot type(ConversionOperationType type) {
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

  public ConversionOperationType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(ConversionOperationType type) {
    this.type = type;
  }


  public ConfigConversionOperationSnapshot params(ConversionOperationConfigParams params) {
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

  public ConversionOperationConfigParams getParams() {
    return params;
  }


  @JsonProperty(JSON_PROPERTY_PARAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParams(ConversionOperationConfigParams params) {
    this.params = params;
  }


  /**
   * Return true if this ConfigConversionOperationSnapshot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigConversionOperationSnapshot configConversionOperationSnapshot = (ConfigConversionOperationSnapshot) o;
    return Objects.equals(this.operationId, configConversionOperationSnapshot.operationId) &&
        Objects.equals(this.type, configConversionOperationSnapshot.type) &&
        Objects.equals(this.params, configConversionOperationSnapshot.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, type, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigConversionOperationSnapshot {\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

    return joiner.toString();
  }
}

