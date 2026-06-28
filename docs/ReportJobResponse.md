

# ReportJobResponse

A report job. Optional fields are status-dependent: `completedAt`, `rowCount`, `fileSizeBytes`, and `links` are present only when `status` is `COMPLETED`; `failedAt` is present only when `status` is `FAILED`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the report job |  |
|**status** | **ReportStatus** |  |  |
|**reportType** | **ReportType** |  |  |
|**outputFormat** | **ReportOutputFormat** |  |  |
|**compress** | **Boolean** | Whether the output file is gzip-compressed |  |
|**requestedByUserId** | **String** | ID of the user who requested the report |  |
|**createdAt** | **Long** | Epoch milliseconds (UTC) when the job was created |  |
|**completedAt** | **Long** | Epoch milliseconds (UTC) when the report completed. Only present when &#x60;status&#x60; is &#x60;COMPLETED&#x60;. |  [optional] |
|**failedAt** | **Long** | Epoch milliseconds (UTC) when the report failed. Only present when &#x60;status&#x60; is &#x60;FAILED&#x60;. |  [optional] |
|**rowCount** | **Integer** | Number of rows in the report file. Only present when &#x60;status&#x60; is &#x60;COMPLETED&#x60;. |  [optional] |
|**fileSizeBytes** | **Long** | Size of the report file in bytes (includes compression when &#x60;compress&#x60; is &#x60;true&#x60;). Only present when &#x60;status&#x60; is &#x60;COMPLETED&#x60;. |  [optional] |
|**links** | [**ReportJobLinks**](ReportJobLinks.md) |  |  [optional] |



