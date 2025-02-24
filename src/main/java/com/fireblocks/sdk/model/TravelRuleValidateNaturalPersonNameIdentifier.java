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

/** TravelRuleValidateNaturalPersonNameIdentifier */
@JsonPropertyOrder({
    TravelRuleValidateNaturalPersonNameIdentifier.JSON_PROPERTY_NAME_IDENTIFIER,
    TravelRuleValidateNaturalPersonNameIdentifier.JSON_PROPERTY_LOCAL_NAME_IDENTIFIER,
    TravelRuleValidateNaturalPersonNameIdentifier.JSON_PROPERTY_PHONETIC_NAME_IDENTIFIER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TravelRuleValidateNaturalPersonNameIdentifier {
    public static final String JSON_PROPERTY_NAME_IDENTIFIER = "nameIdentifier";
    private List<TravelRuleValidateNaturalNameIdentifier> nameIdentifier;

    public static final String JSON_PROPERTY_LOCAL_NAME_IDENTIFIER = "localNameIdentifier";
    private List<TravelRuleValidateNaturalNameIdentifier> localNameIdentifier;

    public static final String JSON_PROPERTY_PHONETIC_NAME_IDENTIFIER = "phoneticNameIdentifier";
    private List<TravelRuleValidateNaturalNameIdentifier> phoneticNameIdentifier;

    public TravelRuleValidateNaturalPersonNameIdentifier() {}

    public TravelRuleValidateNaturalPersonNameIdentifier nameIdentifier(
            List<TravelRuleValidateNaturalNameIdentifier> nameIdentifier) {
        this.nameIdentifier = nameIdentifier;
        return this;
    }

    public TravelRuleValidateNaturalPersonNameIdentifier addNameIdentifierItem(
            TravelRuleValidateNaturalNameIdentifier nameIdentifierItem) {
        if (this.nameIdentifier == null) {
            this.nameIdentifier = new ArrayList<>();
        }
        this.nameIdentifier.add(nameIdentifierItem);
        return this;
    }

    /**
     * Get nameIdentifier
     *
     * @return nameIdentifier
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_NAME_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<TravelRuleValidateNaturalNameIdentifier> getNameIdentifier() {
        return nameIdentifier;
    }

    @JsonProperty(JSON_PROPERTY_NAME_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNameIdentifier(List<TravelRuleValidateNaturalNameIdentifier> nameIdentifier) {
        this.nameIdentifier = nameIdentifier;
    }

    public TravelRuleValidateNaturalPersonNameIdentifier localNameIdentifier(
            List<TravelRuleValidateNaturalNameIdentifier> localNameIdentifier) {
        this.localNameIdentifier = localNameIdentifier;
        return this;
    }

    public TravelRuleValidateNaturalPersonNameIdentifier addLocalNameIdentifierItem(
            TravelRuleValidateNaturalNameIdentifier localNameIdentifierItem) {
        if (this.localNameIdentifier == null) {
            this.localNameIdentifier = new ArrayList<>();
        }
        this.localNameIdentifier.add(localNameIdentifierItem);
        return this;
    }

    /**
     * Get localNameIdentifier
     *
     * @return localNameIdentifier
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_LOCAL_NAME_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<TravelRuleValidateNaturalNameIdentifier> getLocalNameIdentifier() {
        return localNameIdentifier;
    }

    @JsonProperty(JSON_PROPERTY_LOCAL_NAME_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLocalNameIdentifier(
            List<TravelRuleValidateNaturalNameIdentifier> localNameIdentifier) {
        this.localNameIdentifier = localNameIdentifier;
    }

    public TravelRuleValidateNaturalPersonNameIdentifier phoneticNameIdentifier(
            List<TravelRuleValidateNaturalNameIdentifier> phoneticNameIdentifier) {
        this.phoneticNameIdentifier = phoneticNameIdentifier;
        return this;
    }

    public TravelRuleValidateNaturalPersonNameIdentifier addPhoneticNameIdentifierItem(
            TravelRuleValidateNaturalNameIdentifier phoneticNameIdentifierItem) {
        if (this.phoneticNameIdentifier == null) {
            this.phoneticNameIdentifier = new ArrayList<>();
        }
        this.phoneticNameIdentifier.add(phoneticNameIdentifierItem);
        return this;
    }

    /**
     * Get phoneticNameIdentifier
     *
     * @return phoneticNameIdentifier
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_PHONETIC_NAME_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<TravelRuleValidateNaturalNameIdentifier> getPhoneticNameIdentifier() {
        return phoneticNameIdentifier;
    }

    @JsonProperty(JSON_PROPERTY_PHONETIC_NAME_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPhoneticNameIdentifier(
            List<TravelRuleValidateNaturalNameIdentifier> phoneticNameIdentifier) {
        this.phoneticNameIdentifier = phoneticNameIdentifier;
    }

    /** Return true if this TravelRuleValidateNaturalPersonNameIdentifier object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TravelRuleValidateNaturalPersonNameIdentifier
                travelRuleValidateNaturalPersonNameIdentifier =
                        (TravelRuleValidateNaturalPersonNameIdentifier) o;
        return Objects.equals(
                        this.nameIdentifier,
                        travelRuleValidateNaturalPersonNameIdentifier.nameIdentifier)
                && Objects.equals(
                        this.localNameIdentifier,
                        travelRuleValidateNaturalPersonNameIdentifier.localNameIdentifier)
                && Objects.equals(
                        this.phoneticNameIdentifier,
                        travelRuleValidateNaturalPersonNameIdentifier.phoneticNameIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameIdentifier, localNameIdentifier, phoneticNameIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TravelRuleValidateNaturalPersonNameIdentifier {\n");
        sb.append("    nameIdentifier: ").append(toIndentedString(nameIdentifier)).append("\n");
        sb.append("    localNameIdentifier: ")
                .append(toIndentedString(localNameIdentifier))
                .append("\n");
        sb.append("    phoneticNameIdentifier: ")
                .append(toIndentedString(phoneticNameIdentifier))
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

        // add `nameIdentifier` to the URL query string
        if (getNameIdentifier() != null) {
            for (int i = 0; i < getNameIdentifier().size(); i++) {
                if (getNameIdentifier().get(i) != null) {
                    joiner.add(
                            getNameIdentifier()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%snameIdentifier%s%s",
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

        // add `localNameIdentifier` to the URL query string
        if (getLocalNameIdentifier() != null) {
            for (int i = 0; i < getLocalNameIdentifier().size(); i++) {
                if (getLocalNameIdentifier().get(i) != null) {
                    joiner.add(
                            getLocalNameIdentifier()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%slocalNameIdentifier%s%s",
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

        // add `phoneticNameIdentifier` to the URL query string
        if (getPhoneticNameIdentifier() != null) {
            for (int i = 0; i < getPhoneticNameIdentifier().size(); i++) {
                if (getPhoneticNameIdentifier().get(i) != null) {
                    joiner.add(
                            getPhoneticNameIdentifier()
                                    .get(i)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%sphoneticNameIdentifier%s%s",
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
