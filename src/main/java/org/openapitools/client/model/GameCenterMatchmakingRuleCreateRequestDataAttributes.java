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
 * GameCenterMatchmakingRuleCreateRequestDataAttributes
 */
@JsonPropertyOrder({
  GameCenterMatchmakingRuleCreateRequestDataAttributes.JSON_PROPERTY_REFERENCE_NAME,
  GameCenterMatchmakingRuleCreateRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  GameCenterMatchmakingRuleCreateRequestDataAttributes.JSON_PROPERTY_TYPE,
  GameCenterMatchmakingRuleCreateRequestDataAttributes.JSON_PROPERTY_EXPRESSION,
  GameCenterMatchmakingRuleCreateRequestDataAttributes.JSON_PROPERTY_WEIGHT
})
@JsonTypeName("GameCenterMatchmakingRuleCreateRequest_data_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterMatchmakingRuleCreateRequestDataAttributes {
  public static final String JSON_PROPERTY_REFERENCE_NAME = "referenceName";
  private String referenceName;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    COMPATIBLE("COMPATIBLE"),
    
    DISTANCE("DISTANCE"),
    
    MATCH("MATCH"),
    
    TEAM("TEAM");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private BigDecimal weight;

  public GameCenterMatchmakingRuleCreateRequestDataAttributes() { 
  }

  public GameCenterMatchmakingRuleCreateRequestDataAttributes referenceName(String referenceName) {
    this.referenceName = referenceName;
    return this;
  }

   /**
   * Get referenceName
   * @return referenceName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REFERENCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReferenceName() {
    return referenceName;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReferenceName(String referenceName) {
    this.referenceName = referenceName;
  }


  public GameCenterMatchmakingRuleCreateRequestDataAttributes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public GameCenterMatchmakingRuleCreateRequestDataAttributes type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public GameCenterMatchmakingRuleCreateRequestDataAttributes expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Get expression
   * @return expression
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExpression() {
    return expression;
  }


  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpression(String expression) {
    this.expression = expression;
  }


  public GameCenterMatchmakingRuleCreateRequestDataAttributes weight(BigDecimal weight) {
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
   * Return true if this GameCenterMatchmakingRuleCreateRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterMatchmakingRuleCreateRequestDataAttributes gameCenterMatchmakingRuleCreateRequestDataAttributes = (GameCenterMatchmakingRuleCreateRequestDataAttributes) o;
    return Objects.equals(this.referenceName, gameCenterMatchmakingRuleCreateRequestDataAttributes.referenceName) &&
        Objects.equals(this.description, gameCenterMatchmakingRuleCreateRequestDataAttributes.description) &&
        Objects.equals(this.type, gameCenterMatchmakingRuleCreateRequestDataAttributes.type) &&
        Objects.equals(this.expression, gameCenterMatchmakingRuleCreateRequestDataAttributes.expression) &&
        Objects.equals(this.weight, gameCenterMatchmakingRuleCreateRequestDataAttributes.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceName, description, type, expression, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterMatchmakingRuleCreateRequestDataAttributes {\n");
    sb.append("    referenceName: ").append(toIndentedString(referenceName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

