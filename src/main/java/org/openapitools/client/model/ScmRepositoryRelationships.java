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
import org.openapitools.client.model.CiBuildRunRelationshipsSourceBranchOrTag;
import org.openapitools.client.model.ScmRepositoryRelationshipsScmProvider;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * ScmRepositoryRelationships
 */
@JsonPropertyOrder({
  ScmRepositoryRelationships.JSON_PROPERTY_SCM_PROVIDER,
  ScmRepositoryRelationships.JSON_PROPERTY_DEFAULT_BRANCH
})
@JsonTypeName("ScmRepository_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class ScmRepositoryRelationships {
  public static final String JSON_PROPERTY_SCM_PROVIDER = "scmProvider";
  private ScmRepositoryRelationshipsScmProvider scmProvider;

  public static final String JSON_PROPERTY_DEFAULT_BRANCH = "defaultBranch";
  private CiBuildRunRelationshipsSourceBranchOrTag defaultBranch;

  public ScmRepositoryRelationships() { 
  }

  public ScmRepositoryRelationships scmProvider(ScmRepositoryRelationshipsScmProvider scmProvider) {
    this.scmProvider = scmProvider;
    return this;
  }

   /**
   * Get scmProvider
   * @return scmProvider
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCM_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScmRepositoryRelationshipsScmProvider getScmProvider() {
    return scmProvider;
  }


  @JsonProperty(JSON_PROPERTY_SCM_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScmProvider(ScmRepositoryRelationshipsScmProvider scmProvider) {
    this.scmProvider = scmProvider;
  }


  public ScmRepositoryRelationships defaultBranch(CiBuildRunRelationshipsSourceBranchOrTag defaultBranch) {
    this.defaultBranch = defaultBranch;
    return this;
  }

   /**
   * Get defaultBranch
   * @return defaultBranch
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_BRANCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CiBuildRunRelationshipsSourceBranchOrTag getDefaultBranch() {
    return defaultBranch;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_BRANCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultBranch(CiBuildRunRelationshipsSourceBranchOrTag defaultBranch) {
    this.defaultBranch = defaultBranch;
  }


  /**
   * Return true if this ScmRepository_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScmRepositoryRelationships scmRepositoryRelationships = (ScmRepositoryRelationships) o;
    return Objects.equals(this.scmProvider, scmRepositoryRelationships.scmProvider) &&
        Objects.equals(this.defaultBranch, scmRepositoryRelationships.defaultBranch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scmProvider, defaultBranch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScmRepositoryRelationships {\n");
    sb.append("    scmProvider: ").append(toIndentedString(scmProvider)).append("\n");
    sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
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

