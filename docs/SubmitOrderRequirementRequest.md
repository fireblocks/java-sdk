

# SubmitOrderRequirementRequest

Body of POST /trading/orders/{orderId}/requirement/data. Carries the textual response (`data`). Any required files are uploaded separately via POST /trading/orders/{orderId}/requirement/file.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | **Map&lt;String, Object&gt;** | Free-form object that MUST conform to the &#x60;requiredData&#x60; JSON Schema returned by the GET endpoint. Carries text/select fields. |  |



