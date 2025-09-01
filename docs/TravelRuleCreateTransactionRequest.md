

# TravelRuleCreateTransactionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**originatorVASPdid** | **String** | The Decentralized Identifier (DID) of the exchange (VASP) that is sending the virtual assets. This identifier is unique to the exchange and is generated when the exchange&#39;s account is  created in the Notabene network. |  [optional] |
|**beneficiaryVASPdid** | **String** | The Decentralized Identifier (DID) of the exchange (VASP) that is receiving the virtual assets. This identifier is unique to the exchange and is generated when the exchange&#39;s account is  created in the Notabene network. |  [optional] |
|**originatorVASPname** | **String** | The name of the VASP acting as the transaction originator. |  [optional] |
|**beneficiaryVASPname** | **String** | The name of the VASP acting as the transaction beneficiary. |  [optional] |
|**beneficiaryVASPwebsite** | **String** | The website of the VASP acting as the transaction beneficiary. |  [optional] |
|**transactionBlockchainInfo** | [**TravelRuleTransactionBlockchainInfo**](TravelRuleTransactionBlockchainInfo.md) |  |  [optional] |
|**originator** | [**TravelRulePiiIVMS**](TravelRulePiiIVMS.md) |  |  |
|**beneficiary** | [**TravelRulePiiIVMS**](TravelRulePiiIVMS.md) |  |  |
|**encrypted** | **String** | Encrypted data related to the transaction. |  [optional] |
|**protocol** | [**ProtocolEnum**](#ProtocolEnum) | The protocol used to perform the travel rule. |  [optional] |
|**targetProtocol** | **String** | The target protocol for GTR (Global Travel Rule) transfers. |  [optional] |
|**skipBeneficiaryDataValidation** | **Boolean** | Whether to skip validation of beneficiary data. |  [optional] |
|**travelRuleBehavior** | **Boolean** | Whether to check if the transaction complies with the travel rule in the beneficiary VASP&#39;s jurisdiction. |  [optional] |
|**originatorRef** | **String** | A reference ID related to the originator of the transaction. |  [optional] |
|**beneficiaryRef** | **String** | A reference ID related to the beneficiary of the transaction. |  [optional] |
|**travelRuleBehaviorRef** | **String** | A reference ID related to the travel rule behavior. |  [optional] |
|**originatorProof** | [**TravelRuleOwnershipProof**](TravelRuleOwnershipProof.md) |  |  [optional] |
|**beneficiaryProof** | [**TravelRuleOwnershipProof**](TravelRuleOwnershipProof.md) |  |  [optional] |
|**beneficiaryDid** | **String** | The Decentralized Identifier (DID) of the person at the receiving exchange (VASP).  This identifier is generated when the customer is registered in the Notabene network,  or automatically created based on the &#x60;beneficiaryRef&#x60;.  - If neither &#x60;beneficiaryRef&#x60; nor &#x60;beneficiaryDid&#x60; is provided in the &#x60;txCreate&#x60; payload,    a new random DID is generated for every transaction. |  [optional] |
|**originatorDid** | **String** | The Decentralized Identifier (DID) of the person at the exchange (VASP) who is requesting the withdrawal. This identifier is generated when the customer is registered in the Notabene network or automatically created based on the &#x60;originatorRef&#x60;.  - If neither &#x60;originatorRef&#x60; nor &#x60;originatorDid&#x60; is provided in the &#x60;txCreate&#x60; payload,    a new random DID is generated for every transaction. |  [optional] |
|**isNonCustodial** | **Boolean** | Indicates if the transaction involves a non-custodial wallet. |  [optional] |



## Enum: ProtocolEnum

| Name | Value |
|---- | -----|
| IVMS101 | &quot;IVMS101&quot; |
| TR_LIGHT | &quot;TRLight&quot; |
| TRP | &quot;TRP&quot; |
| OPEN_VASP | &quot;OpenVASP&quot; |
| GTR | &quot;GTR&quot; |



