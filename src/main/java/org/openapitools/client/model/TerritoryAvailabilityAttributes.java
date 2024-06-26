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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * TerritoryAvailabilityAttributes
 */
@JsonPropertyOrder({
  TerritoryAvailabilityAttributes.JSON_PROPERTY_AVAILABLE,
  TerritoryAvailabilityAttributes.JSON_PROPERTY_RELEASE_DATE,
  TerritoryAvailabilityAttributes.JSON_PROPERTY_PRE_ORDER_ENABLED,
  TerritoryAvailabilityAttributes.JSON_PROPERTY_PRE_ORDER_PUBLISH_DATE,
  TerritoryAvailabilityAttributes.JSON_PROPERTY_CONTENT_STATUSES
})
@JsonTypeName("TerritoryAvailability_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class TerritoryAvailabilityAttributes {
  public static final String JSON_PROPERTY_AVAILABLE = "available";
  private Boolean available;

  public static final String JSON_PROPERTY_RELEASE_DATE = "releaseDate";
  private LocalDate releaseDate;

  public static final String JSON_PROPERTY_PRE_ORDER_ENABLED = "preOrderEnabled";
  private Boolean preOrderEnabled;

  public static final String JSON_PROPERTY_PRE_ORDER_PUBLISH_DATE = "preOrderPublishDate";
  private LocalDate preOrderPublishDate;

  /**
   * Gets or Sets contentStatuses
   */
  public enum ContentStatusesEnum {
    AVAILABLE("AVAILABLE"),
    
    AVAILABLE_FOR_PREORDER_ON_DATE("AVAILABLE_FOR_PREORDER_ON_DATE"),
    
    PROCESSING_TO_NOT_AVAILABLE("PROCESSING_TO_NOT_AVAILABLE"),
    
    PROCESSING_TO_AVAILABLE("PROCESSING_TO_AVAILABLE"),
    
    PROCESSING_TO_PRE_ORDER("PROCESSING_TO_PRE_ORDER"),
    
    AVAILABLE_FOR_SALE_UNRELEASED_APP("AVAILABLE_FOR_SALE_UNRELEASED_APP"),
    
    PREORDER_ON_UNRELEASED_APP("PREORDER_ON_UNRELEASED_APP"),
    
    AVAILABLE_FOR_PREORDER("AVAILABLE_FOR_PREORDER"),
    
    MISSING_RATING("MISSING_RATING"),
    
    CANNOT_SELL_RESTRICTED_RATING("CANNOT_SELL_RESTRICTED_RATING"),
    
    BRAZIL_REQUIRED_TAX_ID("BRAZIL_REQUIRED_TAX_ID"),
    
    MISSING_GRN("MISSING_GRN"),
    
    UNVERIFIED_GRN("UNVERIFIED_GRN"),
    
    CANNOT_SELL_SEVENTEEN_PLUS_APPS("CANNOT_SELL_SEVENTEEN_PLUS_APPS"),
    
    CANNOT_SELL_SEXUALLY_EXPLICIT("CANNOT_SELL_SEXUALLY_EXPLICIT"),
    
    CANNOT_SELL_NON_IOS_GAMES("CANNOT_SELL_NON_IOS_GAMES"),
    
    CANNOT_SELL_SEVENTEEN_PLUS_GAMES("CANNOT_SELL_SEVENTEEN_PLUS_GAMES"),
    
    CANNOT_SELL_FREQUENT_INTENSE_GAMBLING("CANNOT_SELL_FREQUENT_INTENSE_GAMBLING"),
    
    CANNOT_SELL_CASINO("CANNOT_SELL_CASINO"),
    
    CANNOT_SELL_CASINO_WITHOUT_GRAC("CANNOT_SELL_CASINO_WITHOUT_GRAC"),
    
    CANNOT_SELL_CASINO_WITHOUT_AGE_VERIFICATION("CANNOT_SELL_CASINO_WITHOUT_AGE_VERIFICATION"),
    
    CANNOT_SELL_FREQUENT_INTENSE_ALCOHOL_TOBACCO_DRUGS("CANNOT_SELL_FREQUENT_INTENSE_ALCOHOL_TOBACCO_DRUGS"),
    
    CANNOT_SELL_FREQUENT_INTENSE_VIOLENCE("CANNOT_SELL_FREQUENT_INTENSE_VIOLENCE"),
    
    CANNOT_SELL_FREQUENT_INTENSE_SEXUAL_CONTENT_NUDITY("CANNOT_SELL_FREQUENT_INTENSE_SEXUAL_CONTENT_NUDITY"),
    
    CANNOT_SELL_INFREQUENT_MILD_ALCOHOL_TOBACCO_DRUGS("CANNOT_SELL_INFREQUENT_MILD_ALCOHOL_TOBACCO_DRUGS"),
    
    CANNOT_SELL_INFREQUENT_MILD_SEXUAL_CONTENT_NUDITY("CANNOT_SELL_INFREQUENT_MILD_SEXUAL_CONTENT_NUDITY"),
    
    CANNOT_SELL_ADULT_ONLY("CANNOT_SELL_ADULT_ONLY"),
    
    CANNOT_SELL_FREQUENT_INTENSE("CANNOT_SELL_FREQUENT_INTENSE"),
    
    CANNOT_SELL_FREQUENT_INTENSE_WITHOUT_GRAC("CANNOT_SELL_FREQUENT_INTENSE_WITHOUT_GRAC"),
    
    CANNOT_SELL_GAMBLING_CONTESTS("CANNOT_SELL_GAMBLING_CONTESTS"),
    
    CANNOT_SELL_GAMBLING("CANNOT_SELL_GAMBLING"),
    
    CANNOT_SELL_CONTESTS("CANNOT_SELL_CONTESTS"),
    
    CANNOT_SELL("CANNOT_SELL");

    private String value;

    ContentStatusesEnum(String value) {
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
    public static ContentStatusesEnum fromValue(String value) {
      for (ContentStatusesEnum b : ContentStatusesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONTENT_STATUSES = "contentStatuses";
  private List<ContentStatusesEnum> contentStatuses = new ArrayList<>();

  public TerritoryAvailabilityAttributes() { 
  }

  public TerritoryAvailabilityAttributes available(Boolean available) {
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAvailable() {
    return available;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailable(Boolean available) {
    this.available = available;
  }


  public TerritoryAvailabilityAttributes releaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Get releaseDate
   * @return releaseDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getReleaseDate() {
    return releaseDate;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }


  public TerritoryAvailabilityAttributes preOrderEnabled(Boolean preOrderEnabled) {
    this.preOrderEnabled = preOrderEnabled;
    return this;
  }

   /**
   * Get preOrderEnabled
   * @return preOrderEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRE_ORDER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPreOrderEnabled() {
    return preOrderEnabled;
  }


  @JsonProperty(JSON_PROPERTY_PRE_ORDER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreOrderEnabled(Boolean preOrderEnabled) {
    this.preOrderEnabled = preOrderEnabled;
  }


  public TerritoryAvailabilityAttributes preOrderPublishDate(LocalDate preOrderPublishDate) {
    this.preOrderPublishDate = preOrderPublishDate;
    return this;
  }

   /**
   * Get preOrderPublishDate
   * @return preOrderPublishDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRE_ORDER_PUBLISH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getPreOrderPublishDate() {
    return preOrderPublishDate;
  }


  @JsonProperty(JSON_PROPERTY_PRE_ORDER_PUBLISH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreOrderPublishDate(LocalDate preOrderPublishDate) {
    this.preOrderPublishDate = preOrderPublishDate;
  }


  public TerritoryAvailabilityAttributes contentStatuses(List<ContentStatusesEnum> contentStatuses) {
    this.contentStatuses = contentStatuses;
    return this;
  }

  public TerritoryAvailabilityAttributes addContentStatusesItem(ContentStatusesEnum contentStatusesItem) {
    if (this.contentStatuses == null) {
      this.contentStatuses = new ArrayList<>();
    }
    this.contentStatuses.add(contentStatusesItem);
    return this;
  }

   /**
   * Get contentStatuses
   * @return contentStatuses
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ContentStatusesEnum> getContentStatuses() {
    return contentStatuses;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentStatuses(List<ContentStatusesEnum> contentStatuses) {
    this.contentStatuses = contentStatuses;
  }


  /**
   * Return true if this TerritoryAvailability_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerritoryAvailabilityAttributes territoryAvailabilityAttributes = (TerritoryAvailabilityAttributes) o;
    return Objects.equals(this.available, territoryAvailabilityAttributes.available) &&
        Objects.equals(this.releaseDate, territoryAvailabilityAttributes.releaseDate) &&
        Objects.equals(this.preOrderEnabled, territoryAvailabilityAttributes.preOrderEnabled) &&
        Objects.equals(this.preOrderPublishDate, territoryAvailabilityAttributes.preOrderPublishDate) &&
        Objects.equals(this.contentStatuses, territoryAvailabilityAttributes.contentStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, releaseDate, preOrderEnabled, preOrderPublishDate, contentStatuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerritoryAvailabilityAttributes {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    preOrderEnabled: ").append(toIndentedString(preOrderEnabled)).append("\n");
    sb.append("    preOrderPublishDate: ").append(toIndentedString(preOrderPublishDate)).append("\n");
    sb.append("    contentStatuses: ").append(toIndentedString(contentStatuses)).append("\n");
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

