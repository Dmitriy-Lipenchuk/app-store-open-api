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
import org.openapitools.client.model.MetricsInsight;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * XcodeMetricsInsights
 */
@JsonPropertyOrder({
  XcodeMetricsInsights.JSON_PROPERTY_TRENDING_UP,
  XcodeMetricsInsights.JSON_PROPERTY_REGRESSIONS
})
@JsonTypeName("xcodeMetrics_insights")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class XcodeMetricsInsights {
  public static final String JSON_PROPERTY_TRENDING_UP = "trendingUp";
  private List<MetricsInsight> trendingUp = new ArrayList<>();

  public static final String JSON_PROPERTY_REGRESSIONS = "regressions";
  private List<MetricsInsight> regressions = new ArrayList<>();

  public XcodeMetricsInsights() { 
  }

  public XcodeMetricsInsights trendingUp(List<MetricsInsight> trendingUp) {
    this.trendingUp = trendingUp;
    return this;
  }

  public XcodeMetricsInsights addTrendingUpItem(MetricsInsight trendingUpItem) {
    if (this.trendingUp == null) {
      this.trendingUp = new ArrayList<>();
    }
    this.trendingUp.add(trendingUpItem);
    return this;
  }

   /**
   * Get trendingUp
   * @return trendingUp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRENDING_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MetricsInsight> getTrendingUp() {
    return trendingUp;
  }


  @JsonProperty(JSON_PROPERTY_TRENDING_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrendingUp(List<MetricsInsight> trendingUp) {
    this.trendingUp = trendingUp;
  }


  public XcodeMetricsInsights regressions(List<MetricsInsight> regressions) {
    this.regressions = regressions;
    return this;
  }

  public XcodeMetricsInsights addRegressionsItem(MetricsInsight regressionsItem) {
    if (this.regressions == null) {
      this.regressions = new ArrayList<>();
    }
    this.regressions.add(regressionsItem);
    return this;
  }

   /**
   * Get regressions
   * @return regressions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGRESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MetricsInsight> getRegressions() {
    return regressions;
  }


  @JsonProperty(JSON_PROPERTY_REGRESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegressions(List<MetricsInsight> regressions) {
    this.regressions = regressions;
  }


  /**
   * Return true if this xcodeMetrics_insights object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XcodeMetricsInsights xcodeMetricsInsights = (XcodeMetricsInsights) o;
    return Objects.equals(this.trendingUp, xcodeMetricsInsights.trendingUp) &&
        Objects.equals(this.regressions, xcodeMetricsInsights.regressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trendingUp, regressions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XcodeMetricsInsights {\n");
    sb.append("    trendingUp: ").append(toIndentedString(trendingUp)).append("\n");
    sb.append("    regressions: ").append(toIndentedString(regressions)).append("\n");
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

