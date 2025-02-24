

# TravelRuleValidateNaturalNameIdentifier


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**primaryIdentifier** | **String** | The primary identifier of the name |  [optional] |
|**secondaryIdentifier** | **String** | The secondary identifier of the name |  [optional] |
|**nameIdentifierType** | [**NameIdentifierTypeEnum**](#NameIdentifierTypeEnum) | Specifies the type of name for a natural person. Acceptable values are: - &#39;ALIA&#39;: Alias name, a name other than the legal name by which a natural person is also known. - &#39;BIRT&#39;: Name at birth, the name given to a natural person at birth. - &#39;MAID&#39;: Maiden name, the original name of a natural person who has changed their name after marriage. - &#39;LEGL&#39;: Legal name, the name that identifies a natural person for legal, official, or administrative purposes. - &#39;MISC&#39;: Unspecified, a name by which a natural person may be known but cannot otherwise be categorized. |  [optional] |



## Enum: NameIdentifierTypeEnum

| Name | Value |
|---- | -----|
| ALIA | &quot;ALIA&quot; |
| BIRT | &quot;BIRT&quot; |
| MAID | &quot;MAID&quot; |
| LEGL | &quot;LEGL&quot; |
| MISC | &quot;MISC&quot; |



