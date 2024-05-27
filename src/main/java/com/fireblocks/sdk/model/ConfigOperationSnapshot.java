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
import com.fireblocks.sdk.model.ConfigConversionOperationSnapshot;
import com.fireblocks.sdk.model.ConfigDisbursementOperationSnapshot;
import com.fireblocks.sdk.model.ConfigTransferOperationSnapshot;
import com.fireblocks.sdk.model.DisbursementOperationConfigParams;
import com.fireblocks.sdk.model.DisbursementOperationType;
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
@JsonDeserialize(using = ConfigOperationSnapshot.ConfigOperationSnapshotDeserializer.class)
@JsonSerialize(using = ConfigOperationSnapshot.ConfigOperationSnapshotSerializer.class)
public class ConfigOperationSnapshot extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ConfigOperationSnapshot.class.getName());

    public static class ConfigOperationSnapshotSerializer extends StdSerializer<ConfigOperationSnapshot> {
        public ConfigOperationSnapshotSerializer(Class<ConfigOperationSnapshot> t) {
            super(t);
        }

        public ConfigOperationSnapshotSerializer() {
            this(null);
        }

        @Override
        public void serialize(ConfigOperationSnapshot value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ConfigOperationSnapshotDeserializer extends StdDeserializer<ConfigOperationSnapshot> {
        public ConfigOperationSnapshotDeserializer() {
            this(ConfigOperationSnapshot.class);
        }

        public ConfigOperationSnapshotDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ConfigOperationSnapshot deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ConfigConversionOperationSnapshot
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ConfigConversionOperationSnapshot.class.equals(Integer.class) || ConfigConversionOperationSnapshot.class.equals(Long.class) || ConfigConversionOperationSnapshot.class.equals(Float.class) || ConfigConversionOperationSnapshot.class.equals(Double.class) || ConfigConversionOperationSnapshot.class.equals(Boolean.class) || ConfigConversionOperationSnapshot.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ConfigConversionOperationSnapshot.class.equals(Integer.class) || ConfigConversionOperationSnapshot.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ConfigConversionOperationSnapshot.class.equals(Float.class) || ConfigConversionOperationSnapshot.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ConfigConversionOperationSnapshot.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ConfigConversionOperationSnapshot.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ConfigConversionOperationSnapshot.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ConfigConversionOperationSnapshot'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ConfigConversionOperationSnapshot'", e);
            }

            // deserialize ConfigDisbursementOperationSnapshot
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ConfigDisbursementOperationSnapshot.class.equals(Integer.class) || ConfigDisbursementOperationSnapshot.class.equals(Long.class) || ConfigDisbursementOperationSnapshot.class.equals(Float.class) || ConfigDisbursementOperationSnapshot.class.equals(Double.class) || ConfigDisbursementOperationSnapshot.class.equals(Boolean.class) || ConfigDisbursementOperationSnapshot.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ConfigDisbursementOperationSnapshot.class.equals(Integer.class) || ConfigDisbursementOperationSnapshot.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ConfigDisbursementOperationSnapshot.class.equals(Float.class) || ConfigDisbursementOperationSnapshot.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ConfigDisbursementOperationSnapshot.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ConfigDisbursementOperationSnapshot.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ConfigDisbursementOperationSnapshot.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ConfigDisbursementOperationSnapshot'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ConfigDisbursementOperationSnapshot'", e);
            }

            // deserialize ConfigTransferOperationSnapshot
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ConfigTransferOperationSnapshot.class.equals(Integer.class) || ConfigTransferOperationSnapshot.class.equals(Long.class) || ConfigTransferOperationSnapshot.class.equals(Float.class) || ConfigTransferOperationSnapshot.class.equals(Double.class) || ConfigTransferOperationSnapshot.class.equals(Boolean.class) || ConfigTransferOperationSnapshot.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ConfigTransferOperationSnapshot.class.equals(Integer.class) || ConfigTransferOperationSnapshot.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ConfigTransferOperationSnapshot.class.equals(Float.class) || ConfigTransferOperationSnapshot.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ConfigTransferOperationSnapshot.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ConfigTransferOperationSnapshot.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ConfigTransferOperationSnapshot.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ConfigTransferOperationSnapshot'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ConfigTransferOperationSnapshot'", e);
            }

            if (match == 1) {
                ConfigOperationSnapshot ret = new ConfigOperationSnapshot();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for ConfigOperationSnapshot: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public ConfigOperationSnapshot getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ConfigOperationSnapshot cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public ConfigOperationSnapshot() {
        super("oneOf", Boolean.FALSE);
    }

    public ConfigOperationSnapshot(ConfigConversionOperationSnapshot o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ConfigOperationSnapshot(ConfigDisbursementOperationSnapshot o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ConfigOperationSnapshot(ConfigTransferOperationSnapshot o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ConfigConversionOperationSnapshot", ConfigConversionOperationSnapshot.class);
        schemas.put("ConfigDisbursementOperationSnapshot", ConfigDisbursementOperationSnapshot.class);
        schemas.put("ConfigTransferOperationSnapshot", ConfigTransferOperationSnapshot.class);
        JSON.registerDescendants(ConfigOperationSnapshot.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ConfigOperationSnapshot.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ConfigConversionOperationSnapshot, ConfigDisbursementOperationSnapshot, ConfigTransferOperationSnapshot
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(ConfigConversionOperationSnapshot.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ConfigDisbursementOperationSnapshot.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ConfigTransferOperationSnapshot.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ConfigConversionOperationSnapshot, ConfigDisbursementOperationSnapshot, ConfigTransferOperationSnapshot");
    }

    /**
     * Get the actual instance, which can be the following:
     * ConfigConversionOperationSnapshot, ConfigDisbursementOperationSnapshot, ConfigTransferOperationSnapshot
     *
     * @return The actual instance (ConfigConversionOperationSnapshot, ConfigDisbursementOperationSnapshot, ConfigTransferOperationSnapshot)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConfigConversionOperationSnapshot`. If the actual instance is not `ConfigConversionOperationSnapshot`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConfigConversionOperationSnapshot`
     * @throws ClassCastException if the instance is not `ConfigConversionOperationSnapshot`
     */
    public ConfigConversionOperationSnapshot getConfigConversionOperationSnapshot() throws ClassCastException {
        return (ConfigConversionOperationSnapshot)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConfigDisbursementOperationSnapshot`. If the actual instance is not `ConfigDisbursementOperationSnapshot`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConfigDisbursementOperationSnapshot`
     * @throws ClassCastException if the instance is not `ConfigDisbursementOperationSnapshot`
     */
    public ConfigDisbursementOperationSnapshot getConfigDisbursementOperationSnapshot() throws ClassCastException {
        return (ConfigDisbursementOperationSnapshot)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ConfigTransferOperationSnapshot`. If the actual instance is not `ConfigTransferOperationSnapshot`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ConfigTransferOperationSnapshot`
     * @throws ClassCastException if the instance is not `ConfigTransferOperationSnapshot`
     */
    public ConfigTransferOperationSnapshot getConfigTransferOperationSnapshot() throws ClassCastException {
        return (ConfigTransferOperationSnapshot)super.getActualInstance();
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

    if (getActualInstance() instanceof ConfigConversionOperationSnapshot) {
        if (getActualInstance() != null) {
          joiner.add(((ConfigConversionOperationSnapshot)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof ConfigTransferOperationSnapshot) {
        if (getActualInstance() != null) {
          joiner.add(((ConfigTransferOperationSnapshot)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof ConfigDisbursementOperationSnapshot) {
        if (getActualInstance() != null) {
          joiner.add(((ConfigDisbursementOperationSnapshot)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

