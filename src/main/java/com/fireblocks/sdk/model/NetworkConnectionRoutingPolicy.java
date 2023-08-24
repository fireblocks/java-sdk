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
import com.fireblocks.sdk.model.NetworkConnectionRoutingPolicyCrypto;
import com.fireblocks.sdk.model.NetworkConnectionRoutingPolicySen;
import com.fireblocks.sdk.model.NetworkConnectionRoutingPolicySenTest;
import com.fireblocks.sdk.model.NetworkConnectionRoutingPolicySignet;
import com.fireblocks.sdk.model.NetworkConnectionRoutingPolicySignetTest;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * NetworkConnectionRoutingPolicy
 */
@JsonPropertyOrder({
  NetworkConnectionRoutingPolicy.JSON_PROPERTY_CRYPTO,
  NetworkConnectionRoutingPolicy.JSON_PROPERTY_SEN,
  NetworkConnectionRoutingPolicy.JSON_PROPERTY_SIGNET,
  NetworkConnectionRoutingPolicy.JSON_PROPERTY_SEN_TEST,
  NetworkConnectionRoutingPolicy.JSON_PROPERTY_SIGNET_TEST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetworkConnectionRoutingPolicy {
  public static final String JSON_PROPERTY_CRYPTO = "crypto";
  private NetworkConnectionRoutingPolicyCrypto crypto;

  public static final String JSON_PROPERTY_SEN = "sen";
  private NetworkConnectionRoutingPolicySen sen;

  public static final String JSON_PROPERTY_SIGNET = "signet";
  private NetworkConnectionRoutingPolicySignet signet;

  public static final String JSON_PROPERTY_SEN_TEST = "sen_test";
  private NetworkConnectionRoutingPolicySenTest senTest;

  public static final String JSON_PROPERTY_SIGNET_TEST = "signet_test";
  private NetworkConnectionRoutingPolicySignetTest signetTest;

  public NetworkConnectionRoutingPolicy() { 
  }

  public NetworkConnectionRoutingPolicy crypto(NetworkConnectionRoutingPolicyCrypto crypto) {
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

  public NetworkConnectionRoutingPolicyCrypto getCrypto() {
    return crypto;
  }


  @JsonProperty(JSON_PROPERTY_CRYPTO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrypto(NetworkConnectionRoutingPolicyCrypto crypto) {
    this.crypto = crypto;
  }


  public NetworkConnectionRoutingPolicy sen(NetworkConnectionRoutingPolicySen sen) {
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

  public NetworkConnectionRoutingPolicySen getSen() {
    return sen;
  }


  @JsonProperty(JSON_PROPERTY_SEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSen(NetworkConnectionRoutingPolicySen sen) {
    this.sen = sen;
  }


  public NetworkConnectionRoutingPolicy signet(NetworkConnectionRoutingPolicySignet signet) {
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

  public NetworkConnectionRoutingPolicySignet getSignet() {
    return signet;
  }


  @JsonProperty(JSON_PROPERTY_SIGNET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignet(NetworkConnectionRoutingPolicySignet signet) {
    this.signet = signet;
  }


  public NetworkConnectionRoutingPolicy senTest(NetworkConnectionRoutingPolicySenTest senTest) {
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

  public NetworkConnectionRoutingPolicySenTest getSenTest() {
    return senTest;
  }


  @JsonProperty(JSON_PROPERTY_SEN_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSenTest(NetworkConnectionRoutingPolicySenTest senTest) {
    this.senTest = senTest;
  }


  public NetworkConnectionRoutingPolicy signetTest(NetworkConnectionRoutingPolicySignetTest signetTest) {
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

  public NetworkConnectionRoutingPolicySignetTest getSignetTest() {
    return signetTest;
  }


  @JsonProperty(JSON_PROPERTY_SIGNET_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignetTest(NetworkConnectionRoutingPolicySignetTest signetTest) {
    this.signetTest = signetTest;
  }


  /**
   * Return true if this NetworkConnectionRoutingPolicy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkConnectionRoutingPolicy networkConnectionRoutingPolicy = (NetworkConnectionRoutingPolicy) o;
    return Objects.equals(this.crypto, networkConnectionRoutingPolicy.crypto) &&
        Objects.equals(this.sen, networkConnectionRoutingPolicy.sen) &&
        Objects.equals(this.signet, networkConnectionRoutingPolicy.signet) &&
        Objects.equals(this.senTest, networkConnectionRoutingPolicy.senTest) &&
        Objects.equals(this.signetTest, networkConnectionRoutingPolicy.signetTest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crypto, sen, signet, senTest, signetTest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkConnectionRoutingPolicy {\n");
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
