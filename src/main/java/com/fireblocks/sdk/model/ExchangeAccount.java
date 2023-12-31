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
import com.fireblocks.sdk.model.ExchangeAsset;
import com.fireblocks.sdk.model.ExchangeTradingAccount;
import com.fireblocks.sdk.model.ExchangeType;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * ExchangeAccount
 */
@JsonPropertyOrder({
  ExchangeAccount.JSON_PROPERTY_ID,
  ExchangeAccount.JSON_PROPERTY_TYPE,
  ExchangeAccount.JSON_PROPERTY_NAME,
  ExchangeAccount.JSON_PROPERTY_STATUS,
  ExchangeAccount.JSON_PROPERTY_ASSETS,
  ExchangeAccount.JSON_PROPERTY_TRADING_ACCOUNTS,
  ExchangeAccount.JSON_PROPERTY_IS_SUBACCOUNT,
  ExchangeAccount.JSON_PROPERTY_MAIN_ACCOUNT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExchangeAccount {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ExchangeType type;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_ASSETS = "assets";
  private List<ExchangeAsset> assets;

  public static final String JSON_PROPERTY_TRADING_ACCOUNTS = "tradingAccounts";
  private List<ExchangeTradingAccount> tradingAccounts;

  public static final String JSON_PROPERTY_IS_SUBACCOUNT = "isSubaccount";
  private Boolean isSubaccount;

  public static final String JSON_PROPERTY_MAIN_ACCOUNT_ID = "mainAccountId";
  private String mainAccountId;

  public ExchangeAccount() { 
  }

  public ExchangeAccount id(String id) {
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


  public ExchangeAccount type(ExchangeType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExchangeType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(ExchangeType type) {
    this.type = type;
  }


  public ExchangeAccount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display name of the exchange account
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


  public ExchangeAccount status(String status) {
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


  public ExchangeAccount assets(List<ExchangeAsset> assets) {
    this.assets = assets;
    return this;
  }

  public ExchangeAccount addAssetsItem(ExchangeAsset assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<>();
    }
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ExchangeAsset> getAssets() {
    return assets;
  }


  @JsonProperty(JSON_PROPERTY_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssets(List<ExchangeAsset> assets) {
    this.assets = assets;
  }


  public ExchangeAccount tradingAccounts(List<ExchangeTradingAccount> tradingAccounts) {
    this.tradingAccounts = tradingAccounts;
    return this;
  }

  public ExchangeAccount addTradingAccountsItem(ExchangeTradingAccount tradingAccountsItem) {
    if (this.tradingAccounts == null) {
      this.tradingAccounts = new ArrayList<>();
    }
    this.tradingAccounts.add(tradingAccountsItem);
    return this;
  }

   /**
   * Get tradingAccounts
   * @return tradingAccounts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRADING_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ExchangeTradingAccount> getTradingAccounts() {
    return tradingAccounts;
  }


  @JsonProperty(JSON_PROPERTY_TRADING_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradingAccounts(List<ExchangeTradingAccount> tradingAccounts) {
    this.tradingAccounts = tradingAccounts;
  }


  public ExchangeAccount isSubaccount(Boolean isSubaccount) {
    this.isSubaccount = isSubaccount;
    return this;
  }

   /**
   * True if the account is a subaccount in an exchange
   * @return isSubaccount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_SUBACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSubaccount() {
    return isSubaccount;
  }


  @JsonProperty(JSON_PROPERTY_IS_SUBACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsSubaccount(Boolean isSubaccount) {
    this.isSubaccount = isSubaccount;
  }


  public ExchangeAccount mainAccountId(String mainAccountId) {
    this.mainAccountId = mainAccountId;
    return this;
  }

   /**
   * if the account is a sub-account, the ID of the main account
   * @return mainAccountId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAIN_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMainAccountId() {
    return mainAccountId;
  }


  @JsonProperty(JSON_PROPERTY_MAIN_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainAccountId(String mainAccountId) {
    this.mainAccountId = mainAccountId;
  }


  /**
   * Return true if this ExchangeAccount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeAccount exchangeAccount = (ExchangeAccount) o;
    return Objects.equals(this.id, exchangeAccount.id) &&
        Objects.equals(this.type, exchangeAccount.type) &&
        Objects.equals(this.name, exchangeAccount.name) &&
        Objects.equals(this.status, exchangeAccount.status) &&
        Objects.equals(this.assets, exchangeAccount.assets) &&
        Objects.equals(this.tradingAccounts, exchangeAccount.tradingAccounts) &&
        Objects.equals(this.isSubaccount, exchangeAccount.isSubaccount) &&
        Objects.equals(this.mainAccountId, exchangeAccount.mainAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, name, status, assets, tradingAccounts, isSubaccount, mainAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeAccount {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    tradingAccounts: ").append(toIndentedString(tradingAccounts)).append("\n");
    sb.append("    isSubaccount: ").append(toIndentedString(isSubaccount)).append("\n");
    sb.append("    mainAccountId: ").append(toIndentedString(mainAccountId)).append("\n");
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

