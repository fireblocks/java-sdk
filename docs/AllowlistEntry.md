

# AllowlistEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier for the allowlist entry |  |
|**address** | **String** | The blockchain address |  |
|**assets** | **List&lt;String&gt;** | Assets approved for this address.  Each value is either a Fireblocks asset ID (when the provider&#39;s asset maps to a Fireblocks-supported asset) or the raw provider asset symbol (when no mapping exists). Treat values as opaque strings.  Possible combinations:   - One or more specific asset values (e.g., &#x60;[\&quot;BTC\&quot;, \&quot;ETH\&quot;]&#x60;)  See [List assets](https://developers.fireblocks.com/reference/listassets) for the canonical list of Fireblocks asset IDs.  |  |
|**networks** | **List&lt;String&gt;** | Networks approved for this address.  Each value is either a Fireblocks network ID (when the provider&#39;s network maps to a Fireblocks-supported blockchain) or the raw provider blockchain identifier (when no mapping exists). Treat values as opaque strings.  Possible combinations:   - One or more specific network values (e.g., &#x60;[\&quot;ETHEREUM\&quot;, \&quot;POLYGON\&quot;]&#x60;)  See [List blockchains](https://developers.fireblocks.com/reference/listblockchains) for the canonical list of Fireblocks blockchain identifiers.  |  |
|**label** | **String** | Human-readable label for the address |  [optional] |
|**addressIdentifier** | **String** | Additional identifier (e.g., memo, destination tag) |  [optional] |
|**status** | **AllowlistEntryStatus** |  |  |
|**addedAt** | **OffsetDateTime** | ISO 8601 timestamp when entry was added |  |
|**providerReferenceId** | **String** | Provider&#39;s internal reference ID |  [optional] |
|**providerMetadata** | **Map&lt;String, Object&gt;** | Provider-specific pass-through data for this address. Treat as an opaque blob: the shape, set of keys, and value types vary by provider, by entry, and over time. Keys may be added, renamed, or removed without notice as providers evolve their integrations or as new providers are added. The example below illustrates one possible shape and is not a contract — do not program against specific keys.  |  [optional] |



