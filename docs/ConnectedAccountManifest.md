

# ConnectedAccountManifest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assetTypes** | **List&lt;ConnectedAccountAssetType&gt;** | Asset types supported by the connected account. |  |
|**capabilities** | **List&lt;ConnectedAccountCapability&gt;** | Features supported for the connected account. Logic: - If account capabilities include ramp -&gt; TRADING - If account capabilities include transfers -&gt; DEPOSITS - If account capabilities include transfersBlockchain / transfersFiat / transfersPeerAccounts / transfersInternal -&gt; WITHDRAWALS  |  |



