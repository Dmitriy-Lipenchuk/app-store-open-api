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
import org.openapitools.client.model.CiTestDestinationKind;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * CiTestDestination
 */
@JsonPropertyOrder({
  CiTestDestination.JSON_PROPERTY_DEVICE_TYPE_NAME,
  CiTestDestination.JSON_PROPERTY_DEVICE_TYPE_IDENTIFIER,
  CiTestDestination.JSON_PROPERTY_RUNTIME_NAME,
  CiTestDestination.JSON_PROPERTY_RUNTIME_IDENTIFIER,
  CiTestDestination.JSON_PROPERTY_KIND
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CiTestDestination {
  public static final String JSON_PROPERTY_DEVICE_TYPE_NAME = "deviceTypeName";
  private String deviceTypeName;

  public static final String JSON_PROPERTY_DEVICE_TYPE_IDENTIFIER = "deviceTypeIdentifier";
  private String deviceTypeIdentifier;

  public static final String JSON_PROPERTY_RUNTIME_NAME = "runtimeName";
  private String runtimeName;

  public static final String JSON_PROPERTY_RUNTIME_IDENTIFIER = "runtimeIdentifier";
  private String runtimeIdentifier;

  public static final String JSON_PROPERTY_KIND = "kind";
  private CiTestDestinationKind kind;

  public CiTestDestination() { 
  }

  public CiTestDestination deviceTypeName(String deviceTypeName) {
    this.deviceTypeName = deviceTypeName;
    return this;
  }

   /**
   * Get deviceTypeName
   * @return deviceTypeName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceTypeName() {
    return deviceTypeName;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceTypeName(String deviceTypeName) {
    this.deviceTypeName = deviceTypeName;
  }


  public CiTestDestination deviceTypeIdentifier(String deviceTypeIdentifier) {
    this.deviceTypeIdentifier = deviceTypeIdentifier;
    return this;
  }

   /**
   * Get deviceTypeIdentifier
   * @return deviceTypeIdentifier
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceTypeIdentifier() {
    return deviceTypeIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_TYPE_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceTypeIdentifier(String deviceTypeIdentifier) {
    this.deviceTypeIdentifier = deviceTypeIdentifier;
  }


  public CiTestDestination runtimeName(String runtimeName) {
    this.runtimeName = runtimeName;
    return this;
  }

   /**
   * Get runtimeName
   * @return runtimeName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUNTIME_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRuntimeName() {
    return runtimeName;
  }


  @JsonProperty(JSON_PROPERTY_RUNTIME_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuntimeName(String runtimeName) {
    this.runtimeName = runtimeName;
  }


  public CiTestDestination runtimeIdentifier(String runtimeIdentifier) {
    this.runtimeIdentifier = runtimeIdentifier;
    return this;
  }

   /**
   * Get runtimeIdentifier
   * @return runtimeIdentifier
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUNTIME_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRuntimeIdentifier() {
    return runtimeIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_RUNTIME_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuntimeIdentifier(String runtimeIdentifier) {
    this.runtimeIdentifier = runtimeIdentifier;
  }


  public CiTestDestination kind(CiTestDestinationKind kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CiTestDestinationKind getKind() {
    return kind;
  }


  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKind(CiTestDestinationKind kind) {
    this.kind = kind;
  }


  /**
   * Return true if this CiTestDestination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CiTestDestination ciTestDestination = (CiTestDestination) o;
    return Objects.equals(this.deviceTypeName, ciTestDestination.deviceTypeName) &&
        Objects.equals(this.deviceTypeIdentifier, ciTestDestination.deviceTypeIdentifier) &&
        Objects.equals(this.runtimeName, ciTestDestination.runtimeName) &&
        Objects.equals(this.runtimeIdentifier, ciTestDestination.runtimeIdentifier) &&
        Objects.equals(this.kind, ciTestDestination.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceTypeName, deviceTypeIdentifier, runtimeName, runtimeIdentifier, kind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CiTestDestination {\n");
    sb.append("    deviceTypeName: ").append(toIndentedString(deviceTypeName)).append("\n");
    sb.append("    deviceTypeIdentifier: ").append(toIndentedString(deviceTypeIdentifier)).append("\n");
    sb.append("    runtimeName: ").append(toIndentedString(runtimeName)).append("\n");
    sb.append("    runtimeIdentifier: ").append(toIndentedString(runtimeIdentifier)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

