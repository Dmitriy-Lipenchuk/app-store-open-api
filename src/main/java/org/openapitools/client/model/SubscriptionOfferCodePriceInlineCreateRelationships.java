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
import org.openapitools.client.model.SubscriptionIntroductoryOfferInlineCreateRelationshipsSubscriptionPricePoint;
import org.openapitools.client.model.SubscriptionIntroductoryOfferInlineCreateRelationshipsTerritory;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * SubscriptionOfferCodePriceInlineCreateRelationships
 */
@JsonPropertyOrder({
  SubscriptionOfferCodePriceInlineCreateRelationships.JSON_PROPERTY_TERRITORY,
  SubscriptionOfferCodePriceInlineCreateRelationships.JSON_PROPERTY_SUBSCRIPTION_PRICE_POINT
})
@JsonTypeName("SubscriptionOfferCodePriceInlineCreate_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionOfferCodePriceInlineCreateRelationships {
  public static final String JSON_PROPERTY_TERRITORY = "territory";
  private SubscriptionIntroductoryOfferInlineCreateRelationshipsTerritory territory;

  public static final String JSON_PROPERTY_SUBSCRIPTION_PRICE_POINT = "subscriptionPricePoint";
  private SubscriptionIntroductoryOfferInlineCreateRelationshipsSubscriptionPricePoint subscriptionPricePoint;

  public SubscriptionOfferCodePriceInlineCreateRelationships() { 
  }

  public SubscriptionOfferCodePriceInlineCreateRelationships territory(SubscriptionIntroductoryOfferInlineCreateRelationshipsTerritory territory) {
    this.territory = territory;
    return this;
  }

   /**
   * Get territory
   * @return territory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERRITORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionIntroductoryOfferInlineCreateRelationshipsTerritory getTerritory() {
    return territory;
  }


  @JsonProperty(JSON_PROPERTY_TERRITORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerritory(SubscriptionIntroductoryOfferInlineCreateRelationshipsTerritory territory) {
    this.territory = territory;
  }


  public SubscriptionOfferCodePriceInlineCreateRelationships subscriptionPricePoint(SubscriptionIntroductoryOfferInlineCreateRelationshipsSubscriptionPricePoint subscriptionPricePoint) {
    this.subscriptionPricePoint = subscriptionPricePoint;
    return this;
  }

   /**
   * Get subscriptionPricePoint
   * @return subscriptionPricePoint
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_PRICE_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionIntroductoryOfferInlineCreateRelationshipsSubscriptionPricePoint getSubscriptionPricePoint() {
    return subscriptionPricePoint;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_PRICE_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionPricePoint(SubscriptionIntroductoryOfferInlineCreateRelationshipsSubscriptionPricePoint subscriptionPricePoint) {
    this.subscriptionPricePoint = subscriptionPricePoint;
  }


  /**
   * Return true if this SubscriptionOfferCodePriceInlineCreate_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionOfferCodePriceInlineCreateRelationships subscriptionOfferCodePriceInlineCreateRelationships = (SubscriptionOfferCodePriceInlineCreateRelationships) o;
    return Objects.equals(this.territory, subscriptionOfferCodePriceInlineCreateRelationships.territory) &&
        Objects.equals(this.subscriptionPricePoint, subscriptionOfferCodePriceInlineCreateRelationships.subscriptionPricePoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(territory, subscriptionPricePoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionOfferCodePriceInlineCreateRelationships {\n");
    sb.append("    territory: ").append(toIndentedString(territory)).append("\n");
    sb.append("    subscriptionPricePoint: ").append(toIndentedString(subscriptionPricePoint)).append("\n");
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
