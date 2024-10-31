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


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fireblocks.sdk.ApiClient;
import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ApiResponse;
import com.fireblocks.sdk.ValidationUtils;
import com.fireblocks.sdk.model.ContractAbiResponseDto;
import com.fireblocks.sdk.model.ParameterWithValue;
import com.fireblocks.sdk.model.ReadCallFunctionDto;
import com.fireblocks.sdk.model.WriteCallFunctionDto;
import com.fireblocks.sdk.model.WriteCallFunctionResponseDto;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContractInteractionsApi {
    private final HttpClient memberVarHttpClient;
    private final ObjectMapper memberVarObjectMapper;
    private final String memberVarBaseUri;
    private final Consumer<HttpRequest.Builder> memberVarInterceptor;
    private final Duration memberVarReadTimeout;
    private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
    private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

    public ContractInteractionsApi() {
        this(new ApiClient());
    }

    public ContractInteractionsApi(ApiClient apiClient) {
        memberVarHttpClient = apiClient.getHttpClient();
        memberVarObjectMapper = apiClient.getObjectMapper();
        memberVarBaseUri = apiClient.getBaseUri();
        memberVarInterceptor = apiClient.getRequestInterceptor();
        memberVarReadTimeout = apiClient.getReadTimeout();
        memberVarResponseInterceptor = apiClient.getResponseInterceptor();
        memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
    }

    private ApiException getApiException(String operationId, HttpResponse<String> response) {
        String message =
                formatExceptionMessage(operationId, response.statusCode(), response.body());
        return new ApiException(
                response.statusCode(), message, response.headers(), response.body());
    }

    private String formatExceptionMessage(String operationId, int statusCode, String body) {
        if (body == null || body.isEmpty()) {
            body = "[no body]";
        }
        return operationId + " call failed with: " + statusCode + " - " + body;
    }

    /**
     * Return deployed contract&#39;s ABI Return deployed contract&#39;s ABI by blockchain native
     * asset id and contract address
     *
     * @param contractAddress The contract&#39;s onchain address (required)
     * @param baseAssetId (required)
     * @param idempotencyKey A unique identifier for the request. If the request is sent multiple
     *     times with the same idempotency key, the server will return the same response as the
     *     first request. The idempotency key is valid for 24 hours. (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;ContractAbiResponseDto&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<ContractAbiResponseDto>> getDeployedContractAbi(
            String contractAddress, String baseAssetId, String idempotencyKey) throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    getDeployedContractAbiRequestBuilder(
                            contractAddress, baseAssetId, idempotencyKey);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException(
                                                    "getDeployedContractAbi", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<ContractAbiResponseDto>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            ContractAbiResponseDto>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder getDeployedContractAbiRequestBuilder(
            String contractAddress, String baseAssetId, String idempotencyKey) throws ApiException {
        ValidationUtils.assertParamExistsAndNotEmpty(
                "getDeployedContractAbi", "contractAddress", contractAddress);
        ValidationUtils.assertParamExistsAndNotEmpty(
                "getDeployedContractAbi", "baseAssetId", baseAssetId);

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath =
                "/contract_interactions/base_asset_id/{baseAssetId}/contract_address/{contractAddress}/functions"
                        .replace(
                                "{contractAddress}",
                                ApiClient.urlEncode(contractAddress.toString()))
                        .replace("{baseAssetId}", ApiClient.urlEncode(baseAssetId.toString()));

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        if (idempotencyKey != null) {
            localVarRequestBuilder.header("Idempotency-Key", idempotencyKey.toString());
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
     * Call a read function on a deployed contract Call a read function on a deployed contract by
     * blockchain native asset id and contract address
     *
     * @param readCallFunctionDto (required)
     * @param contractAddress The contract&#39;s onchain address (required)
     * @param baseAssetId (required)
     * @param idempotencyKey A unique identifier for the request. If the request is sent multiple
     *     times with the same idempotency key, the server will return the same response as the
     *     first request. The idempotency key is valid for 24 hours. (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;List&lt;ParameterWithValue&gt;&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<List<ParameterWithValue>>> readCallFunction(
            ReadCallFunctionDto readCallFunctionDto,
            String contractAddress,
            String baseAssetId,
            String idempotencyKey)
            throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    readCallFunctionRequestBuilder(
                            readCallFunctionDto, contractAddress, baseAssetId, idempotencyKey);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException("readCallFunction", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<List<ParameterWithValue>>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            List<
                                                                                    ParameterWithValue>>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder readCallFunctionRequestBuilder(
            ReadCallFunctionDto readCallFunctionDto,
            String contractAddress,
            String baseAssetId,
            String idempotencyKey)
            throws ApiException {
        ValidationUtils.assertParamExists(
                "readCallFunction", "readCallFunctionDto", readCallFunctionDto);
        ValidationUtils.assertParamExistsAndNotEmpty(
                "readCallFunction", "contractAddress", contractAddress);
        ValidationUtils.assertParamExistsAndNotEmpty(
                "readCallFunction", "baseAssetId", baseAssetId);

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath =
                "/contract_interactions/base_asset_id/{baseAssetId}/contract_address/{contractAddress}/functions/read"
                        .replace(
                                "{contractAddress}",
                                ApiClient.urlEncode(contractAddress.toString()))
                        .replace("{baseAssetId}", ApiClient.urlEncode(baseAssetId.toString()));

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        if (idempotencyKey != null) {
            localVarRequestBuilder.header("Idempotency-Key", idempotencyKey.toString());
        }
        localVarRequestBuilder.header("Content-Type", "application/json");
        localVarRequestBuilder.header("Accept", "application/json");

        try {
            byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(readCallFunctionDto);
            localVarRequestBuilder.method(
                    "POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
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
    /**
     * Call a write function on a deployed contract Call a write function on a deployed contract by
     * blockchain native asset id and contract address. This creates an onchain transaction, thus it
     * is an async operation. It returns a transaction id that can be polled for status check
     *
     * @param writeCallFunctionDto (required)
     * @param contractAddress The contract&#39;s onchain address (required)
     * @param baseAssetId (required)
     * @param idempotencyKey A unique identifier for the request. If the request is sent multiple
     *     times with the same idempotency key, the server will return the same response as the
     *     first request. The idempotency key is valid for 24 hours. (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;WriteCallFunctionResponseDto&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<WriteCallFunctionResponseDto>> writeCallFunction(
            WriteCallFunctionDto writeCallFunctionDto,
            String contractAddress,
            String baseAssetId,
            String idempotencyKey)
            throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    writeCallFunctionRequestBuilder(
                            writeCallFunctionDto, contractAddress, baseAssetId, idempotencyKey);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException("writeCallFunction", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<WriteCallFunctionResponseDto>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            WriteCallFunctionResponseDto>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder writeCallFunctionRequestBuilder(
            WriteCallFunctionDto writeCallFunctionDto,
            String contractAddress,
            String baseAssetId,
            String idempotencyKey)
            throws ApiException {
        ValidationUtils.assertParamExists(
                "writeCallFunction", "writeCallFunctionDto", writeCallFunctionDto);
        ValidationUtils.assertParamExistsAndNotEmpty(
                "writeCallFunction", "contractAddress", contractAddress);
        ValidationUtils.assertParamExistsAndNotEmpty(
                "writeCallFunction", "baseAssetId", baseAssetId);

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath =
                "/contract_interactions/base_asset_id/{baseAssetId}/contract_address/{contractAddress}/functions/write"
                        .replace(
                                "{contractAddress}",
                                ApiClient.urlEncode(contractAddress.toString()))
                        .replace("{baseAssetId}", ApiClient.urlEncode(baseAssetId.toString()));

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        if (idempotencyKey != null) {
            localVarRequestBuilder.header("Idempotency-Key", idempotencyKey.toString());
        }
        localVarRequestBuilder.header("Content-Type", "application/json");
        localVarRequestBuilder.header("Accept", "application/json");

        try {
            byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(writeCallFunctionDto);
            localVarRequestBuilder.method(
                    "POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
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
