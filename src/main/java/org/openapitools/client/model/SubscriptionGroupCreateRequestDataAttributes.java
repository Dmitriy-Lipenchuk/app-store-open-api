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
 * SubscriptionGroupCreateRequestDataAttributes
 */
@JsonPropertyOrder({
  SubscriptionGroupCreateRequestDataAttributes.JSON_PROPERTY_REFERENCE_NAME
})
@JsonTypeName("SubscriptionGroupCreateRequest_data_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionGroupCreateRequestDataAttributes {
  public static final String JSON_PROPERTY_REFERENCE_NAME = "referenceName";
  private String referenceName;

  public SubscriptionGroupCreateRequestDataAttributes() { 
  }

  public SubscriptionGroupCreateRequestDataAttributes referenceName(String referenceName) {
    this.referenceName = referenceName;
    return this;
  }

   /**
   * Get referenceName
   * @return referenceName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REFERENCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReferenceName() {
    return referenceName;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReferenceName(String referenceName) {
    this.referenceName = referenceName;
  }


  /**
   * Return true if this SubscriptionGroupCreateRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionGroupCreateRequestDataAttributes subscriptionGroupCreateRequestDataAttributes = (SubscriptionGroupCreateRequestDataAttributes) o;
    return Objects.equals(this.referenceName, subscriptionGroupCreateRequestDataAttributes.referenceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionGroupCreateRequestDataAttributes {\n");
    sb.append("    referenceName: ").append(toIndentedString(referenceName)).append("\n");
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

