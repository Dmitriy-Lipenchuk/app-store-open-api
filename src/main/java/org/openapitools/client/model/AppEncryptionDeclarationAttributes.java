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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.AppEncryptionDeclarationState;
import org.openapitools.client.model.Platform;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppEncryptionDeclarationAttributes
 */
@JsonPropertyOrder({
  AppEncryptionDeclarationAttributes.JSON_PROPERTY_APP_DESCRIPTION,
  AppEncryptionDeclarationAttributes.JSON_PROPERTY_CREATED_DATE,
  AppEncryptionDeclarationAttributes.JSON_PROPERTY_USES_ENCRYPTION,
  AppEncryptionDeclarationAttributes.JSON_PROPERTY_EXEMPT,
  AppEncryptionDeclarationAttributes.JSON_PROPERTY_CONTAINS_PROPRIETARY_CRYPTOGRAPHY,
  AppEncryptionDeclarationAttributes.JSON_PROPERTY_CONTAINS_THIRD_PARTY_CRYPTOGRAPHY,
  AppEncryptionDeclarationAttributes.JSON_PROPERTY_AVAILABLE_ON_FRENCH_STORE,
  AppEncryptionDeclarationAttributes.JSON_PROPERTY_PLATFORM,
  AppEncryptionDeclarationAttributes.JSON_PROPERTY_UPLOADED_DATE,
  AppEncryptionDeclarationAttributes.JSON_PROPERTY_DOCUMENT_URL,
  AppEncryptionDeclarationAttributes.JSON_PROPERTY_DOCUMENT_NAME,
  AppEncryptionDeclarationAttributes.JSON_PROPERTY_DOCUMENT_TYPE,
  AppEncryptionDeclarationAttributes.JSON_PROPERTY_APP_ENCRYPTION_DECLARATION_STATE,
  AppEncryptionDeclarationAttributes.JSON_PROPERTY_CODE_VALUE
})
@JsonTypeName("AppEncryptionDeclaration_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppEncryptionDeclarationAttributes {
  public static final String JSON_PROPERTY_APP_DESCRIPTION = "appDescription";
  private String appDescription;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_USES_ENCRYPTION = "usesEncryption";
  @Deprecated
  private Boolean usesEncryption;

  public static final String JSON_PROPERTY_EXEMPT = "exempt";
  private Boolean exempt;

  public static final String JSON_PROPERTY_CONTAINS_PROPRIETARY_CRYPTOGRAPHY = "containsProprietaryCryptography";
  private Boolean containsProprietaryCryptography;

  public static final String JSON_PROPERTY_CONTAINS_THIRD_PARTY_CRYPTOGRAPHY = "containsThirdPartyCryptography";
  private Boolean containsThirdPartyCryptography;

  public static final String JSON_PROPERTY_AVAILABLE_ON_FRENCH_STORE = "availableOnFrenchStore";
  private Boolean availableOnFrenchStore;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private Platform platform;

  public static final String JSON_PROPERTY_UPLOADED_DATE = "uploadedDate";
  @Deprecated
  private OffsetDateTime uploadedDate;

  public static final String JSON_PROPERTY_DOCUMENT_URL = "documentUrl";
  @Deprecated
  private String documentUrl;

  public static final String JSON_PROPERTY_DOCUMENT_NAME = "documentName";
  @Deprecated
  private String documentName;

  public static final String JSON_PROPERTY_DOCUMENT_TYPE = "documentType";
  @Deprecated
  private String documentType;

  public static final String JSON_PROPERTY_APP_ENCRYPTION_DECLARATION_STATE = "appEncryptionDeclarationState";
  private AppEncryptionDeclarationState appEncryptionDeclarationState;

  public static final String JSON_PROPERTY_CODE_VALUE = "codeValue";
  private String codeValue;

  public AppEncryptionDeclarationAttributes() { 
  }

  public AppEncryptionDeclarationAttributes appDescription(String appDescription) {
    this.appDescription = appDescription;
    return this;
  }

   /**
   * Get appDescription
   * @return appDescription
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAppDescription() {
    return appDescription;
  }


  @JsonProperty(JSON_PROPERTY_APP_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppDescription(String appDescription) {
    this.appDescription = appDescription;
  }


  public AppEncryptionDeclarationAttributes createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  @Deprecated
  public AppEncryptionDeclarationAttributes usesEncryption(Boolean usesEncryption) {
    this.usesEncryption = usesEncryption;
    return this;
  }

   /**
   * Get usesEncryption
   * @return usesEncryption
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USES_ENCRYPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUsesEncryption() {
    return usesEncryption;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_USES_ENCRYPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsesEncryption(Boolean usesEncryption) {
    this.usesEncryption = usesEncryption;
  }


  public AppEncryptionDeclarationAttributes exempt(Boolean exempt) {
    this.exempt = exempt;
    return this;
  }

   /**
   * Get exempt
   * @return exempt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExempt() {
    return exempt;
  }


  @JsonProperty(JSON_PROPERTY_EXEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExempt(Boolean exempt) {
    this.exempt = exempt;
  }


  public AppEncryptionDeclarationAttributes containsProprietaryCryptography(Boolean containsProprietaryCryptography) {
    this.containsProprietaryCryptography = containsProprietaryCryptography;
    return this;
  }

   /**
   * Get containsProprietaryCryptography
   * @return containsProprietaryCryptography
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINS_PROPRIETARY_CRYPTOGRAPHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainsProprietaryCryptography() {
    return containsProprietaryCryptography;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINS_PROPRIETARY_CRYPTOGRAPHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainsProprietaryCryptography(Boolean containsProprietaryCryptography) {
    this.containsProprietaryCryptography = containsProprietaryCryptography;
  }


  public AppEncryptionDeclarationAttributes containsThirdPartyCryptography(Boolean containsThirdPartyCryptography) {
    this.containsThirdPartyCryptography = containsThirdPartyCryptography;
    return this;
  }

   /**
   * Get containsThirdPartyCryptography
   * @return containsThirdPartyCryptography
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINS_THIRD_PARTY_CRYPTOGRAPHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainsThirdPartyCryptography() {
    return containsThirdPartyCryptography;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINS_THIRD_PARTY_CRYPTOGRAPHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainsThirdPartyCryptography(Boolean containsThirdPartyCryptography) {
    this.containsThirdPartyCryptography = containsThirdPartyCryptography;
  }


  public AppEncryptionDeclarationAttributes availableOnFrenchStore(Boolean availableOnFrenchStore) {
    this.availableOnFrenchStore = availableOnFrenchStore;
    return this;
  }

   /**
   * Get availableOnFrenchStore
   * @return availableOnFrenchStore
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABLE_ON_FRENCH_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAvailableOnFrenchStore() {
    return availableOnFrenchStore;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_ON_FRENCH_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableOnFrenchStore(Boolean availableOnFrenchStore) {
    this.availableOnFrenchStore = availableOnFrenchStore;
  }


  public AppEncryptionDeclarationAttributes platform(Platform platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Platform getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatform(Platform platform) {
    this.platform = platform;
  }


  @Deprecated
  public AppEncryptionDeclarationAttributes uploadedDate(OffsetDateTime uploadedDate) {
    this.uploadedDate = uploadedDate;
    return this;
  }

   /**
   * Get uploadedDate
   * @return uploadedDate
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPLOADED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUploadedDate() {
    return uploadedDate;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_UPLOADED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadedDate(OffsetDateTime uploadedDate) {
    this.uploadedDate = uploadedDate;
  }


  @Deprecated
  public AppEncryptionDeclarationAttributes documentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
    return this;
  }

   /**
   * Get documentUrl
   * @return documentUrl
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocumentUrl() {
    return documentUrl;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_DOCUMENT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
  }


  @Deprecated
  public AppEncryptionDeclarationAttributes documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

   /**
   * Get documentName
   * @return documentName
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocumentName() {
    return documentName;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_DOCUMENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }


  @Deprecated
  public AppEncryptionDeclarationAttributes documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocumentType() {
    return documentType;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public AppEncryptionDeclarationAttributes appEncryptionDeclarationState(AppEncryptionDeclarationState appEncryptionDeclarationState) {
    this.appEncryptionDeclarationState = appEncryptionDeclarationState;
    return this;
  }

   /**
   * Get appEncryptionDeclarationState
   * @return appEncryptionDeclarationState
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_ENCRYPTION_DECLARATION_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppEncryptionDeclarationState getAppEncryptionDeclarationState() {
    return appEncryptionDeclarationState;
  }


  @JsonProperty(JSON_PROPERTY_APP_ENCRYPTION_DECLARATION_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppEncryptionDeclarationState(AppEncryptionDeclarationState appEncryptionDeclarationState) {
    this.appEncryptionDeclarationState = appEncryptionDeclarationState;
  }


  public AppEncryptionDeclarationAttributes codeValue(String codeValue) {
    this.codeValue = codeValue;
    return this;
  }

   /**
   * Get codeValue
   * @return codeValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCodeValue() {
    return codeValue;
  }


  @JsonProperty(JSON_PROPERTY_CODE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCodeValue(String codeValue) {
    this.codeValue = codeValue;
  }


  /**
   * Return true if this AppEncryptionDeclaration_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppEncryptionDeclarationAttributes appEncryptionDeclarationAttributes = (AppEncryptionDeclarationAttributes) o;
    return Objects.equals(this.appDescription, appEncryptionDeclarationAttributes.appDescription) &&
        Objects.equals(this.createdDate, appEncryptionDeclarationAttributes.createdDate) &&
        Objects.equals(this.usesEncryption, appEncryptionDeclarationAttributes.usesEncryption) &&
        Objects.equals(this.exempt, appEncryptionDeclarationAttributes.exempt) &&
        Objects.equals(this.containsProprietaryCryptography, appEncryptionDeclarationAttributes.containsProprietaryCryptography) &&
        Objects.equals(this.containsThirdPartyCryptography, appEncryptionDeclarationAttributes.containsThirdPartyCryptography) &&
        Objects.equals(this.availableOnFrenchStore, appEncryptionDeclarationAttributes.availableOnFrenchStore) &&
        Objects.equals(this.platform, appEncryptionDeclarationAttributes.platform) &&
        Objects.equals(this.uploadedDate, appEncryptionDeclarationAttributes.uploadedDate) &&
        Objects.equals(this.documentUrl, appEncryptionDeclarationAttributes.documentUrl) &&
        Objects.equals(this.documentName, appEncryptionDeclarationAttributes.documentName) &&
        Objects.equals(this.documentType, appEncryptionDeclarationAttributes.documentType) &&
        Objects.equals(this.appEncryptionDeclarationState, appEncryptionDeclarationAttributes.appEncryptionDeclarationState) &&
        Objects.equals(this.codeValue, appEncryptionDeclarationAttributes.codeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDescription, createdDate, usesEncryption, exempt, containsProprietaryCryptography, containsThirdPartyCryptography, availableOnFrenchStore, platform, uploadedDate, documentUrl, documentName, documentType, appEncryptionDeclarationState, codeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppEncryptionDeclarationAttributes {\n");
    sb.append("    appDescription: ").append(toIndentedString(appDescription)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    usesEncryption: ").append(toIndentedString(usesEncryption)).append("\n");
    sb.append("    exempt: ").append(toIndentedString(exempt)).append("\n");
    sb.append("    containsProprietaryCryptography: ").append(toIndentedString(containsProprietaryCryptography)).append("\n");
    sb.append("    containsThirdPartyCryptography: ").append(toIndentedString(containsThirdPartyCryptography)).append("\n");
    sb.append("    availableOnFrenchStore: ").append(toIndentedString(availableOnFrenchStore)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    uploadedDate: ").append(toIndentedString(uploadedDate)).append("\n");
    sb.append("    documentUrl: ").append(toIndentedString(documentUrl)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    appEncryptionDeclarationState: ").append(toIndentedString(appEncryptionDeclarationState)).append("\n");
    sb.append("    codeValue: ").append(toIndentedString(codeValue)).append("\n");
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
