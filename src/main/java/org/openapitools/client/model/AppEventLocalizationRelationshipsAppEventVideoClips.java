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
import org.openapitools.client.model.AlternativeDistributionPackageVersionRelationshipsVariantsLinks;
import org.openapitools.client.model.AppEventLocalizationRelationshipsAppEventVideoClipsDataInner;
import org.openapitools.client.model.PagingInformation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppEventLocalizationRelationshipsAppEventVideoClips
 */
@JsonPropertyOrder({
  AppEventLocalizationRelationshipsAppEventVideoClips.JSON_PROPERTY_LINKS,
  AppEventLocalizationRelationshipsAppEventVideoClips.JSON_PROPERTY_META,
  AppEventLocalizationRelationshipsAppEventVideoClips.JSON_PROPERTY_DATA
})
@JsonTypeName("AppEventLocalization_relationships_appEventVideoClips")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppEventLocalizationRelationshipsAppEventVideoClips {
  public static final String JSON_PROPERTY_LINKS = "links";
  private AlternativeDistributionPackageVersionRelationshipsVariantsLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private PagingInformation meta;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<AppEventLocalizationRelationshipsAppEventVideoClipsDataInner> data = new ArrayList<>();

  public AppEventLocalizationRelationshipsAppEventVideoClips() { 
  }

  public AppEventLocalizationRelationshipsAppEventVideoClips links(AlternativeDistributionPackageVersionRelationshipsVariantsLinks links) {
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


  public AppEventLocalizationRelationshipsAppEventVideoClips meta(PagingInformation meta) {
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


  public AppEventLocalizationRelationshipsAppEventVideoClips data(List<AppEventLocalizationRelationshipsAppEventVideoClipsDataInner> data) {
    this.data = data;
    return this;
  }

  public AppEventLocalizationRelationshipsAppEventVideoClips addDataItem(AppEventLocalizationRelationshipsAppEventVideoClipsDataInner dataItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AppEventLocalizationRelationshipsAppEventVideoClipsDataInner> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<AppEventLocalizationRelationshipsAppEventVideoClipsDataInner> data) {
    this.data = data;
  }


  /**
   * Return true if this AppEventLocalization_relationships_appEventVideoClips object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppEventLocalizationRelationshipsAppEventVideoClips appEventLocalizationRelationshipsAppEventVideoClips = (AppEventLocalizationRelationshipsAppEventVideoClips) o;
    return Objects.equals(this.links, appEventLocalizationRelationshipsAppEventVideoClips.links) &&
        Objects.equals(this.meta, appEventLocalizationRelationshipsAppEventVideoClips.meta) &&
        Objects.equals(this.data, appEventLocalizationRelationshipsAppEventVideoClips.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, meta, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppEventLocalizationRelationshipsAppEventVideoClips {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
