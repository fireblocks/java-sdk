

# TRLinkCreateIntegrationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **UUID** | Customer unique identifier |  |
|**partnerIdent** | **String** | Partner identification code (e.g., \&quot;sumsub\&quot;, \&quot;notabene\&quot;) |  |
|**customerIntegrationId** | **UUID** | Optional. When supplied and permitted for the tenant (feature flag / CSM arrangement), this value is used as the TRLink integration identifier instead of a server-generated UUID. If omitted, the API generates a UUID. If supplied when the tenant is not permitted to set a custom id, the request fails with 400. Contact your CSM if you need a custom integration id. |  [optional] |



