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
import org.openapitools.client.model.CiBuildRunCreateRequestDataRelationshipsBuildRun;
import org.openapitools.client.model.CiBuildRunCreateRequestDataRelationshipsPullRequest;
import org.openapitools.client.model.CiBuildRunCreateRequestDataRelationshipsSourceBranchOrTag;
import org.openapitools.client.model.CiBuildRunCreateRequestDataRelationshipsWorkflow;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * CiBuildRunCreateRequestDataRelationships
 */
@JsonPropertyOrder({
  CiBuildRunCreateRequestDataRelationships.JSON_PROPERTY_BUILD_RUN,
  CiBuildRunCreateRequestDataRelationships.JSON_PROPERTY_WORKFLOW,
  CiBuildRunCreateRequestDataRelationships.JSON_PROPERTY_SOURCE_BRANCH_OR_TAG,
  CiBuildRunCreateRequestDataRelationships.JSON_PROPERTY_PULL_REQUEST
})
@JsonTypeName("CiBuildRunCreateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CiBuildRunCreateRequestDataRelationships {
  public static final String JSON_PROPERTY_BUILD_RUN = "buildRun";
  private CiBuildRunCreateRequestDataRelationshipsBuildRun buildRun;

  public static final String JSON_PROPERTY_WORKFLOW = "workflow";
  private CiBuildRunCreateRequestDataRelationshipsWorkflow workflow;

  public static final String JSON_PROPERTY_SOURCE_BRANCH_OR_TAG = "sourceBranchOrTag";
  private CiBuildRunCreateRequestDataRelationshipsSourceBranchOrTag sourceBranchOrTag;

  public static final String JSON_PROPERTY_PULL_REQUEST = "pullRequest";
  private CiBuildRunCreateRequestDataRelationshipsPullRequest pullRequest;

  public CiBuildRunCreateRequestDataRelationships() { 
  }

  public CiBuildRunCreateRequestDataRelationships buildRun(CiBuildRunCreateRequestDataRelationshipsBuildRun buildRun) {
    this.buildRun = buildRun;
    return this;
  }

   /**
   * Get buildRun
   * @return buildRun
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILD_RUN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CiBuildRunCreateRequestDataRelationshipsBuildRun getBuildRun() {
    return buildRun;
  }


  @JsonProperty(JSON_PROPERTY_BUILD_RUN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildRun(CiBuildRunCreateRequestDataRelationshipsBuildRun buildRun) {
    this.buildRun = buildRun;
  }


  public CiBuildRunCreateRequestDataRelationships workflow(CiBuildRunCreateRequestDataRelationshipsWorkflow workflow) {
    this.workflow = workflow;
    return this;
  }

   /**
   * Get workflow
   * @return workflow
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKFLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CiBuildRunCreateRequestDataRelationshipsWorkflow getWorkflow() {
    return workflow;
  }


  @JsonProperty(JSON_PROPERTY_WORKFLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkflow(CiBuildRunCreateRequestDataRelationshipsWorkflow workflow) {
    this.workflow = workflow;
  }


  public CiBuildRunCreateRequestDataRelationships sourceBranchOrTag(CiBuildRunCreateRequestDataRelationshipsSourceBranchOrTag sourceBranchOrTag) {
    this.sourceBranchOrTag = sourceBranchOrTag;
    return this;
  }

   /**
   * Get sourceBranchOrTag
   * @return sourceBranchOrTag
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_BRANCH_OR_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CiBuildRunCreateRequestDataRelationshipsSourceBranchOrTag getSourceBranchOrTag() {
    return sourceBranchOrTag;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_BRANCH_OR_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceBranchOrTag(CiBuildRunCreateRequestDataRelationshipsSourceBranchOrTag sourceBranchOrTag) {
    this.sourceBranchOrTag = sourceBranchOrTag;
  }


  public CiBuildRunCreateRequestDataRelationships pullRequest(CiBuildRunCreateRequestDataRelationshipsPullRequest pullRequest) {
    this.pullRequest = pullRequest;
    return this;
  }

   /**
   * Get pullRequest
   * @return pullRequest
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PULL_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CiBuildRunCreateRequestDataRelationshipsPullRequest getPullRequest() {
    return pullRequest;
  }


  @JsonProperty(JSON_PROPERTY_PULL_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPullRequest(CiBuildRunCreateRequestDataRelationshipsPullRequest pullRequest) {
    this.pullRequest = pullRequest;
  }


  /**
   * Return true if this CiBuildRunCreateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CiBuildRunCreateRequestDataRelationships ciBuildRunCreateRequestDataRelationships = (CiBuildRunCreateRequestDataRelationships) o;
    return Objects.equals(this.buildRun, ciBuildRunCreateRequestDataRelationships.buildRun) &&
        Objects.equals(this.workflow, ciBuildRunCreateRequestDataRelationships.workflow) &&
        Objects.equals(this.sourceBranchOrTag, ciBuildRunCreateRequestDataRelationships.sourceBranchOrTag) &&
        Objects.equals(this.pullRequest, ciBuildRunCreateRequestDataRelationships.pullRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildRun, workflow, sourceBranchOrTag, pullRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CiBuildRunCreateRequestDataRelationships {\n");
    sb.append("    buildRun: ").append(toIndentedString(buildRun)).append("\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
    sb.append("    sourceBranchOrTag: ").append(toIndentedString(sourceBranchOrTag)).append("\n");
    sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
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
