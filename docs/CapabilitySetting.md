

# CapabilitySetting


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | [**KeyEnum**](#KeyEnum) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**enabledByDefault** | **Boolean** |  |  [optional] |
|**visible** | **Boolean** |  |  [optional] |
|**allowedInstances** | [**AllowedInstancesEnum**](#AllowedInstancesEnum) |  |  [optional] |
|**minInstances** | **Integer** |  |  [optional] |
|**options** | [**List&lt;CapabilityOption&gt;**](CapabilityOption.md) |  |  [optional] |



## Enum: KeyEnum

| Name | Value |
|---- | -----|
| ICLOUD_VERSION | &quot;ICLOUD_VERSION&quot; |
| DATA_PROTECTION_PERMISSION_LEVEL | &quot;DATA_PROTECTION_PERMISSION_LEVEL&quot; |
| APPLE_ID_AUTH_APP_CONSENT | &quot;APPLE_ID_AUTH_APP_CONSENT&quot; |



## Enum: AllowedInstancesEnum

| Name | Value |
|---- | -----|
| ENTRY | &quot;ENTRY&quot; |
| SINGLE | &quot;SINGLE&quot; |
| MULTIPLE | &quot;MULTIPLE&quot; |



