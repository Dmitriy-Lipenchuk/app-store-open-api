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
import org.openapitools.client.model.AppClipHeaderImageRelationshipsAppClipDefaultExperienceLocalization;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppClipHeaderImageRelationships
 */
@JsonPropertyOrder({
  AppClipHeaderImageRelationships.JSON_PROPERTY_APP_CLIP_DEFAULT_EXPERIENCE_LOCALIZATION
})
@JsonTypeName("AppClipHeaderImage_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppClipHeaderImageRelationships {
  public static final String JSON_PROPERTY_APP_CLIP_DEFAULT_EXPERIENCE_LOCALIZATION = "appClipDefaultExperienceLocalization";
  private AppClipHeaderImageRelationshipsAppClipDefaultExperienceLocalization appClipDefaultExperienceLocalization;

  public AppClipHeaderImageRelationships() { 
  }

  public AppClipHeaderImageRelationships appClipDefaultExperienceLocalization(AppClipHeaderImageRelationshipsAppClipDefaultExperienceLocalization appClipDefaultExperienceLocalization) {
    this.appClipDefaultExperienceLocalization = appClipDefaultExperienceLocalization;
    return this;
  }

   /**
   * Get appClipDefaultExperienceLocalization
   * @return appClipDefaultExperienceLocalization
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_CLIP_DEFAULT_EXPERIENCE_LOCALIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppClipHeaderImageRelationshipsAppClipDefaultExperienceLocalization getAppClipDefaultExperienceLocalization() {
    return appClipDefaultExperienceLocalization;
  }


  @JsonProperty(JSON_PROPERTY_APP_CLIP_DEFAULT_EXPERIENCE_LOCALIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppClipDefaultExperienceLocalization(AppClipHeaderImageRelationshipsAppClipDefaultExperienceLocalization appClipDefaultExperienceLocalization) {
    this.appClipDefaultExperienceLocalization = appClipDefaultExperienceLocalization;
  }


  /**
   * Return true if this AppClipHeaderImage_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppClipHeaderImageRelationships appClipHeaderImageRelationships = (AppClipHeaderImageRelationships) o;
    return Objects.equals(this.appClipDefaultExperienceLocalization, appClipHeaderImageRelationships.appClipDefaultExperienceLocalization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appClipDefaultExperienceLocalization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppClipHeaderImageRelationships {\n");
    sb.append("    appClipDefaultExperienceLocalization: ").append(toIndentedString(appClipDefaultExperienceLocalization)).append("\n");
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

