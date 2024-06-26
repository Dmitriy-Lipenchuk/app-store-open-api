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
import org.openapitools.client.model.AppAvailabilityCreateRequestDataRelationshipsAvailableTerritories;
import org.openapitools.client.model.InAppPurchaseAppStoreReviewScreenshotCreateRequestDataRelationshipsInAppPurchaseV2;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * InAppPurchaseAvailabilityCreateRequestDataRelationships
 */
@JsonPropertyOrder({
  InAppPurchaseAvailabilityCreateRequestDataRelationships.JSON_PROPERTY_IN_APP_PURCHASE,
  InAppPurchaseAvailabilityCreateRequestDataRelationships.JSON_PROPERTY_AVAILABLE_TERRITORIES
})
@JsonTypeName("InAppPurchaseAvailabilityCreateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class InAppPurchaseAvailabilityCreateRequestDataRelationships {
  public static final String JSON_PROPERTY_IN_APP_PURCHASE = "inAppPurchase";
  private InAppPurchaseAppStoreReviewScreenshotCreateRequestDataRelationshipsInAppPurchaseV2 inAppPurchase;

  public static final String JSON_PROPERTY_AVAILABLE_TERRITORIES = "availableTerritories";
  private AppAvailabilityCreateRequestDataRelationshipsAvailableTerritories availableTerritories;

  public InAppPurchaseAvailabilityCreateRequestDataRelationships() { 
  }

  public InAppPurchaseAvailabilityCreateRequestDataRelationships inAppPurchase(InAppPurchaseAppStoreReviewScreenshotCreateRequestDataRelationshipsInAppPurchaseV2 inAppPurchase) {
    this.inAppPurchase = inAppPurchase;
    return this;
  }

   /**
   * Get inAppPurchase
   * @return inAppPurchase
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IN_APP_PURCHASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InAppPurchaseAppStoreReviewScreenshotCreateRequestDataRelationshipsInAppPurchaseV2 getInAppPurchase() {
    return inAppPurchase;
  }


  @JsonProperty(JSON_PROPERTY_IN_APP_PURCHASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInAppPurchase(InAppPurchaseAppStoreReviewScreenshotCreateRequestDataRelationshipsInAppPurchaseV2 inAppPurchase) {
    this.inAppPurchase = inAppPurchase;
  }


  public InAppPurchaseAvailabilityCreateRequestDataRelationships availableTerritories(AppAvailabilityCreateRequestDataRelationshipsAvailableTerritories availableTerritories) {
    this.availableTerritories = availableTerritories;
    return this;
  }

   /**
   * Get availableTerritories
   * @return availableTerritories
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVAILABLE_TERRITORIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AppAvailabilityCreateRequestDataRelationshipsAvailableTerritories getAvailableTerritories() {
    return availableTerritories;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_TERRITORIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvailableTerritories(AppAvailabilityCreateRequestDataRelationshipsAvailableTerritories availableTerritories) {
    this.availableTerritories = availableTerritories;
  }


  /**
   * Return true if this InAppPurchaseAvailabilityCreateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InAppPurchaseAvailabilityCreateRequestDataRelationships inAppPurchaseAvailabilityCreateRequestDataRelationships = (InAppPurchaseAvailabilityCreateRequestDataRelationships) o;
    return Objects.equals(this.inAppPurchase, inAppPurchaseAvailabilityCreateRequestDataRelationships.inAppPurchase) &&
        Objects.equals(this.availableTerritories, inAppPurchaseAvailabilityCreateRequestDataRelationships.availableTerritories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inAppPurchase, availableTerritories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InAppPurchaseAvailabilityCreateRequestDataRelationships {\n");
    sb.append("    inAppPurchase: ").append(toIndentedString(inAppPurchase)).append("\n");
    sb.append("    availableTerritories: ").append(toIndentedString(availableTerritories)).append("\n");
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

