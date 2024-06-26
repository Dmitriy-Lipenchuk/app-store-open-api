

# GameCenterLeaderboardAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultFormatter** | **GameCenterLeaderboardFormatter** |  |  [optional] |
|**referenceName** | **String** |  |  [optional] |
|**vendorIdentifier** | **String** |  |  [optional] |
|**submissionType** | [**SubmissionTypeEnum**](#SubmissionTypeEnum) |  |  [optional] |
|**scoreSortType** | [**ScoreSortTypeEnum**](#ScoreSortTypeEnum) |  |  [optional] |
|**scoreRangeStart** | **BigDecimal** |  |  [optional] |
|**scoreRangeEnd** | **BigDecimal** |  |  [optional] |
|**recurrenceStartDate** | **OffsetDateTime** |  |  [optional] |
|**recurrenceDuration** | **String** |  |  [optional] |
|**recurrenceRule** | **String** |  |  [optional] |
|**archived** | **Boolean** |  |  [optional] |



## Enum: SubmissionTypeEnum

| Name | Value |
|---- | -----|
| BEST_SCORE | &quot;BEST_SCORE&quot; |
| MOST_RECENT_SCORE | &quot;MOST_RECENT_SCORE&quot; |



## Enum: ScoreSortTypeEnum

| Name | Value |
|---- | -----|
| ASC | &quot;ASC&quot; |
| DESC | &quot;DESC&quot; |



