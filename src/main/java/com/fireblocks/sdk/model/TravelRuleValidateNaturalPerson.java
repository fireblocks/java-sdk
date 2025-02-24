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


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/** TravelRuleValidateNaturalPerson */
@JsonPropertyOrder({
    TravelRuleValidateNaturalPerson.JSON_PROPERTY_NAME,
    TravelRuleValidateNaturalPerson.JSON_PROPERTY_GEOGRAPHIC_ADDRESS,
    TravelRuleValidateNaturalPerson.JSON_PROPERTY_NATIONAL_IDENTIFICATION,
    TravelRuleValidateNaturalPerson.JSON_PROPERTY_DATE_AND_PLACE_OF_BIRTH,
    TravelRuleValidateNaturalPerson.JSON_PROPERTY_CUSTOMER_IDENTIFICATION,
    TravelRuleValidateNaturalPerson.JSON_PROPERTY_COUNTRY_OF_RESIDENCE,
    TravelRuleValidateNaturalPerson.JSON_PROPERTY_CUSTOMER_NUMBER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TravelRuleValidateNaturalPerson {
    public static final String JSON_PROPERTY_NAME = "name";
    private List<TravelRuleValidateNaturalPersonNameIdentifier> name;

    public static final String JSON_PROPERTY_GEOGRAPHIC_ADDRESS = "geographicAddress";
    private List<TravelRuleValidateGeographicAddress> geographicAddress;

    public static final String JSON_PROPERTY_NATIONAL_IDENTIFICATION = "nationalIdentification";
    private TravelRuleValidateNationalIdentification nationalIdentification;

    public static final String JSON_PROPERTY_DATE_AND_PLACE_OF_BIRTH = "dateAndPlaceOfBirth";
    private TravelRuleValidateDateAndPlaceOfBirth dateAndPlaceOfBirth;

    public static final String JSON_PROPERTY_CUSTOMER_IDENTIFICATION = "customerIdentification";
    private String customerIdentification;

    public static final String JSON_PROPERTY_COUNTRY_OF_RESIDENCE = "countryOfResidence";
    private String countryOfResidence;

    public static final String JSON_PROPERTY_CUSTOMER_NUMBER = "customerNumber";
    private String customerNumber;

    public TravelRuleValidateNaturalPerson() {}

    public TravelRuleValidateNaturalPerson name(
            List<TravelRuleValidateNaturalPersonNameIdentifier> name) {
        this.name = name;
        return this;
    }

    public TravelRuleValidateNaturalPerson addNameItem(
            TravelRuleValidateNaturalPersonNameIdentifier nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    /**
     * An array of structured name identifiers for the natural person, referencing the
     * TravelRuleNaturalPersonNameIdentifier schema.
     *
     * @return name
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<TravelRuleValidateNaturalPersonNameIdentifier> getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(List<TravelRuleValidateNaturalPersonNameIdentifier> name) {
        this.name = name;
    }

    public TravelRuleValidateNaturalPerson geographicAddress(
            List<TravelRuleValidateGeographicAddress> geographicAddress) {
        this.geographicAddress = geographicAddress;
        return this;
    }

    public TravelRuleValidateNaturalPerson addGeographicAddressItem(
            TravelRuleValidateGeographicAddress geographicAddressItem) {
        if (this.geographicAddress == null) {
            this.geographicAddress = new ArrayList<>();
        }
        this.geographicAddress.add(geographicAddressItem);
        return this;
    }

    /**
     * An array of geographic addresses associated with the natural person, referencing the
     * TravelRuleGeographicAddress schema.
     *
     * @return geographicAddress
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_GEOGRAPHIC_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<TravelRuleValidateGeographicAddress> getGeographicAddress() {
        return geographicAddress;
    }

    @JsonProperty(JSON_PROPERTY_GEOGRAPHIC_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setGeographicAddress(List<TravelRuleValidateGeographicAddress> geographicAddress) {
        this.geographicAddress = geographicAddress;
    }

    public TravelRuleValidateNaturalPerson nationalIdentification(
            TravelRuleValidateNationalIdentification nationalIdentification) {
        this.nationalIdentification = nationalIdentification;
        return this;
    }

    /**
     * Get nationalIdentification
     *
     * @return nationalIdentification
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_NATIONAL_IDENTIFICATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TravelRuleValidateNationalIdentification getNationalIdentification() {
        return nationalIdentification;
    }

    @JsonProperty(JSON_PROPERTY_NATIONAL_IDENTIFICATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNationalIdentification(
            TravelRuleValidateNationalIdentification nationalIdentification) {
        this.nationalIdentification = nationalIdentification;
    }

    public TravelRuleValidateNaturalPerson dateAndPlaceOfBirth(
            TravelRuleValidateDateAndPlaceOfBirth dateAndPlaceOfBirth) {
        this.dateAndPlaceOfBirth = dateAndPlaceOfBirth;
        return this;
    }

    /**
     * Get dateAndPlaceOfBirth
     *
     * @return dateAndPlaceOfBirth
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DATE_AND_PLACE_OF_BIRTH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TravelRuleValidateDateAndPlaceOfBirth getDateAndPlaceOfBirth() {
        return dateAndPlaceOfBirth;
    }

    @JsonProperty(JSON_PROPERTY_DATE_AND_PLACE_OF_BIRTH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDateAndPlaceOfBirth(TravelRuleValidateDateAndPlaceOfBirth dateAndPlaceOfBirth) {
        this.dateAndPlaceOfBirth = dateAndPlaceOfBirth;
    }

    public TravelRuleValidateNaturalPerson customerIdentification(String customerIdentification) {
        this.customerIdentification = customerIdentification;
        return this;
    }

    /**
     * A unique identifier for the customer within the organization&#39;s context.
     *
     * @return customerIdentification
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CUSTOMER_IDENTIFICATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCustomerIdentification() {
        return customerIdentification;
    }

    @JsonProperty(JSON_PROPERTY_CUSTOMER_IDENTIFICATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCustomerIdentification(String customerIdentification) {
        this.customerIdentification = customerIdentification;
    }

    public TravelRuleValidateNaturalPerson countryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
        return this;
    }

    /**
     * The ISO-3166 Alpha-2 country code of the natural person&#39;s residence.
     *
     * @return countryOfResidence
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_COUNTRY_OF_RESIDENCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    @JsonProperty(JSON_PROPERTY_COUNTRY_OF_RESIDENCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public TravelRuleValidateNaturalPerson customerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    /**
     * A distinct identifier that uniquely identifies the customer within the organization.
     *
     * @return customerNumber
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CUSTOMER_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCustomerNumber() {
        return customerNumber;
    }

    @JsonProperty(JSON_PROPERTY_CUSTOMER_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    /** Return true if this TravelRuleValidateNaturalPerson object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TravelRuleValidateNaturalPerson travelRuleValidateNaturalPerson =
                (TravelRuleValidateNaturalPerson) o;
        return Objects.equals(this.name, travelRuleValidateNaturalPerson.name)
                && Objects.equals(
                        this.geographicAddress, travelRuleValidateNaturalPerson.geographicAddress)
                && Objects.equals(
                        this.nationalIdentification,
                        travelRuleValidateNaturalPerson.nationalIdentification)
                && Objects.equals(
                        this.dateAndPlaceOfBirth,
                        travelRuleValidateNaturalPerson.dateAndPlaceOfBirth)
                && Objects.equals(
                        this.customerIdentification,
                        travelRuleValidateNaturalPerson.customerIdentification)
                && Objects.equals(
                        this.countryOfResidence, travelRuleValidateNaturalPerson.countryOfResidence)
                && Objects.equals(
                        this.customerNumber, travelRuleValidateNaturalPerson.customerNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                geographicAddress,
                nationalIdentification,
                dateAndPlaceOfBirth,
                customerIdentification,
                countryOfResidence,
                customerNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TravelRuleValidateNaturalPerson {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    geographicAddress: ")
                .append(toIndentedString(geographicAddress))
                .append("\n");
        sb.append("    nationalIdentification: ")
                .append(toIndentedString(nationalIdentification))
                .append("\n");
        sb.append("    dateAndPlaceOfBirth: ")
                .append(toIndentedString(dateAndPlaceOfBirth))
                .append("\n");
        sb.append("    customerIdentification: ")
                .append(toIndentedString(customerIdentification))
                .append("\n");
        sb.append("    countryOfResidence: ")
                .append(toIndentedString(countryOfResidence))
                .append("\n");
        sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
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

        // add `name` to the URL query string
        if (getName() != null) {
            for (int i = 0; i < getName().size(); i++) {
                if (getName().get(i) != null) {
                    joiner.add(
                            getName()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%sname%s%s",
                                                    prefix,
                                                    suffix,
                                                    "".equals(suffix)
                                                            ? ""
                                                            : String.format(
                                                                    "%s%d%s",
                                                                    containerPrefix,
                                                                    i,
                                                                    containerSuffix))));
                }
            }
        }

        // add `geographicAddress` to the URL query string
        if (getGeographicAddress() != null) {
            for (int i = 0; i < getGeographicAddress().size(); i++) {
                if (getGeographicAddress().get(i) != null) {
                    joiner.add(
                            getGeographicAddress()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%sgeographicAddress%s%s",
                                                    prefix,
                                                    suffix,
                                                    "".equals(suffix)
                                                            ? ""
                                                            : String.format(
                                                                    "%s%d%s",
                                                                    containerPrefix,
                                                                    i,
                                                                    containerSuffix))));
                }
            }
        }

        // add `nationalIdentification` to the URL query string
        if (getNationalIdentification() != null) {
            joiner.add(
                    getNationalIdentification()
                            .toUrlQueryString(prefix + "nationalIdentification" + suffix));
        }

        // add `dateAndPlaceOfBirth` to the URL query string
        if (getDateAndPlaceOfBirth() != null) {
            joiner.add(
                    getDateAndPlaceOfBirth()
                            .toUrlQueryString(prefix + "dateAndPlaceOfBirth" + suffix));
        }

        // add `customerIdentification` to the URL query string
        if (getCustomerIdentification() != null) {
            joiner.add(
                    String.format(
                            "%scustomerIdentification%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getCustomerIdentification()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `countryOfResidence` to the URL query string
        if (getCountryOfResidence() != null) {
            joiner.add(
                    String.format(
                            "%scountryOfResidence%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getCountryOfResidence()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `customerNumber` to the URL query string
        if (getCustomerNumber() != null) {
            joiner.add(
                    String.format(
                            "%scustomerNumber%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getCustomerNumber()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
