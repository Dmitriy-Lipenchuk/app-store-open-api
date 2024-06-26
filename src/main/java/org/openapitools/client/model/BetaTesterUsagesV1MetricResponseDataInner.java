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
import org.openapitools.client.model.AppsBetaTesterUsagesV1MetricResponseDataInnerDataPoints;
import org.openapitools.client.model.BetaTesterUsagesV1MetricResponseDataInnerDimensions;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * BetaTesterUsagesV1MetricResponseDataInner
 */
@JsonPropertyOrder({
  BetaTesterUsagesV1MetricResponseDataInner.JSON_PROPERTY_DATA_POINTS,
  BetaTesterUsagesV1MetricResponseDataInner.JSON_PROPERTY_DIMENSIONS
})
@JsonTypeName("BetaTesterUsagesV1MetricResponse_data_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BetaTesterUsagesV1MetricResponseDataInner {
  public static final String JSON_PROPERTY_DATA_POINTS = "dataPoints";
  private AppsBetaTesterUsagesV1MetricResponseDataInnerDataPoints dataPoints;

  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  private BetaTesterUsagesV1MetricResponseDataInnerDimensions dimensions;

  public BetaTesterUsagesV1MetricResponseDataInner() { 
  }

  public BetaTesterUsagesV1MetricResponseDataInner dataPoints(AppsBetaTesterUsagesV1MetricResponseDataInnerDataPoints dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

   /**
   * Get dataPoints
   * @return dataPoints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppsBetaTesterUsagesV1MetricResponseDataInnerDataPoints getDataPoints() {
    return dataPoints;
  }


  @JsonProperty(JSON_PROPERTY_DATA_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataPoints(AppsBetaTesterUsagesV1MetricResponseDataInnerDataPoints dataPoints) {
    this.dataPoints = dataPoints;
  }


  public BetaTesterUsagesV1MetricResponseDataInner dimensions(BetaTesterUsagesV1MetricResponseDataInnerDimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BetaTesterUsagesV1MetricResponseDataInnerDimensions getDimensions() {
    return dimensions;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensions(BetaTesterUsagesV1MetricResponseDataInnerDimensions dimensions) {
    this.dimensions = dimensions;
  }


  /**
   * Return true if this BetaTesterUsagesV1MetricResponse_data_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetaTesterUsagesV1MetricResponseDataInner betaTesterUsagesV1MetricResponseDataInner = (BetaTesterUsagesV1MetricResponseDataInner) o;
    return Objects.equals(this.dataPoints, betaTesterUsagesV1MetricResponseDataInner.dataPoints) &&
        Objects.equals(this.dimensions, betaTesterUsagesV1MetricResponseDataInner.dimensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataPoints, dimensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaTesterUsagesV1MetricResponseDataInner {\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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

