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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * GameCenterMatchmakingRuleCreateRequestDataRelationships
 */
@JsonPropertyOrder({
  GameCenterMatchmakingRuleCreateRequestDataRelationships.JSON_PROPERTY_RULE_SET
})
@JsonTypeName("GameCenterMatchmakingRuleCreateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterMatchmakingRuleCreateRequestDataRelationships {
  public static final String JSON_PROPERTY_RULE_SET = "ruleSet";
  private GameCenterMatchmakingQueueCreateRequestDataRelationshipsRuleSet ruleSet;

  public GameCenterMatchmakingRuleCreateRequestDataRelationships() { 
  }

  public GameCenterMatchmakingRuleCreateRequestDataRelationships ruleSet(GameCenterMatchmakingQueueCreateRequestDataRelationshipsRuleSet ruleSet) {
    this.ruleSet = ruleSet;
    return this;
  }

   /**
   * Get ruleSet
   * @return ruleSet
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RULE_SET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GameCenterMatchmakingQueueCreateRequestDataRelationshipsRuleSet getRuleSet() {
    return ruleSet;
  }


  @JsonProperty(JSON_PROPERTY_RULE_SET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRuleSet(GameCenterMatchmakingQueueCreateRequestDataRelationshipsRuleSet ruleSet) {
    this.ruleSet = ruleSet;
  }


  /**
   * Return true if this GameCenterMatchmakingRuleCreateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterMatchmakingRuleCreateRequestDataRelationships gameCenterMatchmakingRuleCreateRequestDataRelationships = (GameCenterMatchmakingRuleCreateRequestDataRelationships) o;
    return Objects.equals(this.ruleSet, gameCenterMatchmakingRuleCreateRequestDataRelationships.ruleSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterMatchmakingRuleCreateRequestDataRelationships {\n");
    sb.append("    ruleSet: ").append(toIndentedString(ruleSet)).append("\n");
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
