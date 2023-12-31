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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * SessionMetadata
 */
@JsonPropertyOrder({
  SessionMetadata.JSON_PROPERTY_APP_URL,
  SessionMetadata.JSON_PROPERTY_APP_NAME,
  SessionMetadata.JSON_PROPERTY_APP_DESCRIPTION,
  SessionMetadata.JSON_PROPERTY_APP_ICON
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SessionMetadata {
  public static final String JSON_PROPERTY_APP_URL = "appUrl";
  private String appUrl;

  public static final String JSON_PROPERTY_APP_NAME = "appName";
  private String appName;

  public static final String JSON_PROPERTY_APP_DESCRIPTION = "appDescription";
  private String appDescription;

  public static final String JSON_PROPERTY_APP_ICON = "appIcon";
  private String appIcon;

  public SessionMetadata() { 
  }

  public SessionMetadata appUrl(String appUrl) {
    this.appUrl = appUrl;
    return this;
  }

   /**
   * Get appUrl
   * @return appUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_APP_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAppUrl() {
    return appUrl;
  }


  @JsonProperty(JSON_PROPERTY_APP_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAppUrl(String appUrl) {
    this.appUrl = appUrl;
  }


  public SessionMetadata appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * Get appName
   * @return appName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppName() {
    return appName;
  }


  @JsonProperty(JSON_PROPERTY_APP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppName(String appName) {
    this.appName = appName;
  }


  public SessionMetadata appDescription(String appDescription) {
    this.appDescription = appDescription;
    return this;
  }

   /**
   * Get appDescription
   * @return appDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppDescription() {
    return appDescription;
  }


  @JsonProperty(JSON_PROPERTY_APP_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppDescription(String appDescription) {
    this.appDescription = appDescription;
  }


  public SessionMetadata appIcon(String appIcon) {
    this.appIcon = appIcon;
    return this;
  }

   /**
   * Get appIcon
   * @return appIcon
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppIcon() {
    return appIcon;
  }


  @JsonProperty(JSON_PROPERTY_APP_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppIcon(String appIcon) {
    this.appIcon = appIcon;
  }


  /**
   * Return true if this SessionMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionMetadata sessionMetadata = (SessionMetadata) o;
    return Objects.equals(this.appUrl, sessionMetadata.appUrl) &&
        Objects.equals(this.appName, sessionMetadata.appName) &&
        Objects.equals(this.appDescription, sessionMetadata.appDescription) &&
        Objects.equals(this.appIcon, sessionMetadata.appIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appUrl, appName, appDescription, appIcon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionMetadata {\n");
    sb.append("    appUrl: ").append(toIndentedString(appUrl)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appDescription: ").append(toIndentedString(appDescription)).append("\n");
    sb.append("    appIcon: ").append(toIndentedString(appIcon)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

