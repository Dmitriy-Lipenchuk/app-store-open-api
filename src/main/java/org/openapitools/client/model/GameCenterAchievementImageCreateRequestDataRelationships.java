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
import org.openapitools.client.model.GameCenterAchievementImageCreateRequestDataRelationshipsGameCenterAchievementLocalization;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * GameCenterAchievementImageCreateRequestDataRelationships
 */
@JsonPropertyOrder({
  GameCenterAchievementImageCreateRequestDataRelationships.JSON_PROPERTY_GAME_CENTER_ACHIEVEMENT_LOCALIZATION
})
@JsonTypeName("GameCenterAchievementImageCreateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterAchievementImageCreateRequestDataRelationships {
  public static final String JSON_PROPERTY_GAME_CENTER_ACHIEVEMENT_LOCALIZATION = "gameCenterAchievementLocalization";
  private GameCenterAchievementImageCreateRequestDataRelationshipsGameCenterAchievementLocalization gameCenterAchievementLocalization;

  public GameCenterAchievementImageCreateRequestDataRelationships() { 
  }

  public GameCenterAchievementImageCreateRequestDataRelationships gameCenterAchievementLocalization(GameCenterAchievementImageCreateRequestDataRelationshipsGameCenterAchievementLocalization gameCenterAchievementLocalization) {
    this.gameCenterAchievementLocalization = gameCenterAchievementLocalization;
    return this;
  }

   /**
   * Get gameCenterAchievementLocalization
   * @return gameCenterAchievementLocalization
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GAME_CENTER_ACHIEVEMENT_LOCALIZATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GameCenterAchievementImageCreateRequestDataRelationshipsGameCenterAchievementLocalization getGameCenterAchievementLocalization() {
    return gameCenterAchievementLocalization;
  }


  @JsonProperty(JSON_PROPERTY_GAME_CENTER_ACHIEVEMENT_LOCALIZATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGameCenterAchievementLocalization(GameCenterAchievementImageCreateRequestDataRelationshipsGameCenterAchievementLocalization gameCenterAchievementLocalization) {
    this.gameCenterAchievementLocalization = gameCenterAchievementLocalization;
  }


  /**
   * Return true if this GameCenterAchievementImageCreateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterAchievementImageCreateRequestDataRelationships gameCenterAchievementImageCreateRequestDataRelationships = (GameCenterAchievementImageCreateRequestDataRelationships) o;
    return Objects.equals(this.gameCenterAchievementLocalization, gameCenterAchievementImageCreateRequestDataRelationships.gameCenterAchievementLocalization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameCenterAchievementLocalization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterAchievementImageCreateRequestDataRelationships {\n");
    sb.append("    gameCenterAchievementLocalization: ").append(toIndentedString(gameCenterAchievementLocalization)).append("\n");
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

