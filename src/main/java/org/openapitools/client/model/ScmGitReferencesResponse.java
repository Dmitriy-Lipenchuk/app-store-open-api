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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.PagedDocumentLinks;
import org.openapitools.client.model.PagingInformation;
import org.openapitools.client.model.ScmGitReference;
import org.openapitools.client.model.ScmRepository;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * ScmGitReferencesResponse
 */
@JsonPropertyOrder({
  ScmGitReferencesResponse.JSON_PROPERTY_DATA,
  ScmGitReferencesResponse.JSON_PROPERTY_INCLUDED,
  ScmGitReferencesResponse.JSON_PROPERTY_LINKS,
  ScmGitReferencesResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class ScmGitReferencesResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<ScmGitReference> data = new ArrayList<>();

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<ScmRepository> included = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "links";
  private PagedDocumentLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private PagingInformation meta;

  public ScmGitReferencesResponse() { 
  }

  public ScmGitReferencesResponse data(List<ScmGitReference> data) {
    this.data = data;
    return this;
  }

  public ScmGitReferencesResponse addDataItem(ScmGitReference dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ScmGitReference> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(List<ScmGitReference> data) {
    this.data = data;
  }


  public ScmGitReferencesResponse included(List<ScmRepository> included) {
    this.included = included;
    return this;
  }

  public ScmGitReferencesResponse addIncludedItem(ScmRepository includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    return this;
  }

   /**
   * Get included
   * @return included
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ScmRepository> getIncluded() {
    return included;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncluded(List<ScmRepository> included) {
    this.included = included;
  }


  public ScmGitReferencesResponse links(PagedDocumentLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PagedDocumentLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLinks(PagedDocumentLinks links) {
    this.links = links;
  }


  public ScmGitReferencesResponse meta(PagingInformation meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PagingInformation getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(PagingInformation meta) {
    this.meta = meta;
  }


  /**
   * Return true if this ScmGitReferencesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScmGitReferencesResponse scmGitReferencesResponse = (ScmGitReferencesResponse) o;
    return Objects.equals(this.data, scmGitReferencesResponse.data) &&
        Objects.equals(this.included, scmGitReferencesResponse.included) &&
        Objects.equals(this.links, scmGitReferencesResponse.links) &&
        Objects.equals(this.meta, scmGitReferencesResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScmGitReferencesResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

