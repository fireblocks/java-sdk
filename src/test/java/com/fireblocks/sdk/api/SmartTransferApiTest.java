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
import java.time.OffsetDateTime;
import com.fireblocks.sdk.model.SmartTransferBadRequestResponse;
import com.fireblocks.sdk.model.SmartTransferCreateTicket;
import com.fireblocks.sdk.model.SmartTransferCreateTicketTerm;
import com.fireblocks.sdk.model.SmartTransferForbiddenResponse;
import com.fireblocks.sdk.model.SmartTransferFundTerm;
import com.fireblocks.sdk.model.SmartTransferManuallyFundTerm;
import com.fireblocks.sdk.model.SmartTransferNotFoundResponse;
import com.fireblocks.sdk.model.SmartTransferSetTicketExpiration;
import com.fireblocks.sdk.model.SmartTransferSetTicketExternalId;
import com.fireblocks.sdk.model.SmartTransferSetUserGroups;
import com.fireblocks.sdk.model.SmartTransferSubmitTicket;
import com.fireblocks.sdk.model.SmartTransferTicketFilteredResponse;
import com.fireblocks.sdk.model.SmartTransferTicketResponse;
import com.fireblocks.sdk.model.SmartTransferTicketTermResponse;
import com.fireblocks.sdk.model.SmartTransferUpdateTicketTerm;
import com.fireblocks.sdk.model.SmartTransferUserGroupsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for SmartTransferApi
 */
@Ignore
public class SmartTransferApiTest {

