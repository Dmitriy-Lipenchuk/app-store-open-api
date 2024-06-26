

# ProfileAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**platform** | **BundleIdPlatform** |  |  [optional] |
|**profileType** | [**ProfileTypeEnum**](#ProfileTypeEnum) |  |  [optional] |
|**profileState** | [**ProfileStateEnum**](#ProfileStateEnum) |  |  [optional] |
|**profileContent** | **String** |  |  [optional] |
|**uuid** | **String** |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**expirationDate** | **OffsetDateTime** |  |  [optional] |



## Enum: ProfileTypeEnum

| Name | Value |
|---- | -----|
| IOS_APP_DEVELOPMENT | &quot;IOS_APP_DEVELOPMENT&quot; |
| IOS_APP_STORE | &quot;IOS_APP_STORE&quot; |
| IOS_APP_ADHOC | &quot;IOS_APP_ADHOC&quot; |
| IOS_APP_INHOUSE | &quot;IOS_APP_INHOUSE&quot; |
| MAC_APP_DEVELOPMENT | &quot;MAC_APP_DEVELOPMENT&quot; |
| MAC_APP_STORE | &quot;MAC_APP_STORE&quot; |
| MAC_APP_DIRECT | &quot;MAC_APP_DIRECT&quot; |
| TVOS_APP_DEVELOPMENT | &quot;TVOS_APP_DEVELOPMENT&quot; |
| TVOS_APP_STORE | &quot;TVOS_APP_STORE&quot; |
| TVOS_APP_ADHOC | &quot;TVOS_APP_ADHOC&quot; |
| TVOS_APP_INHOUSE | &quot;TVOS_APP_INHOUSE&quot; |
| MAC_CATALYST_APP_DEVELOPMENT | &quot;MAC_CATALYST_APP_DEVELOPMENT&quot; |
| MAC_CATALYST_APP_STORE | &quot;MAC_CATALYST_APP_STORE&quot; |
| MAC_CATALYST_APP_DIRECT | &quot;MAC_CATALYST_APP_DIRECT&quot; |



## Enum: ProfileStateEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INVALID | &quot;INVALID&quot; |



