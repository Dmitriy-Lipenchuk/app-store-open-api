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
import org.openapitools.client.model.GameCenterAchievementReleaseAttributes;
import org.openapitools.client.model.GameCenterDetail;
import org.openapitools.client.model.GameCenterGroup;
import org.openapitools.client.model.GameCenterLeaderboard;
import org.openapitools.client.model.GameCenterLeaderboardLocalization;
import org.openapitools.client.model.GameCenterLeaderboardRelease;
import org.openapitools.client.model.GameCenterLeaderboardReleaseRelationships;
import org.openapitools.client.model.GameCenterLeaderboardSet;
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
@JsonDeserialize(using = GameCenterLeaderboardsResponseIncludedInner.GameCenterLeaderboardsResponseIncludedInnerDeserializer.class)
@JsonSerialize(using = GameCenterLeaderboardsResponseIncludedInner.GameCenterLeaderboardsResponseIncludedInnerSerializer.class)
public class GameCenterLeaderboardsResponseIncludedInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GameCenterLeaderboardsResponseIncludedInner.class.getName());

    public static class GameCenterLeaderboardsResponseIncludedInnerSerializer extends StdSerializer<GameCenterLeaderboardsResponseIncludedInner> {
        public GameCenterLeaderboardsResponseIncludedInnerSerializer(Class<GameCenterLeaderboardsResponseIncludedInner> t) {
            super(t);
        }

        public GameCenterLeaderboardsResponseIncludedInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(GameCenterLeaderboardsResponseIncludedInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class GameCenterLeaderboardsResponseIncludedInnerDeserializer extends StdDeserializer<GameCenterLeaderboardsResponseIncludedInner> {
        public GameCenterLeaderboardsResponseIncludedInnerDeserializer() {
            this(GameCenterLeaderboardsResponseIncludedInner.class);
        }

        public GameCenterLeaderboardsResponseIncludedInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public GameCenterLeaderboardsResponseIncludedInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize GameCenterDetail
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(GameCenterDetail.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'GameCenterDetail'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GameCenterDetail'", e);
            }

            // deserialize GameCenterGroup
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(GameCenterGroup.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'GameCenterGroup'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GameCenterGroup'", e);
            }

            // deserialize GameCenterLeaderboard
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(GameCenterLeaderboard.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'GameCenterLeaderboard'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GameCenterLeaderboard'", e);
            }

            // deserialize GameCenterLeaderboardSet
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(GameCenterLeaderboardSet.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'GameCenterLeaderboardSet'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GameCenterLeaderboardSet'", e);
            }

            // deserialize GameCenterLeaderboardLocalization
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(GameCenterLeaderboardLocalization.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'GameCenterLeaderboardLocalization'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GameCenterLeaderboardLocalization'", e);
            }

            // deserialize GameCenterLeaderboardRelease
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(GameCenterLeaderboardRelease.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'GameCenterLeaderboardRelease'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'GameCenterLeaderboardRelease'", e);
            }

            if (match == 1) {
                GameCenterLeaderboardsResponseIncludedInner ret = new GameCenterLeaderboardsResponseIncludedInner();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for GameCenterLeaderboardsResponseIncludedInner: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public GameCenterLeaderboardsResponseIncludedInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "GameCenterLeaderboardsResponseIncludedInner cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public GameCenterLeaderboardsResponseIncludedInner() {
        super("oneOf", Boolean.FALSE);
    }

    public GameCenterLeaderboardsResponseIncludedInner(GameCenterDetail o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GameCenterLeaderboardsResponseIncludedInner(GameCenterGroup o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GameCenterLeaderboardsResponseIncludedInner(GameCenterLeaderboard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GameCenterLeaderboardsResponseIncludedInner(GameCenterLeaderboardSet o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GameCenterLeaderboardsResponseIncludedInner(GameCenterLeaderboardLocalization o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GameCenterLeaderboardsResponseIncludedInner(GameCenterLeaderboardRelease o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("GameCenterDetail", new GenericType<GameCenterDetail>() {
        });
        schemas.put("GameCenterGroup", new GenericType<GameCenterGroup>() {
        });
        schemas.put("GameCenterLeaderboard", new GenericType<GameCenterLeaderboard>() {
        });
        schemas.put("GameCenterLeaderboardLocalization", new GenericType<GameCenterLeaderboardLocalization>() {
        });
        schemas.put("GameCenterLeaderboardRelease", new GenericType<GameCenterLeaderboardRelease>() {
        });
        schemas.put("GameCenterLeaderboardSet", new GenericType<GameCenterLeaderboardSet>() {
        });
        JSON.registerDescendants(GameCenterLeaderboardsResponseIncludedInner.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GameCenterLeaderboardsResponseIncludedInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * GameCenterDetail, GameCenterGroup, GameCenterLeaderboard, GameCenterLeaderboardLocalization, GameCenterLeaderboardRelease, GameCenterLeaderboardSet
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(GameCenterDetail.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(GameCenterGroup.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(GameCenterLeaderboard.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(GameCenterLeaderboardSet.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(GameCenterLeaderboardLocalization.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(GameCenterLeaderboardRelease.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be GameCenterDetail, GameCenterGroup, GameCenterLeaderboard, GameCenterLeaderboardLocalization, GameCenterLeaderboardRelease, GameCenterLeaderboardSet");
    }

    /**
     * Get the actual instance, which can be the following:
     * GameCenterDetail, GameCenterGroup, GameCenterLeaderboard, GameCenterLeaderboardLocalization, GameCenterLeaderboardRelease, GameCenterLeaderboardSet
     *
     * @return The actual instance (GameCenterDetail, GameCenterGroup, GameCenterLeaderboard, GameCenterLeaderboardLocalization, GameCenterLeaderboardRelease, GameCenterLeaderboardSet)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `GameCenterDetail`. If the actual instance is not `GameCenterDetail`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GameCenterDetail`
     * @throws ClassCastException if the instance is not `GameCenterDetail`
     */
    public GameCenterDetail getGameCenterDetail() throws ClassCastException {
        return (GameCenterDetail)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GameCenterGroup`. If the actual instance is not `GameCenterGroup`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GameCenterGroup`
     * @throws ClassCastException if the instance is not `GameCenterGroup`
     */
    public GameCenterGroup getGameCenterGroup() throws ClassCastException {
        return (GameCenterGroup)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GameCenterLeaderboard`. If the actual instance is not `GameCenterLeaderboard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GameCenterLeaderboard`
     * @throws ClassCastException if the instance is not `GameCenterLeaderboard`
     */
    public GameCenterLeaderboard getGameCenterLeaderboard() throws ClassCastException {
        return (GameCenterLeaderboard)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GameCenterLeaderboardSet`. If the actual instance is not `GameCenterLeaderboardSet`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GameCenterLeaderboardSet`
     * @throws ClassCastException if the instance is not `GameCenterLeaderboardSet`
     */
    public GameCenterLeaderboardSet getGameCenterLeaderboardSet() throws ClassCastException {
        return (GameCenterLeaderboardSet)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GameCenterLeaderboardLocalization`. If the actual instance is not `GameCenterLeaderboardLocalization`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GameCenterLeaderboardLocalization`
     * @throws ClassCastException if the instance is not `GameCenterLeaderboardLocalization`
     */
    public GameCenterLeaderboardLocalization getGameCenterLeaderboardLocalization() throws ClassCastException {
        return (GameCenterLeaderboardLocalization)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GameCenterLeaderboardRelease`. If the actual instance is not `GameCenterLeaderboardRelease`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GameCenterLeaderboardRelease`
     * @throws ClassCastException if the instance is not `GameCenterLeaderboardRelease`
     */
    public GameCenterLeaderboardRelease getGameCenterLeaderboardRelease() throws ClassCastException {
        return (GameCenterLeaderboardRelease)super.getActualInstance();
    }

}

