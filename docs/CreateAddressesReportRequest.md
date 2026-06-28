

# CreateAddressesReportRequest

Request body for creating a new ADDRESSES report job

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) | The type of report to generate. |  |
|**outputFormat** | **ReportOutputFormat** |  |  |
|**compress** | **Boolean** | Gzip the output file. Defaults to true. |  [optional] |
|**filters** | [**AddressesFilters**](AddressesFilters.md) |  |  [optional] |



## Enum: ReportTypeEnum

| Name | Value |
|---- | -----|
| ADDRESSES | &quot;ADDRESSES&quot; |



