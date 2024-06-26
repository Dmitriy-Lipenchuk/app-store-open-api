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
import org.openapitools.client.model.AppRelationshipsGameCenterDetail;
import org.openapitools.client.model.GameCenterLeaderboardSetLocalizationRelationshipsGameCenterLeaderboardSet;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * GameCenterLeaderboardSetReleaseRelationships
 */
@JsonPropertyOrder({
  GameCenterLeaderboardSetReleaseRelationships.JSON_PROPERTY_GAME_CENTER_DETAIL,
  GameCenterLeaderboardSetReleaseRelationships.JSON_PROPERTY_GAME_CENTER_LEADERBOARD_SET
})
@JsonTypeName("GameCenterLeaderboardSetRelease_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterLeaderboardSetReleaseRelationships {
  public static final String JSON_PROPERTY_GAME_CENTER_DETAIL = "gameCenterDetail";
  private AppRelationshipsGameCenterDetail gameCenterDetail;

  public static final String JSON_PROPERTY_GAME_CENTER_LEADERBOARD_SET = "gameCenterLeaderboardSet";
  private GameCenterLeaderboardSetLocalizationRelationshipsGameCenterLeaderboardSet gameCenterLeaderboardSet;

  public GameCenterLeaderboardSetReleaseRelationships() { 
  }

  public GameCenterLeaderboardSetReleaseRelationships gameCenterDetail(AppRelationshipsGameCenterDetail gameCenterDetail) {
    this.gameCenterDetail = gameCenterDetail;
    return this;
  }

   /**
   * Get gameCenterDetail
   * @return gameCenterDetail
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GAME_CENTER_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppRelationshipsGameCenterDetail getGameCenterDetail() {
    return gameCenterDetail;
  }


  @JsonProperty(JSON_PROPERTY_GAME_CENTER_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGameCenterDetail(AppRelationshipsGameCenterDetail gameCenterDetail) {
    this.gameCenterDetail = gameCenterDetail;
  }


  public GameCenterLeaderboardSetReleaseRelationships gameCenterLeaderboardSet(GameCenterLeaderboardSetLocalizationRelationshipsGameCenterLeaderboardSet gameCenterLeaderboardSet) {
    this.gameCenterLeaderboardSet = gameCenterLeaderboardSet;
    return this;
  }

   /**
   * Get gameCenterLeaderboardSet
   * @return gameCenterLeaderboardSet
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GAME_CENTER_LEADERBOARD_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GameCenterLeaderboardSetLocalizationRelationshipsGameCenterLeaderboardSet getGameCenterLeaderboardSet() {
    return gameCenterLeaderboardSet;
  }


  @JsonProperty(JSON_PROPERTY_GAME_CENTER_LEADERBOARD_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGameCenterLeaderboardSet(GameCenterLeaderboardSetLocalizationRelationshipsGameCenterLeaderboardSet gameCenterLeaderboardSet) {
    this.gameCenterLeaderboardSet = gameCenterLeaderboardSet;
  }


  /**
   * Return true if this GameCenterLeaderboardSetRelease_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterLeaderboardSetReleaseRelationships gameCenterLeaderboardSetReleaseRelationships = (GameCenterLeaderboardSetReleaseRelationships) o;
    return Objects.equals(this.gameCenterDetail, gameCenterLeaderboardSetReleaseRelationships.gameCenterDetail) &&
        Objects.equals(this.gameCenterLeaderboardSet, gameCenterLeaderboardSetReleaseRelationships.gameCenterLeaderboardSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameCenterDetail, gameCenterLeaderboardSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterLeaderboardSetReleaseRelationships {\n");
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

