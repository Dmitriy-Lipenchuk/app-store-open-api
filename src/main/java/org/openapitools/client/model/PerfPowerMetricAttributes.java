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
 * PerfPowerMetricAttributes
 */
@JsonPropertyOrder({
  PerfPowerMetricAttributes.JSON_PROPERTY_PLATFORM,
  PerfPowerMetricAttributes.JSON_PROPERTY_METRIC_TYPE,
  PerfPowerMetricAttributes.JSON_PROPERTY_DEVICE_TYPE
})
@JsonTypeName("PerfPowerMetric_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class PerfPowerMetricAttributes {
  /**
   * Gets or Sets platform
   */
  public enum PlatformEnum {
    IOS("IOS");

    private String value;

    PlatformEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PlatformEnum fromValue(String value) {
      for (PlatformEnum b : PlatformEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private PlatformEnum platform;

  /**
   * Gets or Sets metricType
   */
  public enum MetricTypeEnum {
    DISK("DISK"),
    
    HANG("HANG"),
    
    BATTERY("BATTERY"),
    
    LAUNCH("LAUNCH"),
    
    MEMORY("MEMORY"),
    
    ANIMATION("ANIMATION"),
    
    TERMINATION("TERMINATION");

    private String value;

    MetricTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MetricTypeEnum fromValue(String value) {
      for (MetricTypeEnum b : MetricTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_METRIC_TYPE = "metricType";
  private MetricTypeEnum metricType;

  public static final String JSON_PROPERTY_DEVICE_TYPE = "deviceType";
  private String deviceType;

  public PerfPowerMetricAttributes() { 
  }

  public PerfPowerMetricAttributes platform(PlatformEnum platform) {
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

  public PlatformEnum getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatform(PlatformEnum platform) {
    this.platform = platform;
  }


  public PerfPowerMetricAttributes metricType(MetricTypeEnum metricType) {
    this.metricType = metricType;
    return this;
  }

   /**
   * Get metricType
   * @return metricType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetricTypeEnum getMetricType() {
    return metricType;
  }


  @JsonProperty(JSON_PROPERTY_METRIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetricType(MetricTypeEnum metricType) {
    this.metricType = metricType;
  }


  public PerfPowerMetricAttributes deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceType() {
    return deviceType;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }


  /**
   * Return true if this PerfPowerMetric_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerfPowerMetricAttributes perfPowerMetricAttributes = (PerfPowerMetricAttributes) o;
    return Objects.equals(this.platform, perfPowerMetricAttributes.platform) &&
        Objects.equals(this.metricType, perfPowerMetricAttributes.metricType) &&
        Objects.equals(this.deviceType, perfPowerMetricAttributes.deviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, metricType, deviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerfPowerMetricAttributes {\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
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

