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
import java.util.Objects;
import java.util.StringJoiner;

/** CreateSigningKeyDto */
@JsonPropertyOrder({
    CreateSigningKeyDto.JSON_PROPERTY_SIGNING_DEVICE_KEY_ID,
    CreateSigningKeyDto.JSON_PROPERTY_SIGNED_CERT_PEM,
    CreateSigningKeyDto.JSON_PROPERTY_AGENT_USER_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSigningKeyDto {
    public static final String JSON_PROPERTY_SIGNING_DEVICE_KEY_ID = "signingDeviceKeyId";
    private String signingDeviceKeyId;

    public static final String JSON_PROPERTY_SIGNED_CERT_PEM = "signedCertPem";
    private String signedCertPem;

    public static final String JSON_PROPERTY_AGENT_USER_ID = "agentUserId";
    private String agentUserId;

    public CreateSigningKeyDto() {}

    public CreateSigningKeyDto signingDeviceKeyId(String signingDeviceKeyId) {
        this.signingDeviceKeyId = signingDeviceKeyId;
        return this;
    }

    /**
     * The ID, name or label of the key specified on the customer&#39;s signing device.
     *
     * @return signingDeviceKeyId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_SIGNING_DEVICE_KEY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getSigningDeviceKeyId() {
        return signingDeviceKeyId;
    }

    @JsonProperty(JSON_PROPERTY_SIGNING_DEVICE_KEY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSigningDeviceKeyId(String signingDeviceKeyId) {
        this.signingDeviceKeyId = signingDeviceKeyId;
    }

    public CreateSigningKeyDto signedCertPem(String signedCertPem) {
        this.signedCertPem = signedCertPem;
        return this;
    }

    /**
     * The signed certificate that includes the public key PEM of the signing key, signed by a
     * validation key.
     *
     * @return signedCertPem
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_SIGNED_CERT_PEM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getSignedCertPem() {
        return signedCertPem;
    }

    @JsonProperty(JSON_PROPERTY_SIGNED_CERT_PEM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSignedCertPem(String signedCertPem) {
        this.signedCertPem = signedCertPem;
    }

    public CreateSigningKeyDto agentUserId(String agentUserId) {
        this.agentUserId = agentUserId;
        return this;
    }

    /**
     * Id of user to which this key belongs
     *
     * @return agentUserId
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_AGENT_USER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getAgentUserId() {
        return agentUserId;
    }

    @JsonProperty(JSON_PROPERTY_AGENT_USER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAgentUserId(String agentUserId) {
        this.agentUserId = agentUserId;
    }

    /** Return true if this CreateSigningKeyDto object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSigningKeyDto createSigningKeyDto = (CreateSigningKeyDto) o;
        return Objects.equals(this.signingDeviceKeyId, createSigningKeyDto.signingDeviceKeyId)
                && Objects.equals(this.signedCertPem, createSigningKeyDto.signedCertPem)
                && Objects.equals(this.agentUserId, createSigningKeyDto.agentUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(signingDeviceKeyId, signedCertPem, agentUserId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSigningKeyDto {\n");
        sb.append("    signingDeviceKeyId: ")
                .append(toIndentedString(signingDeviceKeyId))
                .append("\n");
        sb.append("    signedCertPem: ").append(toIndentedString(signedCertPem)).append("\n");
        sb.append("    agentUserId: ").append(toIndentedString(agentUserId)).append("\n");
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

        // add `signingDeviceKeyId` to the URL query string
        if (getSigningDeviceKeyId() != null) {
            joiner.add(
                    String.format(
                            "%ssigningDeviceKeyId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getSigningDeviceKeyId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `signedCertPem` to the URL query string
        if (getSignedCertPem() != null) {
            joiner.add(
                    String.format(
                            "%ssignedCertPem%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getSignedCertPem()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `agentUserId` to the URL query string
        if (getAgentUserId() != null) {
            joiner.add(
                    String.format(
                            "%sagentUserId%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getAgentUserId()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}