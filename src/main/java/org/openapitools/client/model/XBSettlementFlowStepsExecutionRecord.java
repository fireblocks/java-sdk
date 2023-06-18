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


package org.openapitools.client.model;
import com.sun.jersey.api.client.GenericType;
import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.XBSettlementFlowExecutionStep;
import org.openapitools.client.model.XBSettlementStepType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * XBSettlementFlowStepsExecutionRecord
 */
@JsonPropertyOrder({
  XBSettlementFlowStepsExecutionRecord.JSON_PROPERTY_STEP_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class XBSettlementFlowStepsExecutionRecord extends HashMap<String, XBSettlementFlowExecutionStep> {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XBSettlementFlowStepsExecutionRecord xbSettlementFlowStepsExecutionRecord = (XBSettlementFlowStepsExecutionRecord) o;
    return Objects.equals(this.stepType, xbSettlementFlowStepsExecutionRecord.stepType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XBSettlementFlowStepsExecutionRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    stepType: ").append(toIndentedString(stepType)).append("\n");
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

    // add `stepType` to the URL query string
    if (getStepType() != null) {
      try {
        joiner.add(String.format("%sstepType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStepType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

