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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.FiatAccount;
import org.openapitools.client.model.RedeemFundsToLinkedDDARequest;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FiatAccountsApi
 */
@Ignore
public class FiatAccountsApiTest {

    private final FiatAccountsApi api = new FiatAccountsApi();

    /**
     * Deposit funds from DDA
     *
     * Deposits funds from the linked DDA.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void depositFundsFromLinkedDDATest() throws ApiException {
        String accountId = null;
        RedeemFundsToLinkedDDARequest redeemFundsToLinkedDDARequest = null;
        api.depositFundsFromLinkedDDA(accountId, redeemFundsToLinkedDDARequest);

        // TODO: test validations
    }
    /**
     * Find a specific fiat account
     *
     * Returns a fiat account by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFiatAccountByIdTest() throws ApiException {
        String accountId = null;
        FiatAccount response = api.getFiatAccountById(accountId);

        // TODO: test validations
    }
    /**
     * List fiat accounts
     *
     * Returns all fiat accounts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFiatAccountsTest() throws ApiException {
        List<FiatAccount> response = api.getFiatAccounts();

        // TODO: test validations
    }
    /**
     * Redeem funds to DDA
     *
     * Redeems funds to the linked DDA.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void redeemFundsToLinkedDDATest() throws ApiException {
        String accountId = null;
        RedeemFundsToLinkedDDARequest redeemFundsToLinkedDDARequest = null;
        api.redeemFundsToLinkedDDA(accountId, redeemFundsToLinkedDDARequest);

        // TODO: test validations
    }
}
