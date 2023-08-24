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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * * &#x60;TRANSFER&#x60; - Transfers funds from one account to another. UTXO blockchains allow multi-input and multi-output transfers. All other blockchains allow transfers with one source address and one destination address. * &#x60;MINT&#x60; - Mints new tokens. Supported for Stellar, Ripple and EVM-based blockchains. * &#x60;BURN&#x60; - Burns tokens. Supported for Stellar, Ripple and EVM-based blockchains. * &#x60;CONTRACT_CALL&#x60; - Calls a smart contract method for web3 operations on any EVM blockchain. The Fireblocks [development libraries](https://developers.fireblocks.com/docs/ethereum-development#convenience-libraries) are recommended for building contract call transactions. * &#x60;TYPED_MESSAGE&#x60; - An off-chain message in either Ethereum Personal Message or EIP712 format. Use it to sign specific readable messages that are not actual transactions. [Learn more about typed messages](https://developers.fireblocks.com/docs/typed-message-signing). * &#x60;RAW&#x60; - An off-chain message with no predefined format. Use it to sign any message with your private key, including protocols such as blockchains and custom transaction types that are not natively supported by Fireblocks. [Learn more about raw signing transactions.](https://developers.fireblocks.com/docs/raw-message-signing) * &#x60;ENABLE_ASSET&#x60; - Algorand, DigitalBits, Solana, and Stellar require an on-chain transaction to create an asset wallet and enable the deposit address. This transaction is automatically created when adding assets on these blockchains at a vault account. * &#x60;STAKE&#x60; - Assign assets to a staking pool managed by a staking validator. Supported for Stellar and EVM-based blockchains. This transaction is automatically created when performing staking operations. * &#x60;UNSTAKE&#x60; - Remove assets from a staking pool managed by a staking validator. Supported for Stellar and EVM-based blockchains. This transaction is automatically created when performing staking operations. * &#x60;WITHDRAW&#x60; - Transfer assets from a dedicated staking vault account to another address. Supported for Stellar and EVM-based blockchains. This transaction is automatically created when performing staking operations.      **Note:** Fireblocks will rename this type from &#x60;WITHDRAW&#x60; to a different type name soon. There will be a 7-day notice regarding the new type name.  * &#x60;SUPPLY_TO_COMPOUND&#x60; - Deprecated since April 1st, 2023. Older transactions may have this as their operation, in case users in the workspace have used the direct integration between Fireblocks and the Compound DeFI protocol. * &#x60;REDEEM_FROM_COMPOUND&#x60; - Deprecated since April 1st, 2023. Older transactions may have this as their operation, in case users in the workspace have used the direct integration between Fireblocks and the Compound DeFI protocol. 
 */
public enum GetTransactionOperation {
  
  TRANSFER("TRANSFER"),
  
  BURN("BURN"),
  
  CONTRACT_CALL("CONTRACT_CALL"),
  
  MINT("MINT"),
  
  RAW("RAW"),
  
  TYPED_MESSAGE("TYPED_MESSAGE"),
  
  ENABLE_ASSET("ENABLE_ASSET"),
  
  STAKE("STAKE"),
  
  UNSTAKE("UNSTAKE"),
  
  WITHDRAW("WITHDRAW"),
  
  REDEEM_FROM_COMPOUND("REDEEM_FROM_COMPOUND"),
  
  SUPPLY_TO_COMPOUND("SUPPLY_TO_COMPOUND");

  private String value;

  GetTransactionOperation(String value) {
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
  public static GetTransactionOperation fromValue(String value) {
    for (GetTransactionOperation b : GetTransactionOperation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
