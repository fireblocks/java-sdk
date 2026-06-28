

# ManifestQuote


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**supported** | **Boolean** | Indicates whether the endpoint is supported by the provider |  |
|**participantsIdentificationPolicy** | [**ParticipantsIdentificationPolicy**](ParticipantsIdentificationPolicy.md) |  |  [optional] |
|**supportedParties** | **List&lt;ParticipantRelationshipType&gt;** | The participant party types the provider supports for this endpoint.  |  [optional] |
|**settlementTypes** | **List&lt;DVPSettlementType&gt;** | Supported settlement types when requesting a quote. If present - settlement is required. If absent - no need to provide settlement.  |  [optional] |



