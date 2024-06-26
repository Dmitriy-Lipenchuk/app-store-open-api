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
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.client.model.CiTestStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * CiTestResultAttributesDestinationTestResultsInner
 */
@JsonPropertyOrder({
  CiTestResultAttributesDestinationTestResultsInner.JSON_PROPERTY_UUID,
  CiTestResultAttributesDestinationTestResultsInner.JSON_PROPERTY_DEVICE_NAME,
  CiTestResultAttributesDestinationTestResultsInner.JSON_PROPERTY_OS_VERSION,
  CiTestResultAttributesDestinationTestResultsInner.JSON_PROPERTY_STATUS,
  CiTestResultAttributesDestinationTestResultsInner.JSON_PROPERTY_DURATION
})
@JsonTypeName("CiTestResult_attributes_destinationTestResults_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CiTestResultAttributesDestinationTestResultsInner {
  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public static final String JSON_PROPERTY_DEVICE_NAME = "deviceName";
  private String deviceName;

  public static final String JSON_PROPERTY_OS_VERSION = "osVersion";
  private String osVersion;

  public static final String JSON_PROPERTY_STATUS = "status";
  private CiTestStatus status;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private BigDecimal duration;

  public CiTestResultAttributesDestinationTestResultsInner() { 
  }

  public CiTestResultAttributesDestinationTestResultsInner uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUuid() {
    return uuid;
  }


  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public CiTestResultAttributesDestinationTestResultsInner deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

   /**
   * Get deviceName
   * @return deviceName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceName() {
    return deviceName;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }


  public CiTestResultAttributesDestinationTestResultsInner osVersion(String osVersion) {
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


  public CiTestResultAttributesDestinationTestResultsInner status(CiTestStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CiTestStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(CiTestStatus status) {
    this.status = status;
  }


  public CiTestResultAttributesDestinationTestResultsInner duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }


  /**
   * Return true if this CiTestResult_attributes_destinationTestResults_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CiTestResultAttributesDestinationTestResultsInner ciTestResultAttributesDestinationTestResultsInner = (CiTestResultAttributesDestinationTestResultsInner) o;
    return Objects.equals(this.uuid, ciTestResultAttributesDestinationTestResultsInner.uuid) &&
        Objects.equals(this.deviceName, ciTestResultAttributesDestinationTestResultsInner.deviceName) &&
        Objects.equals(this.osVersion, ciTestResultAttributesDestinationTestResultsInner.osVersion) &&
        Objects.equals(this.status, ciTestResultAttributesDestinationTestResultsInner.status) &&
        Objects.equals(this.duration, ciTestResultAttributesDestinationTestResultsInner.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, deviceName, osVersion, status, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CiTestResultAttributesDestinationTestResultsInner {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
