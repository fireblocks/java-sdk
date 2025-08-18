

# SetLayerZeroPeersRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultAccountId** | **String** | The id of the vault account that will be used to inititate transactions ot set peers |  |
|**sourceAdapterTokenLinkId** | **UUID** | &#x60;token_link&#x60; ID of the source adapter contract |  |
|**destinationAdapterTokenLinkIds** | **List&lt;UUID&gt;** | Array of &#x60;token_link&#x60; IDs for destination adapter contracts |  |
|**bidirectional** | **Boolean** | If true, also sets peers from destination(s) back to source |  |



