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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * CustomerReviewResponseV1Attributes
 */
@JsonPropertyOrder({
  CustomerReviewResponseV1Attributes.JSON_PROPERTY_RESPONSE_BODY,
  CustomerReviewResponseV1Attributes.JSON_PROPERTY_LAST_MODIFIED_DATE,
  CustomerReviewResponseV1Attributes.JSON_PROPERTY_STATE
})
@JsonTypeName("CustomerReviewResponseV1_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CustomerReviewResponseV1Attributes {
  public static final String JSON_PROPERTY_RESPONSE_BODY = "responseBody";
  private String responseBody;

  public static final String JSON_PROPERTY_LAST_MODIFIED_DATE = "lastModifiedDate";
  private OffsetDateTime lastModifiedDate;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    PUBLISHED("PUBLISHED"),
    
    PENDING_PUBLISH("PENDING_PUBLISH");

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

  public CustomerReviewResponseV1Attributes() { 
  }

  public CustomerReviewResponseV1Attributes responseBody(String responseBody) {
    this.responseBody = responseBody;
    return this;
  }

   /**
   * Get responseBody
   * @return responseBody
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResponseBody() {
    return responseBody;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseBody(String responseBody) {
    this.responseBody = responseBody;
  }


  public CustomerReviewResponseV1Attributes lastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public CustomerReviewResponseV1Attributes state(StateEnum state) {
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
   * Return true if this CustomerReviewResponseV1_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerReviewResponseV1Attributes customerReviewResponseV1Attributes = (CustomerReviewResponseV1Attributes) o;
    return Objects.equals(this.responseBody, customerReviewResponseV1Attributes.responseBody) &&
        Objects.equals(this.lastModifiedDate, customerReviewResponseV1Attributes.lastModifiedDate) &&
        Objects.equals(this.state, customerReviewResponseV1Attributes.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseBody, lastModifiedDate, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerReviewResponseV1Attributes {\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
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

