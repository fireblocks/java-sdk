

# QuorumStatusQuorum

The approval criteria and how far they have been met. `type` discriminates the two shapes: `SIMPLE` flattens the common single-tier case, `RULESET` is the general multi-tier form.

## oneOf schemas
* [RulesetQuorum](RulesetQuorum.md)
* [SimpleQuorum](SimpleQuorum.md)

## Example
```java
// Import classes:
import com.fireblocks.sdk.model.QuorumStatusQuorum;
import com.fireblocks.sdk.model.RulesetQuorum;
import com.fireblocks.sdk.model.SimpleQuorum;

public class Example {
    public static void main(String[] args) {
        QuorumStatusQuorum exampleQuorumStatusQuorum = new QuorumStatusQuorum();

        // create a new RulesetQuorum
        RulesetQuorum exampleRulesetQuorum = new RulesetQuorum();
        // set QuorumStatusQuorum to RulesetQuorum
        exampleQuorumStatusQuorum.setActualInstance(exampleRulesetQuorum);
        // to get back the RulesetQuorum set earlier
        RulesetQuorum testRulesetQuorum = (RulesetQuorum) exampleQuorumStatusQuorum.getActualInstance();

        // create a new SimpleQuorum
        SimpleQuorum exampleSimpleQuorum = new SimpleQuorum();
        // set QuorumStatusQuorum to SimpleQuorum
        exampleQuorumStatusQuorum.setActualInstance(exampleSimpleQuorum);
        // to get back the SimpleQuorum set earlier
        SimpleQuorum testSimpleQuorum = (SimpleQuorum) exampleQuorumStatusQuorum.getActualInstance();
    }
}
```


