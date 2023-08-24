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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * Decoded data for &#x60;CONTRACT_CALL&#x60; operations. The Fireblocks [development libraries](https://developers.fireblocks.com/docs/ethereum-development#convenience-libraries) are recommended for setting this parameter&#39;s value.
 */
@JsonPropertyOrder({
  TransactionResponseContractCallDecodedData.JSON_PROPERTY_CONTRACT_NAME,
  TransactionResponseContractCallDecodedData.JSON_PROPERTY_FUNCTION_CALLS
})
@JsonTypeName("TransactionResponse_contractCallDecodedData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionResponseContractCallDecodedData {
  public static final String JSON_PROPERTY_CONTRACT_NAME = "contractName";
  private String contractName;

  public static final String JSON_PROPERTY_FUNCTION_CALLS = "functionCalls";
  private List<Object> functionCalls;

  public TransactionResponseContractCallDecodedData() { 
  }

  public TransactionResponseContractCallDecodedData contractName(String contractName) {
    this.contractName = contractName;
    return this;
  }

   /**
   * Get contractName
   * @return contractName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTRACT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContractName() {
    return contractName;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractName(String contractName) {
    this.contractName = contractName;
  }


  public TransactionResponseContractCallDecodedData functionCalls(List<Object> functionCalls) {
    this.functionCalls = functionCalls;
    return this;
  }

  public TransactionResponseContractCallDecodedData addFunctionCallsItem(Object functionCallsItem) {
    if (this.functionCalls == null) {
      this.functionCalls = new ArrayList<>();
    }
    this.functionCalls.add(functionCallsItem);
    return this;
  }

   /**
   * Get functionCalls
   * @return functionCalls
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNCTION_CALLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getFunctionCalls() {
    return functionCalls;
  }


  @JsonProperty(JSON_PROPERTY_FUNCTION_CALLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFunctionCalls(List<Object> functionCalls) {
    this.functionCalls = functionCalls;
  }


  /**
   * Return true if this TransactionResponse_contractCallDecodedData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResponseContractCallDecodedData transactionResponseContractCallDecodedData = (TransactionResponseContractCallDecodedData) o;
    return Objects.equals(this.contractName, transactionResponseContractCallDecodedData.contractName) &&
        Objects.equals(this.functionCalls, transactionResponseContractCallDecodedData.functionCalls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractName, functionCalls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResponseContractCallDecodedData {\n");
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
    sb.append("    functionCalls: ").append(toIndentedString(functionCalls)).append("\n");
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

