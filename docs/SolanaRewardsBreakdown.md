

# SolanaRewardsBreakdown

A breakdown of the staking rewards earned by the position.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inflation** | **String** | The inflation reward amount earned by the position, measured in the staked asset unit. |  |
|**mev** | **String** | The MEV reward amount earned by the position, measured in the staked asset unit. |  |
|**lastRewardSyncedAt** | **OffsetDateTime** | The time (UTC) of the last sync that fetched this position&#39;s rewards from the rewards provider. It is updated on every sync, including when nothing new was found, so it is not the date of the newest reward (see latestInflationRewardDate and latestMevRewardDate). |  |
|**latestInflationRewardDate** | **LocalDate** | The date (UTC, YYYY-MM-DD) of the newest inflation reward the rewards provider has returned for this stake account. Null until the provider returns one. |  [optional] |
|**latestMevRewardDate** | **LocalDate** | The date (UTC, YYYY-MM-DD) of the newest MEV reward the rewards provider has returned for this stake account. Null until the provider returns one, and for validators without MEV rewards. |  [optional] |



