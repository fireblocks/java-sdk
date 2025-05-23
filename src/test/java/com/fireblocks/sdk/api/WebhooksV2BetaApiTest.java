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
import com.fireblocks.sdk.model.CreateWebhookRequest;
import com.fireblocks.sdk.model.NotificationPaginatedResponse;
import com.fireblocks.sdk.model.NotificationStatus;
import com.fireblocks.sdk.model.NotificationWithData;
import com.fireblocks.sdk.model.ResendNotificationsByResourceIdRequest;
import com.fireblocks.sdk.model.UpdateWebhookRequest;
import com.fireblocks.sdk.model.Webhook;
import com.fireblocks.sdk.model.WebhookEvent;
import com.fireblocks.sdk.model.WebhookPaginatedResponse;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for WebhooksV2BetaApi */
@Ignore
public class WebhooksV2BetaApiTest {

    private final WebhooksV2BetaApi api = new WebhooksV2BetaApi();

    /**
     * Create new webhook
     *
     * <p>Creates a new webhook, which will be triggered on the specified events **Note:** These
     * endpoints are currently in beta and might be subject to changes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createWebhookTest() throws ApiException {
        CreateWebhookRequest createWebhookRequest = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<Webhook>> response =
                api.createWebhook(createWebhookRequest, idempotencyKey);
    }

    /**
     * Delete webhook
     *
     * <p>Delete a webhook by its id **Note:** These endpoints are currently in beta and might be
     * subject to changes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWebhookTest() throws ApiException {
        UUID webhookId = null;
        CompletableFuture<ApiResponse<Webhook>> response = api.deleteWebhook(webhookId);
    }

    /**
     * Get notification by id
     *
     * <p>Get notification by id **Note:** These endpoints are currently in beta and might be
     * subject to changes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNotificationTest() throws ApiException {
        String webhookId = null;
        String notificationId = null;
        Boolean includeData = null;
        CompletableFuture<ApiResponse<NotificationWithData>> response =
                api.getNotification(webhookId, notificationId, includeData);
    }

    /**
     * Get all notifications by webhook id
     *
     * <p>Get all notifications by webhook id (paginated) **Note:** These endpoints are currently in
     * beta and might be subject to changes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNotificationsTest() throws ApiException {
        UUID webhookId = null;
        String order = null;
        String pageCursor = null;
        BigDecimal pageSize = null;
        String createdStartDate = null;
        String createdEndDate = null;
        List<NotificationStatus> statuses = null;
        List<WebhookEvent> eventTypes = null;
        String resourceId = null;
        CompletableFuture<ApiResponse<NotificationPaginatedResponse>> response =
                api.getNotifications(
                        webhookId,
                        order,
                        pageCursor,
                        pageSize,
                        createdStartDate,
                        createdEndDate,
                        statuses,
                        eventTypes,
                        resourceId);
    }

    /**
     * Get webhook by id
     *
     * <p>Retrieve a webhook by its id **Note:** These endpoints are currently in beta and might be
     * subject to changes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWebhookTest() throws ApiException {
        UUID webhookId = null;
        CompletableFuture<ApiResponse<Webhook>> response = api.getWebhook(webhookId);
    }

    /**
     * Get all webhooks
     *
     * <p>Get all webhooks (paginated) **Note:** These endpoints are currently in beta and might be
     * subject to changes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWebhooksTest() throws ApiException {
        String order = null;
        String pageCursor = null;
        BigDecimal pageSize = null;
        CompletableFuture<ApiResponse<WebhookPaginatedResponse>> response =
                api.getWebhooks(order, pageCursor, pageSize);
    }

    /**
     * Resend notification by id
     *
     * <p>Resend notification by ID **Note:** These endpoints are currently in beta and might be
     * subject to changes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resendNotificationByIdTest() throws ApiException {
        String webhookId = null;
        String notificationId = null;
        String idempotencyKey = null;

        CompletableFuture<ApiResponse<Void>> response =
                api.resendNotificationById(webhookId, notificationId, idempotencyKey);
    }

    /**
     * Resend notifications by resource Id
     *
     * <p>Resend notifications by resource Id **Note:** These endpoints are currently in beta and
     * might be subject to changes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resendNotificationsByResourceIdTest() throws ApiException {
        ResendNotificationsByResourceIdRequest resendNotificationsByResourceIdRequest = null;
        String webhookId = null;
        String idempotencyKey = null;

        CompletableFuture<ApiResponse<Void>> response =
                api.resendNotificationsByResourceId(
                        resendNotificationsByResourceIdRequest, webhookId, idempotencyKey);
    }

    /**
     * Update webhook
     *
     * <p>Update a webhook by its id **Note:** These endpoints are currently in beta and might be
     * subject to changes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateWebhookTest() throws ApiException {
        UpdateWebhookRequest updateWebhookRequest = null;
        UUID webhookId = null;
        CompletableFuture<ApiResponse<Webhook>> response =
                api.updateWebhook(updateWebhookRequest, webhookId);
    }
}
