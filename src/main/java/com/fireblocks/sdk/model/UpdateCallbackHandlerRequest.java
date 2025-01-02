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

/** UpdateCallbackHandlerRequest */
@JsonPropertyOrder({UpdateCallbackHandlerRequest.JSON_PROPERTY_CALLBACK_HANDLER})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateCallbackHandlerRequest {
    public static final String JSON_PROPERTY_CALLBACK_HANDLER = "callbackHandler";
    private CallbackHandlerRequest callbackHandler;

    public UpdateCallbackHandlerRequest() {}

    public UpdateCallbackHandlerRequest callbackHandler(CallbackHandlerRequest callbackHandler) {
        this.callbackHandler = callbackHandler;
        return this;
    }

    /**
     * Get callbackHandler
     *
     * @return callbackHandler
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_CALLBACK_HANDLER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CallbackHandlerRequest getCallbackHandler() {
        return callbackHandler;
    }

    @JsonProperty(JSON_PROPERTY_CALLBACK_HANDLER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCallbackHandler(CallbackHandlerRequest callbackHandler) {
        this.callbackHandler = callbackHandler;
    }

    /** Return true if this UpdateCallbackHandlerRequest object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCallbackHandlerRequest updateCallbackHandlerRequest =
                (UpdateCallbackHandlerRequest) o;
        return Objects.equals(this.callbackHandler, updateCallbackHandlerRequest.callbackHandler);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callbackHandler);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCallbackHandlerRequest {\n");
        sb.append("    callbackHandler: ").append(toIndentedString(callbackHandler)).append("\n");
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

        // add `callbackHandler` to the URL query string
        if (getCallbackHandler() != null) {
            joiner.add(getCallbackHandler().toUrlQueryString(prefix + "callbackHandler" + suffix));
        }

        return joiner.toString();
    }
}
