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
import org.openapitools.client.model.SubscriptionAppStoreReviewScreenshotCreateRequestDataRelationshipsSubscription;
import org.openapitools.client.model.SubscriptionPromotionalOfferCreateRequestDataRelationshipsPrices;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * SubscriptionPromotionalOfferCreateRequestDataRelationships
 */
@JsonPropertyOrder({
  SubscriptionPromotionalOfferCreateRequestDataRelationships.JSON_PROPERTY_SUBSCRIPTION,
  SubscriptionPromotionalOfferCreateRequestDataRelationships.JSON_PROPERTY_PRICES
})
@JsonTypeName("SubscriptionPromotionalOfferCreateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionPromotionalOfferCreateRequestDataRelationships {
  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  private SubscriptionAppStoreReviewScreenshotCreateRequestDataRelationshipsSubscription subscription;

  public static final String JSON_PROPERTY_PRICES = "prices";
  private SubscriptionPromotionalOfferCreateRequestDataRelationshipsPrices prices;

  public SubscriptionPromotionalOfferCreateRequestDataRelationships() { 
  }

  public SubscriptionPromotionalOfferCreateRequestDataRelationships subscription(SubscriptionAppStoreReviewScreenshotCreateRequestDataRelationshipsSubscription subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SubscriptionAppStoreReviewScreenshotCreateRequestDataRelationshipsSubscription getSubscription() {
    return subscription;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscription(SubscriptionAppStoreReviewScreenshotCreateRequestDataRelationshipsSubscription subscription) {
    this.subscription = subscription;
  }


  public SubscriptionPromotionalOfferCreateRequestDataRelationships prices(SubscriptionPromotionalOfferCreateRequestDataRelationshipsPrices prices) {
    this.prices = prices;
    return this;
  }

   /**
   * Get prices
   * @return prices
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SubscriptionPromotionalOfferCreateRequestDataRelationshipsPrices getPrices() {
    return prices;
  }


  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrices(SubscriptionPromotionalOfferCreateRequestDataRelationshipsPrices prices) {
    this.prices = prices;
  }


  /**
   * Return true if this SubscriptionPromotionalOfferCreateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPromotionalOfferCreateRequestDataRelationships subscriptionPromotionalOfferCreateRequestDataRelationships = (SubscriptionPromotionalOfferCreateRequestDataRelationships) o;
    return Objects.equals(this.subscription, subscriptionPromotionalOfferCreateRequestDataRelationships.subscription) &&
        Objects.equals(this.prices, subscriptionPromotionalOfferCreateRequestDataRelationships.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscription, prices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPromotionalOfferCreateRequestDataRelationships {\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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
