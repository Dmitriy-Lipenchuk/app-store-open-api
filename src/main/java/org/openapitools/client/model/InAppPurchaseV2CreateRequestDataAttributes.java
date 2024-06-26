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
import org.openapitools.client.model.InAppPurchaseType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * InAppPurchaseV2CreateRequestDataAttributes
 */
@JsonPropertyOrder({
  InAppPurchaseV2CreateRequestDataAttributes.JSON_PROPERTY_NAME,
  InAppPurchaseV2CreateRequestDataAttributes.JSON_PROPERTY_PRODUCT_ID,
  InAppPurchaseV2CreateRequestDataAttributes.JSON_PROPERTY_IN_APP_PURCHASE_TYPE,
  InAppPurchaseV2CreateRequestDataAttributes.JSON_PROPERTY_REVIEW_NOTE,
  InAppPurchaseV2CreateRequestDataAttributes.JSON_PROPERTY_FAMILY_SHARABLE
})
@JsonTypeName("InAppPurchaseV2CreateRequest_data_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class InAppPurchaseV2CreateRequestDataAttributes {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRODUCT_ID = "productId";
  private String productId;

  public static final String JSON_PROPERTY_IN_APP_PURCHASE_TYPE = "inAppPurchaseType";
  private InAppPurchaseType inAppPurchaseType;

  public static final String JSON_PROPERTY_REVIEW_NOTE = "reviewNote";
  private String reviewNote;

  public static final String JSON_PROPERTY_FAMILY_SHARABLE = "familySharable";
  private Boolean familySharable;

  public InAppPurchaseV2CreateRequestDataAttributes() { 
  }

  public InAppPurchaseV2CreateRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public InAppPurchaseV2CreateRequestDataAttributes productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProductId() {
    return productId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProductId(String productId) {
    this.productId = productId;
  }


  public InAppPurchaseV2CreateRequestDataAttributes inAppPurchaseType(InAppPurchaseType inAppPurchaseType) {
    this.inAppPurchaseType = inAppPurchaseType;
    return this;
  }

   /**
   * Get inAppPurchaseType
   * @return inAppPurchaseType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IN_APP_PURCHASE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InAppPurchaseType getInAppPurchaseType() {
    return inAppPurchaseType;
  }


  @JsonProperty(JSON_PROPERTY_IN_APP_PURCHASE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInAppPurchaseType(InAppPurchaseType inAppPurchaseType) {
    this.inAppPurchaseType = inAppPurchaseType;
  }


  public InAppPurchaseV2CreateRequestDataAttributes reviewNote(String reviewNote) {
    this.reviewNote = reviewNote;
    return this;
  }

   /**
   * Get reviewNote
   * @return reviewNote
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReviewNote() {
    return reviewNote;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewNote(String reviewNote) {
    this.reviewNote = reviewNote;
  }


  public InAppPurchaseV2CreateRequestDataAttributes familySharable(Boolean familySharable) {
    this.familySharable = familySharable;
    return this;
  }

   /**
   * Get familySharable
   * @return familySharable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAMILY_SHARABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFamilySharable() {
    return familySharable;
  }


  @JsonProperty(JSON_PROPERTY_FAMILY_SHARABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFamilySharable(Boolean familySharable) {
    this.familySharable = familySharable;
  }


  /**
   * Return true if this InAppPurchaseV2CreateRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InAppPurchaseV2CreateRequestDataAttributes inAppPurchaseV2CreateRequestDataAttributes = (InAppPurchaseV2CreateRequestDataAttributes) o;
    return Objects.equals(this.name, inAppPurchaseV2CreateRequestDataAttributes.name) &&
        Objects.equals(this.productId, inAppPurchaseV2CreateRequestDataAttributes.productId) &&
        Objects.equals(this.inAppPurchaseType, inAppPurchaseV2CreateRequestDataAttributes.inAppPurchaseType) &&
        Objects.equals(this.reviewNote, inAppPurchaseV2CreateRequestDataAttributes.reviewNote) &&
        Objects.equals(this.familySharable, inAppPurchaseV2CreateRequestDataAttributes.familySharable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, productId, inAppPurchaseType, reviewNote, familySharable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InAppPurchaseV2CreateRequestDataAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    inAppPurchaseType: ").append(toIndentedString(inAppPurchaseType)).append("\n");
    sb.append("    reviewNote: ").append(toIndentedString(reviewNote)).append("\n");
    sb.append("    familySharable: ").append(toIndentedString(familySharable)).append("\n");
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

