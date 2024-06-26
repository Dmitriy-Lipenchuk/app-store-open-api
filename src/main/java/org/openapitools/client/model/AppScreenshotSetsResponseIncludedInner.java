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
import org.openapitools.client.model.AppCustomProductPageLocalization;
import org.openapitools.client.model.AppScreenshot;
import org.openapitools.client.model.AppScreenshotAttributes;
import org.openapitools.client.model.AppScreenshotRelationships;
import org.openapitools.client.model.AppStoreVersionExperimentTreatmentLocalization;
import org.openapitools.client.model.AppStoreVersionLocalization;
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
@JsonDeserialize(using = AppScreenshotSetsResponseIncludedInner.AppScreenshotSetsResponseIncludedInnerDeserializer.class)
@JsonSerialize(using = AppScreenshotSetsResponseIncludedInner.AppScreenshotSetsResponseIncludedInnerSerializer.class)
public class AppScreenshotSetsResponseIncludedInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AppScreenshotSetsResponseIncludedInner.class.getName());

    public static class AppScreenshotSetsResponseIncludedInnerSerializer extends StdSerializer<AppScreenshotSetsResponseIncludedInner> {
        public AppScreenshotSetsResponseIncludedInnerSerializer(Class<AppScreenshotSetsResponseIncludedInner> t) {
            super(t);
        }

        public AppScreenshotSetsResponseIncludedInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(AppScreenshotSetsResponseIncludedInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class AppScreenshotSetsResponseIncludedInnerDeserializer extends StdDeserializer<AppScreenshotSetsResponseIncludedInner> {
        public AppScreenshotSetsResponseIncludedInnerDeserializer() {
            this(AppScreenshotSetsResponseIncludedInner.class);
        }

        public AppScreenshotSetsResponseIncludedInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public AppScreenshotSetsResponseIncludedInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize AppStoreVersionLocalization
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AppStoreVersionLocalization.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AppStoreVersionLocalization'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AppStoreVersionLocalization'", e);
            }

            // deserialize AppCustomProductPageLocalization
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AppCustomProductPageLocalization.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AppCustomProductPageLocalization'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AppCustomProductPageLocalization'", e);
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

            // deserialize AppScreenshot
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AppScreenshot.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AppScreenshot'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AppScreenshot'", e);
            }

            if (match == 1) {
                AppScreenshotSetsResponseIncludedInner ret = new AppScreenshotSetsResponseIncludedInner();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for AppScreenshotSetsResponseIncludedInner: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public AppScreenshotSetsResponseIncludedInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "AppScreenshotSetsResponseIncludedInner cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public AppScreenshotSetsResponseIncludedInner() {
        super("oneOf", Boolean.FALSE);
    }

    public AppScreenshotSetsResponseIncludedInner(AppStoreVersionLocalization o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AppScreenshotSetsResponseIncludedInner(AppCustomProductPageLocalization o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AppScreenshotSetsResponseIncludedInner(AppStoreVersionExperimentTreatmentLocalization o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AppScreenshotSetsResponseIncludedInner(AppScreenshot o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AppCustomProductPageLocalization", new GenericType<AppCustomProductPageLocalization>() {
        });
        schemas.put("AppScreenshot", new GenericType<AppScreenshot>() {
        });
        schemas.put("AppStoreVersionExperimentTreatmentLocalization", new GenericType<AppStoreVersionExperimentTreatmentLocalization>() {
        });
        schemas.put("AppStoreVersionLocalization", new GenericType<AppStoreVersionLocalization>() {
        });
        JSON.registerDescendants(AppScreenshotSetsResponseIncludedInner.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return AppScreenshotSetsResponseIncludedInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AppCustomProductPageLocalization, AppScreenshot, AppStoreVersionExperimentTreatmentLocalization, AppStoreVersionLocalization
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(AppStoreVersionLocalization.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AppCustomProductPageLocalization.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AppStoreVersionExperimentTreatmentLocalization.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AppScreenshot.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AppCustomProductPageLocalization, AppScreenshot, AppStoreVersionExperimentTreatmentLocalization, AppStoreVersionLocalization");
    }

    /**
     * Get the actual instance, which can be the following:
     * AppCustomProductPageLocalization, AppScreenshot, AppStoreVersionExperimentTreatmentLocalization, AppStoreVersionLocalization
     *
     * @return The actual instance (AppCustomProductPageLocalization, AppScreenshot, AppStoreVersionExperimentTreatmentLocalization, AppStoreVersionLocalization)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AppStoreVersionLocalization`. If the actual instance is not `AppStoreVersionLocalization`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppStoreVersionLocalization`
     * @throws ClassCastException if the instance is not `AppStoreVersionLocalization`
     */
    public AppStoreVersionLocalization getAppStoreVersionLocalization() throws ClassCastException {
        return (AppStoreVersionLocalization)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AppCustomProductPageLocalization`. If the actual instance is not `AppCustomProductPageLocalization`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppCustomProductPageLocalization`
     * @throws ClassCastException if the instance is not `AppCustomProductPageLocalization`
     */
    public AppCustomProductPageLocalization getAppCustomProductPageLocalization() throws ClassCastException {
        return (AppCustomProductPageLocalization)super.getActualInstance();
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

    /**
     * Get the actual instance of `AppScreenshot`. If the actual instance is not `AppScreenshot`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppScreenshot`
     * @throws ClassCastException if the instance is not `AppScreenshot`
     */
    public AppScreenshot getAppScreenshot() throws ClassCastException {
        return (AppScreenshot)super.getActualInstance();
    }

}

