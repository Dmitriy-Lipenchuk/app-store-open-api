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
import org.openapitools.client.model.IconAssetType;
import org.openapitools.client.model.ImageAsset;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * BuildIconAttributes
 */
@JsonPropertyOrder({
  BuildIconAttributes.JSON_PROPERTY_NAME,
  BuildIconAttributes.JSON_PROPERTY_ICON_ASSET,
  BuildIconAttributes.JSON_PROPERTY_ICON_TYPE
})
@JsonTypeName("BuildIcon_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BuildIconAttributes {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ICON_ASSET = "iconAsset";
  private ImageAsset iconAsset;

  public static final String JSON_PROPERTY_ICON_TYPE = "iconType";
  private IconAssetType iconType;

  public BuildIconAttributes() { 
  }

  public BuildIconAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public BuildIconAttributes iconAsset(ImageAsset iconAsset) {
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


  public BuildIconAttributes iconType(IconAssetType iconType) {
    this.iconType = iconType;
    return this;
  }

   /**
   * Get iconType
   * @return iconType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICON_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IconAssetType getIconType() {
    return iconType;
  }


  @JsonProperty(JSON_PROPERTY_ICON_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIconType(IconAssetType iconType) {
    this.iconType = iconType;
  }


  /**
   * Return true if this BuildIcon_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildIconAttributes buildIconAttributes = (BuildIconAttributes) o;
    return Objects.equals(this.name, buildIconAttributes.name) &&
        Objects.equals(this.iconAsset, buildIconAttributes.iconAsset) &&
        Objects.equals(this.iconType, buildIconAttributes.iconType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, iconAsset, iconType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildIconAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    iconAsset: ").append(toIndentedString(iconAsset)).append("\n");
    sb.append("    iconType: ").append(toIndentedString(iconType)).append("\n");
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

