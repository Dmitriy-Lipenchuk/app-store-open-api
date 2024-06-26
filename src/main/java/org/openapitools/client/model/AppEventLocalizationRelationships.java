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
import org.openapitools.client.model.AppEventLocalizationRelationshipsAppEvent;
import org.openapitools.client.model.AppEventLocalizationRelationshipsAppEventScreenshots;
import org.openapitools.client.model.AppEventLocalizationRelationshipsAppEventVideoClips;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppEventLocalizationRelationships
 */
@JsonPropertyOrder({
  AppEventLocalizationRelationships.JSON_PROPERTY_APP_EVENT,
  AppEventLocalizationRelationships.JSON_PROPERTY_APP_EVENT_SCREENSHOTS,
  AppEventLocalizationRelationships.JSON_PROPERTY_APP_EVENT_VIDEO_CLIPS
})
@JsonTypeName("AppEventLocalization_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppEventLocalizationRelationships {
  public static final String JSON_PROPERTY_APP_EVENT = "appEvent";
  private AppEventLocalizationRelationshipsAppEvent appEvent;

  public static final String JSON_PROPERTY_APP_EVENT_SCREENSHOTS = "appEventScreenshots";
  private AppEventLocalizationRelationshipsAppEventScreenshots appEventScreenshots;

  public static final String JSON_PROPERTY_APP_EVENT_VIDEO_CLIPS = "appEventVideoClips";
  private AppEventLocalizationRelationshipsAppEventVideoClips appEventVideoClips;

  public AppEventLocalizationRelationships() { 
  }

  public AppEventLocalizationRelationships appEvent(AppEventLocalizationRelationshipsAppEvent appEvent) {
    this.appEvent = appEvent;
    return this;
  }

   /**
   * Get appEvent
   * @return appEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppEventLocalizationRelationshipsAppEvent getAppEvent() {
    return appEvent;
  }


  @JsonProperty(JSON_PROPERTY_APP_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppEvent(AppEventLocalizationRelationshipsAppEvent appEvent) {
    this.appEvent = appEvent;
  }


  public AppEventLocalizationRelationships appEventScreenshots(AppEventLocalizationRelationshipsAppEventScreenshots appEventScreenshots) {
    this.appEventScreenshots = appEventScreenshots;
    return this;
  }

   /**
   * Get appEventScreenshots
   * @return appEventScreenshots
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_EVENT_SCREENSHOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppEventLocalizationRelationshipsAppEventScreenshots getAppEventScreenshots() {
    return appEventScreenshots;
  }


  @JsonProperty(JSON_PROPERTY_APP_EVENT_SCREENSHOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppEventScreenshots(AppEventLocalizationRelationshipsAppEventScreenshots appEventScreenshots) {
    this.appEventScreenshots = appEventScreenshots;
  }


  public AppEventLocalizationRelationships appEventVideoClips(AppEventLocalizationRelationshipsAppEventVideoClips appEventVideoClips) {
    this.appEventVideoClips = appEventVideoClips;
    return this;
  }

   /**
   * Get appEventVideoClips
   * @return appEventVideoClips
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_EVENT_VIDEO_CLIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppEventLocalizationRelationshipsAppEventVideoClips getAppEventVideoClips() {
    return appEventVideoClips;
  }


  @JsonProperty(JSON_PROPERTY_APP_EVENT_VIDEO_CLIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppEventVideoClips(AppEventLocalizationRelationshipsAppEventVideoClips appEventVideoClips) {
    this.appEventVideoClips = appEventVideoClips;
  }


  /**
   * Return true if this AppEventLocalization_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppEventLocalizationRelationships appEventLocalizationRelationships = (AppEventLocalizationRelationships) o;
    return Objects.equals(this.appEvent, appEventLocalizationRelationships.appEvent) &&
        Objects.equals(this.appEventScreenshots, appEventLocalizationRelationships.appEventScreenshots) &&
        Objects.equals(this.appEventVideoClips, appEventLocalizationRelationships.appEventVideoClips);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appEvent, appEventScreenshots, appEventVideoClips);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppEventLocalizationRelationships {\n");
    sb.append("    appEvent: ").append(toIndentedString(appEvent)).append("\n");
    sb.append("    appEventScreenshots: ").append(toIndentedString(appEventScreenshots)).append("\n");
    sb.append("    appEventVideoClips: ").append(toIndentedString(appEventVideoClips)).append("\n");
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

