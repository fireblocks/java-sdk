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
import com.fireblocks.sdk.model.DisbursementInstructionOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DisbursementOperationExecutionOutput
 */
@JsonPropertyOrder({
  DisbursementOperationExecutionOutput.JSON_PROPERTY_INSTRUCTION_SET
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DisbursementOperationExecutionOutput {
  public static final String JSON_PROPERTY_INSTRUCTION_SET = "instructionSet";
  private List<DisbursementInstructionOutput> instructionSet = new ArrayList<>();

  public DisbursementOperationExecutionOutput() { 
  }

  public DisbursementOperationExecutionOutput instructionSet(List<DisbursementInstructionOutput> instructionSet) {
    this.instructionSet = instructionSet;
    return this;
  }

  public DisbursementOperationExecutionOutput addInstructionSetItem(DisbursementInstructionOutput instructionSetItem) {
    if (this.instructionSet == null) {
      this.instructionSet = new ArrayList<>();
    }
    this.instructionSet.add(instructionSetItem);
    return this;
  }

   /**
   * Get instructionSet
   * @return instructionSet
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INSTRUCTION_SET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<DisbursementInstructionOutput> getInstructionSet() {
    return instructionSet;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUCTION_SET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstructionSet(List<DisbursementInstructionOutput> instructionSet) {
    this.instructionSet = instructionSet;
  }


  /**
   * Return true if this DisbursementOperationExecutionOutput object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisbursementOperationExecutionOutput disbursementOperationExecutionOutput = (DisbursementOperationExecutionOutput) o;
    return Objects.equals(this.instructionSet, disbursementOperationExecutionOutput.instructionSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructionSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisbursementOperationExecutionOutput {\n");
    sb.append("    instructionSet: ").append(toIndentedString(instructionSet)).append("\n");
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

    // add `instructionSet` to the URL query string
    if (getInstructionSet() != null) {
      for (int i = 0; i < getInstructionSet().size(); i++) {
        if (getInstructionSet().get(i) != null) {
          joiner.add(getInstructionSet().get(i).toUrlQueryString(String.format("%sinstructionSet%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

