

# ProgramCallDecodedDataItem

A single decoded Solana instruction from a PROGRAM_CALL transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**programId** | **String** | The on-chain program address that owns this instruction. |  |
|**programName** | **String** | Human-readable program name (e.g. &#x60;SystemProgram&#x60;, &#x60;ComputeBudget&#x60;). |  |
|**instructionData** | **Map&lt;String, Object&gt;** | Decoded instruction arguments. Keys and values depend on the instruction type — values may be strings, numbers, or nested objects (e.g. &#x60;args&#x60;, &#x60;accounts&#x60;, &#x60;name&#x60;). |  |



