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
import org.openapitools.client.model.CustomCryptoRoutingDest;
import org.openapitools.client.model.DefaultNetworkRoutingDest;
import org.openapitools.client.model.NoneNetworkRoutingDest;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * NetworkConnectionRoutingPolicyCrypto
 */
@JsonPropertyOrder({
  NetworkConnectionRoutingPolicyCrypto.JSON_PROPERTY_SCHEME,
  NetworkConnectionRoutingPolicyCrypto.JSON_PROPERTY_DST_TYPE,
  NetworkConnectionRoutingPolicyCrypto.JSON_PROPERTY_DST_ID
})
@JsonTypeName("NetworkConnectionRoutingPolicy_crypto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetworkConnectionRoutingPolicyCrypto {
  /**
   * No network routing logic.
   */
  public enum SchemeEnum {
    NONE("NONE");

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

  /**
   * The type of destination account the funds are being sent to.
   */
  public enum DstTypeEnum {
    VAULT("VAULT"),
    
    EXCHANGE("EXCHANGE");

    private String value;

    DstTypeEnum(String value) {
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
    public static DstTypeEnum fromValue(String value) {
      for (DstTypeEnum b : DstTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DST_TYPE = "dstType";
  private DstTypeEnum dstType;

  public static final String JSON_PROPERTY_DST_ID = "dstId";
  private String dstId;

  public NetworkConnectionRoutingPolicyCrypto() {
  }

  public NetworkConnectionRoutingPolicyCrypto scheme(SchemeEnum scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * No network routing logic.
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


  public NetworkConnectionRoutingPolicyCrypto dstType(DstTypeEnum dstType) {
    
    this.dstType = dstType;
    return this;
  }

   /**
   * The type of destination account the funds are being sent to.
   * @return dstType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DstTypeEnum getDstType() {
    return dstType;
  }


  @JsonProperty(JSON_PROPERTY_DST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDstType(DstTypeEnum dstType) {
    this.dstType = dstType;
  }


  public NetworkConnectionRoutingPolicyCrypto dstId(String dstId) {
    
    this.dstId = dstId;
    return this;
  }

   /**
   * The ID of the destination account the funds are being sent to.
   * @return dstId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDstId() {
    return dstId;
  }


  @JsonProperty(JSON_PROPERTY_DST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDstId(String dstId) {
    this.dstId = dstId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkConnectionRoutingPolicyCrypto networkConnectionRoutingPolicyCrypto = (NetworkConnectionRoutingPolicyCrypto) o;
    return Objects.equals(this.scheme, networkConnectionRoutingPolicyCrypto.scheme) &&
        Objects.equals(this.dstType, networkConnectionRoutingPolicyCrypto.dstType) &&
        Objects.equals(this.dstId, networkConnectionRoutingPolicyCrypto.dstId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheme, dstType, dstId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkConnectionRoutingPolicyCrypto {\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    dstType: ").append(toIndentedString(dstType)).append("\n");
    sb.append("    dstId: ").append(toIndentedString(dstId)).append("\n");
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

    // add `scheme` to the URL query string
    if (getScheme() != null) {
      try {
        joiner.add(String.format("%sscheme%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScheme()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dstType` to the URL query string
    if (getDstType() != null) {
      try {
        joiner.add(String.format("%sdstType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDstType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dstId` to the URL query string
    if (getDstId() != null) {
      try {
        joiner.add(String.format("%sdstId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDstId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

