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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * Information about the beneficiary of the transaction
 */
@JsonPropertyOrder({
  TravelRuleValidateFullTransactionRequestBeneficiary.JSON_PROPERTY_FULL_NAME,
  TravelRuleValidateFullTransactionRequestBeneficiary.JSON_PROPERTY_DATE_OF_BIRTH,
  TravelRuleValidateFullTransactionRequestBeneficiary.JSON_PROPERTY_PLACE_OF_BIRTH,
  TravelRuleValidateFullTransactionRequestBeneficiary.JSON_PROPERTY_ADDRESS,
  TravelRuleValidateFullTransactionRequestBeneficiary.JSON_PROPERTY_IDENTIFICATION_NUMBER,
  TravelRuleValidateFullTransactionRequestBeneficiary.JSON_PROPERTY_NATIONALITY,
  TravelRuleValidateFullTransactionRequestBeneficiary.JSON_PROPERTY_COUNTRY_OF_RESIDENCE,
  TravelRuleValidateFullTransactionRequestBeneficiary.JSON_PROPERTY_TAX_IDENTIFICATION_NUMBER,
  TravelRuleValidateFullTransactionRequestBeneficiary.JSON_PROPERTY_CUSTOMER_NUMBER
})
@JsonTypeName("TravelRuleValidateFullTransactionRequest_beneficiary")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TravelRuleValidateFullTransactionRequestBeneficiary {
  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private String dateOfBirth;

  public static final String JSON_PROPERTY_PLACE_OF_BIRTH = "placeOfBirth";
  private String placeOfBirth;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_IDENTIFICATION_NUMBER = "identificationNumber";
  private String identificationNumber;

  public static final String JSON_PROPERTY_NATIONALITY = "nationality";
  private String nationality;

  public static final String JSON_PROPERTY_COUNTRY_OF_RESIDENCE = "countryOfResidence";
  private String countryOfResidence;

  public static final String JSON_PROPERTY_TAX_IDENTIFICATION_NUMBER = "taxIdentificationNumber";
  private String taxIdentificationNumber;

  public static final String JSON_PROPERTY_CUSTOMER_NUMBER = "customerNumber";
  private String customerNumber;

  public TravelRuleValidateFullTransactionRequestBeneficiary() { 
  }

  public TravelRuleValidateFullTransactionRequestBeneficiary fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public TravelRuleValidateFullTransactionRequestBeneficiary dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDateOfBirth() {
    return dateOfBirth;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public TravelRuleValidateFullTransactionRequestBeneficiary placeOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
    return this;
  }

   /**
   * Get placeOfBirth
   * @return placeOfBirth
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLACE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlaceOfBirth() {
    return placeOfBirth;
  }


  @JsonProperty(JSON_PROPERTY_PLACE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }


  public TravelRuleValidateFullTransactionRequestBeneficiary address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(String address) {
    this.address = address;
  }


  public TravelRuleValidateFullTransactionRequestBeneficiary identificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
    return this;
  }

   /**
   * Get identificationNumber
   * @return identificationNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IDENTIFICATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIdentificationNumber() {
    return identificationNumber;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFICATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIdentificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
  }


  public TravelRuleValidateFullTransactionRequestBeneficiary nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

   /**
   * Get nationality
   * @return nationality
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NATIONALITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNationality() {
    return nationality;
  }


  @JsonProperty(JSON_PROPERTY_NATIONALITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public TravelRuleValidateFullTransactionRequestBeneficiary countryOfResidence(String countryOfResidence) {
    this.countryOfResidence = countryOfResidence;
    return this;
  }

   /**
   * Get countryOfResidence
   * @return countryOfResidence
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTRY_OF_RESIDENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCountryOfResidence() {
    return countryOfResidence;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_OF_RESIDENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountryOfResidence(String countryOfResidence) {
    this.countryOfResidence = countryOfResidence;
  }


  public TravelRuleValidateFullTransactionRequestBeneficiary taxIdentificationNumber(String taxIdentificationNumber) {
    this.taxIdentificationNumber = taxIdentificationNumber;
    return this;
  }

   /**
   * Get taxIdentificationNumber
   * @return taxIdentificationNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TAX_IDENTIFICATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTaxIdentificationNumber() {
    return taxIdentificationNumber;
  }


  @JsonProperty(JSON_PROPERTY_TAX_IDENTIFICATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTaxIdentificationNumber(String taxIdentificationNumber) {
    this.taxIdentificationNumber = taxIdentificationNumber;
  }


  public TravelRuleValidateFullTransactionRequestBeneficiary customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

   /**
   * Get customerNumber
   * @return customerNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CUSTOMER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCustomerNumber() {
    return customerNumber;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }


  /**
   * Return true if this TravelRuleValidateFullTransactionRequest_beneficiary object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelRuleValidateFullTransactionRequestBeneficiary travelRuleValidateFullTransactionRequestBeneficiary = (TravelRuleValidateFullTransactionRequestBeneficiary) o;
    return Objects.equals(this.fullName, travelRuleValidateFullTransactionRequestBeneficiary.fullName) &&
        Objects.equals(this.dateOfBirth, travelRuleValidateFullTransactionRequestBeneficiary.dateOfBirth) &&
        Objects.equals(this.placeOfBirth, travelRuleValidateFullTransactionRequestBeneficiary.placeOfBirth) &&
        Objects.equals(this.address, travelRuleValidateFullTransactionRequestBeneficiary.address) &&
        Objects.equals(this.identificationNumber, travelRuleValidateFullTransactionRequestBeneficiary.identificationNumber) &&
        Objects.equals(this.nationality, travelRuleValidateFullTransactionRequestBeneficiary.nationality) &&
        Objects.equals(this.countryOfResidence, travelRuleValidateFullTransactionRequestBeneficiary.countryOfResidence) &&
        Objects.equals(this.taxIdentificationNumber, travelRuleValidateFullTransactionRequestBeneficiary.taxIdentificationNumber) &&
        Objects.equals(this.customerNumber, travelRuleValidateFullTransactionRequestBeneficiary.customerNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, dateOfBirth, placeOfBirth, address, identificationNumber, nationality, countryOfResidence, taxIdentificationNumber, customerNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelRuleValidateFullTransactionRequestBeneficiary {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    placeOfBirth: ").append(toIndentedString(placeOfBirth)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    identificationNumber: ").append(toIndentedString(identificationNumber)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    countryOfResidence: ").append(toIndentedString(countryOfResidence)).append("\n");
    sb.append("    taxIdentificationNumber: ").append(toIndentedString(taxIdentificationNumber)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
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

