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
import com.fireblocks.sdk.model.NetworkIdRoutingPolicyCrypto;
import com.fireblocks.sdk.model.NetworkIdRoutingPolicySen;
import com.fireblocks.sdk.model.NetworkIdRoutingPolicySenTest;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * NetworkIdRoutingPolicy
 */
@JsonPropertyOrder({
  NetworkIdRoutingPolicy.JSON_PROPERTY_CRYPTO,
  NetworkIdRoutingPolicy.JSON_PROPERTY_SEN,
  NetworkIdRoutingPolicy.JSON_PROPERTY_SIGNET,
  NetworkIdRoutingPolicy.JSON_PROPERTY_SEN_TEST,
  NetworkIdRoutingPolicy.JSON_PROPERTY_SIGNET_TEST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetworkIdRoutingPolicy {
  public static final String JSON_PROPERTY_CRYPTO = "crypto";
  private NetworkIdRoutingPolicyCrypto crypto;

  public static final String JSON_PROPERTY_SEN = "sen";
  private NetworkIdRoutingPolicySen sen;

  public static final String JSON_PROPERTY_SIGNET = "signet";
  private NetworkIdRoutingPolicySen signet;

  public static final String JSON_PROPERTY_SEN_TEST = "sen_test";
  private NetworkIdRoutingPolicySenTest senTest;

  public static final String JSON_PROPERTY_SIGNET_TEST = "signet_test";
  private NetworkIdRoutingPolicySenTest signetTest;

  public NetworkIdRoutingPolicy() { 
  }

  public NetworkIdRoutingPolicy crypto(NetworkIdRoutingPolicyCrypto crypto) {
    this.crypto = crypto;
    return this;
  }

   /**
   * Get crypto
   * @return crypto
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRYPTO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkIdRoutingPolicyCrypto getCrypto() {
    return crypto;
  }


  @JsonProperty(JSON_PROPERTY_CRYPTO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrypto(NetworkIdRoutingPolicyCrypto crypto) {
    this.crypto = crypto;
  }


  public NetworkIdRoutingPolicy sen(NetworkIdRoutingPolicySen sen) {
    this.sen = sen;
    return this;
  }

   /**
   * Get sen
   * @return sen
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkIdRoutingPolicySen getSen() {
    return sen;
  }


  @JsonProperty(JSON_PROPERTY_SEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSen(NetworkIdRoutingPolicySen sen) {
    this.sen = sen;
  }


  public NetworkIdRoutingPolicy signet(NetworkIdRoutingPolicySen signet) {
    this.signet = signet;
    return this;
  }

   /**
   * Get signet
   * @return signet
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkIdRoutingPolicySen getSignet() {
    return signet;
  }


  @JsonProperty(JSON_PROPERTY_SIGNET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignet(NetworkIdRoutingPolicySen signet) {
    this.signet = signet;
  }


  public NetworkIdRoutingPolicy senTest(NetworkIdRoutingPolicySenTest senTest) {
    this.senTest = senTest;
    return this;
  }

   /**
   * Get senTest
   * @return senTest
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEN_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkIdRoutingPolicySenTest getSenTest() {
    return senTest;
  }


  @JsonProperty(JSON_PROPERTY_SEN_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSenTest(NetworkIdRoutingPolicySenTest senTest) {
    this.senTest = senTest;
  }


  public NetworkIdRoutingPolicy signetTest(NetworkIdRoutingPolicySenTest signetTest) {
    this.signetTest = signetTest;
    return this;
  }

   /**
   * Get signetTest
   * @return signetTest
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNET_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkIdRoutingPolicySenTest getSignetTest() {
    return signetTest;
  }


  @JsonProperty(JSON_PROPERTY_SIGNET_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignetTest(NetworkIdRoutingPolicySenTest signetTest) {
    this.signetTest = signetTest;
  }


  /**
   * Return true if this NetworkIdRoutingPolicy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkIdRoutingPolicy networkIdRoutingPolicy = (NetworkIdRoutingPolicy) o;
    return Objects.equals(this.crypto, networkIdRoutingPolicy.crypto) &&
        Objects.equals(this.sen, networkIdRoutingPolicy.sen) &&
        Objects.equals(this.signet, networkIdRoutingPolicy.signet) &&
        Objects.equals(this.senTest, networkIdRoutingPolicy.senTest) &&
        Objects.equals(this.signetTest, networkIdRoutingPolicy.signetTest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crypto, sen, signet, senTest, signetTest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkIdRoutingPolicy {\n");
    sb.append("    crypto: ").append(toIndentedString(crypto)).append("\n");
    sb.append("    sen: ").append(toIndentedString(sen)).append("\n");
    sb.append("    signet: ").append(toIndentedString(signet)).append("\n");
    sb.append("    senTest: ").append(toIndentedString(senTest)).append("\n");
    sb.append("    signetTest: ").append(toIndentedString(signetTest)).append("\n");
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

