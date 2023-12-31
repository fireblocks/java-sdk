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
import com.fireblocks.sdk.model.Paging;
import com.fireblocks.sdk.model.TokenOwnershipResponse;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * GetOwnershipTokens200Response
 */
@JsonPropertyOrder({
  GetOwnershipTokens200Response.JSON_PROPERTY_PAGING,
  GetOwnershipTokens200Response.JSON_PROPERTY_DATA
})
@JsonTypeName("getOwnershipTokens_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetOwnershipTokens200Response {
  public static final String JSON_PROPERTY_PAGING = "paging";
  private Paging paging;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<TokenOwnershipResponse> data;

  public GetOwnershipTokens200Response() { 
  }

  public GetOwnershipTokens200Response paging(Paging paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  @javax.annotation.Nullable
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


  public GetOwnershipTokens200Response data(List<TokenOwnershipResponse> data) {
    this.data = data;
    return this;
  }

  public GetOwnershipTokens200Response addDataItem(TokenOwnershipResponse dataItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TokenOwnershipResponse> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<TokenOwnershipResponse> data) {
    this.data = data;
  }


  /**
   * Return true if this getOwnershipTokens_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOwnershipTokens200Response getOwnershipTokens200Response = (GetOwnershipTokens200Response) o;
    return Objects.equals(this.paging, getOwnershipTokens200Response.paging) &&
        Objects.equals(this.data, getOwnershipTokens200Response.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOwnershipTokens200Response {\n");
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

}

