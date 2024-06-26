

# PromotedPurchaseImageAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fileSize** | **Integer** |  |  [optional] |
|**fileName** | **String** |  |  [optional] |
|**sourceFileChecksum** | **String** |  |  [optional] |
|**assetToken** | **String** |  |  [optional] |
|**imageAsset** | [**ImageAsset**](ImageAsset.md) |  |  [optional] |
|**assetType** | **String** |  |  [optional] |
|**uploadOperations** | [**List&lt;UploadOperation&gt;**](UploadOperation.md) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| AWAITING_UPLOAD | &quot;AWAITING_UPLOAD&quot; |
| UPLOAD_COMPLETE | &quot;UPLOAD_COMPLETE&quot; |
| FAILED | &quot;FAILED&quot; |
| PREPARE_FOR_SUBMISSION | &quot;PREPARE_FOR_SUBMISSION&quot; |
| WAITING_FOR_REVIEW | &quot;WAITING_FOR_REVIEW&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |



