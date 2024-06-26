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
import org.openapitools.client.model.AppAvailabilityRelationshipsApp;
import org.openapitools.client.model.AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion;
import org.openapitools.client.model.AppRelationshipsBetaGroups;
import org.openapitools.client.model.BetaGroupRelationshipsBetaTesters;
import org.openapitools.client.model.BuildRelationshipsAppEncryptionDeclaration;
import org.openapitools.client.model.BuildRelationshipsBetaAppReviewSubmission;
import org.openapitools.client.model.BuildRelationshipsBetaBuildLocalizations;
import org.openapitools.client.model.BuildRelationshipsBuildBetaDetail;
import org.openapitools.client.model.BuildRelationshipsBuildBundles;
import org.openapitools.client.model.BuildRelationshipsIcons;
import org.openapitools.client.model.BuildRelationshipsPreReleaseVersion;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * BuildRelationships
 */
@JsonPropertyOrder({
  BuildRelationships.JSON_PROPERTY_PRE_RELEASE_VERSION,
  BuildRelationships.JSON_PROPERTY_INDIVIDUAL_TESTERS,
  BuildRelationships.JSON_PROPERTY_BETA_GROUPS,
  BuildRelationships.JSON_PROPERTY_BETA_BUILD_LOCALIZATIONS,
  BuildRelationships.JSON_PROPERTY_APP_ENCRYPTION_DECLARATION,
  BuildRelationships.JSON_PROPERTY_BETA_APP_REVIEW_SUBMISSION,
  BuildRelationships.JSON_PROPERTY_APP,
  BuildRelationships.JSON_PROPERTY_BUILD_BETA_DETAIL,
  BuildRelationships.JSON_PROPERTY_APP_STORE_VERSION,
  BuildRelationships.JSON_PROPERTY_ICONS,
  BuildRelationships.JSON_PROPERTY_BUILD_BUNDLES
})
@JsonTypeName("Build_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BuildRelationships {
  public static final String JSON_PROPERTY_PRE_RELEASE_VERSION = "preReleaseVersion";
  private BuildRelationshipsPreReleaseVersion preReleaseVersion;

  public static final String JSON_PROPERTY_INDIVIDUAL_TESTERS = "individualTesters";
  private BetaGroupRelationshipsBetaTesters individualTesters;

  public static final String JSON_PROPERTY_BETA_GROUPS = "betaGroups";
  private AppRelationshipsBetaGroups betaGroups;

  public static final String JSON_PROPERTY_BETA_BUILD_LOCALIZATIONS = "betaBuildLocalizations";
  private BuildRelationshipsBetaBuildLocalizations betaBuildLocalizations;

  public static final String JSON_PROPERTY_APP_ENCRYPTION_DECLARATION = "appEncryptionDeclaration";
  private BuildRelationshipsAppEncryptionDeclaration appEncryptionDeclaration;

  public static final String JSON_PROPERTY_BETA_APP_REVIEW_SUBMISSION = "betaAppReviewSubmission";
  private BuildRelationshipsBetaAppReviewSubmission betaAppReviewSubmission;

  public static final String JSON_PROPERTY_APP = "app";
  private AppAvailabilityRelationshipsApp app;

  public static final String JSON_PROPERTY_BUILD_BETA_DETAIL = "buildBetaDetail";
  private BuildRelationshipsBuildBetaDetail buildBetaDetail;

  public static final String JSON_PROPERTY_APP_STORE_VERSION = "appStoreVersion";
  private AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion;

  public static final String JSON_PROPERTY_ICONS = "icons";
  private BuildRelationshipsIcons icons;

  public static final String JSON_PROPERTY_BUILD_BUNDLES = "buildBundles";
  private BuildRelationshipsBuildBundles buildBundles;

  public BuildRelationships() { 
  }

  public BuildRelationships preReleaseVersion(BuildRelationshipsPreReleaseVersion preReleaseVersion) {
    this.preReleaseVersion = preReleaseVersion;
    return this;
  }

   /**
   * Get preReleaseVersion
   * @return preReleaseVersion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRE_RELEASE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BuildRelationshipsPreReleaseVersion getPreReleaseVersion() {
    return preReleaseVersion;
  }


  @JsonProperty(JSON_PROPERTY_PRE_RELEASE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreReleaseVersion(BuildRelationshipsPreReleaseVersion preReleaseVersion) {
    this.preReleaseVersion = preReleaseVersion;
  }


  public BuildRelationships individualTesters(BetaGroupRelationshipsBetaTesters individualTesters) {
    this.individualTesters = individualTesters;
    return this;
  }

   /**
   * Get individualTesters
   * @return individualTesters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDIVIDUAL_TESTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BetaGroupRelationshipsBetaTesters getIndividualTesters() {
    return individualTesters;
  }


  @JsonProperty(JSON_PROPERTY_INDIVIDUAL_TESTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndividualTesters(BetaGroupRelationshipsBetaTesters individualTesters) {
    this.individualTesters = individualTesters;
  }


  public BuildRelationships betaGroups(AppRelationshipsBetaGroups betaGroups) {
    this.betaGroups = betaGroups;
    return this;
  }

   /**
   * Get betaGroups
   * @return betaGroups
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BETA_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppRelationshipsBetaGroups getBetaGroups() {
    return betaGroups;
  }


  @JsonProperty(JSON_PROPERTY_BETA_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBetaGroups(AppRelationshipsBetaGroups betaGroups) {
    this.betaGroups = betaGroups;
  }


  public BuildRelationships betaBuildLocalizations(BuildRelationshipsBetaBuildLocalizations betaBuildLocalizations) {
    this.betaBuildLocalizations = betaBuildLocalizations;
    return this;
  }

   /**
   * Get betaBuildLocalizations
   * @return betaBuildLocalizations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BETA_BUILD_LOCALIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BuildRelationshipsBetaBuildLocalizations getBetaBuildLocalizations() {
    return betaBuildLocalizations;
  }


  @JsonProperty(JSON_PROPERTY_BETA_BUILD_LOCALIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBetaBuildLocalizations(BuildRelationshipsBetaBuildLocalizations betaBuildLocalizations) {
    this.betaBuildLocalizations = betaBuildLocalizations;
  }


  public BuildRelationships appEncryptionDeclaration(BuildRelationshipsAppEncryptionDeclaration appEncryptionDeclaration) {
    this.appEncryptionDeclaration = appEncryptionDeclaration;
    return this;
  }

   /**
   * Get appEncryptionDeclaration
   * @return appEncryptionDeclaration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_ENCRYPTION_DECLARATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BuildRelationshipsAppEncryptionDeclaration getAppEncryptionDeclaration() {
    return appEncryptionDeclaration;
  }


  @JsonProperty(JSON_PROPERTY_APP_ENCRYPTION_DECLARATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppEncryptionDeclaration(BuildRelationshipsAppEncryptionDeclaration appEncryptionDeclaration) {
    this.appEncryptionDeclaration = appEncryptionDeclaration;
  }


  public BuildRelationships betaAppReviewSubmission(BuildRelationshipsBetaAppReviewSubmission betaAppReviewSubmission) {
    this.betaAppReviewSubmission = betaAppReviewSubmission;
    return this;
  }

   /**
   * Get betaAppReviewSubmission
   * @return betaAppReviewSubmission
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BETA_APP_REVIEW_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BuildRelationshipsBetaAppReviewSubmission getBetaAppReviewSubmission() {
    return betaAppReviewSubmission;
  }


  @JsonProperty(JSON_PROPERTY_BETA_APP_REVIEW_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBetaAppReviewSubmission(BuildRelationshipsBetaAppReviewSubmission betaAppReviewSubmission) {
    this.betaAppReviewSubmission = betaAppReviewSubmission;
  }


  public BuildRelationships app(AppAvailabilityRelationshipsApp app) {
    this.app = app;
    return this;
  }

   /**
   * Get app
   * @return app
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppAvailabilityRelationshipsApp getApp() {
    return app;
  }


  @JsonProperty(JSON_PROPERTY_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApp(AppAvailabilityRelationshipsApp app) {
    this.app = app;
  }


  public BuildRelationships buildBetaDetail(BuildRelationshipsBuildBetaDetail buildBetaDetail) {
    this.buildBetaDetail = buildBetaDetail;
    return this;
  }

   /**
   * Get buildBetaDetail
   * @return buildBetaDetail
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILD_BETA_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BuildRelationshipsBuildBetaDetail getBuildBetaDetail() {
    return buildBetaDetail;
  }


  @JsonProperty(JSON_PROPERTY_BUILD_BETA_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildBetaDetail(BuildRelationshipsBuildBetaDetail buildBetaDetail) {
    this.buildBetaDetail = buildBetaDetail;
  }


  public BuildRelationships appStoreVersion(AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
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

  public AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion getAppStoreVersion() {
    return appStoreVersion;
  }


  @JsonProperty(JSON_PROPERTY_APP_STORE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppStoreVersion(AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
    this.appStoreVersion = appStoreVersion;
  }


  public BuildRelationships icons(BuildRelationshipsIcons icons) {
    this.icons = icons;
    return this;
  }

   /**
   * Get icons
   * @return icons
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BuildRelationshipsIcons getIcons() {
    return icons;
  }


  @JsonProperty(JSON_PROPERTY_ICONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIcons(BuildRelationshipsIcons icons) {
    this.icons = icons;
  }


  public BuildRelationships buildBundles(BuildRelationshipsBuildBundles buildBundles) {
    this.buildBundles = buildBundles;
    return this;
  }

   /**
   * Get buildBundles
   * @return buildBundles
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILD_BUNDLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BuildRelationshipsBuildBundles getBuildBundles() {
    return buildBundles;
  }


  @JsonProperty(JSON_PROPERTY_BUILD_BUNDLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildBundles(BuildRelationshipsBuildBundles buildBundles) {
    this.buildBundles = buildBundles;
  }


  /**
   * Return true if this Build_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildRelationships buildRelationships = (BuildRelationships) o;
    return Objects.equals(this.preReleaseVersion, buildRelationships.preReleaseVersion) &&
        Objects.equals(this.individualTesters, buildRelationships.individualTesters) &&
        Objects.equals(this.betaGroups, buildRelationships.betaGroups) &&
        Objects.equals(this.betaBuildLocalizations, buildRelationships.betaBuildLocalizations) &&
        Objects.equals(this.appEncryptionDeclaration, buildRelationships.appEncryptionDeclaration) &&
        Objects.equals(this.betaAppReviewSubmission, buildRelationships.betaAppReviewSubmission) &&
        Objects.equals(this.app, buildRelationships.app) &&
        Objects.equals(this.buildBetaDetail, buildRelationships.buildBetaDetail) &&
        Objects.equals(this.appStoreVersion, buildRelationships.appStoreVersion) &&
        Objects.equals(this.icons, buildRelationships.icons) &&
        Objects.equals(this.buildBundles, buildRelationships.buildBundles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preReleaseVersion, individualTesters, betaGroups, betaBuildLocalizations, appEncryptionDeclaration, betaAppReviewSubmission, app, buildBetaDetail, appStoreVersion, icons, buildBundles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildRelationships {\n");
    sb.append("    preReleaseVersion: ").append(toIndentedString(preReleaseVersion)).append("\n");
    sb.append("    individualTesters: ").append(toIndentedString(individualTesters)).append("\n");
    sb.append("    betaGroups: ").append(toIndentedString(betaGroups)).append("\n");
    sb.append("    betaBuildLocalizations: ").append(toIndentedString(betaBuildLocalizations)).append("\n");
    sb.append("    appEncryptionDeclaration: ").append(toIndentedString(appEncryptionDeclaration)).append("\n");
    sb.append("    betaAppReviewSubmission: ").append(toIndentedString(betaAppReviewSubmission)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    buildBetaDetail: ").append(toIndentedString(buildBetaDetail)).append("\n");
    sb.append("    appStoreVersion: ").append(toIndentedString(appStoreVersion)).append("\n");
    sb.append("    icons: ").append(toIndentedString(icons)).append("\n");
    sb.append("    buildBundles: ").append(toIndentedString(buildBundles)).append("\n");
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

