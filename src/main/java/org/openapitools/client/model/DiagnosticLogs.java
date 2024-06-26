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
import org.openapitools.client.model.DiagnosticLogsProductDataInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * DiagnosticLogs
 */
@JsonPropertyOrder({
  DiagnosticLogs.JSON_PROPERTY_PRODUCT_DATA,
  DiagnosticLogs.JSON_PROPERTY_VERSION
})
@JsonTypeName("diagnosticLogs")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class DiagnosticLogs {
  public static final String JSON_PROPERTY_PRODUCT_DATA = "productData";
  private List<DiagnosticLogsProductDataInner> productData = new ArrayList<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public DiagnosticLogs() { 
  }

  public DiagnosticLogs productData(List<DiagnosticLogsProductDataInner> productData) {
    this.productData = productData;
    return this;
  }

  public DiagnosticLogs addProductDataItem(DiagnosticLogsProductDataInner productDataItem) {
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

  public List<DiagnosticLogsProductDataInner> getProductData() {
    return productData;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductData(List<DiagnosticLogsProductDataInner> productData) {
    this.productData = productData;
  }


  public DiagnosticLogs version(String version) {
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


  /**
   * Return true if this diagnosticLogs object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosticLogs diagnosticLogs = (DiagnosticLogs) o;
    return Objects.equals(this.productData, diagnosticLogs.productData) &&
        Objects.equals(this.version, diagnosticLogs.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productData, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticLogs {\n");
    sb.append("    productData: ").append(toIndentedString(productData)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