    private final SmartTransferApi api = new SmartTransferApi();

    
    /**
     * Cancel Ticket
     *
     * Cancel Smart Transfer ticket
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelTicketTest() throws ApiException {
        String ticketId = null;
        String idempotencyKey = null;
        CompletableFuture<SmartTransferTicketResponse> response = 
        api.cancelTicket(ticketId, idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Create Ticket
     *
     * Creates new Smart Transfer ticket
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTicketTest() throws ApiException {
        SmartTransferCreateTicket smartTransferCreateTicket = null;
        String idempotencyKey = null;
        CompletableFuture<SmartTransferTicketResponse> response = 
        api.createTicket(smartTransferCreateTicket, idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Create leg (term)
     *
     * Creates new smart transfer ticket term (when the ticket status is DRAFT)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTicketTermTest() throws ApiException {
        SmartTransferCreateTicketTerm smartTransferCreateTicketTerm = null;
        String ticketId = null;
        String idempotencyKey = null;
        CompletableFuture<SmartTransferTicketTermResponse> response = 
        api.createTicketTerm(smartTransferCreateTicketTerm, ticketId, idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Search Tickets by ID
     *
     * Find Smart Transfer ticket by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findTicketByIdTest() throws ApiException {
        String ticketId = null;
        CompletableFuture<SmartTransferTicketResponse> response = 
        api.findTicketById(ticketId);
        
        // TODO: test validations
    }
    
    /**
     * Search ticket by leg (term) ID
     *
     * Find Smart Transfer ticket term by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findTicketTermByIdTest() throws ApiException {
        String ticketId = null;
        String termId = null;
        CompletableFuture<SmartTransferTicketTermResponse> response = 
        api.findTicketTermById(ticketId, termId);
        
        // TODO: test validations
    }
    
    /**
     * Fund ticket manually
     *
     * Manually fulfill ticket, in case when all terms (legs) are funded manually
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fulfillTicketTest() throws ApiException {
        String ticketId = null;
        String idempotencyKey = null;
        CompletableFuture<SmartTransferTicketResponse> response = 
        api.fulfillTicket(ticketId, idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Define funding source
     *
     * Set funding source for ticket term (in case of ASYNC tickets, this will execute transfer immediately)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fundTicketTermTest() throws ApiException {
        SmartTransferFundTerm smartTransferFundTerm = null;
        String ticketId = null;
        String termId = null;
        String idempotencyKey = null;
        CompletableFuture<SmartTransferTicketTermResponse> response = 
        api.fundTicketTerm(smartTransferFundTerm, ticketId, termId, idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Get user group
     *
     * Get Smart Transfer user groups
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSmartTransferUserGroupsTest() throws ApiException {
        CompletableFuture<SmartTransferUserGroupsResponse> response = 
        api.getSmartTransferUserGroups();
        
        // TODO: test validations
    }
    
    /**
     * Manually add term transaction
     *
     * Manually set ticket term transaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void manuallyFundTicketTermTest() throws ApiException {
        SmartTransferManuallyFundTerm smartTransferManuallyFundTerm = null;
        String ticketId = null;
        String termId = null;
        String idempotencyKey = null;
        CompletableFuture<SmartTransferTicketTermResponse> response = 
        api.manuallyFundTicketTerm(smartTransferManuallyFundTerm, ticketId, termId, idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Delete ticket leg (term)
     *
     * Delete ticket term when ticket is in DRAFT status
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeTicketTermTest() throws ApiException {
        String ticketId = null;
        String termId = null;
        
        CompletableFuture<Void> response = api.removeTicketTerm(ticketId, termId);
        
        // TODO: test validations
    }
    
    /**
     * Find Ticket
     *
     * Finds Smart Transfer tickets that match the submitted criteria
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchTicketsTest() throws ApiException {
        String q = null;
        List<String> statuses = null;
        String networkId = null;
        Boolean createdByMe = null;
        OffsetDateTime expiresAfter = null;
        OffsetDateTime expiresBefore = null;
        String type = null;
        String externalRefId = null;
        String after = null;
        BigDecimal limit = null;
        CompletableFuture<SmartTransferTicketFilteredResponse> response = 
        api.searchTickets(q, statuses, networkId, createdByMe, expiresAfter, expiresBefore, type, externalRefId, after, limit);
        
        // TODO: test validations
    }
    
    /**
     * Add external ref. ID
     *
     * Set external id Smart Transfer ticket
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setExternalRefIdTest() throws ApiException {
        SmartTransferSetTicketExternalId smartTransferSetTicketExternalId = null;
        String ticketId = null;
        String idempotencyKey = null;
        CompletableFuture<SmartTransferTicketResponse> response = 
        api.setExternalRefId(smartTransferSetTicketExternalId, ticketId, idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Set expiration
     *
     * Set expiration date on Smart Transfer ticket
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setTicketExpirationTest() throws ApiException {
        SmartTransferSetTicketExpiration smartTransferSetTicketExpiration = null;
        String ticketId = null;
        String idempotencyKey = null;
        CompletableFuture<SmartTransferTicketResponse> response = 
        api.setTicketExpiration(smartTransferSetTicketExpiration, ticketId, idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Set user group
     *
     * Set Smart Transfer user group
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setUserGroupsTest() throws ApiException {
        SmartTransferSetUserGroups smartTransferSetUserGroups = null;
        String idempotencyKey = null;
        CompletableFuture<SmartTransferUserGroupsResponse> response = 
        api.setUserGroups(smartTransferSetUserGroups, idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Submit ticket
     *
     * Submit Smart Transfer ticket - change status into ready for approval if auto approval is not turned on, or OPEN if auto approval is on
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitTicketTest() throws ApiException {
        SmartTransferSubmitTicket smartTransferSubmitTicket = null;
        String ticketId = null;
        String idempotencyKey = null;
        CompletableFuture<SmartTransferTicketResponse> response = 
        api.submitTicket(smartTransferSubmitTicket, ticketId, idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Update ticket leg (term)
     *
     * Update ticket term (when ticket status is DRAFT)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTicketTermTest() throws ApiException {
        SmartTransferUpdateTicketTerm smartTransferUpdateTicketTerm = null;
        String ticketId = null;
        String termId = null;
        String idempotencyKey = null;
        CompletableFuture<SmartTransferTicketTermResponse> response = 
        api.updateTicketTerm(smartTransferUpdateTicketTerm, ticketId, termId, idempotencyKey);
        
        // TODO: test validations
    }
    
}
