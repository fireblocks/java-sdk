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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;

/** The gasless configuration of the contract */
@JsonPropertyOrder({GasslessStandardConfigurations.JSON_PROPERTY_GASLESS_STANDARD_CONFIGURATIONS})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GasslessStandardConfigurations {
    public static final String JSON_PROPERTY_GASLESS_STANDARD_CONFIGURATIONS =
            "gaslessStandardConfigurations";
    private Map<String, GasslessStandardConfigurationsGaslessStandardConfigurationsValue>
            gaslessStandardConfigurations = new HashMap<>();

    public GasslessStandardConfigurations() {}

    public GasslessStandardConfigurations gaslessStandardConfigurations(
            Map<String, GasslessStandardConfigurationsGaslessStandardConfigurationsValue>
                    gaslessStandardConfigurations) {
        this.gaslessStandardConfigurations = gaslessStandardConfigurations;
        return this;
    }

    public GasslessStandardConfigurations putGaslessStandardConfigurationsItem(
            String key,
            GasslessStandardConfigurationsGaslessStandardConfigurationsValue
                    gaslessStandardConfigurationsItem) {
        if (this.gaslessStandardConfigurations == null) {
            this.gaslessStandardConfigurations = new HashMap<>();
        }
        this.gaslessStandardConfigurations.put(key, gaslessStandardConfigurationsItem);
        return this;
    }

    /**
     * Get gaslessStandardConfigurations
     *
     * @return gaslessStandardConfigurations
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_GASLESS_STANDARD_CONFIGURATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, GasslessStandardConfigurationsGaslessStandardConfigurationsValue>
            getGaslessStandardConfigurations() {
        return gaslessStandardConfigurations;
    }

    @JsonProperty(JSON_PROPERTY_GASLESS_STANDARD_CONFIGURATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setGaslessStandardConfigurations(
            Map<String, GasslessStandardConfigurationsGaslessStandardConfigurationsValue>
                    gaslessStandardConfigurations) {
        this.gaslessStandardConfigurations = gaslessStandardConfigurations;
    }

    /** Return true if this GasslessStandardConfigurations object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GasslessStandardConfigurations gasslessStandardConfigurations =
                (GasslessStandardConfigurations) o;
        return Objects.equals(
                this.gaslessStandardConfigurations,
                gasslessStandardConfigurations.gaslessStandardConfigurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gaslessStandardConfigurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GasslessStandardConfigurations {\n");
        sb.append("    gaslessStandardConfigurations: ")
                .append(toIndentedString(gaslessStandardConfigurations))
                .append("\n");
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

        // add `gaslessStandardConfigurations` to the URL query string
        if (getGaslessStandardConfigurations() != null) {
            for (String _key : getGaslessStandardConfigurations().keySet()) {
                if (getGaslessStandardConfigurations().get(_key) != null) {
                    joiner.add(
                            getGaslessStandardConfigurations()
                                    .get(_key)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%sgaslessStandardConfigurations%s%s",
                                                    prefix,
                                                    suffix,
                                                    "".equals(suffix)
                                                            ? ""
                                                            : String.format(
                                                                    "%s%d%s",
                                                                    containerPrefix,
                                                                    _key,
                                                                    containerSuffix))));
                }
            }
        }

        return joiner.toString();
    }
}
