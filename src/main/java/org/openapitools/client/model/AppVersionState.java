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
 * Gets or Sets AppVersionState
 */
public enum AppVersionState {
  
  ACCEPTED("ACCEPTED"),
  
  DEVELOPER_REJECTED("DEVELOPER_REJECTED"),
  
  IN_REVIEW("IN_REVIEW"),
  
  INVALID_BINARY("INVALID_BINARY"),
  
  METADATA_REJECTED("METADATA_REJECTED"),
  
  PENDING_APPLE_RELEASE("PENDING_APPLE_RELEASE"),
  
  PENDING_DEVELOPER_RELEASE("PENDING_DEVELOPER_RELEASE"),
  
  PREPARE_FOR_SUBMISSION("PREPARE_FOR_SUBMISSION"),
  
  PROCESSING_FOR_DISTRIBUTION("PROCESSING_FOR_DISTRIBUTION"),
  
  READY_FOR_DISTRIBUTION("READY_FOR_DISTRIBUTION"),
  
  READY_FOR_REVIEW("READY_FOR_REVIEW"),
  
  REJECTED("REJECTED"),
  
  REPLACED_WITH_NEW_VERSION("REPLACED_WITH_NEW_VERSION"),
  
  WAITING_FOR_EXPORT_COMPLIANCE("WAITING_FOR_EXPORT_COMPLIANCE"),
  
  WAITING_FOR_REVIEW("WAITING_FOR_REVIEW");

  private String value;

  AppVersionState(String value) {
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
  public static AppVersionState fromValue(String value) {
    for (AppVersionState b : AppVersionState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
