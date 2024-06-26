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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.CiBuildRunAttributesSourceCommit;
import org.openapitools.client.model.CiCompletionStatus;
import org.openapitools.client.model.CiExecutionProgress;
import org.openapitools.client.model.CiIssueCounts;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * CiBuildRunAttributes
 */
@JsonPropertyOrder({
  CiBuildRunAttributes.JSON_PROPERTY_NUMBER,
  CiBuildRunAttributes.JSON_PROPERTY_CREATED_DATE,
  CiBuildRunAttributes.JSON_PROPERTY_STARTED_DATE,
  CiBuildRunAttributes.JSON_PROPERTY_FINISHED_DATE,
  CiBuildRunAttributes.JSON_PROPERTY_SOURCE_COMMIT,
  CiBuildRunAttributes.JSON_PROPERTY_DESTINATION_COMMIT,
  CiBuildRunAttributes.JSON_PROPERTY_IS_PULL_REQUEST_BUILD,
  CiBuildRunAttributes.JSON_PROPERTY_ISSUE_COUNTS,
  CiBuildRunAttributes.JSON_PROPERTY_EXECUTION_PROGRESS,
  CiBuildRunAttributes.JSON_PROPERTY_COMPLETION_STATUS,
  CiBuildRunAttributes.JSON_PROPERTY_START_REASON,
  CiBuildRunAttributes.JSON_PROPERTY_CANCEL_REASON
})
@JsonTypeName("CiBuildRun_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CiBuildRunAttributes {
  public static final String JSON_PROPERTY_NUMBER = "number";
  private Integer number;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_STARTED_DATE = "startedDate";
  private OffsetDateTime startedDate;

  public static final String JSON_PROPERTY_FINISHED_DATE = "finishedDate";
  private OffsetDateTime finishedDate;

  public static final String JSON_PROPERTY_SOURCE_COMMIT = "sourceCommit";
  private CiBuildRunAttributesSourceCommit sourceCommit;

  public static final String JSON_PROPERTY_DESTINATION_COMMIT = "destinationCommit";
  private CiBuildRunAttributesSourceCommit destinationCommit;

  public static final String JSON_PROPERTY_IS_PULL_REQUEST_BUILD = "isPullRequestBuild";
  private Boolean isPullRequestBuild;

  public static final String JSON_PROPERTY_ISSUE_COUNTS = "issueCounts";
  private CiIssueCounts issueCounts;

  public static final String JSON_PROPERTY_EXECUTION_PROGRESS = "executionProgress";
  private CiExecutionProgress executionProgress;

  public static final String JSON_PROPERTY_COMPLETION_STATUS = "completionStatus";
  private CiCompletionStatus completionStatus;

  /**
   * Gets or Sets startReason
   */
  public enum StartReasonEnum {
    GIT_REF_CHANGE("GIT_REF_CHANGE"),
    
    MANUAL("MANUAL"),
    
    MANUAL_REBUILD("MANUAL_REBUILD"),
    
    PULL_REQUEST_OPEN("PULL_REQUEST_OPEN"),
    
    PULL_REQUEST_UPDATE("PULL_REQUEST_UPDATE"),
    
    SCHEDULE("SCHEDULE");

    private String value;

    StartReasonEnum(String value) {
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
    public static StartReasonEnum fromValue(String value) {
      for (StartReasonEnum b : StartReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_START_REASON = "startReason";
  private StartReasonEnum startReason;

  /**
   * Gets or Sets cancelReason
   */
  public enum CancelReasonEnum {
    AUTOMATICALLY_BY_NEWER_BUILD("AUTOMATICALLY_BY_NEWER_BUILD"),
    
    MANUALLY_BY_USER("MANUALLY_BY_USER");

    private String value;

    CancelReasonEnum(String value) {
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
    public static CancelReasonEnum fromValue(String value) {
      for (CancelReasonEnum b : CancelReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CANCEL_REASON = "cancelReason";
  private CancelReasonEnum cancelReason;

  public CiBuildRunAttributes() { 
  }

  public CiBuildRunAttributes number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(Integer number) {
    this.number = number;
  }


  public CiBuildRunAttributes createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public CiBuildRunAttributes startedDate(OffsetDateTime startedDate) {
    this.startedDate = startedDate;
    return this;
  }

   /**
   * Get startedDate
   * @return startedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STARTED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartedDate() {
    return startedDate;
  }


  @JsonProperty(JSON_PROPERTY_STARTED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartedDate(OffsetDateTime startedDate) {
    this.startedDate = startedDate;
  }


  public CiBuildRunAttributes finishedDate(OffsetDateTime finishedDate) {
    this.finishedDate = finishedDate;
    return this;
  }

   /**
   * Get finishedDate
   * @return finishedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINISHED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFinishedDate() {
    return finishedDate;
  }


  @JsonProperty(JSON_PROPERTY_FINISHED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinishedDate(OffsetDateTime finishedDate) {
    this.finishedDate = finishedDate;
  }


  public CiBuildRunAttributes sourceCommit(CiBuildRunAttributesSourceCommit sourceCommit) {
    this.sourceCommit = sourceCommit;
    return this;
  }

   /**
   * Get sourceCommit
   * @return sourceCommit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_COMMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CiBuildRunAttributesSourceCommit getSourceCommit() {
    return sourceCommit;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_COMMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceCommit(CiBuildRunAttributesSourceCommit sourceCommit) {
    this.sourceCommit = sourceCommit;
  }


  public CiBuildRunAttributes destinationCommit(CiBuildRunAttributesSourceCommit destinationCommit) {
    this.destinationCommit = destinationCommit;
    return this;
  }

   /**
   * Get destinationCommit
   * @return destinationCommit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESTINATION_COMMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CiBuildRunAttributesSourceCommit getDestinationCommit() {
    return destinationCommit;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION_COMMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestinationCommit(CiBuildRunAttributesSourceCommit destinationCommit) {
    this.destinationCommit = destinationCommit;
  }


  public CiBuildRunAttributes isPullRequestBuild(Boolean isPullRequestBuild) {
    this.isPullRequestBuild = isPullRequestBuild;
    return this;
  }

   /**
   * Get isPullRequestBuild
   * @return isPullRequestBuild
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PULL_REQUEST_BUILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPullRequestBuild() {
    return isPullRequestBuild;
  }


  @JsonProperty(JSON_PROPERTY_IS_PULL_REQUEST_BUILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPullRequestBuild(Boolean isPullRequestBuild) {
    this.isPullRequestBuild = isPullRequestBuild;
  }


  public CiBuildRunAttributes issueCounts(CiIssueCounts issueCounts) {
    this.issueCounts = issueCounts;
    return this;
  }

   /**
   * Get issueCounts
   * @return issueCounts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CiIssueCounts getIssueCounts() {
    return issueCounts;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssueCounts(CiIssueCounts issueCounts) {
    this.issueCounts = issueCounts;
  }


  public CiBuildRunAttributes executionProgress(CiExecutionProgress executionProgress) {
    this.executionProgress = executionProgress;
    return this;
  }

   /**
   * Get executionProgress
   * @return executionProgress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTION_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CiExecutionProgress getExecutionProgress() {
    return executionProgress;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTION_PROGRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecutionProgress(CiExecutionProgress executionProgress) {
    this.executionProgress = executionProgress;
  }


  public CiBuildRunAttributes completionStatus(CiCompletionStatus completionStatus) {
    this.completionStatus = completionStatus;
    return this;
  }

   /**
   * Get completionStatus
   * @return completionStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CiCompletionStatus getCompletionStatus() {
    return completionStatus;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletionStatus(CiCompletionStatus completionStatus) {
    this.completionStatus = completionStatus;
  }


  public CiBuildRunAttributes startReason(StartReasonEnum startReason) {
    this.startReason = startReason;
    return this;
  }

   /**
   * Get startReason
   * @return startReason
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StartReasonEnum getStartReason() {
    return startReason;
  }


  @JsonProperty(JSON_PROPERTY_START_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartReason(StartReasonEnum startReason) {
    this.startReason = startReason;
  }


  public CiBuildRunAttributes cancelReason(CancelReasonEnum cancelReason) {
    this.cancelReason = cancelReason;
    return this;
  }

   /**
   * Get cancelReason
   * @return cancelReason
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CANCEL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CancelReasonEnum getCancelReason() {
    return cancelReason;
  }


  @JsonProperty(JSON_PROPERTY_CANCEL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCancelReason(CancelReasonEnum cancelReason) {
    this.cancelReason = cancelReason;
  }


  /**
   * Return true if this CiBuildRun_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CiBuildRunAttributes ciBuildRunAttributes = (CiBuildRunAttributes) o;
    return Objects.equals(this.number, ciBuildRunAttributes.number) &&
        Objects.equals(this.createdDate, ciBuildRunAttributes.createdDate) &&
        Objects.equals(this.startedDate, ciBuildRunAttributes.startedDate) &&
        Objects.equals(this.finishedDate, ciBuildRunAttributes.finishedDate) &&
        Objects.equals(this.sourceCommit, ciBuildRunAttributes.sourceCommit) &&
        Objects.equals(this.destinationCommit, ciBuildRunAttributes.destinationCommit) &&
        Objects.equals(this.isPullRequestBuild, ciBuildRunAttributes.isPullRequestBuild) &&
        Objects.equals(this.issueCounts, ciBuildRunAttributes.issueCounts) &&
        Objects.equals(this.executionProgress, ciBuildRunAttributes.executionProgress) &&
        Objects.equals(this.completionStatus, ciBuildRunAttributes.completionStatus) &&
        Objects.equals(this.startReason, ciBuildRunAttributes.startReason) &&
        Objects.equals(this.cancelReason, ciBuildRunAttributes.cancelReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, createdDate, startedDate, finishedDate, sourceCommit, destinationCommit, isPullRequestBuild, issueCounts, executionProgress, completionStatus, startReason, cancelReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CiBuildRunAttributes {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    startedDate: ").append(toIndentedString(startedDate)).append("\n");
    sb.append("    finishedDate: ").append(toIndentedString(finishedDate)).append("\n");
    sb.append("    sourceCommit: ").append(toIndentedString(sourceCommit)).append("\n");
    sb.append("    destinationCommit: ").append(toIndentedString(destinationCommit)).append("\n");
    sb.append("    isPullRequestBuild: ").append(toIndentedString(isPullRequestBuild)).append("\n");
    sb.append("    issueCounts: ").append(toIndentedString(issueCounts)).append("\n");
    sb.append("    executionProgress: ").append(toIndentedString(executionProgress)).append("\n");
    sb.append("    completionStatus: ").append(toIndentedString(completionStatus)).append("\n");
    sb.append("    startReason: ").append(toIndentedString(startReason)).append("\n");
    sb.append("    cancelReason: ").append(toIndentedString(cancelReason)).append("\n");
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

