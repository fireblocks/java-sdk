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
 * OneTimeAddressAccount
 */
@JsonPropertyOrder({
  OneTimeAddressAccount.JSON_PROPERTY_ONE_TIME_ADDRESS,
  OneTimeAddressAccount.JSON_PROPERTY_TAG
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OneTimeAddressAccount {
  public static final String JSON_PROPERTY_ONE_TIME_ADDRESS = "oneTimeAddress";
  private String oneTimeAddress;

  public static final String JSON_PROPERTY_TAG = "tag";
  private String tag;

  public OneTimeAddressAccount() { 
  }

  public OneTimeAddressAccount oneTimeAddress(String oneTimeAddress) {
    this.oneTimeAddress = oneTimeAddress;
    return this;
  }

   /**
   * Get oneTimeAddress
   * @return oneTimeAddress
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ONE_TIME_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOneTimeAddress() {
    return oneTimeAddress;
  }


  @JsonProperty(JSON_PROPERTY_ONE_TIME_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOneTimeAddress(String oneTimeAddress) {
    this.oneTimeAddress = oneTimeAddress;
  }


  public OneTimeAddressAccount tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTag() {
    return tag;
  }


  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTag(String tag) {
    this.tag = tag;
  }


  /**
   * Return true if this OneTimeAddressAccount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OneTimeAddressAccount oneTimeAddressAccount = (OneTimeAddressAccount) o;
    return Objects.equals(this.oneTimeAddress, oneTimeAddressAccount.oneTimeAddress) &&
        Objects.equals(this.tag, oneTimeAddressAccount.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oneTimeAddress, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneTimeAddressAccount {\n");
    sb.append("    oneTimeAddress: ").append(toIndentedString(oneTimeAddress)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

    // add `oneTimeAddress` to the URL query string
    if (getOneTimeAddress() != null) {
      joiner.add(String.format("%soneTimeAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOneTimeAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tag` to the URL query string
    if (getTag() != null) {
      joiner.add(String.format("%stag%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTag()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

