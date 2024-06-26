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
import org.openapitools.client.model.XcodeMetricsInsights;
import org.openapitools.client.model.XcodeMetricsProductDataInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * XcodeMetrics
 */
@JsonPropertyOrder({
  XcodeMetrics.JSON_PROPERTY_VERSION,
  XcodeMetrics.JSON_PROPERTY_INSIGHTS,
  XcodeMetrics.JSON_PROPERTY_PRODUCT_DATA
})
@JsonTypeName("xcodeMetrics")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class XcodeMetrics {
  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_INSIGHTS = "insights";
  private XcodeMetricsInsights insights;

  public static final String JSON_PROPERTY_PRODUCT_DATA = "productData";
  private List<XcodeMetricsProductDataInner> productData = new ArrayList<>();

  public XcodeMetrics() { 
  }

  public XcodeMetrics version(String version) {
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


  public XcodeMetrics insights(XcodeMetricsInsights insights) {
    this.insights = insights;
    return this;
  }

   /**
   * Get insights
   * @return insights
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XcodeMetricsInsights getInsights() {
    return insights;
  }


  @JsonProperty(JSON_PROPERTY_INSIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsights(XcodeMetricsInsights insights) {
    this.insights = insights;
  }


  public XcodeMetrics productData(List<XcodeMetricsProductDataInner> productData) {
    this.productData = productData;
    return this;
  }

  public XcodeMetrics addProductDataItem(XcodeMetricsProductDataInner productDataItem) {
    if (this.productData == null) {
      this.productData = new ArrayList<>();
    }
    this.productData.add(productDataItem);
    return this;
  }

   /**
   * Get productData
   * @return productData
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<XcodeMetricsProductDataInner> getProductData() {
    return productData;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductData(List<XcodeMetricsProductDataInner> productData) {
    this.productData = productData;
  }


  /**
   * Return true if this xcodeMetrics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XcodeMetrics xcodeMetrics = (XcodeMetrics) o;
    return Objects.equals(this.version, xcodeMetrics.version) &&
        Objects.equals(this.insights, xcodeMetrics.insights) &&
        Objects.equals(this.productData, xcodeMetrics.productData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, insights, productData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XcodeMetrics {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    insights: ").append(toIndentedString(insights)).append("\n");
    sb.append("    productData: ").append(toIndentedString(productData)).append("\n");
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
