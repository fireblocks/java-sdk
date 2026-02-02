

# TRLinkCustomerIntegrationResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerIntegrationId** | **UUID** | Customer integration unique identifier |  |
|**apiKey** | **String** | API key for partner integration (censored for security) |  [optional] |
|**secret** | **String** | Secret for partner integration (censored for security) |  [optional] |
|**createDate** | **OffsetDateTime** | Timestamp when the integration was created (ISO 8601 format) |  |
|**lastUpdate** | **OffsetDateTime** | Timestamp when the integration was last updated (ISO 8601 format) |  |
|**partner** | [**TRLinkPartnerResponse**](TRLinkPartnerResponse.md) |  |  |
|**customer** | [**TRLinkCustomerResponse**](TRLinkCustomerResponse.md) |  |  |



