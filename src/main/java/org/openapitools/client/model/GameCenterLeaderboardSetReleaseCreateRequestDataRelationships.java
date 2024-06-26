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
import org.openapitools.client.model.GameCenterAchievementReleaseCreateRequestDataRelationshipsGameCenterDetail;
import org.openapitools.client.model.GameCenterLeaderboardSetLocalizationCreateRequestDataRelationshipsGameCenterLeaderboardSet;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * GameCenterLeaderboardSetReleaseCreateRequestDataRelationships
 */
@JsonPropertyOrder({
  GameCenterLeaderboardSetReleaseCreateRequestDataRelationships.JSON_PROPERTY_GAME_CENTER_DETAIL,
  GameCenterLeaderboardSetReleaseCreateRequestDataRelationships.JSON_PROPERTY_GAME_CENTER_LEADERBOARD_SET
})
@JsonTypeName("GameCenterLeaderboardSetReleaseCreateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterLeaderboardSetReleaseCreateRequestDataRelationships {
  public static final String JSON_PROPERTY_GAME_CENTER_DETAIL = "gameCenterDetail";
  private GameCenterAchievementReleaseCreateRequestDataRelationshipsGameCenterDetail gameCenterDetail;

  public static final String JSON_PROPERTY_GAME_CENTER_LEADERBOARD_SET = "gameCenterLeaderboardSet";
  private GameCenterLeaderboardSetLocalizationCreateRequestDataRelationshipsGameCenterLeaderboardSet gameCenterLeaderboardSet;

  public GameCenterLeaderboardSetReleaseCreateRequestDataRelationships() { 
  }

  public GameCenterLeaderboardSetReleaseCreateRequestDataRelationships gameCenterDetail(GameCenterAchievementReleaseCreateRequestDataRelationshipsGameCenterDetail gameCenterDetail) {
    this.gameCenterDetail = gameCenterDetail;
    return this;
  }

   /**
   * Get gameCenterDetail
   * @return gameCenterDetail
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GAME_CENTER_DETAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GameCenterAchievementReleaseCreateRequestDataRelationshipsGameCenterDetail getGameCenterDetail() {
    return gameCenterDetail;
  }


  @JsonProperty(JSON_PROPERTY_GAME_CENTER_DETAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGameCenterDetail(GameCenterAchievementReleaseCreateRequestDataRelationshipsGameCenterDetail gameCenterDetail) {
    this.gameCenterDetail = gameCenterDetail;
  }


  public GameCenterLeaderboardSetReleaseCreateRequestDataRelationships gameCenterLeaderboardSet(GameCenterLeaderboardSetLocalizationCreateRequestDataRelationshipsGameCenterLeaderboardSet gameCenterLeaderboardSet) {
    this.gameCenterLeaderboardSet = gameCenterLeaderboardSet;
    return this;
  }

   /**
   * Get gameCenterLeaderboardSet
   * @return gameCenterLeaderboardSet
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GAME_CENTER_LEADERBOARD_SET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GameCenterLeaderboardSetLocalizationCreateRequestDataRelationshipsGameCenterLeaderboardSet getGameCenterLeaderboardSet() {
    return gameCenterLeaderboardSet;
  }


  @JsonProperty(JSON_PROPERTY_GAME_CENTER_LEADERBOARD_SET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGameCenterLeaderboardSet(GameCenterLeaderboardSetLocalizationCreateRequestDataRelationshipsGameCenterLeaderboardSet gameCenterLeaderboardSet) {
    this.gameCenterLeaderboardSet = gameCenterLeaderboardSet;
  }


  /**
   * Return true if this GameCenterLeaderboardSetReleaseCreateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterLeaderboardSetReleaseCreateRequestDataRelationships gameCenterLeaderboardSetReleaseCreateRequestDataRelationships = (GameCenterLeaderboardSetReleaseCreateRequestDataRelationships) o;
    return Objects.equals(this.gameCenterDetail, gameCenterLeaderboardSetReleaseCreateRequestDataRelationships.gameCenterDetail) &&
        Objects.equals(this.gameCenterLeaderboardSet, gameCenterLeaderboardSetReleaseCreateRequestDataRelationships.gameCenterLeaderboardSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameCenterDetail, gameCenterLeaderboardSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterLeaderboardSetReleaseCreateRequestDataRelationships {\n");
    sb.append("    gameCenterDetail: ").append(toIndentedString(gameCenterDetail)).append("\n");
    sb.append("    gameCenterLeaderboardSet: ").append(toIndentedString(gameCenterLeaderboardSet)).append("\n");
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
