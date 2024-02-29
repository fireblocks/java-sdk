

# TravelRuleValidateTransactionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionAsset** | **String** | Transaction asset symbol BTC,ETH) |  |
|**destination** | **String** | Transaction destination address |  |
|**transactionAmount** | **String** | Transaction amount in the transaction asset |  |
|**originatorVASPdid** | **String** | This is the identifier assigned to your VASP |  |
|**originatorEqualsBeneficiary** | **Boolean** | \&quot;True\&quot; if the originator and beneficiary is the same person and you therefore do not need to collect any information. \&quot;False\&quot; if it is a third-party transfer. |  |
|**travelRuleBehavior** | **Boolean** | This will also check if the transaction is a TRAVEL_RULE in the beneficiary VASP&#39;s jurisdiction |  [optional] |
|**beneficiaryVASPdid** | **String** | This is the identifier assigned to the VASP the funds are being sent to |  [optional] |
|**beneficiaryVASPname** | **String** | Beneficiary VASP name |  [optional] |
|**beneficiaryName** | **String** | Beneficiary  name |  [optional] |
|**beneficiaryAccountNumber** | **String** | Beneficiary  name |  [optional] |
|**beneficiaryAddress** | [**TravelRuleAddress**](TravelRuleAddress.md) |  |  [optional] |



