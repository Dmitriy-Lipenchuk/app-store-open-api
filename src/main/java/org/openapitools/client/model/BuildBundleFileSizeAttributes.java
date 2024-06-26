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
 * BuildBundleFileSizeAttributes
 */
@JsonPropertyOrder({
  BuildBundleFileSizeAttributes.JSON_PROPERTY_DEVICE_MODEL,
  BuildBundleFileSizeAttributes.JSON_PROPERTY_OS_VERSION,
  BuildBundleFileSizeAttributes.JSON_PROPERTY_DOWNLOAD_BYTES,
  BuildBundleFileSizeAttributes.JSON_PROPERTY_INSTALL_BYTES
})
@JsonTypeName("BuildBundleFileSize_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BuildBundleFileSizeAttributes {
  public static final String JSON_PROPERTY_DEVICE_MODEL = "deviceModel";
  private String deviceModel;

  public static final String JSON_PROPERTY_OS_VERSION = "osVersion";
  private String osVersion;

  public static final String JSON_PROPERTY_DOWNLOAD_BYTES = "downloadBytes";
  private Integer downloadBytes;

  public static final String JSON_PROPERTY_INSTALL_BYTES = "installBytes";
  private Integer installBytes;

  public BuildBundleFileSizeAttributes() { 
  }

  public BuildBundleFileSizeAttributes deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

   /**
   * Get deviceModel
   * @return deviceModel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceModel() {
    return deviceModel;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }


  public BuildBundleFileSizeAttributes osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

   /**
   * Get osVersion
   * @return osVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOsVersion() {
    return osVersion;
  }


  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  public BuildBundleFileSizeAttributes downloadBytes(Integer downloadBytes) {
    this.downloadBytes = downloadBytes;
    return this;
  }

   /**
   * Get downloadBytes
   * @return downloadBytes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDownloadBytes() {
    return downloadBytes;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadBytes(Integer downloadBytes) {
    this.downloadBytes = downloadBytes;
  }


  public BuildBundleFileSizeAttributes installBytes(Integer installBytes) {
    this.installBytes = installBytes;
    return this;
  }

   /**
   * Get installBytes
   * @return installBytes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTALL_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInstallBytes() {
    return installBytes;
  }


  @JsonProperty(JSON_PROPERTY_INSTALL_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstallBytes(Integer installBytes) {
    this.installBytes = installBytes;
  }


  /**
   * Return true if this BuildBundleFileSize_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildBundleFileSizeAttributes buildBundleFileSizeAttributes = (BuildBundleFileSizeAttributes) o;
    return Objects.equals(this.deviceModel, buildBundleFileSizeAttributes.deviceModel) &&
        Objects.equals(this.osVersion, buildBundleFileSizeAttributes.osVersion) &&
        Objects.equals(this.downloadBytes, buildBundleFileSizeAttributes.downloadBytes) &&
        Objects.equals(this.installBytes, buildBundleFileSizeAttributes.installBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceModel, osVersion, downloadBytes, installBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildBundleFileSizeAttributes {\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    downloadBytes: ").append(toIndentedString(downloadBytes)).append("\n");
    sb.append("    installBytes: ").append(toIndentedString(installBytes)).append("\n");
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

