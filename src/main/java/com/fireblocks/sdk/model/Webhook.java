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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.UUID;

/** Webhook */
@JsonPropertyOrder({
    Webhook.JSON_PROPERTY_ID,
    Webhook.JSON_PROPERTY_URL,
    Webhook.JSON_PROPERTY_DESCRIPTION,
    Webhook.JSON_PROPERTY_EVENTS,
    Webhook.JSON_PROPERTY_STATUS,
    Webhook.JSON_PROPERTY_CREATED_AT,
    Webhook.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Webhook {
    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_URL = "url";
    private String url;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_EVENTS = "events";
    private List<WebhookEvent> events = new ArrayList<>();

    /** The status of the webhook */
    public enum StatusEnum {
        DISABLED("DISABLED"),

        ENABLED("ENABLED"),

        SUSPENDED("SUSPENDED");

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_STATUS = "status";
    private StatusEnum status;

    public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
    private Long createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
    private Long updatedAt;

    public Webhook() {}

    public Webhook id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the webhook
     *
     * @return id
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public UUID getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(UUID id) {
        this.id = id;
    }

    public Webhook url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The url of the webhook where notifications will be sent. Must be a valid URL and https.
     *
     * @return url
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getUrl() {
        return url;
    }

    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUrl(String url) {
        this.url = url;
    }

    public Webhook description(String description) {
        this.description = description;
        return this;
    }

    /**
     * description of the webhook of what it is used for
     *
     * @return description
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDescription(String description) {
        this.description = description;
    }

    public Webhook events(List<WebhookEvent> events) {
        this.events = events;
        return this;
    }

    public Webhook addEventsItem(WebhookEvent eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     * The events that the webhook will be subscribed to
     *
     * @return events
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_EVENTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<WebhookEvent> getEvents() {
        return events;
    }

    @JsonProperty(JSON_PROPERTY_EVENTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEvents(List<WebhookEvent> events) {
        this.events = events;
    }

    public Webhook status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the webhook
     *
     * @return status
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public StatusEnum getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Webhook createdAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The date and time the webhook was created in milliseconds
     *
     * @return createdAt
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Long getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Webhook updatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The date and time the webhook was last updated in milliseconds
     *
     * @return updatedAt
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Long getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    /** Return true if this Webhook object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Webhook webhook = (Webhook) o;
        return Objects.equals(this.id, webhook.id)
                && Objects.equals(this.url, webhook.url)
                && Objects.equals(this.description, webhook.description)
                && Objects.equals(this.events, webhook.events)
                && Objects.equals(this.status, webhook.status)
                && Objects.equals(this.createdAt, webhook.createdAt)
                && Objects.equals(this.updatedAt, webhook.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, description, events, status, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Webhook {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

        // add `url` to the URL query string
        if (getUrl() != null) {
            joiner.add(
                    String.format(
                            "%surl%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getUrl()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `description` to the URL query string
        if (getDescription() != null) {
            joiner.add(
                    String.format(
                            "%sdescription%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getDescription()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `events` to the URL query string
        if (getEvents() != null) {
            for (int i = 0; i < getEvents().size(); i++) {
                if (getEvents().get(i) != null) {
                    joiner.add(
                            String.format(
                                    "%sevents%s%s=%s",
                                    prefix,
                                    suffix,
                                    "".equals(suffix)
                                            ? ""
                                            : String.format(
                                                    "%s%d%s", containerPrefix, i, containerSuffix),
                                    URLEncoder.encode(
                                                    String.valueOf(getEvents().get(i)),
                                                    StandardCharsets.UTF_8)
                                            .replaceAll("\\+", "%20")));
                }
            }
        }

        // add `status` to the URL query string
        if (getStatus() != null) {
            joiner.add(
                    String.format(
                            "%sstatus%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `createdAt` to the URL query string
        if (getCreatedAt() != null) {
            joiner.add(
                    String.format(
                            "%screatedAt%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getCreatedAt()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `updatedAt` to the URL query string
        if (getUpdatedAt() != null) {
            joiner.add(
                    String.format(
                            "%supdatedAt%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getUpdatedAt()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
