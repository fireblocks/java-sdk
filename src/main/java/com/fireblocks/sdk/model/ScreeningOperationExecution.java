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
import com.fireblocks.sdk.model.ScreeningOperationExecutionOutput;
import com.fireblocks.sdk.model.ScreeningOperationFailure;
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ScreeningOperationExecution
 */
@JsonPropertyOrder({
  ScreeningOperationExecution.JSON_PROPERTY_OUTPUT,
  ScreeningOperationExecution.JSON_PROPERTY_STARTED_AT,
  ScreeningOperationExecution.JSON_PROPERTY_FINISHED_AT,
  ScreeningOperationExecution.JSON_PROPERTY_FAILURE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScreeningOperationExecution {
  public static final String JSON_PROPERTY_OUTPUT = "output";
  private ScreeningOperationExecutionOutput output;

  public static final String JSON_PROPERTY_STARTED_AT = "startedAt";
  private BigDecimal startedAt;

  public static final String JSON_PROPERTY_FINISHED_AT = "finishedAt";
  private BigDecimal finishedAt;

  public static final String JSON_PROPERTY_FAILURE = "failure";
  private ScreeningOperationFailure failure;

  public ScreeningOperationExecution() { 
  }

  public ScreeningOperationExecution output(ScreeningOperationExecutionOutput output) {
    this.output = output;
    return this;
  }

   /**
   * Get output
   * @return output
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScreeningOperationExecutionOutput getOutput() {
    return output;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutput(ScreeningOperationExecutionOutput output) {
    this.output = output;
  }


  public ScreeningOperationExecution startedAt(BigDecimal startedAt) {
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getStartedAt() {
    return startedAt;
  }


  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartedAt(BigDecimal startedAt) {
    this.startedAt = startedAt;
  }


  public ScreeningOperationExecution finishedAt(BigDecimal finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * Get finishedAt
   * @return finishedAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFinishedAt() {
    return finishedAt;
  }


  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinishedAt(BigDecimal finishedAt) {
    this.finishedAt = finishedAt;
  }


  public ScreeningOperationExecution failure(ScreeningOperationFailure failure) {
    this.failure = failure;
    return this;
  }

   /**
   * Get failure
   * @return failure
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScreeningOperationFailure getFailure() {
    return failure;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailure(ScreeningOperationFailure failure) {
    this.failure = failure;
  }


  /**
   * Return true if this ScreeningOperationExecution object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreeningOperationExecution screeningOperationExecution = (ScreeningOperationExecution) o;
    return Objects.equals(this.output, screeningOperationExecution.output) &&
        Objects.equals(this.startedAt, screeningOperationExecution.startedAt) &&
        Objects.equals(this.finishedAt, screeningOperationExecution.finishedAt) &&
        Objects.equals(this.failure, screeningOperationExecution.failure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(output, startedAt, finishedAt, failure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningOperationExecution {\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
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

    // add `output` to the URL query string
    if (getOutput() != null) {
      joiner.add(getOutput().toUrlQueryString(prefix + "output" + suffix));
    }

    // add `startedAt` to the URL query string
    if (getStartedAt() != null) {
      joiner.add(String.format("%sstartedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `finishedAt` to the URL query string
    if (getFinishedAt() != null) {
      joiner.add(String.format("%sfinishedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFinishedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `failure` to the URL query string
    if (getFailure() != null) {
      joiner.add(getFailure().toUrlQueryString(prefix + "failure" + suffix));
    }

    return joiner.toString();
  }
}

