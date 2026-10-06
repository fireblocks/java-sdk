# ApprovalsBetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveApproval**](ApprovalsBetaApi.md#approveApproval) | **POST** /approvals/{requestId}/approve | Approve an approval request |
| [**createApprovalKey**](ApprovalsBetaApi.md#createApprovalKey) | **POST** /management/api_users/{userId}/approval_keys | Register an approval key |
| [**deleteApprovalKey**](ApprovalsBetaApi.md#deleteApprovalKey) | **DELETE** /management/api_users/{userId}/approval_keys/{keyId} | Delete an approval key |
| [**getApprovalById**](ApprovalsBetaApi.md#getApprovalById) | **GET** /approvals/{requestId} | Get a single approval request |
| [**getApprovalKeys**](ApprovalsBetaApi.md#getApprovalKeys) | **GET** /management/api_users/{userId}/approval_keys | List approval keys |
| [**getApprovals**](ApprovalsBetaApi.md#getApprovals) | **GET** /approvals | List approval requests |
| [**rejectApproval**](ApprovalsBetaApi.md#rejectApproval) | **POST** /approvals/{requestId}/reject | Reject an approval request |



## approveApproval

> CompletableFuture<ApiResponse<Void>> approveApproval approveApproval(approveApprovalRequest, requestId, idempotencyKey)

Approve an approval request

Approve a pending approval request as the authenticated API user. The caller signs the request&#39;s signable data with the private key of a registered approval API key and submits the base64url-encoded signature, optionally with the key ID. The server verifies the signature against the registered public key — using the given key ID, or matching against all of the user&#39;s registered keys when the key ID is omitted — and advances the approval quorum.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Approver, Signer, Security Admin.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.BasePath;
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.ConfigurationOptions;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.api.ApprovalsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        ApproveApprovalRequest approveApprovalRequest = new ApproveApprovalRequest(); // ApproveApprovalRequest | 
        String requestId = "18055"; // String | The approval request ID.
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.approvalsBeta().approveApproval(approveApprovalRequest, requestId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ApprovalsBetaApi#approveApproval");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **approveApprovalRequest** | [**ApproveApprovalRequest**](ApproveApprovalRequest.md)|  | |
| **requestId** | **String**| The approval request ID. | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The approval request was approved. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## createApprovalKey

> CompletableFuture<ApiResponse<RegisterApprovalApiKeyResponse>> createApprovalKey createApprovalKey(registerApprovalApiKeyRequest, userId, idempotencyKey)

Register an approval key

Register an approval public key for an API user, used to sign approval requests. Up to 2 active keys are supported per API user. Returns the server-generated key ID used for deletion.  The &#x60;userId&#x60; must be the authenticated API user&#39;s own ID. Registering a key for another user is not supported and is rejected.  Registration may require approval. In that case the response carries &#x60;ccrIdPendingRegistration&#x60;, the key reads as &#x60;APPROVAL_API_KEY_STATUS_PENDING_REGISTRATION&#x60; and cannot sign until the request is approved. A rejected request removes the key.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Approver, Signer, Security Admin.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.BasePath;
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.ConfigurationOptions;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.api.ApprovalsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        RegisterApprovalApiKeyRequest registerApprovalApiKeyRequest = new RegisterApprovalApiKeyRequest(); // RegisterApprovalApiKeyRequest | 
        String userId = "8f3c1a2e-4b7d-4c91-a0e5-2d6f8b1c3a94"; // String | The ID of the API user to register the approval key for.
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<RegisterApprovalApiKeyResponse>> response = fireblocks.approvalsBeta().createApprovalKey(registerApprovalApiKeyRequest, userId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ApprovalsBetaApi#createApprovalKey");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **registerApprovalApiKeyRequest** | [**RegisterApprovalApiKeyRequest**](RegisterApprovalApiKeyRequest.md)|  | |
| **userId** | **String**| The ID of the API user to register the approval key for. | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**RegisterApprovalApiKeyResponse**](RegisterApprovalApiKeyResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The approval key was registered. |  * X-Request-ID -  <br>  |
| **409** | Another approval key request for this API user is already pending approval. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## deleteApprovalKey

> CompletableFuture<ApiResponse<DeleteApprovalApiKeyResponse>> deleteApprovalKey deleteApprovalKey(userId, keyId, idempotencyKey)

Delete an approval key

Delete (revoke) an approval public key for the specified API user. The deletion may require approval: it always does for the API user&#39;s last key or another user&#39;s key. In that case the response carries &#x60;ccrIdPendingDeletion&#x60;, the key reads as &#x60;APPROVAL_API_KEY_STATUS_PENDING_DELETION&#x60; and stays active until the request is approved. A rejected request leaves the key enabled.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Approver, Signer, Security Admin.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.BasePath;
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.ConfigurationOptions;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.api.ApprovalsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String userId = "8f3c1a2e-4b7d-4c91-a0e5-2d6f8b1c3a94"; // String | The ID of the API user whose approval key to delete.
        String keyId = "fab543c0-d6be-414c-aa05-5c6c84269d7a"; // String | The ID of the approval key to delete.
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<DeleteApprovalApiKeyResponse>> response = fireblocks.approvalsBeta().deleteApprovalKey(userId, keyId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ApprovalsBetaApi#deleteApprovalKey");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| The ID of the API user whose approval key to delete. | |
| **keyId** | **String**| The ID of the approval key to delete. | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**DeleteApprovalApiKeyResponse**](DeleteApprovalApiKeyResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The approval key was deleted, or its deletion is pending approval. |  * X-Request-ID -  <br>  |
| **409** | Another approval key request for this API user is already pending approval. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getApprovalById

> CompletableFuture<ApiResponse<ApprovalRequestItem>> getApprovalById getApprovalById(requestId, userId, quorumStatusMode)

Get a single approval request

Retrieve full detail for a single approval request by ID, including the payload to sign and, when requested, the request&#39;s &#x60;quorumStatus&#x60;.  Because this endpoint addresses one request, it accepts &#x60;quorumStatusMode&#x3D;FULL&#x60;, which adds the participating approvers and their individual approval state.  &#x60;userStatus&#x60; reflects the authenticated user by default. Pass &#x60;userId&#x60; to report it for another user instead.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Approver, Signer, Security Admin, Security Auditor.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.BasePath;
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.ConfigurationOptions;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.api.ApprovalsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String requestId = "requestId_example"; // String | The approval request ID.
        String userId = "8f3c1a2e-4b7d-4c91-a0e5-2d6f8b1c3a94"; // String | Report `userStatus` for this user instead of the authenticated user. This selects whose approval state is returned; it does not change which requests can be fetched. Requires an Admin, Non-Signing Admin, Security Admin or Security Auditor role; other roles are rejected with 403.
        String quorumStatusMode = "NONE"; // String | How much quorum detail to include in `quorumStatus`. `NONE` (the default) returns it as `null`. `SUMMARY` returns the approval thresholds, current counts and status. `FULL` adds `users` and the per-group `members` indexes identifying who may approve and who already has. Any other value is rejected with 400; the parameter is case-sensitive.
        try {
            CompletableFuture<ApiResponse<ApprovalRequestItem>> response = fireblocks.approvalsBeta().getApprovalById(requestId, userId, quorumStatusMode);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ApprovalsBetaApi#getApprovalById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestId** | **String**| The approval request ID. | |
| **userId** | **String**| Report &#x60;userStatus&#x60; for this user instead of the authenticated user. This selects whose approval state is returned; it does not change which requests can be fetched. Requires an Admin, Non-Signing Admin, Security Admin or Security Auditor role; other roles are rejected with 403. | [optional] |
| **quorumStatusMode** | **String**| How much quorum detail to include in &#x60;quorumStatus&#x60;. &#x60;NONE&#x60; (the default) returns it as &#x60;null&#x60;. &#x60;SUMMARY&#x60; returns the approval thresholds, current counts and status. &#x60;FULL&#x60; adds &#x60;users&#x60; and the per-group &#x60;members&#x60; indexes identifying who may approve and who already has. Any other value is rejected with 400; the parameter is case-sensitive. | [optional] [default to NONE] [enum: NONE, SUMMARY, FULL] |

### Return type

CompletableFuture<ApiResponse<[**ApprovalRequestItem**](ApprovalRequestItem.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The requested approval request. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getApprovalKeys

> CompletableFuture<ApiResponse<ListApprovalApiKeysResponse>> getApprovalKeys getApprovalKeys(userId, pageSize, pageCursor)

List approval keys

List the approval public keys registered for the specified API user.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Approver, Signer, Security Admin, Security Auditor.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.BasePath;
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.ConfigurationOptions;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.api.ApprovalsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String userId = "8f3c1a2e-4b7d-4c91-a0e5-2d6f8b1c3a94"; // String | The ID of the API user whose approval keys to list.
        Integer pageSize = 10; // Integer | Number of results per page. Maximum 15. Defaults to 10.
        String pageCursor = "pageCursor_example"; // String | Cursor returned from the previous response (the `next` field) to fetch the next page.
        try {
            CompletableFuture<ApiResponse<ListApprovalApiKeysResponse>> response = fireblocks.approvalsBeta().getApprovalKeys(userId, pageSize, pageCursor);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ApprovalsBetaApi#getApprovalKeys");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| The ID of the API user whose approval keys to list. | |
| **pageSize** | **Integer**| Number of results per page. Maximum 15. Defaults to 10. | [optional] [default to 10] |
| **pageCursor** | **String**| Cursor returned from the previous response (the &#x60;next&#x60; field) to fetch the next page. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ListApprovalApiKeysResponse**](ListApprovalApiKeysResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The API user&#39;s approval keys. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getApprovals

> CompletableFuture<ApiResponse<ListApprovalsResponse>> getApprovals getApprovals(includeUserApproved, userId, includeAllUsers, quorumStatusMode, pageSize, pageCursor)

List approval requests

Retrieve the pending approval requests the authenticated API user is eligible to act on, including requests the user has already approved that are still pending overall.  The response is scoped to the authenticated user by default. Pass &#x60;userId&#x60; to read another user&#39;s queue, or &#x60;includeAllUsers&#x3D;true&#x60; to read every pending request in the workspace. Both require an Admin, Non-Signing Admin, Security Admin or Security Auditor role and are rejected with 403 otherwise.  Set &#x60;quorumStatusMode&#x3D;SUMMARY&#x60; to include each request&#39;s approval thresholds and counts. The per-approver breakdown is available only when fetching a single request — see &#x60;GET /approvals/{requestId}&#x60;.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Approver, Signer, Security Admin, Security Auditor.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.BasePath;
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.ConfigurationOptions;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.api.ApprovalsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        Boolean includeUserApproved = true; // Boolean | When true, also include requests the authenticated user has already approved that are still pending overall. Defaults to false (only requests the user has not yet acted on).
        String userId = "8f3c1a2e-4b7d-4c91-a0e5-2d6f8b1c3a94"; // String | Return the pending requests for this user instead of the authenticated user. Requires an Admin, Non-Signing Admin, Security Admin or Security Auditor role; other roles are rejected with 403. Cannot be combined with `includeAllUsers=true` — sending both is rejected with 400.
        Boolean includeAllUsers = false; // Boolean | When true, return every pending request in the workspace instead of a single user's queue. Defaults to false. Requires an Admin, Non-Signing Admin, Security Admin or Security Auditor role; other roles are rejected with 403. In this mode `userStatus` is always `USER_STATUS_NOT_APPLICABLE`, because the response is not scoped to one user, and `includeUserApproved` has no effect. Cannot be combined with `userId`.
        String quorumStatusMode = "NONE"; // String | How much quorum detail to include in each request's `quorumStatus`. `NONE` (the default) returns it as `null`. `SUMMARY` returns the approval thresholds, current counts and status. `FULL` is rejected with 400 on this endpoint because the per-approver breakdown requires a single request — use `GET /approvals/{requestId}` for it. Any other value is rejected with 400; the parameter is case-sensitive.
        Integer pageSize = 20; // Integer | Number of results per page. Maximum 30. Defaults to 20.
        String pageCursor = "pageCursor_example"; // String | Cursor returned from the previous response (the `next` field) to fetch the next page.
        try {
            CompletableFuture<ApiResponse<ListApprovalsResponse>> response = fireblocks.approvalsBeta().getApprovals(includeUserApproved, userId, includeAllUsers, quorumStatusMode, pageSize, pageCursor);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ApprovalsBetaApi#getApprovals");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **includeUserApproved** | **Boolean**| When true, also include requests the authenticated user has already approved that are still pending overall. Defaults to false (only requests the user has not yet acted on). | [optional] |
| **userId** | **String**| Return the pending requests for this user instead of the authenticated user. Requires an Admin, Non-Signing Admin, Security Admin or Security Auditor role; other roles are rejected with 403. Cannot be combined with &#x60;includeAllUsers&#x3D;true&#x60; — sending both is rejected with 400. | [optional] |
| **includeAllUsers** | **Boolean**| When true, return every pending request in the workspace instead of a single user&#39;s queue. Defaults to false. Requires an Admin, Non-Signing Admin, Security Admin or Security Auditor role; other roles are rejected with 403. In this mode &#x60;userStatus&#x60; is always &#x60;USER_STATUS_NOT_APPLICABLE&#x60;, because the response is not scoped to one user, and &#x60;includeUserApproved&#x60; has no effect. Cannot be combined with &#x60;userId&#x60;. | [optional] [default to false] |
| **quorumStatusMode** | **String**| How much quorum detail to include in each request&#39;s &#x60;quorumStatus&#x60;. &#x60;NONE&#x60; (the default) returns it as &#x60;null&#x60;. &#x60;SUMMARY&#x60; returns the approval thresholds, current counts and status. &#x60;FULL&#x60; is rejected with 400 on this endpoint because the per-approver breakdown requires a single request — use &#x60;GET /approvals/{requestId}&#x60; for it. Any other value is rejected with 400; the parameter is case-sensitive. | [optional] [default to NONE] [enum: NONE, SUMMARY] |
| **pageSize** | **Integer**| Number of results per page. Maximum 30. Defaults to 20. | [optional] [default to 20] |
| **pageCursor** | **String**| Cursor returned from the previous response (the &#x60;next&#x60; field) to fetch the next page. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**ListApprovalsResponse**](ListApprovalsResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Approval requests the authenticated user is eligible to act on. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## rejectApproval

> CompletableFuture<ApiResponse<Void>> rejectApproval rejectApproval(requestId, idempotencyKey)

Reject an approval request

Reject a pending approval request as the authenticated API user. No signature is required (unlike approve). The caller must be eligible to act on the request; rejecting finalizes the request as rejected per the approval policy.  Endpoint Permission: Owner, Admin, Non-Signing Admin, Approver, Signer, Security Admin.

### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.BasePath;
import com.fireblocks.sdk.Fireblocks;
import com.fireblocks.sdk.ConfigurationOptions;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.api.ApprovalsBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String requestId = "18055"; // String | The approval request ID.
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<Void>> response = fireblocks.approvalsBeta().rejectApproval(requestId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ApprovalsBetaApi#rejectApproval");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestId** | **String**| The approval request ID. | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The approval request was rejected. |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

