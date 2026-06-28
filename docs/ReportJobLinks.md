

# ReportJobLinks

Download URL for the report. Present only when `status` is `COMPLETED`, and only on `GET /v1/reports/{reportId}` — not included in list responses.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**downloadUrl** | **String** | URL to download the report file. A new URL is generated on each request to &#x60;GET /v1/reports/{reportId}&#x60; while &#x60;status&#x60; is &#x60;COMPLETED&#x60;. Re-poll to obtain a fresh URL after the previous one expires (approximately 1 hour). |  |
|**downloadUrlExpiresAt** | **Long** | Epoch milliseconds (UTC) when the download URL expires |  |



