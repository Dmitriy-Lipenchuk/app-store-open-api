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
 * ReviewSubmissionItemUpdateRequestDataAttributes
 */
@JsonPropertyOrder({
  ReviewSubmissionItemUpdateRequestDataAttributes.JSON_PROPERTY_RESOLVED,
  ReviewSubmissionItemUpdateRequestDataAttributes.JSON_PROPERTY_REMOVED
})
@JsonTypeName("ReviewSubmissionItemUpdateRequest_data_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class ReviewSubmissionItemUpdateRequestDataAttributes {
  public static final String JSON_PROPERTY_RESOLVED = "resolved";
  private Boolean resolved;

  public static final String JSON_PROPERTY_REMOVED = "removed";
  private Boolean removed;

  public ReviewSubmissionItemUpdateRequestDataAttributes() { 
  }

  public ReviewSubmissionItemUpdateRequestDataAttributes resolved(Boolean resolved) {
    this.resolved = resolved;
    return this;
  }

   /**
   * Get resolved
   * @return resolved
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getResolved() {
    return resolved;
  }


  @JsonProperty(JSON_PROPERTY_RESOLVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResolved(Boolean resolved) {
    this.resolved = resolved;
  }


  public ReviewSubmissionItemUpdateRequestDataAttributes removed(Boolean removed) {
    this.removed = removed;
    return this;
  }

   /**
   * Get removed
   * @return removed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRemoved() {
    return removed;
  }


  @JsonProperty(JSON_PROPERTY_REMOVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemoved(Boolean removed) {
    this.removed = removed;
  }


  /**
   * Return true if this ReviewSubmissionItemUpdateRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewSubmissionItemUpdateRequestDataAttributes reviewSubmissionItemUpdateRequestDataAttributes = (ReviewSubmissionItemUpdateRequestDataAttributes) o;
    return Objects.equals(this.resolved, reviewSubmissionItemUpdateRequestDataAttributes.resolved) &&
        Objects.equals(this.removed, reviewSubmissionItemUpdateRequestDataAttributes.removed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolved, removed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewSubmissionItemUpdateRequestDataAttributes {\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
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
