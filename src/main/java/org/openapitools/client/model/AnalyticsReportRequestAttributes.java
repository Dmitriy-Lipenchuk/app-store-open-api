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
 * AnalyticsReportRequestAttributes
 */
@JsonPropertyOrder({
  AnalyticsReportRequestAttributes.JSON_PROPERTY_ACCESS_TYPE,
  AnalyticsReportRequestAttributes.JSON_PROPERTY_STOPPED_DUE_TO_INACTIVITY
})
@JsonTypeName("AnalyticsReportRequest_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AnalyticsReportRequestAttributes {
  /**
   * Gets or Sets accessType
   */
  public enum AccessTypeEnum {
    ONE_TIME_SNAPSHOT("ONE_TIME_SNAPSHOT"),
    
    ONGOING("ONGOING");

    private String value;

    AccessTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccessTypeEnum fromValue(String value) {
      for (AccessTypeEnum b : AccessTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACCESS_TYPE = "accessType";
  private AccessTypeEnum accessType;

  public static final String JSON_PROPERTY_STOPPED_DUE_TO_INACTIVITY = "stoppedDueToInactivity";
  private Boolean stoppedDueToInactivity;

  public AnalyticsReportRequestAttributes() { 
  }

  public AnalyticsReportRequestAttributes accessType(AccessTypeEnum accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccessTypeEnum getAccessType() {
    return accessType;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessType(AccessTypeEnum accessType) {
    this.accessType = accessType;
  }


  public AnalyticsReportRequestAttributes stoppedDueToInactivity(Boolean stoppedDueToInactivity) {
    this.stoppedDueToInactivity = stoppedDueToInactivity;
    return this;
  }

   /**
   * Get stoppedDueToInactivity
   * @return stoppedDueToInactivity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STOPPED_DUE_TO_INACTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStoppedDueToInactivity() {
    return stoppedDueToInactivity;
  }


  @JsonProperty(JSON_PROPERTY_STOPPED_DUE_TO_INACTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoppedDueToInactivity(Boolean stoppedDueToInactivity) {
    this.stoppedDueToInactivity = stoppedDueToInactivity;
  }


  /**
   * Return true if this AnalyticsReportRequest_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsReportRequestAttributes analyticsReportRequestAttributes = (AnalyticsReportRequestAttributes) o;
    return Objects.equals(this.accessType, analyticsReportRequestAttributes.accessType) &&
        Objects.equals(this.stoppedDueToInactivity, analyticsReportRequestAttributes.stoppedDueToInactivity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, stoppedDueToInactivity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsReportRequestAttributes {\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    stoppedDueToInactivity: ").append(toIndentedString(stoppedDueToInactivity)).append("\n");
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

