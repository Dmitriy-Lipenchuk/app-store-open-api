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
 * AppStoreReviewDetailAttributes
 */
@JsonPropertyOrder({
  AppStoreReviewDetailAttributes.JSON_PROPERTY_CONTACT_FIRST_NAME,
  AppStoreReviewDetailAttributes.JSON_PROPERTY_CONTACT_LAST_NAME,
  AppStoreReviewDetailAttributes.JSON_PROPERTY_CONTACT_PHONE,
  AppStoreReviewDetailAttributes.JSON_PROPERTY_CONTACT_EMAIL,
  AppStoreReviewDetailAttributes.JSON_PROPERTY_DEMO_ACCOUNT_NAME,
  AppStoreReviewDetailAttributes.JSON_PROPERTY_DEMO_ACCOUNT_PASSWORD,
  AppStoreReviewDetailAttributes.JSON_PROPERTY_DEMO_ACCOUNT_REQUIRED,
  AppStoreReviewDetailAttributes.JSON_PROPERTY_NOTES
})
@JsonTypeName("AppStoreReviewDetail_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppStoreReviewDetailAttributes {
  public static final String JSON_PROPERTY_CONTACT_FIRST_NAME = "contactFirstName";
  private String contactFirstName;

  public static final String JSON_PROPERTY_CONTACT_LAST_NAME = "contactLastName";
  private String contactLastName;

  public static final String JSON_PROPERTY_CONTACT_PHONE = "contactPhone";
  private String contactPhone;

  public static final String JSON_PROPERTY_CONTACT_EMAIL = "contactEmail";
  private String contactEmail;

  public static final String JSON_PROPERTY_DEMO_ACCOUNT_NAME = "demoAccountName";
  private String demoAccountName;

  public static final String JSON_PROPERTY_DEMO_ACCOUNT_PASSWORD = "demoAccountPassword";
  private String demoAccountPassword;

  public static final String JSON_PROPERTY_DEMO_ACCOUNT_REQUIRED = "demoAccountRequired";
  private Boolean demoAccountRequired;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public AppStoreReviewDetailAttributes() { 
  }

  public AppStoreReviewDetailAttributes contactFirstName(String contactFirstName) {
    this.contactFirstName = contactFirstName;
    return this;
  }

   /**
   * Get contactFirstName
   * @return contactFirstName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactFirstName() {
    return contactFirstName;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactFirstName(String contactFirstName) {
    this.contactFirstName = contactFirstName;
  }


  public AppStoreReviewDetailAttributes contactLastName(String contactLastName) {
    this.contactLastName = contactLastName;
    return this;
  }

   /**
   * Get contactLastName
   * @return contactLastName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactLastName() {
    return contactLastName;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactLastName(String contactLastName) {
    this.contactLastName = contactLastName;
  }


  public AppStoreReviewDetailAttributes contactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
    return this;
  }

   /**
   * Get contactPhone
   * @return contactPhone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactPhone() {
    return contactPhone;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }


  public AppStoreReviewDetailAttributes contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * Get contactEmail
   * @return contactEmail
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactEmail() {
    return contactEmail;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }


  public AppStoreReviewDetailAttributes demoAccountName(String demoAccountName) {
    this.demoAccountName = demoAccountName;
    return this;
  }

   /**
   * Get demoAccountName
   * @return demoAccountName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEMO_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDemoAccountName() {
    return demoAccountName;
  }


  @JsonProperty(JSON_PROPERTY_DEMO_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDemoAccountName(String demoAccountName) {
    this.demoAccountName = demoAccountName;
  }


  public AppStoreReviewDetailAttributes demoAccountPassword(String demoAccountPassword) {
    this.demoAccountPassword = demoAccountPassword;
    return this;
  }

   /**
   * Get demoAccountPassword
   * @return demoAccountPassword
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEMO_ACCOUNT_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDemoAccountPassword() {
    return demoAccountPassword;
  }


  @JsonProperty(JSON_PROPERTY_DEMO_ACCOUNT_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDemoAccountPassword(String demoAccountPassword) {
    this.demoAccountPassword = demoAccountPassword;
  }


  public AppStoreReviewDetailAttributes demoAccountRequired(Boolean demoAccountRequired) {
    this.demoAccountRequired = demoAccountRequired;
    return this;
  }

   /**
   * Get demoAccountRequired
   * @return demoAccountRequired
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEMO_ACCOUNT_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDemoAccountRequired() {
    return demoAccountRequired;
  }


  @JsonProperty(JSON_PROPERTY_DEMO_ACCOUNT_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDemoAccountRequired(Boolean demoAccountRequired) {
    this.demoAccountRequired = demoAccountRequired;
  }


  public AppStoreReviewDetailAttributes notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotes() {
    return notes;
  }


  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotes(String notes) {
    this.notes = notes;
  }


  /**
   * Return true if this AppStoreReviewDetail_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreReviewDetailAttributes appStoreReviewDetailAttributes = (AppStoreReviewDetailAttributes) o;
    return Objects.equals(this.contactFirstName, appStoreReviewDetailAttributes.contactFirstName) &&
        Objects.equals(this.contactLastName, appStoreReviewDetailAttributes.contactLastName) &&
        Objects.equals(this.contactPhone, appStoreReviewDetailAttributes.contactPhone) &&
        Objects.equals(this.contactEmail, appStoreReviewDetailAttributes.contactEmail) &&
        Objects.equals(this.demoAccountName, appStoreReviewDetailAttributes.demoAccountName) &&
        Objects.equals(this.demoAccountPassword, appStoreReviewDetailAttributes.demoAccountPassword) &&
        Objects.equals(this.demoAccountRequired, appStoreReviewDetailAttributes.demoAccountRequired) &&
        Objects.equals(this.notes, appStoreReviewDetailAttributes.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactFirstName, contactLastName, contactPhone, contactEmail, demoAccountName, demoAccountPassword, demoAccountRequired, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreReviewDetailAttributes {\n");
    sb.append("    contactFirstName: ").append(toIndentedString(contactFirstName)).append("\n");
    sb.append("    contactLastName: ").append(toIndentedString(contactLastName)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    demoAccountName: ").append(toIndentedString(demoAccountName)).append("\n");
    sb.append("    demoAccountPassword: ").append(toIndentedString(demoAccountPassword)).append("\n");
    sb.append("    demoAccountRequired: ").append(toIndentedString(demoAccountRequired)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

