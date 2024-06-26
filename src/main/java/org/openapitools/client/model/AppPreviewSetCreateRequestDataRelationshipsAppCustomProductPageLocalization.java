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
import org.openapitools.client.model.AppCustomProductPageVersionRelationshipsAppCustomProductPageLocalizationsDataInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppPreviewSetCreateRequestDataRelationshipsAppCustomProductPageLocalization
 */
@JsonPropertyOrder({
  AppPreviewSetCreateRequestDataRelationshipsAppCustomProductPageLocalization.JSON_PROPERTY_DATA
})
@JsonTypeName("AppPreviewSetCreateRequest_data_relationships_appCustomProductPageLocalization")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppPreviewSetCreateRequestDataRelationshipsAppCustomProductPageLocalization {
  public static final String JSON_PROPERTY_DATA = "data";
  private AppCustomProductPageVersionRelationshipsAppCustomProductPageLocalizationsDataInner data;

  public AppPreviewSetCreateRequestDataRelationshipsAppCustomProductPageLocalization() { 
  }

  public AppPreviewSetCreateRequestDataRelationshipsAppCustomProductPageLocalization data(AppCustomProductPageVersionRelationshipsAppCustomProductPageLocalizationsDataInner data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppCustomProductPageVersionRelationshipsAppCustomProductPageLocalizationsDataInner getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(AppCustomProductPageVersionRelationshipsAppCustomProductPageLocalizationsDataInner data) {
    this.data = data;
  }


  /**
   * Return true if this AppPreviewSetCreateRequest_data_relationships_appCustomProductPageLocalization object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppPreviewSetCreateRequestDataRelationshipsAppCustomProductPageLocalization appPreviewSetCreateRequestDataRelationshipsAppCustomProductPageLocalization = (AppPreviewSetCreateRequestDataRelationshipsAppCustomProductPageLocalization) o;
    return Objects.equals(this.data, appPreviewSetCreateRequestDataRelationshipsAppCustomProductPageLocalization.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPreviewSetCreateRequestDataRelationshipsAppCustomProductPageLocalization {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

