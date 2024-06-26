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
import org.openapitools.client.model.AppClipAdvancedExperienceCreateRequestDataRelationshipsAppClip;
import org.openapitools.client.model.AppClipAdvancedExperienceCreateRequestDataRelationshipsHeaderImage;
import org.openapitools.client.model.AppClipAdvancedExperienceCreateRequestDataRelationshipsLocalizations;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppClipAdvancedExperienceCreateRequestDataRelationships
 */
@JsonPropertyOrder({
  AppClipAdvancedExperienceCreateRequestDataRelationships.JSON_PROPERTY_APP_CLIP,
  AppClipAdvancedExperienceCreateRequestDataRelationships.JSON_PROPERTY_HEADER_IMAGE,
  AppClipAdvancedExperienceCreateRequestDataRelationships.JSON_PROPERTY_LOCALIZATIONS
})
@JsonTypeName("AppClipAdvancedExperienceCreateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppClipAdvancedExperienceCreateRequestDataRelationships {
  public static final String JSON_PROPERTY_APP_CLIP = "appClip";
  private AppClipAdvancedExperienceCreateRequestDataRelationshipsAppClip appClip;

  public static final String JSON_PROPERTY_HEADER_IMAGE = "headerImage";
  private AppClipAdvancedExperienceCreateRequestDataRelationshipsHeaderImage headerImage;

  public static final String JSON_PROPERTY_LOCALIZATIONS = "localizations";
  private AppClipAdvancedExperienceCreateRequestDataRelationshipsLocalizations localizations;

  public AppClipAdvancedExperienceCreateRequestDataRelationships() { 
  }

  public AppClipAdvancedExperienceCreateRequestDataRelationships appClip(AppClipAdvancedExperienceCreateRequestDataRelationshipsAppClip appClip) {
    this.appClip = appClip;
    return this;
  }

   /**
   * Get appClip
   * @return appClip
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_APP_CLIP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AppClipAdvancedExperienceCreateRequestDataRelationshipsAppClip getAppClip() {
    return appClip;
  }


  @JsonProperty(JSON_PROPERTY_APP_CLIP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAppClip(AppClipAdvancedExperienceCreateRequestDataRelationshipsAppClip appClip) {
    this.appClip = appClip;
  }


  public AppClipAdvancedExperienceCreateRequestDataRelationships headerImage(AppClipAdvancedExperienceCreateRequestDataRelationshipsHeaderImage headerImage) {
    this.headerImage = headerImage;
    return this;
  }

   /**
   * Get headerImage
   * @return headerImage
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HEADER_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AppClipAdvancedExperienceCreateRequestDataRelationshipsHeaderImage getHeaderImage() {
    return headerImage;
  }


  @JsonProperty(JSON_PROPERTY_HEADER_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeaderImage(AppClipAdvancedExperienceCreateRequestDataRelationshipsHeaderImage headerImage) {
    this.headerImage = headerImage;
  }


  public AppClipAdvancedExperienceCreateRequestDataRelationships localizations(AppClipAdvancedExperienceCreateRequestDataRelationshipsLocalizations localizations) {
    this.localizations = localizations;
    return this;
  }

   /**
   * Get localizations
   * @return localizations
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCALIZATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AppClipAdvancedExperienceCreateRequestDataRelationshipsLocalizations getLocalizations() {
    return localizations;
  }


  @JsonProperty(JSON_PROPERTY_LOCALIZATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocalizations(AppClipAdvancedExperienceCreateRequestDataRelationshipsLocalizations localizations) {
    this.localizations = localizations;
  }


  /**
   * Return true if this AppClipAdvancedExperienceCreateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppClipAdvancedExperienceCreateRequestDataRelationships appClipAdvancedExperienceCreateRequestDataRelationships = (AppClipAdvancedExperienceCreateRequestDataRelationships) o;
    return Objects.equals(this.appClip, appClipAdvancedExperienceCreateRequestDataRelationships.appClip) &&
        Objects.equals(this.headerImage, appClipAdvancedExperienceCreateRequestDataRelationships.headerImage) &&
        Objects.equals(this.localizations, appClipAdvancedExperienceCreateRequestDataRelationships.localizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appClip, headerImage, localizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppClipAdvancedExperienceCreateRequestDataRelationships {\n");
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

