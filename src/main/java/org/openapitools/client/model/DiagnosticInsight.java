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
import org.openapitools.client.model.DiagnosticInsightDirection;
import org.openapitools.client.model.DiagnosticInsightReferenceVersionsInner;
import org.openapitools.client.model.DiagnosticInsightType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * DiagnosticInsight
 */
@JsonPropertyOrder({
  DiagnosticInsight.JSON_PROPERTY_INSIGHT_TYPE,
  DiagnosticInsight.JSON_PROPERTY_DIRECTION,
  DiagnosticInsight.JSON_PROPERTY_REFERENCE_VERSIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class DiagnosticInsight {
  public static final String JSON_PROPERTY_INSIGHT_TYPE = "insightType";
  private DiagnosticInsightType insightType;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private DiagnosticInsightDirection direction;

  public static final String JSON_PROPERTY_REFERENCE_VERSIONS = "referenceVersions";
  private List<DiagnosticInsightReferenceVersionsInner> referenceVersions = new ArrayList<>();

  public DiagnosticInsight() { 
  }

  public DiagnosticInsight insightType(DiagnosticInsightType insightType) {
    this.insightType = insightType;
    return this;
  }

   /**
   * Get insightType
   * @return insightType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSIGHT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DiagnosticInsightType getInsightType() {
    return insightType;
  }


  @JsonProperty(JSON_PROPERTY_INSIGHT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsightType(DiagnosticInsightType insightType) {
    this.insightType = insightType;
  }


  public DiagnosticInsight direction(DiagnosticInsightDirection direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DiagnosticInsightDirection getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(DiagnosticInsightDirection direction) {
    this.direction = direction;
  }


  public DiagnosticInsight referenceVersions(List<DiagnosticInsightReferenceVersionsInner> referenceVersions) {
    this.referenceVersions = referenceVersions;
    return this;
  }

  public DiagnosticInsight addReferenceVersionsItem(DiagnosticInsightReferenceVersionsInner referenceVersionsItem) {
    if (this.referenceVersions == null) {
      this.referenceVersions = new ArrayList<>();
    }
    this.referenceVersions.add(referenceVersionsItem);
    return this;
  }

   /**
   * Get referenceVersions
   * @return referenceVersions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DiagnosticInsightReferenceVersionsInner> getReferenceVersions() {
    return referenceVersions;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceVersions(List<DiagnosticInsightReferenceVersionsInner> referenceVersions) {
    this.referenceVersions = referenceVersions;
  }


  /**
   * Return true if this DiagnosticInsight object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosticInsight diagnosticInsight = (DiagnosticInsight) o;
    return Objects.equals(this.insightType, diagnosticInsight.insightType) &&
        Objects.equals(this.direction, diagnosticInsight.direction) &&
        Objects.equals(this.referenceVersions, diagnosticInsight.referenceVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insightType, direction, referenceVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticInsight {\n");
    sb.append("    insightType: ").append(toIndentedString(insightType)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    referenceVersions: ").append(toIndentedString(referenceVersions)).append("\n");
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
