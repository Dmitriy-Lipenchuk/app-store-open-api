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
import org.openapitools.client.model.AppStoreVersionExperiment;
import org.openapitools.client.model.AppStoreVersionExperimentTreatmentLocalization;
import org.openapitools.client.model.AppStoreVersionExperimentTreatmentLocalizationAttributes;
import org.openapitools.client.model.AppStoreVersionExperimentTreatmentLocalizationRelationships;
import org.openapitools.client.model.AppStoreVersionExperimentV2;
import org.openapitools.client.model.ResourceLinks;
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
@JsonDeserialize(using = AppStoreVersionExperimentTreatmentsResponseIncludedInner.AppStoreVersionExperimentTreatmentsResponseIncludedInnerDeserializer.class)
@JsonSerialize(using = AppStoreVersionExperimentTreatmentsResponseIncludedInner.AppStoreVersionExperimentTreatmentsResponseIncludedInnerSerializer.class)
public class AppStoreVersionExperimentTreatmentsResponseIncludedInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AppStoreVersionExperimentTreatmentsResponseIncludedInner.class.getName());

    public static class AppStoreVersionExperimentTreatmentsResponseIncludedInnerSerializer extends StdSerializer<AppStoreVersionExperimentTreatmentsResponseIncludedInner> {
        public AppStoreVersionExperimentTreatmentsResponseIncludedInnerSerializer(Class<AppStoreVersionExperimentTreatmentsResponseIncludedInner> t) {
            super(t);
        }

        public AppStoreVersionExperimentTreatmentsResponseIncludedInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(AppStoreVersionExperimentTreatmentsResponseIncludedInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class AppStoreVersionExperimentTreatmentsResponseIncludedInnerDeserializer extends StdDeserializer<AppStoreVersionExperimentTreatmentsResponseIncludedInner> {
        public AppStoreVersionExperimentTreatmentsResponseIncludedInnerDeserializer() {
            this(AppStoreVersionExperimentTreatmentsResponseIncludedInner.class);
        }

        public AppStoreVersionExperimentTreatmentsResponseIncludedInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public AppStoreVersionExperimentTreatmentsResponseIncludedInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize AppStoreVersionExperiment
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AppStoreVersionExperiment.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AppStoreVersionExperiment'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AppStoreVersionExperiment'", e);
            }

            // deserialize AppStoreVersionExperimentV2
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AppStoreVersionExperimentV2.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AppStoreVersionExperimentV2'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AppStoreVersionExperimentV2'", e);
            }

            // deserialize AppStoreVersionExperimentTreatmentLocalization
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AppStoreVersionExperimentTreatmentLocalization.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AppStoreVersionExperimentTreatmentLocalization'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AppStoreVersionExperimentTreatmentLocalization'", e);
            }

            if (match == 1) {
                AppStoreVersionExperimentTreatmentsResponseIncludedInner ret = new AppStoreVersionExperimentTreatmentsResponseIncludedInner();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for AppStoreVersionExperimentTreatmentsResponseIncludedInner: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public AppStoreVersionExperimentTreatmentsResponseIncludedInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "AppStoreVersionExperimentTreatmentsResponseIncludedInner cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public AppStoreVersionExperimentTreatmentsResponseIncludedInner() {
        super("oneOf", Boolean.FALSE);
    }

    public AppStoreVersionExperimentTreatmentsResponseIncludedInner(AppStoreVersionExperiment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AppStoreVersionExperimentTreatmentsResponseIncludedInner(AppStoreVersionExperimentV2 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AppStoreVersionExperimentTreatmentsResponseIncludedInner(AppStoreVersionExperimentTreatmentLocalization o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AppStoreVersionExperiment", new GenericType<AppStoreVersionExperiment>() {
        });
        schemas.put("AppStoreVersionExperimentTreatmentLocalization", new GenericType<AppStoreVersionExperimentTreatmentLocalization>() {
        });
        schemas.put("AppStoreVersionExperimentV2", new GenericType<AppStoreVersionExperimentV2>() {
        });
        JSON.registerDescendants(AppStoreVersionExperimentTreatmentsResponseIncludedInner.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return AppStoreVersionExperimentTreatmentsResponseIncludedInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AppStoreVersionExperiment, AppStoreVersionExperimentTreatmentLocalization, AppStoreVersionExperimentV2
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(AppStoreVersionExperiment.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AppStoreVersionExperimentV2.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AppStoreVersionExperimentTreatmentLocalization.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AppStoreVersionExperiment, AppStoreVersionExperimentTreatmentLocalization, AppStoreVersionExperimentV2");
    }

    /**
     * Get the actual instance, which can be the following:
     * AppStoreVersionExperiment, AppStoreVersionExperimentTreatmentLocalization, AppStoreVersionExperimentV2
     *
     * @return The actual instance (AppStoreVersionExperiment, AppStoreVersionExperimentTreatmentLocalization, AppStoreVersionExperimentV2)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AppStoreVersionExperiment`. If the actual instance is not `AppStoreVersionExperiment`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppStoreVersionExperiment`
     * @throws ClassCastException if the instance is not `AppStoreVersionExperiment`
     */
    public AppStoreVersionExperiment getAppStoreVersionExperiment() throws ClassCastException {
        return (AppStoreVersionExperiment)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AppStoreVersionExperimentV2`. If the actual instance is not `AppStoreVersionExperimentV2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppStoreVersionExperimentV2`
     * @throws ClassCastException if the instance is not `AppStoreVersionExperimentV2`
     */
    public AppStoreVersionExperimentV2 getAppStoreVersionExperimentV2() throws ClassCastException {
        return (AppStoreVersionExperimentV2)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AppStoreVersionExperimentTreatmentLocalization`. If the actual instance is not `AppStoreVersionExperimentTreatmentLocalization`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppStoreVersionExperimentTreatmentLocalization`
     * @throws ClassCastException if the instance is not `AppStoreVersionExperimentTreatmentLocalization`
     */
    public AppStoreVersionExperimentTreatmentLocalization getAppStoreVersionExperimentTreatmentLocalization() throws ClassCastException {
        return (AppStoreVersionExperimentTreatmentLocalization)super.getActualInstance();
    }

}
