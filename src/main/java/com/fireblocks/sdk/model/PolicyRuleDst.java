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
import com.fireblocks.sdk.model.PolicyRuleSrcIdsInnerInner;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * Defines the destination accounts the rule allows transfers to
 */
@JsonPropertyOrder({
  PolicyRuleDst.JSON_PROPERTY_IDS
})
@JsonTypeName("PolicyRule_dst")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PolicyRuleDst {
  public static final String JSON_PROPERTY_IDS = "ids";
  private List<List<PolicyRuleSrcIdsInnerInner>> ids;

  public PolicyRuleDst() { 
  }

  public PolicyRuleDst ids(List<List<PolicyRuleSrcIdsInnerInner>> ids) {
    this.ids = ids;
    return this;
  }

  public PolicyRuleDst addIdsItem(List<PolicyRuleSrcIdsInnerInner> idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * A set of ids
   * @return ids
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<List<PolicyRuleSrcIdsInnerInner>> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(List<List<PolicyRuleSrcIdsInnerInner>> ids) {
    this.ids = ids;
  }


  /**
   * Return true if this PolicyRule_dst object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyRuleDst policyRuleDst = (PolicyRuleDst) o;
    return Objects.equals(this.ids, policyRuleDst.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyRuleDst {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

