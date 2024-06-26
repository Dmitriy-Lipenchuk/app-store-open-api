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
 * AppStoreVersionExperimentTreatmentCreateRequestDataAttributes
 */
@JsonPropertyOrder({
  AppStoreVersionExperimentTreatmentCreateRequestDataAttributes.JSON_PROPERTY_NAME,
  AppStoreVersionExperimentTreatmentCreateRequestDataAttributes.JSON_PROPERTY_APP_ICON_NAME
})
@JsonTypeName("AppStoreVersionExperimentTreatmentCreateRequest_data_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppStoreVersionExperimentTreatmentCreateRequestDataAttributes {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_APP_ICON_NAME = "appIconName";
  private String appIconName;

  public AppStoreVersionExperimentTreatmentCreateRequestDataAttributes() { 
  }

  public AppStoreVersionExperimentTreatmentCreateRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public AppStoreVersionExperimentTreatmentCreateRequestDataAttributes appIconName(String appIconName) {
    this.appIconName = appIconName;
    return this;
  }

   /**
   * Get appIconName
   * @return appIconName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_ICON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppIconName() {
    return appIconName;
  }


  @JsonProperty(JSON_PROPERTY_APP_ICON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppIconName(String appIconName) {
    this.appIconName = appIconName;
  }


  /**
   * Return true if this AppStoreVersionExperimentTreatmentCreateRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreVersionExperimentTreatmentCreateRequestDataAttributes appStoreVersionExperimentTreatmentCreateRequestDataAttributes = (AppStoreVersionExperimentTreatmentCreateRequestDataAttributes) o;
    return Objects.equals(this.name, appStoreVersionExperimentTreatmentCreateRequestDataAttributes.name) &&
        Objects.equals(this.appIconName, appStoreVersionExperimentTreatmentCreateRequestDataAttributes.appIconName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, appIconName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreVersionExperimentTreatmentCreateRequestDataAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    appIconName: ").append(toIndentedString(appIconName)).append("\n");
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
