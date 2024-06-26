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
 * Gets or Sets GameCenterLeaderboardFormatter
 */
public enum GameCenterLeaderboardFormatter {
  
  INTEGER("INTEGER"),
  
  DECIMAL_POINT_1_PLACE("DECIMAL_POINT_1_PLACE"),
  
  DECIMAL_POINT_2_PLACE("DECIMAL_POINT_2_PLACE"),
  
  DECIMAL_POINT_3_PLACE("DECIMAL_POINT_3_PLACE"),
  
  ELAPSED_TIME_MILLISECOND("ELAPSED_TIME_MILLISECOND"),
  
  ELAPSED_TIME_CENTISECOND("ELAPSED_TIME_CENTISECOND"),
  
  ELAPSED_TIME_MINUTE("ELAPSED_TIME_MINUTE"),
  
  ELAPSED_TIME_SECOND("ELAPSED_TIME_SECOND"),
  
  MONEY_POUND_DECIMAL("MONEY_POUND_DECIMAL"),
  
  MONEY_POUND("MONEY_POUND"),
  
  MONEY_DOLLAR_DECIMAL("MONEY_DOLLAR_DECIMAL"),
  
  MONEY_DOLLAR("MONEY_DOLLAR"),
  
  MONEY_EURO_DECIMAL("MONEY_EURO_DECIMAL"),
  
  MONEY_EURO("MONEY_EURO"),
  
  MONEY_FRANC_DECIMAL("MONEY_FRANC_DECIMAL"),
  
  MONEY_FRANC("MONEY_FRANC"),
  
  MONEY_KRONER_DECIMAL("MONEY_KRONER_DECIMAL"),
  
  MONEY_KRONER("MONEY_KRONER"),
  
  MONEY_YEN("MONEY_YEN");

  private String value;

  GameCenterLeaderboardFormatter(String value) {
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
  public static GameCenterLeaderboardFormatter fromValue(String value) {
    for (GameCenterLeaderboardFormatter b : GameCenterLeaderboardFormatter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
