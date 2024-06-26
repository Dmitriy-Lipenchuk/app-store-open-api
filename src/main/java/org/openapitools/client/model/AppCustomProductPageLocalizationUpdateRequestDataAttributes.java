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
 * AppCustomProductPageLocalizationUpdateRequestDataAttributes
 */
@JsonPropertyOrder({
  AppCustomProductPageLocalizationUpdateRequestDataAttributes.JSON_PROPERTY_PROMOTIONAL_TEXT
})
@JsonTypeName("AppCustomProductPageLocalizationUpdateRequest_data_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppCustomProductPageLocalizationUpdateRequestDataAttributes {
  public static final String JSON_PROPERTY_PROMOTIONAL_TEXT = "promotionalText";
  private String promotionalText;

  public AppCustomProductPageLocalizationUpdateRequestDataAttributes() { 
  }

  public AppCustomProductPageLocalizationUpdateRequestDataAttributes promotionalText(String promotionalText) {
    this.promotionalText = promotionalText;
    return this;
  }

   /**
   * Get promotionalText
   * @return promotionalText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROMOTIONAL_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPromotionalText() {
    return promotionalText;
  }


  @JsonProperty(JSON_PROPERTY_PROMOTIONAL_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPromotionalText(String promotionalText) {
    this.promotionalText = promotionalText;
  }


  /**
   * Return true if this AppCustomProductPageLocalizationUpdateRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppCustomProductPageLocalizationUpdateRequestDataAttributes appCustomProductPageLocalizationUpdateRequestDataAttributes = (AppCustomProductPageLocalizationUpdateRequestDataAttributes) o;
    return Objects.equals(this.promotionalText, appCustomProductPageLocalizationUpdateRequestDataAttributes.promotionalText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionalText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppCustomProductPageLocalizationUpdateRequestDataAttributes {\n");
    sb.append("    promotionalText: ").append(toIndentedString(promotionalText)).append("\n");
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

