/*
 * App Store Connect API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.client.model.ResourceLinks;
import org.openapitools.client.model.ScmGitReference;
import org.openapitools.client.model.ScmGitReferenceAttributes;
import org.openapitools.client.model.ScmGitReferenceRelationships;
import org.openapitools.client.model.ScmProvider;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
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
import org.openapitools.client.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
@JsonDeserialize(using = ScmRepositoriesResponseIncludedInner.ScmRepositoriesResponseIncludedInnerDeserializer.class)
@JsonSerialize(using = ScmRepositoriesResponseIncludedInner.ScmRepositoriesResponseIncludedInnerSerializer.class)
public class ScmRepositoriesResponseIncludedInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ScmRepositoriesResponseIncludedInner.class.getName());

    public static class ScmRepositoriesResponseIncludedInnerSerializer extends StdSerializer<ScmRepositoriesResponseIncludedInner> {
        public ScmRepositoriesResponseIncludedInnerSerializer(Class<ScmRepositoriesResponseIncludedInner> t) {
            super(t);
        }

        public ScmRepositoriesResponseIncludedInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(ScmRepositoriesResponseIncludedInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ScmRepositoriesResponseIncludedInnerDeserializer extends StdDeserializer<ScmRepositoriesResponseIncludedInner> {
        public ScmRepositoriesResponseIncludedInnerDeserializer() {
            this(ScmRepositoriesResponseIncludedInner.class);
        }

        public ScmRepositoriesResponseIncludedInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ScmRepositoriesResponseIncludedInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ScmProvider
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ScmProvider.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ScmProvider'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ScmProvider'", e);
            }

            // deserialize ScmGitReference
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ScmGitReference.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ScmGitReference'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ScmGitReference'", e);
            }

            if (match == 1) {
                ScmRepositoriesResponseIncludedInner ret = new ScmRepositoriesResponseIncludedInner();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for ScmRepositoriesResponseIncludedInner: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public ScmRepositoriesResponseIncludedInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ScmRepositoriesResponseIncludedInner cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public ScmRepositoriesResponseIncludedInner() {
        super("oneOf", Boolean.FALSE);
    }

    public ScmRepositoriesResponseIncludedInner(ScmProvider o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ScmRepositoriesResponseIncludedInner(ScmGitReference o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ScmGitReference", new GenericType<ScmGitReference>() {
        });
        schemas.put("ScmProvider", new GenericType<ScmProvider>() {
        });
        JSON.registerDescendants(ScmRepositoriesResponseIncludedInner.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ScmRepositoriesResponseIncludedInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ScmGitReference, ScmProvider
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(ScmProvider.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(ScmGitReference.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ScmGitReference, ScmProvider");
    }

    /**
     * Get the actual instance, which can be the following:
     * ScmGitReference, ScmProvider
     *
     * @return The actual instance (ScmGitReference, ScmProvider)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ScmProvider`. If the actual instance is not `ScmProvider`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ScmProvider`
     * @throws ClassCastException if the instance is not `ScmProvider`
     */
    public ScmProvider getScmProvider() throws ClassCastException {
        return (ScmProvider)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ScmGitReference`. If the actual instance is not `ScmGitReference`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ScmGitReference`
     * @throws ClassCastException if the instance is not `ScmGitReference`
     */
    public ScmGitReference getScmGitReference() throws ClassCastException {
        return (ScmGitReference)super.getActualInstance();
    }

}

