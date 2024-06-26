

# AppEventAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**referenceName** | **String** |  |  [optional] |
|**badge** | [**BadgeEnum**](#BadgeEnum) |  |  [optional] |
|**eventState** | [**EventStateEnum**](#EventStateEnum) |  |  [optional] |
|**deepLink** | **URI** |  |  [optional] |
|**purchaseRequirement** | [**PurchaseRequirementEnum**](#PurchaseRequirementEnum) |  |  [optional] |
|**primaryLocale** | **String** |  |  [optional] |
|**priority** | [**PriorityEnum**](#PriorityEnum) |  |  [optional] |
|**purpose** | [**PurposeEnum**](#PurposeEnum) |  |  [optional] |
|**territorySchedules** | [**List&lt;AppEventAttributesTerritorySchedulesInner&gt;**](AppEventAttributesTerritorySchedulesInner.md) |  |  [optional] |
|**archivedTerritorySchedules** | [**List&lt;AppEventAttributesTerritorySchedulesInner&gt;**](AppEventAttributesTerritorySchedulesInner.md) |  |  [optional] |



## Enum: BadgeEnum

| Name | Value |
|---- | -----|
| LIVE_EVENT | &quot;LIVE_EVENT&quot; |
| PREMIERE | &quot;PREMIERE&quot; |
| CHALLENGE | &quot;CHALLENGE&quot; |
| COMPETITION | &quot;COMPETITION&quot; |
| NEW_SEASON | &quot;NEW_SEASON&quot; |
| MAJOR_UPDATE | &quot;MAJOR_UPDATE&quot; |
| SPECIAL_EVENT | &quot;SPECIAL_EVENT&quot; |



## Enum: EventStateEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| READY_FOR_REVIEW | &quot;READY_FOR_REVIEW&quot; |
| WAITING_FOR_REVIEW | &quot;WAITING_FOR_REVIEW&quot; |
| IN_REVIEW | &quot;IN_REVIEW&quot; |
| REJECTED | &quot;REJECTED&quot; |
| ACCEPTED | &quot;ACCEPTED&quot; |
| APPROVED | &quot;APPROVED&quot; |
| PUBLISHED | &quot;PUBLISHED&quot; |
| PAST | &quot;PAST&quot; |
| ARCHIVED | &quot;ARCHIVED&quot; |



## Enum: PurchaseRequirementEnum

| Name | Value |
|---- | -----|
| NO_COST_ASSOCIATED | &quot;NO_COST_ASSOCIATED&quot; |
| IN_APP_PURCHASE | &quot;IN_APP_PURCHASE&quot; |
| SUBSCRIPTION | &quot;SUBSCRIPTION&quot; |
| IN_APP_PURCHASE_AND_SUBSCRIPTION | &quot;IN_APP_PURCHASE_AND_SUBSCRIPTION&quot; |
| IN_APP_PURCHASE_OR_SUBSCRIPTION | &quot;IN_APP_PURCHASE_OR_SUBSCRIPTION&quot; |



## Enum: PriorityEnum

| Name | Value |
|---- | -----|
| HIGH | &quot;HIGH&quot; |
| NORMAL | &quot;NORMAL&quot; |



## Enum: PurposeEnum

| Name | Value |
|---- | -----|
| APPROPRIATE_FOR_ALL_USERS | &quot;APPROPRIATE_FOR_ALL_USERS&quot; |
| ATTRACT_NEW_USERS | &quot;ATTRACT_NEW_USERS&quot; |
| KEEP_ACTIVE_USERS_INFORMED | &quot;KEEP_ACTIVE_USERS_INFORMED&quot; |
| BRING_BACK_LAPSED_USERS | &quot;BRING_BACK_LAPSED_USERS&quot; |



