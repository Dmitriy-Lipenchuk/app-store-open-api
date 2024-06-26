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
import org.openapitools.client.model.BetaGroupCreateRequestDataRelationshipsBuilds;
import org.openapitools.client.model.BetaTesterCreateRequestDataRelationshipsBetaGroups;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * BetaTesterCreateRequestDataRelationships
 */
@JsonPropertyOrder({
  BetaTesterCreateRequestDataRelationships.JSON_PROPERTY_BETA_GROUPS,
  BetaTesterCreateRequestDataRelationships.JSON_PROPERTY_BUILDS
})
@JsonTypeName("BetaTesterCreateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BetaTesterCreateRequestDataRelationships {
  public static final String JSON_PROPERTY_BETA_GROUPS = "betaGroups";
  private BetaTesterCreateRequestDataRelationshipsBetaGroups betaGroups;

  public static final String JSON_PROPERTY_BUILDS = "builds";
  private BetaGroupCreateRequestDataRelationshipsBuilds builds;

  public BetaTesterCreateRequestDataRelationships() { 
  }

  public BetaTesterCreateRequestDataRelationships betaGroups(BetaTesterCreateRequestDataRelationshipsBetaGroups betaGroups) {
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

  public BetaTesterCreateRequestDataRelationshipsBetaGroups getBetaGroups() {
    return betaGroups;
  }


  @JsonProperty(JSON_PROPERTY_BETA_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBetaGroups(BetaTesterCreateRequestDataRelationshipsBetaGroups betaGroups) {
    this.betaGroups = betaGroups;
  }


  public BetaTesterCreateRequestDataRelationships builds(BetaGroupCreateRequestDataRelationshipsBuilds builds) {
    this.builds = builds;
    return this;
  }

   /**
   * Get builds
   * @return builds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BetaGroupCreateRequestDataRelationshipsBuilds getBuilds() {
    return builds;
  }


  @JsonProperty(JSON_PROPERTY_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuilds(BetaGroupCreateRequestDataRelationshipsBuilds builds) {
    this.builds = builds;
  }


  /**
   * Return true if this BetaTesterCreateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetaTesterCreateRequestDataRelationships betaTesterCreateRequestDataRelationships = (BetaTesterCreateRequestDataRelationships) o;
    return Objects.equals(this.betaGroups, betaTesterCreateRequestDataRelationships.betaGroups) &&
        Objects.equals(this.builds, betaTesterCreateRequestDataRelationships.builds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(betaGroups, builds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaTesterCreateRequestDataRelationships {\n");
    sb.append("    betaGroups: ").append(toIndentedString(betaGroups)).append("\n");
    sb.append("    builds: ").append(toIndentedString(builds)).append("\n");
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
