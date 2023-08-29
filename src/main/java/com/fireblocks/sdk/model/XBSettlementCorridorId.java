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
 * - MX_US : Mexico (MXN) to USA (USD) - CO_US : Colombia (COP) to USA (USD) - US_MX : USA (USD) to Mexico (MXN) - US_EU : USA (USD) to Europe Union (EUR) - US_UK : USA (USD) to United Kingdon (GBP) 
 */
public enum XBSettlementCorridorId {
  
  MX_US("MX_US"),
  
  CO_US("CO_US"),
  
  US_MX("US_MX"),
  
  US_EU("US_EU"),
  
  US_UK("US_UK");

  private String value;

  XBSettlementCorridorId(String value) {
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
  public static XBSettlementCorridorId fromValue(String value) {
    for (XBSettlementCorridorId b : XBSettlementCorridorId.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

