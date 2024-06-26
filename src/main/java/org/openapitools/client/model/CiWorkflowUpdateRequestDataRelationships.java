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
import org.openapitools.client.model.CiWorkflowUpdateRequestDataRelationshipsMacOsVersion;
import org.openapitools.client.model.CiWorkflowUpdateRequestDataRelationshipsXcodeVersion;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * CiWorkflowUpdateRequestDataRelationships
 */
@JsonPropertyOrder({
  CiWorkflowUpdateRequestDataRelationships.JSON_PROPERTY_XCODE_VERSION,
  CiWorkflowUpdateRequestDataRelationships.JSON_PROPERTY_MAC_OS_VERSION
})
@JsonTypeName("CiWorkflowUpdateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CiWorkflowUpdateRequestDataRelationships {
  public static final String JSON_PROPERTY_XCODE_VERSION = "xcodeVersion";
  private CiWorkflowUpdateRequestDataRelationshipsXcodeVersion xcodeVersion;

  public static final String JSON_PROPERTY_MAC_OS_VERSION = "macOsVersion";
  private CiWorkflowUpdateRequestDataRelationshipsMacOsVersion macOsVersion;

  public CiWorkflowUpdateRequestDataRelationships() { 
  }

  public CiWorkflowUpdateRequestDataRelationships xcodeVersion(CiWorkflowUpdateRequestDataRelationshipsXcodeVersion xcodeVersion) {
    this.xcodeVersion = xcodeVersion;
    return this;
  }

   /**
   * Get xcodeVersion
   * @return xcodeVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_XCODE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CiWorkflowUpdateRequestDataRelationshipsXcodeVersion getXcodeVersion() {
    return xcodeVersion;
  }


  @JsonProperty(JSON_PROPERTY_XCODE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setXcodeVersion(CiWorkflowUpdateRequestDataRelationshipsXcodeVersion xcodeVersion) {
    this.xcodeVersion = xcodeVersion;
  }


  public CiWorkflowUpdateRequestDataRelationships macOsVersion(CiWorkflowUpdateRequestDataRelationshipsMacOsVersion macOsVersion) {
    this.macOsVersion = macOsVersion;
    return this;
  }

   /**
   * Get macOsVersion
   * @return macOsVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAC_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CiWorkflowUpdateRequestDataRelationshipsMacOsVersion getMacOsVersion() {
    return macOsVersion;
  }


  @JsonProperty(JSON_PROPERTY_MAC_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMacOsVersion(CiWorkflowUpdateRequestDataRelationshipsMacOsVersion macOsVersion) {
    this.macOsVersion = macOsVersion;
  }


  /**
   * Return true if this CiWorkflowUpdateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CiWorkflowUpdateRequestDataRelationships ciWorkflowUpdateRequestDataRelationships = (CiWorkflowUpdateRequestDataRelationships) o;
    return Objects.equals(this.xcodeVersion, ciWorkflowUpdateRequestDataRelationships.xcodeVersion) &&
        Objects.equals(this.macOsVersion, ciWorkflowUpdateRequestDataRelationships.macOsVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xcodeVersion, macOsVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CiWorkflowUpdateRequestDataRelationships {\n");
    sb.append("    xcodeVersion: ").append(toIndentedString(xcodeVersion)).append("\n");
    sb.append("    macOsVersion: ").append(toIndentedString(macOsVersion)).append("\n");
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

