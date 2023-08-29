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
 * CreateNetworkIdRequest
 */
@JsonPropertyOrder({
  CreateNetworkIdRequest.JSON_PROPERTY_NAME,
  CreateNetworkIdRequest.JSON_PROPERTY_ROUTING_POLICY
})
@JsonTypeName("createNetworkId_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateNetworkIdRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ROUTING_POLICY = "routingPolicy";
  private NetworkIdRoutingPolicy routingPolicy;

  public CreateNetworkIdRequest() { 
  }

  public CreateNetworkIdRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CreateNetworkIdRequest routingPolicy(NetworkIdRoutingPolicy routingPolicy) {
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


  /**
   * Return true if this createNetworkId_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateNetworkIdRequest createNetworkIdRequest = (CreateNetworkIdRequest) o;
    return Objects.equals(this.name, createNetworkIdRequest.name) &&
        Objects.equals(this.routingPolicy, createNetworkIdRequest.routingPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, routingPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateNetworkIdRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    routingPolicy: ").append(toIndentedString(routingPolicy)).append("\n");
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

