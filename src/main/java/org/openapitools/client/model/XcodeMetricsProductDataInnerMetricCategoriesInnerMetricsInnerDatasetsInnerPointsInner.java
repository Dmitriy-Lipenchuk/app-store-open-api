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
import org.openapitools.client.model.XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInnerPercentageBreakdown;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner
 */
@JsonPropertyOrder({
  XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner.JSON_PROPERTY_VERSION,
  XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner.JSON_PROPERTY_VALUE,
  XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner.JSON_PROPERTY_ERROR_MARGIN,
  XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner.JSON_PROPERTY_PERCENTAGE_BREAKDOWN,
  XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner.JSON_PROPERTY_GOAL
})
@JsonTypeName("xcodeMetrics_productData_inner_metricCategories_inner_metrics_inner_datasets_inner_points_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner {
  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public static final String JSON_PROPERTY_ERROR_MARGIN = "errorMargin";
  private BigDecimal errorMargin;

  public static final String JSON_PROPERTY_PERCENTAGE_BREAKDOWN = "percentageBreakdown";
  private XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInnerPercentageBreakdown percentageBreakdown;

  public static final String JSON_PROPERTY_GOAL = "goal";
  private String goal;

  public XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner() { 
  }

  public XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner errorMargin(BigDecimal errorMargin) {
    this.errorMargin = errorMargin;
    return this;
  }

   /**
   * Get errorMargin
   * @return errorMargin
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getErrorMargin() {
    return errorMargin;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorMargin(BigDecimal errorMargin) {
    this.errorMargin = errorMargin;
  }


  public XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner percentageBreakdown(XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInnerPercentageBreakdown percentageBreakdown) {
    this.percentageBreakdown = percentageBreakdown;
    return this;
  }

   /**
   * Get percentageBreakdown
   * @return percentageBreakdown
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERCENTAGE_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInnerPercentageBreakdown getPercentageBreakdown() {
    return percentageBreakdown;
  }


  @JsonProperty(JSON_PROPERTY_PERCENTAGE_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentageBreakdown(XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInnerPercentageBreakdown percentageBreakdown) {
    this.percentageBreakdown = percentageBreakdown;
  }


  public XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner goal(String goal) {
    this.goal = goal;
    return this;
  }

   /**
   * Get goal
   * @return goal
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GOAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGoal() {
    return goal;
  }


  @JsonProperty(JSON_PROPERTY_GOAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoal(String goal) {
    this.goal = goal;
  }


  /**
   * Return true if this xcodeMetrics_productData_inner_metricCategories_inner_metrics_inner_datasets_inner_points_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner xcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner = (XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner) o;
    return Objects.equals(this.version, xcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner.version) &&
        Objects.equals(this.value, xcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner.value) &&
        Objects.equals(this.errorMargin, xcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner.errorMargin) &&
        Objects.equals(this.percentageBreakdown, xcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner.percentageBreakdown) &&
        Objects.equals(this.goal, xcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner.goal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, value, errorMargin, percentageBreakdown, goal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerPointsInner {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    errorMargin: ").append(toIndentedString(errorMargin)).append("\n");
    sb.append("    percentageBreakdown: ").append(toIndentedString(percentageBreakdown)).append("\n");
    sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
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
