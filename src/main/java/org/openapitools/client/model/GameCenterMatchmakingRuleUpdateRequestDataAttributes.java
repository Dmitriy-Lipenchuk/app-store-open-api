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
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * GameCenterMatchmakingRuleUpdateRequestDataAttributes
 */
@JsonPropertyOrder({
  GameCenterMatchmakingRuleUpdateRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  GameCenterMatchmakingRuleUpdateRequestDataAttributes.JSON_PROPERTY_EXPRESSION,
  GameCenterMatchmakingRuleUpdateRequestDataAttributes.JSON_PROPERTY_WEIGHT
})
@JsonTypeName("GameCenterMatchmakingRuleUpdateRequest_data_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterMatchmakingRuleUpdateRequestDataAttributes {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private BigDecimal weight;

  public GameCenterMatchmakingRuleUpdateRequestDataAttributes() { 
  }

  public GameCenterMatchmakingRuleUpdateRequestDataAttributes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public GameCenterMatchmakingRuleUpdateRequestDataAttributes expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Get expression
   * @return expression
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpression() {
    return expression;
  }


  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpression(String expression) {
    this.expression = expression;
  }


  public GameCenterMatchmakingRuleUpdateRequestDataAttributes weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }


  /**
   * Return true if this GameCenterMatchmakingRuleUpdateRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterMatchmakingRuleUpdateRequestDataAttributes gameCenterMatchmakingRuleUpdateRequestDataAttributes = (GameCenterMatchmakingRuleUpdateRequestDataAttributes) o;
    return Objects.equals(this.description, gameCenterMatchmakingRuleUpdateRequestDataAttributes.description) &&
        Objects.equals(this.expression, gameCenterMatchmakingRuleUpdateRequestDataAttributes.expression) &&
        Objects.equals(this.weight, gameCenterMatchmakingRuleUpdateRequestDataAttributes.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expression, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterMatchmakingRuleUpdateRequestDataAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

