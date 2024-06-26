

# GameCenterLeaderboardsResponseIncludedInner

## oneOf schemas
* [GameCenterDetail](GameCenterDetail.md)
* [GameCenterGroup](GameCenterGroup.md)
* [GameCenterLeaderboard](GameCenterLeaderboard.md)
* [GameCenterLeaderboardLocalization](GameCenterLeaderboardLocalization.md)
* [GameCenterLeaderboardRelease](GameCenterLeaderboardRelease.md)
* [GameCenterLeaderboardSet](GameCenterLeaderboardSet.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.GameCenterLeaderboardsResponseIncludedInner;
import org.openapitools.client.model.GameCenterDetail;
import org.openapitools.client.model.GameCenterGroup;
import org.openapitools.client.model.GameCenterLeaderboard;
import org.openapitools.client.model.GameCenterLeaderboardLocalization;
import org.openapitools.client.model.GameCenterLeaderboardRelease;
import org.openapitools.client.model.GameCenterLeaderboardSet;

public class Example {
    public static void main(String[] args) {
        GameCenterLeaderboardsResponseIncludedInner exampleGameCenterLeaderboardsResponseIncludedInner = new GameCenterLeaderboardsResponseIncludedInner();

        // create a new GameCenterDetail
        GameCenterDetail exampleGameCenterDetail = new GameCenterDetail();
        // set GameCenterLeaderboardsResponseIncludedInner to GameCenterDetail
        exampleGameCenterLeaderboardsResponseIncludedInner.setActualInstance(exampleGameCenterDetail);
        // to get back the GameCenterDetail set earlier
        GameCenterDetail testGameCenterDetail = (GameCenterDetail) exampleGameCenterLeaderboardsResponseIncludedInner.getActualInstance();

        // create a new GameCenterGroup
        GameCenterGroup exampleGameCenterGroup = new GameCenterGroup();
        // set GameCenterLeaderboardsResponseIncludedInner to GameCenterGroup
        exampleGameCenterLeaderboardsResponseIncludedInner.setActualInstance(exampleGameCenterGroup);
        // to get back the GameCenterGroup set earlier
        GameCenterGroup testGameCenterGroup = (GameCenterGroup) exampleGameCenterLeaderboardsResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboard
        GameCenterLeaderboard exampleGameCenterLeaderboard = new GameCenterLeaderboard();
        // set GameCenterLeaderboardsResponseIncludedInner to GameCenterLeaderboard
        exampleGameCenterLeaderboardsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboard);
        // to get back the GameCenterLeaderboard set earlier
        GameCenterLeaderboard testGameCenterLeaderboard = (GameCenterLeaderboard) exampleGameCenterLeaderboardsResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboardLocalization
        GameCenterLeaderboardLocalization exampleGameCenterLeaderboardLocalization = new GameCenterLeaderboardLocalization();
        // set GameCenterLeaderboardsResponseIncludedInner to GameCenterLeaderboardLocalization
        exampleGameCenterLeaderboardsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboardLocalization);
        // to get back the GameCenterLeaderboardLocalization set earlier
        GameCenterLeaderboardLocalization testGameCenterLeaderboardLocalization = (GameCenterLeaderboardLocalization) exampleGameCenterLeaderboardsResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboardRelease
        GameCenterLeaderboardRelease exampleGameCenterLeaderboardRelease = new GameCenterLeaderboardRelease();
        // set GameCenterLeaderboardsResponseIncludedInner to GameCenterLeaderboardRelease
        exampleGameCenterLeaderboardsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboardRelease);
        // to get back the GameCenterLeaderboardRelease set earlier
        GameCenterLeaderboardRelease testGameCenterLeaderboardRelease = (GameCenterLeaderboardRelease) exampleGameCenterLeaderboardsResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboardSet
        GameCenterLeaderboardSet exampleGameCenterLeaderboardSet = new GameCenterLeaderboardSet();
        // set GameCenterLeaderboardsResponseIncludedInner to GameCenterLeaderboardSet
        exampleGameCenterLeaderboardsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboardSet);
        // to get back the GameCenterLeaderboardSet set earlier
        GameCenterLeaderboardSet testGameCenterLeaderboardSet = (GameCenterLeaderboardSet) exampleGameCenterLeaderboardsResponseIncludedInner.getActualInstance();
    }
}
```


