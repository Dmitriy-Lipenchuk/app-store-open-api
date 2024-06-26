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
import org.openapitools.client.model.Location;
import org.openapitools.client.model.Platform;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * GameCenterMatchmakingTestRequestInlineCreateAttributes
 */
@JsonPropertyOrder({
  GameCenterMatchmakingTestRequestInlineCreateAttributes.JSON_PROPERTY_REQUEST_NAME,
  GameCenterMatchmakingTestRequestInlineCreateAttributes.JSON_PROPERTY_SECONDS_IN_QUEUE,
  GameCenterMatchmakingTestRequestInlineCreateAttributes.JSON_PROPERTY_LOCALE,
  GameCenterMatchmakingTestRequestInlineCreateAttributes.JSON_PROPERTY_LOCATION,
  GameCenterMatchmakingTestRequestInlineCreateAttributes.JSON_PROPERTY_MIN_PLAYERS,
  GameCenterMatchmakingTestRequestInlineCreateAttributes.JSON_PROPERTY_MAX_PLAYERS,
  GameCenterMatchmakingTestRequestInlineCreateAttributes.JSON_PROPERTY_PLAYER_COUNT,
  GameCenterMatchmakingTestRequestInlineCreateAttributes.JSON_PROPERTY_BUNDLE_ID,
  GameCenterMatchmakingTestRequestInlineCreateAttributes.JSON_PROPERTY_PLATFORM,
  GameCenterMatchmakingTestRequestInlineCreateAttributes.JSON_PROPERTY_APP_VERSION
})
@JsonTypeName("GameCenterMatchmakingTestRequestInlineCreate_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterMatchmakingTestRequestInlineCreateAttributes {
  public static final String JSON_PROPERTY_REQUEST_NAME = "requestName";
  private String requestName;

  public static final String JSON_PROPERTY_SECONDS_IN_QUEUE = "secondsInQueue";
  private Integer secondsInQueue;

  /**
   * Gets or Sets locale
   */
  public enum LocaleEnum {
    AR_SA("AR-SA"),
    
    CA_ES("CA-ES"),
    
    CS_CZ("CS-CZ"),
    
    DA_DK("DA-DK"),
    
    DE_DE("DE-DE"),
    
    EL_GR("EL-GR"),
    
    EN_AU("EN-AU"),
    
    EN_GB("EN-GB"),
    
    EN_US("EN-US"),
    
    EN_KY("EN-KY"),
    
    ES_ES("ES-ES"),
    
    ES_MX("ES-MX"),
    
    FI_FI("FI-FI"),
    
    FR_CA("FR-CA"),
    
    FR_FR("FR-FR"),
    
    HI_IN("HI-IN"),
    
    HR_HR("HR-HR"),
    
    HU_HU("HU-HU"),
    
    ID_ID("ID-ID"),
    
    IT_IT("IT-IT"),
    
    IW_IL("IW-IL"),
    
    JA_JP("JA-JP"),
    
    KO_KR("KO-KR"),
    
    MS_MY("MS-MY"),
    
    NL_NL("NL-NL"),
    
    NO_NO("NO-NO"),
    
    PL_PL("PL-PL"),
    
    PT_BR("PT-BR"),
    
    PT_PT("PT-PT"),
    
    RO_RO("RO-RO"),
    
    RU_RU("RU-RU"),
    
    SK_SK("SK-SK"),
    
    SV_SE("SV-SE"),
    
    TH_TH("TH-TH"),
    
    TR_TR("TR-TR"),
    
    UK_UA("UK-UA"),
    
    ZH_CN("ZH-CN"),
    
    ZH_TW("ZH-TW"),
    
    ZH_HK("ZH-HK");

    private String value;

    LocaleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LocaleEnum fromValue(String value) {
      for (LocaleEnum b : LocaleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private LocaleEnum locale;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private Location location;

  public static final String JSON_PROPERTY_MIN_PLAYERS = "minPlayers";
  private Integer minPlayers;

  public static final String JSON_PROPERTY_MAX_PLAYERS = "maxPlayers";
  private Integer maxPlayers;

  public static final String JSON_PROPERTY_PLAYER_COUNT = "playerCount";
  private Integer playerCount;

  public static final String JSON_PROPERTY_BUNDLE_ID = "bundleId";
  private String bundleId;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private Platform platform;

  public static final String JSON_PROPERTY_APP_VERSION = "appVersion";
  private String appVersion;

  public GameCenterMatchmakingTestRequestInlineCreateAttributes() { 
  }

  public GameCenterMatchmakingTestRequestInlineCreateAttributes requestName(String requestName) {
    this.requestName = requestName;
    return this;
  }

   /**
   * Get requestName
   * @return requestName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REQUEST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRequestName() {
    return requestName;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequestName(String requestName) {
    this.requestName = requestName;
  }


  public GameCenterMatchmakingTestRequestInlineCreateAttributes secondsInQueue(Integer secondsInQueue) {
    this.secondsInQueue = secondsInQueue;
    return this;
  }

   /**
   * Get secondsInQueue
   * @return secondsInQueue
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SECONDS_IN_QUEUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSecondsInQueue() {
    return secondsInQueue;
  }


  @JsonProperty(JSON_PROPERTY_SECONDS_IN_QUEUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecondsInQueue(Integer secondsInQueue) {
    this.secondsInQueue = secondsInQueue;
  }


  public GameCenterMatchmakingTestRequestInlineCreateAttributes locale(LocaleEnum locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocaleEnum getLocale() {
    return locale;
  }


  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocale(LocaleEnum locale) {
    this.locale = locale;
  }


  public GameCenterMatchmakingTestRequestInlineCreateAttributes location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Location getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(Location location) {
    this.location = location;
  }


  public GameCenterMatchmakingTestRequestInlineCreateAttributes minPlayers(Integer minPlayers) {
    this.minPlayers = minPlayers;
    return this;
  }

   /**
   * Get minPlayers
   * @return minPlayers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_PLAYERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinPlayers() {
    return minPlayers;
  }


  @JsonProperty(JSON_PROPERTY_MIN_PLAYERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinPlayers(Integer minPlayers) {
    this.minPlayers = minPlayers;
  }


  public GameCenterMatchmakingTestRequestInlineCreateAttributes maxPlayers(Integer maxPlayers) {
    this.maxPlayers = maxPlayers;
    return this;
  }

   /**
   * Get maxPlayers
   * @return maxPlayers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_PLAYERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxPlayers() {
    return maxPlayers;
  }


  @JsonProperty(JSON_PROPERTY_MAX_PLAYERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxPlayers(Integer maxPlayers) {
    this.maxPlayers = maxPlayers;
  }


  public GameCenterMatchmakingTestRequestInlineCreateAttributes playerCount(Integer playerCount) {
    this.playerCount = playerCount;
    return this;
  }

   /**
   * Get playerCount
   * @return playerCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAYER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPlayerCount() {
    return playerCount;
  }


  @JsonProperty(JSON_PROPERTY_PLAYER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlayerCount(Integer playerCount) {
    this.playerCount = playerCount;
  }


  public GameCenterMatchmakingTestRequestInlineCreateAttributes bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

   /**
   * Get bundleId
   * @return bundleId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BUNDLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBundleId() {
    return bundleId;
  }


  @JsonProperty(JSON_PROPERTY_BUNDLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public GameCenterMatchmakingTestRequestInlineCreateAttributes platform(Platform platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Platform getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlatform(Platform platform) {
    this.platform = platform;
  }


  public GameCenterMatchmakingTestRequestInlineCreateAttributes appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

   /**
   * Get appVersion
   * @return appVersion
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_APP_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAppVersion() {
    return appVersion;
  }


  @JsonProperty(JSON_PROPERTY_APP_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  /**
   * Return true if this GameCenterMatchmakingTestRequestInlineCreate_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterMatchmakingTestRequestInlineCreateAttributes gameCenterMatchmakingTestRequestInlineCreateAttributes = (GameCenterMatchmakingTestRequestInlineCreateAttributes) o;
    return Objects.equals(this.requestName, gameCenterMatchmakingTestRequestInlineCreateAttributes.requestName) &&
        Objects.equals(this.secondsInQueue, gameCenterMatchmakingTestRequestInlineCreateAttributes.secondsInQueue) &&
        Objects.equals(this.locale, gameCenterMatchmakingTestRequestInlineCreateAttributes.locale) &&
        Objects.equals(this.location, gameCenterMatchmakingTestRequestInlineCreateAttributes.location) &&
        Objects.equals(this.minPlayers, gameCenterMatchmakingTestRequestInlineCreateAttributes.minPlayers) &&
        Objects.equals(this.maxPlayers, gameCenterMatchmakingTestRequestInlineCreateAttributes.maxPlayers) &&
        Objects.equals(this.playerCount, gameCenterMatchmakingTestRequestInlineCreateAttributes.playerCount) &&
        Objects.equals(this.bundleId, gameCenterMatchmakingTestRequestInlineCreateAttributes.bundleId) &&
        Objects.equals(this.platform, gameCenterMatchmakingTestRequestInlineCreateAttributes.platform) &&
        Objects.equals(this.appVersion, gameCenterMatchmakingTestRequestInlineCreateAttributes.appVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestName, secondsInQueue, locale, location, minPlayers, maxPlayers, playerCount, bundleId, platform, appVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterMatchmakingTestRequestInlineCreateAttributes {\n");
    sb.append("    requestName: ").append(toIndentedString(requestName)).append("\n");
    sb.append("    secondsInQueue: ").append(toIndentedString(secondsInQueue)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    minPlayers: ").append(toIndentedString(minPlayers)).append("\n");
    sb.append("    maxPlayers: ").append(toIndentedString(maxPlayers)).append("\n");
    sb.append("    playerCount: ").append(toIndentedString(playerCount)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
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

