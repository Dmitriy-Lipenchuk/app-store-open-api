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
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates
 */
@JsonPropertyOrder({
  AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates.JSON_PROPERTY_LATITUDE,
  AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates.JSON_PROPERTY_LONGITUDE
})
@JsonTypeName("AppClipAdvancedExperience_attributes_place_displayPoint_coordinates")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates {
  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private BigDecimal latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private BigDecimal longitude;

  public AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates() { 
  }

  public AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLatitude() {
    return latitude;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }


  public AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLongitude() {
    return longitude;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  /**
   * Return true if this AppClipAdvancedExperience_attributes_place_displayPoint_coordinates object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates appClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates = (AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates) o;
    return Objects.equals(this.latitude, appClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates.latitude) &&
        Objects.equals(this.longitude, appClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

