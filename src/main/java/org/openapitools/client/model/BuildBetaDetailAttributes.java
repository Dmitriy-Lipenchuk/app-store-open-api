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
import org.openapitools.client.model.ExternalBetaState;
import org.openapitools.client.model.InternalBetaState;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * BuildBetaDetailAttributes
 */
@JsonPropertyOrder({
  BuildBetaDetailAttributes.JSON_PROPERTY_AUTO_NOTIFY_ENABLED,
  BuildBetaDetailAttributes.JSON_PROPERTY_INTERNAL_BUILD_STATE,
  BuildBetaDetailAttributes.JSON_PROPERTY_EXTERNAL_BUILD_STATE
})
@JsonTypeName("BuildBetaDetail_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BuildBetaDetailAttributes {
  public static final String JSON_PROPERTY_AUTO_NOTIFY_ENABLED = "autoNotifyEnabled";
  private Boolean autoNotifyEnabled;

  public static final String JSON_PROPERTY_INTERNAL_BUILD_STATE = "internalBuildState";
  private InternalBetaState internalBuildState;

  public static final String JSON_PROPERTY_EXTERNAL_BUILD_STATE = "externalBuildState";
  private ExternalBetaState externalBuildState;

  public BuildBetaDetailAttributes() { 
  }

  public BuildBetaDetailAttributes autoNotifyEnabled(Boolean autoNotifyEnabled) {
    this.autoNotifyEnabled = autoNotifyEnabled;
    return this;
  }

   /**
   * Get autoNotifyEnabled
   * @return autoNotifyEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_NOTIFY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoNotifyEnabled() {
    return autoNotifyEnabled;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_NOTIFY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoNotifyEnabled(Boolean autoNotifyEnabled) {
    this.autoNotifyEnabled = autoNotifyEnabled;
  }


  public BuildBetaDetailAttributes internalBuildState(InternalBetaState internalBuildState) {
    this.internalBuildState = internalBuildState;
    return this;
  }

   /**
   * Get internalBuildState
   * @return internalBuildState
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERNAL_BUILD_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InternalBetaState getInternalBuildState() {
    return internalBuildState;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL_BUILD_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternalBuildState(InternalBetaState internalBuildState) {
    this.internalBuildState = internalBuildState;
  }


  public BuildBetaDetailAttributes externalBuildState(ExternalBetaState externalBuildState) {
    this.externalBuildState = externalBuildState;
    return this;
  }

   /**
   * Get externalBuildState
   * @return externalBuildState
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_BUILD_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExternalBetaState getExternalBuildState() {
    return externalBuildState;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_BUILD_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalBuildState(ExternalBetaState externalBuildState) {
    this.externalBuildState = externalBuildState;
  }


  /**
   * Return true if this BuildBetaDetail_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildBetaDetailAttributes buildBetaDetailAttributes = (BuildBetaDetailAttributes) o;
    return Objects.equals(this.autoNotifyEnabled, buildBetaDetailAttributes.autoNotifyEnabled) &&
        Objects.equals(this.internalBuildState, buildBetaDetailAttributes.internalBuildState) &&
        Objects.equals(this.externalBuildState, buildBetaDetailAttributes.externalBuildState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoNotifyEnabled, internalBuildState, externalBuildState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildBetaDetailAttributes {\n");
    sb.append("    autoNotifyEnabled: ").append(toIndentedString(autoNotifyEnabled)).append("\n");
    sb.append("    internalBuildState: ").append(toIndentedString(internalBuildState)).append("\n");
    sb.append("    externalBuildState: ").append(toIndentedString(externalBuildState)).append("\n");
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

