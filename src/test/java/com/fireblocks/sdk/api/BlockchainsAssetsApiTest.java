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
import com.fireblocks.sdk.model.AssetBadRequestErrorResponse;
import com.fireblocks.sdk.model.AssetConflictErrorResponse;
import com.fireblocks.sdk.model.AssetForbiddenErrorResponse;
import com.fireblocks.sdk.model.AssetInternalServerErrorResponse;
import com.fireblocks.sdk.model.AssetNotFoundErrorResponse;
import com.fireblocks.sdk.model.AssetResponse;
import com.fireblocks.sdk.model.AssetTypeResponse;
import com.fireblocks.sdk.model.ErrorSchema;
import com.fireblocks.sdk.model.RegisterNewAssetRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for BlockchainsAssetsApi
 */
@Ignore
public class BlockchainsAssetsApiTest {

    private final BlockchainsAssetsApi api = new BlockchainsAssetsApi();

    
    /**
     * List all asset types supported by Fireblocks
     *
     * Returns all asset types supported by Fireblocks.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSupportedAssetsTest() throws ApiException {
        CompletableFuture<ApiResponse<List<AssetTypeResponse>>> response = 
        api.getSupportedAssets();
        
    }
    
    /**
     * Register an asset
     *
     * Register a new asset to a workspace and return the newly created asset&#39;s details. Currently supported for EVM based chains only.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerNewAssetTest() throws ApiException {
        RegisterNewAssetRequest registerNewAssetRequest = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<AssetResponse>> response = 
        api.registerNewAsset(registerNewAssetRequest, idempotencyKey);
        
    }
    
}
