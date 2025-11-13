

# ComplianceResultFullPayload

The result of the Compliance AML/Travel Rule screening.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aml** | [**ComplianceScreeningResultFullPayload**](ComplianceScreeningResultFullPayload.md) |  |  [optional] |
|**tr** | [**ComplianceScreeningResultFullPayload**](ComplianceScreeningResultFullPayload.md) |  |  [optional] |
|**amlList** | [**List&lt;ComplianceScreeningResultFullPayload&gt;**](ComplianceScreeningResultFullPayload.md) | The list of all results of the AML screening. |  [optional] |
|**status** | **ComplianceResultStatusesEnum** |  |  [optional] |
|**amlRegistration** | [**AmlRegistrationResultFullPayload**](AmlRegistrationResultFullPayload.md) |  |  [optional] |
|**trlinkRegistration** | [**TRLinkRegistrationResultFullPayload**](TRLinkRegistrationResultFullPayload.md) |  |  [optional] |
|**trlinkDestinations** | [**List&lt;TRLinkResultFullPayload&gt;**](TRLinkResultFullPayload.md) | The list of TRLink destination screening results. |  [optional] |



