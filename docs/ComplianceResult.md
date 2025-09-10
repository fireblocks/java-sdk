

# ComplianceResult

The result of the Compliance AML/Travel Rule screening.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aml** | [**List&lt;ComplianceScreeningResult&gt;**](ComplianceScreeningResult.md) | The end result of the AML screening. |  [optional] |
|**tr** | [**List&lt;ComplianceScreeningResult&gt;**](ComplianceScreeningResult.md) | The result of the Travel Rule screening. |  [optional] |
|**amlList** | [**List&lt;ComplianceScreeningResult&gt;**](ComplianceScreeningResult.md) | The list of all results of the AML screening. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of compliance result screening. |  [optional] |
|**amlRegistration** | [**List&lt;AmlRegistrationResult&gt;**](AmlRegistrationResult.md) | The results of the AML address registration. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| STARTED | &quot;Started&quot; |
| AML_STARTED | &quot;AMLStarted&quot; |
| AML_COMPLETED | &quot;AMLCompleted&quot; |
| AML_FAILED | &quot;AMLFailed&quot; |
| AMLIN_BACKGROUND | &quot;AMLInBackground&quot; |
| TR_STARTED | &quot;TRStarted&quot; |
| TR_COMPLETED | &quot;TRCompleted&quot; |
| TR_FAILED | &quot;TRFailed&quot; |
| COMPLETED | &quot;Completed&quot; |
| REGISTRATION_STARTED | &quot;RegistrationStarted&quot; |
| AML_REGISTRATION_STARTED | &quot;AMLRegistrationStarted&quot; |
| AML_REGISTRATION_COMPLETED | &quot;AMLRegistrationCompleted&quot; |
| TR_UPDATE_STARTED | &quot;TRUpdateStarted&quot; |
| TR_UPDATE_COMPLETED | &quot;TRUpdateCompleted&quot; |
| UPDATE_COMPLETED | &quot;UpdateCompleted&quot; |
| INCOMING_STARTED | &quot;IncomingStarted&quot; |
| AML_INCOMING_STARTED | &quot;AMLIncomingStarted&quot; |
| AML_INCOMING_COMPLETED | &quot;AMLIncomingCompleted&quot; |
| AML_INCOMING_FAILED | &quot;AMLIncomingFailed&quot; |
| AML_INCOMING_IN_BACKGROUND | &quot;AMLIncomingInBackground&quot; |
| TR_INCOMING_STARTED | &quot;TRIncomingStarted&quot; |
| TR_INCOMING_COMPLETED | &quot;TRIncomingCompleted&quot; |
| TR_INCOMING_FAILED | &quot;TRIncomingFailed&quot; |
| INCOMING_COMPLETED | &quot;IncomingCompleted&quot; |



