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
import org.openapitools.client.model.AppEvent;
import org.openapitools.client.model.AppEventScreenshot;
import org.openapitools.client.model.AppEventScreenshotRelationships;
import org.openapitools.client.model.AppEventVideoClip;
import org.openapitools.client.model.AppEventVideoClipAttributes;
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
@JsonDeserialize(using = AppEventLocalizationsResponseIncludedInner.AppEventLocalizationsResponseIncludedInnerDeserializer.class)
@JsonSerialize(using = AppEventLocalizationsResponseIncludedInner.AppEventLocalizationsResponseIncludedInnerSerializer.class)
public class AppEventLocalizationsResponseIncludedInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AppEventLocalizationsResponseIncludedInner.class.getName());

    public static class AppEventLocalizationsResponseIncludedInnerSerializer extends StdSerializer<AppEventLocalizationsResponseIncludedInner> {
        public AppEventLocalizationsResponseIncludedInnerSerializer(Class<AppEventLocalizationsResponseIncludedInner> t) {
            super(t);
        }

        public AppEventLocalizationsResponseIncludedInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(AppEventLocalizationsResponseIncludedInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class AppEventLocalizationsResponseIncludedInnerDeserializer extends StdDeserializer<AppEventLocalizationsResponseIncludedInner> {
        public AppEventLocalizationsResponseIncludedInnerDeserializer() {
            this(AppEventLocalizationsResponseIncludedInner.class);
        }

        public AppEventLocalizationsResponseIncludedInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public AppEventLocalizationsResponseIncludedInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize AppEvent
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AppEvent.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AppEvent'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AppEvent'", e);
            }

            // deserialize AppEventScreenshot
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AppEventScreenshot.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AppEventScreenshot'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AppEventScreenshot'", e);
            }

            // deserialize AppEventVideoClip
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AppEventVideoClip.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AppEventVideoClip'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AppEventVideoClip'", e);
            }

            if (match == 1) {
                AppEventLocalizationsResponseIncludedInner ret = new AppEventLocalizationsResponseIncludedInner();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for AppEventLocalizationsResponseIncludedInner: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public AppEventLocalizationsResponseIncludedInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "AppEventLocalizationsResponseIncludedInner cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public AppEventLocalizationsResponseIncludedInner() {
        super("oneOf", Boolean.FALSE);
    }

    public AppEventLocalizationsResponseIncludedInner(AppEvent o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AppEventLocalizationsResponseIncludedInner(AppEventScreenshot o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AppEventLocalizationsResponseIncludedInner(AppEventVideoClip o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AppEvent", new GenericType<AppEvent>() {
        });
        schemas.put("AppEventScreenshot", new GenericType<AppEventScreenshot>() {
        });
        schemas.put("AppEventVideoClip", new GenericType<AppEventVideoClip>() {
        });
        JSON.registerDescendants(AppEventLocalizationsResponseIncludedInner.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return AppEventLocalizationsResponseIncludedInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AppEvent, AppEventScreenshot, AppEventVideoClip
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(AppEvent.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AppEventScreenshot.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AppEventVideoClip.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AppEvent, AppEventScreenshot, AppEventVideoClip");
    }

    /**
     * Get the actual instance, which can be the following:
     * AppEvent, AppEventScreenshot, AppEventVideoClip
     *
     * @return The actual instance (AppEvent, AppEventScreenshot, AppEventVideoClip)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AppEvent`. If the actual instance is not `AppEvent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppEvent`
     * @throws ClassCastException if the instance is not `AppEvent`
     */
    public AppEvent getAppEvent() throws ClassCastException {
        return (AppEvent)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AppEventScreenshot`. If the actual instance is not `AppEventScreenshot`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppEventScreenshot`
     * @throws ClassCastException if the instance is not `AppEventScreenshot`
     */
    public AppEventScreenshot getAppEventScreenshot() throws ClassCastException {
        return (AppEventScreenshot)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AppEventVideoClip`. If the actual instance is not `AppEventVideoClip`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppEventVideoClip`
     * @throws ClassCastException if the instance is not `AppEventVideoClip`
     */
    public AppEventVideoClip getAppEventVideoClip() throws ClassCastException {
        return (AppEventVideoClip)super.getActualInstance();
    }

}

