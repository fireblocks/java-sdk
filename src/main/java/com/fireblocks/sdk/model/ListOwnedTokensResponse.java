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
import com.fireblocks.sdk.model.Paging;
import com.fireblocks.sdk.model.TokenResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ListOwnedTokensResponse
 */
@JsonPropertyOrder({
  ListOwnedTokensResponse.JSON_PROPERTY_PAGING,
  ListOwnedTokensResponse.JSON_PROPERTY_DATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListOwnedTokensResponse {
  public static final String JSON_PROPERTY_PAGING = "paging";
  private Paging paging;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<TokenResponse> data;

  public ListOwnedTokensResponse() { 
  }

  public ListOwnedTokensResponse paging(Paging paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Paging getPaging() {
    return paging;
  }


  @JsonProperty(JSON_PROPERTY_PAGING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaging(Paging paging) {
    this.paging = paging;
  }


  public ListOwnedTokensResponse data(List<TokenResponse> data) {
    this.data = data;
    return this;
  }

  public ListOwnedTokensResponse addDataItem(TokenResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TokenResponse> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<TokenResponse> data) {
    this.data = data;
  }


  /**
   * Return true if this ListOwnedTokensResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOwnedTokensResponse listOwnedTokensResponse = (ListOwnedTokensResponse) o;
    return Objects.equals(this.paging, listOwnedTokensResponse.paging) &&
        Objects.equals(this.data, listOwnedTokensResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOwnedTokensResponse {\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

    // add `paging` to the URL query string
    if (getPaging() != null) {
      joiner.add(getPaging().toUrlQueryString(prefix + "paging" + suffix));
    }

    // add `data` to the URL query string
    if (getData() != null) {
      for (int i = 0; i < getData().size(); i++) {
        if (getData().get(i) != null) {
          joiner.add(getData().get(i).toUrlQueryString(String.format("%sdata%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

