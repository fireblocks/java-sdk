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
import com.fireblocks.sdk.model.Error;
import com.fireblocks.sdk.model.GasStationConfiguration;
import com.fireblocks.sdk.model.GasStationPropertiesResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GasStationsApi
 */
public class GasStationsApiTest {

    private GasStationsApi api;

    /**
     * Get gas station settings
     *
     * Returns gas station settings and ETH balance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGasStationTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new GasStationsApi(configuration);
        //GasStationPropertiesResponse response = api.getGasStation();
        // TODO: test validations
    }

    /**
     * Get gas station settings by asset
     *
     * Returns gas station settings and balances for a requested asset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGasStationByAssetIdTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new GasStationsApi(configuration);
        //String assetId = null;
        //GasStationPropertiesResponse response = api.getGasStationByAssetId(assetId);
        // TODO: test validations
    }

    /**
     * Edit gas station settings
     *
     * Configures gas station settings for ETH.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateGasStationConfigurationTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new GasStationsApi(configuration);
        //GasStationConfiguration gasStationConfiguration = null;
        //api.updateGasStationConfiguration(gasStationConfiguration);
        // TODO: test validations
    }

    /**
     * Edit gas station settings for an asset
     *
     * Configures gas station settings for a requested asset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateGasStationConfigurationByAssetIdTest() throws ApiException {
        Configuration configuration = new Configuration();
        configuration.setApiKey("test");
        configuration.setSecretKey("test");
        this.api = new GasStationsApi(configuration);
        //String assetId = null;
        //GasStationConfiguration gasStationConfiguration = null;
        //api.updateGasStationConfigurationByAssetId(assetId, gasStationConfiguration);
        // TODO: test validations
    }

}
