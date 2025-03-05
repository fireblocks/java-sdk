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
import java.util.Objects;
import java.util.StringJoiner;

/** TravelRuleValidateTransactionRequest */
@JsonPropertyOrder({
    TravelRuleValidateTransactionRequest.JSON_PROPERTY_TRANSACTION_ASSET,
    TravelRuleValidateTransactionRequest.JSON_PROPERTY_DESTINATION,
    TravelRuleValidateTransactionRequest.JSON_PROPERTY_TRANSACTION_AMOUNT,
    TravelRuleValidateTransactionRequest.JSON_PROPERTY_ORIGINATOR_V_A_S_PDID,
    TravelRuleValidateTransactionRequest.JSON_PROPERTY_ORIGINATOR_EQUALS_BENEFICIARY,
    TravelRuleValidateTransactionRequest.JSON_PROPERTY_TRAVEL_RULE_BEHAVIOR,
    TravelRuleValidateTransactionRequest.JSON_PROPERTY_BENEFICIARY_V_A_S_PDID,
    TravelRuleValidateTransactionRequest.JSON_PROPERTY_BENEFICIARY_V_A_S_PNAME,
    TravelRuleValidateTransactionRequest.JSON_PROPERTY_BENEFICIARY_NAME,
    TravelRuleValidateTransactionRequest.JSON_PROPERTY_BENEFICIARY_ACCOUNT_NUMBER,
    TravelRuleValidateTransactionRequest.JSON_PROPERTY_BENEFICIARY_ADDRESS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TravelRuleValidateTransactionRequest {
    public static final String JSON_PROPERTY_TRANSACTION_ASSET = "transactionAsset";
    private String transactionAsset;

    public static final String JSON_PROPERTY_DESTINATION = "destination";
    private String destination;

    public static final String JSON_PROPERTY_TRANSACTION_AMOUNT = "transactionAmount";
    private String transactionAmount;

    public static final String JSON_PROPERTY_ORIGINATOR_V_A_S_PDID = "originatorVASPdid";
    private String originatorVASPdid;

    public static final String JSON_PROPERTY_ORIGINATOR_EQUALS_BENEFICIARY =
            "originatorEqualsBeneficiary";
    private Boolean originatorEqualsBeneficiary;

    public static final String JSON_PROPERTY_TRAVEL_RULE_BEHAVIOR = "travelRuleBehavior";
    private Boolean travelRuleBehavior;

    public static final String JSON_PROPERTY_BENEFICIARY_V_A_S_PDID = "beneficiaryVASPdid";
    private String beneficiaryVASPdid;

    public static final String JSON_PROPERTY_BENEFICIARY_V_A_S_PNAME = "beneficiaryVASPname";
    private String beneficiaryVASPname;

    public static final String JSON_PROPERTY_BENEFICIARY_NAME = "beneficiaryName";
    private String beneficiaryName;

    public static final String JSON_PROPERTY_BENEFICIARY_ACCOUNT_NUMBER =
            "beneficiaryAccountNumber";
    private String beneficiaryAccountNumber;

    public static final String JSON_PROPERTY_BENEFICIARY_ADDRESS = "beneficiaryAddress";
    private TravelRuleAddress beneficiaryAddress;

    public TravelRuleValidateTransactionRequest() {}

    public TravelRuleValidateTransactionRequest transactionAsset(String transactionAsset) {
        this.transactionAsset = transactionAsset;
        return this;
    }

    /**
     * Transaction asset symbol BTC,ETH)
     *
     * @return transactionAsset
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TRANSACTION_ASSET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTransactionAsset() {
        return transactionAsset;
    }

    @JsonProperty(JSON_PROPERTY_TRANSACTION_ASSET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTransactionAsset(String transactionAsset) {
        this.transactionAsset = transactionAsset;
    }

    public TravelRuleValidateTransactionRequest destination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Transaction destination address
     *
     * @return destination
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_DESTINATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getDestination() {
        return destination;
    }

    @JsonProperty(JSON_PROPERTY_DESTINATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public TravelRuleValidateTransactionRequest transactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
        return this;
    }

    /**
     * Transaction amount in the transaction asset
     *
     * @return transactionAmount
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TRANSACTION_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTransactionAmount() {
        return transactionAmount;
    }

    @JsonProperty(JSON_PROPERTY_TRANSACTION_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public TravelRuleValidateTransactionRequest originatorVASPdid(String originatorVASPdid) {
        this.originatorVASPdid = originatorVASPdid;
        return this;
    }

    /**
     * This is the identifier assigned to your VASP
     *
     * @return originatorVASPdid
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ORIGINATOR_V_A_S_PDID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getOriginatorVASPdid() {
        return originatorVASPdid;
    }

    @JsonProperty(JSON_PROPERTY_ORIGINATOR_V_A_S_PDID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOriginatorVASPdid(String originatorVASPdid) {
        this.originatorVASPdid = originatorVASPdid;
    }

    public TravelRuleValidateTransactionRequest originatorEqualsBeneficiary(
            Boolean originatorEqualsBeneficiary) {
        this.originatorEqualsBeneficiary = originatorEqualsBeneficiary;
        return this;
    }

    /**
     * \&quot;True\&quot; if the originator and beneficiary is the same person and you therefore do
     * not need to collect any information. \&quot;False\&quot; if it is a third-party transfer.
     *
     * @return originatorEqualsBeneficiary
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ORIGINATOR_EQUALS_BENEFICIARY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getOriginatorEqualsBeneficiary() {
        return originatorEqualsBeneficiary;
    }

    @JsonProperty(JSON_PROPERTY_ORIGINATOR_EQUALS_BENEFICIARY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOriginatorEqualsBeneficiary(Boolean originatorEqualsBeneficiary) {
        this.originatorEqualsBeneficiary = originatorEqualsBeneficiary;
    }

    public TravelRuleValidateTransactionRequest travelRuleBehavior(Boolean travelRuleBehavior) {
        this.travelRuleBehavior = travelRuleBehavior;
        return this;
    }

    /**
     * This will also check if the transaction is a TRAVEL_RULE in the beneficiary VASP&#39;s
     * jurisdiction
     *
     * @return travelRuleBehavior
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TRAVEL_RULE_BEHAVIOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getTravelRuleBehavior() {
        return travelRuleBehavior;
    }

    @JsonProperty(JSON_PROPERTY_TRAVEL_RULE_BEHAVIOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTravelRuleBehavior(Boolean travelRuleBehavior) {
        this.travelRuleBehavior = travelRuleBehavior;
    }

    public TravelRuleValidateTransactionRequest beneficiaryVASPdid(String beneficiaryVASPdid) {
        this.beneficiaryVASPdid = beneficiaryVASPdid;
        return this;
    }

    /**
     * This is the identifier assigned to the VASP the funds are being sent to
     *
     * @return beneficiaryVASPdid
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_BENEFICIARY_V_A_S_PDID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBeneficiaryVASPdid() {
        return beneficiaryVASPdid;
    }

    @JsonProperty(JSON_PROPERTY_BENEFICIARY_V_A_S_PDID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBeneficiaryVASPdid(String beneficiaryVASPdid) {
        this.beneficiaryVASPdid = beneficiaryVASPdid;
    }

    public TravelRuleValidateTransactionRequest beneficiaryVASPname(String beneficiaryVASPname) {
        this.beneficiaryVASPname = beneficiaryVASPname;
        return this;
    }

    /**
     * Beneficiary VASP name
     *
     * @return beneficiaryVASPname
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_BENEFICIARY_V_A_S_PNAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBeneficiaryVASPname() {
        return beneficiaryVASPname;
    }

    @JsonProperty(JSON_PROPERTY_BENEFICIARY_V_A_S_PNAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBeneficiaryVASPname(String beneficiaryVASPname) {
        this.beneficiaryVASPname = beneficiaryVASPname;
    }

    public TravelRuleValidateTransactionRequest beneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
        return this;
    }

    /**
     * Beneficiary name
     *
     * @return beneficiaryName
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_BENEFICIARY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    @JsonProperty(JSON_PROPERTY_BENEFICIARY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public TravelRuleValidateTransactionRequest beneficiaryAccountNumber(
            String beneficiaryAccountNumber) {
        this.beneficiaryAccountNumber = beneficiaryAccountNumber;
        return this;
    }

    /**
     * Beneficiary name
     *
     * @return beneficiaryAccountNumber
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_BENEFICIARY_ACCOUNT_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBeneficiaryAccountNumber() {
        return beneficiaryAccountNumber;
    }

    @JsonProperty(JSON_PROPERTY_BENEFICIARY_ACCOUNT_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBeneficiaryAccountNumber(String beneficiaryAccountNumber) {
        this.beneficiaryAccountNumber = beneficiaryAccountNumber;
    }

    public TravelRuleValidateTransactionRequest beneficiaryAddress(
            TravelRuleAddress beneficiaryAddress) {
        this.beneficiaryAddress = beneficiaryAddress;
        return this;
    }

    /**
     * Beneficiary name
     *
     * @return beneficiaryAddress
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_BENEFICIARY_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TravelRuleAddress getBeneficiaryAddress() {
        return beneficiaryAddress;
    }

    @JsonProperty(JSON_PROPERTY_BENEFICIARY_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBeneficiaryAddress(TravelRuleAddress beneficiaryAddress) {
        this.beneficiaryAddress = beneficiaryAddress;
    }

    /** Return true if this TravelRuleValidateTransactionRequest object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TravelRuleValidateTransactionRequest travelRuleValidateTransactionRequest =
                (TravelRuleValidateTransactionRequest) o;
        return Objects.equals(
                        this.transactionAsset,
                        travelRuleValidateTransactionRequest.transactionAsset)
                && Objects.equals(
                        this.destination, travelRuleValidateTransactionRequest.destination)
                && Objects.equals(
                        this.transactionAmount,
                        travelRuleValidateTransactionRequest.transactionAmount)
                && Objects.equals(
                        this.originatorVASPdid,
                        travelRuleValidateTransactionRequest.originatorVASPdid)
                && Objects.equals(
                        this.originatorEqualsBeneficiary,
                        travelRuleValidateTransactionRequest.originatorEqualsBeneficiary)
                && Objects.equals(
                        this.travelRuleBehavior,
                        travelRuleValidateTransactionRequest.travelRuleBehavior)
                && Objects.equals(
                        this.beneficiaryVASPdid,
                        travelRuleValidateTransactionRequest.beneficiaryVASPdid)
                && Objects.equals(
                        this.beneficiaryVASPname,
                        travelRuleValidateTransactionRequest.beneficiaryVASPname)
                && Objects.equals(
                        this.beneficiaryName, travelRuleValidateTransactionRequest.beneficiaryName)
                && Objects.equals(
                        this.beneficiaryAccountNumber,
                        travelRuleValidateTransactionRequest.beneficiaryAccountNumber)
                && Objects.equals(
                        this.beneficiaryAddress,
                        travelRuleValidateTransactionRequest.beneficiaryAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                transactionAsset,
                destination,
                transactionAmount,
                originatorVASPdid,
                originatorEqualsBeneficiary,
                travelRuleBehavior,
                beneficiaryVASPdid,
                beneficiaryVASPname,
                beneficiaryName,
                beneficiaryAccountNumber,
                beneficiaryAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TravelRuleValidateTransactionRequest {\n");
        sb.append("    transactionAsset: ").append(toIndentedString(transactionAsset)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    transactionAmount: ")
                .append(toIndentedString(transactionAmount))
                .append("\n");
        sb.append("    originatorVASPdid: ")
                .append(toIndentedString(originatorVASPdid))
                .append("\n");
        sb.append("    originatorEqualsBeneficiary: ")
                .append(toIndentedString(originatorEqualsBeneficiary))
                .append("\n");
        sb.append("    travelRuleBehavior: ")
                .append(toIndentedString(travelRuleBehavior))
                .append("\n");
        sb.append("    beneficiaryVASPdid: ")
                .append(toIndentedString(beneficiaryVASPdid))
                .append("\n");
        sb.append("    beneficiaryVASPname: ")
                .append(toIndentedString(beneficiaryVASPname))
                .append("\n");
        sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
        sb.append("    beneficiaryAccountNumber: ")
                .append(toIndentedString(beneficiaryAccountNumber))
                .append("\n");
        sb.append("    beneficiaryAddress: ")
                .append(toIndentedString(beneficiaryAddress))
                .append("\n");
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

        // add `transactionAsset` to the URL query string
        if (getTransactionAsset() != null) {
            joiner.add(
                    String.format(
                            "%stransactionAsset%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getTransactionAsset()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `destination` to the URL query string
        if (getDestination() != null) {
            joiner.add(
                    String.format(
                            "%sdestination%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getDestination()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `transactionAmount` to the URL query string
        if (getTransactionAmount() != null) {
            joiner.add(
                    String.format(
                            "%stransactionAmount%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getTransactionAmount()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `originatorVASPdid` to the URL query string
        if (getOriginatorVASPdid() != null) {
            joiner.add(
                    String.format(
                            "%soriginatorVASPdid%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getOriginatorVASPdid()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `originatorEqualsBeneficiary` to the URL query string
        if (getOriginatorEqualsBeneficiary() != null) {
            joiner.add(
                    String.format(
                            "%soriginatorEqualsBeneficiary%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getOriginatorEqualsBeneficiary()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `travelRuleBehavior` to the URL query string
        if (getTravelRuleBehavior() != null) {
            joiner.add(
                    String.format(
                            "%stravelRuleBehavior%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getTravelRuleBehavior()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `beneficiaryVASPdid` to the URL query string
        if (getBeneficiaryVASPdid() != null) {
            joiner.add(
                    String.format(
                            "%sbeneficiaryVASPdid%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getBeneficiaryVASPdid()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `beneficiaryVASPname` to the URL query string
        if (getBeneficiaryVASPname() != null) {
            joiner.add(
                    String.format(
                            "%sbeneficiaryVASPname%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getBeneficiaryVASPname()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `beneficiaryName` to the URL query string
        if (getBeneficiaryName() != null) {
            joiner.add(
                    String.format(
                            "%sbeneficiaryName%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getBeneficiaryName()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `beneficiaryAccountNumber` to the URL query string
        if (getBeneficiaryAccountNumber() != null) {
            joiner.add(
                    String.format(
                            "%sbeneficiaryAccountNumber%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getBeneficiaryAccountNumber()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `beneficiaryAddress` to the URL query string
        if (getBeneficiaryAddress() != null) {
            joiner.add(
                    getBeneficiaryAddress()
                            .toUrlQueryString(prefix + "beneficiaryAddress" + suffix));
        }

        return joiner.toString();
    }
}
