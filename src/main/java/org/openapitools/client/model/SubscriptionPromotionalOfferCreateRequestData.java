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
import org.openapitools.client.model.SubscriptionPromotionalOfferCreateRequestDataRelationships;
import org.openapitools.client.model.SubscriptionPromotionalOfferInlineCreateAttributes;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * SubscriptionPromotionalOfferCreateRequestData
 */
@JsonPropertyOrder({
  SubscriptionPromotionalOfferCreateRequestData.JSON_PROPERTY_TYPE,
  SubscriptionPromotionalOfferCreateRequestData.JSON_PROPERTY_ATTRIBUTES,
  SubscriptionPromotionalOfferCreateRequestData.JSON_PROPERTY_RELATIONSHIPS
})
@JsonTypeName("SubscriptionPromotionalOfferCreateRequest_data")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionPromotionalOfferCreateRequestData {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    SUBSCRIPTIONPROMOTIONALOFFERS("subscriptionPromotionalOffers");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SubscriptionPromotionalOfferInlineCreateAttributes attributes;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private SubscriptionPromotionalOfferCreateRequestDataRelationships relationships;

  public SubscriptionPromotionalOfferCreateRequestData() { 
  }

  public SubscriptionPromotionalOfferCreateRequestData type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public SubscriptionPromotionalOfferCreateRequestData attributes(SubscriptionPromotionalOfferInlineCreateAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SubscriptionPromotionalOfferInlineCreateAttributes getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttributes(SubscriptionPromotionalOfferInlineCreateAttributes attributes) {
    this.attributes = attributes;
  }


  public SubscriptionPromotionalOfferCreateRequestData relationships(SubscriptionPromotionalOfferCreateRequestDataRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SubscriptionPromotionalOfferCreateRequestDataRelationships getRelationships() {
    return relationships;
  }


  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRelationships(SubscriptionPromotionalOfferCreateRequestDataRelationships relationships) {
    this.relationships = relationships;
  }


  /**
   * Return true if this SubscriptionPromotionalOfferCreateRequest_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPromotionalOfferCreateRequestData subscriptionPromotionalOfferCreateRequestData = (SubscriptionPromotionalOfferCreateRequestData) o;
    return Objects.equals(this.type, subscriptionPromotionalOfferCreateRequestData.type) &&
        Objects.equals(this.attributes, subscriptionPromotionalOfferCreateRequestData.attributes) &&
        Objects.equals(this.relationships, subscriptionPromotionalOfferCreateRequestData.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, attributes, relationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPromotionalOfferCreateRequestData {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

