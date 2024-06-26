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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.GameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPointsValues;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * GameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPoints
 */
@JsonPropertyOrder({
  GameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPoints.JSON_PROPERTY_START,
  GameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPoints.JSON_PROPERTY_END,
  GameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPoints.JSON_PROPERTY_VALUES
})
@JsonTypeName("GameCenterMatchmakingBooleanRuleResultsV1MetricResponse_data_inner_dataPoints")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPoints {
  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public static final String JSON_PROPERTY_END = "end";
  private OffsetDateTime end;

  public static final String JSON_PROPERTY_VALUES = "values";
  private GameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPointsValues values;

  public GameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPoints() { 
  }

  public GameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPoints start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public GameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPoints end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  public GameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPoints values(GameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPointsValues values) {
    this.values = values;
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPointsValues getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(GameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPointsValues values) {
    this.values = values;
  }


  /**
   * Return true if this GameCenterMatchmakingBooleanRuleResultsV1MetricResponse_data_inner_dataPoints object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPoints gameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPoints = (GameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPoints) o;
    return Objects.equals(this.start, gameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPoints.start) &&
        Objects.equals(this.end, gameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPoints.end) &&
        Objects.equals(this.values, gameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPoints.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterMatchmakingBooleanRuleResultsV1MetricResponseDataInnerDataPoints {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

