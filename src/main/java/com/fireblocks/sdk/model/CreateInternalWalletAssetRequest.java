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
 * CreateInternalWalletAssetRequest
 */
@JsonPropertyOrder({
  CreateInternalWalletAssetRequest.JSON_PROPERTY_ADDRESS,
  CreateInternalWalletAssetRequest.JSON_PROPERTY_TAG
})
@JsonTypeName("createInternalWalletAsset_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateInternalWalletAssetRequest {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_TAG = "tag";
  private String tag;

  public CreateInternalWalletAssetRequest() { 
  }

  public CreateInternalWalletAssetRequest address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The wallet&#39;s address or, for EOS wallets, the account name
   * @return address
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(String address) {
    this.address = address;
  }


  public CreateInternalWalletAssetRequest tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * for XRP wallets, the destination tag; for EOS, the memo; for the fiat providers (BLINC by BCB Group), the Bank Transfer Description
   * @return tag
  **/
  @javax.annotation.Nullable
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
   * Return true if this createInternalWalletAsset_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInternalWalletAssetRequest createInternalWalletAssetRequest = (CreateInternalWalletAssetRequest) o;
    return Objects.equals(this.address, createInternalWalletAssetRequest.address) &&
        Objects.equals(this.tag, createInternalWalletAssetRequest.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInternalWalletAssetRequest {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

}

