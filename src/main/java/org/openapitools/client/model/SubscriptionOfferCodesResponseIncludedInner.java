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
import org.openapitools.client.model.SubscriptionOfferCodeCustomCode;
import org.openapitools.client.model.SubscriptionOfferCodeCustomCodeAttributes;
import org.openapitools.client.model.SubscriptionOfferCodeOneTimeUseCode;
import org.openapitools.client.model.SubscriptionOfferCodePrice;
import org.openapitools.client.model.SubscriptionOfferCodePriceRelationships;
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
@JsonDeserialize(using = SubscriptionOfferCodesResponseIncludedInner.SubscriptionOfferCodesResponseIncludedInnerDeserializer.class)
@JsonSerialize(using = SubscriptionOfferCodesResponseIncludedInner.SubscriptionOfferCodesResponseIncludedInnerSerializer.class)
public class SubscriptionOfferCodesResponseIncludedInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SubscriptionOfferCodesResponseIncludedInner.class.getName());

    public static class SubscriptionOfferCodesResponseIncludedInnerSerializer extends StdSerializer<SubscriptionOfferCodesResponseIncludedInner> {
        public SubscriptionOfferCodesResponseIncludedInnerSerializer(Class<SubscriptionOfferCodesResponseIncludedInner> t) {
            super(t);
        }

        public SubscriptionOfferCodesResponseIncludedInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(SubscriptionOfferCodesResponseIncludedInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class SubscriptionOfferCodesResponseIncludedInnerDeserializer extends StdDeserializer<SubscriptionOfferCodesResponseIncludedInner> {
        public SubscriptionOfferCodesResponseIncludedInnerDeserializer() {
            this(SubscriptionOfferCodesResponseIncludedInner.class);
        }

        public SubscriptionOfferCodesResponseIncludedInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public SubscriptionOfferCodesResponseIncludedInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
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

            // deserialize SubscriptionOfferCodeOneTimeUseCode
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(SubscriptionOfferCodeOneTimeUseCode.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'SubscriptionOfferCodeOneTimeUseCode'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SubscriptionOfferCodeOneTimeUseCode'", e);
            }

            // deserialize SubscriptionOfferCodeCustomCode
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(SubscriptionOfferCodeCustomCode.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'SubscriptionOfferCodeCustomCode'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SubscriptionOfferCodeCustomCode'", e);
            }

            // deserialize SubscriptionOfferCodePrice
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(SubscriptionOfferCodePrice.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'SubscriptionOfferCodePrice'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SubscriptionOfferCodePrice'", e);
            }

            if (match == 1) {
                SubscriptionOfferCodesResponseIncludedInner ret = new SubscriptionOfferCodesResponseIncludedInner();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for SubscriptionOfferCodesResponseIncludedInner: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public SubscriptionOfferCodesResponseIncludedInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "SubscriptionOfferCodesResponseIncludedInner cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public SubscriptionOfferCodesResponseIncludedInner() {
        super("oneOf", Boolean.FALSE);
    }

    public SubscriptionOfferCodesResponseIncludedInner(Subscription o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SubscriptionOfferCodesResponseIncludedInner(SubscriptionOfferCodeOneTimeUseCode o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SubscriptionOfferCodesResponseIncludedInner(SubscriptionOfferCodeCustomCode o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SubscriptionOfferCodesResponseIncludedInner(SubscriptionOfferCodePrice o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Subscription", new GenericType<Subscription>() {
        });
        schemas.put("SubscriptionOfferCodeCustomCode", new GenericType<SubscriptionOfferCodeCustomCode>() {
        });
        schemas.put("SubscriptionOfferCodeOneTimeUseCode", new GenericType<SubscriptionOfferCodeOneTimeUseCode>() {
        });
        schemas.put("SubscriptionOfferCodePrice", new GenericType<SubscriptionOfferCodePrice>() {
        });
        JSON.registerDescendants(SubscriptionOfferCodesResponseIncludedInner.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SubscriptionOfferCodesResponseIncludedInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Subscription, SubscriptionOfferCodeCustomCode, SubscriptionOfferCodeOneTimeUseCode, SubscriptionOfferCodePrice
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

        if (JSON.isInstanceOf(SubscriptionOfferCodeOneTimeUseCode.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(SubscriptionOfferCodeCustomCode.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(SubscriptionOfferCodePrice.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Subscription, SubscriptionOfferCodeCustomCode, SubscriptionOfferCodeOneTimeUseCode, SubscriptionOfferCodePrice");
    }

    /**
     * Get the actual instance, which can be the following:
     * Subscription, SubscriptionOfferCodeCustomCode, SubscriptionOfferCodeOneTimeUseCode, SubscriptionOfferCodePrice
     *
     * @return The actual instance (Subscription, SubscriptionOfferCodeCustomCode, SubscriptionOfferCodeOneTimeUseCode, SubscriptionOfferCodePrice)
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
     * Get the actual instance of `SubscriptionOfferCodeOneTimeUseCode`. If the actual instance is not `SubscriptionOfferCodeOneTimeUseCode`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SubscriptionOfferCodeOneTimeUseCode`
     * @throws ClassCastException if the instance is not `SubscriptionOfferCodeOneTimeUseCode`
     */
    public SubscriptionOfferCodeOneTimeUseCode getSubscriptionOfferCodeOneTimeUseCode() throws ClassCastException {
        return (SubscriptionOfferCodeOneTimeUseCode)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SubscriptionOfferCodeCustomCode`. If the actual instance is not `SubscriptionOfferCodeCustomCode`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SubscriptionOfferCodeCustomCode`
     * @throws ClassCastException if the instance is not `SubscriptionOfferCodeCustomCode`
     */
    public SubscriptionOfferCodeCustomCode getSubscriptionOfferCodeCustomCode() throws ClassCastException {
        return (SubscriptionOfferCodeCustomCode)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SubscriptionOfferCodePrice`. If the actual instance is not `SubscriptionOfferCodePrice`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SubscriptionOfferCodePrice`
     * @throws ClassCastException if the instance is not `SubscriptionOfferCodePrice`
     */
    public SubscriptionOfferCodePrice getSubscriptionOfferCodePrice() throws ClassCastException {
        return (SubscriptionOfferCodePrice)super.getActualInstance();
    }

}

