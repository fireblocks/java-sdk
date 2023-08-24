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
 * Set of ids representing the users who signs transactions that match a specific rule
 */
@JsonPropertyOrder({
  PolicyRuleDesignatedSigners.JSON_PROPERTY_USERS,
  PolicyRuleDesignatedSigners.JSON_PROPERTY_USERS_GROUPS
})
@JsonTypeName("PolicyRule_designatedSigners")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PolicyRuleDesignatedSigners {
  public static final String JSON_PROPERTY_USERS = "users";
  private List<String> users;

  public static final String JSON_PROPERTY_USERS_GROUPS = "usersGroups";
  private List<String> usersGroups;

  public PolicyRuleDesignatedSigners() { 
  }

  public PolicyRuleDesignatedSigners users(List<String> users) {
    this.users = users;
    return this;
  }

  public PolicyRuleDesignatedSigners addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Set of users ids
   * @return users
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUsers() {
    return users;
  }


  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsers(List<String> users) {
    this.users = users;
  }


  public PolicyRuleDesignatedSigners usersGroups(List<String> usersGroups) {
    this.usersGroups = usersGroups;
    return this;
  }

  public PolicyRuleDesignatedSigners addUsersGroupsItem(String usersGroupsItem) {
    if (this.usersGroups == null) {
      this.usersGroups = new ArrayList<>();
    }
    this.usersGroups.add(usersGroupsItem);
    return this;
  }

   /**
   * Set of group ids
   * @return usersGroups
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERS_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUsersGroups() {
    return usersGroups;
  }


  @JsonProperty(JSON_PROPERTY_USERS_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsersGroups(List<String> usersGroups) {
    this.usersGroups = usersGroups;
  }


  /**
   * Return true if this PolicyRule_designatedSigners object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyRuleDesignatedSigners policyRuleDesignatedSigners = (PolicyRuleDesignatedSigners) o;
    return Objects.equals(this.users, policyRuleDesignatedSigners.users) &&
        Objects.equals(this.usersGroups, policyRuleDesignatedSigners.usersGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, usersGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyRuleDesignatedSigners {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    usersGroups: ").append(toIndentedString(usersGroups)).append("\n");
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
