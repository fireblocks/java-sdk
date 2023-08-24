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
 * DefaultNetworkRoutingDest
 */
@JsonPropertyOrder({
  DefaultNetworkRoutingDest.JSON_PROPERTY_SCHEME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DefaultNetworkRoutingDest {
  /**
   * The network routing logic.
   */
  public enum SchemeEnum {
    DEFAULT("DEFAULT");

    private String value;

    SchemeEnum(String value) {
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
    public static SchemeEnum fromValue(String value) {
      for (SchemeEnum b : SchemeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SCHEME = "scheme";
  private SchemeEnum scheme;

  public DefaultNetworkRoutingDest() { 
  }

  public DefaultNetworkRoutingDest scheme(SchemeEnum scheme) {
    this.scheme = scheme;
    return this;
  }

   /**
   * The network routing logic.
   * @return scheme
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCHEME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SchemeEnum getScheme() {
    return scheme;
  }


  @JsonProperty(JSON_PROPERTY_SCHEME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScheme(SchemeEnum scheme) {
    this.scheme = scheme;
  }


  /**
   * Return true if this DefaultNetworkRoutingDest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultNetworkRoutingDest defaultNetworkRoutingDest = (DefaultNetworkRoutingDest) o;
    return Objects.equals(this.scheme, defaultNetworkRoutingDest.scheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultNetworkRoutingDest {\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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
