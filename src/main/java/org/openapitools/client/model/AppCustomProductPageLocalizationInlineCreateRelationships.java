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
import org.openapitools.client.model.AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppCustomProductPageLocalizationInlineCreateRelationships
 */
@JsonPropertyOrder({
  AppCustomProductPageLocalizationInlineCreateRelationships.JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE_VERSION
})
@JsonTypeName("AppCustomProductPageLocalizationInlineCreate_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppCustomProductPageLocalizationInlineCreateRelationships {
  public static final String JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE_VERSION = "appCustomProductPageVersion";
  private AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion appCustomProductPageVersion;

  public AppCustomProductPageLocalizationInlineCreateRelationships() { 
  }

  public AppCustomProductPageLocalizationInlineCreateRelationships appCustomProductPageVersion(AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion appCustomProductPageVersion) {
    this.appCustomProductPageVersion = appCustomProductPageVersion;
    return this;
  }

   /**
   * Get appCustomProductPageVersion
   * @return appCustomProductPageVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion getAppCustomProductPageVersion() {
    return appCustomProductPageVersion;
  }


  @JsonProperty(JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppCustomProductPageVersion(AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion appCustomProductPageVersion) {
    this.appCustomProductPageVersion = appCustomProductPageVersion;
  }


  /**
   * Return true if this AppCustomProductPageLocalizationInlineCreate_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppCustomProductPageLocalizationInlineCreateRelationships appCustomProductPageLocalizationInlineCreateRelationships = (AppCustomProductPageLocalizationInlineCreateRelationships) o;
    return Objects.equals(this.appCustomProductPageVersion, appCustomProductPageLocalizationInlineCreateRelationships.appCustomProductPageVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appCustomProductPageVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppCustomProductPageLocalizationInlineCreateRelationships {\n");
    sb.append("    appCustomProductPageVersion: ").append(toIndentedString(appCustomProductPageVersion)).append("\n");
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
