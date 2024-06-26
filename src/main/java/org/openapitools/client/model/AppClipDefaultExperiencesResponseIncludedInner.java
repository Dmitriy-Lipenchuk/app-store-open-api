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
import org.openapitools.client.model.AppClip;
import org.openapitools.client.model.AppClipAppStoreReviewDetail;
import org.openapitools.client.model.AppClipAppStoreReviewDetailAttributes;
import org.openapitools.client.model.AppClipAppStoreReviewDetailRelationships;
import org.openapitools.client.model.AppClipDefaultExperienceLocalization;
import org.openapitools.client.model.AppStoreVersion;
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
@JsonDeserialize(using = AppClipDefaultExperiencesResponseIncludedInner.AppClipDefaultExperiencesResponseIncludedInnerDeserializer.class)
@JsonSerialize(using = AppClipDefaultExperiencesResponseIncludedInner.AppClipDefaultExperiencesResponseIncludedInnerSerializer.class)
public class AppClipDefaultExperiencesResponseIncludedInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AppClipDefaultExperiencesResponseIncludedInner.class.getName());

    public static class AppClipDefaultExperiencesResponseIncludedInnerSerializer extends StdSerializer<AppClipDefaultExperiencesResponseIncludedInner> {
        public AppClipDefaultExperiencesResponseIncludedInnerSerializer(Class<AppClipDefaultExperiencesResponseIncludedInner> t) {
            super(t);
        }

        public AppClipDefaultExperiencesResponseIncludedInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(AppClipDefaultExperiencesResponseIncludedInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class AppClipDefaultExperiencesResponseIncludedInnerDeserializer extends StdDeserializer<AppClipDefaultExperiencesResponseIncludedInner> {
        public AppClipDefaultExperiencesResponseIncludedInnerDeserializer() {
            this(AppClipDefaultExperiencesResponseIncludedInner.class);
        }

        public AppClipDefaultExperiencesResponseIncludedInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public AppClipDefaultExperiencesResponseIncludedInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize AppClip
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AppClip.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AppClip'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AppClip'", e);
            }

            // deserialize AppStoreVersion
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AppStoreVersion.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AppStoreVersion'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AppStoreVersion'", e);
            }

            // deserialize AppClipDefaultExperienceLocalization
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AppClipDefaultExperienceLocalization.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AppClipDefaultExperienceLocalization'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AppClipDefaultExperienceLocalization'", e);
            }

            // deserialize AppClipAppStoreReviewDetail
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AppClipAppStoreReviewDetail.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AppClipAppStoreReviewDetail'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AppClipAppStoreReviewDetail'", e);
            }

            if (match == 1) {
                AppClipDefaultExperiencesResponseIncludedInner ret = new AppClipDefaultExperiencesResponseIncludedInner();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for AppClipDefaultExperiencesResponseIncludedInner: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public AppClipDefaultExperiencesResponseIncludedInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "AppClipDefaultExperiencesResponseIncludedInner cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public AppClipDefaultExperiencesResponseIncludedInner() {
        super("oneOf", Boolean.FALSE);
    }

    public AppClipDefaultExperiencesResponseIncludedInner(AppClip o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AppClipDefaultExperiencesResponseIncludedInner(AppStoreVersion o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AppClipDefaultExperiencesResponseIncludedInner(AppClipDefaultExperienceLocalization o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AppClipDefaultExperiencesResponseIncludedInner(AppClipAppStoreReviewDetail o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AppClip", new GenericType<AppClip>() {
        });
        schemas.put("AppClipAppStoreReviewDetail", new GenericType<AppClipAppStoreReviewDetail>() {
        });
        schemas.put("AppClipDefaultExperienceLocalization", new GenericType<AppClipDefaultExperienceLocalization>() {
        });
        schemas.put("AppStoreVersion", new GenericType<AppStoreVersion>() {
        });
        JSON.registerDescendants(AppClipDefaultExperiencesResponseIncludedInner.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return AppClipDefaultExperiencesResponseIncludedInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AppClip, AppClipAppStoreReviewDetail, AppClipDefaultExperienceLocalization, AppStoreVersion
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(AppClip.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AppStoreVersion.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AppClipDefaultExperienceLocalization.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(AppClipAppStoreReviewDetail.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AppClip, AppClipAppStoreReviewDetail, AppClipDefaultExperienceLocalization, AppStoreVersion");
    }

    /**
     * Get the actual instance, which can be the following:
     * AppClip, AppClipAppStoreReviewDetail, AppClipDefaultExperienceLocalization, AppStoreVersion
     *
     * @return The actual instance (AppClip, AppClipAppStoreReviewDetail, AppClipDefaultExperienceLocalization, AppStoreVersion)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AppClip`. If the actual instance is not `AppClip`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppClip`
     * @throws ClassCastException if the instance is not `AppClip`
     */
    public AppClip getAppClip() throws ClassCastException {
        return (AppClip)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AppStoreVersion`. If the actual instance is not `AppStoreVersion`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppStoreVersion`
     * @throws ClassCastException if the instance is not `AppStoreVersion`
     */
    public AppStoreVersion getAppStoreVersion() throws ClassCastException {
        return (AppStoreVersion)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AppClipDefaultExperienceLocalization`. If the actual instance is not `AppClipDefaultExperienceLocalization`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppClipDefaultExperienceLocalization`
     * @throws ClassCastException if the instance is not `AppClipDefaultExperienceLocalization`
     */
    public AppClipDefaultExperienceLocalization getAppClipDefaultExperienceLocalization() throws ClassCastException {
        return (AppClipDefaultExperienceLocalization)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AppClipAppStoreReviewDetail`. If the actual instance is not `AppClipAppStoreReviewDetail`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppClipAppStoreReviewDetail`
     * @throws ClassCastException if the instance is not `AppClipAppStoreReviewDetail`
     */
    public AppClipAppStoreReviewDetail getAppClipAppStoreReviewDetail() throws ClassCastException {
        return (AppClipAppStoreReviewDetail)super.getActualInstance();
    }

}

