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
import com.fireblocks.sdk.model.CustomFiatRoutingDest;
import com.fireblocks.sdk.model.DefaultNetworkRoutingDest;
import com.fireblocks.sdk.model.NoneNetworkRoutingDest;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireblocks.sdk.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
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
import com.fasterxml.jackson.core.type.TypeReference;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using = NetworkConnectionRoutingPolicySignet.NetworkConnectionRoutingPolicySignetDeserializer.class)
@JsonSerialize(using = NetworkConnectionRoutingPolicySignet.NetworkConnectionRoutingPolicySignetSerializer.class)
public class NetworkConnectionRoutingPolicySignet extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(NetworkConnectionRoutingPolicySignet.class.getName());

    public static class NetworkConnectionRoutingPolicySignetSerializer extends StdSerializer<NetworkConnectionRoutingPolicySignet> {
        public NetworkConnectionRoutingPolicySignetSerializer(Class<NetworkConnectionRoutingPolicySignet> t) {
            super(t);
        }

        public NetworkConnectionRoutingPolicySignetSerializer() {
            this(null);
        }

        @Override
        public void serialize(NetworkConnectionRoutingPolicySignet value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class NetworkConnectionRoutingPolicySignetDeserializer extends StdDeserializer<NetworkConnectionRoutingPolicySignet> {
        public NetworkConnectionRoutingPolicySignetDeserializer() {
            this(NetworkConnectionRoutingPolicySignet.class);
        }

        public NetworkConnectionRoutingPolicySignetDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public NetworkConnectionRoutingPolicySignet deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CustomFiatRoutingDest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CustomFiatRoutingDest.class.equals(Integer.class) || CustomFiatRoutingDest.class.equals(Long.class) || CustomFiatRoutingDest.class.equals(Float.class) || CustomFiatRoutingDest.class.equals(Double.class) || CustomFiatRoutingDest.class.equals(Boolean.class) || CustomFiatRoutingDest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CustomFiatRoutingDest.class.equals(Integer.class) || CustomFiatRoutingDest.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CustomFiatRoutingDest.class.equals(Float.class) || CustomFiatRoutingDest.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CustomFiatRoutingDest.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CustomFiatRoutingDest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CustomFiatRoutingDest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CustomFiatRoutingDest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CustomFiatRoutingDest'", e);
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
                NetworkConnectionRoutingPolicySignet ret = new NetworkConnectionRoutingPolicySignet();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for NetworkConnectionRoutingPolicySignet: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public NetworkConnectionRoutingPolicySignet getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "NetworkConnectionRoutingPolicySignet cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public NetworkConnectionRoutingPolicySignet() {
        super("oneOf", Boolean.FALSE);
    }

    public NetworkConnectionRoutingPolicySignet(CustomFiatRoutingDest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NetworkConnectionRoutingPolicySignet(DefaultNetworkRoutingDest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NetworkConnectionRoutingPolicySignet(NoneNetworkRoutingDest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CustomFiatRoutingDest", new GenericType<CustomFiatRoutingDest>() {
        });
        schemas.put("DefaultNetworkRoutingDest", new GenericType<DefaultNetworkRoutingDest>() {
        });
        schemas.put("NoneNetworkRoutingDest", new GenericType<NoneNetworkRoutingDest>() {
        });
        JSON.registerDescendants(NetworkConnectionRoutingPolicySignet.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return NetworkConnectionRoutingPolicySignet.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CustomFiatRoutingDest, DefaultNetworkRoutingDest, NoneNetworkRoutingDest
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CustomFiatRoutingDest.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(DefaultNetworkRoutingDest.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(NoneNetworkRoutingDest.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CustomFiatRoutingDest, DefaultNetworkRoutingDest, NoneNetworkRoutingDest");
    }

    /**
     * Get the actual instance, which can be the following:
     * CustomFiatRoutingDest, DefaultNetworkRoutingDest, NoneNetworkRoutingDest
     *
     * @return The actual instance (CustomFiatRoutingDest, DefaultNetworkRoutingDest, NoneNetworkRoutingDest)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CustomFiatRoutingDest`. If the actual instance is not `CustomFiatRoutingDest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CustomFiatRoutingDest`
     * @throws ClassCastException if the instance is not `CustomFiatRoutingDest`
     */
    public CustomFiatRoutingDest getCustomFiatRoutingDest() throws ClassCastException {
        return (CustomFiatRoutingDest)super.getActualInstance();
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

}

