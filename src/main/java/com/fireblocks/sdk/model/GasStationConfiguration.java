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
 * GasStationConfiguration
 */
@JsonPropertyOrder({
  GasStationConfiguration.JSON_PROPERTY_GAS_THRESHOLD,
  GasStationConfiguration.JSON_PROPERTY_GAS_CAP,
  GasStationConfiguration.JSON_PROPERTY_MAX_GAS_PRICE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GasStationConfiguration {
  public static final String JSON_PROPERTY_GAS_THRESHOLD = "gasThreshold";
  private String gasThreshold;

  public static final String JSON_PROPERTY_GAS_CAP = "gasCap";
  private String gasCap;

  public static final String JSON_PROPERTY_MAX_GAS_PRICE = "maxGasPrice";
  private String maxGasPrice;

  public GasStationConfiguration() { 
  }

  public GasStationConfiguration gasThreshold(String gasThreshold) {
    this.gasThreshold = gasThreshold;
    return this;
  }

   /**
   * Get gasThreshold
   * @return gasThreshold
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GAS_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGasThreshold() {
    return gasThreshold;
  }


  @JsonProperty(JSON_PROPERTY_GAS_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGasThreshold(String gasThreshold) {
    this.gasThreshold = gasThreshold;
  }


  public GasStationConfiguration gasCap(String gasCap) {
    this.gasCap = gasCap;
    return this;
  }

   /**
   * Get gasCap
   * @return gasCap
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GAS_CAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGasCap() {
    return gasCap;
  }


  @JsonProperty(JSON_PROPERTY_GAS_CAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGasCap(String gasCap) {
    this.gasCap = gasCap;
  }


  public GasStationConfiguration maxGasPrice(String maxGasPrice) {
    this.maxGasPrice = maxGasPrice;
    return this;
  }

   /**
   * Get maxGasPrice
   * @return maxGasPrice
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_GAS_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaxGasPrice() {
    return maxGasPrice;
  }


  @JsonProperty(JSON_PROPERTY_MAX_GAS_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxGasPrice(String maxGasPrice) {
    this.maxGasPrice = maxGasPrice;
  }


  /**
   * Return true if this GasStationConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GasStationConfiguration gasStationConfiguration = (GasStationConfiguration) o;
    return Objects.equals(this.gasThreshold, gasStationConfiguration.gasThreshold) &&
        Objects.equals(this.gasCap, gasStationConfiguration.gasCap) &&
        Objects.equals(this.maxGasPrice, gasStationConfiguration.maxGasPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gasThreshold, gasCap, maxGasPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GasStationConfiguration {\n");
    sb.append("    gasThreshold: ").append(toIndentedString(gasThreshold)).append("\n");
    sb.append("    gasCap: ").append(toIndentedString(gasCap)).append("\n");
    sb.append("    maxGasPrice: ").append(toIndentedString(maxGasPrice)).append("\n");
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

