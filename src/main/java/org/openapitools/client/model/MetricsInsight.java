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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.MetricCategory;
import org.openapitools.client.model.MetricsInsightPopulationsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * MetricsInsight
 */
@JsonPropertyOrder({
  MetricsInsight.JSON_PROPERTY_METRIC_CATEGORY,
  MetricsInsight.JSON_PROPERTY_LATEST_VERSION,
  MetricsInsight.JSON_PROPERTY_METRIC,
  MetricsInsight.JSON_PROPERTY_SUMMARY_STRING,
  MetricsInsight.JSON_PROPERTY_REFERENCE_VERSIONS,
  MetricsInsight.JSON_PROPERTY_MAX_LATEST_VERSION_VALUE,
  MetricsInsight.JSON_PROPERTY_SUB_SYSTEM_LABEL,
  MetricsInsight.JSON_PROPERTY_HIGH_IMPACT,
  MetricsInsight.JSON_PROPERTY_POPULATIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class MetricsInsight {
  public static final String JSON_PROPERTY_METRIC_CATEGORY = "metricCategory";
  private MetricCategory metricCategory;

  public static final String JSON_PROPERTY_LATEST_VERSION = "latestVersion";
  private String latestVersion;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_SUMMARY_STRING = "summaryString";
  private String summaryString;

  public static final String JSON_PROPERTY_REFERENCE_VERSIONS = "referenceVersions";
  private String referenceVersions;

  public static final String JSON_PROPERTY_MAX_LATEST_VERSION_VALUE = "maxLatestVersionValue";
  private BigDecimal maxLatestVersionValue;

  public static final String JSON_PROPERTY_SUB_SYSTEM_LABEL = "subSystemLabel";
  private String subSystemLabel;

  public static final String JSON_PROPERTY_HIGH_IMPACT = "highImpact";
  private Boolean highImpact;

  public static final String JSON_PROPERTY_POPULATIONS = "populations";
  private List<MetricsInsightPopulationsInner> populations = new ArrayList<>();

  public MetricsInsight() { 
  }

  public MetricsInsight metricCategory(MetricCategory metricCategory) {
    this.metricCategory = metricCategory;
    return this;
  }

   /**
   * Get metricCategory
   * @return metricCategory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetricCategory getMetricCategory() {
    return metricCategory;
  }


  @JsonProperty(JSON_PROPERTY_METRIC_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetricCategory(MetricCategory metricCategory) {
    this.metricCategory = metricCategory;
  }


  public MetricsInsight latestVersion(String latestVersion) {
    this.latestVersion = latestVersion;
    return this;
  }

   /**
   * Get latestVersion
   * @return latestVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATEST_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLatestVersion() {
    return latestVersion;
  }


  @JsonProperty(JSON_PROPERTY_LATEST_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatestVersion(String latestVersion) {
    this.latestVersion = latestVersion;
  }


  public MetricsInsight metric(String metric) {
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMetric() {
    return metric;
  }


  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetric(String metric) {
    this.metric = metric;
  }


  public MetricsInsight summaryString(String summaryString) {
    this.summaryString = summaryString;
    return this;
  }

   /**
   * Get summaryString
   * @return summaryString
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUMMARY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSummaryString() {
    return summaryString;
  }


  @JsonProperty(JSON_PROPERTY_SUMMARY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSummaryString(String summaryString) {
    this.summaryString = summaryString;
  }


  public MetricsInsight referenceVersions(String referenceVersions) {
    this.referenceVersions = referenceVersions;
    return this;
  }

   /**
   * Get referenceVersions
   * @return referenceVersions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferenceVersions() {
    return referenceVersions;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceVersions(String referenceVersions) {
    this.referenceVersions = referenceVersions;
  }


  public MetricsInsight maxLatestVersionValue(BigDecimal maxLatestVersionValue) {
    this.maxLatestVersionValue = maxLatestVersionValue;
    return this;
  }

   /**
   * Get maxLatestVersionValue
   * @return maxLatestVersionValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_LATEST_VERSION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMaxLatestVersionValue() {
    return maxLatestVersionValue;
  }


  @JsonProperty(JSON_PROPERTY_MAX_LATEST_VERSION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxLatestVersionValue(BigDecimal maxLatestVersionValue) {
    this.maxLatestVersionValue = maxLatestVersionValue;
  }


  public MetricsInsight subSystemLabel(String subSystemLabel) {
    this.subSystemLabel = subSystemLabel;
    return this;
  }

   /**
   * Get subSystemLabel
   * @return subSystemLabel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_SYSTEM_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubSystemLabel() {
    return subSystemLabel;
  }


  @JsonProperty(JSON_PROPERTY_SUB_SYSTEM_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubSystemLabel(String subSystemLabel) {
    this.subSystemLabel = subSystemLabel;
  }


  public MetricsInsight highImpact(Boolean highImpact) {
    this.highImpact = highImpact;
    return this;
  }

   /**
   * Get highImpact
   * @return highImpact
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIGH_IMPACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHighImpact() {
    return highImpact;
  }


  @JsonProperty(JSON_PROPERTY_HIGH_IMPACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHighImpact(Boolean highImpact) {
    this.highImpact = highImpact;
  }


  public MetricsInsight populations(List<MetricsInsightPopulationsInner> populations) {
    this.populations = populations;
    return this;
  }

  public MetricsInsight addPopulationsItem(MetricsInsightPopulationsInner populationsItem) {
    if (this.populations == null) {
      this.populations = new ArrayList<>();
    }
    this.populations.add(populationsItem);
    return this;
  }

   /**
   * Get populations
   * @return populations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POPULATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MetricsInsightPopulationsInner> getPopulations() {
    return populations;
  }


  @JsonProperty(JSON_PROPERTY_POPULATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPopulations(List<MetricsInsightPopulationsInner> populations) {
    this.populations = populations;
  }


  /**
   * Return true if this MetricsInsight object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsInsight metricsInsight = (MetricsInsight) o;
    return Objects.equals(this.metricCategory, metricsInsight.metricCategory) &&
        Objects.equals(this.latestVersion, metricsInsight.latestVersion) &&
        Objects.equals(this.metric, metricsInsight.metric) &&
        Objects.equals(this.summaryString, metricsInsight.summaryString) &&
        Objects.equals(this.referenceVersions, metricsInsight.referenceVersions) &&
        Objects.equals(this.maxLatestVersionValue, metricsInsight.maxLatestVersionValue) &&
        Objects.equals(this.subSystemLabel, metricsInsight.subSystemLabel) &&
        Objects.equals(this.highImpact, metricsInsight.highImpact) &&
        Objects.equals(this.populations, metricsInsight.populations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricCategory, latestVersion, metric, summaryString, referenceVersions, maxLatestVersionValue, subSystemLabel, highImpact, populations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsInsight {\n");
    sb.append("    metricCategory: ").append(toIndentedString(metricCategory)).append("\n");
    sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    summaryString: ").append(toIndentedString(summaryString)).append("\n");
    sb.append("    referenceVersions: ").append(toIndentedString(referenceVersions)).append("\n");
    sb.append("    maxLatestVersionValue: ").append(toIndentedString(maxLatestVersionValue)).append("\n");
    sb.append("    subSystemLabel: ").append(toIndentedString(subSystemLabel)).append("\n");
    sb.append("    highImpact: ").append(toIndentedString(highImpact)).append("\n");
    sb.append("    populations: ").append(toIndentedString(populations)).append("\n");
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

