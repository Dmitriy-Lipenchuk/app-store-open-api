

# GameCenterMatchmakingRuleSetTestCreateRequestIncludedInner

## oneOf schemas
* [GameCenterMatchmakingTestPlayerPropertyInlineCreate](GameCenterMatchmakingTestPlayerPropertyInlineCreate.md)
* [GameCenterMatchmakingTestRequestInlineCreate](GameCenterMatchmakingTestRequestInlineCreate.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.GameCenterMatchmakingRuleSetTestCreateRequestIncludedInner;
import org.openapitools.client.model.GameCenterMatchmakingTestPlayerPropertyInlineCreate;
import org.openapitools.client.model.GameCenterMatchmakingTestRequestInlineCreate;

public class Example {
    public static void main(String[] args) {
        GameCenterMatchmakingRuleSetTestCreateRequestIncludedInner exampleGameCenterMatchmakingRuleSetTestCreateRequestIncludedInner = new GameCenterMatchmakingRuleSetTestCreateRequestIncludedInner();

        // create a new GameCenterMatchmakingTestPlayerPropertyInlineCreate
        GameCenterMatchmakingTestPlayerPropertyInlineCreate exampleGameCenterMatchmakingTestPlayerPropertyInlineCreate = new GameCenterMatchmakingTestPlayerPropertyInlineCreate();
        // set GameCenterMatchmakingRuleSetTestCreateRequestIncludedInner to GameCenterMatchmakingTestPlayerPropertyInlineCreate
        exampleGameCenterMatchmakingRuleSetTestCreateRequestIncludedInner.setActualInstance(exampleGameCenterMatchmakingTestPlayerPropertyInlineCreate);
        // to get back the GameCenterMatchmakingTestPlayerPropertyInlineCreate set earlier
        GameCenterMatchmakingTestPlayerPropertyInlineCreate testGameCenterMatchmakingTestPlayerPropertyInlineCreate = (GameCenterMatchmakingTestPlayerPropertyInlineCreate) exampleGameCenterMatchmakingRuleSetTestCreateRequestIncludedInner.getActualInstance();

        // create a new GameCenterMatchmakingTestRequestInlineCreate
        GameCenterMatchmakingTestRequestInlineCreate exampleGameCenterMatchmakingTestRequestInlineCreate = new GameCenterMatchmakingTestRequestInlineCreate();
        // set GameCenterMatchmakingRuleSetTestCreateRequestIncludedInner to GameCenterMatchmakingTestRequestInlineCreate
        exampleGameCenterMatchmakingRuleSetTestCreateRequestIncludedInner.setActualInstance(exampleGameCenterMatchmakingTestRequestInlineCreate);
        // to get back the GameCenterMatchmakingTestRequestInlineCreate set earlier
        GameCenterMatchmakingTestRequestInlineCreate testGameCenterMatchmakingTestRequestInlineCreate = (GameCenterMatchmakingTestRequestInlineCreate) exampleGameCenterMatchmakingRuleSetTestCreateRequestIncludedInner.getActualInstance();
    }
}
```


