

# UtxoSelectionConfigResponse

`effective` is always present. `configured` is omitted when no row is stored at the requested scope (the server does not emit `\"configured\": null`). PUT responses always include `configured`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**configured** | [**UtxoSelectionConfigEntry**](UtxoSelectionConfigEntry.md) |  |  [optional] |
|**effective** | [**EffectiveUtxoSelectionConfig**](EffectiveUtxoSelectionConfig.md) |  |  |



