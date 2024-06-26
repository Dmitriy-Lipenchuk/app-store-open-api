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
import org.openapitools.client.model.InAppPurchasePriceInlineCreateRelationshipsInAppPurchasePricePoint;
import org.openapitools.client.model.InAppPurchasePriceInlineCreateRelationshipsInAppPurchaseV2;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * InAppPurchasePriceInlineCreateRelationships
 */
@JsonPropertyOrder({
  InAppPurchasePriceInlineCreateRelationships.JSON_PROPERTY_IN_APP_PURCHASE_V2,
  InAppPurchasePriceInlineCreateRelationships.JSON_PROPERTY_IN_APP_PURCHASE_PRICE_POINT
})
@JsonTypeName("InAppPurchasePriceInlineCreate_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class InAppPurchasePriceInlineCreateRelationships {
  public static final String JSON_PROPERTY_IN_APP_PURCHASE_V2 = "inAppPurchaseV2";
  private InAppPurchasePriceInlineCreateRelationshipsInAppPurchaseV2 inAppPurchaseV2;

  public static final String JSON_PROPERTY_IN_APP_PURCHASE_PRICE_POINT = "inAppPurchasePricePoint";
  private InAppPurchasePriceInlineCreateRelationshipsInAppPurchasePricePoint inAppPurchasePricePoint;

  public InAppPurchasePriceInlineCreateRelationships() { 
  }

  public InAppPurchasePriceInlineCreateRelationships inAppPurchaseV2(InAppPurchasePriceInlineCreateRelationshipsInAppPurchaseV2 inAppPurchaseV2) {
    this.inAppPurchaseV2 = inAppPurchaseV2;
    return this;
  }

   /**
   * Get inAppPurchaseV2
   * @return inAppPurchaseV2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IN_APP_PURCHASE_V2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InAppPurchasePriceInlineCreateRelationshipsInAppPurchaseV2 getInAppPurchaseV2() {
    return inAppPurchaseV2;
  }


  @JsonProperty(JSON_PROPERTY_IN_APP_PURCHASE_V2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInAppPurchaseV2(InAppPurchasePriceInlineCreateRelationshipsInAppPurchaseV2 inAppPurchaseV2) {
    this.inAppPurchaseV2 = inAppPurchaseV2;
  }


  public InAppPurchasePriceInlineCreateRelationships inAppPurchasePricePoint(InAppPurchasePriceInlineCreateRelationshipsInAppPurchasePricePoint inAppPurchasePricePoint) {
    this.inAppPurchasePricePoint = inAppPurchasePricePoint;
    return this;
  }

   /**
   * Get inAppPurchasePricePoint
   * @return inAppPurchasePricePoint
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IN_APP_PURCHASE_PRICE_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InAppPurchasePriceInlineCreateRelationshipsInAppPurchasePricePoint getInAppPurchasePricePoint() {
    return inAppPurchasePricePoint;
  }


  @JsonProperty(JSON_PROPERTY_IN_APP_PURCHASE_PRICE_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInAppPurchasePricePoint(InAppPurchasePriceInlineCreateRelationshipsInAppPurchasePricePoint inAppPurchasePricePoint) {
    this.inAppPurchasePricePoint = inAppPurchasePricePoint;
  }


  /**
   * Return true if this InAppPurchasePriceInlineCreate_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InAppPurchasePriceInlineCreateRelationships inAppPurchasePriceInlineCreateRelationships = (InAppPurchasePriceInlineCreateRelationships) o;
    return Objects.equals(this.inAppPurchaseV2, inAppPurchasePriceInlineCreateRelationships.inAppPurchaseV2) &&
        Objects.equals(this.inAppPurchasePricePoint, inAppPurchasePriceInlineCreateRelationships.inAppPurchasePricePoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inAppPurchaseV2, inAppPurchasePricePoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InAppPurchasePriceInlineCreateRelationships {\n");
    sb.append("    inAppPurchaseV2: ").append(toIndentedString(inAppPurchaseV2)).append("\n");
    sb.append("    inAppPurchasePricePoint: ").append(toIndentedString(inAppPurchasePricePoint)).append("\n");
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

