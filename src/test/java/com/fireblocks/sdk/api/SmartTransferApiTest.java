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
import com.fireblocks.sdk.model.SmartTransferApproveTerm;
import com.fireblocks.sdk.model.SmartTransferCreateTicket;
import com.fireblocks.sdk.model.SmartTransferCreateTicketTerm;
import com.fireblocks.sdk.model.SmartTransferFundDvpTicket;
import com.fireblocks.sdk.model.SmartTransferFundTerm;
import com.fireblocks.sdk.model.SmartTransferManuallyFundTerm;
import com.fireblocks.sdk.model.SmartTransferSetTicketExpiration;
import com.fireblocks.sdk.model.SmartTransferSetTicketExternalId;
import com.fireblocks.sdk.model.SmartTransferSetUserGroups;
import com.fireblocks.sdk.model.SmartTransferStatistic;
import com.fireblocks.sdk.model.SmartTransferSubmitTicket;
import com.fireblocks.sdk.model.SmartTransferTicketFilteredResponse;
import com.fireblocks.sdk.model.SmartTransferTicketResponse;
import com.fireblocks.sdk.model.SmartTransferTicketTermResponse;
import com.fireblocks.sdk.model.SmartTransferUpdateTicketTerm;
import com.fireblocks.sdk.model.SmartTransferUserGroupsResponse;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for SmartTransferApi */
@Ignore
public class SmartTransferApiTest {

    private final SmartTransferApi api = new SmartTransferApi();

