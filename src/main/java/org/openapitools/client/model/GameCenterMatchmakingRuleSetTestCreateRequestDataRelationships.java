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
import org.openapitools.client.model.GameCenterMatchmakingQueueCreateRequestDataRelationshipsRuleSet;
import org.openapitools.client.model.GameCenterMatchmakingRuleSetTestCreateRequestDataRelationshipsMatchmakingRequests;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * GameCenterMatchmakingRuleSetTestCreateRequestDataRelationships
 */
@JsonPropertyOrder({
  GameCenterMatchmakingRuleSetTestCreateRequestDataRelationships.JSON_PROPERTY_MATCHMAKING_RULE_SET,
  GameCenterMatchmakingRuleSetTestCreateRequestDataRelationships.JSON_PROPERTY_MATCHMAKING_REQUESTS
})
@JsonTypeName("GameCenterMatchmakingRuleSetTestCreateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterMatchmakingRuleSetTestCreateRequestDataRelationships {
  public static final String JSON_PROPERTY_MATCHMAKING_RULE_SET = "matchmakingRuleSet";
  private GameCenterMatchmakingQueueCreateRequestDataRelationshipsRuleSet matchmakingRuleSet;

  public static final String JSON_PROPERTY_MATCHMAKING_REQUESTS = "matchmakingRequests";
  private GameCenterMatchmakingRuleSetTestCreateRequestDataRelationshipsMatchmakingRequests matchmakingRequests;

  public GameCenterMatchmakingRuleSetTestCreateRequestDataRelationships() { 
  }

  public GameCenterMatchmakingRuleSetTestCreateRequestDataRelationships matchmakingRuleSet(GameCenterMatchmakingQueueCreateRequestDataRelationshipsRuleSet matchmakingRuleSet) {
    this.matchmakingRuleSet = matchmakingRuleSet;
    return this;
  }

   /**
   * Get matchmakingRuleSet
   * @return matchmakingRuleSet
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MATCHMAKING_RULE_SET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GameCenterMatchmakingQueueCreateRequestDataRelationshipsRuleSet getMatchmakingRuleSet() {
    return matchmakingRuleSet;
  }


  @JsonProperty(JSON_PROPERTY_MATCHMAKING_RULE_SET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMatchmakingRuleSet(GameCenterMatchmakingQueueCreateRequestDataRelationshipsRuleSet matchmakingRuleSet) {
    this.matchmakingRuleSet = matchmakingRuleSet;
  }


  public GameCenterMatchmakingRuleSetTestCreateRequestDataRelationships matchmakingRequests(GameCenterMatchmakingRuleSetTestCreateRequestDataRelationshipsMatchmakingRequests matchmakingRequests) {
    this.matchmakingRequests = matchmakingRequests;
    return this;
  }

   /**
   * Get matchmakingRequests
   * @return matchmakingRequests
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MATCHMAKING_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GameCenterMatchmakingRuleSetTestCreateRequestDataRelationshipsMatchmakingRequests getMatchmakingRequests() {
    return matchmakingRequests;
  }


  @JsonProperty(JSON_PROPERTY_MATCHMAKING_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMatchmakingRequests(GameCenterMatchmakingRuleSetTestCreateRequestDataRelationshipsMatchmakingRequests matchmakingRequests) {
    this.matchmakingRequests = matchmakingRequests;
  }


  /**
   * Return true if this GameCenterMatchmakingRuleSetTestCreateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterMatchmakingRuleSetTestCreateRequestDataRelationships gameCenterMatchmakingRuleSetTestCreateRequestDataRelationships = (GameCenterMatchmakingRuleSetTestCreateRequestDataRelationships) o;
    return Objects.equals(this.matchmakingRuleSet, gameCenterMatchmakingRuleSetTestCreateRequestDataRelationships.matchmakingRuleSet) &&
        Objects.equals(this.matchmakingRequests, gameCenterMatchmakingRuleSetTestCreateRequestDataRelationships.matchmakingRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchmakingRuleSet, matchmakingRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterMatchmakingRuleSetTestCreateRequestDataRelationships {\n");
    sb.append("    matchmakingRuleSet: ").append(toIndentedString(matchmakingRuleSet)).append("\n");
    sb.append("    matchmakingRequests: ").append(toIndentedString(matchmakingRequests)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

