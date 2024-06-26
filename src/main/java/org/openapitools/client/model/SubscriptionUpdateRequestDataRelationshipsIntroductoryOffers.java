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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.SubscriptionRelationshipsIntroductoryOffersDataInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * SubscriptionUpdateRequestDataRelationshipsIntroductoryOffers
 */
@JsonPropertyOrder({
  SubscriptionUpdateRequestDataRelationshipsIntroductoryOffers.JSON_PROPERTY_DATA
})
@JsonTypeName("SubscriptionUpdateRequest_data_relationships_introductoryOffers")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionUpdateRequestDataRelationshipsIntroductoryOffers {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<SubscriptionRelationshipsIntroductoryOffersDataInner> data = new ArrayList<>();

  public SubscriptionUpdateRequestDataRelationshipsIntroductoryOffers() { 
  }

  public SubscriptionUpdateRequestDataRelationshipsIntroductoryOffers data(List<SubscriptionRelationshipsIntroductoryOffersDataInner> data) {
    this.data = data;
    return this;
  }

  public SubscriptionUpdateRequestDataRelationshipsIntroductoryOffers addDataItem(SubscriptionRelationshipsIntroductoryOffersDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubscriptionRelationshipsIntroductoryOffersDataInner> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<SubscriptionRelationshipsIntroductoryOffersDataInner> data) {
    this.data = data;
  }


  /**
   * Return true if this SubscriptionUpdateRequest_data_relationships_introductoryOffers object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionUpdateRequestDataRelationshipsIntroductoryOffers subscriptionUpdateRequestDataRelationshipsIntroductoryOffers = (SubscriptionUpdateRequestDataRelationshipsIntroductoryOffers) o;
    return Objects.equals(this.data, subscriptionUpdateRequestDataRelationshipsIntroductoryOffers.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionUpdateRequestDataRelationshipsIntroductoryOffers {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

