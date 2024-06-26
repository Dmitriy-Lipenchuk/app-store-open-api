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
 * Gets or Sets PreviewType
 */
public enum PreviewType {
  
  IPHONE_67("IPHONE_67"),
  
  IPHONE_61("IPHONE_61"),
  
  IPHONE_65("IPHONE_65"),
  
  IPHONE_58("IPHONE_58"),
  
  IPHONE_55("IPHONE_55"),
  
  IPHONE_47("IPHONE_47"),
  
  IPHONE_40("IPHONE_40"),
  
  IPHONE_35("IPHONE_35"),
  
  IPAD_PRO_3GEN_129("IPAD_PRO_3GEN_129"),
  
  IPAD_PRO_3GEN_11("IPAD_PRO_3GEN_11"),
  
  IPAD_PRO_129("IPAD_PRO_129"),
  
  IPAD_105("IPAD_105"),
  
  IPAD_97("IPAD_97"),
  
  DESKTOP("DESKTOP"),
  
  APPLE_TV("APPLE_TV"),
  
  APPLE_VISION_PRO("APPLE_VISION_PRO");

  private String value;

  PreviewType(String value) {
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
  public static PreviewType fromValue(String value) {
    for (PreviewType b : PreviewType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

