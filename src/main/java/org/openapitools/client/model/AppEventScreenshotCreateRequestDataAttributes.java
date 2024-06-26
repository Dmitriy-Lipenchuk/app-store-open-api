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
import org.openapitools.client.model.AppEventAssetType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppEventScreenshotCreateRequestDataAttributes
 */
@JsonPropertyOrder({
  AppEventScreenshotCreateRequestDataAttributes.JSON_PROPERTY_FILE_SIZE,
  AppEventScreenshotCreateRequestDataAttributes.JSON_PROPERTY_FILE_NAME,
  AppEventScreenshotCreateRequestDataAttributes.JSON_PROPERTY_APP_EVENT_ASSET_TYPE
})
@JsonTypeName("AppEventScreenshotCreateRequest_data_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppEventScreenshotCreateRequestDataAttributes {
  public static final String JSON_PROPERTY_FILE_SIZE = "fileSize";
  private Integer fileSize;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_APP_EVENT_ASSET_TYPE = "appEventAssetType";
  private AppEventAssetType appEventAssetType;

  public AppEventScreenshotCreateRequestDataAttributes() { 
  }

  public AppEventScreenshotCreateRequestDataAttributes fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Get fileSize
   * @return fileSize
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getFileSize() {
    return fileSize;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }


  public AppEventScreenshotCreateRequestDataAttributes fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public AppEventScreenshotCreateRequestDataAttributes appEventAssetType(AppEventAssetType appEventAssetType) {
    this.appEventAssetType = appEventAssetType;
    return this;
  }

   /**
   * Get appEventAssetType
   * @return appEventAssetType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_APP_EVENT_ASSET_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AppEventAssetType getAppEventAssetType() {
    return appEventAssetType;
  }


  @JsonProperty(JSON_PROPERTY_APP_EVENT_ASSET_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAppEventAssetType(AppEventAssetType appEventAssetType) {
    this.appEventAssetType = appEventAssetType;
  }


  /**
   * Return true if this AppEventScreenshotCreateRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppEventScreenshotCreateRequestDataAttributes appEventScreenshotCreateRequestDataAttributes = (AppEventScreenshotCreateRequestDataAttributes) o;
    return Objects.equals(this.fileSize, appEventScreenshotCreateRequestDataAttributes.fileSize) &&
        Objects.equals(this.fileName, appEventScreenshotCreateRequestDataAttributes.fileName) &&
        Objects.equals(this.appEventAssetType, appEventScreenshotCreateRequestDataAttributes.appEventAssetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, fileName, appEventAssetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppEventScreenshotCreateRequestDataAttributes {\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    appEventAssetType: ").append(toIndentedString(appEventAssetType)).append("\n");
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

