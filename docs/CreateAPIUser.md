

# CreateAPIUser


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**role** | **String** | Users role |  |
|**name** | **String** | Users name |  |
|**csrPem** | **String** | CSR file that is used to verify API requests. read more https://developers.fireblocks.com/docs/quickstart |  |
|**coSignerSetupType** | **String** | Different environments allow for different setup options, field is required for management/signer role |  [optional] |
|**coSignerSetupIsFirstUser** | **Boolean** | pass as true if this is the first user on the coSigner machine |  [optional] |



