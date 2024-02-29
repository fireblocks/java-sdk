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
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ScreeningConfigurationsRequest
 */
@JsonPropertyOrder({
  ScreeningConfigurationsRequest.JSON_PROPERTY_BYPASS_SCREENING_DURING_SERVICE_OUTAGES,
  ScreeningConfigurationsRequest.JSON_PROPERTY_INBOUND_TRANSACTION_DELAY,
  ScreeningConfigurationsRequest.JSON_PROPERTY_OUTBOUND_TRANSACTION_DELAY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScreeningConfigurationsRequest {
  public static final String JSON_PROPERTY_BYPASS_SCREENING_DURING_SERVICE_OUTAGES = "bypassScreeningDuringServiceOutages";
  private Boolean bypassScreeningDuringServiceOutages;

  public static final String JSON_PROPERTY_INBOUND_TRANSACTION_DELAY = "inboundTransactionDelay";
  private BigDecimal inboundTransactionDelay;

  public static final String JSON_PROPERTY_OUTBOUND_TRANSACTION_DELAY = "outboundTransactionDelay";
  private BigDecimal outboundTransactionDelay;

  public ScreeningConfigurationsRequest() { 
  }

  public ScreeningConfigurationsRequest bypassScreeningDuringServiceOutages(Boolean bypassScreeningDuringServiceOutages) {
    this.bypassScreeningDuringServiceOutages = bypassScreeningDuringServiceOutages;
    return this;
  }

   /**
   * Flag to enable or disable bypass screening during service outages.
   * @return bypassScreeningDuringServiceOutages
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BYPASS_SCREENING_DURING_SERVICE_OUTAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBypassScreeningDuringServiceOutages() {
    return bypassScreeningDuringServiceOutages;
  }


  @JsonProperty(JSON_PROPERTY_BYPASS_SCREENING_DURING_SERVICE_OUTAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBypassScreeningDuringServiceOutages(Boolean bypassScreeningDuringServiceOutages) {
    this.bypassScreeningDuringServiceOutages = bypassScreeningDuringServiceOutages;
  }


  public ScreeningConfigurationsRequest inboundTransactionDelay(BigDecimal inboundTransactionDelay) {
    this.inboundTransactionDelay = inboundTransactionDelay;
    return this;
  }

   /**
   * Inbound transaction delay in seconds.
   * @return inboundTransactionDelay
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INBOUND_TRANSACTION_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getInboundTransactionDelay() {
    return inboundTransactionDelay;
  }


  @JsonProperty(JSON_PROPERTY_INBOUND_TRANSACTION_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInboundTransactionDelay(BigDecimal inboundTransactionDelay) {
    this.inboundTransactionDelay = inboundTransactionDelay;
  }


  public ScreeningConfigurationsRequest outboundTransactionDelay(BigDecimal outboundTransactionDelay) {
    this.outboundTransactionDelay = outboundTransactionDelay;
    return this;
  }

   /**
   * Outbound transaction delay in seconds.
   * @return outboundTransactionDelay
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTBOUND_TRANSACTION_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOutboundTransactionDelay() {
    return outboundTransactionDelay;
  }


  @JsonProperty(JSON_PROPERTY_OUTBOUND_TRANSACTION_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutboundTransactionDelay(BigDecimal outboundTransactionDelay) {
    this.outboundTransactionDelay = outboundTransactionDelay;
  }


  /**
   * Return true if this ScreeningConfigurationsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreeningConfigurationsRequest screeningConfigurationsRequest = (ScreeningConfigurationsRequest) o;
    return Objects.equals(this.bypassScreeningDuringServiceOutages, screeningConfigurationsRequest.bypassScreeningDuringServiceOutages) &&
        Objects.equals(this.inboundTransactionDelay, screeningConfigurationsRequest.inboundTransactionDelay) &&
        Objects.equals(this.outboundTransactionDelay, screeningConfigurationsRequest.outboundTransactionDelay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bypassScreeningDuringServiceOutages, inboundTransactionDelay, outboundTransactionDelay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningConfigurationsRequest {\n");
    sb.append("    bypassScreeningDuringServiceOutages: ").append(toIndentedString(bypassScreeningDuringServiceOutages)).append("\n");
    sb.append("    inboundTransactionDelay: ").append(toIndentedString(inboundTransactionDelay)).append("\n");
    sb.append("    outboundTransactionDelay: ").append(toIndentedString(outboundTransactionDelay)).append("\n");
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

    // add `bypassScreeningDuringServiceOutages` to the URL query string
    if (getBypassScreeningDuringServiceOutages() != null) {
      joiner.add(String.format("%sbypassScreeningDuringServiceOutages%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBypassScreeningDuringServiceOutages()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `inboundTransactionDelay` to the URL query string
    if (getInboundTransactionDelay() != null) {
      joiner.add(String.format("%sinboundTransactionDelay%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInboundTransactionDelay()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `outboundTransactionDelay` to the URL query string
    if (getOutboundTransactionDelay() != null) {
      joiner.add(String.format("%soutboundTransactionDelay%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOutboundTransactionDelay()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
