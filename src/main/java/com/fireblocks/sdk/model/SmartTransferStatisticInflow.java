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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/** Inflow tickets data */
@JsonPropertyOrder({
    SmartTransferStatisticInflow.JSON_PROPERTY_COINS,
    SmartTransferStatisticInflow.JSON_PROPERTY_TICKET_COUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SmartTransferStatisticInflow {
    public static final String JSON_PROPERTY_COINS = "coins";
    private List<SmartTransferCoinStatistic> coins;

    public static final String JSON_PROPERTY_TICKET_COUNT = "ticketCount";
    private Integer ticketCount;

    public SmartTransferStatisticInflow() {}

    public SmartTransferStatisticInflow coins(List<SmartTransferCoinStatistic> coins) {
        this.coins = coins;
        return this;
    }

    public SmartTransferStatisticInflow addCoinsItem(SmartTransferCoinStatistic coinsItem) {
        if (this.coins == null) {
            this.coins = new ArrayList<>();
        }
        this.coins.add(coinsItem);
        return this;
    }

    /**
     * Get coins
     *
     * @return coins
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_COINS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<SmartTransferCoinStatistic> getCoins() {
        return coins;
    }

    @JsonProperty(JSON_PROPERTY_COINS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCoins(List<SmartTransferCoinStatistic> coins) {
        this.coins = coins;
    }

    public SmartTransferStatisticInflow ticketCount(Integer ticketCount) {
        this.ticketCount = ticketCount;
        return this;
    }

    /**
     * Get ticketCount
     *
     * @return ticketCount
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TICKET_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getTicketCount() {
        return ticketCount;
    }

    @JsonProperty(JSON_PROPERTY_TICKET_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTicketCount(Integer ticketCount) {
        this.ticketCount = ticketCount;
    }

    /** Return true if this SmartTransferStatistic_inflow object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmartTransferStatisticInflow smartTransferStatisticInflow =
                (SmartTransferStatisticInflow) o;
        return Objects.equals(this.coins, smartTransferStatisticInflow.coins)
                && Objects.equals(this.ticketCount, smartTransferStatisticInflow.ticketCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coins, ticketCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartTransferStatisticInflow {\n");
        sb.append("    coins: ").append(toIndentedString(coins)).append("\n");
        sb.append("    ticketCount: ").append(toIndentedString(ticketCount)).append("\n");
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

        // add `coins` to the URL query string
        if (getCoins() != null) {
            for (int i = 0; i < getCoins().size(); i++) {
                if (getCoins().get(i) != null) {
                    joiner.add(
                            getCoins()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%scoins%s%s",
                                                    prefix,
                                                    suffix,
                                                    "".equals(suffix)
                                                            ? ""
                                                            : String.format(
                                                                    "%s%d%s",
                                                                    containerPrefix,
                                                                    i,
                                                                    containerSuffix))));
                }
            }
        }

        // add `ticketCount` to the URL query string
        if (getTicketCount() != null) {
            joiner.add(
                    String.format(
                            "%sticketCount%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getTicketCount()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
