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
 * GameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues
 */
@JsonPropertyOrder({
  GameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues.JSON_PROPERTY_COUNT,
  GameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues.JSON_PROPERTY_AVERAGE_NUMBER_OF_REQUESTS,
  GameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues.JSON_PROPERTY_P50_NUMBER_OF_REQUESTS,
  GameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues.JSON_PROPERTY_P95_NUMBER_OF_REQUESTS
})
@JsonTypeName("GameCenterMatchmakingQueueSizesV1MetricResponse_data_inner_dataPoints_values")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues {
  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_AVERAGE_NUMBER_OF_REQUESTS = "averageNumberOfRequests";
  private BigDecimal averageNumberOfRequests;

  public static final String JSON_PROPERTY_P50_NUMBER_OF_REQUESTS = "p50NumberOfRequests";
  private BigDecimal p50NumberOfRequests;

  public static final String JSON_PROPERTY_P95_NUMBER_OF_REQUESTS = "p95NumberOfRequests";
  private BigDecimal p95NumberOfRequests;

  public GameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues() { 
  }

  public GameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues count(Integer count) {
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


  public GameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues averageNumberOfRequests(BigDecimal averageNumberOfRequests) {
    this.averageNumberOfRequests = averageNumberOfRequests;
    return this;
  }

   /**
   * Get averageNumberOfRequests
   * @return averageNumberOfRequests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_NUMBER_OF_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAverageNumberOfRequests() {
    return averageNumberOfRequests;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_NUMBER_OF_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageNumberOfRequests(BigDecimal averageNumberOfRequests) {
    this.averageNumberOfRequests = averageNumberOfRequests;
  }


  public GameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues p50NumberOfRequests(BigDecimal p50NumberOfRequests) {
    this.p50NumberOfRequests = p50NumberOfRequests;
    return this;
  }

   /**
   * Get p50NumberOfRequests
   * @return p50NumberOfRequests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_P50_NUMBER_OF_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getP50NumberOfRequests() {
    return p50NumberOfRequests;
  }


  @JsonProperty(JSON_PROPERTY_P50_NUMBER_OF_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setP50NumberOfRequests(BigDecimal p50NumberOfRequests) {
    this.p50NumberOfRequests = p50NumberOfRequests;
  }


  public GameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues p95NumberOfRequests(BigDecimal p95NumberOfRequests) {
    this.p95NumberOfRequests = p95NumberOfRequests;
    return this;
  }

   /**
   * Get p95NumberOfRequests
   * @return p95NumberOfRequests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_P95_NUMBER_OF_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getP95NumberOfRequests() {
    return p95NumberOfRequests;
  }


  @JsonProperty(JSON_PROPERTY_P95_NUMBER_OF_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setP95NumberOfRequests(BigDecimal p95NumberOfRequests) {
    this.p95NumberOfRequests = p95NumberOfRequests;
  }


  /**
   * Return true if this GameCenterMatchmakingQueueSizesV1MetricResponse_data_inner_dataPoints_values object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues gameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues = (GameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues) o;
    return Objects.equals(this.count, gameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues.count) &&
        Objects.equals(this.averageNumberOfRequests, gameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues.averageNumberOfRequests) &&
        Objects.equals(this.p50NumberOfRequests, gameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues.p50NumberOfRequests) &&
        Objects.equals(this.p95NumberOfRequests, gameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues.p95NumberOfRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, averageNumberOfRequests, p50NumberOfRequests, p95NumberOfRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterMatchmakingQueueSizesV1MetricResponseDataInnerDataPointsValues {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    averageNumberOfRequests: ").append(toIndentedString(averageNumberOfRequests)).append("\n");
    sb.append("    p50NumberOfRequests: ").append(toIndentedString(p50NumberOfRequests)).append("\n");
    sb.append("    p95NumberOfRequests: ").append(toIndentedString(p95NumberOfRequests)).append("\n");
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
