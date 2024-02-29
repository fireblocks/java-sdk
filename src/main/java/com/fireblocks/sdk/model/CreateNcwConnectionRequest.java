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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateNcwConnectionRequest
 */
@JsonPropertyOrder({
  CreateNcwConnectionRequest.JSON_PROPERTY_NCW_ID,
  CreateNcwConnectionRequest.JSON_PROPERTY_NCW_ACCOUNT_ID,
  CreateNcwConnectionRequest.JSON_PROPERTY_FEE_LEVEL,
  CreateNcwConnectionRequest.JSON_PROPERTY_URI,
  CreateNcwConnectionRequest.JSON_PROPERTY_CHAIN_IDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateNcwConnectionRequest {
  public static final String JSON_PROPERTY_NCW_ID = "ncwId";
  private String ncwId;

  public static final String JSON_PROPERTY_NCW_ACCOUNT_ID = "ncwAccountId";
  private BigDecimal ncwAccountId;

  /**
   * The default fee level. Valid values are &#x60;MEDIUM&#x60; and &#x60;HIGH&#x60;.
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

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public static final String JSON_PROPERTY_CHAIN_IDS = "chainIds";
  private List<String> chainIds;

  public CreateNcwConnectionRequest() { 
  }

  public CreateNcwConnectionRequest ncwId(String ncwId) {
    this.ncwId = ncwId;
    return this;
  }

   /**
   * The ID of the Non-Custodial Wallet to connect to the dApp.
   * @return ncwId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NCW_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNcwId() {
    return ncwId;
  }


  @JsonProperty(JSON_PROPERTY_NCW_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNcwId(String ncwId) {
    this.ncwId = ncwId;
  }


  public CreateNcwConnectionRequest ncwAccountId(BigDecimal ncwAccountId) {
    this.ncwAccountId = ncwAccountId;
    return this;
  }

   /**
   * The NCW account ID to connect to the dApp.
   * @return ncwAccountId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NCW_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getNcwAccountId() {
    return ncwAccountId;
  }


  @JsonProperty(JSON_PROPERTY_NCW_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNcwAccountId(BigDecimal ncwAccountId) {
    this.ncwAccountId = ncwAccountId;
  }


  public CreateNcwConnectionRequest feeLevel(FeeLevelEnum feeLevel) {
    this.feeLevel = feeLevel;
    return this;
  }

   /**
   * The default fee level. Valid values are &#x60;MEDIUM&#x60; and &#x60;HIGH&#x60;.
   * @return feeLevel
  **/
  @jakarta.annotation.Nonnull
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


  public CreateNcwConnectionRequest uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The WalletConnect uri provided by the dapp.
   * @return uri
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUri() {
    return uri;
  }


  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUri(String uri) {
    this.uri = uri;
  }


  public CreateNcwConnectionRequest chainIds(List<String> chainIds) {
    this.chainIds = chainIds;
    return this;
  }

  public CreateNcwConnectionRequest addChainIdsItem(String chainIdsItem) {
    if (this.chainIds == null) {
      this.chainIds = new ArrayList<>();
    }
    this.chainIds.add(chainIdsItem);
    return this;
  }

   /**
   * The IDs of the blockchain networks used in the Web3 connection (Currently required in V1 connections only).
   * @return chainIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHAIN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getChainIds() {
    return chainIds;
  }


  @JsonProperty(JSON_PROPERTY_CHAIN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChainIds(List<String> chainIds) {
    this.chainIds = chainIds;
  }


  /**
   * Return true if this CreateNcwConnectionRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateNcwConnectionRequest createNcwConnectionRequest = (CreateNcwConnectionRequest) o;
    return Objects.equals(this.ncwId, createNcwConnectionRequest.ncwId) &&
        Objects.equals(this.ncwAccountId, createNcwConnectionRequest.ncwAccountId) &&
        Objects.equals(this.feeLevel, createNcwConnectionRequest.feeLevel) &&
        Objects.equals(this.uri, createNcwConnectionRequest.uri) &&
        Objects.equals(this.chainIds, createNcwConnectionRequest.chainIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ncwId, ncwAccountId, feeLevel, uri, chainIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateNcwConnectionRequest {\n");
    sb.append("    ncwId: ").append(toIndentedString(ncwId)).append("\n");
    sb.append("    ncwAccountId: ").append(toIndentedString(ncwAccountId)).append("\n");
    sb.append("    feeLevel: ").append(toIndentedString(feeLevel)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    chainIds: ").append(toIndentedString(chainIds)).append("\n");
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

    // add `ncwId` to the URL query string
    if (getNcwId() != null) {
      joiner.add(String.format("%sncwId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNcwId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ncwAccountId` to the URL query string
    if (getNcwAccountId() != null) {
      joiner.add(String.format("%sncwAccountId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNcwAccountId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `feeLevel` to the URL query string
    if (getFeeLevel() != null) {
      joiner.add(String.format("%sfeeLevel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFeeLevel()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `uri` to the URL query string
    if (getUri() != null) {
      joiner.add(String.format("%suri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUri()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `chainIds` to the URL query string
    if (getChainIds() != null) {
      for (int i = 0; i < getChainIds().size(); i++) {
        joiner.add(String.format("%schainIds%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getChainIds().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

