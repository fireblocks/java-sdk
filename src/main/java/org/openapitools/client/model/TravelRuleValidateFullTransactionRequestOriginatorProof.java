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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Ownership proof related to the originator of the transaction
 */
@JsonPropertyOrder({
  TravelRuleValidateFullTransactionRequestOriginatorProof.JSON_PROPERTY_TYPE,
  TravelRuleValidateFullTransactionRequestOriginatorProof.JSON_PROPERTY_ID,
  TravelRuleValidateFullTransactionRequestOriginatorProof.JSON_PROPERTY_NAME,
  TravelRuleValidateFullTransactionRequestOriginatorProof.JSON_PROPERTY_COUNTRY,
  TravelRuleValidateFullTransactionRequestOriginatorProof.JSON_PROPERTY_ISSUE_DATE,
  TravelRuleValidateFullTransactionRequestOriginatorProof.JSON_PROPERTY_ISSUER
})
@JsonTypeName("TravelRuleValidateFullTransactionRequest_originatorProof")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TravelRuleValidateFullTransactionRequestOriginatorProof {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_ISSUE_DATE = "issueDate";
  private String issueDate;

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private String issuer;

  public TravelRuleValidateFullTransactionRequestOriginatorProof() {
  }

  public TravelRuleValidateFullTransactionRequestOriginatorProof type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of ownership proof
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public TravelRuleValidateFullTransactionRequestOriginatorProof id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identification number
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public TravelRuleValidateFullTransactionRequestOriginatorProof name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of owner
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


  public TravelRuleValidateFullTransactionRequestOriginatorProof country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country of issuance
   * @return country
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountry(String country) {
    this.country = country;
  }


  public TravelRuleValidateFullTransactionRequestOriginatorProof issueDate(String issueDate) {
    
    this.issueDate = issueDate;
    return this;
  }

   /**
   * Date of issuance
   * @return issueDate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ISSUE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIssueDate() {
    return issueDate;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }


  public TravelRuleValidateFullTransactionRequestOriginatorProof issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Name of issuing entity
   * @return issuer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIssuer() {
    return issuer;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelRuleValidateFullTransactionRequestOriginatorProof travelRuleValidateFullTransactionRequestOriginatorProof = (TravelRuleValidateFullTransactionRequestOriginatorProof) o;
    return Objects.equals(this.type, travelRuleValidateFullTransactionRequestOriginatorProof.type) &&
        Objects.equals(this.id, travelRuleValidateFullTransactionRequestOriginatorProof.id) &&
        Objects.equals(this.name, travelRuleValidateFullTransactionRequestOriginatorProof.name) &&
        Objects.equals(this.country, travelRuleValidateFullTransactionRequestOriginatorProof.country) &&
        Objects.equals(this.issueDate, travelRuleValidateFullTransactionRequestOriginatorProof.issueDate) &&
        Objects.equals(this.issuer, travelRuleValidateFullTransactionRequestOriginatorProof.issuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, name, country, issueDate, issuer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelRuleValidateFullTransactionRequestOriginatorProof {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `country` to the URL query string
    if (getCountry() != null) {
      try {
        joiner.add(String.format("%scountry%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCountry()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `issueDate` to the URL query string
    if (getIssueDate() != null) {
      try {
        joiner.add(String.format("%sissueDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIssueDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `issuer` to the URL query string
    if (getIssuer() != null) {
      try {
        joiner.add(String.format("%sissuer%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIssuer()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

