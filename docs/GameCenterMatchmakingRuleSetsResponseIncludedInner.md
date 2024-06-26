

# GameCenterMatchmakingRuleSetsResponseIncludedInner

## oneOf schemas
* [GameCenterMatchmakingQueue](GameCenterMatchmakingQueue.md)
* [GameCenterMatchmakingRule](GameCenterMatchmakingRule.md)
* [GameCenterMatchmakingTeam](GameCenterMatchmakingTeam.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.GameCenterMatchmakingRuleSetsResponseIncludedInner;
import org.openapitools.client.model.GameCenterMatchmakingQueue;
import org.openapitools.client.model.GameCenterMatchmakingRule;
import org.openapitools.client.model.GameCenterMatchmakingTeam;

public class Example {
    public static void main(String[] args) {
        GameCenterMatchmakingRuleSetsResponseIncludedInner exampleGameCenterMatchmakingRuleSetsResponseIncludedInner = new GameCenterMatchmakingRuleSetsResponseIncludedInner();

        // create a new GameCenterMatchmakingQueue
        GameCenterMatchmakingQueue exampleGameCenterMatchmakingQueue = new GameCenterMatchmakingQueue();
        // set GameCenterMatchmakingRuleSetsResponseIncludedInner to GameCenterMatchmakingQueue
        exampleGameCenterMatchmakingRuleSetsResponseIncludedInner.setActualInstance(exampleGameCenterMatchmakingQueue);
        // to get back the GameCenterMatchmakingQueue set earlier
        GameCenterMatchmakingQueue testGameCenterMatchmakingQueue = (GameCenterMatchmakingQueue) exampleGameCenterMatchmakingRuleSetsResponseIncludedInner.getActualInstance();

        // create a new GameCenterMatchmakingRule
        GameCenterMatchmakingRule exampleGameCenterMatchmakingRule = new GameCenterMatchmakingRule();
        // set GameCenterMatchmakingRuleSetsResponseIncludedInner to GameCenterMatchmakingRule
        exampleGameCenterMatchmakingRuleSetsResponseIncludedInner.setActualInstance(exampleGameCenterMatchmakingRule);
        // to get back the GameCenterMatchmakingRule set earlier
        GameCenterMatchmakingRule testGameCenterMatchmakingRule = (GameCenterMatchmakingRule) exampleGameCenterMatchmakingRuleSetsResponseIncludedInner.getActualInstance();

        // create a new GameCenterMatchmakingTeam
        GameCenterMatchmakingTeam exampleGameCenterMatchmakingTeam = new GameCenterMatchmakingTeam();
        // set GameCenterMatchmakingRuleSetsResponseIncludedInner to GameCenterMatchmakingTeam
        exampleGameCenterMatchmakingRuleSetsResponseIncludedInner.setActualInstance(exampleGameCenterMatchmakingTeam);
        // to get back the GameCenterMatchmakingTeam set earlier
        GameCenterMatchmakingTeam testGameCenterMatchmakingTeam = (GameCenterMatchmakingTeam) exampleGameCenterMatchmakingRuleSetsResponseIncludedInner.getActualInstance();
    }
}
```


