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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NetworkFee
 */
@JsonPropertyOrder({
  NetworkFee.JSON_PROPERTY_FEE_PER_BYTE,
  NetworkFee.JSON_PROPERTY_GAS_PRICE,
  NetworkFee.JSON_PROPERTY_NETWORK_FEE,
  NetworkFee.JSON_PROPERTY_BASE_FEE,
  NetworkFee.JSON_PROPERTY_PRIORITY_FEE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetworkFee {
  public static final String JSON_PROPERTY_FEE_PER_BYTE = "feePerByte";
  private String feePerByte;

  public static final String JSON_PROPERTY_GAS_PRICE = "gasPrice";
  private String gasPrice;

  public static final String JSON_PROPERTY_NETWORK_FEE = "networkFee";
  private String networkFee;

  public static final String JSON_PROPERTY_BASE_FEE = "baseFee";
  private String baseFee;

  public static final String JSON_PROPERTY_PRIORITY_FEE = "priorityFee";
  private String priorityFee;

  public NetworkFee() { 
  }

  public NetworkFee feePerByte(String feePerByte) {
    this.feePerByte = feePerByte;
    return this;
  }

   /**
   * Get feePerByte
   * @return feePerByte
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEE_PER_BYTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFeePerByte() {
    return feePerByte;
  }


  @JsonProperty(JSON_PROPERTY_FEE_PER_BYTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeePerByte(String feePerByte) {
    this.feePerByte = feePerByte;
  }


  public NetworkFee gasPrice(String gasPrice) {
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * Get gasPrice
   * @return gasPrice
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GAS_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGasPrice() {
    return gasPrice;
  }


  @JsonProperty(JSON_PROPERTY_GAS_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGasPrice(String gasPrice) {
    this.gasPrice = gasPrice;
  }


  public NetworkFee networkFee(String networkFee) {
    this.networkFee = networkFee;
    return this;
  }

   /**
   * Get networkFee
   * @return networkFee
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetworkFee() {
    return networkFee;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkFee(String networkFee) {
    this.networkFee = networkFee;
  }


  public NetworkFee baseFee(String baseFee) {
    this.baseFee = baseFee;
    return this;
  }

   /**
   * (optional) Base Fee according to EIP-1559 (ETH assets)
   * @return baseFee
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BASE_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBaseFee() {
    return baseFee;
  }


  @JsonProperty(JSON_PROPERTY_BASE_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaseFee(String baseFee) {
    this.baseFee = baseFee;
  }


  public NetworkFee priorityFee(String priorityFee) {
    this.priorityFee = priorityFee;
    return this;
  }

   /**
   * (optional) Priority Fee according to EIP-1559 (ETH assets)
   * @return priorityFee
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPriorityFee() {
    return priorityFee;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriorityFee(String priorityFee) {
    this.priorityFee = priorityFee;
  }


  /**
   * Return true if this NetworkFee object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkFee networkFee = (NetworkFee) o;
    return Objects.equals(this.feePerByte, networkFee.feePerByte) &&
        Objects.equals(this.gasPrice, networkFee.gasPrice) &&
        Objects.equals(this.networkFee, networkFee.networkFee) &&
        Objects.equals(this.baseFee, networkFee.baseFee) &&
        Objects.equals(this.priorityFee, networkFee.priorityFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feePerByte, gasPrice, networkFee, baseFee, priorityFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkFee {\n");
    sb.append("    feePerByte: ").append(toIndentedString(feePerByte)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    networkFee: ").append(toIndentedString(networkFee)).append("\n");
    sb.append("    baseFee: ").append(toIndentedString(baseFee)).append("\n");
    sb.append("    priorityFee: ").append(toIndentedString(priorityFee)).append("\n");
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

    // add `feePerByte` to the URL query string
    if (getFeePerByte() != null) {
      joiner.add(String.format("%sfeePerByte%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFeePerByte()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `gasPrice` to the URL query string
    if (getGasPrice() != null) {
      joiner.add(String.format("%sgasPrice%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGasPrice()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `networkFee` to the URL query string
    if (getNetworkFee() != null) {
      joiner.add(String.format("%snetworkFee%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNetworkFee()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `baseFee` to the URL query string
    if (getBaseFee() != null) {
      joiner.add(String.format("%sbaseFee%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBaseFee()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `priorityFee` to the URL query string
    if (getPriorityFee() != null) {
      joiner.add(String.format("%spriorityFee%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPriorityFee()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

