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
 * SetDiscoverabilityForNetworkIdRequest
 */
@JsonPropertyOrder({
  SetDiscoverabilityForNetworkIdRequest.JSON_PROPERTY_IS_DISCOVERABLE
})
@JsonTypeName("setDiscoverabilityForNetworkId_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SetDiscoverabilityForNetworkIdRequest {
  public static final String JSON_PROPERTY_IS_DISCOVERABLE = "isDiscoverable";
  private Boolean isDiscoverable;

  public SetDiscoverabilityForNetworkIdRequest() { 
  }

  public SetDiscoverabilityForNetworkIdRequest isDiscoverable(Boolean isDiscoverable) {
    this.isDiscoverable = isDiscoverable;
    return this;
  }

   /**
   * Get isDiscoverable
   * @return isDiscoverable
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_DISCOVERABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsDiscoverable() {
    return isDiscoverable;
  }


  @JsonProperty(JSON_PROPERTY_IS_DISCOVERABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsDiscoverable(Boolean isDiscoverable) {
    this.isDiscoverable = isDiscoverable;
  }


  /**
   * Return true if this setDiscoverabilityForNetworkId_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDiscoverabilityForNetworkIdRequest setDiscoverabilityForNetworkIdRequest = (SetDiscoverabilityForNetworkIdRequest) o;
    return Objects.equals(this.isDiscoverable, setDiscoverabilityForNetworkIdRequest.isDiscoverable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDiscoverable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDiscoverabilityForNetworkIdRequest {\n");
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

