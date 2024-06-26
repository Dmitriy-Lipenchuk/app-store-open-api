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
import org.openapitools.client.model.GameCenterAchievementLocalizationCreateRequestDataRelationshipsGameCenterAchievement;
import org.openapitools.client.model.GameCenterAchievementReleaseCreateRequestDataRelationshipsGameCenterDetail;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * GameCenterAchievementReleaseCreateRequestDataRelationships
 */
@JsonPropertyOrder({
  GameCenterAchievementReleaseCreateRequestDataRelationships.JSON_PROPERTY_GAME_CENTER_DETAIL,
  GameCenterAchievementReleaseCreateRequestDataRelationships.JSON_PROPERTY_GAME_CENTER_ACHIEVEMENT
})
@JsonTypeName("GameCenterAchievementReleaseCreateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterAchievementReleaseCreateRequestDataRelationships {
  public static final String JSON_PROPERTY_GAME_CENTER_DETAIL = "gameCenterDetail";
  private GameCenterAchievementReleaseCreateRequestDataRelationshipsGameCenterDetail gameCenterDetail;

  public static final String JSON_PROPERTY_GAME_CENTER_ACHIEVEMENT = "gameCenterAchievement";
  private GameCenterAchievementLocalizationCreateRequestDataRelationshipsGameCenterAchievement gameCenterAchievement;

  public GameCenterAchievementReleaseCreateRequestDataRelationships() { 
  }

  public GameCenterAchievementReleaseCreateRequestDataRelationships gameCenterDetail(GameCenterAchievementReleaseCreateRequestDataRelationshipsGameCenterDetail gameCenterDetail) {
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


  public GameCenterAchievementReleaseCreateRequestDataRelationships gameCenterAchievement(GameCenterAchievementLocalizationCreateRequestDataRelationshipsGameCenterAchievement gameCenterAchievement) {
    this.gameCenterAchievement = gameCenterAchievement;
    return this;
  }

   /**
   * Get gameCenterAchievement
   * @return gameCenterAchievement
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GAME_CENTER_ACHIEVEMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GameCenterAchievementLocalizationCreateRequestDataRelationshipsGameCenterAchievement getGameCenterAchievement() {
    return gameCenterAchievement;
  }


  @JsonProperty(JSON_PROPERTY_GAME_CENTER_ACHIEVEMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGameCenterAchievement(GameCenterAchievementLocalizationCreateRequestDataRelationshipsGameCenterAchievement gameCenterAchievement) {
    this.gameCenterAchievement = gameCenterAchievement;
  }


  /**
   * Return true if this GameCenterAchievementReleaseCreateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterAchievementReleaseCreateRequestDataRelationships gameCenterAchievementReleaseCreateRequestDataRelationships = (GameCenterAchievementReleaseCreateRequestDataRelationships) o;
    return Objects.equals(this.gameCenterDetail, gameCenterAchievementReleaseCreateRequestDataRelationships.gameCenterDetail) &&
        Objects.equals(this.gameCenterAchievement, gameCenterAchievementReleaseCreateRequestDataRelationships.gameCenterAchievement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameCenterDetail, gameCenterAchievement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterAchievementReleaseCreateRequestDataRelationships {\n");
    sb.append("    gameCenterDetail: ").append(toIndentedString(gameCenterDetail)).append("\n");
    sb.append("    gameCenterAchievement: ").append(toIndentedString(gameCenterAchievement)).append("\n");
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

