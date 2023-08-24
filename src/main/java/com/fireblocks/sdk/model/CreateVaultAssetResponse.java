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
 * CreateVaultAssetResponse
 */
@JsonPropertyOrder({
  CreateVaultAssetResponse.JSON_PROPERTY_ID,
  CreateVaultAssetResponse.JSON_PROPERTY_ADDRESS,
  CreateVaultAssetResponse.JSON_PROPERTY_LEGACY_ADDRESS,
  CreateVaultAssetResponse.JSON_PROPERTY_ENTERPRISE_ADDRESS,
  CreateVaultAssetResponse.JSON_PROPERTY_TAG,
  CreateVaultAssetResponse.JSON_PROPERTY_EOS_ACCOUNT_NAME,
  CreateVaultAssetResponse.JSON_PROPERTY_STATUS,
  CreateVaultAssetResponse.JSON_PROPERTY_ACTIVATION_TX_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateVaultAssetResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_LEGACY_ADDRESS = "legacyAddress";
  private String legacyAddress;

  public static final String JSON_PROPERTY_ENTERPRISE_ADDRESS = "enterpriseAddress";
  private String enterpriseAddress;

  public static final String JSON_PROPERTY_TAG = "tag";
  private String tag;

  public static final String JSON_PROPERTY_EOS_ACCOUNT_NAME = "eosAccountName";
  private String eosAccountName;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_ACTIVATION_TX_ID = "activationTxId";
  private String activationTxId;

  public CreateVaultAssetResponse() { 
  }

  public CreateVaultAssetResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public CreateVaultAssetResponse address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
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


  public CreateVaultAssetResponse legacyAddress(String legacyAddress) {
    this.legacyAddress = legacyAddress;
    return this;
  }

   /**
   * Get legacyAddress
   * @return legacyAddress
  **/
  @javax.annotation.Nullable
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


  public CreateVaultAssetResponse enterpriseAddress(String enterpriseAddress) {
    this.enterpriseAddress = enterpriseAddress;
    return this;
  }

   /**
   * Get enterpriseAddress
   * @return enterpriseAddress
  **/
  @javax.annotation.Nullable
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


  public CreateVaultAssetResponse tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
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


  public CreateVaultAssetResponse eosAccountName(String eosAccountName) {
    this.eosAccountName = eosAccountName;
    return this;
  }

   /**
   * Get eosAccountName
   * @return eosAccountName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EOS_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEosAccountName() {
    return eosAccountName;
  }


  @JsonProperty(JSON_PROPERTY_EOS_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEosAccountName(String eosAccountName) {
    this.eosAccountName = eosAccountName;
  }


  public CreateVaultAssetResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public CreateVaultAssetResponse activationTxId(String activationTxId) {
    this.activationTxId = activationTxId;
    return this;
  }

   /**
   * Get activationTxId
   * @return activationTxId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVATION_TX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActivationTxId() {
    return activationTxId;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVATION_TX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActivationTxId(String activationTxId) {
    this.activationTxId = activationTxId;
  }


  /**
   * Return true if this CreateVaultAssetResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVaultAssetResponse createVaultAssetResponse = (CreateVaultAssetResponse) o;
    return Objects.equals(this.id, createVaultAssetResponse.id) &&
        Objects.equals(this.address, createVaultAssetResponse.address) &&
        Objects.equals(this.legacyAddress, createVaultAssetResponse.legacyAddress) &&
        Objects.equals(this.enterpriseAddress, createVaultAssetResponse.enterpriseAddress) &&
        Objects.equals(this.tag, createVaultAssetResponse.tag) &&
        Objects.equals(this.eosAccountName, createVaultAssetResponse.eosAccountName) &&
        Objects.equals(this.status, createVaultAssetResponse.status) &&
        Objects.equals(this.activationTxId, createVaultAssetResponse.activationTxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, address, legacyAddress, enterpriseAddress, tag, eosAccountName, status, activationTxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVaultAssetResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    legacyAddress: ").append(toIndentedString(legacyAddress)).append("\n");
    sb.append("    enterpriseAddress: ").append(toIndentedString(enterpriseAddress)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    eosAccountName: ").append(toIndentedString(eosAccountName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    activationTxId: ").append(toIndentedString(activationTxId)).append("\n");
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

