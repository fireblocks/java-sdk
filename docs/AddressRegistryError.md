

# AddressRegistryError

Error body for address registry operations (4xx and 5xx).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **Integer** | Application error code when present. Typical values include **2140** (403 — workspace not opted in to the address registry) and **2142** (404 — not found). Other codes may appear, including on server errors.  |  [optional] |
|**message** | **String** | Human-readable error message |  |



