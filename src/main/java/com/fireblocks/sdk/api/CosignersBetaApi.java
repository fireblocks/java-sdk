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

import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.Pair;

import com.fireblocks.sdk.model.ApiKey;
import com.fireblocks.sdk.model.ApiKeysPaginatedResponse;
import java.math.BigDecimal;
import com.fireblocks.sdk.model.Cosigner;
import com.fireblocks.sdk.model.CosignersPaginatedResponse;
import com.fireblocks.sdk.model.ErrorSchema;
import com.fireblocks.sdk.model.RenameCosigner;
import java.util.UUID;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CosignersBetaApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public CosignersBetaApi() {
    this(new ApiClient());
  }

  public CosignersBetaApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  private ApiException getApiException(String operationId, HttpResponse<String> response) {
    String message = formatExceptionMessage(operationId, response.statusCode(), response.body());
    return new ApiException(response.statusCode(), message, response.headers(), response.body());
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Get API key
   * Get an API key by ID **Note:** These endpoints are currently in beta and might be subject to changes. 
   * @param cosignerId The unique identifier of the cosigner (required)
   * @param apiKeyId The unique identifier of the API key (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ApiKey&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ApiKey>> getApiKey(UUID cosignerId, String apiKeyId) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getApiKeyRequestBuilder(cosignerId, apiKeyId);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getApiKey", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<ApiKey>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<ApiKey>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder getApiKeyRequestBuilder(UUID cosignerId, String apiKeyId) throws ApiException {
    // verify the required parameter 'cosignerId' is set
    if (cosignerId == null) {
      throw new ApiException(400, "Missing the required parameter 'cosignerId' when calling getApiKey");
    }
    // verify the required parameter 'apiKeyId' is set
    if (apiKeyId == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKeyId' when calling getApiKey");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/cosigners/{cosignerId}/api_keys/{apiKeyId}"
        .replace("{cosignerId}", ApiClient.urlEncode(cosignerId.toString()))
        .replace("{apiKeyId}", ApiClient.urlEncode(apiKeyId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Get all API keys
   * Get all cosigner paired API keys (paginated) **Note:** These endpoints are currently in beta and might be subject to changes. 
   * @param cosignerId The unique identifier of the cosigner (required)
   * @param order ASC / DESC ordering (default DESC) (optional, default to DESC)
   * @param pageCursor Cursor of the required page (optional)
   * @param pageSize Maximum number of items in the page (optional, default to 10)
   * @return CompletableFuture&lt;ApiResponse&lt;ApiKeysPaginatedResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<ApiKeysPaginatedResponse>> getApiKeys(UUID cosignerId, String order, String pageCursor, BigDecimal pageSize) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getApiKeysRequestBuilder(cosignerId, order, pageCursor, pageSize);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getApiKeys", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<ApiKeysPaginatedResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<ApiKeysPaginatedResponse>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder getApiKeysRequestBuilder(UUID cosignerId, String order, String pageCursor, BigDecimal pageSize) throws ApiException {
    // verify the required parameter 'cosignerId' is set
    if (cosignerId == null) {
      throw new ApiException(400, "Missing the required parameter 'cosignerId' when calling getApiKeys");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/cosigners/{cosignerId}/api_keys"
        .replace("{cosignerId}", ApiClient.urlEncode(cosignerId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "order";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("order", order));
    localVarQueryParameterBaseName = "pageCursor";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("pageCursor", pageCursor));
    localVarQueryParameterBaseName = "pageSize";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("pageSize", pageSize));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Get cosigner
   * Get a cosigner by ID **Note:** These endpoints are currently in beta and might be subject to changes. 
   * @param cosignerId The unique identifier of the cosigner (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Cosigner&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<Cosigner>> getCosigner(UUID cosignerId) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getCosignerRequestBuilder(cosignerId);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getCosigner", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<Cosigner>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<Cosigner>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder getCosignerRequestBuilder(UUID cosignerId) throws ApiException {
    // verify the required parameter 'cosignerId' is set
    if (cosignerId == null) {
      throw new ApiException(400, "Missing the required parameter 'cosignerId' when calling getCosigner");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/cosigners/{cosignerId}"
        .replace("{cosignerId}", ApiClient.urlEncode(cosignerId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Get all cosigners
   * Get all workspace cosigners (paginated) **Note:** These endpoints are currently in beta and might be subject to changes. 
   * @param order ASC / DESC ordering (default DESC) (optional, default to DESC)
   * @param pageCursor Cursor of the required page (optional)
   * @param pageSize Maximum number of items in the page (optional, default to 10)
   * @return CompletableFuture&lt;ApiResponse&lt;CosignersPaginatedResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<CosignersPaginatedResponse>> getCosigners(String order, String pageCursor, BigDecimal pageSize) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getCosignersRequestBuilder(order, pageCursor, pageSize);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getCosigners", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<CosignersPaginatedResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<CosignersPaginatedResponse>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder getCosignersRequestBuilder(String order, String pageCursor, BigDecimal pageSize) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/cosigners";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "order";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("order", order));
    localVarQueryParameterBaseName = "pageCursor";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("pageCursor", pageCursor));
    localVarQueryParameterBaseName = "pageSize";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("pageSize", pageSize));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Rename cosigner
   * Rename a cosigner by ID **Note:** These endpoints are currently in beta and might be subject to changes. 
   * @param renameCosigner  (required)
   * @param cosignerId The unique identifier of the cosigner (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Cosigner&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<Cosigner>> renameCosigner(RenameCosigner renameCosigner, UUID cosignerId) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = renameCosignerRequestBuilder(renameCosigner, cosignerId);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (memberVarAsyncResponseInterceptor != null) {
              memberVarAsyncResponseInterceptor.accept(localVarResponse);
            }
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("renameCosigner", localVarResponse));
            }
            try {
              String responseBody = localVarResponse.body();
              return CompletableFuture.completedFuture(
                  new ApiResponse<Cosigner>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      responseBody == null || responseBody.isBlank() ? null : memberVarObjectMapper.readValue(responseBody, new TypeReference<Cosigner>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder renameCosignerRequestBuilder(RenameCosigner renameCosigner, UUID cosignerId) throws ApiException {
    // verify the required parameter 'renameCosigner' is set
    if (renameCosigner == null) {
      throw new ApiException(400, "Missing the required parameter 'renameCosigner' when calling renameCosigner");
    }
    // verify the required parameter 'cosignerId' is set
    if (cosignerId == null) {
      throw new ApiException(400, "Missing the required parameter 'cosignerId' when calling renameCosigner");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/cosigners/{cosignerId}"
        .replace("{cosignerId}", ApiClient.urlEncode(cosignerId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(renameCosigner);
      localVarRequestBuilder.method("PATCH", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
