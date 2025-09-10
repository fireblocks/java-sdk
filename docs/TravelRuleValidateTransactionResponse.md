

# TravelRuleValidateTransactionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isValid** | **Boolean** | \&quot;isValid\&quot; will tell you if you have collected all the information needed for the travel rule data transfer. Once this field &#x3D; \&quot;true\&quot;, you can move on to the next step which is to transfer the front-end information to your back-end and perform Travel Rule Transaction create |  |
|**type** | **String** | \&quot;type\&quot; will tell you if the virtual asset value converted to FIAT value of the withdrawal request is above (&#x3D;TRAVELRULE) or below (&#x3D;BELOW_THRESHOLD) the threshold in your jurisdiction. If it is to an unhosted wallet which does not require travel rule information to be sent and only collected, it will say NON_CUSTODIAL. |  |
|**beneficiaryAddressType** | **String** | \&quot;beneficiaryAddressType\&quot; will tell you if your blockchain analytics provider or internal address book has been able to identify the wallet address. |  |
|**addressSource** | **String** | \&quot;addressSource\&quot; will tell you if the address was found in your internal address book or identified by the blockchain analytics provider. |  |
|**beneficiaryVASPdid** | **String** | The VASP DID of the beneficiary VASP |  |
|**beneficiaryVASPname** | **String** | \&quot;beneficiaryVASPname\&quot; will tell you the name of the VASP that has been identified as the owner of the wallet address. This name is used in a subsequent call to get its DID. |  |
|**warnings** | **List&lt;String&gt;** | \&quot;errors/warnings\&quot; will tell you what information about the beneficiary you need to collect from the sender. |  |



