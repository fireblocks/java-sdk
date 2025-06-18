

# ComplianceResults

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
| AMLSTARTED | &quot;AMLStarted&quot; |
| AMLCOMPLETED | &quot;AMLCompleted&quot; |
| AMLFAILED | &quot;AMLFailed&quot; |
| AMLINBACKGROUND | &quot;AMLInBackground&quot; |
| TRSTARTED | &quot;TRStarted&quot; |
| TRCOMPLETED | &quot;TRCompleted&quot; |
| TRFAILED | &quot;TRFailed&quot; |
| COMPLETED | &quot;Completed&quot; |
| REGISTRATIONSTARTED | &quot;RegistrationStarted&quot; |
| AMLREGISTRATIONSTARTED | &quot;AMLRegistrationStarted&quot; |
| AMLREGISTRATIONCOMPLETED | &quot;AMLRegistrationCompleted&quot; |
| TRUPDATESTARTED | &quot;TRUpdateStarted&quot; |
| TRUPDATECOMPLETED | &quot;TRUpdateCompleted&quot; |
| UPDATECOMPLETED | &quot;UpdateCompleted&quot; |
| INCOMINGSTARTED | &quot;IncomingStarted&quot; |
| AMLINCOMINGSTARTED | &quot;AMLIncomingStarted&quot; |
| AMLINCOMINGCOMPLETED | &quot;AMLIncomingCompleted&quot; |
| AMLINCOMINGFAILED | &quot;AMLIncomingFailed&quot; |
| AMLINCOMINGINBACKGROUND | &quot;AMLIncomingInBackground&quot; |
| TRINCOMINGSTARTED | &quot;TRIncomingStarted&quot; |
| TRINCOMINGCOMPLETED | &quot;TRIncomingCompleted&quot; |
| TRINCOMINGFAILED | &quot;TRIncomingFailed&quot; |
| INCOMINGCOMPLETED | &quot;IncomingCompleted&quot; |



