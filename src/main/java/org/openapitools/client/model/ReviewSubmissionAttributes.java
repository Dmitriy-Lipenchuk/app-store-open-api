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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.Platform;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * ReviewSubmissionAttributes
 */
@JsonPropertyOrder({
  ReviewSubmissionAttributes.JSON_PROPERTY_PLATFORM,
  ReviewSubmissionAttributes.JSON_PROPERTY_SUBMITTED_DATE,
  ReviewSubmissionAttributes.JSON_PROPERTY_STATE
})
@JsonTypeName("ReviewSubmission_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class ReviewSubmissionAttributes {
  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private Platform platform;

  public static final String JSON_PROPERTY_SUBMITTED_DATE = "submittedDate";
  private OffsetDateTime submittedDate;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    READY_FOR_REVIEW("READY_FOR_REVIEW"),
    
    WAITING_FOR_REVIEW("WAITING_FOR_REVIEW"),
    
    IN_REVIEW("IN_REVIEW"),
    
    UNRESOLVED_ISSUES("UNRESOLVED_ISSUES"),
    
    CANCELING("CANCELING"),
    
    COMPLETING("COMPLETING"),
    
    COMPLETE("COMPLETE");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATE = "state";
  private StateEnum state;

  public ReviewSubmissionAttributes() { 
  }

  public ReviewSubmissionAttributes platform(Platform platform) {
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


  public ReviewSubmissionAttributes submittedDate(OffsetDateTime submittedDate) {
    this.submittedDate = submittedDate;
    return this;
  }

   /**
   * Get submittedDate
   * @return submittedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBMITTED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSubmittedDate() {
    return submittedDate;
  }


  @JsonProperty(JSON_PROPERTY_SUBMITTED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubmittedDate(OffsetDateTime submittedDate) {
    this.submittedDate = submittedDate;
  }


  public ReviewSubmissionAttributes state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StateEnum getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * Return true if this ReviewSubmission_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewSubmissionAttributes reviewSubmissionAttributes = (ReviewSubmissionAttributes) o;
    return Objects.equals(this.platform, reviewSubmissionAttributes.platform) &&
        Objects.equals(this.submittedDate, reviewSubmissionAttributes.submittedDate) &&
        Objects.equals(this.state, reviewSubmissionAttributes.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, submittedDate, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewSubmissionAttributes {\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
