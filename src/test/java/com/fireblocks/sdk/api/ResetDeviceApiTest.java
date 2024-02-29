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
import com.fireblocks.sdk.model.ErrorResponse;
import com.fireblocks.sdk.model.ErrorSchema;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for ResetDeviceApi
 */
@Ignore
public class ResetDeviceApiTest {

    private final ResetDeviceApi api = new ResetDeviceApi();

    
    /**
     * resets device
     *
     * resets device
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetDeviceTest() throws ApiException {
        String id = null;
        String idempotencyKey = null;
        
        CompletableFuture<Void> response = api.resetDevice(id, idempotencyKey);
        
        // TODO: test validations
    }
    
}
