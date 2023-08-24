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
import com.fireblocks.sdk.model.GetOtaStatus200Response;
import com.fireblocks.sdk.model.SetOtaStatusRequest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OtaBetaApi
 */
public class OtaBetaApiTest {

    private OtaBetaApi api;

    /**
     * Returns current OTA status
     *
     * Returns current OTA status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOtaStatusTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new OtaBetaApi(configuration);
        //GetOtaStatus200Response response = api.getOtaStatus();
        // TODO: test validations
    }

    /**
     * Enable or disable transactions to OTA
     *
     * Enable or disable transactions to OTA
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setOtaStatusTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new OtaBetaApi(configuration);
        //SetOtaStatusRequest setOtaStatusRequest = null;
        //api.setOtaStatus(setOtaStatusRequest);
        // TODO: test validations
    }

}