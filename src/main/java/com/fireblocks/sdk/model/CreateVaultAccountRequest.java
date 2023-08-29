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
 * CreateVaultAccountRequest
 */
@JsonPropertyOrder({
  CreateVaultAccountRequest.JSON_PROPERTY_NAME,
  CreateVaultAccountRequest.JSON_PROPERTY_HIDDEN_ON_U_I,
  CreateVaultAccountRequest.JSON_PROPERTY_CUSTOMER_REF_ID,
  CreateVaultAccountRequest.JSON_PROPERTY_AUTO_FUEL
})
@JsonTypeName("createVaultAccount_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateVaultAccountRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_HIDDEN_ON_U_I = "hiddenOnUI";
  private Boolean hiddenOnUI;

  public static final String JSON_PROPERTY_CUSTOMER_REF_ID = "customerRefId";
  private String customerRefId;

  public static final String JSON_PROPERTY_AUTO_FUEL = "autoFuel";
  private Boolean autoFuel;

  public CreateVaultAccountRequest() { 
  }

  public CreateVaultAccountRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Account Name
   * @return name
  **/
  @javax.annotation.Nullable
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


  public CreateVaultAccountRequest hiddenOnUI(Boolean hiddenOnUI) {
    this.hiddenOnUI = hiddenOnUI;
    return this;
  }

   /**
   * Optional - if true, the created account and all related transactions will not be shown on Fireblocks console
   * @return hiddenOnUI
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDDEN_ON_U_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHiddenOnUI() {
    return hiddenOnUI;
  }


  @JsonProperty(JSON_PROPERTY_HIDDEN_ON_U_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHiddenOnUI(Boolean hiddenOnUI) {
    this.hiddenOnUI = hiddenOnUI;
  }


  public CreateVaultAccountRequest customerRefId(String customerRefId) {
    this.customerRefId = customerRefId;
    return this;
  }

   /**
   * Optional - Sets a customer reference ID
   * @return customerRefId
  **/
  @javax.annotation.Nullable
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


  public CreateVaultAccountRequest autoFuel(Boolean autoFuel) {
    this.autoFuel = autoFuel;
    return this;
  }

   /**
   * Optional - Sets the autoFuel property of the vault account
   * @return autoFuel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_FUEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoFuel() {
    return autoFuel;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_FUEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoFuel(Boolean autoFuel) {
    this.autoFuel = autoFuel;
  }


  /**
   * Return true if this createVaultAccount_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVaultAccountRequest createVaultAccountRequest = (CreateVaultAccountRequest) o;
    return Objects.equals(this.name, createVaultAccountRequest.name) &&
        Objects.equals(this.hiddenOnUI, createVaultAccountRequest.hiddenOnUI) &&
        Objects.equals(this.customerRefId, createVaultAccountRequest.customerRefId) &&
        Objects.equals(this.autoFuel, createVaultAccountRequest.autoFuel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hiddenOnUI, customerRefId, autoFuel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVaultAccountRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hiddenOnUI: ").append(toIndentedString(hiddenOnUI)).append("\n");
    sb.append("    customerRefId: ").append(toIndentedString(customerRefId)).append("\n");
    sb.append("    autoFuel: ").append(toIndentedString(autoFuel)).append("\n");
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

