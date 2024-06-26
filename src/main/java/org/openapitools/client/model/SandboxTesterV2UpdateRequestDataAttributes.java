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
import org.openapitools.client.model.TerritoryCode;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * SandboxTesterV2UpdateRequestDataAttributes
 */
@JsonPropertyOrder({
  SandboxTesterV2UpdateRequestDataAttributes.JSON_PROPERTY_TERRITORY,
  SandboxTesterV2UpdateRequestDataAttributes.JSON_PROPERTY_INTERRUPT_PURCHASES,
  SandboxTesterV2UpdateRequestDataAttributes.JSON_PROPERTY_SUBSCRIPTION_RENEWAL_RATE
})
@JsonTypeName("SandboxTesterV2UpdateRequest_data_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SandboxTesterV2UpdateRequestDataAttributes {
  public static final String JSON_PROPERTY_TERRITORY = "territory";
  private TerritoryCode territory;

  public static final String JSON_PROPERTY_INTERRUPT_PURCHASES = "interruptPurchases";
  private Boolean interruptPurchases;

  /**
   * Gets or Sets subscriptionRenewalRate
   */
  public enum SubscriptionRenewalRateEnum {
    ONE_HOUR("MONTHLY_RENEWAL_EVERY_ONE_HOUR"),
    
    THIRTY_MINUTES("MONTHLY_RENEWAL_EVERY_THIRTY_MINUTES"),
    
    FIFTEEN_MINUTES("MONTHLY_RENEWAL_EVERY_FIFTEEN_MINUTES"),
    
    FIVE_MINUTES("MONTHLY_RENEWAL_EVERY_FIVE_MINUTES"),
    
    THREE_MINUTES("MONTHLY_RENEWAL_EVERY_THREE_MINUTES");

    private String value;

    SubscriptionRenewalRateEnum(String value) {
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
    public static SubscriptionRenewalRateEnum fromValue(String value) {
      for (SubscriptionRenewalRateEnum b : SubscriptionRenewalRateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SUBSCRIPTION_RENEWAL_RATE = "subscriptionRenewalRate";
  private SubscriptionRenewalRateEnum subscriptionRenewalRate;

  public SandboxTesterV2UpdateRequestDataAttributes() { 
  }

  public SandboxTesterV2UpdateRequestDataAttributes territory(TerritoryCode territory) {
    this.territory = territory;
    return this;
  }

   /**
   * Get territory
   * @return territory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERRITORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TerritoryCode getTerritory() {
    return territory;
  }


  @JsonProperty(JSON_PROPERTY_TERRITORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerritory(TerritoryCode territory) {
    this.territory = territory;
  }


  public SandboxTesterV2UpdateRequestDataAttributes interruptPurchases(Boolean interruptPurchases) {
    this.interruptPurchases = interruptPurchases;
    return this;
  }

   /**
   * Get interruptPurchases
   * @return interruptPurchases
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERRUPT_PURCHASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInterruptPurchases() {
    return interruptPurchases;
  }


  @JsonProperty(JSON_PROPERTY_INTERRUPT_PURCHASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterruptPurchases(Boolean interruptPurchases) {
    this.interruptPurchases = interruptPurchases;
  }


  public SandboxTesterV2UpdateRequestDataAttributes subscriptionRenewalRate(SubscriptionRenewalRateEnum subscriptionRenewalRate) {
    this.subscriptionRenewalRate = subscriptionRenewalRate;
    return this;
  }

   /**
   * Get subscriptionRenewalRate
   * @return subscriptionRenewalRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_RENEWAL_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionRenewalRateEnum getSubscriptionRenewalRate() {
    return subscriptionRenewalRate;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_RENEWAL_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionRenewalRate(SubscriptionRenewalRateEnum subscriptionRenewalRate) {
    this.subscriptionRenewalRate = subscriptionRenewalRate;
  }


  /**
   * Return true if this SandboxTesterV2UpdateRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxTesterV2UpdateRequestDataAttributes sandboxTesterV2UpdateRequestDataAttributes = (SandboxTesterV2UpdateRequestDataAttributes) o;
    return Objects.equals(this.territory, sandboxTesterV2UpdateRequestDataAttributes.territory) &&
        Objects.equals(this.interruptPurchases, sandboxTesterV2UpdateRequestDataAttributes.interruptPurchases) &&
        Objects.equals(this.subscriptionRenewalRate, sandboxTesterV2UpdateRequestDataAttributes.subscriptionRenewalRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(territory, interruptPurchases, subscriptionRenewalRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxTesterV2UpdateRequestDataAttributes {\n");
    sb.append("    territory: ").append(toIndentedString(territory)).append("\n");
    sb.append("    interruptPurchases: ").append(toIndentedString(interruptPurchases)).append("\n");
    sb.append("    subscriptionRenewalRate: ").append(toIndentedString(subscriptionRenewalRate)).append("\n");
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

