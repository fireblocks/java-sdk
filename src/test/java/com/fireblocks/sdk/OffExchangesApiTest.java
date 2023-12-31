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


package com.fireblocks.sdk;

import com.fireblocks.sdk.*;
import com.fireblocks.sdk.auth.*;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.AddCollateralRequestBody;
import com.fireblocks.sdk.model.CreateTransactionResponse;
import com.fireblocks.sdk.model.Error;
import com.fireblocks.sdk.model.ExchangeAccount;
import com.fireblocks.sdk.model.RemoveCollateralRequestBody;
import com.fireblocks.sdk.model.SettlementRequestBody;
import com.fireblocks.sdk.model.SettlementResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OffExchangesApi
 */
public class OffExchangesApiTest {

    private OffExchangesApi api;

    /**
     * add collateral
     *
     * add collateral, create deposit request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addOffExchangeTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new OffExchangesApi(configuration);
        //AddCollateralRequestBody addCollateralRequestBody = null;
        //CreateTransactionResponse response = api.addOffExchange(addCollateralRequestBody);
        // TODO: test validations
    }

    /**
     * Find a specific collateral exchange account
     *
     * Returns a collateral account by mainExchangeAccountId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOffExchangeCollateralAccountsTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new OffExchangesApi(configuration);
        //String mainExchangeAccountId = null;
        //ExchangeAccount response = api.getOffExchangeCollateralAccounts(mainExchangeAccountId);
        // TODO: test validations
    }

    /**
     * get settlements transactions from exchange
     *
     * get settlements transactions from exchange
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOffExchangeSettlementTransactionsTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new OffExchangesApi(configuration);
        //String mainExchangeAccountId = null;
        //SettlementResponse response = api.getOffExchangeSettlementTransactions(mainExchangeAccountId);
        // TODO: test validations
    }

    /**
     * remove collateral
     *
     * remove collateral, create withdraw request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeOffExchangeTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new OffExchangesApi(configuration);
        //RemoveCollateralRequestBody removeCollateralRequestBody = null;
        //CreateTransactionResponse response = api.removeOffExchange(removeCollateralRequestBody);
        // TODO: test validations
    }

    /**
     * create settlement for a trader
     *
     * create settlement for a trader
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void settleOffExchangeTradesTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new OffExchangesApi(configuration);
        //SettlementRequestBody settlementRequestBody = null;
        //SettlementResponse response = api.settleOffExchangeTrades(settlementRequestBody);
        // TODO: test validations
    }

}
