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
import java.math.BigDecimal;
import com.fireblocks.sdk.model.CreateConnectionRequest;
import com.fireblocks.sdk.model.CreateConnectionResponse;
import com.fireblocks.sdk.model.GetConnectionsResponse;
import com.fireblocks.sdk.model.GetFilterParameter;
import com.fireblocks.sdk.model.RespondToConnectionRequest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for Web3ConnectionsApi
 */
public class Web3ConnectionsApiTest {

    private Web3ConnectionsApi api;

    /**
     * Create a new Web3 connection.
     *
     * Initiate a new Web3 connection.  * Note: After this succeeds, make a request to &#x60;PUT /v1/connections/wc/{id}&#x60; (below) to approve or reject the new Web3 connection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new Web3ConnectionsApi(configuration);
        //CreateConnectionRequest createConnectionRequest = null;
        //CreateConnectionResponse response = api.create(createConnectionRequest);
        // TODO: test validations
    }

    /**
     * List all open Web3 connections.
     *
     * Get open Web3 connections.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new Web3ConnectionsApi(configuration);
        //String order = null;
        //GetFilterParameter filter = null;
        //String sort = null;
        //BigDecimal pageSize = null;
        //String next = null;
        //GetConnectionsResponse response = api.get(order, filter, sort, pageSize, next);
        // TODO: test validations
    }

    /**
     * Remove an existing Web3 connection.
     *
     * Remove a Web3 connection
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new Web3ConnectionsApi(configuration);
        //String id = null;
        //api.remove(id);
        // TODO: test validations
    }

    /**
     * Respond to a pending Web3 connection request.
     *
     * Submit a response to *approve* or *reject* an initiated Web3 connection. * Note: This call is used to complete your &#x60;POST /v1/connections/wc/&#x60; request.  After this succeeds, your new Web3 connection is created and functioning.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new Web3ConnectionsApi(configuration);
        //String id = null;
        //RespondToConnectionRequest respondToConnectionRequest = null;
        //api.submit(id, respondToConnectionRequest);
        // TODO: test validations
    }

}
