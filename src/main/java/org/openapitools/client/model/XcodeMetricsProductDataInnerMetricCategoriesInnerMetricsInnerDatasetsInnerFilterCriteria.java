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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerFilterCriteria
 */
@JsonPropertyOrder({
  XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerFilterCriteria.JSON_PROPERTY_PERCENTILE,
  XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerFilterCriteria.JSON_PROPERTY_DEVICE,
  XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerFilterCriteria.JSON_PROPERTY_DEVICE_MARKETING_NAME
})
@JsonTypeName("xcodeMetrics_productData_inner_metricCategories_inner_metrics_inner_datasets_inner_filterCriteria")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerFilterCriteria {
  public static final String JSON_PROPERTY_PERCENTILE = "percentile";
  private String percentile;

  public static final String JSON_PROPERTY_DEVICE = "device";
  private String device;

  public static final String JSON_PROPERTY_DEVICE_MARKETING_NAME = "deviceMarketingName";
  private String deviceMarketingName;

  public XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerFilterCriteria() { 
  }

  public XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerFilterCriteria percentile(String percentile) {
    this.percentile = percentile;
    return this;
  }

   /**
   * Get percentile
   * @return percentile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERCENTILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPercentile() {
    return percentile;
  }


  @JsonProperty(JSON_PROPERTY_PERCENTILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentile(String percentile) {
    this.percentile = percentile;
  }


  public XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerFilterCriteria device(String device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDevice() {
    return device;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevice(String device) {
    this.device = device;
  }


  public XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerFilterCriteria deviceMarketingName(String deviceMarketingName) {
    this.deviceMarketingName = deviceMarketingName;
    return this;
  }

   /**
   * Get deviceMarketingName
   * @return deviceMarketingName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_MARKETING_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceMarketingName() {
    return deviceMarketingName;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_MARKETING_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceMarketingName(String deviceMarketingName) {
    this.deviceMarketingName = deviceMarketingName;
  }


  /**
   * Return true if this xcodeMetrics_productData_inner_metricCategories_inner_metrics_inner_datasets_inner_filterCriteria object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerFilterCriteria xcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerFilterCriteria = (XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerFilterCriteria) o;
    return Objects.equals(this.percentile, xcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerFilterCriteria.percentile) &&
        Objects.equals(this.device, xcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerFilterCriteria.device) &&
        Objects.equals(this.deviceMarketingName, xcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerFilterCriteria.deviceMarketingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentile, device, deviceMarketingName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XcodeMetricsProductDataInnerMetricCategoriesInnerMetricsInnerDatasetsInnerFilterCriteria {\n");
    sb.append("    percentile: ").append(toIndentedString(percentile)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    deviceMarketingName: ").append(toIndentedString(deviceMarketingName)).append("\n");
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

