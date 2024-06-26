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
 * BetaAppLocalizationCreateRequestDataAttributes
 */
@JsonPropertyOrder({
  BetaAppLocalizationCreateRequestDataAttributes.JSON_PROPERTY_FEEDBACK_EMAIL,
  BetaAppLocalizationCreateRequestDataAttributes.JSON_PROPERTY_MARKETING_URL,
  BetaAppLocalizationCreateRequestDataAttributes.JSON_PROPERTY_PRIVACY_POLICY_URL,
  BetaAppLocalizationCreateRequestDataAttributes.JSON_PROPERTY_TV_OS_PRIVACY_POLICY,
  BetaAppLocalizationCreateRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  BetaAppLocalizationCreateRequestDataAttributes.JSON_PROPERTY_LOCALE
})
@JsonTypeName("BetaAppLocalizationCreateRequest_data_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BetaAppLocalizationCreateRequestDataAttributes {
  public static final String JSON_PROPERTY_FEEDBACK_EMAIL = "feedbackEmail";
  private String feedbackEmail;

  public static final String JSON_PROPERTY_MARKETING_URL = "marketingUrl";
  private String marketingUrl;

  public static final String JSON_PROPERTY_PRIVACY_POLICY_URL = "privacyPolicyUrl";
  private String privacyPolicyUrl;

  public static final String JSON_PROPERTY_TV_OS_PRIVACY_POLICY = "tvOsPrivacyPolicy";
  private String tvOsPrivacyPolicy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private String locale;

  public BetaAppLocalizationCreateRequestDataAttributes() { 
  }

  public BetaAppLocalizationCreateRequestDataAttributes feedbackEmail(String feedbackEmail) {
    this.feedbackEmail = feedbackEmail;
    return this;
  }

   /**
   * Get feedbackEmail
   * @return feedbackEmail
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEEDBACK_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFeedbackEmail() {
    return feedbackEmail;
  }


  @JsonProperty(JSON_PROPERTY_FEEDBACK_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedbackEmail(String feedbackEmail) {
    this.feedbackEmail = feedbackEmail;
  }


  public BetaAppLocalizationCreateRequestDataAttributes marketingUrl(String marketingUrl) {
    this.marketingUrl = marketingUrl;
    return this;
  }

   /**
   * Get marketingUrl
   * @return marketingUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARKETING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMarketingUrl() {
    return marketingUrl;
  }


  @JsonProperty(JSON_PROPERTY_MARKETING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketingUrl(String marketingUrl) {
    this.marketingUrl = marketingUrl;
  }


  public BetaAppLocalizationCreateRequestDataAttributes privacyPolicyUrl(String privacyPolicyUrl) {
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


  public BetaAppLocalizationCreateRequestDataAttributes tvOsPrivacyPolicy(String tvOsPrivacyPolicy) {
    this.tvOsPrivacyPolicy = tvOsPrivacyPolicy;
    return this;
  }

   /**
   * Get tvOsPrivacyPolicy
   * @return tvOsPrivacyPolicy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TV_OS_PRIVACY_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTvOsPrivacyPolicy() {
    return tvOsPrivacyPolicy;
  }


  @JsonProperty(JSON_PROPERTY_TV_OS_PRIVACY_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTvOsPrivacyPolicy(String tvOsPrivacyPolicy) {
    this.tvOsPrivacyPolicy = tvOsPrivacyPolicy;
  }


  public BetaAppLocalizationCreateRequestDataAttributes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public BetaAppLocalizationCreateRequestDataAttributes locale(String locale) {
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


  /**
   * Return true if this BetaAppLocalizationCreateRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetaAppLocalizationCreateRequestDataAttributes betaAppLocalizationCreateRequestDataAttributes = (BetaAppLocalizationCreateRequestDataAttributes) o;
    return Objects.equals(this.feedbackEmail, betaAppLocalizationCreateRequestDataAttributes.feedbackEmail) &&
        Objects.equals(this.marketingUrl, betaAppLocalizationCreateRequestDataAttributes.marketingUrl) &&
        Objects.equals(this.privacyPolicyUrl, betaAppLocalizationCreateRequestDataAttributes.privacyPolicyUrl) &&
        Objects.equals(this.tvOsPrivacyPolicy, betaAppLocalizationCreateRequestDataAttributes.tvOsPrivacyPolicy) &&
        Objects.equals(this.description, betaAppLocalizationCreateRequestDataAttributes.description) &&
        Objects.equals(this.locale, betaAppLocalizationCreateRequestDataAttributes.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackEmail, marketingUrl, privacyPolicyUrl, tvOsPrivacyPolicy, description, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaAppLocalizationCreateRequestDataAttributes {\n");
    sb.append("    feedbackEmail: ").append(toIndentedString(feedbackEmail)).append("\n");
    sb.append("    marketingUrl: ").append(toIndentedString(marketingUrl)).append("\n");
    sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
    sb.append("    tvOsPrivacyPolicy: ").append(toIndentedString(tvOsPrivacyPolicy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

