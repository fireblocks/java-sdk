

# TravelRuleCreateTransactionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**originatorVASPdid** | **String** | The VASP ID of the transaction originator |  [optional] |
|**beneficiaryVASPdid** | **String** | The VASP ID of the transaction beneficiary |  [optional] |
|**originatorVASPname** | **String** |  |  [optional] |
|**beneficiaryVASPname** | **String** | The name of the VASP acting as the beneficiary |  [optional] |
|**transactionBlockchainInfo** | [**TravelRuleTransactionBlockchainInfo**](TravelRuleTransactionBlockchainInfo.md) | Information about the blockchain transaction |  [optional] |
|**originator** | [**TravelRulePiiIVMS**](TravelRulePiiIVMS.md) | Information about the originator of the transaction |  |
|**beneficiary** | [**TravelRulePiiIVMS**](TravelRulePiiIVMS.md) | Information about the beneficiary of the transaction |  |
|**encrypted** | **String** | Encrypted data related to the transaction |  [optional] |
|**protocol** | **String** | The protocol used to perform the travel rule |  [optional] |
|**skipBeneficiaryDataValidation** | **Boolean** | Whether to skip validation of beneficiary data |  [optional] |
|**travelRuleBehavior** | **Boolean** | Whether to check if the transaction is a TRAVEL_RULE in the beneficiary VASP&#39;s jurisdiction |  [optional] |
|**originatorRef** | **String** |  |  [optional] |
|**beneficiaryRef** | **String** |  |  [optional] |
|**travelRuleBehaviorRef** | **String** |  |  [optional] |
|**originatorProof** | [**TravelRuleOwnershipProof**](TravelRuleOwnershipProof.md) | Ownership proof related to the originator of the transaction |  [optional] |
|**beneficiaryProof** | [**TravelRuleOwnershipProof**](TravelRuleOwnershipProof.md) | Ownership proof related to the beneficiary of the transaction |  [optional] |
|**beneficiaryDid** | **String** |  |  [optional] |
|**originatorDid** | **String** |  |  [optional] |
|**isNonCustodial** | **Boolean** |  |  [optional] |



