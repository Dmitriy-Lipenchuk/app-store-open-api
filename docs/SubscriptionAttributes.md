

# SubscriptionAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**productId** | **String** |  |  [optional] |
|**familySharable** | **Boolean** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**subscriptionPeriod** | [**SubscriptionPeriodEnum**](#SubscriptionPeriodEnum) |  |  [optional] |
|**reviewNote** | **String** |  |  [optional] |
|**groupLevel** | **Integer** |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| MISSING_METADATA | &quot;MISSING_METADATA&quot; |
| READY_TO_SUBMIT | &quot;READY_TO_SUBMIT&quot; |
| WAITING_FOR_REVIEW | &quot;WAITING_FOR_REVIEW&quot; |
| IN_REVIEW | &quot;IN_REVIEW&quot; |
| DEVELOPER_ACTION_NEEDED | &quot;DEVELOPER_ACTION_NEEDED&quot; |
| PENDING_BINARY_APPROVAL | &quot;PENDING_BINARY_APPROVAL&quot; |
| APPROVED | &quot;APPROVED&quot; |
| DEVELOPER_REMOVED_FROM_SALE | &quot;DEVELOPER_REMOVED_FROM_SALE&quot; |
| REMOVED_FROM_SALE | &quot;REMOVED_FROM_SALE&quot; |
| REJECTED | &quot;REJECTED&quot; |



## Enum: SubscriptionPeriodEnum

| Name | Value |
|---- | -----|
| ONE_WEEK | &quot;ONE_WEEK&quot; |
| ONE_MONTH | &quot;ONE_MONTH&quot; |
| TWO_MONTHS | &quot;TWO_MONTHS&quot; |
| THREE_MONTHS | &quot;THREE_MONTHS&quot; |
| SIX_MONTHS | &quot;SIX_MONTHS&quot; |
| ONE_YEAR | &quot;ONE_YEAR&quot; |



