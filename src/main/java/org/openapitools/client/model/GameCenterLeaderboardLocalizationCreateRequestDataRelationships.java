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
import org.openapitools.client.model.GameCenterLeaderboardLocalizationCreateRequestDataRelationshipsGameCenterLeaderboard;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * GameCenterLeaderboardLocalizationCreateRequestDataRelationships
 */
@JsonPropertyOrder({
  GameCenterLeaderboardLocalizationCreateRequestDataRelationships.JSON_PROPERTY_GAME_CENTER_LEADERBOARD
})
@JsonTypeName("GameCenterLeaderboardLocalizationCreateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterLeaderboardLocalizationCreateRequestDataRelationships {
  public static final String JSON_PROPERTY_GAME_CENTER_LEADERBOARD = "gameCenterLeaderboard";
  private GameCenterLeaderboardLocalizationCreateRequestDataRelationshipsGameCenterLeaderboard gameCenterLeaderboard;

  public GameCenterLeaderboardLocalizationCreateRequestDataRelationships() { 
  }

  public GameCenterLeaderboardLocalizationCreateRequestDataRelationships gameCenterLeaderboard(GameCenterLeaderboardLocalizationCreateRequestDataRelationshipsGameCenterLeaderboard gameCenterLeaderboard) {
    this.gameCenterLeaderboard = gameCenterLeaderboard;
    return this;
  }

   /**
   * Get gameCenterLeaderboard
   * @return gameCenterLeaderboard
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GAME_CENTER_LEADERBOARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GameCenterLeaderboardLocalizationCreateRequestDataRelationshipsGameCenterLeaderboard getGameCenterLeaderboard() {
    return gameCenterLeaderboard;
  }


  @JsonProperty(JSON_PROPERTY_GAME_CENTER_LEADERBOARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGameCenterLeaderboard(GameCenterLeaderboardLocalizationCreateRequestDataRelationshipsGameCenterLeaderboard gameCenterLeaderboard) {
    this.gameCenterLeaderboard = gameCenterLeaderboard;
  }


  /**
   * Return true if this GameCenterLeaderboardLocalizationCreateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterLeaderboardLocalizationCreateRequestDataRelationships gameCenterLeaderboardLocalizationCreateRequestDataRelationships = (GameCenterLeaderboardLocalizationCreateRequestDataRelationships) o;
    return Objects.equals(this.gameCenterLeaderboard, gameCenterLeaderboardLocalizationCreateRequestDataRelationships.gameCenterLeaderboard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameCenterLeaderboard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterLeaderboardLocalizationCreateRequestDataRelationships {\n");
    sb.append("    gameCenterLeaderboard: ").append(toIndentedString(gameCenterLeaderboard)).append("\n");
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

