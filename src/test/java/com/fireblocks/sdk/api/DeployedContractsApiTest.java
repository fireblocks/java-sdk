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
import com.fireblocks.sdk.model.AddAbiRequestDto;
import com.fireblocks.sdk.model.ContractWithAbiDto;
import com.fireblocks.sdk.model.DeployedContractResponseDto;
import com.fireblocks.sdk.model.DeployedContractsPaginatedResponse;
import com.fireblocks.sdk.model.FetchAbiRequestDto;
import java.math.BigDecimal;
import java.util.concurrent.CompletableFuture;
import org.junit.Ignore;
import org.junit.Test;

/** API tests for DeployedContractsApi */
@Ignore
public class DeployedContractsApiTest {

    private final DeployedContractsApi api = new DeployedContractsApi();

    /**
     * Save contract ABI
     *
     * <p>Save contract ABI for the tenant
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addContractABITest() throws ApiException {
        AddAbiRequestDto addAbiRequestDto = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<ContractWithAbiDto>> response =
                api.addContractABI(addAbiRequestDto, idempotencyKey);
    }

    /**
     * Fetch the contract ABI
     *
     * <p>Fetch the ABI. If not found fetch the ABI from the block explorer
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchContractAbiTest() throws ApiException {
        FetchAbiRequestDto fetchAbiRequestDto = null;
        String idempotencyKey = null;
        CompletableFuture<ApiResponse<ContractWithAbiDto>> response =
                api.fetchContractAbi(fetchAbiRequestDto, idempotencyKey);
    }

    /**
     * Return deployed contract data
     *
     * <p>Return deployed contract data by blockchain native asset id and contract address
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDeployedContractByAddressTest() throws ApiException {
        String contractAddress = null;
        String assetId = null;
        CompletableFuture<ApiResponse<DeployedContractResponseDto>> response =
                api.getDeployedContractByAddress(contractAddress, assetId);
    }

    /**
     * Return deployed contract data by id
     *
     * <p>Return deployed contract data by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDeployedContractByIdTest() throws ApiException {
        String id = null;
        CompletableFuture<ApiResponse<DeployedContractResponseDto>> response =
                api.getDeployedContractById(id);
    }

    /**
     * List deployed contracts data
     *
     * <p>Return a filtered lean representation of the deployed contracts data on all blockchains
     * (paginated)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDeployedContractsTest() throws ApiException {
        String pageCursor = null;
        BigDecimal pageSize = null;
        String contractAddress = null;
        String baseAssetId = null;
        String templateId = null;
        CompletableFuture<ApiResponse<DeployedContractsPaginatedResponse>> response =
                api.getDeployedContracts(
                        pageCursor, pageSize, contractAddress, baseAssetId, templateId);
    }
}
