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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * SubscriptionGroupLocalizationAttributes
 */
@JsonPropertyOrder({
  SubscriptionGroupLocalizationAttributes.JSON_PROPERTY_NAME,
  SubscriptionGroupLocalizationAttributes.JSON_PROPERTY_CUSTOM_APP_NAME,
  SubscriptionGroupLocalizationAttributes.JSON_PROPERTY_LOCALE,
  SubscriptionGroupLocalizationAttributes.JSON_PROPERTY_STATE
})
@JsonTypeName("SubscriptionGroupLocalization_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionGroupLocalizationAttributes {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CUSTOM_APP_NAME = "customAppName";
  private String customAppName;

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private String locale;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    PREPARE_FOR_SUBMISSION("PREPARE_FOR_SUBMISSION"),
    
    WAITING_FOR_REVIEW("WAITING_FOR_REVIEW"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATE = "state";
  private StateEnum state;

  public SubscriptionGroupLocalizationAttributes() { 
  }

  public SubscriptionGroupLocalizationAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public SubscriptionGroupLocalizationAttributes customAppName(String customAppName) {
    this.customAppName = customAppName;
    return this;
  }

   /**
   * Get customAppName
   * @return customAppName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_APP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomAppName() {
    return customAppName;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_APP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomAppName(String customAppName) {
    this.customAppName = customAppName;
  }


  public SubscriptionGroupLocalizationAttributes locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocale() {
    return locale;
  }


  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocale(String locale) {
    this.locale = locale;
  }


  public SubscriptionGroupLocalizationAttributes state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StateEnum getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * Return true if this SubscriptionGroupLocalization_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionGroupLocalizationAttributes subscriptionGroupLocalizationAttributes = (SubscriptionGroupLocalizationAttributes) o;
    return Objects.equals(this.name, subscriptionGroupLocalizationAttributes.name) &&
        Objects.equals(this.customAppName, subscriptionGroupLocalizationAttributes.customAppName) &&
        Objects.equals(this.locale, subscriptionGroupLocalizationAttributes.locale) &&
        Objects.equals(this.state, subscriptionGroupLocalizationAttributes.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, customAppName, locale, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionGroupLocalizationAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customAppName: ").append(toIndentedString(customAppName)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

