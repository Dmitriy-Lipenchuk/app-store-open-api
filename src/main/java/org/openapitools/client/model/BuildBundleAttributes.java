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
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * BuildBundleAttributes
 */
@JsonPropertyOrder({
  BuildBundleAttributes.JSON_PROPERTY_BUNDLE_ID,
  BuildBundleAttributes.JSON_PROPERTY_BUNDLE_TYPE,
  BuildBundleAttributes.JSON_PROPERTY_SDK_BUILD,
  BuildBundleAttributes.JSON_PROPERTY_PLATFORM_BUILD,
  BuildBundleAttributes.JSON_PROPERTY_FILE_NAME,
  BuildBundleAttributes.JSON_PROPERTY_HAS_SIRIKIT,
  BuildBundleAttributes.JSON_PROPERTY_HAS_ON_DEMAND_RESOURCES,
  BuildBundleAttributes.JSON_PROPERTY_HAS_PRERENDERED_ICON,
  BuildBundleAttributes.JSON_PROPERTY_USES_LOCATION_SERVICES,
  BuildBundleAttributes.JSON_PROPERTY_IS_IOS_BUILD_MAC_APP_STORE_COMPATIBLE,
  BuildBundleAttributes.JSON_PROPERTY_INCLUDES_SYMBOLS,
  BuildBundleAttributes.JSON_PROPERTY_D_S_Y_M_URL,
  BuildBundleAttributes.JSON_PROPERTY_SUPPORTED_ARCHITECTURES,
  BuildBundleAttributes.JSON_PROPERTY_REQUIRED_CAPABILITIES,
  BuildBundleAttributes.JSON_PROPERTY_DEVICE_PROTOCOLS,
  BuildBundleAttributes.JSON_PROPERTY_LOCALES,
  BuildBundleAttributes.JSON_PROPERTY_ENTITLEMENTS
})
@JsonTypeName("BuildBundle_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BuildBundleAttributes {
  public static final String JSON_PROPERTY_BUNDLE_ID = "bundleId";
  private String bundleId;

  /**
   * Gets or Sets bundleType
   */
  public enum BundleTypeEnum {
    APP("APP"),
    
    APP_CLIP("APP_CLIP");

    private String value;

    BundleTypeEnum(String value) {
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
    public static BundleTypeEnum fromValue(String value) {
      for (BundleTypeEnum b : BundleTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BUNDLE_TYPE = "bundleType";
  private BundleTypeEnum bundleType;

  public static final String JSON_PROPERTY_SDK_BUILD = "sdkBuild";
  private String sdkBuild;

  public static final String JSON_PROPERTY_PLATFORM_BUILD = "platformBuild";
  private String platformBuild;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_HAS_SIRIKIT = "hasSirikit";
  private Boolean hasSirikit;

  public static final String JSON_PROPERTY_HAS_ON_DEMAND_RESOURCES = "hasOnDemandResources";
  private Boolean hasOnDemandResources;

  public static final String JSON_PROPERTY_HAS_PRERENDERED_ICON = "hasPrerenderedIcon";
  private Boolean hasPrerenderedIcon;

  public static final String JSON_PROPERTY_USES_LOCATION_SERVICES = "usesLocationServices";
  private Boolean usesLocationServices;

  public static final String JSON_PROPERTY_IS_IOS_BUILD_MAC_APP_STORE_COMPATIBLE = "isIosBuildMacAppStoreCompatible";
  private Boolean isIosBuildMacAppStoreCompatible;

  public static final String JSON_PROPERTY_INCLUDES_SYMBOLS = "includesSymbols";
  private Boolean includesSymbols;

  public static final String JSON_PROPERTY_D_S_Y_M_URL = "dSYMUrl";
  private URI dSYMUrl;

  public static final String JSON_PROPERTY_SUPPORTED_ARCHITECTURES = "supportedArchitectures";
  private List<String> supportedArchitectures = new ArrayList<>();

  public static final String JSON_PROPERTY_REQUIRED_CAPABILITIES = "requiredCapabilities";
  private List<String> requiredCapabilities = new ArrayList<>();

  public static final String JSON_PROPERTY_DEVICE_PROTOCOLS = "deviceProtocols";
  private List<String> deviceProtocols = new ArrayList<>();

  public static final String JSON_PROPERTY_LOCALES = "locales";
  private List<String> locales = new ArrayList<>();

  public static final String JSON_PROPERTY_ENTITLEMENTS = "entitlements";
  private Map<String, Map<String, String>> entitlements = new HashMap<>();

  public BuildBundleAttributes() { 
  }

  public BuildBundleAttributes bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

   /**
   * Get bundleId
   * @return bundleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUNDLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBundleId() {
    return bundleId;
  }


  @JsonProperty(JSON_PROPERTY_BUNDLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public BuildBundleAttributes bundleType(BundleTypeEnum bundleType) {
    this.bundleType = bundleType;
    return this;
  }

   /**
   * Get bundleType
   * @return bundleType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUNDLE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BundleTypeEnum getBundleType() {
    return bundleType;
  }


  @JsonProperty(JSON_PROPERTY_BUNDLE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBundleType(BundleTypeEnum bundleType) {
    this.bundleType = bundleType;
  }


  public BuildBundleAttributes sdkBuild(String sdkBuild) {
    this.sdkBuild = sdkBuild;
    return this;
  }

   /**
   * Get sdkBuild
   * @return sdkBuild
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SDK_BUILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSdkBuild() {
    return sdkBuild;
  }


  @JsonProperty(JSON_PROPERTY_SDK_BUILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSdkBuild(String sdkBuild) {
    this.sdkBuild = sdkBuild;
  }


  public BuildBundleAttributes platformBuild(String platformBuild) {
    this.platformBuild = platformBuild;
    return this;
  }

   /**
   * Get platformBuild
   * @return platformBuild
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM_BUILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlatformBuild() {
    return platformBuild;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM_BUILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatformBuild(String platformBuild) {
    this.platformBuild = platformBuild;
  }


  public BuildBundleAttributes fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public BuildBundleAttributes hasSirikit(Boolean hasSirikit) {
    this.hasSirikit = hasSirikit;
    return this;
  }

   /**
   * Get hasSirikit
   * @return hasSirikit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_SIRIKIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasSirikit() {
    return hasSirikit;
  }


  @JsonProperty(JSON_PROPERTY_HAS_SIRIKIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasSirikit(Boolean hasSirikit) {
    this.hasSirikit = hasSirikit;
  }


  public BuildBundleAttributes hasOnDemandResources(Boolean hasOnDemandResources) {
    this.hasOnDemandResources = hasOnDemandResources;
    return this;
  }

   /**
   * Get hasOnDemandResources
   * @return hasOnDemandResources
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_ON_DEMAND_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasOnDemandResources() {
    return hasOnDemandResources;
  }


  @JsonProperty(JSON_PROPERTY_HAS_ON_DEMAND_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasOnDemandResources(Boolean hasOnDemandResources) {
    this.hasOnDemandResources = hasOnDemandResources;
  }


  public BuildBundleAttributes hasPrerenderedIcon(Boolean hasPrerenderedIcon) {
    this.hasPrerenderedIcon = hasPrerenderedIcon;
    return this;
  }

   /**
   * Get hasPrerenderedIcon
   * @return hasPrerenderedIcon
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_PRERENDERED_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasPrerenderedIcon() {
    return hasPrerenderedIcon;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PRERENDERED_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasPrerenderedIcon(Boolean hasPrerenderedIcon) {
    this.hasPrerenderedIcon = hasPrerenderedIcon;
  }


  public BuildBundleAttributes usesLocationServices(Boolean usesLocationServices) {
    this.usesLocationServices = usesLocationServices;
    return this;
  }

   /**
   * Get usesLocationServices
   * @return usesLocationServices
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USES_LOCATION_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUsesLocationServices() {
    return usesLocationServices;
  }


  @JsonProperty(JSON_PROPERTY_USES_LOCATION_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsesLocationServices(Boolean usesLocationServices) {
    this.usesLocationServices = usesLocationServices;
  }


  public BuildBundleAttributes isIosBuildMacAppStoreCompatible(Boolean isIosBuildMacAppStoreCompatible) {
    this.isIosBuildMacAppStoreCompatible = isIosBuildMacAppStoreCompatible;
    return this;
  }

   /**
   * Get isIosBuildMacAppStoreCompatible
   * @return isIosBuildMacAppStoreCompatible
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_IOS_BUILD_MAC_APP_STORE_COMPATIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsIosBuildMacAppStoreCompatible() {
    return isIosBuildMacAppStoreCompatible;
  }


  @JsonProperty(JSON_PROPERTY_IS_IOS_BUILD_MAC_APP_STORE_COMPATIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsIosBuildMacAppStoreCompatible(Boolean isIosBuildMacAppStoreCompatible) {
    this.isIosBuildMacAppStoreCompatible = isIosBuildMacAppStoreCompatible;
  }


  public BuildBundleAttributes includesSymbols(Boolean includesSymbols) {
    this.includesSymbols = includesSymbols;
    return this;
  }

   /**
   * Get includesSymbols
   * @return includesSymbols
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDES_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludesSymbols() {
    return includesSymbols;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDES_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludesSymbols(Boolean includesSymbols) {
    this.includesSymbols = includesSymbols;
  }


  public BuildBundleAttributes dSYMUrl(URI dSYMUrl) {
    this.dSYMUrl = dSYMUrl;
    return this;
  }

   /**
   * Get dSYMUrl
   * @return dSYMUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_D_S_Y_M_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getdSYMUrl() {
    return dSYMUrl;
  }


  @JsonProperty(JSON_PROPERTY_D_S_Y_M_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setdSYMUrl(URI dSYMUrl) {
    this.dSYMUrl = dSYMUrl;
  }


  public BuildBundleAttributes supportedArchitectures(List<String> supportedArchitectures) {
    this.supportedArchitectures = supportedArchitectures;
    return this;
  }

  public BuildBundleAttributes addSupportedArchitecturesItem(String supportedArchitecturesItem) {
    if (this.supportedArchitectures == null) {
      this.supportedArchitectures = new ArrayList<>();
    }
    this.supportedArchitectures.add(supportedArchitecturesItem);
    return this;
  }

   /**
   * Get supportedArchitectures
   * @return supportedArchitectures
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORTED_ARCHITECTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSupportedArchitectures() {
    return supportedArchitectures;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORTED_ARCHITECTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportedArchitectures(List<String> supportedArchitectures) {
    this.supportedArchitectures = supportedArchitectures;
  }


  public BuildBundleAttributes requiredCapabilities(List<String> requiredCapabilities) {
    this.requiredCapabilities = requiredCapabilities;
    return this;
  }

  public BuildBundleAttributes addRequiredCapabilitiesItem(String requiredCapabilitiesItem) {
    if (this.requiredCapabilities == null) {
      this.requiredCapabilities = new ArrayList<>();
    }
    this.requiredCapabilities.add(requiredCapabilitiesItem);
    return this;
  }

   /**
   * Get requiredCapabilities
   * @return requiredCapabilities
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRED_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRequiredCapabilities() {
    return requiredCapabilities;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequiredCapabilities(List<String> requiredCapabilities) {
    this.requiredCapabilities = requiredCapabilities;
  }


  public BuildBundleAttributes deviceProtocols(List<String> deviceProtocols) {
    this.deviceProtocols = deviceProtocols;
    return this;
  }

  public BuildBundleAttributes addDeviceProtocolsItem(String deviceProtocolsItem) {
    if (this.deviceProtocols == null) {
      this.deviceProtocols = new ArrayList<>();
    }
    this.deviceProtocols.add(deviceProtocolsItem);
    return this;
  }

   /**
   * Get deviceProtocols
   * @return deviceProtocols
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_PROTOCOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDeviceProtocols() {
    return deviceProtocols;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_PROTOCOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceProtocols(List<String> deviceProtocols) {
    this.deviceProtocols = deviceProtocols;
  }


  public BuildBundleAttributes locales(List<String> locales) {
    this.locales = locales;
    return this;
  }

  public BuildBundleAttributes addLocalesItem(String localesItem) {
    if (this.locales == null) {
      this.locales = new ArrayList<>();
    }
    this.locales.add(localesItem);
    return this;
  }

   /**
   * Get locales
   * @return locales
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLocales() {
    return locales;
  }


  @JsonProperty(JSON_PROPERTY_LOCALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocales(List<String> locales) {
    this.locales = locales;
  }


  public BuildBundleAttributes entitlements(Map<String, Map<String, String>> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  public BuildBundleAttributes putEntitlementsItem(String key, Map<String, String> entitlementsItem) {
    if (this.entitlements == null) {
      this.entitlements = new HashMap<>();
    }
    this.entitlements.put(key, entitlementsItem);
    return this;
  }

   /**
   * Get entitlements
   * @return entitlements
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITLEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Map<String, String>> getEntitlements() {
    return entitlements;
  }


  @JsonProperty(JSON_PROPERTY_ENTITLEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntitlements(Map<String, Map<String, String>> entitlements) {
    this.entitlements = entitlements;
  }


  /**
   * Return true if this BuildBundle_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildBundleAttributes buildBundleAttributes = (BuildBundleAttributes) o;
    return Objects.equals(this.bundleId, buildBundleAttributes.bundleId) &&
        Objects.equals(this.bundleType, buildBundleAttributes.bundleType) &&
        Objects.equals(this.sdkBuild, buildBundleAttributes.sdkBuild) &&
        Objects.equals(this.platformBuild, buildBundleAttributes.platformBuild) &&
        Objects.equals(this.fileName, buildBundleAttributes.fileName) &&
        Objects.equals(this.hasSirikit, buildBundleAttributes.hasSirikit) &&
        Objects.equals(this.hasOnDemandResources, buildBundleAttributes.hasOnDemandResources) &&
        Objects.equals(this.hasPrerenderedIcon, buildBundleAttributes.hasPrerenderedIcon) &&
        Objects.equals(this.usesLocationServices, buildBundleAttributes.usesLocationServices) &&
        Objects.equals(this.isIosBuildMacAppStoreCompatible, buildBundleAttributes.isIosBuildMacAppStoreCompatible) &&
        Objects.equals(this.includesSymbols, buildBundleAttributes.includesSymbols) &&
        Objects.equals(this.dSYMUrl, buildBundleAttributes.dSYMUrl) &&
        Objects.equals(this.supportedArchitectures, buildBundleAttributes.supportedArchitectures) &&
        Objects.equals(this.requiredCapabilities, buildBundleAttributes.requiredCapabilities) &&
        Objects.equals(this.deviceProtocols, buildBundleAttributes.deviceProtocols) &&
        Objects.equals(this.locales, buildBundleAttributes.locales) &&
        Objects.equals(this.entitlements, buildBundleAttributes.entitlements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleId, bundleType, sdkBuild, platformBuild, fileName, hasSirikit, hasOnDemandResources, hasPrerenderedIcon, usesLocationServices, isIosBuildMacAppStoreCompatible, includesSymbols, dSYMUrl, supportedArchitectures, requiredCapabilities, deviceProtocols, locales, entitlements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildBundleAttributes {\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    bundleType: ").append(toIndentedString(bundleType)).append("\n");
    sb.append("    sdkBuild: ").append(toIndentedString(sdkBuild)).append("\n");
    sb.append("    platformBuild: ").append(toIndentedString(platformBuild)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    hasSirikit: ").append(toIndentedString(hasSirikit)).append("\n");
    sb.append("    hasOnDemandResources: ").append(toIndentedString(hasOnDemandResources)).append("\n");
    sb.append("    hasPrerenderedIcon: ").append(toIndentedString(hasPrerenderedIcon)).append("\n");
    sb.append("    usesLocationServices: ").append(toIndentedString(usesLocationServices)).append("\n");
    sb.append("    isIosBuildMacAppStoreCompatible: ").append(toIndentedString(isIosBuildMacAppStoreCompatible)).append("\n");
    sb.append("    includesSymbols: ").append(toIndentedString(includesSymbols)).append("\n");
    sb.append("    dSYMUrl: ").append(toIndentedString(dSYMUrl)).append("\n");
    sb.append("    supportedArchitectures: ").append(toIndentedString(supportedArchitectures)).append("\n");
    sb.append("    requiredCapabilities: ").append(toIndentedString(requiredCapabilities)).append("\n");
    sb.append("    deviceProtocols: ").append(toIndentedString(deviceProtocols)).append("\n");
    sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
    sb.append("    entitlements: ").append(toIndentedString(entitlements)).append("\n");
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
