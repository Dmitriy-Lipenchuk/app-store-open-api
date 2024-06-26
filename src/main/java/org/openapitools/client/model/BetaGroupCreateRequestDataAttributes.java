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
 * BetaGroupCreateRequestDataAttributes
 */
@JsonPropertyOrder({
  BetaGroupCreateRequestDataAttributes.JSON_PROPERTY_NAME,
  BetaGroupCreateRequestDataAttributes.JSON_PROPERTY_IS_INTERNAL_GROUP,
  BetaGroupCreateRequestDataAttributes.JSON_PROPERTY_HAS_ACCESS_TO_ALL_BUILDS,
  BetaGroupCreateRequestDataAttributes.JSON_PROPERTY_PUBLIC_LINK_ENABLED,
  BetaGroupCreateRequestDataAttributes.JSON_PROPERTY_PUBLIC_LINK_LIMIT_ENABLED,
  BetaGroupCreateRequestDataAttributes.JSON_PROPERTY_PUBLIC_LINK_LIMIT,
  BetaGroupCreateRequestDataAttributes.JSON_PROPERTY_FEEDBACK_ENABLED
})
@JsonTypeName("BetaGroupCreateRequest_data_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BetaGroupCreateRequestDataAttributes {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_IS_INTERNAL_GROUP = "isInternalGroup";
  private Boolean isInternalGroup;

  public static final String JSON_PROPERTY_HAS_ACCESS_TO_ALL_BUILDS = "hasAccessToAllBuilds";
  private Boolean hasAccessToAllBuilds;

  public static final String JSON_PROPERTY_PUBLIC_LINK_ENABLED = "publicLinkEnabled";
  private Boolean publicLinkEnabled;

  public static final String JSON_PROPERTY_PUBLIC_LINK_LIMIT_ENABLED = "publicLinkLimitEnabled";
  private Boolean publicLinkLimitEnabled;

  public static final String JSON_PROPERTY_PUBLIC_LINK_LIMIT = "publicLinkLimit";
  private Integer publicLinkLimit;

  public static final String JSON_PROPERTY_FEEDBACK_ENABLED = "feedbackEnabled";
  private Boolean feedbackEnabled;

  public BetaGroupCreateRequestDataAttributes() { 
  }

  public BetaGroupCreateRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public BetaGroupCreateRequestDataAttributes isInternalGroup(Boolean isInternalGroup) {
    this.isInternalGroup = isInternalGroup;
    return this;
  }

   /**
   * Get isInternalGroup
   * @return isInternalGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_INTERNAL_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsInternalGroup() {
    return isInternalGroup;
  }


  @JsonProperty(JSON_PROPERTY_IS_INTERNAL_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsInternalGroup(Boolean isInternalGroup) {
    this.isInternalGroup = isInternalGroup;
  }


  public BetaGroupCreateRequestDataAttributes hasAccessToAllBuilds(Boolean hasAccessToAllBuilds) {
    this.hasAccessToAllBuilds = hasAccessToAllBuilds;
    return this;
  }

   /**
   * Get hasAccessToAllBuilds
   * @return hasAccessToAllBuilds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_ACCESS_TO_ALL_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasAccessToAllBuilds() {
    return hasAccessToAllBuilds;
  }


  @JsonProperty(JSON_PROPERTY_HAS_ACCESS_TO_ALL_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasAccessToAllBuilds(Boolean hasAccessToAllBuilds) {
    this.hasAccessToAllBuilds = hasAccessToAllBuilds;
  }


  public BetaGroupCreateRequestDataAttributes publicLinkEnabled(Boolean publicLinkEnabled) {
    this.publicLinkEnabled = publicLinkEnabled;
    return this;
  }

   /**
   * Get publicLinkEnabled
   * @return publicLinkEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_LINK_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPublicLinkEnabled() {
    return publicLinkEnabled;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_LINK_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicLinkEnabled(Boolean publicLinkEnabled) {
    this.publicLinkEnabled = publicLinkEnabled;
  }


  public BetaGroupCreateRequestDataAttributes publicLinkLimitEnabled(Boolean publicLinkLimitEnabled) {
    this.publicLinkLimitEnabled = publicLinkLimitEnabled;
    return this;
  }

   /**
   * Get publicLinkLimitEnabled
   * @return publicLinkLimitEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_LINK_LIMIT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPublicLinkLimitEnabled() {
    return publicLinkLimitEnabled;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_LINK_LIMIT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicLinkLimitEnabled(Boolean publicLinkLimitEnabled) {
    this.publicLinkLimitEnabled = publicLinkLimitEnabled;
  }


  public BetaGroupCreateRequestDataAttributes publicLinkLimit(Integer publicLinkLimit) {
    this.publicLinkLimit = publicLinkLimit;
    return this;
  }

   /**
   * Get publicLinkLimit
   * @return publicLinkLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_LINK_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPublicLinkLimit() {
    return publicLinkLimit;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_LINK_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicLinkLimit(Integer publicLinkLimit) {
    this.publicLinkLimit = publicLinkLimit;
  }


  public BetaGroupCreateRequestDataAttributes feedbackEnabled(Boolean feedbackEnabled) {
    this.feedbackEnabled = feedbackEnabled;
    return this;
  }

   /**
   * Get feedbackEnabled
   * @return feedbackEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEEDBACK_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFeedbackEnabled() {
    return feedbackEnabled;
  }


  @JsonProperty(JSON_PROPERTY_FEEDBACK_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeedbackEnabled(Boolean feedbackEnabled) {
    this.feedbackEnabled = feedbackEnabled;
  }


  /**
   * Return true if this BetaGroupCreateRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetaGroupCreateRequestDataAttributes betaGroupCreateRequestDataAttributes = (BetaGroupCreateRequestDataAttributes) o;
    return Objects.equals(this.name, betaGroupCreateRequestDataAttributes.name) &&
        Objects.equals(this.isInternalGroup, betaGroupCreateRequestDataAttributes.isInternalGroup) &&
        Objects.equals(this.hasAccessToAllBuilds, betaGroupCreateRequestDataAttributes.hasAccessToAllBuilds) &&
        Objects.equals(this.publicLinkEnabled, betaGroupCreateRequestDataAttributes.publicLinkEnabled) &&
        Objects.equals(this.publicLinkLimitEnabled, betaGroupCreateRequestDataAttributes.publicLinkLimitEnabled) &&
        Objects.equals(this.publicLinkLimit, betaGroupCreateRequestDataAttributes.publicLinkLimit) &&
        Objects.equals(this.feedbackEnabled, betaGroupCreateRequestDataAttributes.feedbackEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isInternalGroup, hasAccessToAllBuilds, publicLinkEnabled, publicLinkLimitEnabled, publicLinkLimit, feedbackEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaGroupCreateRequestDataAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isInternalGroup: ").append(toIndentedString(isInternalGroup)).append("\n");
    sb.append("    hasAccessToAllBuilds: ").append(toIndentedString(hasAccessToAllBuilds)).append("\n");
    sb.append("    publicLinkEnabled: ").append(toIndentedString(publicLinkEnabled)).append("\n");
    sb.append("    publicLinkLimitEnabled: ").append(toIndentedString(publicLinkLimitEnabled)).append("\n");
    sb.append("    publicLinkLimit: ").append(toIndentedString(publicLinkLimit)).append("\n");
    sb.append("    feedbackEnabled: ").append(toIndentedString(feedbackEnabled)).append("\n");
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

