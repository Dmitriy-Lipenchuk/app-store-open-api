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
import org.openapitools.client.model.AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion;
import org.openapitools.client.model.AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion;
import org.openapitools.client.model.AppStoreVersionExperimentTreatmentCreateRequestDataRelationshipsAppStoreVersionExperimentV2;
import org.openapitools.client.model.ReviewSubmissionItemCreateRequestDataRelationshipsAppEvent;
import org.openapitools.client.model.ReviewSubmissionItemCreateRequestDataRelationshipsReviewSubmission;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * ReviewSubmissionItemCreateRequestDataRelationships
 */
@JsonPropertyOrder({
  ReviewSubmissionItemCreateRequestDataRelationships.JSON_PROPERTY_REVIEW_SUBMISSION,
  ReviewSubmissionItemCreateRequestDataRelationships.JSON_PROPERTY_APP_STORE_VERSION,
  ReviewSubmissionItemCreateRequestDataRelationships.JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE_VERSION,
  ReviewSubmissionItemCreateRequestDataRelationships.JSON_PROPERTY_APP_STORE_VERSION_EXPERIMENT,
  ReviewSubmissionItemCreateRequestDataRelationships.JSON_PROPERTY_APP_STORE_VERSION_EXPERIMENT_V2,
  ReviewSubmissionItemCreateRequestDataRelationships.JSON_PROPERTY_APP_EVENT
})
@JsonTypeName("ReviewSubmissionItemCreateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class ReviewSubmissionItemCreateRequestDataRelationships {
  public static final String JSON_PROPERTY_REVIEW_SUBMISSION = "reviewSubmission";
  private ReviewSubmissionItemCreateRequestDataRelationshipsReviewSubmission reviewSubmission;

  public static final String JSON_PROPERTY_APP_STORE_VERSION = "appStoreVersion";
  private AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion appStoreVersion;

  public static final String JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE_VERSION = "appCustomProductPageVersion";
  private AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion appCustomProductPageVersion;

  public static final String JSON_PROPERTY_APP_STORE_VERSION_EXPERIMENT = "appStoreVersionExperiment";
  private AppStoreVersionExperimentTreatmentCreateRequestDataRelationshipsAppStoreVersionExperimentV2 appStoreVersionExperiment;

  public static final String JSON_PROPERTY_APP_STORE_VERSION_EXPERIMENT_V2 = "appStoreVersionExperimentV2";
  private AppStoreVersionExperimentTreatmentCreateRequestDataRelationshipsAppStoreVersionExperimentV2 appStoreVersionExperimentV2;

  public static final String JSON_PROPERTY_APP_EVENT = "appEvent";
  private ReviewSubmissionItemCreateRequestDataRelationshipsAppEvent appEvent;

  public ReviewSubmissionItemCreateRequestDataRelationships() { 
  }

  public ReviewSubmissionItemCreateRequestDataRelationships reviewSubmission(ReviewSubmissionItemCreateRequestDataRelationshipsReviewSubmission reviewSubmission) {
    this.reviewSubmission = reviewSubmission;
    return this;
  }

   /**
   * Get reviewSubmission
   * @return reviewSubmission
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REVIEW_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ReviewSubmissionItemCreateRequestDataRelationshipsReviewSubmission getReviewSubmission() {
    return reviewSubmission;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReviewSubmission(ReviewSubmissionItemCreateRequestDataRelationshipsReviewSubmission reviewSubmission) {
    this.reviewSubmission = reviewSubmission;
  }


  public ReviewSubmissionItemCreateRequestDataRelationships appStoreVersion(AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
    this.appStoreVersion = appStoreVersion;
    return this;
  }

   /**
   * Get appStoreVersion
   * @return appStoreVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_STORE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion getAppStoreVersion() {
    return appStoreVersion;
  }


  @JsonProperty(JSON_PROPERTY_APP_STORE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppStoreVersion(AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
    this.appStoreVersion = appStoreVersion;
  }


  public ReviewSubmissionItemCreateRequestDataRelationships appCustomProductPageVersion(AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion appCustomProductPageVersion) {
    this.appCustomProductPageVersion = appCustomProductPageVersion;
    return this;
  }

   /**
   * Get appCustomProductPageVersion
   * @return appCustomProductPageVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion getAppCustomProductPageVersion() {
    return appCustomProductPageVersion;
  }


  @JsonProperty(JSON_PROPERTY_APP_CUSTOM_PRODUCT_PAGE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppCustomProductPageVersion(AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion appCustomProductPageVersion) {
    this.appCustomProductPageVersion = appCustomProductPageVersion;
  }


  public ReviewSubmissionItemCreateRequestDataRelationships appStoreVersionExperiment(AppStoreVersionExperimentTreatmentCreateRequestDataRelationshipsAppStoreVersionExperimentV2 appStoreVersionExperiment) {
    this.appStoreVersionExperiment = appStoreVersionExperiment;
    return this;
  }

   /**
   * Get appStoreVersionExperiment
   * @return appStoreVersionExperiment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_STORE_VERSION_EXPERIMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppStoreVersionExperimentTreatmentCreateRequestDataRelationshipsAppStoreVersionExperimentV2 getAppStoreVersionExperiment() {
    return appStoreVersionExperiment;
  }


  @JsonProperty(JSON_PROPERTY_APP_STORE_VERSION_EXPERIMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppStoreVersionExperiment(AppStoreVersionExperimentTreatmentCreateRequestDataRelationshipsAppStoreVersionExperimentV2 appStoreVersionExperiment) {
    this.appStoreVersionExperiment = appStoreVersionExperiment;
  }


  public ReviewSubmissionItemCreateRequestDataRelationships appStoreVersionExperimentV2(AppStoreVersionExperimentTreatmentCreateRequestDataRelationshipsAppStoreVersionExperimentV2 appStoreVersionExperimentV2) {
    this.appStoreVersionExperimentV2 = appStoreVersionExperimentV2;
    return this;
  }

   /**
   * Get appStoreVersionExperimentV2
   * @return appStoreVersionExperimentV2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_STORE_VERSION_EXPERIMENT_V2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppStoreVersionExperimentTreatmentCreateRequestDataRelationshipsAppStoreVersionExperimentV2 getAppStoreVersionExperimentV2() {
    return appStoreVersionExperimentV2;
  }


  @JsonProperty(JSON_PROPERTY_APP_STORE_VERSION_EXPERIMENT_V2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppStoreVersionExperimentV2(AppStoreVersionExperimentTreatmentCreateRequestDataRelationshipsAppStoreVersionExperimentV2 appStoreVersionExperimentV2) {
    this.appStoreVersionExperimentV2 = appStoreVersionExperimentV2;
  }


  public ReviewSubmissionItemCreateRequestDataRelationships appEvent(ReviewSubmissionItemCreateRequestDataRelationshipsAppEvent appEvent) {
    this.appEvent = appEvent;
    return this;
  }

   /**
   * Get appEvent
   * @return appEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReviewSubmissionItemCreateRequestDataRelationshipsAppEvent getAppEvent() {
    return appEvent;
  }


  @JsonProperty(JSON_PROPERTY_APP_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppEvent(ReviewSubmissionItemCreateRequestDataRelationshipsAppEvent appEvent) {
    this.appEvent = appEvent;
  }


  /**
   * Return true if this ReviewSubmissionItemCreateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewSubmissionItemCreateRequestDataRelationships reviewSubmissionItemCreateRequestDataRelationships = (ReviewSubmissionItemCreateRequestDataRelationships) o;
    return Objects.equals(this.reviewSubmission, reviewSubmissionItemCreateRequestDataRelationships.reviewSubmission) &&
        Objects.equals(this.appStoreVersion, reviewSubmissionItemCreateRequestDataRelationships.appStoreVersion) &&
        Objects.equals(this.appCustomProductPageVersion, reviewSubmissionItemCreateRequestDataRelationships.appCustomProductPageVersion) &&
        Objects.equals(this.appStoreVersionExperiment, reviewSubmissionItemCreateRequestDataRelationships.appStoreVersionExperiment) &&
        Objects.equals(this.appStoreVersionExperimentV2, reviewSubmissionItemCreateRequestDataRelationships.appStoreVersionExperimentV2) &&
        Objects.equals(this.appEvent, reviewSubmissionItemCreateRequestDataRelationships.appEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewSubmission, appStoreVersion, appCustomProductPageVersion, appStoreVersionExperiment, appStoreVersionExperimentV2, appEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewSubmissionItemCreateRequestDataRelationships {\n");
    sb.append("    reviewSubmission: ").append(toIndentedString(reviewSubmission)).append("\n");
    sb.append("    appStoreVersion: ").append(toIndentedString(appStoreVersion)).append("\n");
    sb.append("    appCustomProductPageVersion: ").append(toIndentedString(appCustomProductPageVersion)).append("\n");
    sb.append("    appStoreVersionExperiment: ").append(toIndentedString(appStoreVersionExperiment)).append("\n");
    sb.append("    appStoreVersionExperimentV2: ").append(toIndentedString(appStoreVersionExperimentV2)).append("\n");
    sb.append("    appEvent: ").append(toIndentedString(appEvent)).append("\n");
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

