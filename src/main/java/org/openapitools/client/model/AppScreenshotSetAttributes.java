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
import org.openapitools.client.model.ScreenshotDisplayType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppScreenshotSetAttributes
 */
@JsonPropertyOrder({
  AppScreenshotSetAttributes.JSON_PROPERTY_SCREENSHOT_DISPLAY_TYPE
})
@JsonTypeName("AppScreenshotSet_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppScreenshotSetAttributes {
  public static final String JSON_PROPERTY_SCREENSHOT_DISPLAY_TYPE = "screenshotDisplayType";
  private ScreenshotDisplayType screenshotDisplayType;

  public AppScreenshotSetAttributes() { 
  }

  public AppScreenshotSetAttributes screenshotDisplayType(ScreenshotDisplayType screenshotDisplayType) {
    this.screenshotDisplayType = screenshotDisplayType;
    return this;
  }

   /**
   * Get screenshotDisplayType
   * @return screenshotDisplayType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCREENSHOT_DISPLAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScreenshotDisplayType getScreenshotDisplayType() {
    return screenshotDisplayType;
  }


  @JsonProperty(JSON_PROPERTY_SCREENSHOT_DISPLAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScreenshotDisplayType(ScreenshotDisplayType screenshotDisplayType) {
    this.screenshotDisplayType = screenshotDisplayType;
  }


  /**
   * Return true if this AppScreenshotSet_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppScreenshotSetAttributes appScreenshotSetAttributes = (AppScreenshotSetAttributes) o;
    return Objects.equals(this.screenshotDisplayType, appScreenshotSetAttributes.screenshotDisplayType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(screenshotDisplayType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppScreenshotSetAttributes {\n");
    sb.append("    screenshotDisplayType: ").append(toIndentedString(screenshotDisplayType)).append("\n");
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
