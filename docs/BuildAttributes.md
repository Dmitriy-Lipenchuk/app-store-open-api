

# BuildAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** |  |  [optional] |
|**uploadedDate** | **OffsetDateTime** |  |  [optional] |
|**expirationDate** | **OffsetDateTime** |  |  [optional] |
|**expired** | **Boolean** |  |  [optional] |
|**minOsVersion** | **String** |  |  [optional] |
|**lsMinimumSystemVersion** | **String** |  |  [optional] |
|**computedMinMacOsVersion** | **String** |  |  [optional] |
|**iconAssetToken** | [**ImageAsset**](ImageAsset.md) |  |  [optional] |
|**processingState** | [**ProcessingStateEnum**](#ProcessingStateEnum) |  |  [optional] |
|**buildAudienceType** | **BuildAudienceType** |  |  [optional] |
|**usesNonExemptEncryption** | **Boolean** |  |  [optional] |



## Enum: ProcessingStateEnum

| Name | Value |
|---- | -----|
| PROCESSING | &quot;PROCESSING&quot; |
| FAILED | &quot;FAILED&quot; |
| INVALID | &quot;INVALID&quot; |
| VALID | &quot;VALID&quot; |



