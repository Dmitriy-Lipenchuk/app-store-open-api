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
import org.openapitools.client.model.GameCenterMatchmakingQueueCreateRequestDataRelationshipsExperimentRuleSet;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * GameCenterMatchmakingQueueUpdateRequestDataRelationships
 */
@JsonPropertyOrder({
  GameCenterMatchmakingQueueUpdateRequestDataRelationships.JSON_PROPERTY_RULE_SET,
  GameCenterMatchmakingQueueUpdateRequestDataRelationships.JSON_PROPERTY_EXPERIMENT_RULE_SET
})
@JsonTypeName("GameCenterMatchmakingQueueUpdateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterMatchmakingQueueUpdateRequestDataRelationships {
  public static final String JSON_PROPERTY_RULE_SET = "ruleSet";
  private GameCenterMatchmakingQueueCreateRequestDataRelationshipsExperimentRuleSet ruleSet;

  public static final String JSON_PROPERTY_EXPERIMENT_RULE_SET = "experimentRuleSet";
  private GameCenterMatchmakingQueueCreateRequestDataRelationshipsExperimentRuleSet experimentRuleSet;

  public GameCenterMatchmakingQueueUpdateRequestDataRelationships() { 
  }

  public GameCenterMatchmakingQueueUpdateRequestDataRelationships ruleSet(GameCenterMatchmakingQueueCreateRequestDataRelationshipsExperimentRuleSet ruleSet) {
    this.ruleSet = ruleSet;
    return this;
  }

   /**
   * Get ruleSet
   * @return ruleSet
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GameCenterMatchmakingQueueCreateRequestDataRelationshipsExperimentRuleSet getRuleSet() {
    return ruleSet;
  }


  @JsonProperty(JSON_PROPERTY_RULE_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleSet(GameCenterMatchmakingQueueCreateRequestDataRelationshipsExperimentRuleSet ruleSet) {
    this.ruleSet = ruleSet;
  }


  public GameCenterMatchmakingQueueUpdateRequestDataRelationships experimentRuleSet(GameCenterMatchmakingQueueCreateRequestDataRelationshipsExperimentRuleSet experimentRuleSet) {
    this.experimentRuleSet = experimentRuleSet;
    return this;
  }

   /**
   * Get experimentRuleSet
   * @return experimentRuleSet
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIMENT_RULE_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GameCenterMatchmakingQueueCreateRequestDataRelationshipsExperimentRuleSet getExperimentRuleSet() {
    return experimentRuleSet;
  }


  @JsonProperty(JSON_PROPERTY_EXPERIMENT_RULE_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExperimentRuleSet(GameCenterMatchmakingQueueCreateRequestDataRelationshipsExperimentRuleSet experimentRuleSet) {
    this.experimentRuleSet = experimentRuleSet;
  }


  /**
   * Return true if this GameCenterMatchmakingQueueUpdateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterMatchmakingQueueUpdateRequestDataRelationships gameCenterMatchmakingQueueUpdateRequestDataRelationships = (GameCenterMatchmakingQueueUpdateRequestDataRelationships) o;
    return Objects.equals(this.ruleSet, gameCenterMatchmakingQueueUpdateRequestDataRelationships.ruleSet) &&
        Objects.equals(this.experimentRuleSet, gameCenterMatchmakingQueueUpdateRequestDataRelationships.experimentRuleSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleSet, experimentRuleSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterMatchmakingQueueUpdateRequestDataRelationships {\n");
    sb.append("    ruleSet: ").append(toIndentedString(ruleSet)).append("\n");
    sb.append("    experimentRuleSet: ").append(toIndentedString(experimentRuleSet)).append("\n");
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
