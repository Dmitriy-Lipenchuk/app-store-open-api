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
 * CiIssueCounts
 */
@JsonPropertyOrder({
  CiIssueCounts.JSON_PROPERTY_ANALYZER_WARNINGS,
  CiIssueCounts.JSON_PROPERTY_ERRORS,
  CiIssueCounts.JSON_PROPERTY_TEST_FAILURES,
  CiIssueCounts.JSON_PROPERTY_WARNINGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CiIssueCounts {
  public static final String JSON_PROPERTY_ANALYZER_WARNINGS = "analyzerWarnings";
  private Integer analyzerWarnings;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private Integer errors;

  public static final String JSON_PROPERTY_TEST_FAILURES = "testFailures";
  private Integer testFailures;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private Integer warnings;

  public CiIssueCounts() { 
  }

  public CiIssueCounts analyzerWarnings(Integer analyzerWarnings) {
    this.analyzerWarnings = analyzerWarnings;
    return this;
  }

   /**
   * Get analyzerWarnings
   * @return analyzerWarnings
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANALYZER_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAnalyzerWarnings() {
    return analyzerWarnings;
  }


  @JsonProperty(JSON_PROPERTY_ANALYZER_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnalyzerWarnings(Integer analyzerWarnings) {
    this.analyzerWarnings = analyzerWarnings;
  }


  public CiIssueCounts errors(Integer errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(Integer errors) {
    this.errors = errors;
  }


  public CiIssueCounts testFailures(Integer testFailures) {
    this.testFailures = testFailures;
    return this;
  }

   /**
   * Get testFailures
   * @return testFailures
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_FAILURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTestFailures() {
    return testFailures;
  }


  @JsonProperty(JSON_PROPERTY_TEST_FAILURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestFailures(Integer testFailures) {
    this.testFailures = testFailures;
  }


  public CiIssueCounts warnings(Integer warnings) {
    this.warnings = warnings;
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWarnings() {
    return warnings;
  }


  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarnings(Integer warnings) {
    this.warnings = warnings;
  }


  /**
   * Return true if this CiIssueCounts object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CiIssueCounts ciIssueCounts = (CiIssueCounts) o;
    return Objects.equals(this.analyzerWarnings, ciIssueCounts.analyzerWarnings) &&
        Objects.equals(this.errors, ciIssueCounts.errors) &&
        Objects.equals(this.testFailures, ciIssueCounts.testFailures) &&
        Objects.equals(this.warnings, ciIssueCounts.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyzerWarnings, errors, testFailures, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CiIssueCounts {\n");
    sb.append("    analyzerWarnings: ").append(toIndentedString(analyzerWarnings)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    testFailures: ").append(toIndentedString(testFailures)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

