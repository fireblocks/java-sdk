

# TravelRuleCreateTransactionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**originatorVASPdid** | **String** | The VASP ID of the transaction originator |  [optional] |
|**beneficiaryVASPdid** | **String** | The VASP ID of the transaction beneficiary |  [optional] |
|**beneficiaryVASPname** | **String** | The name of the VASP acting as the beneficiary |  [optional] |
|**transactionBlockchainInfo** | [**TravelRuleTransactionBlockchainInfo**](TravelRuleTransactionBlockchainInfo.md) |  |  [optional] |
|**originator** | [**TravelRulePiiIVMS**](TravelRulePiiIVMS.md) |  |  |
|**beneficiary** | [**TravelRulePiiIVMS**](TravelRulePiiIVMS.md) |  |  |
|**encrypted** | **String** | Encrypted data related to the transaction |  [optional] |
|**protocol** | **String** | The protocol used to perform the travel rule |  [optional] |
|**skipBeneficiaryDataValidation** | **Boolean** | Whether to skip validation of beneficiary data |  [optional] |
|**travelRuleBehavior** | **Boolean** | Whether to check if the transaction is a TRAVEL_RULE in the beneficiary VASP&#39;s jurisdiction |  [optional] |
|**originatorProof** | [**TravelRuleOwnershipProof**](TravelRuleOwnershipProof.md) |  |  [optional] |
|**beneficiaryProof** | [**TravelRuleOwnershipProof**](TravelRuleOwnershipProof.md) |  |  [optional] |
|**pii** | [**TravelRulePiiIVMS**](TravelRulePiiIVMS.md) |  |  [optional] |



