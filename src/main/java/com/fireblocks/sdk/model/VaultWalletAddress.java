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
 * VaultWalletAddress
 */
@JsonPropertyOrder({
  VaultWalletAddress.JSON_PROPERTY_ASSET_ID,
  VaultWalletAddress.JSON_PROPERTY_ADDRESS,
  VaultWalletAddress.JSON_PROPERTY_DESCRIPTION,
  VaultWalletAddress.JSON_PROPERTY_TAG,
  VaultWalletAddress.JSON_PROPERTY_TYPE,
  VaultWalletAddress.JSON_PROPERTY_CUSTOMER_REF_ID,
  VaultWalletAddress.JSON_PROPERTY_ADDRESS_FORMAT,
  VaultWalletAddress.JSON_PROPERTY_LEGACY_ADDRESS,
  VaultWalletAddress.JSON_PROPERTY_ENTERPRISE_ADDRESS,
  VaultWalletAddress.JSON_PROPERTY_BIP44_ADDRESS_INDEX,
  VaultWalletAddress.JSON_PROPERTY_USER_DEFINED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VaultWalletAddress {
  public static final String JSON_PROPERTY_ASSET_ID = "assetId";
  private String assetId;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TAG = "tag";
  private String tag;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_CUSTOMER_REF_ID = "customerRefId";
  private String customerRefId;

  /**
   * Gets or Sets addressFormat
   */
  public enum AddressFormatEnum {
    SEGWIT("SEGWIT"),
    
    LEGACY("LEGACY");

    private String value;

    AddressFormatEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AddressFormatEnum fromValue(String value) {
      for (AddressFormatEnum b : AddressFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ADDRESS_FORMAT = "addressFormat";
  private AddressFormatEnum addressFormat;

  public static final String JSON_PROPERTY_LEGACY_ADDRESS = "legacyAddress";
  private String legacyAddress;

  public static final String JSON_PROPERTY_ENTERPRISE_ADDRESS = "enterpriseAddress";
  private String enterpriseAddress;

  public static final String JSON_PROPERTY_BIP44_ADDRESS_INDEX = "bip44AddressIndex";
  private Integer bip44AddressIndex;

  public static final String JSON_PROPERTY_USER_DEFINED = "userDefined";
  private Boolean userDefined;

  public VaultWalletAddress() { 
  }

  public VaultWalletAddress assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssetId() {
    return assetId;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public VaultWalletAddress address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(String address) {
    this.address = address;
  }


  public VaultWalletAddress description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public VaultWalletAddress tag(String tag) {
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


  public VaultWalletAddress type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public VaultWalletAddress customerRefId(String customerRefId) {
    this.customerRefId = customerRefId;
    return this;
  }

   /**
   * Get customerRefId
   * @return customerRefId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_REF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerRefId() {
    return customerRefId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_REF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerRefId(String customerRefId) {
    this.customerRefId = customerRefId;
  }


  public VaultWalletAddress addressFormat(AddressFormatEnum addressFormat) {
    this.addressFormat = addressFormat;
    return this;
  }

   /**
   * Get addressFormat
   * @return addressFormat
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddressFormatEnum getAddressFormat() {
    return addressFormat;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressFormat(AddressFormatEnum addressFormat) {
    this.addressFormat = addressFormat;
  }


  public VaultWalletAddress legacyAddress(String legacyAddress) {
    this.legacyAddress = legacyAddress;
    return this;
  }

   /**
   * Get legacyAddress
   * @return legacyAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGACY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLegacyAddress() {
    return legacyAddress;
  }


  @JsonProperty(JSON_PROPERTY_LEGACY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegacyAddress(String legacyAddress) {
    this.legacyAddress = legacyAddress;
  }


  public VaultWalletAddress enterpriseAddress(String enterpriseAddress) {
    this.enterpriseAddress = enterpriseAddress;
    return this;
  }

   /**
   * Get enterpriseAddress
   * @return enterpriseAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnterpriseAddress() {
    return enterpriseAddress;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseAddress(String enterpriseAddress) {
    this.enterpriseAddress = enterpriseAddress;
  }


  public VaultWalletAddress bip44AddressIndex(Integer bip44AddressIndex) {
    this.bip44AddressIndex = bip44AddressIndex;
    return this;
  }

   /**
   * Get bip44AddressIndex
   * @return bip44AddressIndex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIP44_ADDRESS_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBip44AddressIndex() {
    return bip44AddressIndex;
  }


  @JsonProperty(JSON_PROPERTY_BIP44_ADDRESS_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBip44AddressIndex(Integer bip44AddressIndex) {
    this.bip44AddressIndex = bip44AddressIndex;
  }


  public VaultWalletAddress userDefined(Boolean userDefined) {
    this.userDefined = userDefined;
    return this;
  }

   /**
   * Get userDefined
   * @return userDefined
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_DEFINED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUserDefined() {
    return userDefined;
  }


  @JsonProperty(JSON_PROPERTY_USER_DEFINED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserDefined(Boolean userDefined) {
    this.userDefined = userDefined;
  }


  /**
   * Return true if this VaultWalletAddress object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VaultWalletAddress vaultWalletAddress = (VaultWalletAddress) o;
    return Objects.equals(this.assetId, vaultWalletAddress.assetId) &&
        Objects.equals(this.address, vaultWalletAddress.address) &&
        Objects.equals(this.description, vaultWalletAddress.description) &&
        Objects.equals(this.tag, vaultWalletAddress.tag) &&
        Objects.equals(this.type, vaultWalletAddress.type) &&
        Objects.equals(this.customerRefId, vaultWalletAddress.customerRefId) &&
        Objects.equals(this.addressFormat, vaultWalletAddress.addressFormat) &&
        Objects.equals(this.legacyAddress, vaultWalletAddress.legacyAddress) &&
        Objects.equals(this.enterpriseAddress, vaultWalletAddress.enterpriseAddress) &&
        Objects.equals(this.bip44AddressIndex, vaultWalletAddress.bip44AddressIndex) &&
        Objects.equals(this.userDefined, vaultWalletAddress.userDefined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, address, description, tag, type, customerRefId, addressFormat, legacyAddress, enterpriseAddress, bip44AddressIndex, userDefined);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VaultWalletAddress {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    customerRefId: ").append(toIndentedString(customerRefId)).append("\n");
    sb.append("    addressFormat: ").append(toIndentedString(addressFormat)).append("\n");
    sb.append("    legacyAddress: ").append(toIndentedString(legacyAddress)).append("\n");
    sb.append("    enterpriseAddress: ").append(toIndentedString(enterpriseAddress)).append("\n");
    sb.append("    bip44AddressIndex: ").append(toIndentedString(bip44AddressIndex)).append("\n");
    sb.append("    userDefined: ").append(toIndentedString(userDefined)).append("\n");
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

    // add `assetId` to the URL query string
    if (getAssetId() != null) {
      joiner.add(String.format("%sassetId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAssetId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(String.format("%saddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tag` to the URL query string
    if (getTag() != null) {
      joiner.add(String.format("%stag%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTag()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `customerRefId` to the URL query string
    if (getCustomerRefId() != null) {
      joiner.add(String.format("%scustomerRefId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerRefId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `addressFormat` to the URL query string
    if (getAddressFormat() != null) {
      joiner.add(String.format("%saddressFormat%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddressFormat()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `legacyAddress` to the URL query string
    if (getLegacyAddress() != null) {
      joiner.add(String.format("%slegacyAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLegacyAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `enterpriseAddress` to the URL query string
    if (getEnterpriseAddress() != null) {
      joiner.add(String.format("%senterpriseAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnterpriseAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `bip44AddressIndex` to the URL query string
    if (getBip44AddressIndex() != null) {
      joiner.add(String.format("%sbip44AddressIndex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBip44AddressIndex()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `userDefined` to the URL query string
    if (getUserDefined() != null) {
      joiner.add(String.format("%suserDefined%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserDefined()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

