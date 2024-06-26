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
import org.openapitools.client.model.ImageAsset;
import org.openapitools.client.model.Platform;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * GameCenterEnabledVersionAttributes
 */
@JsonPropertyOrder({
  GameCenterEnabledVersionAttributes.JSON_PROPERTY_PLATFORM,
  GameCenterEnabledVersionAttributes.JSON_PROPERTY_VERSION_STRING,
  GameCenterEnabledVersionAttributes.JSON_PROPERTY_ICON_ASSET
})
@JsonTypeName("GameCenterEnabledVersion_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterEnabledVersionAttributes {
  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private Platform platform;

  public static final String JSON_PROPERTY_VERSION_STRING = "versionString";
  private String versionString;

  public static final String JSON_PROPERTY_ICON_ASSET = "iconAsset";
  private ImageAsset iconAsset;

  public GameCenterEnabledVersionAttributes() { 
  }

  public GameCenterEnabledVersionAttributes platform(Platform platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Platform getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatform(Platform platform) {
    this.platform = platform;
  }


  public GameCenterEnabledVersionAttributes versionString(String versionString) {
    this.versionString = versionString;
    return this;
  }

   /**
   * Get versionString
   * @return versionString
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersionString() {
    return versionString;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionString(String versionString) {
    this.versionString = versionString;
  }


  public GameCenterEnabledVersionAttributes iconAsset(ImageAsset iconAsset) {
    this.iconAsset = iconAsset;
    return this;
  }

   /**
   * Get iconAsset
   * @return iconAsset
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICON_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ImageAsset getIconAsset() {
    return iconAsset;
  }


  @JsonProperty(JSON_PROPERTY_ICON_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIconAsset(ImageAsset iconAsset) {
    this.iconAsset = iconAsset;
  }


  /**
   * Return true if this GameCenterEnabledVersion_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterEnabledVersionAttributes gameCenterEnabledVersionAttributes = (GameCenterEnabledVersionAttributes) o;
    return Objects.equals(this.platform, gameCenterEnabledVersionAttributes.platform) &&
        Objects.equals(this.versionString, gameCenterEnabledVersionAttributes.versionString) &&
        Objects.equals(this.iconAsset, gameCenterEnabledVersionAttributes.iconAsset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, versionString, iconAsset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterEnabledVersionAttributes {\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    versionString: ").append(toIndentedString(versionString)).append("\n");
    sb.append("    iconAsset: ").append(toIndentedString(iconAsset)).append("\n");
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

