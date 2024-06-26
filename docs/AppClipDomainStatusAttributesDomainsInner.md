

# AppClipDomainStatusAttributesDomainsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domain** | **String** |  |  [optional] |
|**isValid** | **Boolean** |  |  [optional] |
|**lastUpdatedDate** | **OffsetDateTime** |  |  [optional] |
|**errorCode** | [**ErrorCodeEnum**](#ErrorCodeEnum) |  |  [optional] |



## Enum: ErrorCodeEnum

| Name | Value |
|---- | -----|
| BAD_HTTP_RESPONSE | &quot;BAD_HTTP_RESPONSE&quot; |
| BAD_JSON_CONTENT | &quot;BAD_JSON_CONTENT&quot; |
| BAD_PKCS7_SIGNATURE | &quot;BAD_PKCS7_SIGNATURE&quot; |
| CANNOT_REACH_AASA_FILE | &quot;CANNOT_REACH_AASA_FILE&quot; |
| DNS_ERROR | &quot;DNS_ERROR&quot; |
| INSECURE_REDIRECTS_FORBIDDEN | &quot;INSECURE_REDIRECTS_FORBIDDEN&quot; |
| INVALID_ENTITLEMENT_MISSING_SECTION | &quot;INVALID_ENTITLEMENT_MISSING_SECTION&quot; |
| INVALID_ENTITLEMENT_SYNTAX_ERROR | &quot;INVALID_ENTITLEMENT_SYNTAX_ERROR&quot; |
| INVALID_ENTITLEMENT_UNHANDLED_SECTION | &quot;INVALID_ENTITLEMENT_UNHANDLED_SECTION&quot; |
| INVALID_ENTITLEMENT_UNKNOWN_ID | &quot;INVALID_ENTITLEMENT_UNKNOWN_ID&quot; |
| NETWORK_ERROR | &quot;NETWORK_ERROR&quot; |
| NETWORK_ERROR_TEMPORARY | &quot;NETWORK_ERROR_TEMPORARY&quot; |
| OTHER_ERROR | &quot;OTHER_ERROR&quot; |
| TIMEOUT | &quot;TIMEOUT&quot; |
| TLS_ERROR | &quot;TLS_ERROR&quot; |
| UNEXPECTED_ERROR | &quot;UNEXPECTED_ERROR&quot; |



