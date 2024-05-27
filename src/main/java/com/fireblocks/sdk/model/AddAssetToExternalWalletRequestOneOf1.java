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
import com.fireblocks.sdk.model.AddAssetToExternalWalletRequestOneOf1AdditionalInfo;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AddAssetToExternalWalletRequestOneOf1
 */
@JsonPropertyOrder({
  AddAssetToExternalWalletRequestOneOf1.JSON_PROPERTY_ADDITIONAL_INFO
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddAssetToExternalWalletRequestOneOf1 {
  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  private AddAssetToExternalWalletRequestOneOf1AdditionalInfo additionalInfo;

  public AddAssetToExternalWalletRequestOneOf1() { 
  }

  public AddAssetToExternalWalletRequestOneOf1 additionalInfo(AddAssetToExternalWalletRequestOneOf1AdditionalInfo additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AddAssetToExternalWalletRequestOneOf1AdditionalInfo getAdditionalInfo() {
    return additionalInfo;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAdditionalInfo(AddAssetToExternalWalletRequestOneOf1AdditionalInfo additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  /**
   * Return true if this AddAssetToExternalWalletRequest_oneOf_1 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddAssetToExternalWalletRequestOneOf1 addAssetToExternalWalletRequestOneOf1 = (AddAssetToExternalWalletRequestOneOf1) o;
    return Objects.equals(this.additionalInfo, addAssetToExternalWalletRequestOneOf1.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAssetToExternalWalletRequestOneOf1 {\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

    // add `additionalInfo` to the URL query string
    if (getAdditionalInfo() != null) {
      joiner.add(getAdditionalInfo().toUrlQueryString(prefix + "additionalInfo" + suffix));
    }

    return joiner.toString();
  }
}

