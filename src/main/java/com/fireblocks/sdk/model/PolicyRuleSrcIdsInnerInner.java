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
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fireblocks.sdk.model.PolicySrcOrDestSubType;
import com.fireblocks.sdk.model.PolicySrcOrDestType;
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
@JsonDeserialize(using = PolicyRuleSrcIdsInnerInner.PolicyRuleSrcIdsInnerInnerDeserializer.class)
@JsonSerialize(using = PolicyRuleSrcIdsInnerInner.PolicyRuleSrcIdsInnerInnerSerializer.class)
public class PolicyRuleSrcIdsInnerInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PolicyRuleSrcIdsInnerInner.class.getName());

    public static class PolicyRuleSrcIdsInnerInnerSerializer extends StdSerializer<PolicyRuleSrcIdsInnerInner> {
        public PolicyRuleSrcIdsInnerInnerSerializer(Class<PolicyRuleSrcIdsInnerInner> t) {
            super(t);
        }

        public PolicyRuleSrcIdsInnerInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(PolicyRuleSrcIdsInnerInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class PolicyRuleSrcIdsInnerInnerDeserializer extends StdDeserializer<PolicyRuleSrcIdsInnerInner> {
        public PolicyRuleSrcIdsInnerInnerDeserializer() {
            this(PolicyRuleSrcIdsInnerInner.class);
        }

        public PolicyRuleSrcIdsInnerInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public PolicyRuleSrcIdsInnerInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize PolicySrcOrDestSubType
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PolicySrcOrDestSubType.class.equals(Integer.class) || PolicySrcOrDestSubType.class.equals(Long.class) || PolicySrcOrDestSubType.class.equals(Float.class) || PolicySrcOrDestSubType.class.equals(Double.class) || PolicySrcOrDestSubType.class.equals(Boolean.class) || PolicySrcOrDestSubType.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PolicySrcOrDestSubType.class.equals(Integer.class) || PolicySrcOrDestSubType.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PolicySrcOrDestSubType.class.equals(Float.class) || PolicySrcOrDestSubType.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PolicySrcOrDestSubType.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PolicySrcOrDestSubType.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PolicySrcOrDestSubType.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PolicySrcOrDestSubType'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PolicySrcOrDestSubType'", e);
            }

            // deserialize PolicySrcOrDestType
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PolicySrcOrDestType.class.equals(Integer.class) || PolicySrcOrDestType.class.equals(Long.class) || PolicySrcOrDestType.class.equals(Float.class) || PolicySrcOrDestType.class.equals(Double.class) || PolicySrcOrDestType.class.equals(Boolean.class) || PolicySrcOrDestType.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PolicySrcOrDestType.class.equals(Integer.class) || PolicySrcOrDestType.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PolicySrcOrDestType.class.equals(Float.class) || PolicySrcOrDestType.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PolicySrcOrDestType.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PolicySrcOrDestType.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PolicySrcOrDestType.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PolicySrcOrDestType'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PolicySrcOrDestType'", e);
            }

            // deserialize String
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (String.class.equals(Integer.class) || String.class.equals(Long.class) || String.class.equals(Float.class) || String.class.equals(Double.class) || String.class.equals(Boolean.class) || String.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((String.class.equals(Integer.class) || String.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((String.class.equals(Float.class) || String.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (String.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (String.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(String.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'String'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'String'", e);
            }

            if (match == 1) {
                PolicyRuleSrcIdsInnerInner ret = new PolicyRuleSrcIdsInnerInner();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for PolicyRuleSrcIdsInnerInner: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public PolicyRuleSrcIdsInnerInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "PolicyRuleSrcIdsInnerInner cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public PolicyRuleSrcIdsInnerInner() {
        super("oneOf", Boolean.FALSE);
    }

    public PolicyRuleSrcIdsInnerInner(PolicySrcOrDestSubType o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PolicyRuleSrcIdsInnerInner(PolicySrcOrDestType o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PolicyRuleSrcIdsInnerInner(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PolicySrcOrDestSubType", new GenericType<PolicySrcOrDestSubType>() {
        });
        schemas.put("PolicySrcOrDestType", new GenericType<PolicySrcOrDestType>() {
        });
        schemas.put("String", new GenericType<String>() {
        });
        JSON.registerDescendants(PolicyRuleSrcIdsInnerInner.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return PolicyRuleSrcIdsInnerInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * PolicySrcOrDestSubType, PolicySrcOrDestType, String
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(PolicySrcOrDestSubType.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(PolicySrcOrDestType.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(String.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PolicySrcOrDestSubType, PolicySrcOrDestType, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * PolicySrcOrDestSubType, PolicySrcOrDestType, String
     *
     * @return The actual instance (PolicySrcOrDestSubType, PolicySrcOrDestType, String)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PolicySrcOrDestSubType`. If the actual instance is not `PolicySrcOrDestSubType`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PolicySrcOrDestSubType`
     * @throws ClassCastException if the instance is not `PolicySrcOrDestSubType`
     */
    public PolicySrcOrDestSubType getPolicySrcOrDestSubType() throws ClassCastException {
        return (PolicySrcOrDestSubType)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PolicySrcOrDestType`. If the actual instance is not `PolicySrcOrDestType`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PolicySrcOrDestType`
     * @throws ClassCastException if the instance is not `PolicySrcOrDestType`
     */
    public PolicySrcOrDestType getPolicySrcOrDestType() throws ClassCastException {
        return (PolicySrcOrDestType)super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }

}

