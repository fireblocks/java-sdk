

# NotificationAttempt


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sentTime** | **Long** | The time when the attempt was sent in milliseconds. |  |
|**duration** | **Integer** | The duration of the attempt in milliseconds. |  |
|**responseCode** | **Integer** | The response code of the attempt, when missing refer to failureReason. |  [optional] |
|**failureReason** | [**FailureReasonEnum**](#FailureReasonEnum) | The request failure reason in case responseCode is missing. |  [optional] |



## Enum: FailureReasonEnum

| Name | Value |
|---- | -----|
| TIMED_OUT | &quot;TIMED_OUT&quot; |
| NO_RESPONSE | &quot;NO_RESPONSE&quot; |



