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
import org.openapitools.client.model.NetworkFee;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * EstimatedNetworkFeeResponse
 */
@JsonPropertyOrder({
  EstimatedNetworkFeeResponse.JSON_PROPERTY_LOW,
  EstimatedNetworkFeeResponse.JSON_PROPERTY_MEDIUM,
  EstimatedNetworkFeeResponse.JSON_PROPERTY_HIGH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EstimatedNetworkFeeResponse {
  public static final String JSON_PROPERTY_LOW = "low";
  private NetworkFee low;

  public static final String JSON_PROPERTY_MEDIUM = "medium";
  private NetworkFee medium;

  public static final String JSON_PROPERTY_HIGH = "high";
  private NetworkFee high;

  public EstimatedNetworkFeeResponse() {
  }

  public EstimatedNetworkFeeResponse low(NetworkFee low) {
    
    this.low = low;
    return this;
  }

   /**
   * Get low
   * @return low
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NetworkFee getLow() {
    return low;
  }


  @JsonProperty(JSON_PROPERTY_LOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLow(NetworkFee low) {
    this.low = low;
  }


  public EstimatedNetworkFeeResponse medium(NetworkFee medium) {
    
    this.medium = medium;
    return this;
  }

   /**
   * Get medium
   * @return medium
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NetworkFee getMedium() {
    return medium;
  }


  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMedium(NetworkFee medium) {
    this.medium = medium;
  }


  public EstimatedNetworkFeeResponse high(NetworkFee high) {
    
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HIGH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NetworkFee getHigh() {
    return high;
  }


  @JsonProperty(JSON_PROPERTY_HIGH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHigh(NetworkFee high) {
    this.high = high;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimatedNetworkFeeResponse estimatedNetworkFeeResponse = (EstimatedNetworkFeeResponse) o;
    return Objects.equals(this.low, estimatedNetworkFeeResponse.low) &&
        Objects.equals(this.medium, estimatedNetworkFeeResponse.medium) &&
        Objects.equals(this.high, estimatedNetworkFeeResponse.high);
  }

  @Override
  public int hashCode() {
    return Objects.hash(low, medium, high);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimatedNetworkFeeResponse {\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
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

    // add `low` to the URL query string
    if (getLow() != null) {
      joiner.add(getLow().toUrlQueryString(prefix + "low" + suffix));
    }

    // add `medium` to the URL query string
    if (getMedium() != null) {
      joiner.add(getMedium().toUrlQueryString(prefix + "medium" + suffix));
    }

    // add `high` to the URL query string
    if (getHigh() != null) {
      joiner.add(getHigh().toUrlQueryString(prefix + "high" + suffix));
    }

    return joiner.toString();
  }

}

