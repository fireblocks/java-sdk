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
import com.fireblocks.sdk.model.TravelRuleGetAllVASPsResponse;
import com.fireblocks.sdk.model.TravelRuleUpdateVASPDetails;
import com.fireblocks.sdk.model.TravelRuleVASP;
import com.fireblocks.sdk.model.TravelRuleValidateFullTransactionRequest;
import com.fireblocks.sdk.model.TravelRuleValidateTransactionRequest;
import com.fireblocks.sdk.model.TravelRuleValidateTransactionResponse;
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
public class TravelRuleBetaApi {
    private final HttpClient memberVarHttpClient;
    private final ObjectMapper memberVarObjectMapper;
    private final String memberVarBaseUri;
    private final Consumer<HttpRequest.Builder> memberVarInterceptor;
    private final Duration memberVarReadTimeout;
    private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
    private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

    public TravelRuleBetaApi() {
        this(new ApiClient());
    }

    public TravelRuleBetaApi(ApiClient apiClient) {
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
     * Get VASP details Get VASP Details. Returns information about a VASP that has the specified
     * DID. **Note:** The reference content in this section documents the Travel Rule beta endpoint.
     * The beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally
     * available. To enroll in the beta and enable this endpoint, contact your Fireblocks Customer
     * Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
     *
     * @param did (required)
     * @param fields CSV of fields to return (all, \&quot;blank\&quot; or see list of all field
     *     names below) (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;TravelRuleVASP&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<TravelRuleVASP>> getVASPByDID(String did, String fields)
            throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder = getVASPByDIDRequestBuilder(did, fields);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException("getVASPByDID", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<TravelRuleVASP>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            TravelRuleVASP>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder getVASPByDIDRequestBuilder(String did, String fields)
            throws ApiException {
        ValidationUtils.assertParamExistsAndNotEmpty("getVASPByDID", "did", did);

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath =
                "/screening/travel_rule/vasp/{did}"
                        .replace("{did}", ApiClient.urlEncode(did.toString()));

        List<Pair> localVarQueryParams = new ArrayList<>();
        StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
        String localVarQueryParameterBaseName;
        localVarQueryParameterBaseName = "fields";
        localVarQueryParams.addAll(ApiClient.parameterToPairs("fields", fields));

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
     * Get All VASPs Get All VASPs. Returns a list of VASPs. VASPs can be searched and sorted and
     * results are paginated. **Note:** The reference content in this section documents the Travel
     * Rule beta endpoint. The beta endpoint includes APIs that are currently in preview and
     * aren&#39;t yet generally available. To enroll in the beta and enable this endpoint, contact
     * your Fireblocks Customer Success Manager or send an email to
     * [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
     *
     * @param order Field to order by (optional)
     * @param perPage Records per page (optional)
     * @param page Page number (optional)
     * @param fields CSV of fields to return (all, \&quot;blank\&quot; or see list of all field
     *     names below) (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;TravelRuleGetAllVASPsResponse&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<TravelRuleGetAllVASPsResponse>> getVASPs(
            String order, BigDecimal perPage, BigDecimal page, String fields) throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    getVASPsRequestBuilder(order, perPage, page, fields);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException("getVASPs", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<TravelRuleGetAllVASPsResponse>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            TravelRuleGetAllVASPsResponse>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder getVASPsRequestBuilder(
            String order, BigDecimal perPage, BigDecimal page, String fields) throws ApiException {

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath = "/screening/travel_rule/vasp";

        List<Pair> localVarQueryParams = new ArrayList<>();
        StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
        String localVarQueryParameterBaseName;
        localVarQueryParameterBaseName = "order";
        localVarQueryParams.addAll(ApiClient.parameterToPairs("order", order));
        localVarQueryParameterBaseName = "per_page";
        localVarQueryParams.addAll(ApiClient.parameterToPairs("per_page", perPage));
        localVarQueryParameterBaseName = "page";
        localVarQueryParams.addAll(ApiClient.parameterToPairs("page", page));
        localVarQueryParameterBaseName = "fields";
        localVarQueryParams.addAll(ApiClient.parameterToPairs("fields", fields));

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
     * Add jsonDidKey to VASP details Update VASP Details. Updates a VASP with the provided
     * parameters. Use this endpoint to add your public jsonDIDkey generated by Notabene. **Note:**
     * The reference content in this section documents the Travel Rule beta endpoint. The beta
     * endpoint includes APIs that are currently in preview and aren&#39;t yet generally available.
     * To enroll in the beta and enable this endpoint, contact your Fireblocks Customer Success
     * Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
     *
     * @param travelRuleUpdateVASPDetails (required)
     * @param idempotencyKey A unique identifier for the request. If the request is sent multiple
     *     times with the same idempotency key, the server will return the same response as the
     *     first request. The idempotency key is valid for 24 hours. (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;TravelRuleUpdateVASPDetails&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<TravelRuleUpdateVASPDetails>> updateVasp(
            TravelRuleUpdateVASPDetails travelRuleUpdateVASPDetails, String idempotencyKey)
            throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    updateVaspRequestBuilder(travelRuleUpdateVASPDetails, idempotencyKey);
            return memberVarHttpClient
                    .sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString())
                    .thenComposeAsync(
                            localVarResponse -> {
                                if (memberVarAsyncResponseInterceptor != null) {
                                    memberVarAsyncResponseInterceptor.accept(localVarResponse);
                                }
                                if (localVarResponse.statusCode() / 100 != 2) {
                                    return CompletableFuture.failedFuture(
                                            getApiException("updateVasp", localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<TravelRuleUpdateVASPDetails>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            TravelRuleUpdateVASPDetails>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder updateVaspRequestBuilder(
            TravelRuleUpdateVASPDetails travelRuleUpdateVASPDetails, String idempotencyKey)
            throws ApiException {
        ValidationUtils.assertParamExists(
                "updateVasp", "travelRuleUpdateVASPDetails", travelRuleUpdateVASPDetails);

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath = "/screening/travel_rule/vasp/update";

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        if (idempotencyKey != null) {
            localVarRequestBuilder.header("Idempotency-Key", idempotencyKey.toString());
        }
        localVarRequestBuilder.header("Content-Type", "application/json");
        localVarRequestBuilder.header("Accept", "application/json");

        try {
            byte[] localVarPostBody =
                    memberVarObjectMapper.writeValueAsBytes(travelRuleUpdateVASPDetails);
            localVarRequestBuilder.method(
                    "PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
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
     * Validate Full Travel Rule Transaction Validate Full Travel Rule transactions. Checks for all
     * required information on the originator and beneficiary VASPs. **Note:** The reference content
     * in this section documents the Travel Rule beta endpoint. The beta endpoint includes APIs that
     * are currently in preview and aren&#39;t yet generally available. To enroll in the beta and
     * enable this endpoint, contact your Fireblocks Customer Success Manager or send an email to
     * [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
     *
     * @param travelRuleValidateFullTransactionRequest (required)
     * @param idempotencyKey A unique identifier for the request. If the request is sent multiple
     *     times with the same idempotency key, the server will return the same response as the
     *     first request. The idempotency key is valid for 24 hours. (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;TravelRuleValidateTransactionResponse&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<TravelRuleValidateTransactionResponse>>
            validateFullTravelRuleTransaction(
                    TravelRuleValidateFullTransactionRequest
                            travelRuleValidateFullTransactionRequest,
                    String idempotencyKey)
                    throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    validateFullTravelRuleTransactionRequestBuilder(
                            travelRuleValidateFullTransactionRequest, idempotencyKey);
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
                                                    "validateFullTravelRuleTransaction",
                                                    localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<TravelRuleValidateTransactionResponse>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            TravelRuleValidateTransactionResponse>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder validateFullTravelRuleTransactionRequestBuilder(
            TravelRuleValidateFullTransactionRequest travelRuleValidateFullTransactionRequest,
            String idempotencyKey)
            throws ApiException {
        ValidationUtils.assertParamExists(
                "validateFullTravelRuleTransaction",
                "travelRuleValidateFullTransactionRequest",
                travelRuleValidateFullTransactionRequest);

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath = "/screening/travel_rule/transaction/validate/full";

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        if (idempotencyKey != null) {
            localVarRequestBuilder.header("Idempotency-Key", idempotencyKey.toString());
        }
        localVarRequestBuilder.header("Content-Type", "application/json");
        localVarRequestBuilder.header("Accept", "application/json");

        try {
            byte[] localVarPostBody =
                    memberVarObjectMapper.writeValueAsBytes(
                            travelRuleValidateFullTransactionRequest);
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
     * Validate Travel Rule Transaction Validate Travel Rule transactions. Checks what beneficiary
     * VASP details are required by your jurisdiction and the beneficiary&#39;s jurisdiction.
     * **Note:** The reference content in this section documents the Travel Rule beta endpoint. The
     * beta endpoint includes APIs that are currently in preview and aren&#39;t yet generally
     * available. To enroll in the beta and enable this endpoint, contact your Fireblocks Customer
     * Success Manager or send an email to [CSM@fireblocks.com](mailto:CSM@fireblocks.com).
     *
     * @param travelRuleValidateTransactionRequest (required)
     * @param idempotencyKey A unique identifier for the request. If the request is sent multiple
     *     times with the same idempotency key, the server will return the same response as the
     *     first request. The idempotency key is valid for 24 hours. (optional)
     * @return CompletableFuture&lt;ApiResponse&lt;TravelRuleValidateTransactionResponse&gt;&gt;
     * @throws ApiException if fails to make API call
     */
    public CompletableFuture<ApiResponse<TravelRuleValidateTransactionResponse>>
            validateTravelRuleTransaction(
                    TravelRuleValidateTransactionRequest travelRuleValidateTransactionRequest,
                    String idempotencyKey)
                    throws ApiException {
        try {
            HttpRequest.Builder localVarRequestBuilder =
                    validateTravelRuleTransactionRequestBuilder(
                            travelRuleValidateTransactionRequest, idempotencyKey);
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
                                                    "validateTravelRuleTransaction",
                                                    localVarResponse));
                                }
                                try {
                                    String responseBody = localVarResponse.body();
                                    return CompletableFuture.completedFuture(
                                            new ApiResponse<TravelRuleValidateTransactionResponse>(
                                                    localVarResponse.statusCode(),
                                                    localVarResponse.headers().map(),
                                                    responseBody == null || responseBody.isBlank()
                                                            ? null
                                                            : memberVarObjectMapper.readValue(
                                                                    responseBody,
                                                                    new TypeReference<
                                                                            TravelRuleValidateTransactionResponse>() {})));
                                } catch (IOException e) {
                                    return CompletableFuture.failedFuture(new ApiException(e));
                                }
                            });
        } catch (ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder validateTravelRuleTransactionRequestBuilder(
            TravelRuleValidateTransactionRequest travelRuleValidateTransactionRequest,
            String idempotencyKey)
            throws ApiException {
        ValidationUtils.assertParamExists(
                "validateTravelRuleTransaction",
                "travelRuleValidateTransactionRequest",
                travelRuleValidateTransactionRequest);

        HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        String localVarPath = "/screening/travel_rule/transaction/validate";

        localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

        if (idempotencyKey != null) {
            localVarRequestBuilder.header("Idempotency-Key", idempotencyKey.toString());
        }
        localVarRequestBuilder.header("Content-Type", "application/json");
        localVarRequestBuilder.header("Accept", "application/json");

        try {
            byte[] localVarPostBody =
                    memberVarObjectMapper.writeValueAsBytes(travelRuleValidateTransactionRequest);
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
