

# CollectionLinkDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The collection id |  |
|**status** | [**StatusEnum**](#StatusEnum) | The collection status |  |
|**type** | **CollectionType** |  |  |
|**displayName** | **String** | The display name of the collection. If was not provided, would be taken from the contract template |  [optional] |
|**collectionMetadata** | [**CollectionMetadataDto**](CollectionMetadataDto.md) | The collection&#39;s metadata |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |



