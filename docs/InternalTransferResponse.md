

# InternalTransferResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**success** | **Boolean** | Indicates whether the transfer was successful |  |
|**id** | **String** | The transaction ID of the internal transfer |  [optional] |
|**status** | **String** | The transfer status returned by the transaction manager. Only present when the transfer was processed via the transaction manager flow. |  [optional] |
|**systemMessages** | [**List&lt;SystemMessageInfo&gt;**](SystemMessageInfo.md) | System messages returned by the transaction manager about the health of the transfer being performed. Only present when the transfer was processed via the transaction manager flow. |  [optional] |



