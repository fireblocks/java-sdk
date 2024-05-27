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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fireblocks.sdk.model.CustomRoutingDest;
import com.fireblocks.sdk.model.DefaultNetworkRoutingDest;
import com.fireblocks.sdk.model.NoneNetworkRoutingDest;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fireblocks.sdk.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using = NetworkConnectionRoutingPolicyValue.NetworkConnectionRoutingPolicyValueDeserializer.class)
@JsonSerialize(using = NetworkConnectionRoutingPolicyValue.NetworkConnectionRoutingPolicyValueSerializer.class)
public class NetworkConnectionRoutingPolicyValue extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(NetworkConnectionRoutingPolicyValue.class.getName());

    public static class NetworkConnectionRoutingPolicyValueSerializer extends StdSerializer<NetworkConnectionRoutingPolicyValue> {
        public NetworkConnectionRoutingPolicyValueSerializer(Class<NetworkConnectionRoutingPolicyValue> t) {
            super(t);
        }

        public NetworkConnectionRoutingPolicyValueSerializer() {
            this(null);
        }

        @Override
        public void serialize(NetworkConnectionRoutingPolicyValue value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class NetworkConnectionRoutingPolicyValueDeserializer extends StdDeserializer<NetworkConnectionRoutingPolicyValue> {
        public NetworkConnectionRoutingPolicyValueDeserializer() {
            this(NetworkConnectionRoutingPolicyValue.class);
        }

        public NetworkConnectionRoutingPolicyValueDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public NetworkConnectionRoutingPolicyValue deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CustomRoutingDest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CustomRoutingDest.class.equals(Integer.class) || CustomRoutingDest.class.equals(Long.class) || CustomRoutingDest.class.equals(Float.class) || CustomRoutingDest.class.equals(Double.class) || CustomRoutingDest.class.equals(Boolean.class) || CustomRoutingDest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CustomRoutingDest.class.equals(Integer.class) || CustomRoutingDest.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CustomRoutingDest.class.equals(Float.class) || CustomRoutingDest.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CustomRoutingDest.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CustomRoutingDest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CustomRoutingDest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CustomRoutingDest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CustomRoutingDest'", e);
            }

            // deserialize DefaultNetworkRoutingDest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (DefaultNetworkRoutingDest.class.equals(Integer.class) || DefaultNetworkRoutingDest.class.equals(Long.class) || DefaultNetworkRoutingDest.class.equals(Float.class) || DefaultNetworkRoutingDest.class.equals(Double.class) || DefaultNetworkRoutingDest.class.equals(Boolean.class) || DefaultNetworkRoutingDest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((DefaultNetworkRoutingDest.class.equals(Integer.class) || DefaultNetworkRoutingDest.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((DefaultNetworkRoutingDest.class.equals(Float.class) || DefaultNetworkRoutingDest.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (DefaultNetworkRoutingDest.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (DefaultNetworkRoutingDest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(DefaultNetworkRoutingDest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'DefaultNetworkRoutingDest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'DefaultNetworkRoutingDest'", e);
            }

            // deserialize NoneNetworkRoutingDest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (NoneNetworkRoutingDest.class.equals(Integer.class) || NoneNetworkRoutingDest.class.equals(Long.class) || NoneNetworkRoutingDest.class.equals(Float.class) || NoneNetworkRoutingDest.class.equals(Double.class) || NoneNetworkRoutingDest.class.equals(Boolean.class) || NoneNetworkRoutingDest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((NoneNetworkRoutingDest.class.equals(Integer.class) || NoneNetworkRoutingDest.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((NoneNetworkRoutingDest.class.equals(Float.class) || NoneNetworkRoutingDest.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (NoneNetworkRoutingDest.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (NoneNetworkRoutingDest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(NoneNetworkRoutingDest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'NoneNetworkRoutingDest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'NoneNetworkRoutingDest'", e);
            }

            if (match == 1) {
                NetworkConnectionRoutingPolicyValue ret = new NetworkConnectionRoutingPolicyValue();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for NetworkConnectionRoutingPolicyValue: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public NetworkConnectionRoutingPolicyValue getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "NetworkConnectionRoutingPolicyValue cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public NetworkConnectionRoutingPolicyValue() {
        super("oneOf", Boolean.FALSE);
    }

    public NetworkConnectionRoutingPolicyValue(CustomRoutingDest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NetworkConnectionRoutingPolicyValue(DefaultNetworkRoutingDest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NetworkConnectionRoutingPolicyValue(NoneNetworkRoutingDest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CustomRoutingDest", CustomRoutingDest.class);
        schemas.put("DefaultNetworkRoutingDest", DefaultNetworkRoutingDest.class);
        schemas.put("NoneNetworkRoutingDest", NoneNetworkRoutingDest.class);
        JSON.registerDescendants(NetworkConnectionRoutingPolicyValue.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return NetworkConnectionRoutingPolicyValue.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CustomRoutingDest, DefaultNetworkRoutingDest, NoneNetworkRoutingDest
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CustomRoutingDest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(DefaultNetworkRoutingDest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(NoneNetworkRoutingDest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CustomRoutingDest, DefaultNetworkRoutingDest, NoneNetworkRoutingDest");
    }

    /**
     * Get the actual instance, which can be the following:
     * CustomRoutingDest, DefaultNetworkRoutingDest, NoneNetworkRoutingDest
     *
     * @return The actual instance (CustomRoutingDest, DefaultNetworkRoutingDest, NoneNetworkRoutingDest)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomRoutingDest`. If the actual instance is not `CustomRoutingDest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomRoutingDest`
     * @throws ClassCastException if the instance is not `CustomRoutingDest`
     */
    public CustomRoutingDest getCustomRoutingDest() throws ClassCastException {
        return (CustomRoutingDest)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DefaultNetworkRoutingDest`. If the actual instance is not `DefaultNetworkRoutingDest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DefaultNetworkRoutingDest`
     * @throws ClassCastException if the instance is not `DefaultNetworkRoutingDest`
     */
    public DefaultNetworkRoutingDest getDefaultNetworkRoutingDest() throws ClassCastException {
        return (DefaultNetworkRoutingDest)super.getActualInstance();
    }

    /**
     * Get the actual instance of `NoneNetworkRoutingDest`. If the actual instance is not `NoneNetworkRoutingDest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NoneNetworkRoutingDest`
     * @throws ClassCastException if the instance is not `NoneNetworkRoutingDest`
     */
    public NoneNetworkRoutingDest getNoneNetworkRoutingDest() throws ClassCastException {
        return (NoneNetworkRoutingDest)super.getActualInstance();
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

    if (getActualInstance() instanceof CustomRoutingDest) {
        if (getActualInstance() != null) {
          joiner.add(((CustomRoutingDest)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof DefaultNetworkRoutingDest) {
        if (getActualInstance() != null) {
          joiner.add(((DefaultNetworkRoutingDest)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof NoneNetworkRoutingDest) {
        if (getActualInstance() != null) {
          joiner.add(((NoneNetworkRoutingDest)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

