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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;


/**
 * UsersGroupResponse
 */
@JsonPropertyOrder({
  UsersGroupResponse.JSON_PROPERTY_ID,
  UsersGroupResponse.JSON_PROPERTY_NAME,
  UsersGroupResponse.JSON_PROPERTY_STATUS,
  UsersGroupResponse.JSON_PROPERTY_MEMBER_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsersGroupResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_MEMBER_IDS = "memberIds";
  private List<String> memberIds;

  public UsersGroupResponse() { 
  }

  public UsersGroupResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public UsersGroupResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
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


  public UsersGroupResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public UsersGroupResponse memberIds(List<String> memberIds) {
    this.memberIds = memberIds;
    return this;
  }

  public UsersGroupResponse addMemberIdsItem(String memberIdsItem) {
    if (this.memberIds == null) {
      this.memberIds = new ArrayList<>();
    }
    this.memberIds.add(memberIdsItem);
    return this;
  }

   /**
   * Get memberIds
   * @return memberIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMBER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMemberIds() {
    return memberIds;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberIds(List<String> memberIds) {
    this.memberIds = memberIds;
  }


  /**
   * Return true if this UsersGroupResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersGroupResponse usersGroupResponse = (UsersGroupResponse) o;
    return Objects.equals(this.id, usersGroupResponse.id) &&
        Objects.equals(this.name, usersGroupResponse.name) &&
        Objects.equals(this.status, usersGroupResponse.status) &&
        Objects.equals(this.memberIds, usersGroupResponse.memberIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, memberIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersGroupResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    memberIds: ").append(toIndentedString(memberIds)).append("\n");
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

