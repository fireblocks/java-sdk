

# AddressRegistryCustomerRegistryResponse

Your customer's organization-wide address registry default. Workspaces without their own setting use this value. GET, POST (opt in), and DELETE (opt out) all return this object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | &#x60;NOT_SET&#x60;, &#x60;OPTED_IN&#x60;, or &#x60;OPTED_OUT&#x60;. On GET, &#x60;NOT_SET&#x60; means no default has been chosen yet. On POST or DELETE, returns &#x60;OPTED_IN&#x60; or &#x60;OPTED_OUT&#x60; after a successful change. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NOT_SET | &quot;NOT_SET&quot; |
| OPTED_IN | &quot;OPTED_IN&quot; |
| OPTED_OUT | &quot;OPTED_OUT&quot; |



