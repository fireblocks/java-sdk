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
import com.fireblocks.sdk.Pair;
import com.fireblocks.sdk.ValidationUtils;
import com.fireblocks.sdk.model.AbiFunction;
import com.fireblocks.sdk.model.ContractDeployRequest;
import com.fireblocks.sdk.model.ContractDeployResponse;
import com.fireblocks.sdk.model.ContractTemplateDto;
import com.fireblocks.sdk.model.ContractUploadRequest;
import com.fireblocks.sdk.model.TemplatesPaginatedResponse;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContractTemplatesApi {
    private final HttpClient memberVarHttpClient;
    private final ObjectMapper memberVarObjectMapper;
    private final String memberVarBaseUri;
    private final Consumer<HttpRequest.Builder> memberVarInterceptor;
    private final Duration memberVarReadTimeout;
    private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
    private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

    public ContractTemplatesApi() {
        this(new ApiClient());
    }

    public ContractTemplatesApi(ApiClient apiClient) {
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
     * Delete a contract template by id Delete a contract by id. allowed only for private contract
     * templates. Notice: it is irreversible!
     *
     * @param contractTemplateId The Contract Template identifier (required)
     * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<Void>> deleteContractTemplateById(
            String contractTemplateId) throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    deleteContractTemplateByIdRequestBuilder(contractTemplateId);
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
                                                    "deleteContractTemplateById",
                                                    localVarResponse));
                                }
                                return CompletableFuture.completedFuture(
                                        new ApiResponse<Void>(
                                                localVarResponse.statusCode(),
                                                localVarResponse.headers().map(),
                                                null));
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder deleteContractTemplateByIdRequestBuilder(String contractTemplateId)
            throws ApiException {
        ValidationUtils.assertParamExistsAndNotEmpty(
                "deleteContractTemplateById", "contractTemplateId", contractTemplateId);

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath =
                "/tokenization/templates/{contractTemplateId}"
                        .replace(
                                "{contractTemplateId}",
                                ApiClient.urlEncode(contractTemplateId.toString()));

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        localVarRequestBuilder.header("Accept", "application/json");

        localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
        if (memberVarReadTimeout != null) {
            localVarRequestBuilder.timeout(memberVarReadTimeout);
        }
        if (memberVarInterceptor != null) {
            memberVarInterceptor.accept(localVarRequestBuilder);
        }
        return localVarRequestBuilder;
    }
    /**
     * Deploy contract Deploy a new contract by contract template id. If you wish to deploy a token
     * (ERC20, ERC721 etc), and create asset please use POST /tokenization
     *
     * @param contractDeployRequest (required)
     * @param contractTemplateId The Contract Template identifier (required)
     * @param idempotencyKey A unique identifier for the request. If the request is sent multiple
     *     times with the same idempotency key, the server will return the same response as the
     *     first request. The idempotency key is valid for 24 hours. (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;ContractDeployResponse&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<ContractDeployResponse>> deployContract(
            ContractDeployRequest contractDeployRequest,
            String contractTemplateId,
            String idempotencyKey)
            throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    deployContractRequestBuilder(
                            contractDeployRequest, contractTemplateId, idempotencyKey);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException("deployContract", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<ContractDeployResponse>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            ContractDeployResponse>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder deployContractRequestBuilder(
            ContractDeployRequest contractDeployRequest,
            String contractTemplateId,
            String idempotencyKey)
            throws ApiException {
        ValidationUtils.assertParamExists(
                "deployContract", "contractDeployRequest", contractDeployRequest);
        ValidationUtils.assertParamExistsAndNotEmpty(
                "deployContract", "contractTemplateId", contractTemplateId);

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath =
                "/tokenization/templates/{contractTemplateId}/deploy"
                        .replace(
                                "{contractTemplateId}",
                                ApiClient.urlEncode(contractTemplateId.toString()));

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        if (idempotencyKey != null) {
            localVarRequestBuilder.header("Idempotency-Key", idempotencyKey.toString());
        }
        localVarRequestBuilder.header("Content-Type", "application/json");
        localVarRequestBuilder.header("Accept", "application/json");

        try {
            byte[] localVarPostBody =
                    memberVarObjectMapper.writeValueAsBytes(contractDeployRequest);
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
     * Return contract template&#39;s constructor Return contract template&#39;s constructor ABI
     *
     * @param contractTemplateId The Contract Template identifier (required)
     * @param withDocs true if you want to get the abi with its docs (optional, default to false)
     * @return CompletableFuture&lt;ApiResponse&lt;AbiFunction&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<AbiFunction>> getConstructorByContractTemplateId(
            String contractTemplateId, Boolean withDocs) throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    getConstructorByContractTemplateIdRequestBuilder(contractTemplateId, withDocs);
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
                                                    "getConstructorByContractTemplateId",
                                                    localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<AbiFunction>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            AbiFunction>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder getConstructorByContractTemplateIdRequestBuilder(
            String contractTemplateId, Boolean withDocs) throws ApiException {
        ValidationUtils.assertParamExistsAndNotEmpty(
                "getConstructorByContractTemplateId", "contractTemplateId", contractTemplateId);

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath =
                "/tokenization/templates/{contractTemplateId}/constructor"
                        .replace(
                                "{contractTemplateId}",
                                ApiClient.urlEncode(contractTemplateId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
        String localVarQueryParameterBaseName;
        localVarQueryParameterBaseName = "withDocs";
        localVarQueryParams.addAll(ApiClient.parameterToPairs("withDocs", withDocs));

        if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
            StringJoiner queryJoiner = new StringJoiner("&");
            localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
            if (localVarQueryStringJoiner.length() != 0) {
                queryJoiner.add(localVarQueryStringJoiner.toString());
            }
            localVarRequestBuilder.uri(
                    URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
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
     * Return contract template by id Return detailed information about the contract template
     *
     * @param contractTemplateId The Contract Template identifier (required)
     * @return CompletableFuture&lt;ApiResponse&lt;ContractTemplateDto&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<ContractTemplateDto>> getContractTemplateById(
            String contractTemplateId) throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    getContractTemplateByIdRequestBuilder(contractTemplateId);
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
                                                    "getContractTemplateById", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<ContractTemplateDto>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            ContractTemplateDto>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder getContractTemplateByIdRequestBuilder(String contractTemplateId)
            throws ApiException {
        ValidationUtils.assertParamExistsAndNotEmpty(
                "getContractTemplateById", "contractTemplateId", contractTemplateId);

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath =
                "/tokenization/templates/{contractTemplateId}"
                        .replace(
                                "{contractTemplateId}",
                                ApiClient.urlEncode(contractTemplateId.toString()));

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
     * List all contract templates Return minimal representation of all the contract templates
     * available for the workspace
     *
     * @param limit Items per page (max 100) (optional, default to 100)
     * @param offset Paging offset (optional, default to 0)
     * @param pageCursor Page cursor to get the next page (optional)
     * @param pageSize Number of items per page, requesting more then max will return max items
     *     (optional)
     * @param type The type of the contract templates you wish to retrieve. Can accept one type,
     *     more or none (optional)
     * @param initializationPhase (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;TemplatesPaginatedResponse&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<TemplatesPaginatedResponse>> getContractTemplates(
            BigDecimal limit,
            BigDecimal offset,
            String pageCursor,
            BigDecimal pageSize,
            String type,
            String initializationPhase)
            throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    getContractTemplatesRequestBuilder(
                            limit, offset, pageCursor, pageSize, type, initializationPhase);
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
                                                    "getContractTemplates", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<TemplatesPaginatedResponse>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            TemplatesPaginatedResponse>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder getContractTemplatesRequestBuilder(
            BigDecimal limit,
            BigDecimal offset,
            String pageCursor,
            BigDecimal pageSize,
            String type,
            String initializationPhase)
            throws ApiException {

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath = "/tokenization/templates";

        List<Pair> localVarQueryParams = new ArrayList<>();
        StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
        String localVarQueryParameterBaseName;
        localVarQueryParameterBaseName = "limit";
        localVarQueryParams.addAll(ApiClient.parameterToPairs("limit", limit));
        localVarQueryParameterBaseName = "offset";
        localVarQueryParams.addAll(ApiClient.parameterToPairs("offset", offset));
        localVarQueryParameterBaseName = "pageCursor";
        localVarQueryParams.addAll(ApiClient.parameterToPairs("pageCursor", pageCursor));
        localVarQueryParameterBaseName = "pageSize";
        localVarQueryParams.addAll(ApiClient.parameterToPairs("pageSize", pageSize));
        localVarQueryParameterBaseName = "type";
        localVarQueryParams.addAll(ApiClient.parameterToPairs("type", type));
        localVarQueryParameterBaseName = "initializationPhase";
        localVarQueryParams.addAll(
                ApiClient.parameterToPairs("initializationPhase", initializationPhase));

        if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
            StringJoiner queryJoiner = new StringJoiner("&");
            localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
            if (localVarQueryStringJoiner.length() != 0) {
                queryJoiner.add(localVarQueryStringJoiner.toString());
            }
            localVarRequestBuilder.uri(
                    URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
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
     * Return contract template&#39;s function Return contract template&#x60;s function ABI by
     * signature
     *
     * @param contractTemplateId The Contract Template identifier (required)
     * @param functionSignature (required)
     * @return CompletableFuture&lt;ApiResponse&lt;AbiFunction&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<AbiFunction>> getFunctionAbiByContractTemplateId(
            String contractTemplateId, String functionSignature) throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    getFunctionAbiByContractTemplateIdRequestBuilder(
                            contractTemplateId, functionSignature);
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
                                                    "getFunctionAbiByContractTemplateId",
                                                    localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<AbiFunction>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            AbiFunction>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder getFunctionAbiByContractTemplateIdRequestBuilder(
            String contractTemplateId, String functionSignature) throws ApiException {
        ValidationUtils.assertParamExistsAndNotEmpty(
                "getFunctionAbiByContractTemplateId", "contractTemplateId", contractTemplateId);
        ValidationUtils.assertParamExistsAndNotEmpty(
                "getFunctionAbiByContractTemplateId", "functionSignature", functionSignature);

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath =
                "/tokenization/templates/{contractTemplateId}/function"
                        .replace(
                                "{contractTemplateId}",
                                ApiClient.urlEncode(contractTemplateId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
        String localVarQueryParameterBaseName;
        localVarQueryParameterBaseName = "functionSignature";
        localVarQueryParams.addAll(
                ApiClient.parameterToPairs("functionSignature", functionSignature));

        if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
            StringJoiner queryJoiner = new StringJoiner("&");
            localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
            if (localVarQueryStringJoiner.length() != 0) {
                queryJoiner.add(localVarQueryStringJoiner.toString());
            }
            localVarRequestBuilder.uri(
                    URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
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
     * Upload contract template Upload a new contract template. This contract template will be
     * available for the workspace
     *
     * @param contractUploadRequest (required)
     * @param idempotencyKey A unique identifier for the request. If the request is sent multiple
     *     times with the same idempotency key, the server will return the same response as the
     *     first request. The idempotency key is valid for 24 hours. (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;ContractTemplateDto&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<ContractTemplateDto>> uploadContractTemplate(
            ContractUploadRequest contractUploadRequest, String idempotencyKey)
            throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    uploadContractTemplateRequestBuilder(contractUploadRequest, idempotencyKey);
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
                                                    "uploadContractTemplate", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<ContractTemplateDto>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            ContractTemplateDto>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder uploadContractTemplateRequestBuilder(
            ContractUploadRequest contractUploadRequest, String idempotencyKey)
            throws ApiException {
        ValidationUtils.assertParamExists(
                "uploadContractTemplate", "contractUploadRequest", contractUploadRequest);

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath = "/tokenization/templates";

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        if (idempotencyKey != null) {
            localVarRequestBuilder.header("Idempotency-Key", idempotencyKey.toString());
        }
        localVarRequestBuilder.header("Content-Type", "application/json");
        localVarRequestBuilder.header("Accept", "application/json");

        try {
            byte[] localVarPostBody =
                    memberVarObjectMapper.writeValueAsBytes(contractUploadRequest);
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
