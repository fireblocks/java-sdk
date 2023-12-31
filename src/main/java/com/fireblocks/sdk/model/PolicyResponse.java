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
import com.fireblocks.sdk.model.PolicyMetadata;
import com.fireblocks.sdk.model.PolicyRule;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * Response object for policy operations
 */
@JsonPropertyOrder({
  PolicyResponse.JSON_PROPERTY_RULES,
  PolicyResponse.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PolicyResponse {
  public static final String JSON_PROPERTY_RULES = "rules";
  private List<PolicyRule> rules = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private PolicyMetadata metadata;

  public PolicyResponse() { 
  }

  public PolicyResponse rules(List<PolicyRule> rules) {
    this.rules = rules;
    return this;
  }

  public PolicyResponse addRulesItem(PolicyRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * A set of policy rules
   * @return rules
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<PolicyRule> getRules() {
    return rules;
  }


  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRules(List<PolicyRule> rules) {
    this.rules = rules;
  }


  public PolicyResponse metadata(PolicyMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PolicyMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetadata(PolicyMetadata metadata) {
    this.metadata = metadata;
  }


  /**
   * Return true if this PolicyResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyResponse policyResponse = (PolicyResponse) o;
    return Objects.equals(this.rules, policyResponse.rules) &&
        Objects.equals(this.metadata, policyResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyResponse {\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

