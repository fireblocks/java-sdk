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
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Additional fields per blockchain - can be empty or missing if not initialized or no additional
 * info exists. The type depends on the chainDescriptor value. For Solana (SOL), stake account
 * address. For Ethereum (ETH), an empty object is returned as no specific data is available.
 */
@JsonPropertyOrder({
    SolanaBlockchainData.JSON_PROPERTY_STAKE_ACCOUNT_ADDRESS,
    SolanaBlockchainData.JSON_PROPERTY_STAKE_ACCOUNT_DERIVATION_CHANGE_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SolanaBlockchainData {
    public static final String JSON_PROPERTY_STAKE_ACCOUNT_ADDRESS = "stakeAccountAddress";
    private String stakeAccountAddress;

    public static final String JSON_PROPERTY_STAKE_ACCOUNT_DERIVATION_CHANGE_VALUE =
            "stakeAccountDerivationChangeValue";
    private BigDecimal stakeAccountDerivationChangeValue;

    public SolanaBlockchainData() {}

    public SolanaBlockchainData stakeAccountAddress(String stakeAccountAddress) {
        this.stakeAccountAddress = stakeAccountAddress;
        return this;
    }

    /**
     * The stake account address matching the stakeAccountId.
     *
     * @return stakeAccountAddress
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_STAKE_ACCOUNT_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getStakeAccountAddress() {
        return stakeAccountAddress;
    }

    @JsonProperty(JSON_PROPERTY_STAKE_ACCOUNT_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStakeAccountAddress(String stakeAccountAddress) {
        this.stakeAccountAddress = stakeAccountAddress;
    }

    public SolanaBlockchainData stakeAccountDerivationChangeValue(
            BigDecimal stakeAccountDerivationChangeValue) {
        this.stakeAccountDerivationChangeValue = stakeAccountDerivationChangeValue;
        return this;
    }

    /**
     * The value of the change level in the BIP44 path which was used to derive the stake account
     * address
     *
     * @return stakeAccountDerivationChangeValue
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_STAKE_ACCOUNT_DERIVATION_CHANGE_VALUE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BigDecimal getStakeAccountDerivationChangeValue() {
        return stakeAccountDerivationChangeValue;
    }

    @JsonProperty(JSON_PROPERTY_STAKE_ACCOUNT_DERIVATION_CHANGE_VALUE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStakeAccountDerivationChangeValue(BigDecimal stakeAccountDerivationChangeValue) {
        this.stakeAccountDerivationChangeValue = stakeAccountDerivationChangeValue;
    }

    /** Return true if this SolanaBlockchainData object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SolanaBlockchainData solanaBlockchainData = (SolanaBlockchainData) o;
        return Objects.equals(this.stakeAccountAddress, solanaBlockchainData.stakeAccountAddress)
                && Objects.equals(
                        this.stakeAccountDerivationChangeValue,
                        solanaBlockchainData.stakeAccountDerivationChangeValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stakeAccountAddress, stakeAccountDerivationChangeValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SolanaBlockchainData {\n");
        sb.append("    stakeAccountAddress: ")
                .append(toIndentedString(stakeAccountAddress))
                .append("\n");
        sb.append("    stakeAccountDerivationChangeValue: ")
                .append(toIndentedString(stakeAccountDerivationChangeValue))
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

        // add `stakeAccountAddress` to the URL query string
        if (getStakeAccountAddress() != null) {
            joiner.add(
                    String.format(
                            "%sstakeAccountAddress%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getStakeAccountAddress()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `stakeAccountDerivationChangeValue` to the URL query string
        if (getStakeAccountDerivationChangeValue() != null) {
            joiner.add(
                    String.format(
                            "%sstakeAccountDerivationChangeValue%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getStakeAccountDerivationChangeValue()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
