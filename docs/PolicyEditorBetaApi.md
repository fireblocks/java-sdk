# PolicyEditorBetaApi

All URIs are relative to *https://api.fireblocks.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getActivePolicy**](PolicyEditorBetaApi.md#getActivePolicy) | **GET** /tap/active_policy | Get the active policy and its validation |
| [**getDraft**](PolicyEditorBetaApi.md#getDraft) | **GET** /tap/draft | Get the active draft |
| [**publishDraft**](PolicyEditorBetaApi.md#publishDraft) | **POST** /tap/draft | Send publish request for a certain draft id |
| [**publishPolicyRules**](PolicyEditorBetaApi.md#publishPolicyRules) | **POST** /tap/publish | Send publish request for a set of policy rules |
| [**updateDraft**](PolicyEditorBetaApi.md#updateDraft) | **PUT** /tap/draft | Update the draft with a new set of rules |



## getActivePolicy

> PolicyAndValidationResponse getActivePolicy()

Get the active policy and its validation

Returns the active policy and its validation. </br>
**Note:** These endpoints are currently in beta and might be subject to changes.
If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.


### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.PolicyEditorBetaApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        PolicyEditorBetaApi apiInstance = new PolicyEditorBetaApi(configuration);
        try {
            PolicyAndValidationResponse result = apiInstance.getActivePolicy();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyEditorBetaApi#getActivePolicy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**PolicyAndValidationResponse**](PolicyAndValidationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A policy object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## getDraft

> DraftReviewAndValidationResponse getDraft()

Get the active draft

Returns the active draft and its validation. </br>
**Note:** These endpoints are currently in beta and might be subject to changes.
If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.


### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.PolicyEditorBetaApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        PolicyEditorBetaApi apiInstance = new PolicyEditorBetaApi(configuration);
        try {
            DraftReviewAndValidationResponse result = apiInstance.getDraft();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyEditorBetaApi#getDraft");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**DraftReviewAndValidationResponse**](DraftReviewAndValidationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A draft validation response object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## publishDraft

> PublishResult publishDraft(publishDraftRequest)

Send publish request for a certain draft id

Send publish request of certain draft id and returns the response. </br>
**Note:** These endpoints are currently in beta and might be subject to changes.
If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.


### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.PolicyEditorBetaApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        PolicyEditorBetaApi apiInstance = new PolicyEditorBetaApi(configuration);
        PublishDraftRequest publishDraftRequest = new PublishDraftRequest(); // PublishDraftRequest | 
        try {
            PublishResult result = apiInstance.publishDraft(publishDraftRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyEditorBetaApi#publishDraft");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **publishDraftRequest** | [**PublishDraftRequest**](PublishDraftRequest.md)|  | |

### Return type

[**PublishResult**](PublishResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A policy publish result object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## publishPolicyRules

> PublishResult publishPolicyRules(publishPolicyRulesRequest)

Send publish request for a set of policy rules

Send publish request of set of policy rules and returns the response. </br>
**Note:** These endpoints are currently in beta and might be subject to changes.
If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.


### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.PolicyEditorBetaApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        PolicyEditorBetaApi apiInstance = new PolicyEditorBetaApi(configuration);
        PublishPolicyRulesRequest publishPolicyRulesRequest = new PublishPolicyRulesRequest(); // PublishPolicyRulesRequest | 
        try {
            PublishResult result = apiInstance.publishPolicyRules(publishPolicyRulesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyEditorBetaApi#publishPolicyRules");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **publishPolicyRulesRequest** | [**PublishPolicyRulesRequest**](PublishPolicyRulesRequest.md)|  | |

### Return type

[**PublishResult**](PublishResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A policy publish result object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |


## updateDraft

> DraftReviewAndValidationResponse updateDraft(updateDraftRequest)

Update the draft with a new set of rules

Update the draft and return its validation. </br>
**Note:** These endpoints are currently in beta and might be subject to changes.
If you want to participate and learn more about the Fireblocks TAP, please contact your Fireblocks Customer Success Manager or send an email to CSM@fireblocks.com.


### Example

```java
// Import classes:
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.*;
import com.fireblocks.sdk.PolicyEditorBetaApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setApiKey(API_KEY);
        configuration.setBasePath(BASE_PATH);
        configuration.setSecretKey(getKey());

        PolicyEditorBetaApi apiInstance = new PolicyEditorBetaApi(configuration);
        UpdateDraftRequest updateDraftRequest = new UpdateDraftRequest(); // UpdateDraftRequest | 
        try {
            DraftReviewAndValidationResponse result = apiInstance.updateDraft(updateDraftRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PolicyEditorBetaApi#updateDraft");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateDraftRequest** | [**UpdateDraftRequest**](UpdateDraftRequest.md)|  | |

### Return type

[**DraftReviewAndValidationResponse**](DraftReviewAndValidationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A draft validation response object |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

