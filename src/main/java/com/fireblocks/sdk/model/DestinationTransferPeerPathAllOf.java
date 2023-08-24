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
import com.fireblocks.sdk.model.OneTimeAddress;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * The destination of the transaction.
 */
@JsonPropertyOrder({
  DestinationTransferPeerPathAllOf.JSON_PROPERTY_ONE_TIME_ADDRESS
})
@JsonTypeName("DestinationTransferPeerPath_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DestinationTransferPeerPathAllOf {
  public static final String JSON_PROPERTY_ONE_TIME_ADDRESS = "oneTimeAddress";
  private OneTimeAddress oneTimeAddress;

  public DestinationTransferPeerPathAllOf() { 
  }

  public DestinationTransferPeerPathAllOf oneTimeAddress(OneTimeAddress oneTimeAddress) {
    this.oneTimeAddress = oneTimeAddress;
    return this;
  }

   /**
   * Get oneTimeAddress
   * @return oneTimeAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONE_TIME_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OneTimeAddress getOneTimeAddress() {
    return oneTimeAddress;
  }


  @JsonProperty(JSON_PROPERTY_ONE_TIME_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOneTimeAddress(OneTimeAddress oneTimeAddress) {
    this.oneTimeAddress = oneTimeAddress;
  }


  /**
   * Return true if this DestinationTransferPeerPath_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinationTransferPeerPathAllOf destinationTransferPeerPathAllOf = (DestinationTransferPeerPathAllOf) o;
    return Objects.equals(this.oneTimeAddress, destinationTransferPeerPathAllOf.oneTimeAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oneTimeAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinationTransferPeerPathAllOf {\n");
    sb.append("    oneTimeAddress: ").append(toIndentedString(oneTimeAddress)).append("\n");
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

