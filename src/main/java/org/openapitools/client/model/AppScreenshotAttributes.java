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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AppMediaAssetState;
import org.openapitools.client.model.ImageAsset;
import org.openapitools.client.model.UploadOperation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppScreenshotAttributes
 */
@JsonPropertyOrder({
  AppScreenshotAttributes.JSON_PROPERTY_FILE_SIZE,
  AppScreenshotAttributes.JSON_PROPERTY_FILE_NAME,
  AppScreenshotAttributes.JSON_PROPERTY_SOURCE_FILE_CHECKSUM,
  AppScreenshotAttributes.JSON_PROPERTY_IMAGE_ASSET,
  AppScreenshotAttributes.JSON_PROPERTY_ASSET_TOKEN,
  AppScreenshotAttributes.JSON_PROPERTY_ASSET_TYPE,
  AppScreenshotAttributes.JSON_PROPERTY_UPLOAD_OPERATIONS,
  AppScreenshotAttributes.JSON_PROPERTY_ASSET_DELIVERY_STATE
})
@JsonTypeName("AppScreenshot_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppScreenshotAttributes {
  public static final String JSON_PROPERTY_FILE_SIZE = "fileSize";
  private Integer fileSize;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_SOURCE_FILE_CHECKSUM = "sourceFileChecksum";
  private String sourceFileChecksum;

  public static final String JSON_PROPERTY_IMAGE_ASSET = "imageAsset";
  private ImageAsset imageAsset;

  public static final String JSON_PROPERTY_ASSET_TOKEN = "assetToken";
  private String assetToken;

  public static final String JSON_PROPERTY_ASSET_TYPE = "assetType";
  private String assetType;

  public static final String JSON_PROPERTY_UPLOAD_OPERATIONS = "uploadOperations";
  private List<UploadOperation> uploadOperations = new ArrayList<>();

  public static final String JSON_PROPERTY_ASSET_DELIVERY_STATE = "assetDeliveryState";
  private AppMediaAssetState assetDeliveryState;

  public AppScreenshotAttributes() { 
  }

  public AppScreenshotAttributes fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Get fileSize
   * @return fileSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFileSize() {
    return fileSize;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }


  public AppScreenshotAttributes fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public AppScreenshotAttributes sourceFileChecksum(String sourceFileChecksum) {
    this.sourceFileChecksum = sourceFileChecksum;
    return this;
  }

   /**
   * Get sourceFileChecksum
   * @return sourceFileChecksum
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_FILE_CHECKSUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceFileChecksum() {
    return sourceFileChecksum;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_FILE_CHECKSUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceFileChecksum(String sourceFileChecksum) {
    this.sourceFileChecksum = sourceFileChecksum;
  }


  public AppScreenshotAttributes imageAsset(ImageAsset imageAsset) {
    this.imageAsset = imageAsset;
    return this;
  }

   /**
   * Get imageAsset
   * @return imageAsset
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ImageAsset getImageAsset() {
    return imageAsset;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageAsset(ImageAsset imageAsset) {
    this.imageAsset = imageAsset;
  }


  public AppScreenshotAttributes assetToken(String assetToken) {
    this.assetToken = assetToken;
    return this;
  }

   /**
   * Get assetToken
   * @return assetToken
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSET_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssetToken() {
    return assetToken;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetToken(String assetToken) {
    this.assetToken = assetToken;
  }


  public AppScreenshotAttributes assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssetType() {
    return assetType;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }


  public AppScreenshotAttributes uploadOperations(List<UploadOperation> uploadOperations) {
    this.uploadOperations = uploadOperations;
    return this;
  }

  public AppScreenshotAttributes addUploadOperationsItem(UploadOperation uploadOperationsItem) {
    if (this.uploadOperations == null) {
      this.uploadOperations = new ArrayList<>();
    }
    this.uploadOperations.add(uploadOperationsItem);
    return this;
  }

   /**
   * Get uploadOperations
   * @return uploadOperations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPLOAD_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UploadOperation> getUploadOperations() {
    return uploadOperations;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadOperations(List<UploadOperation> uploadOperations) {
    this.uploadOperations = uploadOperations;
  }


  public AppScreenshotAttributes assetDeliveryState(AppMediaAssetState assetDeliveryState) {
    this.assetDeliveryState = assetDeliveryState;
    return this;
  }

   /**
   * Get assetDeliveryState
   * @return assetDeliveryState
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSET_DELIVERY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppMediaAssetState getAssetDeliveryState() {
    return assetDeliveryState;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_DELIVERY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetDeliveryState(AppMediaAssetState assetDeliveryState) {
    this.assetDeliveryState = assetDeliveryState;
  }


  /**
   * Return true if this AppScreenshot_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppScreenshotAttributes appScreenshotAttributes = (AppScreenshotAttributes) o;
    return Objects.equals(this.fileSize, appScreenshotAttributes.fileSize) &&
        Objects.equals(this.fileName, appScreenshotAttributes.fileName) &&
        Objects.equals(this.sourceFileChecksum, appScreenshotAttributes.sourceFileChecksum) &&
        Objects.equals(this.imageAsset, appScreenshotAttributes.imageAsset) &&
        Objects.equals(this.assetToken, appScreenshotAttributes.assetToken) &&
        Objects.equals(this.assetType, appScreenshotAttributes.assetType) &&
        Objects.equals(this.uploadOperations, appScreenshotAttributes.uploadOperations) &&
        Objects.equals(this.assetDeliveryState, appScreenshotAttributes.assetDeliveryState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, fileName, sourceFileChecksum, imageAsset, assetToken, assetType, uploadOperations, assetDeliveryState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppScreenshotAttributes {\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    sourceFileChecksum: ").append(toIndentedString(sourceFileChecksum)).append("\n");
    sb.append("    imageAsset: ").append(toIndentedString(imageAsset)).append("\n");
    sb.append("    assetToken: ").append(toIndentedString(assetToken)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    uploadOperations: ").append(toIndentedString(uploadOperations)).append("\n");
    sb.append("    assetDeliveryState: ").append(toIndentedString(assetDeliveryState)).append("\n");
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

