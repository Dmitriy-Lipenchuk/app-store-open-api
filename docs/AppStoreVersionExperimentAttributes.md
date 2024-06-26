

# AppStoreVersionExperimentAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**trafficProportion** | **Integer** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**reviewRequired** | **Boolean** |  |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PREPARE_FOR_SUBMISSION | &quot;PREPARE_FOR_SUBMISSION&quot; |
| READY_FOR_REVIEW | &quot;READY_FOR_REVIEW&quot; |
| WAITING_FOR_REVIEW | &quot;WAITING_FOR_REVIEW&quot; |
| IN_REVIEW | &quot;IN_REVIEW&quot; |
| ACCEPTED | &quot;ACCEPTED&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| STOPPED | &quot;STOPPED&quot; |



