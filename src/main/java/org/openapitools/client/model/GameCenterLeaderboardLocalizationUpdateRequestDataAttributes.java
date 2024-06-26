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
import org.openapitools.client.model.GameCenterLeaderboardFormatter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * GameCenterLeaderboardLocalizationUpdateRequestDataAttributes
 */
@JsonPropertyOrder({
  GameCenterLeaderboardLocalizationUpdateRequestDataAttributes.JSON_PROPERTY_NAME,
  GameCenterLeaderboardLocalizationUpdateRequestDataAttributes.JSON_PROPERTY_FORMATTER_OVERRIDE,
  GameCenterLeaderboardLocalizationUpdateRequestDataAttributes.JSON_PROPERTY_FORMATTER_SUFFIX,
  GameCenterLeaderboardLocalizationUpdateRequestDataAttributes.JSON_PROPERTY_FORMATTER_SUFFIX_SINGULAR
})
@JsonTypeName("GameCenterLeaderboardLocalizationUpdateRequest_data_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterLeaderboardLocalizationUpdateRequestDataAttributes {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_FORMATTER_OVERRIDE = "formatterOverride";
  private GameCenterLeaderboardFormatter formatterOverride;

  public static final String JSON_PROPERTY_FORMATTER_SUFFIX = "formatterSuffix";
  private String formatterSuffix;

  public static final String JSON_PROPERTY_FORMATTER_SUFFIX_SINGULAR = "formatterSuffixSingular";
  private String formatterSuffixSingular;

  public GameCenterLeaderboardLocalizationUpdateRequestDataAttributes() { 
  }

  public GameCenterLeaderboardLocalizationUpdateRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public GameCenterLeaderboardLocalizationUpdateRequestDataAttributes formatterOverride(GameCenterLeaderboardFormatter formatterOverride) {
    this.formatterOverride = formatterOverride;
    return this;
  }

   /**
   * Get formatterOverride
   * @return formatterOverride
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMATTER_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GameCenterLeaderboardFormatter getFormatterOverride() {
    return formatterOverride;
  }


  @JsonProperty(JSON_PROPERTY_FORMATTER_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormatterOverride(GameCenterLeaderboardFormatter formatterOverride) {
    this.formatterOverride = formatterOverride;
  }


  public GameCenterLeaderboardLocalizationUpdateRequestDataAttributes formatterSuffix(String formatterSuffix) {
    this.formatterSuffix = formatterSuffix;
    return this;
  }

   /**
   * Get formatterSuffix
   * @return formatterSuffix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMATTER_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormatterSuffix() {
    return formatterSuffix;
  }


  @JsonProperty(JSON_PROPERTY_FORMATTER_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormatterSuffix(String formatterSuffix) {
    this.formatterSuffix = formatterSuffix;
  }


  public GameCenterLeaderboardLocalizationUpdateRequestDataAttributes formatterSuffixSingular(String formatterSuffixSingular) {
    this.formatterSuffixSingular = formatterSuffixSingular;
    return this;
  }

   /**
   * Get formatterSuffixSingular
   * @return formatterSuffixSingular
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMATTER_SUFFIX_SINGULAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormatterSuffixSingular() {
    return formatterSuffixSingular;
  }


  @JsonProperty(JSON_PROPERTY_FORMATTER_SUFFIX_SINGULAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormatterSuffixSingular(String formatterSuffixSingular) {
    this.formatterSuffixSingular = formatterSuffixSingular;
  }


  /**
   * Return true if this GameCenterLeaderboardLocalizationUpdateRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterLeaderboardLocalizationUpdateRequestDataAttributes gameCenterLeaderboardLocalizationUpdateRequestDataAttributes = (GameCenterLeaderboardLocalizationUpdateRequestDataAttributes) o;
    return Objects.equals(this.name, gameCenterLeaderboardLocalizationUpdateRequestDataAttributes.name) &&
        Objects.equals(this.formatterOverride, gameCenterLeaderboardLocalizationUpdateRequestDataAttributes.formatterOverride) &&
        Objects.equals(this.formatterSuffix, gameCenterLeaderboardLocalizationUpdateRequestDataAttributes.formatterSuffix) &&
        Objects.equals(this.formatterSuffixSingular, gameCenterLeaderboardLocalizationUpdateRequestDataAttributes.formatterSuffixSingular);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, formatterOverride, formatterSuffix, formatterSuffixSingular);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterLeaderboardLocalizationUpdateRequestDataAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    formatterOverride: ").append(toIndentedString(formatterOverride)).append("\n");
    sb.append("    formatterSuffix: ").append(toIndentedString(formatterSuffix)).append("\n");
    sb.append("    formatterSuffixSingular: ").append(toIndentedString(formatterSuffixSingular)).append("\n");
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

