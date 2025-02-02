

# ComplianceResultFullPayload

The result of the Compliance AML/Travel Rule screening.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aml** | [**List&lt;ComplianceScreeningResultFullPayload&gt;**](ComplianceScreeningResultFullPayload.md) | The end result of the AML screening. |  [optional] |
|**tr** | [**List&lt;ComplianceScreeningResultFullPayload&gt;**](ComplianceScreeningResultFullPayload.md) | The result of the Travel Rule screening. |  [optional] |
|**amlList** | [**List&lt;ComplianceScreeningResultFullPayload&gt;**](ComplianceScreeningResultFullPayload.md) | The list of all results of the AML screening. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of compliance result screening. |  [optional] |
|**amlRegistration** | [**List&lt;AmlRegistrationResultFullPayload&gt;**](AmlRegistrationResultFullPayload.md) | The results of the AML address registration. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| STARTED | &quot;Started&quot; |
| NETWORKCONNECTIONADDRESSRESOLVE | &quot;NetworkConnectionAddressResolve&quot; |
| SCREENINGPREPARE | &quot;ScreeningPrepare&quot; |
| AMLSTARTED | &quot;AMLStarted&quot; |
| AMLCOMPLETED | &quot;AMLCompleted&quot; |
| AMLFAILED | &quot;AMLFailed&quot; |
| AMLINBACKGROUND | &quot;AMLInBackground&quot; |
| TRPRECONDITIONCHECKS | &quot;TRPreconditionChecks&quot; |
| TRSTARTED | &quot;TRStarted&quot; |
| TRCOMPLETED | &quot;TRCompleted&quot; |
| TRFAILED | &quot;TRFailed&quot; |
| COMPLETED | &quot;Completed&quot; |
| INCOMINGSTARTED | &quot;IncomingStarted&quot; |
| INCOMINGSCREENINGPREPARE | &quot;IncomingScreeningPrepare&quot; |
| INCOMINGWAITFORFIRSTCONFIRMATION | &quot;IncomingWaitForFirstConfirmation&quot; |
| AMLINCOMINGSTARTED | &quot;AMLIncomingStarted&quot; |
| AMLINCOMINGCOMPLETED | &quot;AMLIncomingCompleted&quot; |
| AMLINCOMINGFAILED | &quot;AMLIncomingFailed&quot; |
| AMLINCOMINGINBACKGROUND | &quot;AMLIncomingInBackground&quot; |
| TRINCOMINGSTARTED | &quot;TRIncomingStarted&quot; |
| TRINCOMINGCOMPLETED | &quot;TRIncomingCompleted&quot; |
| TRINCOMINGFAILED | &quot;TRIncomingFailed&quot; |
| INCOMINGCOMPLETED | &quot;IncomingCompleted&quot; |



