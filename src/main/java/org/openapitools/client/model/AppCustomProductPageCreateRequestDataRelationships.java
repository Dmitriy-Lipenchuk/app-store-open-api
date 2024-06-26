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
import org.openapitools.client.model.AnalyticsReportRequestCreateRequestDataRelationshipsApp;
import org.openapitools.client.model.AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion;
import org.openapitools.client.model.AppCustomProductPageCreateRequestDataRelationshipsAppCustomProductPageVersions;
import org.openapitools.client.model.AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppCustomProductPageCreateRequestDataRelationships
 */
@JsonPropertyOrder({
  AppCustomProductPageCreateRequestDataRelationships.JSON_PROPERTY_APP,
  AppCustomProductPageCreateRequestDataRelationships.JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE_VERSIONS,
  AppCustomProductPageCreateRequestDataRelationships.JSON_PROPERTY_APP_STORE_VERSION_TEMPLATE,
  AppCustomProductPageCreateRequestDataRelationships.JSON_PROPERTY_CUSTOM_PRODUCT_PAGE_TEMPLATE
})
@JsonTypeName("AppCustomProductPageCreateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppCustomProductPageCreateRequestDataRelationships {
  public static final String JSON_PROPERTY_APP = "app";
  private AnalyticsReportRequestCreateRequestDataRelationshipsApp app;

  public static final String JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE_VERSIONS = "appCustomProductPageVersions";
  private AppCustomProductPageCreateRequestDataRelationshipsAppCustomProductPageVersions appCustomProductPageVersions;

  public static final String JSON_PROPERTY_APP_STORE_VERSION_TEMPLATE = "appStoreVersionTemplate";
  private AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion appStoreVersionTemplate;

  public static final String JSON_PROPERTY_CUSTOM_PRODUCT_PAGE_TEMPLATE = "customProductPageTemplate";
  private AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPage customProductPageTemplate;

  public AppCustomProductPageCreateRequestDataRelationships() { 
  }

  public AppCustomProductPageCreateRequestDataRelationships app(AnalyticsReportRequestCreateRequestDataRelationshipsApp app) {
    this.app = app;
    return this;
  }

   /**
   * Get app
   * @return app
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_APP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AnalyticsReportRequestCreateRequestDataRelationshipsApp getApp() {
    return app;
  }


  @JsonProperty(JSON_PROPERTY_APP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApp(AnalyticsReportRequestCreateRequestDataRelationshipsApp app) {
    this.app = app;
  }


  public AppCustomProductPageCreateRequestDataRelationships appCustomProductPageVersions(AppCustomProductPageCreateRequestDataRelationshipsAppCustomProductPageVersions appCustomProductPageVersions) {
    this.appCustomProductPageVersions = appCustomProductPageVersions;
    return this;
  }

   /**
   * Get appCustomProductPageVersions
   * @return appCustomProductPageVersions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppCustomProductPageCreateRequestDataRelationshipsAppCustomProductPageVersions getAppCustomProductPageVersions() {
    return appCustomProductPageVersions;
  }


  @JsonProperty(JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppCustomProductPageVersions(AppCustomProductPageCreateRequestDataRelationshipsAppCustomProductPageVersions appCustomProductPageVersions) {
    this.appCustomProductPageVersions = appCustomProductPageVersions;
  }


  public AppCustomProductPageCreateRequestDataRelationships appStoreVersionTemplate(AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion appStoreVersionTemplate) {
    this.appStoreVersionTemplate = appStoreVersionTemplate;
    return this;
  }

   /**
   * Get appStoreVersionTemplate
   * @return appStoreVersionTemplate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_STORE_VERSION_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion getAppStoreVersionTemplate() {
    return appStoreVersionTemplate;
  }


  @JsonProperty(JSON_PROPERTY_APP_STORE_VERSION_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppStoreVersionTemplate(AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion appStoreVersionTemplate) {
    this.appStoreVersionTemplate = appStoreVersionTemplate;
  }


  public AppCustomProductPageCreateRequestDataRelationships customProductPageTemplate(AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPage customProductPageTemplate) {
    this.customProductPageTemplate = customProductPageTemplate;
    return this;
  }

   /**
   * Get customProductPageTemplate
   * @return customProductPageTemplate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_PRODUCT_PAGE_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPage getCustomProductPageTemplate() {
    return customProductPageTemplate;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_PRODUCT_PAGE_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomProductPageTemplate(AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPage customProductPageTemplate) {
    this.customProductPageTemplate = customProductPageTemplate;
  }


  /**
   * Return true if this AppCustomProductPageCreateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppCustomProductPageCreateRequestDataRelationships appCustomProductPageCreateRequestDataRelationships = (AppCustomProductPageCreateRequestDataRelationships) o;
    return Objects.equals(this.app, appCustomProductPageCreateRequestDataRelationships.app) &&
        Objects.equals(this.appCustomProductPageVersions, appCustomProductPageCreateRequestDataRelationships.appCustomProductPageVersions) &&
        Objects.equals(this.appStoreVersionTemplate, appCustomProductPageCreateRequestDataRelationships.appStoreVersionTemplate) &&
        Objects.equals(this.customProductPageTemplate, appCustomProductPageCreateRequestDataRelationships.customProductPageTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, appCustomProductPageVersions, appStoreVersionTemplate, customProductPageTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppCustomProductPageCreateRequestDataRelationships {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    appCustomProductPageVersions: ").append(toIndentedString(appCustomProductPageVersions)).append("\n");
    sb.append("    appStoreVersionTemplate: ").append(toIndentedString(appStoreVersionTemplate)).append("\n");
    sb.append("    customProductPageTemplate: ").append(toIndentedString(customProductPageTemplate)).append("\n");
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
