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
import org.openapitools.client.model.AnalyticsReportRequestRelationshipsReports;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AnalyticsReportRequestRelationships
 */
@JsonPropertyOrder({
  AnalyticsReportRequestRelationships.JSON_PROPERTY_REPORTS
})
@JsonTypeName("AnalyticsReportRequest_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AnalyticsReportRequestRelationships {
  public static final String JSON_PROPERTY_REPORTS = "reports";
  private AnalyticsReportRequestRelationshipsReports reports;

  public AnalyticsReportRequestRelationships() { 
  }

  public AnalyticsReportRequestRelationships reports(AnalyticsReportRequestRelationshipsReports reports) {
    this.reports = reports;
    return this;
  }

   /**
   * Get reports
   * @return reports
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AnalyticsReportRequestRelationshipsReports getReports() {
    return reports;
  }


  @JsonProperty(JSON_PROPERTY_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReports(AnalyticsReportRequestRelationshipsReports reports) {
    this.reports = reports;
  }


  /**
   * Return true if this AnalyticsReportRequest_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsReportRequestRelationships analyticsReportRequestRelationships = (AnalyticsReportRequestRelationships) o;
    return Objects.equals(this.reports, analyticsReportRequestRelationships.reports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsReportRequestRelationships {\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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

