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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetWhitelistIpAddressesResponse
 */
@JsonPropertyOrder({
  GetWhitelistIpAddressesResponse.JSON_PROPERTY_USER_ID,
  GetWhitelistIpAddressesResponse.JSON_PROPERTY_WHITELISTED_IPS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetWhitelistIpAddressesResponse {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;

  public static final String JSON_PROPERTY_WHITELISTED_IPS = "whitelistedIps";
  private List<String> whitelistedIps;

  public GetWhitelistIpAddressesResponse() { 
  }

  public GetWhitelistIpAddressesResponse userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the user
   * @return userId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public GetWhitelistIpAddressesResponse whitelistedIps(List<String> whitelistedIps) {
    this.whitelistedIps = whitelistedIps;
    return this;
  }

  public GetWhitelistIpAddressesResponse addWhitelistedIpsItem(String whitelistedIpsItem) {
    if (this.whitelistedIps == null) {
      this.whitelistedIps = new ArrayList<>();
    }
    this.whitelistedIps.add(whitelistedIpsItem);
    return this;
  }

   /**
   * List of whitelisted ip addresses
   * @return whitelistedIps
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WHITELISTED_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getWhitelistedIps() {
    return whitelistedIps;
  }


  @JsonProperty(JSON_PROPERTY_WHITELISTED_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhitelistedIps(List<String> whitelistedIps) {
    this.whitelistedIps = whitelistedIps;
  }


  /**
   * Return true if this GetWhitelistIpAddressesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWhitelistIpAddressesResponse getWhitelistIpAddressesResponse = (GetWhitelistIpAddressesResponse) o;
    return Objects.equals(this.userId, getWhitelistIpAddressesResponse.userId) &&
        Objects.equals(this.whitelistedIps, getWhitelistIpAddressesResponse.whitelistedIps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, whitelistedIps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWhitelistIpAddressesResponse {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    whitelistedIps: ").append(toIndentedString(whitelistedIps)).append("\n");
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

    // add `userId` to the URL query string
    if (getUserId() != null) {
      joiner.add(String.format("%suserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `whitelistedIps` to the URL query string
    if (getWhitelistedIps() != null) {
      for (int i = 0; i < getWhitelistedIps().size(); i++) {
        joiner.add(String.format("%swhitelistedIps%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getWhitelistedIps().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

