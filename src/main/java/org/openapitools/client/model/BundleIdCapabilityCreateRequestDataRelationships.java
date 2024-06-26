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
import org.openapitools.client.model.BundleIdCapabilityCreateRequestDataRelationshipsBundleId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * BundleIdCapabilityCreateRequestDataRelationships
 */
@JsonPropertyOrder({
  BundleIdCapabilityCreateRequestDataRelationships.JSON_PROPERTY_BUNDLE_ID
})
@JsonTypeName("BundleIdCapabilityCreateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BundleIdCapabilityCreateRequestDataRelationships {
  public static final String JSON_PROPERTY_BUNDLE_ID = "bundleId";
  private BundleIdCapabilityCreateRequestDataRelationshipsBundleId bundleId;

  public BundleIdCapabilityCreateRequestDataRelationships() { 
  }

  public BundleIdCapabilityCreateRequestDataRelationships bundleId(BundleIdCapabilityCreateRequestDataRelationshipsBundleId bundleId) {
    this.bundleId = bundleId;
    return this;
  }

   /**
   * Get bundleId
   * @return bundleId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BUNDLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BundleIdCapabilityCreateRequestDataRelationshipsBundleId getBundleId() {
    return bundleId;
  }


  @JsonProperty(JSON_PROPERTY_BUNDLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBundleId(BundleIdCapabilityCreateRequestDataRelationshipsBundleId bundleId) {
    this.bundleId = bundleId;
  }


  /**
   * Return true if this BundleIdCapabilityCreateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleIdCapabilityCreateRequestDataRelationships bundleIdCapabilityCreateRequestDataRelationships = (BundleIdCapabilityCreateRequestDataRelationships) o;
    return Objects.equals(this.bundleId, bundleIdCapabilityCreateRequestDataRelationships.bundleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleIdCapabilityCreateRequestDataRelationships {\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
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

