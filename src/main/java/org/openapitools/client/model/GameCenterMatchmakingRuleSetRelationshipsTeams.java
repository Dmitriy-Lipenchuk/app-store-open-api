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
import org.openapitools.client.model.GameCenterMatchmakingRuleSetRelationshipsTeamsDataInner;
import org.openapitools.client.model.PagingInformation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * GameCenterMatchmakingRuleSetRelationshipsTeams
 */
@JsonPropertyOrder({
  GameCenterMatchmakingRuleSetRelationshipsTeams.JSON_PROPERTY_LINKS,
  GameCenterMatchmakingRuleSetRelationshipsTeams.JSON_PROPERTY_META,
  GameCenterMatchmakingRuleSetRelationshipsTeams.JSON_PROPERTY_DATA
})
@JsonTypeName("GameCenterMatchmakingRuleSet_relationships_teams")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterMatchmakingRuleSetRelationshipsTeams {
  public static final String JSON_PROPERTY_LINKS = "links";
  private AlternativeDistributionPackageVersionRelationshipsVariantsLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private PagingInformation meta;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<GameCenterMatchmakingRuleSetRelationshipsTeamsDataInner> data = new ArrayList<>();

  public GameCenterMatchmakingRuleSetRelationshipsTeams() { 
  }

  public GameCenterMatchmakingRuleSetRelationshipsTeams links(AlternativeDistributionPackageVersionRelationshipsVariantsLinks links) {
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


  public GameCenterMatchmakingRuleSetRelationshipsTeams meta(PagingInformation meta) {
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


  public GameCenterMatchmakingRuleSetRelationshipsTeams data(List<GameCenterMatchmakingRuleSetRelationshipsTeamsDataInner> data) {
    this.data = data;
    return this;
  }

  public GameCenterMatchmakingRuleSetRelationshipsTeams addDataItem(GameCenterMatchmakingRuleSetRelationshipsTeamsDataInner dataItem) {
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

  public List<GameCenterMatchmakingRuleSetRelationshipsTeamsDataInner> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<GameCenterMatchmakingRuleSetRelationshipsTeamsDataInner> data) {
    this.data = data;
  }


  /**
   * Return true if this GameCenterMatchmakingRuleSet_relationships_teams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterMatchmakingRuleSetRelationshipsTeams gameCenterMatchmakingRuleSetRelationshipsTeams = (GameCenterMatchmakingRuleSetRelationshipsTeams) o;
    return Objects.equals(this.links, gameCenterMatchmakingRuleSetRelationshipsTeams.links) &&
        Objects.equals(this.meta, gameCenterMatchmakingRuleSetRelationshipsTeams.meta) &&
        Objects.equals(this.data, gameCenterMatchmakingRuleSetRelationshipsTeams.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, meta, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterMatchmakingRuleSetRelationshipsTeams {\n");
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

