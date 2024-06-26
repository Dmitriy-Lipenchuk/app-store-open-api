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
import org.openapitools.client.model.AppPreviewSetRelationshipsAppStoreVersionExperimentTreatmentLocalizationData;
import org.openapitools.client.model.PagingInformation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations
 */
@JsonPropertyOrder({
  AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations.JSON_PROPERTY_LINKS,
  AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations.JSON_PROPERTY_META,
  AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations.JSON_PROPERTY_DATA
})
@JsonTypeName("AppStoreVersionExperimentTreatment_relationships_appStoreVersionExperimentTreatmentLocalizations")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations {
  public static final String JSON_PROPERTY_LINKS = "links";
  private AlternativeDistributionPackageVersionRelationshipsVariantsLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private PagingInformation meta;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<AppPreviewSetRelationshipsAppStoreVersionExperimentTreatmentLocalizationData> data = new ArrayList<>();

  public AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations() { 
  }

  public AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations links(AlternativeDistributionPackageVersionRelationshipsVariantsLinks links) {
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


  public AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations meta(PagingInformation meta) {
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


  public AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations data(List<AppPreviewSetRelationshipsAppStoreVersionExperimentTreatmentLocalizationData> data) {
    this.data = data;
    return this;
  }

  public AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations addDataItem(AppPreviewSetRelationshipsAppStoreVersionExperimentTreatmentLocalizationData dataItem) {
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

  public List<AppPreviewSetRelationshipsAppStoreVersionExperimentTreatmentLocalizationData> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<AppPreviewSetRelationshipsAppStoreVersionExperimentTreatmentLocalizationData> data) {
    this.data = data;
  }


  /**
   * Return true if this AppStoreVersionExperimentTreatment_relationships_appStoreVersionExperimentTreatmentLocalizations object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations appStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations = (AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations) o;
    return Objects.equals(this.links, appStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations.links) &&
        Objects.equals(this.meta, appStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations.meta) &&
        Objects.equals(this.data, appStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, meta, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations {\n");
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

