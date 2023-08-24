

# PayoutResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payoutId** | **String** |  |  |
|**paymentAccount** | [**PaymentAccountResponse**](PaymentAccountResponse.md) |  |  |
|**createdAt** | **BigDecimal** |  |  |
|**state** | **PayoutState** |  |  |
|**status** | **PayoutStatus** |  |  |
|**reasonOfFailure** | **String** | &lt;ul&gt;  &lt;li&gt; INSUFFICIENT_BALANCE&lt;/li&gt; &lt;li&gt; SOURCE_TRANSLATION&lt;/li&gt; &lt;li&gt; SOURCE_NOT_UNIQUE&lt;/li&gt; &lt;li&gt; SOURCE_NOT_FOUND&lt;/li&gt; &lt;li&gt; SOURCE_TYPE_NOT_SUPPORTED&lt;/li&gt; &lt;li&gt; EMPTY_SOURCE&lt;/li&gt; &lt;li&gt; DESTINATION_TRANSLATION&lt;/li&gt; &lt;li&gt; DESTINATION_NOT_UNIQUE&lt;/li&gt; &lt;li&gt; DESTINATION_NOT_FOUND&lt;/li&gt; &lt;li&gt; EMPTY_DESTINATION&lt;/li&gt; &lt;li&gt; PARSING &lt;/li&gt; &lt;li&gt; UNKNOWN&lt;/li&gt; &lt;li&gt; FIREBLOCKS_CLIENT&lt;/li&gt; &lt;li&gt; TRANSACTION_SUBMISSION&lt;/li&gt; &lt;/ul&gt;  |  [optional] |
|**initMethod** | **PayoutInitMethod** |  |  [optional] |
|**instructionSet** | [**List&lt;PayoutInstructionResponse&gt;**](PayoutInstructionResponse.md) |  |  |
|**reportUrl** | **String** |  |  [optional] |



