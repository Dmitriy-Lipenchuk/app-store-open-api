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
import org.openapitools.client.model.AppInfoUpdateRequestDataRelationshipsPrimaryCategory;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppInfoUpdateRequestDataRelationships
 */
@JsonPropertyOrder({
  AppInfoUpdateRequestDataRelationships.JSON_PROPERTY_PRIMARY_CATEGORY,
  AppInfoUpdateRequestDataRelationships.JSON_PROPERTY_PRIMARY_SUBCATEGORY_ONE,
  AppInfoUpdateRequestDataRelationships.JSON_PROPERTY_PRIMARY_SUBCATEGORY_TWO,
  AppInfoUpdateRequestDataRelationships.JSON_PROPERTY_SECONDARY_CATEGORY,
  AppInfoUpdateRequestDataRelationships.JSON_PROPERTY_SECONDARY_SUBCATEGORY_ONE,
  AppInfoUpdateRequestDataRelationships.JSON_PROPERTY_SECONDARY_SUBCATEGORY_TWO
})
@JsonTypeName("AppInfoUpdateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppInfoUpdateRequestDataRelationships {
  public static final String JSON_PROPERTY_PRIMARY_CATEGORY = "primaryCategory";
  private AppInfoUpdateRequestDataRelationshipsPrimaryCategory primaryCategory;

  public static final String JSON_PROPERTY_PRIMARY_SUBCATEGORY_ONE = "primarySubcategoryOne";
  private AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryOne;

  public static final String JSON_PROPERTY_PRIMARY_SUBCATEGORY_TWO = "primarySubcategoryTwo";
  private AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryTwo;

  public static final String JSON_PROPERTY_SECONDARY_CATEGORY = "secondaryCategory";
  private AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondaryCategory;

  public static final String JSON_PROPERTY_SECONDARY_SUBCATEGORY_ONE = "secondarySubcategoryOne";
  private AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryOne;

  public static final String JSON_PROPERTY_SECONDARY_SUBCATEGORY_TWO = "secondarySubcategoryTwo";
  private AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryTwo;

  public AppInfoUpdateRequestDataRelationships() { 
  }

  public AppInfoUpdateRequestDataRelationships primaryCategory(AppInfoUpdateRequestDataRelationshipsPrimaryCategory primaryCategory) {
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

  public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getPrimaryCategory() {
    return primaryCategory;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryCategory(AppInfoUpdateRequestDataRelationshipsPrimaryCategory primaryCategory) {
    this.primaryCategory = primaryCategory;
  }


  public AppInfoUpdateRequestDataRelationships primarySubcategoryOne(AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryOne) {
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

  public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getPrimarySubcategoryOne() {
    return primarySubcategoryOne;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_SUBCATEGORY_ONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimarySubcategoryOne(AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryOne) {
    this.primarySubcategoryOne = primarySubcategoryOne;
  }


  public AppInfoUpdateRequestDataRelationships primarySubcategoryTwo(AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryTwo) {
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

  public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getPrimarySubcategoryTwo() {
    return primarySubcategoryTwo;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_SUBCATEGORY_TWO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimarySubcategoryTwo(AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryTwo) {
    this.primarySubcategoryTwo = primarySubcategoryTwo;
  }


  public AppInfoUpdateRequestDataRelationships secondaryCategory(AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondaryCategory) {
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

  public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getSecondaryCategory() {
    return secondaryCategory;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondaryCategory(AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondaryCategory) {
    this.secondaryCategory = secondaryCategory;
  }


  public AppInfoUpdateRequestDataRelationships secondarySubcategoryOne(AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryOne) {
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

  public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getSecondarySubcategoryOne() {
    return secondarySubcategoryOne;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_SUBCATEGORY_ONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondarySubcategoryOne(AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryOne) {
    this.secondarySubcategoryOne = secondarySubcategoryOne;
  }


  public AppInfoUpdateRequestDataRelationships secondarySubcategoryTwo(AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryTwo) {
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

  public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getSecondarySubcategoryTwo() {
    return secondarySubcategoryTwo;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_SUBCATEGORY_TWO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondarySubcategoryTwo(AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryTwo) {
    this.secondarySubcategoryTwo = secondarySubcategoryTwo;
  }


  /**
   * Return true if this AppInfoUpdateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppInfoUpdateRequestDataRelationships appInfoUpdateRequestDataRelationships = (AppInfoUpdateRequestDataRelationships) o;
    return Objects.equals(this.primaryCategory, appInfoUpdateRequestDataRelationships.primaryCategory) &&
        Objects.equals(this.primarySubcategoryOne, appInfoUpdateRequestDataRelationships.primarySubcategoryOne) &&
        Objects.equals(this.primarySubcategoryTwo, appInfoUpdateRequestDataRelationships.primarySubcategoryTwo) &&
        Objects.equals(this.secondaryCategory, appInfoUpdateRequestDataRelationships.secondaryCategory) &&
        Objects.equals(this.secondarySubcategoryOne, appInfoUpdateRequestDataRelationships.secondarySubcategoryOne) &&
        Objects.equals(this.secondarySubcategoryTwo, appInfoUpdateRequestDataRelationships.secondarySubcategoryTwo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryCategory, primarySubcategoryOne, primarySubcategoryTwo, secondaryCategory, secondarySubcategoryOne, secondarySubcategoryTwo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppInfoUpdateRequestDataRelationships {\n");
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
