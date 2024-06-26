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
import org.openapitools.client.model.AppCategoryRelationshipsParent;
import org.openapitools.client.model.AppInfoRelationshipsAgeRatingDeclaration;
import org.openapitools.client.model.AppInfoRelationshipsAppInfoLocalizations;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppInfoRelationships
 */
@JsonPropertyOrder({
  AppInfoRelationships.JSON_PROPERTY_APP,
  AppInfoRelationships.JSON_PROPERTY_AGE_RATING_DECLARATION,
  AppInfoRelationships.JSON_PROPERTY_APP_INFO_LOCALIZATIONS,
  AppInfoRelationships.JSON_PROPERTY_PRIMARY_CATEGORY,
  AppInfoRelationships.JSON_PROPERTY_PRIMARY_SUBCATEGORY_ONE,
  AppInfoRelationships.JSON_PROPERTY_PRIMARY_SUBCATEGORY_TWO,
  AppInfoRelationships.JSON_PROPERTY_SECONDARY_CATEGORY,
  AppInfoRelationships.JSON_PROPERTY_SECONDARY_SUBCATEGORY_ONE,
  AppInfoRelationships.JSON_PROPERTY_SECONDARY_SUBCATEGORY_TWO
})
@JsonTypeName("AppInfo_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppInfoRelationships {
  public static final String JSON_PROPERTY_APP = "app";
  private AppAvailabilityRelationshipsApp app;

  public static final String JSON_PROPERTY_AGE_RATING_DECLARATION = "ageRatingDeclaration";
  private AppInfoRelationshipsAgeRatingDeclaration ageRatingDeclaration;

  public static final String JSON_PROPERTY_APP_INFO_LOCALIZATIONS = "appInfoLocalizations";
  private AppInfoRelationshipsAppInfoLocalizations appInfoLocalizations;

  public static final String JSON_PROPERTY_PRIMARY_CATEGORY = "primaryCategory";
  private AppCategoryRelationshipsParent primaryCategory;

  public static final String JSON_PROPERTY_PRIMARY_SUBCATEGORY_ONE = "primarySubcategoryOne";
  private AppCategoryRelationshipsParent primarySubcategoryOne;

  public static final String JSON_PROPERTY_PRIMARY_SUBCATEGORY_TWO = "primarySubcategoryTwo";
  private AppCategoryRelationshipsParent primarySubcategoryTwo;

  public static final String JSON_PROPERTY_SECONDARY_CATEGORY = "secondaryCategory";
  private AppCategoryRelationshipsParent secondaryCategory;

  public static final String JSON_PROPERTY_SECONDARY_SUBCATEGORY_ONE = "secondarySubcategoryOne";
  private AppCategoryRelationshipsParent secondarySubcategoryOne;

  public static final String JSON_PROPERTY_SECONDARY_SUBCATEGORY_TWO = "secondarySubcategoryTwo";
  private AppCategoryRelationshipsParent secondarySubcategoryTwo;

  public AppInfoRelationships() { 
  }

  public AppInfoRelationships app(AppAvailabilityRelationshipsApp app) {
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


  public AppInfoRelationships ageRatingDeclaration(AppInfoRelationshipsAgeRatingDeclaration ageRatingDeclaration) {
    this.ageRatingDeclaration = ageRatingDeclaration;
    return this;
  }

   /**
   * Get ageRatingDeclaration
   * @return ageRatingDeclaration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGE_RATING_DECLARATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppInfoRelationshipsAgeRatingDeclaration getAgeRatingDeclaration() {
    return ageRatingDeclaration;
  }


  @JsonProperty(JSON_PROPERTY_AGE_RATING_DECLARATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgeRatingDeclaration(AppInfoRelationshipsAgeRatingDeclaration ageRatingDeclaration) {
    this.ageRatingDeclaration = ageRatingDeclaration;
  }


  public AppInfoRelationships appInfoLocalizations(AppInfoRelationshipsAppInfoLocalizations appInfoLocalizations) {
    this.appInfoLocalizations = appInfoLocalizations;
    return this;
  }

   /**
   * Get appInfoLocalizations
   * @return appInfoLocalizations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_INFO_LOCALIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppInfoRelationshipsAppInfoLocalizations getAppInfoLocalizations() {
    return appInfoLocalizations;
  }


  @JsonProperty(JSON_PROPERTY_APP_INFO_LOCALIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppInfoLocalizations(AppInfoRelationshipsAppInfoLocalizations appInfoLocalizations) {
    this.appInfoLocalizations = appInfoLocalizations;
  }


  public AppInfoRelationships primaryCategory(AppCategoryRelationshipsParent primaryCategory) {
    this.primaryCategory = primaryCategory;
    return this;
  }

   /**
   * Get primaryCategory
   * @return primaryCategory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppCategoryRelationshipsParent getPrimaryCategory() {
    return primaryCategory;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryCategory(AppCategoryRelationshipsParent primaryCategory) {
    this.primaryCategory = primaryCategory;
  }


  public AppInfoRelationships primarySubcategoryOne(AppCategoryRelationshipsParent primarySubcategoryOne) {
    this.primarySubcategoryOne = primarySubcategoryOne;
    return this;
  }

   /**
   * Get primarySubcategoryOne
   * @return primarySubcategoryOne
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_SUBCATEGORY_ONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppCategoryRelationshipsParent getPrimarySubcategoryOne() {
    return primarySubcategoryOne;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_SUBCATEGORY_ONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimarySubcategoryOne(AppCategoryRelationshipsParent primarySubcategoryOne) {
    this.primarySubcategoryOne = primarySubcategoryOne;
  }


  public AppInfoRelationships primarySubcategoryTwo(AppCategoryRelationshipsParent primarySubcategoryTwo) {
    this.primarySubcategoryTwo = primarySubcategoryTwo;
    return this;
  }

   /**
   * Get primarySubcategoryTwo
   * @return primarySubcategoryTwo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_SUBCATEGORY_TWO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppCategoryRelationshipsParent getPrimarySubcategoryTwo() {
    return primarySubcategoryTwo;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_SUBCATEGORY_TWO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimarySubcategoryTwo(AppCategoryRelationshipsParent primarySubcategoryTwo) {
    this.primarySubcategoryTwo = primarySubcategoryTwo;
  }


  public AppInfoRelationships secondaryCategory(AppCategoryRelationshipsParent secondaryCategory) {
    this.secondaryCategory = secondaryCategory;
    return this;
  }

   /**
   * Get secondaryCategory
   * @return secondaryCategory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECONDARY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppCategoryRelationshipsParent getSecondaryCategory() {
    return secondaryCategory;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondaryCategory(AppCategoryRelationshipsParent secondaryCategory) {
    this.secondaryCategory = secondaryCategory;
  }


  public AppInfoRelationships secondarySubcategoryOne(AppCategoryRelationshipsParent secondarySubcategoryOne) {
    this.secondarySubcategoryOne = secondarySubcategoryOne;
    return this;
  }

   /**
   * Get secondarySubcategoryOne
   * @return secondarySubcategoryOne
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECONDARY_SUBCATEGORY_ONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppCategoryRelationshipsParent getSecondarySubcategoryOne() {
    return secondarySubcategoryOne;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_SUBCATEGORY_ONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondarySubcategoryOne(AppCategoryRelationshipsParent secondarySubcategoryOne) {
    this.secondarySubcategoryOne = secondarySubcategoryOne;
  }


  public AppInfoRelationships secondarySubcategoryTwo(AppCategoryRelationshipsParent secondarySubcategoryTwo) {
    this.secondarySubcategoryTwo = secondarySubcategoryTwo;
    return this;
  }

   /**
   * Get secondarySubcategoryTwo
   * @return secondarySubcategoryTwo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECONDARY_SUBCATEGORY_TWO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppCategoryRelationshipsParent getSecondarySubcategoryTwo() {
    return secondarySubcategoryTwo;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_SUBCATEGORY_TWO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondarySubcategoryTwo(AppCategoryRelationshipsParent secondarySubcategoryTwo) {
    this.secondarySubcategoryTwo = secondarySubcategoryTwo;
  }


  /**
   * Return true if this AppInfo_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppInfoRelationships appInfoRelationships = (AppInfoRelationships) o;
    return Objects.equals(this.app, appInfoRelationships.app) &&
        Objects.equals(this.ageRatingDeclaration, appInfoRelationships.ageRatingDeclaration) &&
        Objects.equals(this.appInfoLocalizations, appInfoRelationships.appInfoLocalizations) &&
        Objects.equals(this.primaryCategory, appInfoRelationships.primaryCategory) &&
        Objects.equals(this.primarySubcategoryOne, appInfoRelationships.primarySubcategoryOne) &&
        Objects.equals(this.primarySubcategoryTwo, appInfoRelationships.primarySubcategoryTwo) &&
        Objects.equals(this.secondaryCategory, appInfoRelationships.secondaryCategory) &&
        Objects.equals(this.secondarySubcategoryOne, appInfoRelationships.secondarySubcategoryOne) &&
        Objects.equals(this.secondarySubcategoryTwo, appInfoRelationships.secondarySubcategoryTwo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, ageRatingDeclaration, appInfoLocalizations, primaryCategory, primarySubcategoryOne, primarySubcategoryTwo, secondaryCategory, secondarySubcategoryOne, secondarySubcategoryTwo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppInfoRelationships {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    ageRatingDeclaration: ").append(toIndentedString(ageRatingDeclaration)).append("\n");
    sb.append("    appInfoLocalizations: ").append(toIndentedString(appInfoLocalizations)).append("\n");
    sb.append("    primaryCategory: ").append(toIndentedString(primaryCategory)).append("\n");
    sb.append("    primarySubcategoryOne: ").append(toIndentedString(primarySubcategoryOne)).append("\n");
    sb.append("    primarySubcategoryTwo: ").append(toIndentedString(primarySubcategoryTwo)).append("\n");
    sb.append("    secondaryCategory: ").append(toIndentedString(secondaryCategory)).append("\n");
    sb.append("    secondarySubcategoryOne: ").append(toIndentedString(secondarySubcategoryOne)).append("\n");
    sb.append("    secondarySubcategoryTwo: ").append(toIndentedString(secondarySubcategoryTwo)).append("\n");
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
