

# TravelRuleValidateFullTransactionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionAsset** | **String** | The asset involved in the transaction |  |
|**transactionAmount** | **String** | The amount of the transaction |  |
|**originatorDid** | **String** | The DID of the transaction originator |  |
|**beneficiaryDid** | **String** | The DID of the transaction beneficiary |  |
|**originatorVASPdid** | **String** | The VASP ID of the transaction originator |  |
|**beneficiaryVASPdid** | **String** | The VASP ID of the transaction beneficiary |  |
|**beneficiaryVASPname** | **String** | The name of the VASP acting as the beneficiary |  |
|**transactionBlockchainInfo** | [**TravelRuleValidateFullTransactionRequestTransactionBlockchainInfo**](TravelRuleValidateFullTransactionRequestTransactionBlockchainInfo.md) |  |  |
|**originator** | [**TravelRuleValidateFullTransactionRequestOriginator**](TravelRuleValidateFullTransactionRequestOriginator.md) |  |  |
|**beneficiary** | [**TravelRuleValidateFullTransactionRequestBeneficiary**](TravelRuleValidateFullTransactionRequestBeneficiary.md) |  |  |
|**encrypted** | **String** | Encrypted data related to the transaction |  |
|**protocol** | **String** | The protocol used to perform the travel rule |  |
|**notificationEmail** | **String** | The email address where a notification should be sent upon completion of the travel rule |  |
|**skipBeneficiaryDataValidation** | **Boolean** | Whether to skip validation of beneficiary data |  |
|**travelRuleBehavior** | **Boolean** | Whether to check if the transaction is a TRAVEL_RULE in the beneficiary VASP&#39;s jurisdiction |  |
|**originatorProof** | [**TravelRuleValidateFullTransactionRequestOriginatorProof**](TravelRuleValidateFullTransactionRequestOriginatorProof.md) |  |  |
|**beneficiaryProof** | [**TravelRuleValidateFullTransactionRequestBeneficiaryProof**](TravelRuleValidateFullTransactionRequestBeneficiaryProof.md) |  |  |
|**pii** | [**TravelRuleValidateFullTransactionRequestPii**](TravelRuleValidateFullTransactionRequestPii.md) |  |  |



