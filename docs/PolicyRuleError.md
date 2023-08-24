

# PolicyRuleError

Rule validation result error

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errorMessage** | **String** | Error message |  |
|**errorCode** | **BigDecimal** | error code |  |
|**errorCodeName** | **String** | error code name |  |
|**errorField** | [**ErrorFieldEnum**](#ErrorFieldEnum) | The field which the error relates to * operator - transaction initiator * operators - transaction initiators * authorizationGroups - transaction authorizer groups * designatedSigner - transaction signer * designatedSigners - transaction signers * contractMethods - contract methods * amountAggregation - transaction amount aggregation configuration * src - transaction source asset configuration * dst - transaction destination asset configuration  |  |



## Enum: ErrorFieldEnum

| Name | Value |
|---- | -----|
| OPERATOR | &quot;operator&quot; |
| OPERATORS | &quot;operators&quot; |
| AUTHORIZATIONGROUPS | &quot;authorizationGroups&quot; |
| DESIGNATEDSIGNER | &quot;designatedSigner&quot; |
| DESIGNATEDSIGNERS | &quot;designatedSigners&quot; |
| CONTRACTMETHODS | &quot;contractMethods&quot; |
| AMOUNTAGGREGATION | &quot;amountAggregation&quot; |
| SRC | &quot;src&quot; |
| DST | &quot;dst&quot; |



