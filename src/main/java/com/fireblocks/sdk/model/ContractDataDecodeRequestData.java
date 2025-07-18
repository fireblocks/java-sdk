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
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringJoiner;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(
        using = ContractDataDecodeRequestData.ContractDataDecodeRequestDataDeserializer.class)
@JsonSerialize(using = ContractDataDecodeRequestData.ContractDataDecodeRequestDataSerializer.class)
public class ContractDataDecodeRequestData extends AbstractOpenApiSchema {
    private static final Logger log =
            Logger.getLogger(ContractDataDecodeRequestData.class.getName());

    public static class ContractDataDecodeRequestDataSerializer
            extends StdSerializer<ContractDataDecodeRequestData> {
        public ContractDataDecodeRequestDataSerializer(Class<ContractDataDecodeRequestData> t) {
            super(t);
        }

        public ContractDataDecodeRequestDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(
                ContractDataDecodeRequestData value,
                JsonGenerator jgen,
                SerializerProvider provider)
                throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ContractDataDecodeRequestDataDeserializer
            extends StdDeserializer<ContractDataDecodeRequestData> {
        public ContractDataDecodeRequestDataDeserializer() {
            this(ContractDataDecodeRequestData.class);
        }

        public ContractDataDecodeRequestDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ContractDataDecodeRequestData deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ContractDataLogDataParam
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ContractDataLogDataParam.class.equals(Integer.class)
                        || ContractDataLogDataParam.class.equals(Long.class)
                        || ContractDataLogDataParam.class.equals(Float.class)
                        || ContractDataLogDataParam.class.equals(Double.class)
                        || ContractDataLogDataParam.class.equals(Boolean.class)
                        || ContractDataLogDataParam.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |=
                                ((ContractDataLogDataParam.class.equals(Integer.class)
                                                || ContractDataLogDataParam.class.equals(
                                                        Long.class))
                                        && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |=
                                ((ContractDataLogDataParam.class.equals(Float.class)
                                                || ContractDataLogDataParam.class.equals(
                                                        Double.class))
                                        && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |=
                                (ContractDataLogDataParam.class.equals(Boolean.class)
                                        && (token == JsonToken.VALUE_FALSE
                                                || token == JsonToken.VALUE_TRUE));
                        attemptParsing |=
                                (ContractDataLogDataParam.class.equals(String.class)
                                        && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized =
                            tree.traverse(jp.getCodec())
                                    .readValueAs(ContractDataLogDataParam.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ContractDataLogDataParam'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(
                        Level.FINER,
                        "Input data does not match schema 'ContractDataLogDataParam'",
                        e);
            }

            // deserialize String
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (String.class.equals(Integer.class)
                        || String.class.equals(Long.class)
                        || String.class.equals(Float.class)
                        || String.class.equals(Double.class)
                        || String.class.equals(Boolean.class)
                        || String.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |=
                                ((String.class.equals(Integer.class)
                                                || String.class.equals(Long.class))
                                        && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |=
                                ((String.class.equals(Float.class)
                                                || String.class.equals(Double.class))
                                        && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |=
                                (String.class.equals(Boolean.class)
                                        && (token == JsonToken.VALUE_FALSE
                                                || token == JsonToken.VALUE_TRUE));
                        attemptParsing |=
                                (String.class.equals(String.class)
                                        && token == JsonToken.VALUE_STRING);
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
                ContractDataDecodeRequestData ret = new ContractDataDecodeRequestData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(
                    String.format(
                            "Failed deserialization for ContractDataDecodeRequestData: %d classes"
                                    + " match result, expected 1",
                            match));
        }

        /** Handle deserialization of the 'null' value. */
        @Override
        public ContractDataDecodeRequestData getNullValue(DeserializationContext ctxt)
                throws JsonMappingException {
            throw new JsonMappingException(
                    ctxt.getParser(), "ContractDataDecodeRequestData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public ContractDataDecodeRequestData() {
        super("oneOf", Boolean.FALSE);
    }

    public ContractDataDecodeRequestData(ContractDataLogDataParam o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ContractDataDecodeRequestData(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ContractDataLogDataParam", ContractDataLogDataParam.class);
        schemas.put("String", String.class);
        JSON.registerDescendants(
                ContractDataDecodeRequestData.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ContractDataDecodeRequestData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check the instance parameter is valid
     * against the oneOf child schemas: ContractDataLogDataParam, String
     *
     * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be
     * a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(ContractDataLogDataParam.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(String.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException(
                "Invalid instance type. Must be ContractDataLogDataParam, String");
    }

    /**
     * Get the actual instance, which can be the following: ContractDataLogDataParam, String
     *
     * @return The actual instance (ContractDataLogDataParam, String)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContractDataLogDataParam`. If the actual instance is not
     * `ContractDataLogDataParam`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContractDataLogDataParam`
     * @throws ClassCastException if the instance is not `ContractDataLogDataParam`
     */
    public ContractDataLogDataParam getContractDataLogDataParam() throws ClassCastException {
        return (ContractDataLogDataParam) super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`, the
     * ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String) super.getActualInstance();
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

        if (getActualInstance() instanceof String) {
            if (getActualInstance() != null) {
                joiner.add(
                        String.format(
                                "%sone_of_0%s=%s",
                                prefix,
                                suffix,
                                URLEncoder.encode(
                                                String.valueOf(getActualInstance()),
                                                StandardCharsets.UTF_8)
                                        .replaceAll("\\+", "%20")));
            }
            return joiner.toString();
        }
        if (getActualInstance() instanceof ContractDataLogDataParam) {
            if (getActualInstance() != null) {
                joiner.add(
                        ((ContractDataLogDataParam) getActualInstance())
                                .toUrlQueryString(prefix + "one_of_1" + suffix));
            }
            return joiner.toString();
        }
        return null;
    }
}
