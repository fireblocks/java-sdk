

# ScreeningAmlResult

Detailed AML screening result information. Contains alerts, risk scores, and other AML-specific data from provider-specific responses. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alerts** | [**List&lt;ScreeningAmlAlert&gt;**](ScreeningAmlAlert.md) | List of AML alerts triggered during screening |  [optional] |
|**providerResponse** | **Map&lt;String, Object&gt;** | Complete response from the AML provider. This is a dynamic object that varies significantly between different AML providers (Chainalysis, Elliptic, etc.). Each provider has their own proprietary response format and schema.  Examples of provider-specific structures: - Chainalysis: Contains cluster info, risk scores, sanctions data - Elliptic: Includes risk assessment, entity types, compliance flags  The structure is provider-dependent and cannot be standardized as each vendor implements their own proprietary data models and response formats.  |  [optional] |
|**matchedRule** | [**ScreeningAmlMatchedRule**](ScreeningAmlMatchedRule.md) |  |  [optional] |
|**matchedAlert** | [**ScreeningAmlAlert**](ScreeningAmlAlert.md) |  |  [optional] |



