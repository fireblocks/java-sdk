

# ManifestOrder


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**supported** | **Boolean** | Indicates whether the endpoint is supported by the provider |  |
|**participantsIdentificationPolicy** | [**ParticipantsIdentificationPolicy**](ParticipantsIdentificationPolicy.md) |  |  [optional] |
|**supportedParties** | **List&lt;ParticipantRelationshipType&gt;** | The participant party types the provider supports for this endpoint.  |  [optional] |
|**settlementTypes** | **List&lt;SettlementTypeEnum&gt;** | Supported settlement types when creating an order. If present - settlement is required. If absent - no need to provide settlement.  |  [optional] |
|**executionTypes** | **List&lt;ExecutionRequestDetailsType&gt;** | Supported execution types when creating an order. |  |
|**requiresReasonForPayment** | **Boolean** | Information about the source and purpose of the funds being transacted. Used by providers that require additional context for compliance and reporting. Provide this field when the provider manifest indicates it is required.  |  [optional] |



