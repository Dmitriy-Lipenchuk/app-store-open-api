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
import org.openapitools.client.model.DocumentLinks;
import org.openapitools.client.model.GameCenterLeaderboardSetMemberLocalization;
import org.openapitools.client.model.GameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * GameCenterLeaderboardSetMemberLocalizationResponse
 */
@JsonPropertyOrder({
  GameCenterLeaderboardSetMemberLocalizationResponse.JSON_PROPERTY_DATA,
  GameCenterLeaderboardSetMemberLocalizationResponse.JSON_PROPERTY_INCLUDED,
  GameCenterLeaderboardSetMemberLocalizationResponse.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterLeaderboardSetMemberLocalizationResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private GameCenterLeaderboardSetMemberLocalization data;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<GameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner> included = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "links";
  private DocumentLinks links;

  public GameCenterLeaderboardSetMemberLocalizationResponse() { 
  }

  public GameCenterLeaderboardSetMemberLocalizationResponse data(GameCenterLeaderboardSetMemberLocalization data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GameCenterLeaderboardSetMemberLocalization getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(GameCenterLeaderboardSetMemberLocalization data) {
    this.data = data;
  }


  public GameCenterLeaderboardSetMemberLocalizationResponse included(List<GameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner> included) {
    this.included = included;
    return this;
  }

  public GameCenterLeaderboardSetMemberLocalizationResponse addIncludedItem(GameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner includedItem) {
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


  public GameCenterLeaderboardSetMemberLocalizationResponse links(DocumentLinks links) {
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

  public DocumentLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLinks(DocumentLinks links) {
    this.links = links;
  }


  /**
   * Return true if this GameCenterLeaderboardSetMemberLocalizationResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterLeaderboardSetMemberLocalizationResponse gameCenterLeaderboardSetMemberLocalizationResponse = (GameCenterLeaderboardSetMemberLocalizationResponse) o;
    return Objects.equals(this.data, gameCenterLeaderboardSetMemberLocalizationResponse.data) &&
        Objects.equals(this.included, gameCenterLeaderboardSetMemberLocalizationResponse.included) &&
        Objects.equals(this.links, gameCenterLeaderboardSetMemberLocalizationResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterLeaderboardSetMemberLocalizationResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

