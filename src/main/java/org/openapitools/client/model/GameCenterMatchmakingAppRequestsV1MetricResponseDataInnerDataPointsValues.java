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
 * GameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues
 */
@JsonPropertyOrder({
  GameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues.JSON_PROPERTY_COUNT,
  GameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues.JSON_PROPERTY_AVERAGE_SECONDS_IN_QUEUE,
  GameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues.JSON_PROPERTY_P50_SECONDS_IN_QUEUE,
  GameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues.JSON_PROPERTY_P95_SECONDS_IN_QUEUE
})
@JsonTypeName("GameCenterMatchmakingAppRequestsV1MetricResponse_data_inner_dataPoints_values")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues {
  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_AVERAGE_SECONDS_IN_QUEUE = "averageSecondsInQueue";
  private BigDecimal averageSecondsInQueue;

  public static final String JSON_PROPERTY_P50_SECONDS_IN_QUEUE = "p50SecondsInQueue";
  private BigDecimal p50SecondsInQueue;

  public static final String JSON_PROPERTY_P95_SECONDS_IN_QUEUE = "p95SecondsInQueue";
  private BigDecimal p95SecondsInQueue;

  public GameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues() { 
  }

  public GameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(Integer count) {
    this.count = count;
  }


  public GameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues averageSecondsInQueue(BigDecimal averageSecondsInQueue) {
    this.averageSecondsInQueue = averageSecondsInQueue;
    return this;
  }

   /**
   * Get averageSecondsInQueue
   * @return averageSecondsInQueue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_SECONDS_IN_QUEUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAverageSecondsInQueue() {
    return averageSecondsInQueue;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_SECONDS_IN_QUEUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageSecondsInQueue(BigDecimal averageSecondsInQueue) {
    this.averageSecondsInQueue = averageSecondsInQueue;
  }


  public GameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues p50SecondsInQueue(BigDecimal p50SecondsInQueue) {
    this.p50SecondsInQueue = p50SecondsInQueue;
    return this;
  }

   /**
   * Get p50SecondsInQueue
   * @return p50SecondsInQueue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_P50_SECONDS_IN_QUEUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getP50SecondsInQueue() {
    return p50SecondsInQueue;
  }


  @JsonProperty(JSON_PROPERTY_P50_SECONDS_IN_QUEUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setP50SecondsInQueue(BigDecimal p50SecondsInQueue) {
    this.p50SecondsInQueue = p50SecondsInQueue;
  }


  public GameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues p95SecondsInQueue(BigDecimal p95SecondsInQueue) {
    this.p95SecondsInQueue = p95SecondsInQueue;
    return this;
  }

   /**
   * Get p95SecondsInQueue
   * @return p95SecondsInQueue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_P95_SECONDS_IN_QUEUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getP95SecondsInQueue() {
    return p95SecondsInQueue;
  }


  @JsonProperty(JSON_PROPERTY_P95_SECONDS_IN_QUEUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setP95SecondsInQueue(BigDecimal p95SecondsInQueue) {
    this.p95SecondsInQueue = p95SecondsInQueue;
  }


  /**
   * Return true if this GameCenterMatchmakingAppRequestsV1MetricResponse_data_inner_dataPoints_values object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues gameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues = (GameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues) o;
    return Objects.equals(this.count, gameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues.count) &&
        Objects.equals(this.averageSecondsInQueue, gameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues.averageSecondsInQueue) &&
        Objects.equals(this.p50SecondsInQueue, gameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues.p50SecondsInQueue) &&
        Objects.equals(this.p95SecondsInQueue, gameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues.p95SecondsInQueue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, averageSecondsInQueue, p50SecondsInQueue, p95SecondsInQueue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterMatchmakingAppRequestsV1MetricResponseDataInnerDataPointsValues {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    averageSecondsInQueue: ").append(toIndentedString(averageSecondsInQueue)).append("\n");
    sb.append("    p50SecondsInQueue: ").append(toIndentedString(p50SecondsInQueue)).append("\n");
    sb.append("    p95SecondsInQueue: ").append(toIndentedString(p95SecondsInQueue)).append("\n");
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

