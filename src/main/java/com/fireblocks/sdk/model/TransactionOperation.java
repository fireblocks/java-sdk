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


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * * &#x60;TRANSFER&#x60; - The default value for an operation. Transfers funds from one account to
 * another. UTXO blockchains allow multi-input and multi-output transfers. All other blockchains
 * allow transfers with one source address and one destination address. * &#x60;MINT&#x60; - Mints
 * new tokens. Supported for Stellar, Ripple and EVM-based blockchains. * &#x60;BURN&#x60; - Burns
 * tokens. Supported for Stellar, Ripple and EVM-based blockchains. * &#x60;CONTRACT_CALL&#x60; -
 * Calls a smart contract method for web3 operations on any EVM blockchain. The Fireblocks
 * [development
 * libraries](https://developers.fireblocks.com/docs/ethereum-development#convenience-libraries) are
 * recommended for building contract call transactions. * &#x60;PROGRAM_CALL&#x60; - Execute
 * multiple instructions on Solana blockchain. The @solana/web3.js library is recommended for
 * building program call transactions. Currently in beta and disabled * &#x60;TYPED_MESSAGE&#x60; -
 * An off-chain message in either Ethereum Personal Message or EIP712 format. Use it to sign
 * specific readable messages that are not actual transactions. [Learn more about typed
 * messages](https://developers.fireblocks.com/docs/typed-message-signing). * &#x60;RAW&#x60; - An
 * off-chain message with no predefined format. Use it to sign any message with your private key,
 * including protocols such as blockchains and custom transaction types that are not natively
 * supported by Fireblocks. [Learn more about raw signing
 * transactions.](https://developers.fireblocks.com/docs/raw-message-signing) * &#x60;APPROVE&#x60;
 * - Enables the approve function for a smart contract or wallet to withdraw from a designated
 * wallet. [Learn
 * more](https://support.fireblocks.io/hc/en-us/articles/4404616097426-Amount-Cap-for-Approve-transactions).
 */
public enum TransactionOperation {
    TRANSFER("TRANSFER"),

    BURN("BURN"),

    CONTRACT_CALL("CONTRACT_CALL"),

    PROGRAM_CALL("PROGRAM_CALL"),

    MINT("MINT"),

    RAW("RAW"),

    TYPED_MESSAGE("TYPED_MESSAGE"),

    APPROVE("APPROVE");

    private String value;

    TransactionOperation(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static TransactionOperation fromValue(String value) {
        for (TransactionOperation b : TransactionOperation.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    /**
     * Convert the instance into URL query string.
     *
     * @param prefix prefix of the query string
     * @return URL query string
     */
    public String toUrlQueryString(String prefix) {
        if (prefix == null) {
            prefix = "";
        }

        return String.format("%s=%s", prefix, this.toString());
    }
}
