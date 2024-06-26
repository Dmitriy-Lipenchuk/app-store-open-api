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
import org.openapitools.client.model.AlternativeDistributionPackageVersionRelationshipsVariantsLinks;
import org.openapitools.client.model.AppStoreVersionRelationshipsAppStoreVersionSubmissionData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppStoreVersionRelationshipsAppStoreVersionSubmission
 */
@JsonPropertyOrder({
  AppStoreVersionRelationshipsAppStoreVersionSubmission.JSON_PROPERTY_LINKS,
  AppStoreVersionRelationshipsAppStoreVersionSubmission.JSON_PROPERTY_DATA
})
@JsonTypeName("AppStoreVersion_relationships_appStoreVersionSubmission")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppStoreVersionRelationshipsAppStoreVersionSubmission {
  public static final String JSON_PROPERTY_LINKS = "links";
  private AlternativeDistributionPackageVersionRelationshipsVariantsLinks links;

  public static final String JSON_PROPERTY_DATA = "data";
  private AppStoreVersionRelationshipsAppStoreVersionSubmissionData data;

  public AppStoreVersionRelationshipsAppStoreVersionSubmission() { 
  }

  public AppStoreVersionRelationshipsAppStoreVersionSubmission links(AlternativeDistributionPackageVersionRelationshipsVariantsLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlternativeDistributionPackageVersionRelationshipsVariantsLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(AlternativeDistributionPackageVersionRelationshipsVariantsLinks links) {
    this.links = links;
  }


  public AppStoreVersionRelationshipsAppStoreVersionSubmission data(AppStoreVersionRelationshipsAppStoreVersionSubmissionData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppStoreVersionRelationshipsAppStoreVersionSubmissionData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(AppStoreVersionRelationshipsAppStoreVersionSubmissionData data) {
    this.data = data;
  }


  /**
   * Return true if this AppStoreVersion_relationships_appStoreVersionSubmission object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreVersionRelationshipsAppStoreVersionSubmission appStoreVersionRelationshipsAppStoreVersionSubmission = (AppStoreVersionRelationshipsAppStoreVersionSubmission) o;
    return Objects.equals(this.links, appStoreVersionRelationshipsAppStoreVersionSubmission.links) &&
        Objects.equals(this.data, appStoreVersionRelationshipsAppStoreVersionSubmission.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreVersionRelationshipsAppStoreVersionSubmission {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

