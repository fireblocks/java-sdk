

# DelegationBlockchainPositionInfo

Additional fields per blockchain - can be empty or missing if not initialized or no additional info exists.

## oneOf schemas
* [EthereumBlockchainData](EthereumBlockchainData.md)
* [SolanaBlockchainData](SolanaBlockchainData.md)
* [StEthBlockchainData](StEthBlockchainData.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.DelegationBlockchainPositionInfo;
import com.fireblocks.sdk.model.EthereumBlockchainData;
import com.fireblocks.sdk.model.SolanaBlockchainData;
import com.fireblocks.sdk.model.StEthBlockchainData;

public class Example {
    public static void main(String[] args) {
        DelegationBlockchainPositionInfo exampleDelegationBlockchainPositionInfo = new DelegationBlockchainPositionInfo();

        // create a new EthereumBlockchainData
        EthereumBlockchainData exampleEthereumBlockchainData = new EthereumBlockchainData();
        // set DelegationBlockchainPositionInfo to EthereumBlockchainData
        exampleDelegationBlockchainPositionInfo.setActualInstance(exampleEthereumBlockchainData);
        // to get back the EthereumBlockchainData set earlier
        EthereumBlockchainData testEthereumBlockchainData = (EthereumBlockchainData) exampleDelegationBlockchainPositionInfo.getActualInstance();

        // create a new SolanaBlockchainData
        SolanaBlockchainData exampleSolanaBlockchainData = new SolanaBlockchainData();
        // set DelegationBlockchainPositionInfo to SolanaBlockchainData
        exampleDelegationBlockchainPositionInfo.setActualInstance(exampleSolanaBlockchainData);
        // to get back the SolanaBlockchainData set earlier
        SolanaBlockchainData testSolanaBlockchainData = (SolanaBlockchainData) exampleDelegationBlockchainPositionInfo.getActualInstance();

        // create a new StEthBlockchainData
        StEthBlockchainData exampleStEthBlockchainData = new StEthBlockchainData();
        // set DelegationBlockchainPositionInfo to StEthBlockchainData
        exampleDelegationBlockchainPositionInfo.setActualInstance(exampleStEthBlockchainData);
        // to get back the StEthBlockchainData set earlier
        StEthBlockchainData testStEthBlockchainData = (StEthBlockchainData) exampleDelegationBlockchainPositionInfo.getActualInstance();
    }
}
```


