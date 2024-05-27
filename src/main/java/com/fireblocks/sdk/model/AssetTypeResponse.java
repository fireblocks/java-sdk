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
 * AssetTypeResponse
 */
@JsonPropertyOrder({
  AssetTypeResponse.JSON_PROPERTY_ID,
  AssetTypeResponse.JSON_PROPERTY_NAME,
  AssetTypeResponse.JSON_PROPERTY_TYPE,
  AssetTypeResponse.JSON_PROPERTY_CONTRACT_ADDRESS,
  AssetTypeResponse.JSON_PROPERTY_NATIVE_ASSET,
  AssetTypeResponse.JSON_PROPERTY_DECIMALS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssetTypeResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_CONTRACT_ADDRESS = "contractAddress";
  private String contractAddress;

  public static final String JSON_PROPERTY_NATIVE_ASSET = "nativeAsset";
  private String nativeAsset;

  public static final String JSON_PROPERTY_DECIMALS = "decimals";
  private BigDecimal decimals;

  public AssetTypeResponse() { 
  }

  public AssetTypeResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public AssetTypeResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public AssetTypeResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public AssetTypeResponse contractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Get contractAddress
   * @return contractAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTRACT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContractAddress() {
    return contractAddress;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }


  public AssetTypeResponse nativeAsset(String nativeAsset) {
    this.nativeAsset = nativeAsset;
    return this;
  }

   /**
   * Get nativeAsset
   * @return nativeAsset
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NATIVE_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNativeAsset() {
    return nativeAsset;
  }


  @JsonProperty(JSON_PROPERTY_NATIVE_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNativeAsset(String nativeAsset) {
    this.nativeAsset = nativeAsset;
  }


  public AssetTypeResponse decimals(BigDecimal decimals) {
    this.decimals = decimals;
    return this;
  }

   /**
   * Get decimals
   * @return decimals
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECIMALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDecimals() {
    return decimals;
  }


  @JsonProperty(JSON_PROPERTY_DECIMALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDecimals(BigDecimal decimals) {
    this.decimals = decimals;
  }


  /**
   * Return true if this AssetTypeResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetTypeResponse assetTypeResponse = (AssetTypeResponse) o;
    return Objects.equals(this.id, assetTypeResponse.id) &&
        Objects.equals(this.name, assetTypeResponse.name) &&
        Objects.equals(this.type, assetTypeResponse.type) &&
        Objects.equals(this.contractAddress, assetTypeResponse.contractAddress) &&
        Objects.equals(this.nativeAsset, assetTypeResponse.nativeAsset) &&
        Objects.equals(this.decimals, assetTypeResponse.decimals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, contractAddress, nativeAsset, decimals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetTypeResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    nativeAsset: ").append(toIndentedString(nativeAsset)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `contractAddress` to the URL query string
    if (getContractAddress() != null) {
      joiner.add(String.format("%scontractAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContractAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `nativeAsset` to the URL query string
    if (getNativeAsset() != null) {
      joiner.add(String.format("%snativeAsset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNativeAsset()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `decimals` to the URL query string
    if (getDecimals() != null) {
      joiner.add(String.format("%sdecimals%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDecimals()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

