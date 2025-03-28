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
import com.fireblocks.sdk.model.CollectionBurnRequestDto;
import com.fireblocks.sdk.model.CollectionBurnResponseDto;
import com.fireblocks.sdk.model.CollectionDeployRequestDto;
import com.fireblocks.sdk.model.CollectionLinkDto;
import com.fireblocks.sdk.model.CollectionMintRequestDto;
import com.fireblocks.sdk.model.CollectionMintResponseDto;
import com.fireblocks.sdk.model.CreateMultichainTokenRequestDto;
import com.fireblocks.sdk.model.CreateTokenRequestDto;
import com.fireblocks.sdk.model.DeployableAddressResponseDto;
import com.fireblocks.sdk.model.GetDeployableAddressRequestDto;
import com.fireblocks.sdk.model.GetLinkedCollectionsPaginatedResponse;
import com.fireblocks.sdk.model.ReissueMultichainTokenRequestDto;
import com.fireblocks.sdk.model.TokenLinkDto;
import com.fireblocks.sdk.model.TokenLinkRequestDto;
import com.fireblocks.sdk.model.TokensPaginatedResponse;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for TokenizationApi */
@Ignore
public class TokenizationApiTest {

    private final TokenizationApi api = new TokenizationApi();

    /**
     * Burn tokens
     *
     * <p>Burn tokens in a collection
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void burnCollectionTokenTest() throws ApiException {
        CollectionBurnRequestDto collectionBurnRequestDto = null;
        String id = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<CollectionBurnResponseDto>> response =
                api.burnCollectionToken(collectionBurnRequestDto, id, idempotencyKey);
    }

    /**
     * Create a new collection
     *
     * <p>Create a new collection and link it as a token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewCollectionTest() throws ApiException {
        CollectionDeployRequestDto collectionDeployRequestDto = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<CollectionLinkDto>> response =
                api.createNewCollection(collectionDeployRequestDto, idempotencyKey);
    }

    /**
     * Get collection token details
     *
     * <p>Get collection token details by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchCollectionTokenDetailsTest() throws ApiException {
        String id = null;
        String tokenId = null;
        CompletableFuture<ApiResponse<CollectionLinkDto>> response =
                api.fetchCollectionTokenDetails(id, tokenId);
    }

    /**
     * Get a collection by id
     *
     * <p>Get a collection by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCollectionByIdTest() throws ApiException {
        String id = null;
        CompletableFuture<ApiResponse<CollectionLinkDto>> response = api.getCollectionById(id);
    }

    /**
     * Get deterministic address for contract deployment
     *
     * <p>Get a deterministic address for contract deployment. The address is derived from the
     * contract&#39;s bytecode and provided salt. This endpoint is used to get the address of a
     * contract that will be deployed in the future.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDeployableAddressTest() throws ApiException {
        GetDeployableAddressRequestDto getDeployableAddressRequestDto = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<DeployableAddressResponseDto>> response =
                api.getDeployableAddress(getDeployableAddressRequestDto, idempotencyKey);
    }

    /**
     * Get collections
     *
     * <p>Get collections (paginated)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLinkedCollectionsTest() throws ApiException {
        String pageCursor = null;
        BigDecimal pageSize = null;
        Object status = null;
        CompletableFuture<ApiResponse<GetLinkedCollectionsPaginatedResponse>> response =
                api.getLinkedCollections(pageCursor, pageSize, status);
    }

    /**
     * Return a linked token
     *
     * <p>Return a linked token, with its status and metadata.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLinkedTokenTest() throws ApiException {
        String id = null;
        CompletableFuture<ApiResponse<TokenLinkDto>> response = api.getLinkedToken(id);
    }

    /**
     * List all linked tokens
     *
     * <p>Return all linked tokens (paginated)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLinkedTokensTest() throws ApiException {
        String pageCursor = null;
        BigDecimal pageSize = null;
        Object status = null;
        CompletableFuture<ApiResponse<TokensPaginatedResponse>> response =
                api.getLinkedTokens(pageCursor, pageSize, status);
    }

    /**
     * Issue a new token
     *
     * <p>Facilitates the creation of a new token, supporting both EVM-based and Stellar/Ripple
     * platforms. For EVM, it deploys the corresponding contract template to the blockchain and
     * links the token to the workspace. For Stellar/Ripple, it links a newly created token directly
     * to the workspace without deploying a contract. Returns the token link with status
     * \&quot;PENDING\&quot; until the token is deployed or \&quot;SUCCESS\&quot; if no deployment
     * is needed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void issueNewTokenTest() throws ApiException {
        CreateTokenRequestDto createTokenRequestDto = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<TokenLinkDto>> response =
                api.issueNewToken(createTokenRequestDto, idempotencyKey);
    }

    /**
     * Issue a token on one or more blockchains
     *
     * <p>Facilitates the creation of a new token on one or more blockchains.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void issueTokenMultiChainTest() throws ApiException {
        CreateMultichainTokenRequestDto createMultichainTokenRequestDto = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<List<TokenLinkDto>>> response =
                api.issueTokenMultiChain(createMultichainTokenRequestDto, idempotencyKey);
    }

    /**
     * Link a contract
     *
     * <p>Link an a contract
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void linkTest() throws ApiException {
        TokenLinkRequestDto tokenLinkRequestDto = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<TokenLinkDto>> response =
                api.link(tokenLinkRequestDto, idempotencyKey);
    }

    /**
     * Mint tokens
     *
     * <p>Mint tokens and upload metadata
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void mintCollectionTokenTest() throws ApiException {
        CollectionMintRequestDto collectionMintRequestDto = null;
        String id = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<CollectionMintResponseDto>> response =
                api.mintCollectionToken(collectionMintRequestDto, id, idempotencyKey);
    }

    /**
     * Reissue a multichain token
     *
     * <p>Reissue a multichain token. This endpoint allows you to reissue a token on one or more
     * blockchains. The token must be initially issued using the issueTokenMultiChain endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reIssueTokenMultiChainTest() throws ApiException {
        ReissueMultichainTokenRequestDto reissueMultichainTokenRequestDto = null;
        String tokenLinkId = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<List<TokenLinkDto>>> response =
                api.reIssueTokenMultiChain(
                        reissueMultichainTokenRequestDto, tokenLinkId, idempotencyKey);
    }

    /**
     * Unlink a token
     *
     * <p>Unlink a token. The token will be unlinked from the workspace. The token will not be
     * deleted on chain nor the refId, only the link to the workspace will be removed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unlinkTest() throws ApiException {
        String id = null;

        CompletableFuture<ApiResponse<Void>> response = api.unlink(id);
    }

    /**
     * Delete a collection link
     *
     * <p>Delete a collection link
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unlinkCollectionTest() throws ApiException {
        String id = null;

        CompletableFuture<ApiResponse<Void>> response = api.unlinkCollection(id);
    }
}
