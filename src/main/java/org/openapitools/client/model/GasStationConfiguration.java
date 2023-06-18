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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

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

    // add `gasThreshold` to the URL query string
    if (getGasThreshold() != null) {
      try {
        joiner.add(String.format("%sgasThreshold%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGasThreshold()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `gasCap` to the URL query string
    if (getGasCap() != null) {
      try {
        joiner.add(String.format("%sgasCap%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGasCap()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `maxGasPrice` to the URL query string
    if (getMaxGasPrice() != null) {
      try {
        joiner.add(String.format("%smaxGasPrice%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxGasPrice()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

