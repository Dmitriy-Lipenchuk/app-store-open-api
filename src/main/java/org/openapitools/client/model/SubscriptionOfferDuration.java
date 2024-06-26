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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets SubscriptionOfferDuration
 */
public enum SubscriptionOfferDuration {
  
  ONE_DAY("ONE_DAY"),
  
  THREE_DAYS("THREE_DAYS"),
  
  ONE_WEEK("ONE_WEEK"),
  
  TWO_WEEKS("TWO_WEEKS"),
  
  ONE_MONTH("ONE_MONTH"),
  
  TWO_MONTHS("TWO_MONTHS"),
  
  THREE_MONTHS("THREE_MONTHS"),
  
  SIX_MONTHS("SIX_MONTHS"),
  
  ONE_YEAR("ONE_YEAR");

  private String value;

  SubscriptionOfferDuration(String value) {
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
  public static SubscriptionOfferDuration fromValue(String value) {
    for (SubscriptionOfferDuration b : SubscriptionOfferDuration.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

