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
import com.fireblocks.sdk.model.MediaEntityResponse;
import com.fireblocks.sdk.model.TokenResponseCollection;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * TokenOwnershipResponse
 */
@JsonPropertyOrder({
  TokenOwnershipResponse.JSON_PROPERTY_ID,
  TokenOwnershipResponse.JSON_PROPERTY_TOKEN_ID,
  TokenOwnershipResponse.JSON_PROPERTY_STANDARD,
  TokenOwnershipResponse.JSON_PROPERTY_METADATA_U_R_I,
  TokenOwnershipResponse.JSON_PROPERTY_CACHED_METADATA_U_R_I,
  TokenOwnershipResponse.JSON_PROPERTY_MEDIA,
  TokenOwnershipResponse.JSON_PROPERTY_COLLECTION,
  TokenOwnershipResponse.JSON_PROPERTY_BALANCE,
  TokenOwnershipResponse.JSON_PROPERTY_VAULT_ACCOUNT_ID,
  TokenOwnershipResponse.JSON_PROPERTY_OWNERSHIP_START_TIME,
  TokenOwnershipResponse.JSON_PROPERTY_OWNERSHIP_LAST_UPDATE_TIME,
  TokenOwnershipResponse.JSON_PROPERTY_BLOCKCHAIN_DESCRIPTOR,
  TokenOwnershipResponse.JSON_PROPERTY_DESCRIPTION,
  TokenOwnershipResponse.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TokenOwnershipResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TOKEN_ID = "tokenId";
  private String tokenId;

  public static final String JSON_PROPERTY_STANDARD = "standard";
  private String standard;

  public static final String JSON_PROPERTY_METADATA_U_R_I = "metadataURI";
  private String metadataURI;

  public static final String JSON_PROPERTY_CACHED_METADATA_U_R_I = "cachedMetadataURI";
  private String cachedMetadataURI;

  public static final String JSON_PROPERTY_MEDIA = "media";
  private List<MediaEntityResponse> media = new ArrayList<>();

  public static final String JSON_PROPERTY_COLLECTION = "collection";
  private TokenResponseCollection collection;

  public static final String JSON_PROPERTY_BALANCE = "balance";
  private String balance;

  public static final String JSON_PROPERTY_VAULT_ACCOUNT_ID = "vaultAccountId";
  private String vaultAccountId;

  public static final String JSON_PROPERTY_OWNERSHIP_START_TIME = "ownershipStartTime";
  private BigDecimal ownershipStartTime;

  public static final String JSON_PROPERTY_OWNERSHIP_LAST_UPDATE_TIME = "ownershipLastUpdateTime";
  private BigDecimal ownershipLastUpdateTime;

  /**
   * Gets or Sets blockchainDescriptor
   */
  public enum BlockchainDescriptorEnum {
    ETH("ETH"),
    
    ETH_TEST3("ETH_TEST3"),
    
    POLYGON("POLYGON"),
    
    POLYGON_TEST_MUMBAI("POLYGON_TEST_MUMBAI");

    private String value;

    BlockchainDescriptorEnum(String value) {
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
    public static BlockchainDescriptorEnum fromValue(String value) {
      for (BlockchainDescriptorEnum b : BlockchainDescriptorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BLOCKCHAIN_DESCRIPTOR = "blockchainDescriptor";
  private BlockchainDescriptorEnum blockchainDescriptor;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public TokenOwnershipResponse() { 
  }

  public TokenOwnershipResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Fireblocks NFT asset id
   * @return id
  **/
  @javax.annotation.Nonnull
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


  public TokenOwnershipResponse tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Token id within the contract/collection
   * @return tokenId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOKEN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTokenId() {
    return tokenId;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public TokenOwnershipResponse standard(String standard) {
    this.standard = standard;
    return this;
  }

   /**
   * ERC721 / ERC1155
   * @return standard
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STANDARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStandard() {
    return standard;
  }


  @JsonProperty(JSON_PROPERTY_STANDARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStandard(String standard) {
    this.standard = standard;
  }


  public TokenOwnershipResponse metadataURI(String metadataURI) {
    this.metadataURI = metadataURI;
    return this;
  }

   /**
   * URL of the original token JSON metadata
   * @return metadataURI
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA_U_R_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMetadataURI() {
    return metadataURI;
  }


  @JsonProperty(JSON_PROPERTY_METADATA_U_R_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadataURI(String metadataURI) {
    this.metadataURI = metadataURI;
  }


  public TokenOwnershipResponse cachedMetadataURI(String cachedMetadataURI) {
    this.cachedMetadataURI = cachedMetadataURI;
    return this;
  }

   /**
   * URL of the cached token JSON metadata
   * @return cachedMetadataURI
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CACHED_METADATA_U_R_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCachedMetadataURI() {
    return cachedMetadataURI;
  }


  @JsonProperty(JSON_PROPERTY_CACHED_METADATA_U_R_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCachedMetadataURI(String cachedMetadataURI) {
    this.cachedMetadataURI = cachedMetadataURI;
  }


  public TokenOwnershipResponse media(List<MediaEntityResponse> media) {
    this.media = media;
    return this;
  }

  public TokenOwnershipResponse addMediaItem(MediaEntityResponse mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<>();
    }
    this.media.add(mediaItem);
    return this;
  }

   /**
   * Media items extracted from metadata JSON
   * @return media
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MEDIA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<MediaEntityResponse> getMedia() {
    return media;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMedia(List<MediaEntityResponse> media) {
    this.media = media;
  }


  public TokenOwnershipResponse collection(TokenResponseCollection collection) {
    this.collection = collection;
    return this;
  }

   /**
   * Get collection
   * @return collection
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLLECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TokenResponseCollection getCollection() {
    return collection;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollection(TokenResponseCollection collection) {
    this.collection = collection;
  }


  public TokenOwnershipResponse balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBalance() {
    return balance;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalance(String balance) {
    this.balance = balance;
  }


  public TokenOwnershipResponse vaultAccountId(String vaultAccountId) {
    this.vaultAccountId = vaultAccountId;
    return this;
  }

   /**
   * Get vaultAccountId
   * @return vaultAccountId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VAULT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVaultAccountId() {
    return vaultAccountId;
  }


  @JsonProperty(JSON_PROPERTY_VAULT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVaultAccountId(String vaultAccountId) {
    this.vaultAccountId = vaultAccountId;
  }


  public TokenOwnershipResponse ownershipStartTime(BigDecimal ownershipStartTime) {
    this.ownershipStartTime = ownershipStartTime;
    return this;
  }

   /**
   * Get ownershipStartTime
   * @return ownershipStartTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OWNERSHIP_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getOwnershipStartTime() {
    return ownershipStartTime;
  }


  @JsonProperty(JSON_PROPERTY_OWNERSHIP_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOwnershipStartTime(BigDecimal ownershipStartTime) {
    this.ownershipStartTime = ownershipStartTime;
  }


  public TokenOwnershipResponse ownershipLastUpdateTime(BigDecimal ownershipLastUpdateTime) {
    this.ownershipLastUpdateTime = ownershipLastUpdateTime;
    return this;
  }

   /**
   * Get ownershipLastUpdateTime
   * @return ownershipLastUpdateTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OWNERSHIP_LAST_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getOwnershipLastUpdateTime() {
    return ownershipLastUpdateTime;
  }


  @JsonProperty(JSON_PROPERTY_OWNERSHIP_LAST_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOwnershipLastUpdateTime(BigDecimal ownershipLastUpdateTime) {
    this.ownershipLastUpdateTime = ownershipLastUpdateTime;
  }


  public TokenOwnershipResponse blockchainDescriptor(BlockchainDescriptorEnum blockchainDescriptor) {
    this.blockchainDescriptor = blockchainDescriptor;
    return this;
  }

   /**
   * Get blockchainDescriptor
   * @return blockchainDescriptor
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BLOCKCHAIN_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BlockchainDescriptorEnum getBlockchainDescriptor() {
    return blockchainDescriptor;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKCHAIN_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBlockchainDescriptor(BlockchainDescriptorEnum blockchainDescriptor) {
    this.blockchainDescriptor = blockchainDescriptor;
  }


  public TokenOwnershipResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public TokenOwnershipResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
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


  /**
   * Return true if this TokenOwnershipResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenOwnershipResponse tokenOwnershipResponse = (TokenOwnershipResponse) o;
    return Objects.equals(this.id, tokenOwnershipResponse.id) &&
        Objects.equals(this.tokenId, tokenOwnershipResponse.tokenId) &&
        Objects.equals(this.standard, tokenOwnershipResponse.standard) &&
        Objects.equals(this.metadataURI, tokenOwnershipResponse.metadataURI) &&
        Objects.equals(this.cachedMetadataURI, tokenOwnershipResponse.cachedMetadataURI) &&
        Objects.equals(this.media, tokenOwnershipResponse.media) &&
        Objects.equals(this.collection, tokenOwnershipResponse.collection) &&
        Objects.equals(this.balance, tokenOwnershipResponse.balance) &&
        Objects.equals(this.vaultAccountId, tokenOwnershipResponse.vaultAccountId) &&
        Objects.equals(this.ownershipStartTime, tokenOwnershipResponse.ownershipStartTime) &&
        Objects.equals(this.ownershipLastUpdateTime, tokenOwnershipResponse.ownershipLastUpdateTime) &&
        Objects.equals(this.blockchainDescriptor, tokenOwnershipResponse.blockchainDescriptor) &&
        Objects.equals(this.description, tokenOwnershipResponse.description) &&
        Objects.equals(this.name, tokenOwnershipResponse.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tokenId, standard, metadataURI, cachedMetadataURI, media, collection, balance, vaultAccountId, ownershipStartTime, ownershipLastUpdateTime, blockchainDescriptor, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenOwnershipResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    metadataURI: ").append(toIndentedString(metadataURI)).append("\n");
    sb.append("    cachedMetadataURI: ").append(toIndentedString(cachedMetadataURI)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    vaultAccountId: ").append(toIndentedString(vaultAccountId)).append("\n");
    sb.append("    ownershipStartTime: ").append(toIndentedString(ownershipStartTime)).append("\n");
    sb.append("    ownershipLastUpdateTime: ").append(toIndentedString(ownershipLastUpdateTime)).append("\n");
    sb.append("    blockchainDescriptor: ").append(toIndentedString(blockchainDescriptor)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

