

# TravelRuleIssuer

An attestation of a single VASP attribute by an issuing party.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**issuerDid** | **String** | The Decentralized Identifier (DID) of the party that issued the attestation. |  |
|**issuedDate** | **String** | Timestamp when the attestation was issued. Present on every attestation observed to date, but not guaranteed, so treat it as optional. |  [optional] |
|**issuerName** | **String** | The human-readable name of the issuing party. Returned only for issuers that publish a name, such as GLEIF; absent for others, including in the same response. |  [optional] |



