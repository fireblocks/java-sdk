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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fireblocks.sdk.model.AuditorData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ContractAttributes
 */
@JsonPropertyOrder({
  ContractAttributes.JSON_PROPERTY_USE_CASES,
  ContractAttributes.JSON_PROPERTY_STANDARDS,
  ContractAttributes.JSON_PROPERTY_AUDITOR
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContractAttributes {
  public static final String JSON_PROPERTY_USE_CASES = "useCases";
  private List<String> useCases = new ArrayList<>();

  public static final String JSON_PROPERTY_STANDARDS = "standards";
  private List<String> standards = new ArrayList<>();

  public static final String JSON_PROPERTY_AUDITOR = "auditor";
  private AuditorData auditor;

  public ContractAttributes() { 
  }

  public ContractAttributes useCases(List<String> useCases) {
    this.useCases = useCases;
    return this;
  }

  public ContractAttributes addUseCasesItem(String useCasesItem) {
    if (this.useCases == null) {
      this.useCases = new ArrayList<>();
    }
    this.useCases.add(useCasesItem);
    return this;
  }

   /**
   * Get useCases
   * @return useCases
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USE_CASES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getUseCases() {
    return useCases;
  }


  @JsonProperty(JSON_PROPERTY_USE_CASES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUseCases(List<String> useCases) {
    this.useCases = useCases;
  }


  public ContractAttributes standards(List<String> standards) {
    this.standards = standards;
    return this;
  }

  public ContractAttributes addStandardsItem(String standardsItem) {
    if (this.standards == null) {
      this.standards = new ArrayList<>();
    }
    this.standards.add(standardsItem);
    return this;
  }

   /**
   * Get standards
   * @return standards
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STANDARDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getStandards() {
    return standards;
  }


  @JsonProperty(JSON_PROPERTY_STANDARDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStandards(List<String> standards) {
    this.standards = standards;
  }


  public ContractAttributes auditor(AuditorData auditor) {
    this.auditor = auditor;
    return this;
  }

   /**
   * Get auditor
   * @return auditor
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUDITOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AuditorData getAuditor() {
    return auditor;
  }


  @JsonProperty(JSON_PROPERTY_AUDITOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuditor(AuditorData auditor) {
    this.auditor = auditor;
  }


  /**
   * Return true if this ContractAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractAttributes contractAttributes = (ContractAttributes) o;
    return Objects.equals(this.useCases, contractAttributes.useCases) &&
        Objects.equals(this.standards, contractAttributes.standards) &&
        Objects.equals(this.auditor, contractAttributes.auditor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useCases, standards, auditor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractAttributes {\n");
    sb.append("    useCases: ").append(toIndentedString(useCases)).append("\n");
    sb.append("    standards: ").append(toIndentedString(standards)).append("\n");
    sb.append("    auditor: ").append(toIndentedString(auditor)).append("\n");
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

    // add `useCases` to the URL query string
    if (getUseCases() != null) {
      for (int i = 0; i < getUseCases().size(); i++) {
        joiner.add(String.format("%suseCases%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getUseCases().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `standards` to the URL query string
    if (getStandards() != null) {
      for (int i = 0; i < getStandards().size(); i++) {
        joiner.add(String.format("%sstandards%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getStandards().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `auditor` to the URL query string
    if (getAuditor() != null) {
      joiner.add(getAuditor().toUrlQueryString(prefix + "auditor" + suffix));
    }

    return joiner.toString();
  }
}

