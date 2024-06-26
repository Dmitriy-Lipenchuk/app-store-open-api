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
 * Gets or Sets InternalBetaState
 */
public enum InternalBetaState {
  
  PROCESSING("PROCESSING"),
  
  PROCESSING_EXCEPTION("PROCESSING_EXCEPTION"),
  
  MISSING_EXPORT_COMPLIANCE("MISSING_EXPORT_COMPLIANCE"),
  
  READY_FOR_BETA_TESTING("READY_FOR_BETA_TESTING"),
  
  IN_BETA_TESTING("IN_BETA_TESTING"),
  
  EXPIRED("EXPIRED"),
  
  IN_EXPORT_COMPLIANCE_REVIEW("IN_EXPORT_COMPLIANCE_REVIEW");

  private String value;

  InternalBetaState(String value) {
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
  public static InternalBetaState fromValue(String value) {
    for (InternalBetaState b : InternalBetaState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

