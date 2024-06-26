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
import org.openapitools.client.model.AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPage;
import org.openapitools.client.model.AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPageLocalizations;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppCustomProductPageVersionInlineCreateRelationships
 */
@JsonPropertyOrder({
  AppCustomProductPageVersionInlineCreateRelationships.JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE,
  AppCustomProductPageVersionInlineCreateRelationships.JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE_LOCALIZATIONS
})
@JsonTypeName("AppCustomProductPageVersionInlineCreate_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppCustomProductPageVersionInlineCreateRelationships {
  public static final String JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE = "appCustomProductPage";
  private AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPage appCustomProductPage;

  public static final String JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE_LOCALIZATIONS = "appCustomProductPageLocalizations";
  private AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPageLocalizations appCustomProductPageLocalizations;

  public AppCustomProductPageVersionInlineCreateRelationships() { 
  }

  public AppCustomProductPageVersionInlineCreateRelationships appCustomProductPage(AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPage appCustomProductPage) {
    this.appCustomProductPage = appCustomProductPage;
    return this;
  }

   /**
   * Get appCustomProductPage
   * @return appCustomProductPage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPage getAppCustomProductPage() {
    return appCustomProductPage;
  }


  @JsonProperty(JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppCustomProductPage(AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPage appCustomProductPage) {
    this.appCustomProductPage = appCustomProductPage;
  }


  public AppCustomProductPageVersionInlineCreateRelationships appCustomProductPageLocalizations(AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPageLocalizations appCustomProductPageLocalizations) {
    this.appCustomProductPageLocalizations = appCustomProductPageLocalizations;
    return this;
  }

   /**
   * Get appCustomProductPageLocalizations
   * @return appCustomProductPageLocalizations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE_LOCALIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPageLocalizations getAppCustomProductPageLocalizations() {
    return appCustomProductPageLocalizations;
  }


  @JsonProperty(JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE_LOCALIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppCustomProductPageLocalizations(AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPageLocalizations appCustomProductPageLocalizations) {
    this.appCustomProductPageLocalizations = appCustomProductPageLocalizations;
  }


  /**
   * Return true if this AppCustomProductPageVersionInlineCreate_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppCustomProductPageVersionInlineCreateRelationships appCustomProductPageVersionInlineCreateRelationships = (AppCustomProductPageVersionInlineCreateRelationships) o;
    return Objects.equals(this.appCustomProductPage, appCustomProductPageVersionInlineCreateRelationships.appCustomProductPage) &&
        Objects.equals(this.appCustomProductPageLocalizations, appCustomProductPageVersionInlineCreateRelationships.appCustomProductPageLocalizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appCustomProductPage, appCustomProductPageLocalizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppCustomProductPageVersionInlineCreateRelationships {\n");
    sb.append("    appCustomProductPage: ").append(toIndentedString(appCustomProductPage)).append("\n");
    sb.append("    appCustomProductPageLocalizations: ").append(toIndentedString(appCustomProductPageLocalizations)).append("\n");
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

