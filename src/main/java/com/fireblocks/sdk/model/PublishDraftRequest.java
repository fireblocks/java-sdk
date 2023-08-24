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
 * PublishDraftRequest
 */
@JsonPropertyOrder({
  PublishDraftRequest.JSON_PROPERTY_DRAFT_ID
})
@JsonTypeName("publishDraft_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PublishDraftRequest {
  public static final String JSON_PROPERTY_DRAFT_ID = "draftId";
  private String draftId;

  public PublishDraftRequest() { 
  }

  public PublishDraftRequest draftId(String draftId) {
    this.draftId = draftId;
    return this;
  }

   /**
   * draft unique identifier
   * @return draftId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRAFT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDraftId() {
    return draftId;
  }


  @JsonProperty(JSON_PROPERTY_DRAFT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDraftId(String draftId) {
    this.draftId = draftId;
  }


  /**
   * Return true if this publishDraft_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishDraftRequest publishDraftRequest = (PublishDraftRequest) o;
    return Objects.equals(this.draftId, publishDraftRequest.draftId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(draftId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishDraftRequest {\n");
    sb.append("    draftId: ").append(toIndentedString(draftId)).append("\n");
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

