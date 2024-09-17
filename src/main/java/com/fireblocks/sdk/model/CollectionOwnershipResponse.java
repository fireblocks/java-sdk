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


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;

/** CollectionOwnershipResponse */
@JsonPropertyOrder({
    CollectionOwnershipResponse.JSON_PROPERTY_ID,
    CollectionOwnershipResponse.JSON_PROPERTY_NAME,
    CollectionOwnershipResponse.JSON_PROPERTY_SYMBOL,
    CollectionOwnershipResponse.JSON_PROPERTY_STANDARD,
    CollectionOwnershipResponse.JSON_PROPERTY_BLOCKCHAIN_DESCRIPTOR,
    CollectionOwnershipResponse.JSON_PROPERTY_CONTRACT_ADDRESS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CollectionOwnershipResponse {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_SYMBOL = "symbol";
    private String symbol;

    public static final String JSON_PROPERTY_STANDARD = "standard";
    private String standard;

    /** Collection&#39;s blockchain */
    public enum BlockchainDescriptorEnum {
        ETH("ETH"),

        ETH_TEST3("ETH_TEST3"),

        ETH_TEST5("ETH_TEST5"),

        ETH_TEST6("ETH_TEST6"),

        POLYGON("POLYGON"),

        POLYGON_TEST_MUMBAI("POLYGON_TEST_MUMBAI"),

        AMOY_POLYGON_TEST("AMOY_POLYGON_TEST"),

        XTZ("XTZ"),

        XTZ_TEST("XTZ_TEST"),

        BASECHAIN_ETH("BASECHAIN_ETH"),

        BASECHAIN_ETH_TEST3("BASECHAIN_ETH_TEST3"),

        ETHERLINK("ETHERLINK"),

        ETHERLINK_TEST("ETHERLINK_TEST"),

        MANTLE("MANTLE"),

        MANTLE_TEST("MANTLE_TEST"),

        GUN_GUNZILLA_TEST("GUN_GUNZILLA_TEST");

        private String value;

        BlockchainDescriptorEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BlockchainDescriptorEnum fromValue(String value) {
            for (BlockchainDescriptorEnum b : BlockchainDescriptorEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_BLOCKCHAIN_DESCRIPTOR = "blockchainDescriptor";
    private BlockchainDescriptorEnum blockchainDescriptor;

    public static final String JSON_PROPERTY_CONTRACT_ADDRESS = "contractAddress";
    private String contractAddress;

    public CollectionOwnershipResponse() {}

    public CollectionOwnershipResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Fireblocks collection id
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

    public CollectionOwnershipResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Collection name
     *
     * @return name
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public CollectionOwnershipResponse symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Collection symbol
     *
     * @return symbol
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_SYMBOL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty(JSON_PROPERTY_SYMBOL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public CollectionOwnershipResponse standard(String standard) {
        this.standard = standard;
        return this;
    }

    /**
     * Collection contract standard
     *
     * @return standard
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_STANDARD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStandard() {
        return standard;
    }

    @JsonProperty(JSON_PROPERTY_STANDARD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStandard(String standard) {
        this.standard = standard;
    }

    public CollectionOwnershipResponse blockchainDescriptor(
            BlockchainDescriptorEnum blockchainDescriptor) {
        this.blockchainDescriptor = blockchainDescriptor;
        return this;
    }

    /**
     * Collection&#39;s blockchain
     *
     * @return blockchainDescriptor
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_BLOCKCHAIN_DESCRIPTOR)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public BlockchainDescriptorEnum getBlockchainDescriptor() {
        return blockchainDescriptor;
    }

    @JsonProperty(JSON_PROPERTY_BLOCKCHAIN_DESCRIPTOR)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBlockchainDescriptor(BlockchainDescriptorEnum blockchainDescriptor) {
        this.blockchainDescriptor = blockchainDescriptor;
    }

    public CollectionOwnershipResponse contractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
        return this;
    }

    /**
     * Collection contract standard
     *
     * @return contractAddress
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CONTRACT_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getContractAddress() {
        return contractAddress;
    }

    @JsonProperty(JSON_PROPERTY_CONTRACT_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    /** Return true if this CollectionOwnershipResponse object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectionOwnershipResponse collectionOwnershipResponse = (CollectionOwnershipResponse) o;
        return Objects.equals(this.id, collectionOwnershipResponse.id)
                && Objects.equals(this.name, collectionOwnershipResponse.name)
                && Objects.equals(this.symbol, collectionOwnershipResponse.symbol)
                && Objects.equals(this.standard, collectionOwnershipResponse.standard)
                && Objects.equals(
                        this.blockchainDescriptor, collectionOwnershipResponse.blockchainDescriptor)
                && Objects.equals(
                        this.contractAddress, collectionOwnershipResponse.contractAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, symbol, standard, blockchainDescriptor, contractAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectionOwnershipResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
        sb.append("    blockchainDescriptor: ")
                .append(toIndentedString(blockchainDescriptor))
                .append("\n");
        sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
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

        // add `name` to the URL query string
        if (getName() != null) {
            joiner.add(
                    String.format(
                            "%sname%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `symbol` to the URL query string
        if (getSymbol() != null) {
            joiner.add(
                    String.format(
                            "%ssymbol%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getSymbol()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `standard` to the URL query string
        if (getStandard() != null) {
            joiner.add(
                    String.format(
                            "%sstandard%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getStandard()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `blockchainDescriptor` to the URL query string
        if (getBlockchainDescriptor() != null) {
            joiner.add(
                    String.format(
                            "%sblockchainDescriptor%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getBlockchainDescriptor()),
                                            StandardCharsets.UTF_8)
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

        return joiner.toString();
    }
}
