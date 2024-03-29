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


package com.fireblocks.sdk.api;

import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.model.ErrorSchema;
import com.fireblocks.sdk.model.ResendTransactionWebhooksRequest;
import com.fireblocks.sdk.model.ResendWebhooksResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for WebhooksApi
 */
@Ignore
public class WebhooksApiTest {

    private final WebhooksApi api = new WebhooksApi();

    
    /**
     * Resend failed webhooks for a transaction by ID
     *
     * Resends failed webhook notifications for a transaction by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resendTransactionWebhooksTest() throws ApiException {
        ResendTransactionWebhooksRequest resendTransactionWebhooksRequest = null;
        String txId = null;
        String idempotencyKey = null;
        
        CompletableFuture<Void> response = api.resendTransactionWebhooks(resendTransactionWebhooksRequest, txId, idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Resend failed webhooks
     *
     * Resends all failed webhook notifications.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resendWebhooksTest() throws ApiException {
        String idempotencyKey = null;
        CompletableFuture<ResendWebhooksResponse> response = 
        api.resendWebhooks(idempotencyKey);
        
        // TODO: test validations
    }
    
}
