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
import com.fireblocks.sdk.model.CreateInternalWalletAssetRequest;
import com.fireblocks.sdk.model.CreateWalletRequest;
import com.fireblocks.sdk.model.ErrorSchema;
import com.fireblocks.sdk.model.SetCustomerRefIdRequest;
import com.fireblocks.sdk.model.UnmanagedWallet;
import com.fireblocks.sdk.model.WalletAsset;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for InternalWalletsApi
 */
@Ignore
public class InternalWalletsApiTest {

    private final InternalWalletsApi api = new InternalWalletsApi();

    
    /**
     * Create an internal wallet
     *
     * Creates a new internal wallet with the requested name.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createInternalWalletTest() throws ApiException {
        CreateWalletRequest createWalletRequest = null;
        String idempotencyKey = null;
        CompletableFuture<UnmanagedWallet> response = 
        api.createInternalWallet(createWalletRequest, idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Add an asset to an internal wallet
     *
     * Adds an asset to an existing internal wallet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createInternalWalletAssetTest() throws ApiException {
        String walletId = null;
        String assetId = null;
        CreateInternalWalletAssetRequest createInternalWalletAssetRequest = null;
        String idempotencyKey = null;
        CompletableFuture<WalletAsset> response = 
        api.createInternalWalletAsset(walletId, assetId, createInternalWalletAssetRequest, idempotencyKey);
        
        // TODO: test validations
    }
    
    /**
     * Delete an internal wallet
     *
     * Deletes an internal wallet by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInternalWalletTest() throws ApiException {
        String walletId = null;
        
        CompletableFuture<Void> response = api.deleteInternalWallet(walletId);
        
        // TODO: test validations
    }
    
    /**
     * Delete a whitelisted address from an internal wallet
     *
     * Deletes a whitelisted address (for an asset) from an internal wallet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInternalWalletAssetTest() throws ApiException {
        String walletId = null;
        String assetId = null;
        
        CompletableFuture<Void> response = api.deleteInternalWalletAsset(walletId, assetId);
        
        // TODO: test validations
    }
    
    /**
     * Get assets for internal wallet
     *
     * Returns all assets in an internal wallet by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInternalWalletTest() throws ApiException {
        String walletId = null;
        CompletableFuture<UnmanagedWallet> response = 
        api.getInternalWallet(walletId);
        
        // TODO: test validations
    }
    
    /**
     * Get an asset from an internal wallet
     *
     * Returns information for an asset in an internal wallet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInternalWalletAssetTest() throws ApiException {
        String walletId = null;
        String assetId = null;
        CompletableFuture<WalletAsset> response = 
        api.getInternalWalletAsset(walletId, assetId);
        
        // TODO: test validations
    }
    
    /**
     * List internal wallets
     *
     * Gets a list of internal wallets.  **Note**: BTC-based assets belonging to whitelisted addresses cannot be retrieved between 00:00 UTC and 00:01 UTC daily due to third-party provider, Blockchair, being unavailable for this 60 second period. Please wait until the next minute to retrieve BTC-based assets. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInternalWalletsTest() throws ApiException {
        CompletableFuture<List<UnmanagedWallet>> response = 
        api.getInternalWallets();
        
        // TODO: test validations
    }
    
    /**
     * Set an AML/KYT customer reference ID for an internal wallet
     *
     * Sets an AML/KYT customer reference ID for the specific internal wallet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setCustomerRefIdForInternalWalletTest() throws ApiException {
        SetCustomerRefIdRequest setCustomerRefIdRequest = null;
        String walletId = null;
        String idempotencyKey = null;
        
        CompletableFuture<Void> response = api.setCustomerRefIdForInternalWallet(setCustomerRefIdRequest, walletId, idempotencyKey);
        
        // TODO: test validations
    }
    
}