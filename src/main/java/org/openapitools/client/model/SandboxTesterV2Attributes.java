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
 * SandboxTesterV2Attributes
 */
@JsonPropertyOrder({
  SandboxTesterV2Attributes.JSON_PROPERTY_FIRST_NAME,
  SandboxTesterV2Attributes.JSON_PROPERTY_LAST_NAME,
  SandboxTesterV2Attributes.JSON_PROPERTY_AC_ACCOUNT_NAME,
  SandboxTesterV2Attributes.JSON_PROPERTY_TERRITORY,
  SandboxTesterV2Attributes.JSON_PROPERTY_APPLE_PAY_COMPATIBLE,
  SandboxTesterV2Attributes.JSON_PROPERTY_INTERRUPT_PURCHASES,
  SandboxTesterV2Attributes.JSON_PROPERTY_SUBSCRIPTION_RENEWAL_RATE
})
@JsonTypeName("SandboxTesterV2_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SandboxTesterV2Attributes {
  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_AC_ACCOUNT_NAME = "acAccountName";
  private String acAccountName;

  public static final String JSON_PROPERTY_TERRITORY = "territory";
  private TerritoryCode territory;

  public static final String JSON_PROPERTY_APPLE_PAY_COMPATIBLE = "applePayCompatible";
  private Boolean applePayCompatible;

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

  public SandboxTesterV2Attributes() { 
  }

  public SandboxTesterV2Attributes firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public SandboxTesterV2Attributes lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public SandboxTesterV2Attributes acAccountName(String acAccountName) {
    this.acAccountName = acAccountName;
    return this;
  }

   /**
   * Get acAccountName
   * @return acAccountName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AC_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcAccountName() {
    return acAccountName;
  }


  @JsonProperty(JSON_PROPERTY_AC_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcAccountName(String acAccountName) {
    this.acAccountName = acAccountName;
  }


  public SandboxTesterV2Attributes territory(TerritoryCode territory) {
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


  public SandboxTesterV2Attributes applePayCompatible(Boolean applePayCompatible) {
    this.applePayCompatible = applePayCompatible;
    return this;
  }

   /**
   * Get applePayCompatible
   * @return applePayCompatible
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLE_PAY_COMPATIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getApplePayCompatible() {
    return applePayCompatible;
  }


  @JsonProperty(JSON_PROPERTY_APPLE_PAY_COMPATIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplePayCompatible(Boolean applePayCompatible) {
    this.applePayCompatible = applePayCompatible;
  }


  public SandboxTesterV2Attributes interruptPurchases(Boolean interruptPurchases) {
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


  public SandboxTesterV2Attributes subscriptionRenewalRate(SubscriptionRenewalRateEnum subscriptionRenewalRate) {
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
   * Return true if this SandboxTesterV2_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxTesterV2Attributes sandboxTesterV2Attributes = (SandboxTesterV2Attributes) o;
    return Objects.equals(this.firstName, sandboxTesterV2Attributes.firstName) &&
        Objects.equals(this.lastName, sandboxTesterV2Attributes.lastName) &&
        Objects.equals(this.acAccountName, sandboxTesterV2Attributes.acAccountName) &&
        Objects.equals(this.territory, sandboxTesterV2Attributes.territory) &&
        Objects.equals(this.applePayCompatible, sandboxTesterV2Attributes.applePayCompatible) &&
        Objects.equals(this.interruptPurchases, sandboxTesterV2Attributes.interruptPurchases) &&
        Objects.equals(this.subscriptionRenewalRate, sandboxTesterV2Attributes.subscriptionRenewalRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, acAccountName, territory, applePayCompatible, interruptPurchases, subscriptionRenewalRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxTesterV2Attributes {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    acAccountName: ").append(toIndentedString(acAccountName)).append("\n");
    sb.append("    territory: ").append(toIndentedString(territory)).append("\n");
    sb.append("    applePayCompatible: ").append(toIndentedString(applePayCompatible)).append("\n");
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
