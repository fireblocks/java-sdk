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

/** UpdateWebhookRequest */
@JsonPropertyOrder({
    UpdateWebhookRequest.JSON_PROPERTY_URL,
    UpdateWebhookRequest.JSON_PROPERTY_DESCRIPTION,
    UpdateWebhookRequest.JSON_PROPERTY_EVENTS,
    UpdateWebhookRequest.JSON_PROPERTY_ENABLED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateWebhookRequest {
    public static final String JSON_PROPERTY_URL = "url";
    private String url;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_EVENTS = "events";
    private List<WebhookEvent> events;

    public static final String JSON_PROPERTY_ENABLED = "enabled";
    private Boolean enabled;

    public UpdateWebhookRequest() {}

    public UpdateWebhookRequest url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The url of the webhook where notifications will be sent. URL must be valid, unique and https.
     *
     * @return url
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUrl() {
        return url;
    }

    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUrl(String url) {
        this.url = url;
    }

    public UpdateWebhookRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * description of the webhook of what it is used for.should not contain special characters.
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

    public UpdateWebhookRequest events(List<WebhookEvent> events) {
        this.events = events;
        return this;
    }

    public UpdateWebhookRequest addEventsItem(WebhookEvent eventsItem) {
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
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_EVENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<WebhookEvent> getEvents() {
        return events;
    }

    @JsonProperty(JSON_PROPERTY_EVENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEvents(List<WebhookEvent> events) {
        this.events = events;
    }

    public UpdateWebhookRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * The status of the webhook
     *
     * @return enabled
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty(JSON_PROPERTY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /** Return true if this UpdateWebhookRequest object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateWebhookRequest updateWebhookRequest = (UpdateWebhookRequest) o;
        return Objects.equals(this.url, updateWebhookRequest.url)
                && Objects.equals(this.description, updateWebhookRequest.description)
                && Objects.equals(this.events, updateWebhookRequest.events)
                && Objects.equals(this.enabled, updateWebhookRequest.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, description, events, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWebhookRequest {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

        // add `enabled` to the URL query string
        if (getEnabled() != null) {
            joiner.add(
                    String.format(
                            "%senabled%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getEnabled()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
