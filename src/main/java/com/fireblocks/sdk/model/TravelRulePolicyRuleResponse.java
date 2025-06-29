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
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;

/** TravelRulePolicyRuleResponse */
@JsonPropertyOrder({
    TravelRulePolicyRuleResponse.JSON_PROPERTY_SOURCE_TYPE,
    TravelRulePolicyRuleResponse.JSON_PROPERTY_SOURCE_SUB_TYPE,
    TravelRulePolicyRuleResponse.JSON_PROPERTY_DEST_TYPE,
    TravelRulePolicyRuleResponse.JSON_PROPERTY_DEST_SUB_TYPE,
    TravelRulePolicyRuleResponse.JSON_PROPERTY_DEST_ADDRESS,
    TravelRulePolicyRuleResponse.JSON_PROPERTY_SOURCE_ID,
    TravelRulePolicyRuleResponse.JSON_PROPERTY_DEST_ID,
    TravelRulePolicyRuleResponse.JSON_PROPERTY_ASSET,
    TravelRulePolicyRuleResponse.JSON_PROPERTY_BASE_ASSET,
    TravelRulePolicyRuleResponse.JSON_PROPERTY_AMOUNT,
    TravelRulePolicyRuleResponse.JSON_PROPERTY_AMOUNT_U_S_D,
    TravelRulePolicyRuleResponse.JSON_PROPERTY_NETWORK_PROTOCOL,
    TravelRulePolicyRuleResponse.JSON_PROPERTY_OPERATION,
    TravelRulePolicyRuleResponse.JSON_PROPERTY_ACTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TravelRulePolicyRuleResponse {
    public static final String JSON_PROPERTY_SOURCE_TYPE = "sourceType";
    private String sourceType;

    public static final String JSON_PROPERTY_SOURCE_SUB_TYPE = "sourceSubType";
    private String sourceSubType;

    public static final String JSON_PROPERTY_DEST_TYPE = "destType";
    private String destType;

    public static final String JSON_PROPERTY_DEST_SUB_TYPE = "destSubType";
    private String destSubType;

    public static final String JSON_PROPERTY_DEST_ADDRESS = "destAddress";
    private String destAddress;

    public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
    private String sourceId;

    public static final String JSON_PROPERTY_DEST_ID = "destId";
    private String destId;

    public static final String JSON_PROPERTY_ASSET = "asset";
    private String asset;

    public static final String JSON_PROPERTY_BASE_ASSET = "baseAsset";
    private String baseAsset;

    public static final String JSON_PROPERTY_AMOUNT = "amount";
    private BigDecimal amount;

    public static final String JSON_PROPERTY_AMOUNT_U_S_D = "amountUSD";
    private BigDecimal amountUSD;

    public static final String JSON_PROPERTY_NETWORK_PROTOCOL = "networkProtocol";
    private String networkProtocol;

    public static final String JSON_PROPERTY_OPERATION = "operation";
    private String operation;

    /** Gets or Sets action */
    public enum ActionEnum {
        SCREEN("SCREEN"),

        PASS("PASS"),

        FREEZE("FREEZE");

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            for (ActionEnum b : ActionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_ACTION = "action";
    private ActionEnum action;

    public TravelRulePolicyRuleResponse() {}

    public TravelRulePolicyRuleResponse sourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get sourceType
     *
     * @return sourceType
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSourceType() {
        return sourceType;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public TravelRulePolicyRuleResponse sourceSubType(String sourceSubType) {
        this.sourceSubType = sourceSubType;
        return this;
    }

    /**
     * Get sourceSubType
     *
     * @return sourceSubType
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_SOURCE_SUB_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSourceSubType() {
        return sourceSubType;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE_SUB_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSourceSubType(String sourceSubType) {
        this.sourceSubType = sourceSubType;
    }

    public TravelRulePolicyRuleResponse destType(String destType) {
        this.destType = destType;
        return this;
    }

    /**
     * Get destType
     *
     * @return destType
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DEST_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDestType() {
        return destType;
    }

    @JsonProperty(JSON_PROPERTY_DEST_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDestType(String destType) {
        this.destType = destType;
    }

    public TravelRulePolicyRuleResponse destSubType(String destSubType) {
        this.destSubType = destSubType;
        return this;
    }

    /**
     * Get destSubType
     *
     * @return destSubType
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DEST_SUB_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDestSubType() {
        return destSubType;
    }

    @JsonProperty(JSON_PROPERTY_DEST_SUB_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDestSubType(String destSubType) {
        this.destSubType = destSubType;
    }

    public TravelRulePolicyRuleResponse destAddress(String destAddress) {
        this.destAddress = destAddress;
        return this;
    }

    /**
     * Get destAddress
     *
     * @return destAddress
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DEST_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDestAddress() {
        return destAddress;
    }

    @JsonProperty(JSON_PROPERTY_DEST_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDestAddress(String destAddress) {
        this.destAddress = destAddress;
    }

    public TravelRulePolicyRuleResponse sourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * Get sourceId
     *
     * @return sourceId
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_SOURCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSourceId() {
        return sourceId;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public TravelRulePolicyRuleResponse destId(String destId) {
        this.destId = destId;
        return this;
    }

    /**
     * Get destId
     *
     * @return destId
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DEST_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDestId() {
        return destId;
    }

    @JsonProperty(JSON_PROPERTY_DEST_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDestId(String destId) {
        this.destId = destId;
    }

    public TravelRulePolicyRuleResponse asset(String asset) {
        this.asset = asset;
        return this;
    }

    /**
     * Get asset
     *
     * @return asset
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ASSET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAsset() {
        return asset;
    }

    @JsonProperty(JSON_PROPERTY_ASSET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAsset(String asset) {
        this.asset = asset;
    }

    public TravelRulePolicyRuleResponse baseAsset(String baseAsset) {
        this.baseAsset = baseAsset;
        return this;
    }

    /**
     * Get baseAsset
     *
     * @return baseAsset
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_BASE_ASSET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBaseAsset() {
        return baseAsset;
    }

    @JsonProperty(JSON_PROPERTY_BASE_ASSET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBaseAsset(String baseAsset) {
        this.baseAsset = baseAsset;
    }

    public TravelRulePolicyRuleResponse amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getAmount() {
        return amount;
    }

    @JsonProperty(JSON_PROPERTY_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public TravelRulePolicyRuleResponse amountUSD(BigDecimal amountUSD) {
        this.amountUSD = amountUSD;
        return this;
    }

    /**
     * Get amountUSD
     *
     * @return amountUSD
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_AMOUNT_U_S_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getAmountUSD() {
        return amountUSD;
    }

    @JsonProperty(JSON_PROPERTY_AMOUNT_U_S_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAmountUSD(BigDecimal amountUSD) {
        this.amountUSD = amountUSD;
    }

    public TravelRulePolicyRuleResponse networkProtocol(String networkProtocol) {
        this.networkProtocol = networkProtocol;
        return this;
    }

    /**
     * The network protocol of the token
     *
     * @return networkProtocol
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_NETWORK_PROTOCOL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getNetworkProtocol() {
        return networkProtocol;
    }

    @JsonProperty(JSON_PROPERTY_NETWORK_PROTOCOL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNetworkProtocol(String networkProtocol) {
        this.networkProtocol = networkProtocol;
    }

    public TravelRulePolicyRuleResponse operation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get operation
     *
     * @return operation
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_OPERATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getOperation() {
        return operation;
    }

    @JsonProperty(JSON_PROPERTY_OPERATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOperation(String operation) {
        this.operation = operation;
    }

    public TravelRulePolicyRuleResponse action(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     *
     * @return action
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ACTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ActionEnum getAction() {
        return action;
    }

    @JsonProperty(JSON_PROPERTY_ACTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAction(ActionEnum action) {
        this.action = action;
    }

    /** Return true if this TravelRulePolicyRuleResponse object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TravelRulePolicyRuleResponse travelRulePolicyRuleResponse =
                (TravelRulePolicyRuleResponse) o;
        return Objects.equals(this.sourceType, travelRulePolicyRuleResponse.sourceType)
                && Objects.equals(this.sourceSubType, travelRulePolicyRuleResponse.sourceSubType)
                && Objects.equals(this.destType, travelRulePolicyRuleResponse.destType)
                && Objects.equals(this.destSubType, travelRulePolicyRuleResponse.destSubType)
                && Objects.equals(this.destAddress, travelRulePolicyRuleResponse.destAddress)
                && Objects.equals(this.sourceId, travelRulePolicyRuleResponse.sourceId)
                && Objects.equals(this.destId, travelRulePolicyRuleResponse.destId)
                && Objects.equals(this.asset, travelRulePolicyRuleResponse.asset)
                && Objects.equals(this.baseAsset, travelRulePolicyRuleResponse.baseAsset)
                && Objects.equals(this.amount, travelRulePolicyRuleResponse.amount)
                && Objects.equals(this.amountUSD, travelRulePolicyRuleResponse.amountUSD)
                && Objects.equals(
                        this.networkProtocol, travelRulePolicyRuleResponse.networkProtocol)
                && Objects.equals(this.operation, travelRulePolicyRuleResponse.operation)
                && Objects.equals(this.action, travelRulePolicyRuleResponse.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                sourceType,
                sourceSubType,
                destType,
                destSubType,
                destAddress,
                sourceId,
                destId,
                asset,
                baseAsset,
                amount,
                amountUSD,
                networkProtocol,
                operation,
                action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TravelRulePolicyRuleResponse {\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sourceSubType: ").append(toIndentedString(sourceSubType)).append("\n");
        sb.append("    destType: ").append(toIndentedString(destType)).append("\n");
        sb.append("    destSubType: ").append(toIndentedString(destSubType)).append("\n");
        sb.append("    destAddress: ").append(toIndentedString(destAddress)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    destId: ").append(toIndentedString(destId)).append("\n");
        sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
        sb.append("    baseAsset: ").append(toIndentedString(baseAsset)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    amountUSD: ").append(toIndentedString(amountUSD)).append("\n");
        sb.append("    networkProtocol: ").append(toIndentedString(networkProtocol)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

        // add `sourceType` to the URL query string
        if (getSourceType() != null) {
            joiner.add(
                    String.format(
                            "%ssourceType%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getSourceType()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `sourceSubType` to the URL query string
        if (getSourceSubType() != null) {
            joiner.add(
                    String.format(
                            "%ssourceSubType%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getSourceSubType()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `destType` to the URL query string
        if (getDestType() != null) {
            joiner.add(
                    String.format(
                            "%sdestType%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getDestType()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `destSubType` to the URL query string
        if (getDestSubType() != null) {
            joiner.add(
                    String.format(
                            "%sdestSubType%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getDestSubType()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `destAddress` to the URL query string
        if (getDestAddress() != null) {
            joiner.add(
                    String.format(
                            "%sdestAddress%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getDestAddress()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `sourceId` to the URL query string
        if (getSourceId() != null) {
            joiner.add(
                    String.format(
                            "%ssourceId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getSourceId()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `destId` to the URL query string
        if (getDestId() != null) {
            joiner.add(
                    String.format(
                            "%sdestId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getDestId()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `asset` to the URL query string
        if (getAsset() != null) {
            joiner.add(
                    String.format(
                            "%sasset%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getAsset()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `baseAsset` to the URL query string
        if (getBaseAsset() != null) {
            joiner.add(
                    String.format(
                            "%sbaseAsset%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getBaseAsset()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `amount` to the URL query string
        if (getAmount() != null) {
            joiner.add(
                    String.format(
                            "%samount%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getAmount()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `amountUSD` to the URL query string
        if (getAmountUSD() != null) {
            joiner.add(
                    String.format(
                            "%samountUSD%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getAmountUSD()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `networkProtocol` to the URL query string
        if (getNetworkProtocol() != null) {
            joiner.add(
                    String.format(
                            "%snetworkProtocol%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getNetworkProtocol()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `operation` to the URL query string
        if (getOperation() != null) {
            joiner.add(
                    String.format(
                            "%soperation%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getOperation()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `action` to the URL query string
        if (getAction() != null) {
            joiner.add(
                    String.format(
                            "%saction%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getAction()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
