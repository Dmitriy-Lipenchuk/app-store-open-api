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
 * PromotedPurchaseAttributes
 */
@JsonPropertyOrder({
  PromotedPurchaseAttributes.JSON_PROPERTY_VISIBLE_FOR_ALL_USERS,
  PromotedPurchaseAttributes.JSON_PROPERTY_ENABLED,
  PromotedPurchaseAttributes.JSON_PROPERTY_STATE
})
@JsonTypeName("PromotedPurchase_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class PromotedPurchaseAttributes {
  public static final String JSON_PROPERTY_VISIBLE_FOR_ALL_USERS = "visibleForAllUsers";
  private Boolean visibleForAllUsers;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    APPROVED("APPROVED"),
    
    IN_REVIEW("IN_REVIEW"),
    
    PREPARE_FOR_SUBMISSION("PREPARE_FOR_SUBMISSION"),
    
    REJECTED("REJECTED");

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

  public PromotedPurchaseAttributes() { 
  }

  public PromotedPurchaseAttributes visibleForAllUsers(Boolean visibleForAllUsers) {
    this.visibleForAllUsers = visibleForAllUsers;
    return this;
  }

   /**
   * Get visibleForAllUsers
   * @return visibleForAllUsers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE_FOR_ALL_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVisibleForAllUsers() {
    return visibleForAllUsers;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_FOR_ALL_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleForAllUsers(Boolean visibleForAllUsers) {
    this.visibleForAllUsers = visibleForAllUsers;
  }


  public PromotedPurchaseAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public PromotedPurchaseAttributes state(StateEnum state) {
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
   * Return true if this PromotedPurchase_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotedPurchaseAttributes promotedPurchaseAttributes = (PromotedPurchaseAttributes) o;
    return Objects.equals(this.visibleForAllUsers, promotedPurchaseAttributes.visibleForAllUsers) &&
        Objects.equals(this.enabled, promotedPurchaseAttributes.enabled) &&
        Objects.equals(this.state, promotedPurchaseAttributes.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visibleForAllUsers, enabled, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotedPurchaseAttributes {\n");
    sb.append("    visibleForAllUsers: ").append(toIndentedString(visibleForAllUsers)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
