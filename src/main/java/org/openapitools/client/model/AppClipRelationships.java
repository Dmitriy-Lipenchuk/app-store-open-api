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
import org.openapitools.client.model.AppAvailabilityRelationshipsApp;
import org.openapitools.client.model.AppClipRelationshipsAppClipDefaultExperiences;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppClipRelationships
 */
@JsonPropertyOrder({
  AppClipRelationships.JSON_PROPERTY_APP,
  AppClipRelationships.JSON_PROPERTY_APP_CLIP_DEFAULT_EXPERIENCES
})
@JsonTypeName("AppClip_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppClipRelationships {
  public static final String JSON_PROPERTY_APP = "app";
  private AppAvailabilityRelationshipsApp app;

  public static final String JSON_PROPERTY_APP_CLIP_DEFAULT_EXPERIENCES = "appClipDefaultExperiences";
  private AppClipRelationshipsAppClipDefaultExperiences appClipDefaultExperiences;

  public AppClipRelationships() { 
  }

  public AppClipRelationships app(AppAvailabilityRelationshipsApp app) {
    this.app = app;
    return this;
  }

   /**
   * Get app
   * @return app
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppAvailabilityRelationshipsApp getApp() {
    return app;
  }


  @JsonProperty(JSON_PROPERTY_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApp(AppAvailabilityRelationshipsApp app) {
    this.app = app;
  }


  public AppClipRelationships appClipDefaultExperiences(AppClipRelationshipsAppClipDefaultExperiences appClipDefaultExperiences) {
    this.appClipDefaultExperiences = appClipDefaultExperiences;
    return this;
  }

   /**
   * Get appClipDefaultExperiences
   * @return appClipDefaultExperiences
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_CLIP_DEFAULT_EXPERIENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppClipRelationshipsAppClipDefaultExperiences getAppClipDefaultExperiences() {
    return appClipDefaultExperiences;
  }


  @JsonProperty(JSON_PROPERTY_APP_CLIP_DEFAULT_EXPERIENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppClipDefaultExperiences(AppClipRelationshipsAppClipDefaultExperiences appClipDefaultExperiences) {
    this.appClipDefaultExperiences = appClipDefaultExperiences;
  }


  /**
   * Return true if this AppClip_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppClipRelationships appClipRelationships = (AppClipRelationships) o;
    return Objects.equals(this.app, appClipRelationships.app) &&
        Objects.equals(this.appClipDefaultExperiences, appClipRelationships.appClipDefaultExperiences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, appClipDefaultExperiences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppClipRelationships {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    appClipDefaultExperiences: ").append(toIndentedString(appClipDefaultExperiences)).append("\n");
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

