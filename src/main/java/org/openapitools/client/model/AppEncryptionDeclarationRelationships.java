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
import org.openapitools.client.model.AppEncryptionDeclarationRelationshipsAppEncryptionDeclarationDocument;
import org.openapitools.client.model.AppEncryptionDeclarationRelationshipsBuilds;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppEncryptionDeclarationRelationships
 */
@JsonPropertyOrder({
  AppEncryptionDeclarationRelationships.JSON_PROPERTY_APP,
  AppEncryptionDeclarationRelationships.JSON_PROPERTY_BUILDS,
  AppEncryptionDeclarationRelationships.JSON_PROPERTY_APP_ENCRYPTION_DECLARATION_DOCUMENT
})
@JsonTypeName("AppEncryptionDeclaration_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppEncryptionDeclarationRelationships {
  public static final String JSON_PROPERTY_APP = "app";
  private AppAvailabilityRelationshipsApp app;

  public static final String JSON_PROPERTY_BUILDS = "builds";
  @Deprecated
  private AppEncryptionDeclarationRelationshipsBuilds builds;

  public static final String JSON_PROPERTY_APP_ENCRYPTION_DECLARATION_DOCUMENT = "appEncryptionDeclarationDocument";
  private AppEncryptionDeclarationRelationshipsAppEncryptionDeclarationDocument appEncryptionDeclarationDocument;

  public AppEncryptionDeclarationRelationships() { 
  }

  public AppEncryptionDeclarationRelationships app(AppAvailabilityRelationshipsApp app) {
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


  @Deprecated
  public AppEncryptionDeclarationRelationships builds(AppEncryptionDeclarationRelationshipsBuilds builds) {
    this.builds = builds;
    return this;
  }

   /**
   * Get builds
   * @return builds
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppEncryptionDeclarationRelationshipsBuilds getBuilds() {
    return builds;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuilds(AppEncryptionDeclarationRelationshipsBuilds builds) {
    this.builds = builds;
  }


  public AppEncryptionDeclarationRelationships appEncryptionDeclarationDocument(AppEncryptionDeclarationRelationshipsAppEncryptionDeclarationDocument appEncryptionDeclarationDocument) {
    this.appEncryptionDeclarationDocument = appEncryptionDeclarationDocument;
    return this;
  }

   /**
   * Get appEncryptionDeclarationDocument
   * @return appEncryptionDeclarationDocument
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_ENCRYPTION_DECLARATION_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppEncryptionDeclarationRelationshipsAppEncryptionDeclarationDocument getAppEncryptionDeclarationDocument() {
    return appEncryptionDeclarationDocument;
  }


  @JsonProperty(JSON_PROPERTY_APP_ENCRYPTION_DECLARATION_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppEncryptionDeclarationDocument(AppEncryptionDeclarationRelationshipsAppEncryptionDeclarationDocument appEncryptionDeclarationDocument) {
    this.appEncryptionDeclarationDocument = appEncryptionDeclarationDocument;
  }


  /**
   * Return true if this AppEncryptionDeclaration_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppEncryptionDeclarationRelationships appEncryptionDeclarationRelationships = (AppEncryptionDeclarationRelationships) o;
    return Objects.equals(this.app, appEncryptionDeclarationRelationships.app) &&
        Objects.equals(this.builds, appEncryptionDeclarationRelationships.builds) &&
        Objects.equals(this.appEncryptionDeclarationDocument, appEncryptionDeclarationRelationships.appEncryptionDeclarationDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, builds, appEncryptionDeclarationDocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppEncryptionDeclarationRelationships {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    builds: ").append(toIndentedString(builds)).append("\n");
    sb.append("    appEncryptionDeclarationDocument: ").append(toIndentedString(appEncryptionDeclarationDocument)).append("\n");
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