    /**
     * Define funding source and give approve to contract to transfer asset
     *
     * <p>Set funding source for ticket term and creating approving transaction for contract to
     * transfer asset
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void approveDvPTicketTermTest() throws ApiException {
        SmartTransferApproveTerm smartTransferApproveTerm = null;
        String ticketId = null;
        String termId = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<SmartTransferTicketTermResponse>> response =
                api.approveDvPTicketTerm(
                        smartTransferApproveTerm, ticketId, termId, idempotencyKey);
    }

    /**
     * Cancel Ticket
     *
     * <p>Cancel Smart Transfer ticket
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelTicketTest() throws ApiException {
        String ticketId = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<SmartTransferTicketResponse>> response =
                api.cancelTicket(ticketId, idempotencyKey);
    }

    /**
     * Create Ticket
     *
     * <p>Creates new Smart Transfer ticket
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTicketTest() throws ApiException {
        SmartTransferCreateTicket smartTransferCreateTicket = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<SmartTransferTicketResponse>> response =
                api.createTicket(smartTransferCreateTicket, idempotencyKey);
    }

    /**
     * Create leg (term)
     *
     * <p>Creates new smart transfer ticket term (when the ticket status is DRAFT)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTicketTermTest() throws ApiException {
        SmartTransferCreateTicketTerm smartTransferCreateTicketTerm = null;
        String ticketId = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<SmartTransferTicketTermResponse>> response =
                api.createTicketTerm(smartTransferCreateTicketTerm, ticketId, idempotencyKey);
    }

    /**
     * Search Tickets by ID
     *
     * <p>Find Smart Transfer ticket by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findTicketByIdTest() throws ApiException {
        String ticketId = null;
        CompletableFuture<ApiResponse<SmartTransferTicketResponse>> response =
                api.findTicketById(ticketId);
    }

    /**
     * Search ticket by leg (term) ID
     *
     * <p>Find Smart Transfer ticket term by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findTicketTermByIdTest() throws ApiException {
        String ticketId = null;
        String termId = null;
        CompletableFuture<ApiResponse<SmartTransferTicketTermResponse>> response =
                api.findTicketTermById(ticketId, termId);
    }

    /**
     * Fund ticket manually
     *
     * <p>Manually fulfill ticket, in case when all terms (legs) are funded manually
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fulfillTicketTest() throws ApiException {
        String ticketId = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<SmartTransferTicketResponse>> response =
                api.fulfillTicket(ticketId, idempotencyKey);
    }

    /**
     * Fund dvp ticket
     *
     * <p>Create or fulfill dvp ticket order
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fundDvpTicketTest() throws ApiException {
        SmartTransferFundDvpTicket smartTransferFundDvpTicket = null;
        String ticketId = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<SmartTransferTicketResponse>> response =
                api.fundDvpTicket(smartTransferFundDvpTicket, ticketId, idempotencyKey);
    }

    /**
     * Define funding source
     *
     * <p>Set funding source for ticket term (in case of ASYNC tickets, this will execute transfer
     * immediately)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fundTicketTermTest() throws ApiException {
        SmartTransferFundTerm smartTransferFundTerm = null;
        String ticketId = null;
        String termId = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<SmartTransferTicketTermResponse>> response =
                api.fundTicketTerm(smartTransferFundTerm, ticketId, termId, idempotencyKey);
    }

    /**
     * Get smart transfers statistic
     *
     * <p>Get smart transfer statistic
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSmartTransferStatisticTest() throws ApiException {
        CompletableFuture<ApiResponse<SmartTransferStatistic>> response =
                api.getSmartTransferStatistic();
    }

    /**
     * Get user group
     *
     * <p>Get Smart Transfer user groups
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSmartTransferUserGroupsTest() throws ApiException {
        CompletableFuture<ApiResponse<SmartTransferUserGroupsResponse>> response =
                api.getSmartTransferUserGroups();
    }

    /**
     * Manually add term transaction
     *
     * <p>Manually set ticket term transaction
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void manuallyFundTicketTermTest() throws ApiException {
        SmartTransferManuallyFundTerm smartTransferManuallyFundTerm = null;
        String ticketId = null;
        String termId = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<SmartTransferTicketTermResponse>> response =
                api.manuallyFundTicketTerm(
                        smartTransferManuallyFundTerm, ticketId, termId, idempotencyKey);
    }

    /**
     * Delete ticket leg (term)
     *
     * <p>Delete ticket term when ticket is in DRAFT status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeTicketTermTest() throws ApiException {
        String ticketId = null;
        String termId = null;

        CompletableFuture<ApiResponse<Void>> response = api.removeTicketTerm(ticketId, termId);
    }

    /**
     * Find Ticket
     *
     * <p>Finds Smart Transfer tickets that match the submitted criteria
     *
     * @throws ApiException if the Api call fails
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
        CompletableFuture<ApiResponse<SmartTransferTicketFilteredResponse>> response =
                api.searchTickets(
                        q,
                        statuses,
                        networkId,
                        createdByMe,
                        expiresAfter,
                        expiresBefore,
                        type,
                        externalRefId,
                        after,
                        limit);
    }

    /**
     * Add external ref. ID
     *
     * <p>Set external id Smart Transfer ticket
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setExternalRefIdTest() throws ApiException {
        SmartTransferSetTicketExternalId smartTransferSetTicketExternalId = null;
        String ticketId = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<SmartTransferTicketResponse>> response =
                api.setExternalRefId(smartTransferSetTicketExternalId, ticketId, idempotencyKey);
    }

    /**
     * Set expiration
     *
     * <p>Set expiration date on Smart Transfer ticket
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setTicketExpirationTest() throws ApiException {
        SmartTransferSetTicketExpiration smartTransferSetTicketExpiration = null;
        String ticketId = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<SmartTransferTicketResponse>> response =
                api.setTicketExpiration(smartTransferSetTicketExpiration, ticketId, idempotencyKey);
    }

    /**
     * Set user group
     *
     * <p>Set Smart Transfer user group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setUserGroupsTest() throws ApiException {
        SmartTransferSetUserGroups smartTransferSetUserGroups = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<SmartTransferUserGroupsResponse>> response =
                api.setUserGroups(smartTransferSetUserGroups, idempotencyKey);
    }

    /**
     * Submit ticket
     *
     * <p>Submit Smart Transfer ticket - change status into ready for approval if auto approval is
     * not turned on, or OPEN if auto approval is on
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitTicketTest() throws ApiException {
        SmartTransferSubmitTicket smartTransferSubmitTicket = null;
        String ticketId = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<SmartTransferTicketResponse>> response =
                api.submitTicket(smartTransferSubmitTicket, ticketId, idempotencyKey);
    }

    /**
     * Update ticket leg (term)
     *
     * <p>Update ticket term (when ticket status is DRAFT)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTicketTermTest() throws ApiException {
        SmartTransferUpdateTicketTerm smartTransferUpdateTicketTerm = null;
        String ticketId = null;
        String termId = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<SmartTransferTicketTermResponse>> response =
                api.updateTicketTerm(
                        smartTransferUpdateTicketTerm, ticketId, termId, idempotencyKey);
    }
}
