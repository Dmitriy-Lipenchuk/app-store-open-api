

# AppStoreVersionAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**platform** | **Platform** |  |  [optional] |
|**versionString** | **String** |  |  [optional] |
|**appStoreState** | **AppStoreVersionState** |  |  [optional] |
|**appVersionState** | **AppVersionState** |  |  [optional] |
|**copyright** | **String** |  |  [optional] |
|**reviewType** | [**ReviewTypeEnum**](#ReviewTypeEnum) |  |  [optional] |
|**releaseType** | [**ReleaseTypeEnum**](#ReleaseTypeEnum) |  |  [optional] |
|**earliestReleaseDate** | **OffsetDateTime** |  |  [optional] |
|**downloadable** | **Boolean** |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |



## Enum: ReviewTypeEnum

| Name | Value |
|---- | -----|
| APP_STORE | &quot;APP_STORE&quot; |
| NOTARIZATION | &quot;NOTARIZATION&quot; |



## Enum: ReleaseTypeEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;MANUAL&quot; |
| AFTER_APPROVAL | &quot;AFTER_APPROVAL&quot; |
| SCHEDULED | &quot;SCHEDULED&quot; |



