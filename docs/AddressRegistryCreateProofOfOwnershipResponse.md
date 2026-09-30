

# AddressRegistryCreateProofOfOwnershipResponse

Address Registry Proof of Ownership PDF export, created successfully.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pdf** | **byte[]** | Base64-encoded Proof of Ownership PDF bytes. Fireblocks does not store the PDF: save it immediately, there is no re-download route. |  |
|**exportId** | **UUID** | Stable id of the online-verifiable export record. |  |
|**verificationHash** | **String** | Verification hash bound to the export (also printed on the PDF). |  |
|**expiresAt** | **String** | Inclusive last UTC calendar day online verification is available (&#x60;YYYY-MM-DD&#x60;). |  |



