

# TravelRuleValidateFullTransactionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionAsset** | **String** | The asset involved in the transaction |  [optional] |
|**transactionAmount** | **String** | The amount of the transaction |  [optional] |
|**originatorDid** | **String** | The DID of the transaction originator |  [optional] |
|**beneficiaryDid** | **String** | The DID of the transaction beneficiary |  [optional] |
|**originatorVASPdid** | **String** | The VASP ID of the transaction originator |  [optional] |
|**beneficiaryVASPdid** | **String** | The VASP ID of the transaction beneficiary |  [optional] |
|**beneficiaryVASPname** | **String** | The name of the VASP acting as the beneficiary |  [optional] |
|**transactionBlockchainInfo** | [**TravelRuleTransactionBlockchainInfo**](TravelRuleTransactionBlockchainInfo.md) | Information about the blockchain transaction |  [optional] |
|**originator** | [**TravelRulePiiIVMS**](TravelRulePiiIVMS.md) | Information about the originator of the transaction |  |
|**beneficiary** | [**TravelRulePiiIVMS**](TravelRulePiiIVMS.md) | Information about the beneficiary of the transaction |  |
|**encrypted** | **String** | Encrypted data related to the transaction |  [optional] |
|**protocol** | **String** | The protocol used to perform the travel rule |  [optional] |
|**notificationEmail** | **String** | The email address where a notification should be sent upon completion of the travel rule |  [optional] |
|**skipBeneficiaryDataValidation** | **Boolean** | Whether to skip validation of beneficiary data |  [optional] |
|**travelRuleBehavior** | **Boolean** | Whether to check if the transaction is a TRAVEL_RULE in the beneficiary VASP&#39;s jurisdiction |  [optional] |
|**originatorProof** | [**TravelRuleOwnershipProof**](TravelRuleOwnershipProof.md) | Ownership proof related to the originator of the transaction |  [optional] |
|**beneficiaryProof** | [**TravelRuleOwnershipProof**](TravelRuleOwnershipProof.md) | Ownership proof related to the beneficiary of the transaction |  [optional] |



