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

package com.fireblocks.sdk.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;

/** DeployedContractResponseDto */
@JsonPropertyOrder({
    DeployedContractResponseDto.JSON_PROPERTY_ID,
    DeployedContractResponseDto.JSON_PROPERTY_CONTRACT_ADDRESS,
    DeployedContractResponseDto.JSON_PROPERTY_CONTRACT_TEMPLATE_ID,
    DeployedContractResponseDto.JSON_PROPERTY_VAULT_ACCOUNT_ID,
    DeployedContractResponseDto.JSON_PROPERTY_BLOCKCHAIN_ID,
    DeployedContractResponseDto.JSON_PROPERTY_BASE_ASSET_ID,
    DeployedContractResponseDto.JSON_PROPERTY_GASLESS_CONFIG,
    DeployedContractResponseDto.JSON_PROPERTY_MULTICHAIN_DEPLOYMENT_METADATA,
    DeployedContractResponseDto.JSON_PROPERTY_SOLANA_CONFIG
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeployedContractResponseDto {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_CONTRACT_ADDRESS = "contractAddress";
    private String contractAddress;

    public static final String JSON_PROPERTY_CONTRACT_TEMPLATE_ID = "contractTemplateId";
    private String contractTemplateId;

    public static final String JSON_PROPERTY_VAULT_ACCOUNT_ID = "vaultAccountId";
    private String vaultAccountId;

    public static final String JSON_PROPERTY_BLOCKCHAIN_ID = "blockchainId";
    private String blockchainId;

    public static final String JSON_PROPERTY_BASE_ASSET_ID = "baseAssetId";
    private String baseAssetId;

    public static final String JSON_PROPERTY_GASLESS_CONFIG = "gaslessConfig";
    private GasslessStandardConfigurations gaslessConfig;

    public static final String JSON_PROPERTY_MULTICHAIN_DEPLOYMENT_METADATA =
            "multichainDeploymentMetadata";
    private MultichainDeploymentMetadata multichainDeploymentMetadata;

    public static final String JSON_PROPERTY_SOLANA_CONFIG = "solanaConfig";
    private SolanaConfig solanaConfig;

    public DeployedContractResponseDto() {}

    public DeployedContractResponseDto id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The deployed contract data identifier
     *
     * @return id
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public DeployedContractResponseDto contractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
        return this;
    }

    /**
     * The contract&#39;s onchain address
     *
     * @return contractAddress
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CONTRACT_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getContractAddress() {
        return contractAddress;
    }

    @JsonProperty(JSON_PROPERTY_CONTRACT_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public DeployedContractResponseDto contractTemplateId(String contractTemplateId) {
        this.contractTemplateId = contractTemplateId;
        return this;
    }

    /**
     * The contract template identifier
     *
     * @return contractTemplateId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CONTRACT_TEMPLATE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getContractTemplateId() {
        return contractTemplateId;
    }

    @JsonProperty(JSON_PROPERTY_CONTRACT_TEMPLATE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setContractTemplateId(String contractTemplateId) {
        this.contractTemplateId = contractTemplateId;
    }

    public DeployedContractResponseDto vaultAccountId(String vaultAccountId) {
        this.vaultAccountId = vaultAccountId;
        return this;
    }

    /**
     * The vault account id this contract was deploy from
     *
     * @return vaultAccountId
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_VAULT_ACCOUNT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVaultAccountId() {
        return vaultAccountId;
    }

    @JsonProperty(JSON_PROPERTY_VAULT_ACCOUNT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVaultAccountId(String vaultAccountId) {
        this.vaultAccountId = vaultAccountId;
    }

    public DeployedContractResponseDto blockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }

    /**
     * Get blockchainId
     *
     * @return blockchainId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_BLOCKCHAIN_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBlockchainId() {
        return blockchainId;
    }

    @JsonProperty(JSON_PROPERTY_BLOCKCHAIN_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
    }

    public DeployedContractResponseDto baseAssetId(String baseAssetId) {
        this.baseAssetId = baseAssetId;
        return this;
    }

    /**
     * The blockchain base assetId
     *
     * @return baseAssetId
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_BASE_ASSET_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBaseAssetId() {
        return baseAssetId;
    }

    @JsonProperty(JSON_PROPERTY_BASE_ASSET_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBaseAssetId(String baseAssetId) {
        this.baseAssetId = baseAssetId;
    }

    public DeployedContractResponseDto gaslessConfig(GasslessStandardConfigurations gaslessConfig) {
        this.gaslessConfig = gaslessConfig;
        return this;
    }

    /**
     * Get gaslessConfig
     *
     * @return gaslessConfig
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_GASLESS_CONFIG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public GasslessStandardConfigurations getGaslessConfig() {
        return gaslessConfig;
    }

    @JsonProperty(JSON_PROPERTY_GASLESS_CONFIG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setGaslessConfig(GasslessStandardConfigurations gaslessConfig) {
        this.gaslessConfig = gaslessConfig;
    }

    public DeployedContractResponseDto multichainDeploymentMetadata(
            MultichainDeploymentMetadata multichainDeploymentMetadata) {
        this.multichainDeploymentMetadata = multichainDeploymentMetadata;
        return this;
    }

    /**
     * Get multichainDeploymentMetadata
     *
     * @return multichainDeploymentMetadata
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_MULTICHAIN_DEPLOYMENT_METADATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public MultichainDeploymentMetadata getMultichainDeploymentMetadata() {
        return multichainDeploymentMetadata;
    }

    @JsonProperty(JSON_PROPERTY_MULTICHAIN_DEPLOYMENT_METADATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMultichainDeploymentMetadata(
            MultichainDeploymentMetadata multichainDeploymentMetadata) {
        this.multichainDeploymentMetadata = multichainDeploymentMetadata;
    }

    public DeployedContractResponseDto solanaConfig(SolanaConfig solanaConfig) {
        this.solanaConfig = solanaConfig;
        return this;
    }

    /**
     * Get solanaConfig
     *
     * @return solanaConfig
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_SOLANA_CONFIG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public SolanaConfig getSolanaConfig() {
        return solanaConfig;
    }

    @JsonProperty(JSON_PROPERTY_SOLANA_CONFIG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSolanaConfig(SolanaConfig solanaConfig) {
        this.solanaConfig = solanaConfig;
    }

    /** Return true if this DeployedContractResponseDto object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeployedContractResponseDto deployedContractResponseDto = (DeployedContractResponseDto) o;
        return Objects.equals(this.id, deployedContractResponseDto.id)
                && Objects.equals(this.contractAddress, deployedContractResponseDto.contractAddress)
                && Objects.equals(
                        this.contractTemplateId, deployedContractResponseDto.contractTemplateId)
                && Objects.equals(this.vaultAccountId, deployedContractResponseDto.vaultAccountId)
                && Objects.equals(this.blockchainId, deployedContractResponseDto.blockchainId)
                && Objects.equals(this.baseAssetId, deployedContractResponseDto.baseAssetId)
                && Objects.equals(this.gaslessConfig, deployedContractResponseDto.gaslessConfig)
                && Objects.equals(
                        this.multichainDeploymentMetadata,
                        deployedContractResponseDto.multichainDeploymentMetadata)
                && Objects.equals(this.solanaConfig, deployedContractResponseDto.solanaConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                contractAddress,
                contractTemplateId,
                vaultAccountId,
                blockchainId,
                baseAssetId,
                gaslessConfig,
                multichainDeploymentMetadata,
                solanaConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployedContractResponseDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
        sb.append("    contractTemplateId: ")
                .append(toIndentedString(contractTemplateId))
                .append("\n");
        sb.append("    vaultAccountId: ").append(toIndentedString(vaultAccountId)).append("\n");
        sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
        sb.append("    baseAssetId: ").append(toIndentedString(baseAssetId)).append("\n");
        sb.append("    gaslessConfig: ").append(toIndentedString(gaslessConfig)).append("\n");
        sb.append("    multichainDeploymentMetadata: ")
                .append(toIndentedString(multichainDeploymentMetadata))
                .append("\n");
        sb.append("    solanaConfig: ").append(toIndentedString(solanaConfig)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Convert the instance into URL query string.
     *
     * @return URL query string
     */
    public String toUrlQueryString() {
        return toUrlQueryString(null);
    }

    /**
     * Convert the instance into URL query string.
     *
     * @param prefix prefix of the query string
     * @return URL query string
     */
    public String toUrlQueryString(String prefix) {
        String suffix = "";
        String containerSuffix = "";
        String containerPrefix = "";
        if (prefix == null) {
            // style=form, explode=true, e.g. /pet?name=cat&type=manx
            prefix = "";
        } else {
            // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
            prefix = prefix + "[";
            suffix = "]";
            containerSuffix = "]";
            containerPrefix = "[";
        }

        StringJoiner joiner = new StringJoiner("&");

        // add `id` to the URL query string
        if (getId() != null) {
            joiner.add(
                    String.format(
                            "%sid%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `contractAddress` to the URL query string
        if (getContractAddress() != null) {
            joiner.add(
                    String.format(
                            "%scontractAddress%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getContractAddress()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `contractTemplateId` to the URL query string
        if (getContractTemplateId() != null) {
            joiner.add(
                    String.format(
                            "%scontractTemplateId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getContractTemplateId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `vaultAccountId` to the URL query string
        if (getVaultAccountId() != null) {
            joiner.add(
                    String.format(
                            "%svaultAccountId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getVaultAccountId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `blockchainId` to the URL query string
        if (getBlockchainId() != null) {
            joiner.add(
                    String.format(
                            "%sblockchainId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getBlockchainId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `baseAssetId` to the URL query string
        if (getBaseAssetId() != null) {
            joiner.add(
                    String.format(
                            "%sbaseAssetId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getBaseAssetId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `gaslessConfig` to the URL query string
        if (getGaslessConfig() != null) {
            joiner.add(getGaslessConfig().toUrlQueryString(prefix + "gaslessConfig" + suffix));
        }

        // add `multichainDeploymentMetadata` to the URL query string
        if (getMultichainDeploymentMetadata() != null) {
            joiner.add(
                    getMultichainDeploymentMetadata()
                            .toUrlQueryString(prefix + "multichainDeploymentMetadata" + suffix));
        }

        // add `solanaConfig` to the URL query string
        if (getSolanaConfig() != null) {
            joiner.add(getSolanaConfig().toUrlQueryString(prefix + "solanaConfig" + suffix));
        }

        return joiner.toString();
    }
}
