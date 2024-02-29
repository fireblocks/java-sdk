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
 * PaginatedAddressResponsePaging
 */
@JsonPropertyOrder({
  PaginatedAddressResponsePaging.JSON_PROPERTY_BEFORE,
  PaginatedAddressResponsePaging.JSON_PROPERTY_AFTER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaginatedAddressResponsePaging {
  public static final String JSON_PROPERTY_BEFORE = "before";
  private String before;

  public static final String JSON_PROPERTY_AFTER = "after";
  private String after;

  public PaginatedAddressResponsePaging() { 
  }

  public PaginatedAddressResponsePaging before(String before) {
    this.before = before;
    return this;
  }

   /**
   * A string representing a cursor. Users can use this with a new request to this API endpoint as the “before” request parameter to fetch the previous page of results.
   * @return before
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BEFORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBefore() {
    return before;
  }


  @JsonProperty(JSON_PROPERTY_BEFORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBefore(String before) {
    this.before = before;
  }


  public PaginatedAddressResponsePaging after(String after) {
    this.after = after;
    return this;
  }

   /**
   * A string representing a cursor. Users can use this with a new request to this API endpoint as the “after” request parameter to fetch the next page of results.
   * @return after
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAfter() {
    return after;
  }


  @JsonProperty(JSON_PROPERTY_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAfter(String after) {
    this.after = after;
  }


  /**
   * Return true if this PaginatedAddressResponse_paging object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedAddressResponsePaging paginatedAddressResponsePaging = (PaginatedAddressResponsePaging) o;
    return Objects.equals(this.before, paginatedAddressResponsePaging.before) &&
        Objects.equals(this.after, paginatedAddressResponsePaging.after);
  }

  @Override
  public int hashCode() {
    return Objects.hash(before, after);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedAddressResponsePaging {\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
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

    // add `before` to the URL query string
    if (getBefore() != null) {
      joiner.add(String.format("%sbefore%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBefore()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `after` to the URL query string
    if (getAfter() != null) {
      joiner.add(String.format("%safter%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAfter()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

