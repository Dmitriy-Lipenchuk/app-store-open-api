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
 * DiagnosticLogsProductDataInnerDiagnosticInsightsInner
 */
@JsonPropertyOrder({
  DiagnosticLogsProductDataInnerDiagnosticInsightsInner.JSON_PROPERTY_INSIGHTS_U_R_L,
  DiagnosticLogsProductDataInnerDiagnosticInsightsInner.JSON_PROPERTY_INSIGHTS_CATEGORY,
  DiagnosticLogsProductDataInnerDiagnosticInsightsInner.JSON_PROPERTY_INSIGHTS_STRING
})
@JsonTypeName("diagnosticLogs_productData_inner_diagnosticInsights_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class DiagnosticLogsProductDataInnerDiagnosticInsightsInner {
  public static final String JSON_PROPERTY_INSIGHTS_U_R_L = "insightsURL";
  private String insightsURL;

  public static final String JSON_PROPERTY_INSIGHTS_CATEGORY = "insightsCategory";
  private String insightsCategory;

  public static final String JSON_PROPERTY_INSIGHTS_STRING = "insightsString";
  private String insightsString;

  public DiagnosticLogsProductDataInnerDiagnosticInsightsInner() { 
  }

  public DiagnosticLogsProductDataInnerDiagnosticInsightsInner insightsURL(String insightsURL) {
    this.insightsURL = insightsURL;
    return this;
  }

   /**
   * Get insightsURL
   * @return insightsURL
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSIGHTS_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInsightsURL() {
    return insightsURL;
  }


  @JsonProperty(JSON_PROPERTY_INSIGHTS_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsightsURL(String insightsURL) {
    this.insightsURL = insightsURL;
  }


  public DiagnosticLogsProductDataInnerDiagnosticInsightsInner insightsCategory(String insightsCategory) {
    this.insightsCategory = insightsCategory;
    return this;
  }

   /**
   * Get insightsCategory
   * @return insightsCategory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSIGHTS_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInsightsCategory() {
    return insightsCategory;
  }


  @JsonProperty(JSON_PROPERTY_INSIGHTS_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsightsCategory(String insightsCategory) {
    this.insightsCategory = insightsCategory;
  }


  public DiagnosticLogsProductDataInnerDiagnosticInsightsInner insightsString(String insightsString) {
    this.insightsString = insightsString;
    return this;
  }

   /**
   * Get insightsString
   * @return insightsString
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSIGHTS_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInsightsString() {
    return insightsString;
  }


  @JsonProperty(JSON_PROPERTY_INSIGHTS_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsightsString(String insightsString) {
    this.insightsString = insightsString;
  }


  /**
   * Return true if this diagnosticLogs_productData_inner_diagnosticInsights_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosticLogsProductDataInnerDiagnosticInsightsInner diagnosticLogsProductDataInnerDiagnosticInsightsInner = (DiagnosticLogsProductDataInnerDiagnosticInsightsInner) o;
    return Objects.equals(this.insightsURL, diagnosticLogsProductDataInnerDiagnosticInsightsInner.insightsURL) &&
        Objects.equals(this.insightsCategory, diagnosticLogsProductDataInnerDiagnosticInsightsInner.insightsCategory) &&
        Objects.equals(this.insightsString, diagnosticLogsProductDataInnerDiagnosticInsightsInner.insightsString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insightsURL, insightsCategory, insightsString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticLogsProductDataInnerDiagnosticInsightsInner {\n");
    sb.append("    insightsURL: ").append(toIndentedString(insightsURL)).append("\n");
    sb.append("    insightsCategory: ").append(toIndentedString(insightsCategory)).append("\n");
    sb.append("    insightsString: ").append(toIndentedString(insightsString)).append("\n");
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

