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


package com.fireblocks.sdk;

import com.fireblocks.sdk.*;
import com.fireblocks.sdk.auth.*;
import com.fireblocks.sdk.Configuration;
import com.fireblocks.sdk.model.AddAssetToContractRequest;
import com.fireblocks.sdk.model.CreateContractRequest;
import com.fireblocks.sdk.model.Error;
import com.fireblocks.sdk.model.ExternalWalletAsset;
import com.fireblocks.sdk.model.UnmanagedWallet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContractsApi
 */
public class ContractsApiTest {

    private ContractsApi api;

    /**
     * Add an asset to a contract
     *
     * Adds an asset to an existing contract.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addAssetToContractTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new ContractsApi(configuration);
        //String contractId = null;
        //String assetId = null;
        //AddAssetToContractRequest addAssetToContractRequest = null;
        //ExternalWalletAsset response = api.addAssetToContract(contractId, assetId, addAssetToContractRequest);
        // TODO: test validations
    }

    /**
     * Create a contract
     *
     * Creates a new contract.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createContractTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new ContractsApi(configuration);
        //CreateContractRequest createContractRequest = null;
        //UnmanagedWallet response = api.createContract(createContractRequest);
        // TODO: test validations
    }

    /**
     * Delete a contract
     *
     * Deletes a contract by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteContractTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new ContractsApi(configuration);
        //String contractId = null;
        //api.deleteContract(contractId);
        // TODO: test validations
    }

    /**
     * Find a contract asset
     *
     * Returns a contract asset by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAssetInContractTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new ContractsApi(configuration);
        //String contractId = null;
        //String assetId = null;
        //ExternalWalletAsset response = api.getAssetInContract(contractId, assetId);
        // TODO: test validations
    }

    /**
     * Find a specific contract
     *
     * Returns a contract by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getContractByIdTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new ContractsApi(configuration);
        //String contractId = null;
        //UnmanagedWallet response = api.getContractById(contractId);
        // TODO: test validations
    }

    /**
     * List contracts
     *
     * Gets a list of contracts.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getContractsTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new ContractsApi(configuration);
        //List<UnmanagedWallet> response = api.getContracts();
        // TODO: test validations
    }

    /**
     * Delete a contract asset
     *
     * Deletes a contract asset by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeAssetFromContractTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new ContractsApi(configuration);
        //String contractId = null;
        //String assetId = null;
        //api.removeAssetFromContract(contractId, assetId);
        // TODO: test validations
    }

}
