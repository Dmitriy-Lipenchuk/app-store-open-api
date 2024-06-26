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
 * AppInfoLocalizationCreateRequestDataAttributes
 */
@JsonPropertyOrder({
  AppInfoLocalizationCreateRequestDataAttributes.JSON_PROPERTY_LOCALE,
  AppInfoLocalizationCreateRequestDataAttributes.JSON_PROPERTY_NAME,
  AppInfoLocalizationCreateRequestDataAttributes.JSON_PROPERTY_SUBTITLE,
  AppInfoLocalizationCreateRequestDataAttributes.JSON_PROPERTY_PRIVACY_POLICY_URL,
  AppInfoLocalizationCreateRequestDataAttributes.JSON_PROPERTY_PRIVACY_CHOICES_URL,
  AppInfoLocalizationCreateRequestDataAttributes.JSON_PROPERTY_PRIVACY_POLICY_TEXT
})
@JsonTypeName("AppInfoLocalizationCreateRequest_data_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppInfoLocalizationCreateRequestDataAttributes {
  public static final String JSON_PROPERTY_LOCALE = "locale";
  private String locale;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SUBTITLE = "subtitle";
  private String subtitle;

  public static final String JSON_PROPERTY_PRIVACY_POLICY_URL = "privacyPolicyUrl";
  private String privacyPolicyUrl;

  public static final String JSON_PROPERTY_PRIVACY_CHOICES_URL = "privacyChoicesUrl";
  private String privacyChoicesUrl;

  public static final String JSON_PROPERTY_PRIVACY_POLICY_TEXT = "privacyPolicyText";
  private String privacyPolicyText;

  public AppInfoLocalizationCreateRequestDataAttributes() { 
  }

  public AppInfoLocalizationCreateRequestDataAttributes locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLocale() {
    return locale;
  }


  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocale(String locale) {
    this.locale = locale;
  }


  public AppInfoLocalizationCreateRequestDataAttributes name(String name) {
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


  public AppInfoLocalizationCreateRequestDataAttributes subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

   /**
   * Get subtitle
   * @return subtitle
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBTITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubtitle() {
    return subtitle;
  }


  @JsonProperty(JSON_PROPERTY_SUBTITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  public AppInfoLocalizationCreateRequestDataAttributes privacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
    return this;
  }

   /**
   * Get privacyPolicyUrl
   * @return privacyPolicyUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVACY_POLICY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }


  @JsonProperty(JSON_PROPERTY_PRIVACY_POLICY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }


  public AppInfoLocalizationCreateRequestDataAttributes privacyChoicesUrl(String privacyChoicesUrl) {
    this.privacyChoicesUrl = privacyChoicesUrl;
    return this;
  }

   /**
   * Get privacyChoicesUrl
   * @return privacyChoicesUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVACY_CHOICES_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrivacyChoicesUrl() {
    return privacyChoicesUrl;
  }


  @JsonProperty(JSON_PROPERTY_PRIVACY_CHOICES_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivacyChoicesUrl(String privacyChoicesUrl) {
    this.privacyChoicesUrl = privacyChoicesUrl;
  }


  public AppInfoLocalizationCreateRequestDataAttributes privacyPolicyText(String privacyPolicyText) {
    this.privacyPolicyText = privacyPolicyText;
    return this;
  }

   /**
   * Get privacyPolicyText
   * @return privacyPolicyText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVACY_POLICY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrivacyPolicyText() {
    return privacyPolicyText;
  }


  @JsonProperty(JSON_PROPERTY_PRIVACY_POLICY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivacyPolicyText(String privacyPolicyText) {
    this.privacyPolicyText = privacyPolicyText;
  }


  /**
   * Return true if this AppInfoLocalizationCreateRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppInfoLocalizationCreateRequestDataAttributes appInfoLocalizationCreateRequestDataAttributes = (AppInfoLocalizationCreateRequestDataAttributes) o;
    return Objects.equals(this.locale, appInfoLocalizationCreateRequestDataAttributes.locale) &&
        Objects.equals(this.name, appInfoLocalizationCreateRequestDataAttributes.name) &&
        Objects.equals(this.subtitle, appInfoLocalizationCreateRequestDataAttributes.subtitle) &&
        Objects.equals(this.privacyPolicyUrl, appInfoLocalizationCreateRequestDataAttributes.privacyPolicyUrl) &&
        Objects.equals(this.privacyChoicesUrl, appInfoLocalizationCreateRequestDataAttributes.privacyChoicesUrl) &&
        Objects.equals(this.privacyPolicyText, appInfoLocalizationCreateRequestDataAttributes.privacyPolicyText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, name, subtitle, privacyPolicyUrl, privacyChoicesUrl, privacyPolicyText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppInfoLocalizationCreateRequestDataAttributes {\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
    sb.append("    privacyChoicesUrl: ").append(toIndentedString(privacyChoicesUrl)).append("\n");
    sb.append("    privacyPolicyText: ").append(toIndentedString(privacyPolicyText)).append("\n");
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
