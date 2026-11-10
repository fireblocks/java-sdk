

# RoleFeeInfo

**Early Access.** What the transfer cost the Fireblocks wallet of one role (`sender` or `recipient`). Currently reported for TON only.  Unlike `networkFee`, which describes the transfer as a whole, these amounts are always the cost to the wallet of that role, so the two can differ, for example for a `recipient`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feesDeducted** | **String** | The total amount of TON deducted from the wallet because of the transfer, in TON, as a decimal string with nine decimals (like &#x60;networkFee&#x60;).  - &#x60;sender&#x60; of a native TON transfer: the wallet&#39;s own fees plus the forwarding fees of the messages it sent. - &#x60;sender&#x60; of a Jetton (token) transfer: what the wallet actually lost. This is its own fees plus the TON it attached to cover the token wallets, minus any excess returned to it. If the excess is returned to the sender, the fee of receiving it is included. If the excess goes to any other wallet, the full attached TON is counted. When one external message carries several Jetton transfers (a multi-send), the loss is that of the whole message: every excess that came back to the wallet is subtracted. - &#x60;recipient&#x60; of a native TON transfer: the fees of the transaction that received the transfer, including gas. - &#x60;recipient&#x60; of a Jetton transfer: the fees of the notification transaction, usually a few nanoTON of storage fees. &#x60;\&quot;0.000000000\&quot;&#x60; when the transfer carried no forward amount, because the wallet then has no transaction of its own and pays nothing. |  [optional] |
|**valueCredited** | **String** | The gross amount of TON that arrived at the wallet together with the token notification (the forward amount), in TON, as a decimal string with nine decimals. Set only for the &#x60;recipient&#x60; of a Jetton (token) transfer, and omitted when the amount is zero or the notification bounced.  &#x60;valueCredited&#x60; is not subtracted from &#x60;feesDeducted&#x60;. The net change of the wallet&#39;s TON balance caused by the transfer is &#x60;valueCredited&#x60; minus &#x60;feesDeducted&#x60;. |  [optional] |



