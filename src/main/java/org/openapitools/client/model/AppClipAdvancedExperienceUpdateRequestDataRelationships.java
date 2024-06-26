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
import org.openapitools.client.model.AppClipAdvancedExperienceUpdateRequestDataRelationshipsAppClip;
import org.openapitools.client.model.AppClipAdvancedExperienceUpdateRequestDataRelationshipsHeaderImage;
import org.openapitools.client.model.AppClipAdvancedExperienceUpdateRequestDataRelationshipsLocalizations;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppClipAdvancedExperienceUpdateRequestDataRelationships
 */
@JsonPropertyOrder({
  AppClipAdvancedExperienceUpdateRequestDataRelationships.JSON_PROPERTY_APP_CLIP,
  AppClipAdvancedExperienceUpdateRequestDataRelationships.JSON_PROPERTY_HEADER_IMAGE,
  AppClipAdvancedExperienceUpdateRequestDataRelationships.JSON_PROPERTY_LOCALIZATIONS
})
@JsonTypeName("AppClipAdvancedExperienceUpdateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppClipAdvancedExperienceUpdateRequestDataRelationships {
  public static final String JSON_PROPERTY_APP_CLIP = "appClip";
  private AppClipAdvancedExperienceUpdateRequestDataRelationshipsAppClip appClip;

  public static final String JSON_PROPERTY_HEADER_IMAGE = "headerImage";
  private AppClipAdvancedExperienceUpdateRequestDataRelationshipsHeaderImage headerImage;

  public static final String JSON_PROPERTY_LOCALIZATIONS = "localizations";
  private AppClipAdvancedExperienceUpdateRequestDataRelationshipsLocalizations localizations;

  public AppClipAdvancedExperienceUpdateRequestDataRelationships() { 
  }

  public AppClipAdvancedExperienceUpdateRequestDataRelationships appClip(AppClipAdvancedExperienceUpdateRequestDataRelationshipsAppClip appClip) {
    this.appClip = appClip;
    return this;
  }

   /**
   * Get appClip
   * @return appClip
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_CLIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppClipAdvancedExperienceUpdateRequestDataRelationshipsAppClip getAppClip() {
    return appClip;
  }


  @JsonProperty(JSON_PROPERTY_APP_CLIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppClip(AppClipAdvancedExperienceUpdateRequestDataRelationshipsAppClip appClip) {
    this.appClip = appClip;
  }


  public AppClipAdvancedExperienceUpdateRequestDataRelationships headerImage(AppClipAdvancedExperienceUpdateRequestDataRelationshipsHeaderImage headerImage) {
    this.headerImage = headerImage;
    return this;
  }

   /**
   * Get headerImage
   * @return headerImage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADER_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppClipAdvancedExperienceUpdateRequestDataRelationshipsHeaderImage getHeaderImage() {
    return headerImage;
  }


  @JsonProperty(JSON_PROPERTY_HEADER_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaderImage(AppClipAdvancedExperienceUpdateRequestDataRelationshipsHeaderImage headerImage) {
    this.headerImage = headerImage;
  }


  public AppClipAdvancedExperienceUpdateRequestDataRelationships localizations(AppClipAdvancedExperienceUpdateRequestDataRelationshipsLocalizations localizations) {
    this.localizations = localizations;
    return this;
  }

   /**
   * Get localizations
   * @return localizations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCALIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppClipAdvancedExperienceUpdateRequestDataRelationshipsLocalizations getLocalizations() {
    return localizations;
  }


  @JsonProperty(JSON_PROPERTY_LOCALIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocalizations(AppClipAdvancedExperienceUpdateRequestDataRelationshipsLocalizations localizations) {
    this.localizations = localizations;
  }


  /**
   * Return true if this AppClipAdvancedExperienceUpdateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppClipAdvancedExperienceUpdateRequestDataRelationships appClipAdvancedExperienceUpdateRequestDataRelationships = (AppClipAdvancedExperienceUpdateRequestDataRelationships) o;
    return Objects.equals(this.appClip, appClipAdvancedExperienceUpdateRequestDataRelationships.appClip) &&
        Objects.equals(this.headerImage, appClipAdvancedExperienceUpdateRequestDataRelationships.headerImage) &&
        Objects.equals(this.localizations, appClipAdvancedExperienceUpdateRequestDataRelationships.localizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appClip, headerImage, localizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppClipAdvancedExperienceUpdateRequestDataRelationships {\n");
    sb.append("    appClip: ").append(toIndentedString(appClip)).append("\n");
    sb.append("    headerImage: ").append(toIndentedString(headerImage)).append("\n");
    sb.append("    localizations: ").append(toIndentedString(localizations)).append("\n");
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

