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


package org.openapitools.client.model;
import com.sun.jersey.api.client.GenericType;
import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.NetworkIdRoutingPolicyCrypto;
import org.openapitools.client.model.NetworkIdRoutingPolicySen;
import org.openapitools.client.model.NetworkIdRoutingPolicySenTest;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

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

    // add `crypto` to the URL query string
    if (getCrypto() != null) {
      joiner.add(getCrypto().toUrlQueryString(prefix + "crypto" + suffix));
    }

    // add `sen` to the URL query string
    if (getSen() != null) {
      joiner.add(getSen().toUrlQueryString(prefix + "sen" + suffix));
    }

    // add `signet` to the URL query string
    if (getSignet() != null) {
      joiner.add(getSignet().toUrlQueryString(prefix + "signet" + suffix));
    }

    // add `sen_test` to the URL query string
    if (getSenTest() != null) {
      joiner.add(getSenTest().toUrlQueryString(prefix + "sen_test" + suffix));
    }

    // add `signet_test` to the URL query string
    if (getSignetTest() != null) {
      joiner.add(getSignetTest().toUrlQueryString(prefix + "signet_test" + suffix));
    }

    return joiner.toString();
  }

}

