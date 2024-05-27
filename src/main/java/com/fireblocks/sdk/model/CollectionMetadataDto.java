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
 * CollectionMetadataDto
 */
@JsonPropertyOrder({
  CollectionMetadataDto.JSON_PROPERTY_FB_COLLECTION_ID,
  CollectionMetadataDto.JSON_PROPERTY_NAME,
  CollectionMetadataDto.JSON_PROPERTY_SYMBOL,
  CollectionMetadataDto.JSON_PROPERTY_STANDARD,
  CollectionMetadataDto.JSON_PROPERTY_BLOCKCHAIN_DESCRIPTOR,
  CollectionMetadataDto.JSON_PROPERTY_CONTRACT_ADDRESS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CollectionMetadataDto {
  public static final String JSON_PROPERTY_FB_COLLECTION_ID = "fbCollectionId";
  private String fbCollectionId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_STANDARD = "standard";
  private String standard;

  public static final String JSON_PROPERTY_BLOCKCHAIN_DESCRIPTOR = "blockchainDescriptor";
  private String blockchainDescriptor;

  public static final String JSON_PROPERTY_CONTRACT_ADDRESS = "contractAddress";
  private String contractAddress;

  public CollectionMetadataDto() { 
  }

  public CollectionMetadataDto fbCollectionId(String fbCollectionId) {
    this.fbCollectionId = fbCollectionId;
    return this;
  }

   /**
   * Fireblocks collection id
   * @return fbCollectionId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FB_COLLECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFbCollectionId() {
    return fbCollectionId;
  }


  @JsonProperty(JSON_PROPERTY_FB_COLLECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFbCollectionId(String fbCollectionId) {
    this.fbCollectionId = fbCollectionId;
  }


  public CollectionMetadataDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Collection name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public CollectionMetadataDto symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Collection symbol
   * @return symbol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public CollectionMetadataDto standard(String standard) {
    this.standard = standard;
    return this;
  }

   /**
   * Collection contract standard
   * @return standard
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStandard() {
    return standard;
  }


  @JsonProperty(JSON_PROPERTY_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStandard(String standard) {
    this.standard = standard;
  }


  public CollectionMetadataDto blockchainDescriptor(String blockchainDescriptor) {
    this.blockchainDescriptor = blockchainDescriptor;
    return this;
  }

   /**
   * Collection&#39;s blockchain
   * @return blockchainDescriptor
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BLOCKCHAIN_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBlockchainDescriptor() {
    return blockchainDescriptor;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKCHAIN_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBlockchainDescriptor(String blockchainDescriptor) {
    this.blockchainDescriptor = blockchainDescriptor;
  }


  public CollectionMetadataDto contractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Collection contract address
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


  /**
   * Return true if this CollectionMetadataDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionMetadataDto collectionMetadataDto = (CollectionMetadataDto) o;
    return Objects.equals(this.fbCollectionId, collectionMetadataDto.fbCollectionId) &&
        Objects.equals(this.name, collectionMetadataDto.name) &&
        Objects.equals(this.symbol, collectionMetadataDto.symbol) &&
        Objects.equals(this.standard, collectionMetadataDto.standard) &&
        Objects.equals(this.blockchainDescriptor, collectionMetadataDto.blockchainDescriptor) &&
        Objects.equals(this.contractAddress, collectionMetadataDto.contractAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fbCollectionId, name, symbol, standard, blockchainDescriptor, contractAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionMetadataDto {\n");
    sb.append("    fbCollectionId: ").append(toIndentedString(fbCollectionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    blockchainDescriptor: ").append(toIndentedString(blockchainDescriptor)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
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

    // add `fbCollectionId` to the URL query string
    if (getFbCollectionId() != null) {
      joiner.add(String.format("%sfbCollectionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFbCollectionId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `symbol` to the URL query string
    if (getSymbol() != null) {
      joiner.add(String.format("%ssymbol%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSymbol()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `standard` to the URL query string
    if (getStandard() != null) {
      joiner.add(String.format("%sstandard%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStandard()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `blockchainDescriptor` to the URL query string
    if (getBlockchainDescriptor() != null) {
      joiner.add(String.format("%sblockchainDescriptor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBlockchainDescriptor()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `contractAddress` to the URL query string
    if (getContractAddress() != null) {
      joiner.add(String.format("%scontractAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContractAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

