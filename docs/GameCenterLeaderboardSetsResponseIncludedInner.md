

# GameCenterLeaderboardSetsResponseIncludedInner

## oneOf schemas
* [GameCenterDetail](GameCenterDetail.md)
* [GameCenterGroup](GameCenterGroup.md)
* [GameCenterLeaderboard](GameCenterLeaderboard.md)
* [GameCenterLeaderboardSet](GameCenterLeaderboardSet.md)
* [GameCenterLeaderboardSetLocalization](GameCenterLeaderboardSetLocalization.md)
* [GameCenterLeaderboardSetRelease](GameCenterLeaderboardSetRelease.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.GameCenterLeaderboardSetsResponseIncludedInner;
import org.openapitools.client.model.GameCenterDetail;
import org.openapitools.client.model.GameCenterGroup;
import org.openapitools.client.model.GameCenterLeaderboard;
import org.openapitools.client.model.GameCenterLeaderboardSet;
import org.openapitools.client.model.GameCenterLeaderboardSetLocalization;
import org.openapitools.client.model.GameCenterLeaderboardSetRelease;

public class Example {
    public static void main(String[] args) {
        GameCenterLeaderboardSetsResponseIncludedInner exampleGameCenterLeaderboardSetsResponseIncludedInner = new GameCenterLeaderboardSetsResponseIncludedInner();

        // create a new GameCenterDetail
        GameCenterDetail exampleGameCenterDetail = new GameCenterDetail();
        // set GameCenterLeaderboardSetsResponseIncludedInner to GameCenterDetail
        exampleGameCenterLeaderboardSetsResponseIncludedInner.setActualInstance(exampleGameCenterDetail);
        // to get back the GameCenterDetail set earlier
        GameCenterDetail testGameCenterDetail = (GameCenterDetail) exampleGameCenterLeaderboardSetsResponseIncludedInner.getActualInstance();

        // create a new GameCenterGroup
        GameCenterGroup exampleGameCenterGroup = new GameCenterGroup();
        // set GameCenterLeaderboardSetsResponseIncludedInner to GameCenterGroup
        exampleGameCenterLeaderboardSetsResponseIncludedInner.setActualInstance(exampleGameCenterGroup);
        // to get back the GameCenterGroup set earlier
        GameCenterGroup testGameCenterGroup = (GameCenterGroup) exampleGameCenterLeaderboardSetsResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboard
        GameCenterLeaderboard exampleGameCenterLeaderboard = new GameCenterLeaderboard();
        // set GameCenterLeaderboardSetsResponseIncludedInner to GameCenterLeaderboard
        exampleGameCenterLeaderboardSetsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboard);
        // to get back the GameCenterLeaderboard set earlier
        GameCenterLeaderboard testGameCenterLeaderboard = (GameCenterLeaderboard) exampleGameCenterLeaderboardSetsResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboardSet
        GameCenterLeaderboardSet exampleGameCenterLeaderboardSet = new GameCenterLeaderboardSet();
        // set GameCenterLeaderboardSetsResponseIncludedInner to GameCenterLeaderboardSet
        exampleGameCenterLeaderboardSetsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboardSet);
        // to get back the GameCenterLeaderboardSet set earlier
        GameCenterLeaderboardSet testGameCenterLeaderboardSet = (GameCenterLeaderboardSet) exampleGameCenterLeaderboardSetsResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboardSetLocalization
        GameCenterLeaderboardSetLocalization exampleGameCenterLeaderboardSetLocalization = new GameCenterLeaderboardSetLocalization();
        // set GameCenterLeaderboardSetsResponseIncludedInner to GameCenterLeaderboardSetLocalization
        exampleGameCenterLeaderboardSetsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboardSetLocalization);
        // to get back the GameCenterLeaderboardSetLocalization set earlier
        GameCenterLeaderboardSetLocalization testGameCenterLeaderboardSetLocalization = (GameCenterLeaderboardSetLocalization) exampleGameCenterLeaderboardSetsResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboardSetRelease
        GameCenterLeaderboardSetRelease exampleGameCenterLeaderboardSetRelease = new GameCenterLeaderboardSetRelease();
        // set GameCenterLeaderboardSetsResponseIncludedInner to GameCenterLeaderboardSetRelease
        exampleGameCenterLeaderboardSetsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboardSetRelease);
        // to get back the GameCenterLeaderboardSetRelease set earlier
        GameCenterLeaderboardSetRelease testGameCenterLeaderboardSetRelease = (GameCenterLeaderboardSetRelease) exampleGameCenterLeaderboardSetsResponseIncludedInner.getActualInstance();
    }
}
```


