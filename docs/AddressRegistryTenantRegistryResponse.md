

# AddressRegistryTenantRegistryResponse

Whether this workspace uses the address registry. GET, POST (opt in), and DELETE (opt out) all return this object. On GET, if this workspace has no explicit choice, `status` follows the customer default when one is set, otherwise the workspace is opted in by default.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | &#x60;OPTED_IN&#x60; or &#x60;OPTED_OUT&#x60;. On GET, uses the customer default when this workspace has no setting of its own and the customer has made an explicit choice; is &#x60;OPTED_IN&#x60; when neither is set. On POST or DELETE, reflects the choice you just made for this workspace. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPTED_IN | &quot;OPTED_IN&quot; |
| OPTED_OUT | &quot;OPTED_OUT&quot; |



