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

/** GetValidationKeyResponseDto */
@JsonPropertyOrder({
    GetValidationKeyResponseDto.JSON_PROPERTY_DATA,
    GetValidationKeyResponseDto.JSON_PROPERTY_NEXT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetValidationKeyResponseDto {
    public static final String JSON_PROPERTY_DATA = "data";
    private List<ValidationKeyDto> data = new ArrayList<>();

    public static final String JSON_PROPERTY_NEXT = "next";
    private String next;

    public GetValidationKeyResponseDto() {}

    public GetValidationKeyResponseDto data(List<ValidationKeyDto> data) {
        this.data = data;
        return this;
    }

    public GetValidationKeyResponseDto addDataItem(ValidationKeyDto dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Response object for getting external validation keys.
     *
     * @return data
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<ValidationKeyDto> getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setData(List<ValidationKeyDto> data) {
        this.data = data;
    }

    public GetValidationKeyResponseDto next(String next) {
        this.next = next;
        return this;
    }

    /**
     * The ID of the next page
     *
     * @return next
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_NEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getNext() {
        return next;
    }

    @JsonProperty(JSON_PROPERTY_NEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNext(String next) {
        this.next = next;
    }

    /** Return true if this GetValidationKeyResponseDto object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetValidationKeyResponseDto getValidationKeyResponseDto = (GetValidationKeyResponseDto) o;
        return Objects.equals(this.data, getValidationKeyResponseDto.data)
                && Objects.equals(this.next, getValidationKeyResponseDto.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetValidationKeyResponseDto {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

        // add `data` to the URL query string
        if (getData() != null) {
            for (int i = 0; i < getData().size(); i++) {
                if (getData().get(i) != null) {
                    joiner.add(
                            getData()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%sdata%s%s",
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

        // add `next` to the URL query string
        if (getNext() != null) {
            joiner.add(
                    String.format(
                            "%snext%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getNext()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
