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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * CiScheduledStartConditionSchedule
 */
@JsonPropertyOrder({
  CiScheduledStartConditionSchedule.JSON_PROPERTY_FREQUENCY,
  CiScheduledStartConditionSchedule.JSON_PROPERTY_DAYS,
  CiScheduledStartConditionSchedule.JSON_PROPERTY_HOUR,
  CiScheduledStartConditionSchedule.JSON_PROPERTY_MINUTE,
  CiScheduledStartConditionSchedule.JSON_PROPERTY_TIMEZONE
})
@JsonTypeName("CiScheduledStartCondition_schedule")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CiScheduledStartConditionSchedule {
  /**
   * Gets or Sets frequency
   */
  public enum FrequencyEnum {
    WEEKLY("WEEKLY"),
    
    DAILY("DAILY"),
    
    HOURLY("HOURLY");

    private String value;

    FrequencyEnum(String value) {
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
    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private FrequencyEnum frequency;

  /**
   * Gets or Sets days
   */
  public enum DaysEnum {
    SUNDAY("SUNDAY"),
    
    MONDAY("MONDAY"),
    
    TUESDAY("TUESDAY"),
    
    WEDNESDAY("WEDNESDAY"),
    
    THURSDAY("THURSDAY"),
    
    FRIDAY("FRIDAY"),
    
    SATURDAY("SATURDAY");

    private String value;

    DaysEnum(String value) {
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
    public static DaysEnum fromValue(String value) {
      for (DaysEnum b : DaysEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DAYS = "days";
  private List<DaysEnum> days = new ArrayList<>();

  public static final String JSON_PROPERTY_HOUR = "hour";
  private Integer hour;

  public static final String JSON_PROPERTY_MINUTE = "minute";
  private Integer minute;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public CiScheduledStartConditionSchedule() { 
  }

  public CiScheduledStartConditionSchedule frequency(FrequencyEnum frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FrequencyEnum getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  public CiScheduledStartConditionSchedule days(List<DaysEnum> days) {
    this.days = days;
    return this;
  }

  public CiScheduledStartConditionSchedule addDaysItem(DaysEnum daysItem) {
    if (this.days == null) {
      this.days = new ArrayList<>();
    }
    this.days.add(daysItem);
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DaysEnum> getDays() {
    return days;
  }


  @JsonProperty(JSON_PROPERTY_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDays(List<DaysEnum> days) {
    this.days = days;
  }


  public CiScheduledStartConditionSchedule hour(Integer hour) {
    this.hour = hour;
    return this;
  }

   /**
   * Get hour
   * @return hour
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHour() {
    return hour;
  }


  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHour(Integer hour) {
    this.hour = hour;
  }


  public CiScheduledStartConditionSchedule minute(Integer minute) {
    this.minute = minute;
    return this;
  }

   /**
   * Get minute
   * @return minute
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinute() {
    return minute;
  }


  @JsonProperty(JSON_PROPERTY_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinute(Integer minute) {
    this.minute = minute;
  }


  public CiScheduledStartConditionSchedule timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  /**
   * Return true if this CiScheduledStartCondition_schedule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CiScheduledStartConditionSchedule ciScheduledStartConditionSchedule = (CiScheduledStartConditionSchedule) o;
    return Objects.equals(this.frequency, ciScheduledStartConditionSchedule.frequency) &&
        Objects.equals(this.days, ciScheduledStartConditionSchedule.days) &&
        Objects.equals(this.hour, ciScheduledStartConditionSchedule.hour) &&
        Objects.equals(this.minute, ciScheduledStartConditionSchedule.minute) &&
        Objects.equals(this.timezone, ciScheduledStartConditionSchedule.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, days, hour, minute, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CiScheduledStartConditionSchedule {\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

