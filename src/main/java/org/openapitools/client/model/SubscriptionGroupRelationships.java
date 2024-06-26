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
import org.openapitools.client.model.SubscriptionGroupRelationshipsSubscriptionGroupLocalizations;
import org.openapitools.client.model.SubscriptionGroupRelationshipsSubscriptions;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * SubscriptionGroupRelationships
 */
@JsonPropertyOrder({
  SubscriptionGroupRelationships.JSON_PROPERTY_SUBSCRIPTIONS,
  SubscriptionGroupRelationships.JSON_PROPERTY_SUBSCRIPTION_GROUP_LOCALIZATIONS
})
@JsonTypeName("SubscriptionGroup_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionGroupRelationships {
  public static final String JSON_PROPERTY_SUBSCRIPTIONS = "subscriptions";
  private SubscriptionGroupRelationshipsSubscriptions subscriptions;

  public static final String JSON_PROPERTY_SUBSCRIPTION_GROUP_LOCALIZATIONS = "subscriptionGroupLocalizations";
  private SubscriptionGroupRelationshipsSubscriptionGroupLocalizations subscriptionGroupLocalizations;

  public SubscriptionGroupRelationships() { 
  }

  public SubscriptionGroupRelationships subscriptions(SubscriptionGroupRelationshipsSubscriptions subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionGroupRelationshipsSubscriptions getSubscriptions() {
    return subscriptions;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptions(SubscriptionGroupRelationshipsSubscriptions subscriptions) {
    this.subscriptions = subscriptions;
  }


  public SubscriptionGroupRelationships subscriptionGroupLocalizations(SubscriptionGroupRelationshipsSubscriptionGroupLocalizations subscriptionGroupLocalizations) {
    this.subscriptionGroupLocalizations = subscriptionGroupLocalizations;
    return this;
  }

   /**
   * Get subscriptionGroupLocalizations
   * @return subscriptionGroupLocalizations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_GROUP_LOCALIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionGroupRelationshipsSubscriptionGroupLocalizations getSubscriptionGroupLocalizations() {
    return subscriptionGroupLocalizations;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_GROUP_LOCALIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionGroupLocalizations(SubscriptionGroupRelationshipsSubscriptionGroupLocalizations subscriptionGroupLocalizations) {
    this.subscriptionGroupLocalizations = subscriptionGroupLocalizations;
  }


  /**
   * Return true if this SubscriptionGroup_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionGroupRelationships subscriptionGroupRelationships = (SubscriptionGroupRelationships) o;
    return Objects.equals(this.subscriptions, subscriptionGroupRelationships.subscriptions) &&
        Objects.equals(this.subscriptionGroupLocalizations, subscriptionGroupRelationships.subscriptionGroupLocalizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptions, subscriptionGroupLocalizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionGroupRelationships {\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    subscriptionGroupLocalizations: ").append(toIndentedString(subscriptionGroupLocalizations)).append("\n");
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

