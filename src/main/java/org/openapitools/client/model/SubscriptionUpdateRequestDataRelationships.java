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
import org.openapitools.client.model.SubscriptionUpdateRequestDataRelationshipsIntroductoryOffers;
import org.openapitools.client.model.SubscriptionUpdateRequestDataRelationshipsPrices;
import org.openapitools.client.model.SubscriptionUpdateRequestDataRelationshipsPromotionalOffers;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * SubscriptionUpdateRequestDataRelationships
 */
@JsonPropertyOrder({
  SubscriptionUpdateRequestDataRelationships.JSON_PROPERTY_INTRODUCTORY_OFFERS,
  SubscriptionUpdateRequestDataRelationships.JSON_PROPERTY_PROMOTIONAL_OFFERS,
  SubscriptionUpdateRequestDataRelationships.JSON_PROPERTY_PRICES
})
@JsonTypeName("SubscriptionUpdateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionUpdateRequestDataRelationships {
  public static final String JSON_PROPERTY_INTRODUCTORY_OFFERS = "introductoryOffers";
  private SubscriptionUpdateRequestDataRelationshipsIntroductoryOffers introductoryOffers;

  public static final String JSON_PROPERTY_PROMOTIONAL_OFFERS = "promotionalOffers";
  private SubscriptionUpdateRequestDataRelationshipsPromotionalOffers promotionalOffers;

  public static final String JSON_PROPERTY_PRICES = "prices";
  private SubscriptionUpdateRequestDataRelationshipsPrices prices;

  public SubscriptionUpdateRequestDataRelationships() { 
  }

  public SubscriptionUpdateRequestDataRelationships introductoryOffers(SubscriptionUpdateRequestDataRelationshipsIntroductoryOffers introductoryOffers) {
    this.introductoryOffers = introductoryOffers;
    return this;
  }

   /**
   * Get introductoryOffers
   * @return introductoryOffers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTRODUCTORY_OFFERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionUpdateRequestDataRelationshipsIntroductoryOffers getIntroductoryOffers() {
    return introductoryOffers;
  }


  @JsonProperty(JSON_PROPERTY_INTRODUCTORY_OFFERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntroductoryOffers(SubscriptionUpdateRequestDataRelationshipsIntroductoryOffers introductoryOffers) {
    this.introductoryOffers = introductoryOffers;
  }


  public SubscriptionUpdateRequestDataRelationships promotionalOffers(SubscriptionUpdateRequestDataRelationshipsPromotionalOffers promotionalOffers) {
    this.promotionalOffers = promotionalOffers;
    return this;
  }

   /**
   * Get promotionalOffers
   * @return promotionalOffers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROMOTIONAL_OFFERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionUpdateRequestDataRelationshipsPromotionalOffers getPromotionalOffers() {
    return promotionalOffers;
  }


  @JsonProperty(JSON_PROPERTY_PROMOTIONAL_OFFERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPromotionalOffers(SubscriptionUpdateRequestDataRelationshipsPromotionalOffers promotionalOffers) {
    this.promotionalOffers = promotionalOffers;
  }


  public SubscriptionUpdateRequestDataRelationships prices(SubscriptionUpdateRequestDataRelationshipsPrices prices) {
    this.prices = prices;
    return this;
  }

   /**
   * Get prices
   * @return prices
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionUpdateRequestDataRelationshipsPrices getPrices() {
    return prices;
  }


  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrices(SubscriptionUpdateRequestDataRelationshipsPrices prices) {
    this.prices = prices;
  }


  /**
   * Return true if this SubscriptionUpdateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionUpdateRequestDataRelationships subscriptionUpdateRequestDataRelationships = (SubscriptionUpdateRequestDataRelationships) o;
    return Objects.equals(this.introductoryOffers, subscriptionUpdateRequestDataRelationships.introductoryOffers) &&
        Objects.equals(this.promotionalOffers, subscriptionUpdateRequestDataRelationships.promotionalOffers) &&
        Objects.equals(this.prices, subscriptionUpdateRequestDataRelationships.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(introductoryOffers, promotionalOffers, prices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionUpdateRequestDataRelationships {\n");
    sb.append("    introductoryOffers: ").append(toIndentedString(introductoryOffers)).append("\n");
    sb.append("    promotionalOffers: ").append(toIndentedString(promotionalOffers)).append("\n");
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

