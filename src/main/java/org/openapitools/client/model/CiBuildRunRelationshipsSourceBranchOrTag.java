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
import org.openapitools.client.model.AlternativeDistributionPackageVersionRelationshipsVariantsLinks;
import org.openapitools.client.model.CiBuildRunRelationshipsSourceBranchOrTagData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * CiBuildRunRelationshipsSourceBranchOrTag
 */
@JsonPropertyOrder({
  CiBuildRunRelationshipsSourceBranchOrTag.JSON_PROPERTY_LINKS,
  CiBuildRunRelationshipsSourceBranchOrTag.JSON_PROPERTY_DATA
})
@JsonTypeName("CiBuildRun_relationships_sourceBranchOrTag")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CiBuildRunRelationshipsSourceBranchOrTag {
  public static final String JSON_PROPERTY_LINKS = "links";
  private AlternativeDistributionPackageVersionRelationshipsVariantsLinks links;

  public static final String JSON_PROPERTY_DATA = "data";
  private CiBuildRunRelationshipsSourceBranchOrTagData data;

  public CiBuildRunRelationshipsSourceBranchOrTag() { 
  }

  public CiBuildRunRelationshipsSourceBranchOrTag links(AlternativeDistributionPackageVersionRelationshipsVariantsLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlternativeDistributionPackageVersionRelationshipsVariantsLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(AlternativeDistributionPackageVersionRelationshipsVariantsLinks links) {
    this.links = links;
  }


  public CiBuildRunRelationshipsSourceBranchOrTag data(CiBuildRunRelationshipsSourceBranchOrTagData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CiBuildRunRelationshipsSourceBranchOrTagData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(CiBuildRunRelationshipsSourceBranchOrTagData data) {
    this.data = data;
  }


  /**
   * Return true if this CiBuildRun_relationships_sourceBranchOrTag object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CiBuildRunRelationshipsSourceBranchOrTag ciBuildRunRelationshipsSourceBranchOrTag = (CiBuildRunRelationshipsSourceBranchOrTag) o;
    return Objects.equals(this.links, ciBuildRunRelationshipsSourceBranchOrTag.links) &&
        Objects.equals(this.data, ciBuildRunRelationshipsSourceBranchOrTag.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CiBuildRunRelationshipsSourceBranchOrTag {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

