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
import org.openapitools.client.model.AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperience;
import org.openapitools.client.model.AppClipDefaultExperienceLocalizationRelationshipsAppClipHeaderImage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppClipDefaultExperienceLocalizationRelationships
 */
@JsonPropertyOrder({
  AppClipDefaultExperienceLocalizationRelationships.JSON_PROPERTY_APP_CLIP_DEFAULT_EXPERIENCE,
  AppClipDefaultExperienceLocalizationRelationships.JSON_PROPERTY_APP_CLIP_HEADER_IMAGE
})
@JsonTypeName("AppClipDefaultExperienceLocalization_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppClipDefaultExperienceLocalizationRelationships {
  public static final String JSON_PROPERTY_APP_CLIP_DEFAULT_EXPERIENCE = "appClipDefaultExperience";
  private AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperience appClipDefaultExperience;

  public static final String JSON_PROPERTY_APP_CLIP_HEADER_IMAGE = "appClipHeaderImage";
  private AppClipDefaultExperienceLocalizationRelationshipsAppClipHeaderImage appClipHeaderImage;

  public AppClipDefaultExperienceLocalizationRelationships() { 
  }

  public AppClipDefaultExperienceLocalizationRelationships appClipDefaultExperience(AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperience appClipDefaultExperience) {
    this.appClipDefaultExperience = appClipDefaultExperience;
    return this;
  }

   /**
   * Get appClipDefaultExperience
   * @return appClipDefaultExperience
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_CLIP_DEFAULT_EXPERIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperience getAppClipDefaultExperience() {
    return appClipDefaultExperience;
  }


  @JsonProperty(JSON_PROPERTY_APP_CLIP_DEFAULT_EXPERIENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppClipDefaultExperience(AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperience appClipDefaultExperience) {
    this.appClipDefaultExperience = appClipDefaultExperience;
  }


  public AppClipDefaultExperienceLocalizationRelationships appClipHeaderImage(AppClipDefaultExperienceLocalizationRelationshipsAppClipHeaderImage appClipHeaderImage) {
    this.appClipHeaderImage = appClipHeaderImage;
    return this;
  }

   /**
   * Get appClipHeaderImage
   * @return appClipHeaderImage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_CLIP_HEADER_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppClipDefaultExperienceLocalizationRelationshipsAppClipHeaderImage getAppClipHeaderImage() {
    return appClipHeaderImage;
  }


  @JsonProperty(JSON_PROPERTY_APP_CLIP_HEADER_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppClipHeaderImage(AppClipDefaultExperienceLocalizationRelationshipsAppClipHeaderImage appClipHeaderImage) {
    this.appClipHeaderImage = appClipHeaderImage;
  }


  /**
   * Return true if this AppClipDefaultExperienceLocalization_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppClipDefaultExperienceLocalizationRelationships appClipDefaultExperienceLocalizationRelationships = (AppClipDefaultExperienceLocalizationRelationships) o;
    return Objects.equals(this.appClipDefaultExperience, appClipDefaultExperienceLocalizationRelationships.appClipDefaultExperience) &&
        Objects.equals(this.appClipHeaderImage, appClipDefaultExperienceLocalizationRelationships.appClipHeaderImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appClipDefaultExperience, appClipHeaderImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppClipDefaultExperienceLocalizationRelationships {\n");
    sb.append("    appClipDefaultExperience: ").append(toIndentedString(appClipDefaultExperience)).append("\n");
    sb.append("    appClipHeaderImage: ").append(toIndentedString(appClipHeaderImage)).append("\n");
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

