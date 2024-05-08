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
import java.util.Objects;
import java.util.StringJoiner;

/** TransferOperationPreview */
@JsonPropertyOrder({
    TransferOperationPreview.JSON_PROPERTY_INPUT,
    TransferOperationPreview.JSON_PROPERTY_OUTPUT,
    TransferOperationPreview.JSON_PROPERTY_FAILURE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransferOperationPreview {
    public static final String JSON_PROPERTY_INPUT = "input";
    private TransferOperationConfigParams input;

    public static final String JSON_PROPERTY_OUTPUT = "output";
    private TransferOperationPreviewOutput output;

    public static final String JSON_PROPERTY_FAILURE = "failure";
    private TransferOperationFailure failure;

    public TransferOperationPreview() {}

    public TransferOperationPreview input(TransferOperationConfigParams input) {
        this.input = input;
        return this;
    }

    /**
     * Get input
     *
     * @return input
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_INPUT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TransferOperationConfigParams getInput() {
        return input;
    }

    @JsonProperty(JSON_PROPERTY_INPUT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setInput(TransferOperationConfigParams input) {
        this.input = input;
    }

    public TransferOperationPreview output(TransferOperationPreviewOutput output) {
        this.output = output;
        return this;
    }

    /**
     * Get output
     *
     * @return output
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_OUTPUT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TransferOperationPreviewOutput getOutput() {
        return output;
    }

    @JsonProperty(JSON_PROPERTY_OUTPUT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOutput(TransferOperationPreviewOutput output) {
        this.output = output;
    }

    public TransferOperationPreview failure(TransferOperationFailure failure) {
        this.failure = failure;
        return this;
    }

    /**
     * Get failure
     *
     * @return failure
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_FAILURE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TransferOperationFailure getFailure() {
        return failure;
    }

    @JsonProperty(JSON_PROPERTY_FAILURE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFailure(TransferOperationFailure failure) {
        this.failure = failure;
    }

    /** Return true if this TransferOperationPreview object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransferOperationPreview transferOperationPreview = (TransferOperationPreview) o;
        return Objects.equals(this.input, transferOperationPreview.input)
                && Objects.equals(this.output, transferOperationPreview.output)
                && Objects.equals(this.failure, transferOperationPreview.failure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, output, failure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferOperationPreview {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
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

        // add `input` to the URL query string
        if (getInput() != null) {
            joiner.add(getInput().toUrlQueryString(prefix + "input" + suffix));
        }

        // add `output` to the URL query string
        if (getOutput() != null) {
            joiner.add(getOutput().toUrlQueryString(prefix + "output" + suffix));
        }

        // add `failure` to the URL query string
        if (getFailure() != null) {
            joiner.add(getFailure().toUrlQueryString(prefix + "failure" + suffix));
        }

        return joiner.toString();
    }
}