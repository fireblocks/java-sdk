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
import java.math.BigDecimal;
import com.fireblocks.sdk.model.TravelRuleGetAllVASPsResponse;
import com.fireblocks.sdk.model.TravelRuleUpdateVASPDetails;
import com.fireblocks.sdk.model.TravelRuleVASP;
import com.fireblocks.sdk.model.TravelRuleValidateFullTransactionRequest;
import com.fireblocks.sdk.model.TravelRuleValidateTransactionRequest;
import com.fireblocks.sdk.model.TravelRuleValidateTransactionResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for TravelRuleBetaApi
 */
@Ignore
public class TravelRuleBetaApiTest {

    private final TravelRuleBetaApi api = new TravelRuleBetaApi();

    
    /**
     * Get VASP details
     *
     * Get VASP Details.  Returns information about a VASP that has the specified DID.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVASPByDIDTest() throws ApiException {
        String did = null;
        String fields = null;
        CompletableFuture<TravelRuleVASP> response = 
        api.getVASPByDID(did, fields);
        
        // TODO: test validations
    }
    
    /**
     * Get All VASPs
     *
     * Get All VASPs.  Returns a list of VASPs. VASPs can be searched and sorted and results are paginated.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVASPsTest() throws ApiException {
        String order = null;
        BigDecimal perPage = null;
        BigDecimal page = null;
        String fields = null;
        CompletableFuture<TravelRuleGetAllVASPsResponse> response = 
        api.getVASPs(order, perPage, page, fields);
        
        // TODO: test validations
    }
    
    /**
     * Add jsonDidKey to VASP details
     *
     * Update VASP Details.  Updates a VASP with the provided parameters. Use this endpoint to add your public jsonDIDkey generated by Notabene.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVaspTest() throws ApiException {
        TravelRuleUpdateVASPDetails travelRuleUpdateVASPDetails = null;
        String idempotencyKey = null;
        CompletableFuture<TravelRuleUpdateVASPDetails> response = 
        api.updateVasp(travelRuleUpdateVASPDetails, idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Validate Full Travel Rule Transaction
     *
     * Validate Full Travel Rule transactions.  Checks for all required information on the originator and beneficiary VASPs.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateFullTravelRuleTransactionTest() throws ApiException {
        TravelRuleValidateFullTransactionRequest travelRuleValidateFullTransactionRequest = null;
        String idempotencyKey = null;
        CompletableFuture<TravelRuleValidateTransactionResponse> response = 
        api.validateFullTravelRuleTransaction(travelRuleValidateFullTransactionRequest, idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Validate Travel Rule Transaction
     *
     * Validate Travel Rule transactions.  Checks what beneficiary VASP details are required by your jurisdiction and the beneficiary&#39;s jurisdiction.  **Note:** The reference content in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.  To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateTravelRuleTransactionTest() throws ApiException {
        TravelRuleValidateTransactionRequest travelRuleValidateTransactionRequest = null;
        String idempotencyKey = null;
        CompletableFuture<TravelRuleValidateTransactionResponse> response = 
        api.validateTravelRuleTransaction(travelRuleValidateTransactionRequest, idempotencyKey);
        
        // TODO: test validations
    }
    
}
