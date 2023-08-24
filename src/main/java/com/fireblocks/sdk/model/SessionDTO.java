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
import com.fireblocks.sdk.model.SessionDTOSessionMetadata;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * SessionDTO
 */
@JsonPropertyOrder({
  SessionDTO.JSON_PROPERTY_ID,
  SessionDTO.JSON_PROPERTY_USER_ID,
  SessionDTO.JSON_PROPERTY_SESSION_METADATA,
  SessionDTO.JSON_PROPERTY_VAULT_ACCOUNT_ID,
  SessionDTO.JSON_PROPERTY_FEE_LEVEL,
  SessionDTO.JSON_PROPERTY_CHAIN_IDS,
  SessionDTO.JSON_PROPERTY_CONNECTION_TYPE,
  SessionDTO.JSON_PROPERTY_CONNECTION_METHOD,
  SessionDTO.JSON_PROPERTY_CREATION_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SessionDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;

  public static final String JSON_PROPERTY_SESSION_METADATA = "sessionMetadata";
  private SessionDTOSessionMetadata sessionMetadata;

  public static final String JSON_PROPERTY_VAULT_ACCOUNT_ID = "vaultAccountId";
  private BigDecimal vaultAccountId;

  /**
   * The default fee level
   */
  public enum FeeLevelEnum {
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH");

    private String value;

    FeeLevelEnum(String value) {
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
    public static FeeLevelEnum fromValue(String value) {
      for (FeeLevelEnum b : FeeLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FEE_LEVEL = "feeLevel";
  private FeeLevelEnum feeLevel;

  public static final String JSON_PROPERTY_CHAIN_IDS = "chainIds";
  private List<String> chainIds = new ArrayList<>();

  /**
   * The connection&#39;s type
   */
  public enum ConnectionTypeEnum {
    WALLETCONNECT("WalletConnect");

    private String value;

    ConnectionTypeEnum(String value) {
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
    public static ConnectionTypeEnum fromValue(String value) {
      for (ConnectionTypeEnum b : ConnectionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONNECTION_TYPE = "connectionType";
  private ConnectionTypeEnum connectionType;

  /**
   * The method through which the connection was established
   */
  public enum ConnectionMethodEnum {
    DESKTOP("DESKTOP"),
    
    MOBILE("MOBILE"),
    
    API("API");

    private String value;

    ConnectionMethodEnum(String value) {
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
    public static ConnectionMethodEnum fromValue(String value) {
      for (ConnectionMethodEnum b : ConnectionMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONNECTION_METHOD = "connectionMethod";
  private ConnectionMethodEnum connectionMethod;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private OffsetDateTime creationDate;

  public SessionDTO() { 
  }

  public SessionDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of the connection
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


  public SessionDTO userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Id of the user that created the connection
   * @return userId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public SessionDTO sessionMetadata(SessionDTOSessionMetadata sessionMetadata) {
    this.sessionMetadata = sessionMetadata;
    return this;
  }

   /**
   * Get sessionMetadata
   * @return sessionMetadata
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SESSION_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SessionDTOSessionMetadata getSessionMetadata() {
    return sessionMetadata;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSessionMetadata(SessionDTOSessionMetadata sessionMetadata) {
    this.sessionMetadata = sessionMetadata;
  }


  public SessionDTO vaultAccountId(BigDecimal vaultAccountId) {
    this.vaultAccountId = vaultAccountId;
    return this;
  }

   /**
   * The vault to connect
   * @return vaultAccountId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VAULT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getVaultAccountId() {
    return vaultAccountId;
  }


  @JsonProperty(JSON_PROPERTY_VAULT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVaultAccountId(BigDecimal vaultAccountId) {
    this.vaultAccountId = vaultAccountId;
  }


  public SessionDTO feeLevel(FeeLevelEnum feeLevel) {
    this.feeLevel = feeLevel;
    return this;
  }

   /**
   * The default fee level
   * @return feeLevel
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FEE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FeeLevelEnum getFeeLevel() {
    return feeLevel;
  }


  @JsonProperty(JSON_PROPERTY_FEE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFeeLevel(FeeLevelEnum feeLevel) {
    this.feeLevel = feeLevel;
  }


  public SessionDTO chainIds(List<String> chainIds) {
    this.chainIds = chainIds;
    return this;
  }

  public SessionDTO addChainIdsItem(String chainIdsItem) {
    if (this.chainIds == null) {
      this.chainIds = new ArrayList<>();
    }
    this.chainIds.add(chainIdsItem);
    return this;
  }

   /**
   * The chains approved for the connection
   * @return chainIds
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHAIN_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getChainIds() {
    return chainIds;
  }


  @JsonProperty(JSON_PROPERTY_CHAIN_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChainIds(List<String> chainIds) {
    this.chainIds = chainIds;
  }


  public SessionDTO connectionType(ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
    return this;
  }

   /**
   * The connection&#39;s type
   * @return connectionType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConnectionTypeEnum getConnectionType() {
    return connectionType;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectionType(ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
  }


  public SessionDTO connectionMethod(ConnectionMethodEnum connectionMethod) {
    this.connectionMethod = connectionMethod;
    return this;
  }

   /**
   * The method through which the connection was established
   * @return connectionMethod
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTION_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConnectionMethodEnum getConnectionMethod() {
    return connectionMethod;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectionMethod(ConnectionMethodEnum connectionMethod) {
    this.connectionMethod = connectionMethod;
  }


  public SessionDTO creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Timestamp of the session&#39;s creation
   * @return creationDate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  /**
   * Return true if this SessionDTO object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionDTO sessionDTO = (SessionDTO) o;
    return Objects.equals(this.id, sessionDTO.id) &&
        Objects.equals(this.userId, sessionDTO.userId) &&
        Objects.equals(this.sessionMetadata, sessionDTO.sessionMetadata) &&
        Objects.equals(this.vaultAccountId, sessionDTO.vaultAccountId) &&
        Objects.equals(this.feeLevel, sessionDTO.feeLevel) &&
        Objects.equals(this.chainIds, sessionDTO.chainIds) &&
        Objects.equals(this.connectionType, sessionDTO.connectionType) &&
        Objects.equals(this.connectionMethod, sessionDTO.connectionMethod) &&
        Objects.equals(this.creationDate, sessionDTO.creationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, sessionMetadata, vaultAccountId, feeLevel, chainIds, connectionType, connectionMethod, creationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    sessionMetadata: ").append(toIndentedString(sessionMetadata)).append("\n");
    sb.append("    vaultAccountId: ").append(toIndentedString(vaultAccountId)).append("\n");
    sb.append("    feeLevel: ").append(toIndentedString(feeLevel)).append("\n");
    sb.append("    chainIds: ").append(toIndentedString(chainIds)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    connectionMethod: ").append(toIndentedString(connectionMethod)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
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
