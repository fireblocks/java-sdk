# CantonBetaApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCantonCall**](CantonBetaApi.md#createCantonCall) | **POST** /operations/canton/calls | Make a Canton call |
| [**respondToCantonOffer**](CantonBetaApi.md#respondToCantonOffer) | **POST** /operations/canton/offers/{offerId}/responses | Answer an offer |



## createCantonCall

> CompletableFuture<ApiResponse<CallAccepted>> createCantonCall createCantonCall(cantonCall, idempotencyKey)

Make a Canton call

Submits a Canton call from a vault account&#39;s Canton wallet. &#x60;type&#x60; selects the call and the shape of &#x60;payload&#x60;.

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
import com.fireblocks.sdk.api.CantonBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        CantonCall cantonCall = new CantonCall(); // CantonCall | 
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<CallAccepted>> response = fireblocks.cantonBeta().createCantonCall(cantonCall, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CantonBetaApi#createCantonCall");
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
| **cantonCall** | [**CantonCall**](CantonCall.md)|  | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**CallAccepted**](CallAccepted.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The outgoing transaction that carries the call. |  * X-Request-ID -  <br>  |
| **400** | Unknown or missing type, a missing required payload field, or an invalid party id, blockchainId, or expiry |  * X-Request-ID -  <br>  |
| **404** | No Canton wallet for this vault account and blockchainId, or an unknown end investor for this tenant |  * X-Request-ID -  <br>  |
| **409** | The target is not in a state this call can act on, or more than one candidate contract matched the wallet |  * X-Request-ID -  <br>  |
| **501** | This call type is not yet available: DTCC_END_INVESTOR_INVITE_CANCEL, DTCC_ALLOW_LIST_ADD, DTCC_ALLOW_LIST_REMOVE |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## respondToCantonOffer

> CompletableFuture<ApiResponse<OfferResponseAccepted>> respondToCantonOffer respondToCantonOffer(offerResponse, offerId, idempotencyKey)

Answer an offer

Responds to an incoming Canton offer. Set &#x60;responseType&#x60; to one of the values in the offer transaction&#39;s &#x60;cantonDetails.offerResponse.availableResponses&#x60;.

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
import com.fireblocks.sdk.api.CantonBetaApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        OfferResponse offerResponse = new OfferResponse(); // OfferResponse | 
        String offerId = "5a1d8b0f-2c31-4c7e-9d0a-118e7b6c4a21"; // String | The Fireblocks transaction id of the incoming offer being answered.
        String idempotencyKey = "idempotencyKey_example"; // String | A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours.
        try {
            CompletableFuture<ApiResponse<OfferResponseAccepted>> response = fireblocks.cantonBeta().respondToCantonOffer(offerResponse, offerId, idempotencyKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CantonBetaApi#respondToCantonOffer");
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
| **offerResponse** | [**OfferResponse**](OfferResponse.md)|  | |
| **offerId** | **String**| The Fireblocks transaction id of the incoming offer being answered. | |
| **idempotencyKey** | **String**| A unique identifier for the request. If the request is sent multiple times with the same idempotency key, the server will return the same response as the first request. The idempotency key is valid for 24 hours. | [optional] |

### Return type

CompletableFuture<ApiResponse<[**OfferResponseAccepted**](OfferResponseAccepted.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The outgoing transaction that carries the response. Its on-chain outcome arrives by webhook as a status update on this transaction. |  * X-Request-ID -  <br>  |
| **400** | Unknown or missing responseType, or a missing required payload field, or the response is not available to this workspace&#39;s side of the offer (a sender sending accept/reject, a receiver sending withdraw) |  * X-Request-ID -  <br>  |
| **404** | Unknown offer id for this tenant |  * X-Request-ID -  <br>  |
| **409** | The offer cannot take this response now. An accept or reject: the offer is already answered, expired, or a response is in flight. ALLOCATION_WITHDRAW — which is sent AFTER the accept, on the same offer: the allocation is not ALLOCATED, because the accept has not settled yet, or it was already withdrawn or settled by the venue. The message names the state. |  * X-Request-ID -  <br>  |
| **501** | This responseType is not yet available |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

