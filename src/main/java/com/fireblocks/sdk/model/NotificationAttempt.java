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

/** NotificationAttempt */
@JsonPropertyOrder({
    NotificationAttempt.JSON_PROPERTY_SENT_TIME,
    NotificationAttempt.JSON_PROPERTY_DURATION,
    NotificationAttempt.JSON_PROPERTY_RESPONSE_CODE,
    NotificationAttempt.JSON_PROPERTY_FAILURE_REASON
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotificationAttempt {
    public static final String JSON_PROPERTY_SENT_TIME = "sentTime";
    private Long sentTime;

    public static final String JSON_PROPERTY_DURATION = "duration";
    private Integer duration;

    public static final String JSON_PROPERTY_RESPONSE_CODE = "responseCode";
    private Integer responseCode;

    /** The request failure reason in case responseCode is missing. */
    public enum FailureReasonEnum {
        TIMED_OUT("TIMED_OUT"),

        NO_RESPONSE("NO_RESPONSE");

        private String value;

        FailureReasonEnum(String value) {
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
        public static FailureReasonEnum fromValue(String value) {
            for (FailureReasonEnum b : FailureReasonEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_FAILURE_REASON = "failureReason";
    private FailureReasonEnum failureReason;

    public NotificationAttempt() {}

    public NotificationAttempt sentTime(Long sentTime) {
        this.sentTime = sentTime;
        return this;
    }

    /**
     * The time when the attempt was sent in milliseconds.
     *
     * @return sentTime
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_SENT_TIME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Long getSentTime() {
        return sentTime;
    }

    @JsonProperty(JSON_PROPERTY_SENT_TIME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSentTime(Long sentTime) {
        this.sentTime = sentTime;
    }

    public NotificationAttempt duration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The duration of the attempt in milliseconds.
     *
     * @return duration
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_DURATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getDuration() {
        return duration;
    }

    @JsonProperty(JSON_PROPERTY_DURATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public NotificationAttempt responseCode(Integer responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * The response code of the attempt, when missing refer to failureReason.
     *
     * @return responseCode
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getResponseCode() {
        return responseCode;
    }

    @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public NotificationAttempt failureReason(FailureReasonEnum failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * The request failure reason in case responseCode is missing.
     *
     * @return failureReason
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public FailureReasonEnum getFailureReason() {
        return failureReason;
    }

    @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFailureReason(FailureReasonEnum failureReason) {
        this.failureReason = failureReason;
    }

    /** Return true if this NotificationAttempt object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NotificationAttempt notificationAttempt = (NotificationAttempt) o;
        return Objects.equals(this.sentTime, notificationAttempt.sentTime)
                && Objects.equals(this.duration, notificationAttempt.duration)
                && Objects.equals(this.responseCode, notificationAttempt.responseCode)
                && Objects.equals(this.failureReason, notificationAttempt.failureReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentTime, duration, responseCode, failureReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationAttempt {\n");
        sb.append("    sentTime: ").append(toIndentedString(sentTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
        sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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

        // add `sentTime` to the URL query string
        if (getSentTime() != null) {
            joiner.add(
                    String.format(
                            "%ssentTime%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getSentTime()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `duration` to the URL query string
        if (getDuration() != null) {
            joiner.add(
                    String.format(
                            "%sduration%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getDuration()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `responseCode` to the URL query string
        if (getResponseCode() != null) {
            joiner.add(
                    String.format(
                            "%sresponseCode%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getResponseCode()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `failureReason` to the URL query string
        if (getFailureReason() != null) {
            joiner.add(
                    String.format(
                            "%sfailureReason%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getFailureReason()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
