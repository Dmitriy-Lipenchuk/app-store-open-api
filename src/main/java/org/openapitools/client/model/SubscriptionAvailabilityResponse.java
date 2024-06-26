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
import org.openapitools.client.model.DocumentLinks;
import org.openapitools.client.model.SubscriptionAvailability;
import org.openapitools.client.model.SubscriptionAvailabilityResponseIncludedInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * SubscriptionAvailabilityResponse
 */
@JsonPropertyOrder({
  SubscriptionAvailabilityResponse.JSON_PROPERTY_DATA,
  SubscriptionAvailabilityResponse.JSON_PROPERTY_INCLUDED,
  SubscriptionAvailabilityResponse.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionAvailabilityResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private SubscriptionAvailability data;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<SubscriptionAvailabilityResponseIncludedInner> included = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "links";
  private DocumentLinks links;

  public SubscriptionAvailabilityResponse() { 
  }

  public SubscriptionAvailabilityResponse data(SubscriptionAvailability data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SubscriptionAvailability getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(SubscriptionAvailability data) {
    this.data = data;
  }


  public SubscriptionAvailabilityResponse included(List<SubscriptionAvailabilityResponseIncludedInner> included) {
    this.included = included;
    return this;
  }

  public SubscriptionAvailabilityResponse addIncludedItem(SubscriptionAvailabilityResponseIncludedInner includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    return this;
  }

   /**
   * Get included
   * @return included
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubscriptionAvailabilityResponseIncludedInner> getIncluded() {
    return included;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncluded(List<SubscriptionAvailabilityResponseIncludedInner> included) {
    this.included = included;
  }


  public SubscriptionAvailabilityResponse links(DocumentLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DocumentLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLinks(DocumentLinks links) {
    this.links = links;
  }


  /**
   * Return true if this SubscriptionAvailabilityResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionAvailabilityResponse subscriptionAvailabilityResponse = (SubscriptionAvailabilityResponse) o;
    return Objects.equals(this.data, subscriptionAvailabilityResponse.data) &&
        Objects.equals(this.included, subscriptionAvailabilityResponse.included) &&
        Objects.equals(this.links, subscriptionAvailabilityResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionAvailabilityResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

