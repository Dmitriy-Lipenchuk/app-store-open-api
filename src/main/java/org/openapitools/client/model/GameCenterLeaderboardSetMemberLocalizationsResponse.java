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
import org.openapitools.client.model.GameCenterLeaderboardSetMemberLocalization;
import org.openapitools.client.model.GameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner;
import org.openapitools.client.model.PagedDocumentLinks;
import org.openapitools.client.model.PagingInformation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * GameCenterLeaderboardSetMemberLocalizationsResponse
 */
@JsonPropertyOrder({
  GameCenterLeaderboardSetMemberLocalizationsResponse.JSON_PROPERTY_DATA,
  GameCenterLeaderboardSetMemberLocalizationsResponse.JSON_PROPERTY_INCLUDED,
  GameCenterLeaderboardSetMemberLocalizationsResponse.JSON_PROPERTY_LINKS,
  GameCenterLeaderboardSetMemberLocalizationsResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterLeaderboardSetMemberLocalizationsResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<GameCenterLeaderboardSetMemberLocalization> data = new ArrayList<>();

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<GameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner> included = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "links";
  private PagedDocumentLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private PagingInformation meta;

  public GameCenterLeaderboardSetMemberLocalizationsResponse() { 
  }

  public GameCenterLeaderboardSetMemberLocalizationsResponse data(List<GameCenterLeaderboardSetMemberLocalization> data) {
    this.data = data;
    return this;
  }

  public GameCenterLeaderboardSetMemberLocalizationsResponse addDataItem(GameCenterLeaderboardSetMemberLocalization dataItem) {
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

  public List<GameCenterLeaderboardSetMemberLocalization> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(List<GameCenterLeaderboardSetMemberLocalization> data) {
    this.data = data;
  }


  public GameCenterLeaderboardSetMemberLocalizationsResponse included(List<GameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner> included) {
    this.included = included;
    return this;
  }

  public GameCenterLeaderboardSetMemberLocalizationsResponse addIncludedItem(GameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner includedItem) {
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

  public List<GameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner> getIncluded() {
    return included;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncluded(List<GameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner> included) {
    this.included = included;
  }


  public GameCenterLeaderboardSetMemberLocalizationsResponse links(PagedDocumentLinks links) {
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


  public GameCenterLeaderboardSetMemberLocalizationsResponse meta(PagingInformation meta) {
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
   * Return true if this GameCenterLeaderboardSetMemberLocalizationsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterLeaderboardSetMemberLocalizationsResponse gameCenterLeaderboardSetMemberLocalizationsResponse = (GameCenterLeaderboardSetMemberLocalizationsResponse) o;
    return Objects.equals(this.data, gameCenterLeaderboardSetMemberLocalizationsResponse.data) &&
        Objects.equals(this.included, gameCenterLeaderboardSetMemberLocalizationsResponse.included) &&
        Objects.equals(this.links, gameCenterLeaderboardSetMemberLocalizationsResponse.links) &&
        Objects.equals(this.meta, gameCenterLeaderboardSetMemberLocalizationsResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterLeaderboardSetMemberLocalizationsResponse {\n");
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

