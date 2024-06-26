

# CiBuildRunAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**number** | **Integer** |  |  [optional] |
|**createdDate** | **OffsetDateTime** |  |  [optional] |
|**startedDate** | **OffsetDateTime** |  |  [optional] |
|**finishedDate** | **OffsetDateTime** |  |  [optional] |
|**sourceCommit** | [**CiBuildRunAttributesSourceCommit**](CiBuildRunAttributesSourceCommit.md) |  |  [optional] |
|**destinationCommit** | [**CiBuildRunAttributesSourceCommit**](CiBuildRunAttributesSourceCommit.md) |  |  [optional] |
|**isPullRequestBuild** | **Boolean** |  |  [optional] |
|**issueCounts** | [**CiIssueCounts**](CiIssueCounts.md) |  |  [optional] |
|**executionProgress** | **CiExecutionProgress** |  |  [optional] |
|**completionStatus** | **CiCompletionStatus** |  |  [optional] |
|**startReason** | [**StartReasonEnum**](#StartReasonEnum) |  |  [optional] |
|**cancelReason** | [**CancelReasonEnum**](#CancelReasonEnum) |  |  [optional] |



## Enum: StartReasonEnum

| Name | Value |
|---- | -----|
| GIT_REF_CHANGE | &quot;GIT_REF_CHANGE&quot; |
| MANUAL | &quot;MANUAL&quot; |
| MANUAL_REBUILD | &quot;MANUAL_REBUILD&quot; |
| PULL_REQUEST_OPEN | &quot;PULL_REQUEST_OPEN&quot; |
| PULL_REQUEST_UPDATE | &quot;PULL_REQUEST_UPDATE&quot; |
| SCHEDULE | &quot;SCHEDULE&quot; |



## Enum: CancelReasonEnum

| Name | Value |
|---- | -----|
| AUTOMATICALLY_BY_NEWER_BUILD | &quot;AUTOMATICALLY_BY_NEWER_BUILD&quot; |
| MANUALLY_BY_USER | &quot;MANUALLY_BY_USER&quot; |



