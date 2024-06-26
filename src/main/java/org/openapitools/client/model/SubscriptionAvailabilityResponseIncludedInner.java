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
import org.openapitools.client.model.Subscription;
import org.openapitools.client.model.SubscriptionRelationships;
import org.openapitools.client.model.Territory;
import org.openapitools.client.model.TerritoryAttributes;
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
@JsonDeserialize(using = SubscriptionAvailabilityResponseIncludedInner.SubscriptionAvailabilityResponseIncludedInnerDeserializer.class)
@JsonSerialize(using = SubscriptionAvailabilityResponseIncludedInner.SubscriptionAvailabilityResponseIncludedInnerSerializer.class)
public class SubscriptionAvailabilityResponseIncludedInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SubscriptionAvailabilityResponseIncludedInner.class.getName());

    public static class SubscriptionAvailabilityResponseIncludedInnerSerializer extends StdSerializer<SubscriptionAvailabilityResponseIncludedInner> {
        public SubscriptionAvailabilityResponseIncludedInnerSerializer(Class<SubscriptionAvailabilityResponseIncludedInner> t) {
            super(t);
        }

        public SubscriptionAvailabilityResponseIncludedInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(SubscriptionAvailabilityResponseIncludedInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class SubscriptionAvailabilityResponseIncludedInnerDeserializer extends StdDeserializer<SubscriptionAvailabilityResponseIncludedInner> {
        public SubscriptionAvailabilityResponseIncludedInnerDeserializer() {
            this(SubscriptionAvailabilityResponseIncludedInner.class);
        }

        public SubscriptionAvailabilityResponseIncludedInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public SubscriptionAvailabilityResponseIncludedInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize Subscription
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(Subscription.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Subscription'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Subscription'", e);
            }

            // deserialize Territory
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(Territory.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Territory'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Territory'", e);
            }

            if (match == 1) {
                SubscriptionAvailabilityResponseIncludedInner ret = new SubscriptionAvailabilityResponseIncludedInner();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for SubscriptionAvailabilityResponseIncludedInner: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public SubscriptionAvailabilityResponseIncludedInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "SubscriptionAvailabilityResponseIncludedInner cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public SubscriptionAvailabilityResponseIncludedInner() {
        super("oneOf", Boolean.FALSE);
    }

    public SubscriptionAvailabilityResponseIncludedInner(Subscription o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SubscriptionAvailabilityResponseIncludedInner(Territory o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Subscription", new GenericType<Subscription>() {
        });
        schemas.put("Territory", new GenericType<Territory>() {
        });
        JSON.registerDescendants(SubscriptionAvailabilityResponseIncludedInner.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SubscriptionAvailabilityResponseIncludedInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Subscription, Territory
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(Subscription.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(Territory.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Subscription, Territory");
    }

    /**
     * Get the actual instance, which can be the following:
     * Subscription, Territory
     *
     * @return The actual instance (Subscription, Territory)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Subscription`. If the actual instance is not `Subscription`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Subscription`
     * @throws ClassCastException if the instance is not `Subscription`
     */
    public Subscription getSubscription() throws ClassCastException {
        return (Subscription)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Territory`. If the actual instance is not `Territory`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Territory`
     * @throws ClassCastException if the instance is not `Territory`
     */
    public Territory getTerritory() throws ClassCastException {
        return (Territory)super.getActualInstance();
    }

}
