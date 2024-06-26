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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.XcodeMetricsProductDataInnerMetricCategoriesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * XcodeMetricsProductDataInner
 */
@JsonPropertyOrder({
  XcodeMetricsProductDataInner.JSON_PROPERTY_PLATFORM,
  XcodeMetricsProductDataInner.JSON_PROPERTY_METRIC_CATEGORIES
})
@JsonTypeName("xcodeMetrics_productData_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class XcodeMetricsProductDataInner {
  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private String platform;

  public static final String JSON_PROPERTY_METRIC_CATEGORIES = "metricCategories";
  private List<XcodeMetricsProductDataInnerMetricCategoriesInner> metricCategories = new ArrayList<>();

  public XcodeMetricsProductDataInner() { 
  }

  public XcodeMetricsProductDataInner platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public XcodeMetricsProductDataInner metricCategories(List<XcodeMetricsProductDataInnerMetricCategoriesInner> metricCategories) {
    this.metricCategories = metricCategories;
    return this;
  }

  public XcodeMetricsProductDataInner addMetricCategoriesItem(XcodeMetricsProductDataInnerMetricCategoriesInner metricCategoriesItem) {
    if (this.metricCategories == null) {
      this.metricCategories = new ArrayList<>();
    }
    this.metricCategories.add(metricCategoriesItem);
    return this;
  }

   /**
   * Get metricCategories
   * @return metricCategories
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<XcodeMetricsProductDataInnerMetricCategoriesInner> getMetricCategories() {
    return metricCategories;
  }


  @JsonProperty(JSON_PROPERTY_METRIC_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetricCategories(List<XcodeMetricsProductDataInnerMetricCategoriesInner> metricCategories) {
    this.metricCategories = metricCategories;
  }


  /**
   * Return true if this xcodeMetrics_productData_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XcodeMetricsProductDataInner xcodeMetricsProductDataInner = (XcodeMetricsProductDataInner) o;
    return Objects.equals(this.platform, xcodeMetricsProductDataInner.platform) &&
        Objects.equals(this.metricCategories, xcodeMetricsProductDataInner.metricCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, metricCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XcodeMetricsProductDataInner {\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    metricCategories: ").append(toIndentedString(metricCategories)).append("\n");
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

