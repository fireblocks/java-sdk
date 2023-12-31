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
import com.fireblocks.sdk.model.NetworkIdRoutingPolicy;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * NetworkIdResponseAllOf
 */
@JsonPropertyOrder({
  NetworkIdResponseAllOf.JSON_PROPERTY_ROUTING_POLICY,
  NetworkIdResponseAllOf.JSON_PROPERTY_IS_DISCOVERABLE
})
@JsonTypeName("NetworkIdResponse_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetworkIdResponseAllOf {
  public static final String JSON_PROPERTY_ROUTING_POLICY = "routingPolicy";
  private NetworkIdRoutingPolicy routingPolicy;

  public static final String JSON_PROPERTY_IS_DISCOVERABLE = "isDiscoverable";
  private Boolean isDiscoverable;

  public NetworkIdResponseAllOf() { 
  }

  public NetworkIdResponseAllOf routingPolicy(NetworkIdRoutingPolicy routingPolicy) {
    this.routingPolicy = routingPolicy;
    return this;
  }

   /**
   * Get routingPolicy
   * @return routingPolicy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUTING_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkIdRoutingPolicy getRoutingPolicy() {
    return routingPolicy;
  }


  @JsonProperty(JSON_PROPERTY_ROUTING_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoutingPolicy(NetworkIdRoutingPolicy routingPolicy) {
    this.routingPolicy = routingPolicy;
  }


  public NetworkIdResponseAllOf isDiscoverable(Boolean isDiscoverable) {
    this.isDiscoverable = isDiscoverable;
    return this;
  }

   /**
   * The specific network is discoverable.
   * @return isDiscoverable
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DISCOVERABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDiscoverable() {
    return isDiscoverable;
  }


  @JsonProperty(JSON_PROPERTY_IS_DISCOVERABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDiscoverable(Boolean isDiscoverable) {
    this.isDiscoverable = isDiscoverable;
  }


  /**
   * Return true if this NetworkIdResponse_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkIdResponseAllOf networkIdResponseAllOf = (NetworkIdResponseAllOf) o;
    return Objects.equals(this.routingPolicy, networkIdResponseAllOf.routingPolicy) &&
        Objects.equals(this.isDiscoverable, networkIdResponseAllOf.isDiscoverable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routingPolicy, isDiscoverable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkIdResponseAllOf {\n");
    sb.append("    routingPolicy: ").append(toIndentedString(routingPolicy)).append("\n");
    sb.append("    isDiscoverable: ").append(toIndentedString(isDiscoverable)).append("\n");
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

