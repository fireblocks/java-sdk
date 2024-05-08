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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/** ScreeningOperationExecutionOutput */
@JsonPropertyOrder({ScreeningOperationExecutionOutput.JSON_PROPERTY_VERDICTS})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScreeningOperationExecutionOutput {
    public static final String JSON_PROPERTY_VERDICTS = "verdicts";
    private List<ScreeningVerdict> verdicts = new ArrayList<>();

    public ScreeningOperationExecutionOutput() {}

    public ScreeningOperationExecutionOutput verdicts(List<ScreeningVerdict> verdicts) {
        this.verdicts = verdicts;
        return this;
    }

    public ScreeningOperationExecutionOutput addVerdictsItem(ScreeningVerdict verdictsItem) {
        if (this.verdicts == null) {
            this.verdicts = new ArrayList<>();
        }
        this.verdicts.add(verdictsItem);
        return this;
    }

    /**
     * Get verdicts
     *
     * @return verdicts
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_VERDICTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<ScreeningVerdict> getVerdicts() {
        return verdicts;
    }

    @JsonProperty(JSON_PROPERTY_VERDICTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setVerdicts(List<ScreeningVerdict> verdicts) {
        this.verdicts = verdicts;
    }

    /** Return true if this ScreeningOperationExecutionOutput object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScreeningOperationExecutionOutput screeningOperationExecutionOutput =
                (ScreeningOperationExecutionOutput) o;
        return Objects.equals(this.verdicts, screeningOperationExecutionOutput.verdicts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verdicts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScreeningOperationExecutionOutput {\n");
        sb.append("    verdicts: ").append(toIndentedString(verdicts)).append("\n");
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

        // add `verdicts` to the URL query string
        if (getVerdicts() != null) {
            for (int i = 0; i < getVerdicts().size(); i++) {
                if (getVerdicts().get(i) != null) {
                    joiner.add(
                            getVerdicts()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%sverdicts%s%s",
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

        return joiner.toString();
    }
}