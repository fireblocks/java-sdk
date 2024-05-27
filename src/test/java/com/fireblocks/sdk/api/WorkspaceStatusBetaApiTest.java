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
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.model.GetWorkspaceStatusResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for WorkspaceStatusBetaApi
 */
@Ignore
public class WorkspaceStatusBetaApiTest {

    private final WorkspaceStatusBetaApi api = new WorkspaceStatusBetaApi();

    
    /**
     * Returns current workspace status
     *
     * Returns current workspace status
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkspaceStatusTest() throws ApiException {
        CompletableFuture<ApiResponse<GetWorkspaceStatusResponse>> response = 
        api.getWorkspaceStatus();
        
    }
    
}
