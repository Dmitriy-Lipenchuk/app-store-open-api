

# GameCenterLeaderboardCreateRequestDataAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultFormatter** | **GameCenterLeaderboardFormatter** |  |  |
|**referenceName** | **String** |  |  |
|**vendorIdentifier** | **String** |  |  |
|**submissionType** | [**SubmissionTypeEnum**](#SubmissionTypeEnum) |  |  |
|**scoreSortType** | [**ScoreSortTypeEnum**](#ScoreSortTypeEnum) |  |  |
|**scoreRangeStart** | **BigDecimal** |  |  [optional] |
|**scoreRangeEnd** | **BigDecimal** |  |  [optional] |
|**recurrenceStartDate** | **OffsetDateTime** |  |  [optional] |
|**recurrenceDuration** | **String** |  |  [optional] |
|**recurrenceRule** | **String** |  |  [optional] |



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



