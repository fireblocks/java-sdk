# ContactsApi

All URIs are relative to https://developers.fireblocks.com/reference/

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getContacts**](ContactsApi.md#getContacts) | **GET** /contacts | List contacts |



## getContacts

> CompletableFuture<ApiResponse<ContactsPagedResponse>> getContacts getContacts(pageCursor, pageSize, includeTotal, name, types, containerId, archived, accessControl, includeTagIds, excludeTagIds, sortBy, order)

List contacts

Returns a paginated list of the workspace&#39;s address book contacts.  Live contacts are returned by default; pass &#x60;archived&#x3D;true&#x60; to return only the archived ones. Results are sorted by &#x60;name&#x60; ascending unless &#x60;sortBy&#x60;/&#x60;order&#x60; say otherwise. Because the sort column is the page cursor&#39;s leading key, a &#x60;pageCursor&#x60; must be replayed with the same sort it was minted under, or the request is rejected.  Endpoint Permissions: any workspace role may read the address book. Writes are role-gated. 

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
import com.fireblocks.sdk.api.ContactsApi;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example {
    public static void main(String[] args) {
        ConfigurationOptions configurationOptions = new ConfigurationOptions()
            .basePath(BasePath.Sandbox)
            .apiKey("my-api-key")
            .secretKey("my-secret-key");
        Fireblocks fireblocks = new Fireblocks(configurationOptions);

        String pageCursor = "bmFtZS1BU0M=~QWNtZSBDb3Jw:NA=="; // String | Cursor indicating the page position. Omit to fetch the first page.
        Integer pageSize = 100; // Integer | Number of results per page
        Boolean includeTotal = false; // Boolean | Return the total count of matching contacts alongside the page. Counting is opt-in because it costs an extra pass over the filtered set; `total` is omitted from the response unless this is `true`.
        String name = "acme"; // String | Filter by a case-insensitive substring of the contact name
        List<String> types = Arrays.asList(); // List<String> | Filter by one or more contact types
        UUID containerId = UUID.fromString("11111111-1111-1111-1111-111111111111"); // UUID | Filter by the container holding the contact
        Boolean archived = false; // Boolean | Return only archived contacts instead of live ones
        String accessControl = "WHITELIST"; // String | Filter by the access control applied to the contact
        List<UUID> includeTagIds = Arrays.asList(); // List<UUID> | List of tag IDs to include. Contacts with any of these tags will be included
        List<UUID> excludeTagIds = Arrays.asList(); // List<UUID> | List of tag IDs to exclude. Contacts with any of these tags will be filtered out
        String sortBy = "name"; // String | The field to sort by
        String order = "ASC"; // String | The sort direction
        try {
            CompletableFuture<ApiResponse<ContactsPagedResponse>> response = fireblocks.contacts().getContacts(pageCursor, pageSize, includeTotal, name, types, containerId, archived, accessControl, includeTagIds, excludeTagIds, sortBy, order);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContactsApi#getContacts");
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
| **pageCursor** | **String**| Cursor indicating the page position. Omit to fetch the first page. | [optional] |
| **pageSize** | **Integer**| Number of results per page | [optional] [default to 100] |
| **includeTotal** | **Boolean**| Return the total count of matching contacts alongside the page. Counting is opt-in because it costs an extra pass over the filtered set; &#x60;total&#x60; is omitted from the response unless this is &#x60;true&#x60;. | [optional] [default to false] |
| **name** | **String**| Filter by a case-insensitive substring of the contact name | [optional] |
| **types** | [**List&lt;String&gt;**](String.md)| Filter by one or more contact types | [optional] [enum: COUNTERPARTY, OWN_ACCOUNT] |
| **containerId** | **UUID**| Filter by the container holding the contact | [optional] |
| **archived** | **Boolean**| Return only archived contacts instead of live ones | [optional] [default to false] |
| **accessControl** | **String**| Filter by the access control applied to the contact | [optional] [enum: WHITELIST, BLACKLIST] |
| **includeTagIds** | [**List&lt;UUID&gt;**](UUID.md)| List of tag IDs to include. Contacts with any of these tags will be included | [optional] |
| **excludeTagIds** | [**List&lt;UUID&gt;**](UUID.md)| List of tag IDs to exclude. Contacts with any of these tags will be filtered out | [optional] |
| **sortBy** | **String**| The field to sort by | [optional] [default to name] [enum: name, updatedAt] |
| **order** | **String**| The sort direction | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

CompletableFuture<ApiResponse<[**ContactsPagedResponse**](ContactsPagedResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated list of contacts |  * X-Request-ID -  <br>  |
| **0** | Error Response |  * X-Request-ID -  <br>  |

