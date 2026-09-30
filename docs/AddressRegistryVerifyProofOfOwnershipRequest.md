

# AddressRegistryVerifyProofOfOwnershipRequest

Request body for verifying an Address Registry Proof of Ownership export.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exportId** | **UUID** | Export id from create / the PDF. |  |
|**verificationHash** | **String** | Verification hash from create / the PDF (exact match required). |  |
|**address** | **String** | Address from the PDF (exact UTF-8 match to the stored export). |  |
|**expiresAt** | **String** | Optional but recommended: the PDF&#39;s \&quot;Online verification available until\&quot; date (&#x60;YYYY-MM-DD&#x60;), which speeds up the lookup. A wrong value yields &#x60;valid: false&#x60; even if the export exists — copy it exactly from the PDF, or omit it. |  [optional] |



