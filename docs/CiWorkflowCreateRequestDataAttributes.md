

# CiWorkflowCreateRequestDataAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**description** | **String** |  |  |
|**branchStartCondition** | [**CiBranchStartCondition**](CiBranchStartCondition.md) |  |  [optional] |
|**tagStartCondition** | [**CiTagStartCondition**](CiTagStartCondition.md) |  |  [optional] |
|**pullRequestStartCondition** | [**CiPullRequestStartCondition**](CiPullRequestStartCondition.md) |  |  [optional] |
|**scheduledStartCondition** | [**CiScheduledStartCondition**](CiScheduledStartCondition.md) |  |  [optional] |
|**manualBranchStartCondition** | [**CiManualBranchStartCondition**](CiManualBranchStartCondition.md) |  |  [optional] |
|**manualTagStartCondition** | [**CiManualTagStartCondition**](CiManualTagStartCondition.md) |  |  [optional] |
|**manualPullRequestStartCondition** | [**CiManualPullRequestStartCondition**](CiManualPullRequestStartCondition.md) |  |  [optional] |
|**actions** | [**List&lt;CiAction&gt;**](CiAction.md) |  |  |
|**isEnabled** | **Boolean** |  |  |
|**isLockedForEditing** | **Boolean** |  |  [optional] |
|**clean** | **Boolean** |  |  |
|**containerFilePath** | **String** |  |  |



