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
 * ExchangeAsset
 */
@JsonPropertyOrder({
  ExchangeAsset.JSON_PROPERTY_ID,
  ExchangeAsset.JSON_PROPERTY_BALANCE,
  ExchangeAsset.JSON_PROPERTY_LOCKED_AMOUNT,
  ExchangeAsset.JSON_PROPERTY_TOTAL,
  ExchangeAsset.JSON_PROPERTY_AVAILABLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExchangeAsset {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_BALANCE = "balance";
  private String balance;

  public static final String JSON_PROPERTY_LOCKED_AMOUNT = "lockedAmount";
  private String lockedAmount;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private String total;

  public static final String JSON_PROPERTY_AVAILABLE = "available";
  private String available;

  public ExchangeAsset() { 
  }

  public ExchangeAsset id(String id) {
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


  public ExchangeAsset balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalance() {
    return balance;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalance(String balance) {
    this.balance = balance;
  }


  public ExchangeAsset lockedAmount(String lockedAmount) {
    this.lockedAmount = lockedAmount;
    return this;
  }

   /**
   * Get lockedAmount
   * @return lockedAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCKED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLockedAmount() {
    return lockedAmount;
  }


  @JsonProperty(JSON_PROPERTY_LOCKED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLockedAmount(String lockedAmount) {
    this.lockedAmount = lockedAmount;
  }


  public ExchangeAsset total(String total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(String total) {
    this.total = total;
  }


  public ExchangeAsset available(String available) {
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvailable() {
    return available;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailable(String available) {
    this.available = available;
  }


  /**
   * Return true if this ExchangeAsset object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeAsset exchangeAsset = (ExchangeAsset) o;
    return Objects.equals(this.id, exchangeAsset.id) &&
        Objects.equals(this.balance, exchangeAsset.balance) &&
        Objects.equals(this.lockedAmount, exchangeAsset.lockedAmount) &&
        Objects.equals(this.total, exchangeAsset.total) &&
        Objects.equals(this.available, exchangeAsset.available);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, balance, lockedAmount, total, available);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeAsset {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    lockedAmount: ").append(toIndentedString(lockedAmount)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
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

