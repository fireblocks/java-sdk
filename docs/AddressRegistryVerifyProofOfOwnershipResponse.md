

# AddressRegistryVerifyProofOfOwnershipResponse

Online verification result. Authenticated calls always return HTTP 200 with this body (`valid: true` or `valid: false`); unknown/expired exports do not use 404.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**valid** | **Boolean** | Whether the stored export matches the supplied verification hash and address within retention. |  |
|**expiresAt** | **String** | Inclusive last UTC calendar day (&#x60;YYYY-MM-DD&#x60;) when &#x60;valid&#x60; is true; empty string when &#x60;valid&#x60; is false. |  |



