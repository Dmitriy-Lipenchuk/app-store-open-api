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
import org.openapitools.client.model.UploadOperation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppStoreReviewAttachmentAttributes
 */
@JsonPropertyOrder({
  AppStoreReviewAttachmentAttributes.JSON_PROPERTY_FILE_SIZE,
  AppStoreReviewAttachmentAttributes.JSON_PROPERTY_FILE_NAME,
  AppStoreReviewAttachmentAttributes.JSON_PROPERTY_SOURCE_FILE_CHECKSUM,
  AppStoreReviewAttachmentAttributes.JSON_PROPERTY_UPLOAD_OPERATIONS,
  AppStoreReviewAttachmentAttributes.JSON_PROPERTY_ASSET_DELIVERY_STATE
})
@JsonTypeName("AppStoreReviewAttachment_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppStoreReviewAttachmentAttributes {
  public static final String JSON_PROPERTY_FILE_SIZE = "fileSize";
  private Integer fileSize;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_SOURCE_FILE_CHECKSUM = "sourceFileChecksum";
  private String sourceFileChecksum;

  public static final String JSON_PROPERTY_UPLOAD_OPERATIONS = "uploadOperations";
  private List<UploadOperation> uploadOperations = new ArrayList<>();

  public static final String JSON_PROPERTY_ASSET_DELIVERY_STATE = "assetDeliveryState";
  private AppMediaAssetState assetDeliveryState;

  public AppStoreReviewAttachmentAttributes() { 
  }

  public AppStoreReviewAttachmentAttributes fileSize(Integer fileSize) {
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


  public AppStoreReviewAttachmentAttributes fileName(String fileName) {
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


  public AppStoreReviewAttachmentAttributes sourceFileChecksum(String sourceFileChecksum) {
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


  public AppStoreReviewAttachmentAttributes uploadOperations(List<UploadOperation> uploadOperations) {
    this.uploadOperations = uploadOperations;
    return this;
  }

  public AppStoreReviewAttachmentAttributes addUploadOperationsItem(UploadOperation uploadOperationsItem) {
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


  public AppStoreReviewAttachmentAttributes assetDeliveryState(AppMediaAssetState assetDeliveryState) {
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
   * Return true if this AppStoreReviewAttachment_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreReviewAttachmentAttributes appStoreReviewAttachmentAttributes = (AppStoreReviewAttachmentAttributes) o;
    return Objects.equals(this.fileSize, appStoreReviewAttachmentAttributes.fileSize) &&
        Objects.equals(this.fileName, appStoreReviewAttachmentAttributes.fileName) &&
        Objects.equals(this.sourceFileChecksum, appStoreReviewAttachmentAttributes.sourceFileChecksum) &&
        Objects.equals(this.uploadOperations, appStoreReviewAttachmentAttributes.uploadOperations) &&
        Objects.equals(this.assetDeliveryState, appStoreReviewAttachmentAttributes.assetDeliveryState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, fileName, sourceFileChecksum, uploadOperations, assetDeliveryState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreReviewAttachmentAttributes {\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    sourceFileChecksum: ").append(toIndentedString(sourceFileChecksum)).append("\n");
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

