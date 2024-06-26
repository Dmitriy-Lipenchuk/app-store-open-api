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
 * PromotedPurchaseCreateRequestDataAttributes
 */
@JsonPropertyOrder({
  PromotedPurchaseCreateRequestDataAttributes.JSON_PROPERTY_VISIBLE_FOR_ALL_USERS,
  PromotedPurchaseCreateRequestDataAttributes.JSON_PROPERTY_ENABLED
})
@JsonTypeName("PromotedPurchaseCreateRequest_data_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class PromotedPurchaseCreateRequestDataAttributes {
  public static final String JSON_PROPERTY_VISIBLE_FOR_ALL_USERS = "visibleForAllUsers";
  private Boolean visibleForAllUsers;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public PromotedPurchaseCreateRequestDataAttributes() { 
  }

  public PromotedPurchaseCreateRequestDataAttributes visibleForAllUsers(Boolean visibleForAllUsers) {
    this.visibleForAllUsers = visibleForAllUsers;
    return this;
  }

   /**
   * Get visibleForAllUsers
   * @return visibleForAllUsers
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VISIBLE_FOR_ALL_USERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getVisibleForAllUsers() {
    return visibleForAllUsers;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_FOR_ALL_USERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVisibleForAllUsers(Boolean visibleForAllUsers) {
    this.visibleForAllUsers = visibleForAllUsers;
  }


  public PromotedPurchaseCreateRequestDataAttributes enabled(Boolean enabled) {
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


  /**
   * Return true if this PromotedPurchaseCreateRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotedPurchaseCreateRequestDataAttributes promotedPurchaseCreateRequestDataAttributes = (PromotedPurchaseCreateRequestDataAttributes) o;
    return Objects.equals(this.visibleForAllUsers, promotedPurchaseCreateRequestDataAttributes.visibleForAllUsers) &&
        Objects.equals(this.enabled, promotedPurchaseCreateRequestDataAttributes.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visibleForAllUsers, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotedPurchaseCreateRequestDataAttributes {\n");
    sb.append("    visibleForAllUsers: ").append(toIndentedString(visibleForAllUsers)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

