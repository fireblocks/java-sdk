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
import java.util.UUID;

/** Cosigner */
@JsonPropertyOrder({
    Cosigner.JSON_PROPERTY_ARCHIVED,
    Cosigner.JSON_PROPERTY_ID,
    Cosigner.JSON_PROPERTY_NAME,
    Cosigner.JSON_PROPERTY_TYPE,
    Cosigner.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Cosigner {
    public static final String JSON_PROPERTY_ARCHIVED = "archived";
    private Boolean archived;

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    /** The type of the cosigner */
    public enum TypeEnum {
        SANDBOX("SANDBOX"),

        SGX("SGX"),

        GCP_CONFSPACE("GCP-CONFSPACE"),

        AWS_NITRO("AWS-NITRO"),

        PLAIN("PLAIN");

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_TYPE = "type";
    private TypeEnum type;

    public static final String JSON_PROPERTY_VERSION = "version";
    private Version version;

    public Cosigner() {}

    public Cosigner archived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Whether the cosigner is archived
     *
     * @return archived
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ARCHIVED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getArchived() {
        return archived;
    }

    @JsonProperty(JSON_PROPERTY_ARCHIVED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Cosigner id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the cosigner
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

    public Cosigner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the cosigner
     *
     * @return name
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public Cosigner type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the cosigner
     *
     * @return type
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TypeEnum getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Cosigner version(Version version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Version getVersion() {
        return version;
    }

    @JsonProperty(JSON_PROPERTY_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVersion(Version version) {
        this.version = version;
    }

    /** Return true if this Cosigner object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cosigner cosigner = (Cosigner) o;
        return Objects.equals(this.archived, cosigner.archived)
                && Objects.equals(this.id, cosigner.id)
                && Objects.equals(this.name, cosigner.name)
                && Objects.equals(this.type, cosigner.type)
                && Objects.equals(this.version, cosigner.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(archived, id, name, type, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Cosigner {\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

        // add `archived` to the URL query string
        if (getArchived() != null) {
            joiner.add(
                    String.format(
                            "%sarchived%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getArchived()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

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

        // add `name` to the URL query string
        if (getName() != null) {
            joiner.add(
                    String.format(
                            "%sname%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `type` to the URL query string
        if (getType() != null) {
            joiner.add(
                    String.format(
                            "%stype%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `version` to the URL query string
        if (getVersion() != null) {
            joiner.add(getVersion().toUrlQueryString(prefix + "version" + suffix));
        }

        return joiner.toString();
    }
}
