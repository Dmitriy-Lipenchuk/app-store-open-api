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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataAttributes
 */
@JsonPropertyOrder({
  AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataAttributes.JSON_PROPERTY_LOCALE
})
@JsonTypeName("AppStoreVersionExperimentTreatmentLocalizationCreateRequest_data_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataAttributes {
  public static final String JSON_PROPERTY_LOCALE = "locale";
  private String locale;

  public AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataAttributes() { 
  }

  public AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataAttributes locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLocale() {
    return locale;
  }


  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocale(String locale) {
    this.locale = locale;
  }


  /**
   * Return true if this AppStoreVersionExperimentTreatmentLocalizationCreateRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataAttributes appStoreVersionExperimentTreatmentLocalizationCreateRequestDataAttributes = (AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataAttributes) o;
    return Objects.equals(this.locale, appStoreVersionExperimentTreatmentLocalizationCreateRequestDataAttributes.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataAttributes {\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

