

# CiAction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**actionType** | **CiActionType** |  |  [optional] |
|**destination** | [**DestinationEnum**](#DestinationEnum) |  |  [optional] |
|**buildDistributionAudience** | **BuildAudienceType** |  |  [optional] |
|**testConfiguration** | [**CiActionTestConfiguration**](CiActionTestConfiguration.md) |  |  [optional] |
|**scheme** | **String** |  |  [optional] |
|**platform** | [**PlatformEnum**](#PlatformEnum) |  |  [optional] |
|**isRequiredToPass** | **Boolean** |  |  [optional] |



## Enum: DestinationEnum

| Name | Value |
|---- | -----|
| IOS_DEVICE | &quot;ANY_IOS_DEVICE&quot; |
| IOS_SIMULATOR | &quot;ANY_IOS_SIMULATOR&quot; |
| TVOS_DEVICE | &quot;ANY_TVOS_DEVICE&quot; |
| TVOS_SIMULATOR | &quot;ANY_TVOS_SIMULATOR&quot; |
| WATCHOS_DEVICE | &quot;ANY_WATCHOS_DEVICE&quot; |
| WATCHOS_SIMULATOR | &quot;ANY_WATCHOS_SIMULATOR&quot; |
| MAC | &quot;ANY_MAC&quot; |
| MAC_CATALYST | &quot;ANY_MAC_CATALYST&quot; |
| VISIONOS_DEVICE | &quot;ANY_VISIONOS_DEVICE&quot; |
| VISIONOS_SIMULATOR | &quot;ANY_VISIONOS_SIMULATOR&quot; |



## Enum: PlatformEnum

| Name | Value |
|---- | -----|
| MACOS | &quot;MACOS&quot; |
| IOS | &quot;IOS&quot; |
| TVOS | &quot;TVOS&quot; |
| WATCHOS | &quot;WATCHOS&quot; |
| VISIONOS | &quot;VISIONOS&quot; |



