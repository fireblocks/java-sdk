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


package org.openapitools.client.model;
import com.sun.jersey.api.client.GenericType;
import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.ConfigChangeRequestStatus;
import org.openapitools.client.model.NetworkConnectionResponseLocalChannel;
import org.openapitools.client.model.NetworkConnectionResponseRemoteChannel;
import org.openapitools.client.model.NetworkConnectionRoutingPolicy;
import org.openapitools.client.model.NetworkId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * NetworkConnectionResponse
 */
@JsonPropertyOrder({
  NetworkConnectionResponse.JSON_PROPERTY_ID,
  NetworkConnectionResponse.JSON_PROPERTY_LOCAL_CHANNEL,
  NetworkConnectionResponse.JSON_PROPERTY_REMOTE_CHANNEL,
  NetworkConnectionResponse.JSON_PROPERTY_STATUS,
  NetworkConnectionResponse.JSON_PROPERTY_LOCAL_NETWORK_ID,
  NetworkConnectionResponse.JSON_PROPERTY_REMOTE_NETWORK_ID,
  NetworkConnectionResponse.JSON_PROPERTY_ROUTING_POLICY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetworkConnectionResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LOCAL_CHANNEL = "localChannel";
  private NetworkConnectionResponseLocalChannel localChannel;

  public static final String JSON_PROPERTY_REMOTE_CHANNEL = "remoteChannel";
  private NetworkConnectionResponseRemoteChannel remoteChannel;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ConfigChangeRequestStatus status;

  public static final String JSON_PROPERTY_LOCAL_NETWORK_ID = "localNetworkId";
  private NetworkId localNetworkId;

  public static final String JSON_PROPERTY_REMOTE_NETWORK_ID = "remoteNetworkId";
  private NetworkId remoteNetworkId;

  public static final String JSON_PROPERTY_ROUTING_POLICY = "routingPolicy";
  private NetworkConnectionRoutingPolicy routingPolicy;

  public NetworkConnectionResponse() {
  }

  public NetworkConnectionResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public NetworkConnectionResponse localChannel(NetworkConnectionResponseLocalChannel localChannel) {
    
    this.localChannel = localChannel;
    return this;
  }

   /**
   * Get localChannel
   * @return localChannel
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCAL_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkConnectionResponseLocalChannel getLocalChannel() {
    return localChannel;
  }


  @JsonProperty(JSON_PROPERTY_LOCAL_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocalChannel(NetworkConnectionResponseLocalChannel localChannel) {
    this.localChannel = localChannel;
  }


  public NetworkConnectionResponse remoteChannel(NetworkConnectionResponseRemoteChannel remoteChannel) {
    
    this.remoteChannel = remoteChannel;
    return this;
  }

   /**
   * Get remoteChannel
   * @return remoteChannel
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOTE_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkConnectionResponseRemoteChannel getRemoteChannel() {
    return remoteChannel;
  }


  @JsonProperty(JSON_PROPERTY_REMOTE_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemoteChannel(NetworkConnectionResponseRemoteChannel remoteChannel) {
    this.remoteChannel = remoteChannel;
  }


  public NetworkConnectionResponse status(ConfigChangeRequestStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConfigChangeRequestStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(ConfigChangeRequestStatus status) {
    this.status = status;
  }


  public NetworkConnectionResponse localNetworkId(NetworkId localNetworkId) {
    
    this.localNetworkId = localNetworkId;
    return this;
  }

   /**
   * Get localNetworkId
   * @return localNetworkId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCAL_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NetworkId getLocalNetworkId() {
    return localNetworkId;
  }


  @JsonProperty(JSON_PROPERTY_LOCAL_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocalNetworkId(NetworkId localNetworkId) {
    this.localNetworkId = localNetworkId;
  }


  public NetworkConnectionResponse remoteNetworkId(NetworkId remoteNetworkId) {
    
    this.remoteNetworkId = remoteNetworkId;
    return this;
  }

   /**
   * Get remoteNetworkId
   * @return remoteNetworkId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REMOTE_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NetworkId getRemoteNetworkId() {
    return remoteNetworkId;
  }


  @JsonProperty(JSON_PROPERTY_REMOTE_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRemoteNetworkId(NetworkId remoteNetworkId) {
    this.remoteNetworkId = remoteNetworkId;
  }


  public NetworkConnectionResponse routingPolicy(NetworkConnectionRoutingPolicy routingPolicy) {
    
    this.routingPolicy = routingPolicy;
    return this;
  }

   /**
   * Get routingPolicy
   * @return routingPolicy
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROUTING_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NetworkConnectionRoutingPolicy getRoutingPolicy() {
    return routingPolicy;
  }


  @JsonProperty(JSON_PROPERTY_ROUTING_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoutingPolicy(NetworkConnectionRoutingPolicy routingPolicy) {
    this.routingPolicy = routingPolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkConnectionResponse networkConnectionResponse = (NetworkConnectionResponse) o;
    return Objects.equals(this.id, networkConnectionResponse.id) &&
        Objects.equals(this.localChannel, networkConnectionResponse.localChannel) &&
        Objects.equals(this.remoteChannel, networkConnectionResponse.remoteChannel) &&
        Objects.equals(this.status, networkConnectionResponse.status) &&
        Objects.equals(this.localNetworkId, networkConnectionResponse.localNetworkId) &&
        Objects.equals(this.remoteNetworkId, networkConnectionResponse.remoteNetworkId) &&
        Objects.equals(this.routingPolicy, networkConnectionResponse.routingPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, localChannel, remoteChannel, status, localNetworkId, remoteNetworkId, routingPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkConnectionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localChannel: ").append(toIndentedString(localChannel)).append("\n");
    sb.append("    remoteChannel: ").append(toIndentedString(remoteChannel)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    localNetworkId: ").append(toIndentedString(localNetworkId)).append("\n");
    sb.append("    remoteNetworkId: ").append(toIndentedString(remoteNetworkId)).append("\n");
    sb.append("    routingPolicy: ").append(toIndentedString(routingPolicy)).append("\n");
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
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `localChannel` to the URL query string
    if (getLocalChannel() != null) {
      joiner.add(getLocalChannel().toUrlQueryString(prefix + "localChannel" + suffix));
    }

    // add `remoteChannel` to the URL query string
    if (getRemoteChannel() != null) {
      joiner.add(getRemoteChannel().toUrlQueryString(prefix + "remoteChannel" + suffix));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `localNetworkId` to the URL query string
    if (getLocalNetworkId() != null) {
      joiner.add(getLocalNetworkId().toUrlQueryString(prefix + "localNetworkId" + suffix));
    }

    // add `remoteNetworkId` to the URL query string
    if (getRemoteNetworkId() != null) {
      joiner.add(getRemoteNetworkId().toUrlQueryString(prefix + "remoteNetworkId" + suffix));
    }

    // add `routingPolicy` to the URL query string
    if (getRoutingPolicy() != null) {
      joiner.add(getRoutingPolicy().toUrlQueryString(prefix + "routingPolicy" + suffix));
    }

    return joiner.toString();
  }

}

