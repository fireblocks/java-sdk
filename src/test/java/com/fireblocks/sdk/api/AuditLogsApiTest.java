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
import com.fireblocks.sdk.model.GetAuditLogsResponseDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for AuditLogsApi
 */
@Ignore
public class AuditLogsApiTest {

    private final AuditLogsApi api = new AuditLogsApi();

    
    /**
     * Get audit logs
     *
     * Get all audits
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuditLogsTest() throws ApiException {
        String timePeriod = null;
        String cursor = null;
        
        CompletableFuture<Void> response = api.getAuditLogs(timePeriod, cursor);
        
        // TODO: test validations
    }
    
    /**
     * Get audit logs
     *
     * Get all audits
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuditsTest() throws ApiException {
        String timePeriod = null;
        CompletableFuture<GetAuditLogsResponseDTO> response = 
        api.getAudits(timePeriod);
        
        // TODO: test validations
    }
    
}
