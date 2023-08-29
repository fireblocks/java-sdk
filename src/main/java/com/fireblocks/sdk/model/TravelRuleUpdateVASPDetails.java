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
 * TravelRuleUpdateVASPDetails
 */
@JsonPropertyOrder({
  TravelRuleUpdateVASPDetails.JSON_PROPERTY_DID,
  TravelRuleUpdateVASPDetails.JSON_PROPERTY_PII_DIDKEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TravelRuleUpdateVASPDetails {
  public static final String JSON_PROPERTY_DID = "did";
  private String did;

  public static final String JSON_PROPERTY_PII_DIDKEY = "pii_didkey";
  private String piiDidkey;

  public TravelRuleUpdateVASPDetails() { 
  }

  public TravelRuleUpdateVASPDetails did(String did) {
    this.did = did;
    return this;
  }

   /**
   * The decentralized identifier of the VASP
   * @return did
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDid() {
    return did;
  }


  @JsonProperty(JSON_PROPERTY_DID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDid(String did) {
    this.did = did;
  }


  public TravelRuleUpdateVASPDetails piiDidkey(String piiDidkey) {
    this.piiDidkey = piiDidkey;
    return this;
  }

   /**
   * The PII DID key of the VASP
   * @return piiDidkey
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PII_DIDKEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPiiDidkey() {
    return piiDidkey;
  }


  @JsonProperty(JSON_PROPERTY_PII_DIDKEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPiiDidkey(String piiDidkey) {
    this.piiDidkey = piiDidkey;
  }


  /**
   * Return true if this TravelRuleUpdateVASPDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelRuleUpdateVASPDetails travelRuleUpdateVASPDetails = (TravelRuleUpdateVASPDetails) o;
    return Objects.equals(this.did, travelRuleUpdateVASPDetails.did) &&
        Objects.equals(this.piiDidkey, travelRuleUpdateVASPDetails.piiDidkey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(did, piiDidkey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelRuleUpdateVASPDetails {\n");
    sb.append("    did: ").append(toIndentedString(did)).append("\n");
    sb.append("    piiDidkey: ").append(toIndentedString(piiDidkey)).append("\n");
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

