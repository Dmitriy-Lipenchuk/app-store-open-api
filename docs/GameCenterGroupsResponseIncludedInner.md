

# GameCenterGroupsResponseIncludedInner

## oneOf schemas
* [GameCenterAchievement](GameCenterAchievement.md)
* [GameCenterDetail](GameCenterDetail.md)
* [GameCenterLeaderboard](GameCenterLeaderboard.md)
* [GameCenterLeaderboardSet](GameCenterLeaderboardSet.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.GameCenterGroupsResponseIncludedInner;
import org.openapitools.client.model.GameCenterAchievement;
import org.openapitools.client.model.GameCenterDetail;
import org.openapitools.client.model.GameCenterLeaderboard;
import org.openapitools.client.model.GameCenterLeaderboardSet;

public class Example {
    public static void main(String[] args) {
        GameCenterGroupsResponseIncludedInner exampleGameCenterGroupsResponseIncludedInner = new GameCenterGroupsResponseIncludedInner();

        // create a new GameCenterAchievement
        GameCenterAchievement exampleGameCenterAchievement = new GameCenterAchievement();
        // set GameCenterGroupsResponseIncludedInner to GameCenterAchievement
        exampleGameCenterGroupsResponseIncludedInner.setActualInstance(exampleGameCenterAchievement);
        // to get back the GameCenterAchievement set earlier
        GameCenterAchievement testGameCenterAchievement = (GameCenterAchievement) exampleGameCenterGroupsResponseIncludedInner.getActualInstance();

        // create a new GameCenterDetail
        GameCenterDetail exampleGameCenterDetail = new GameCenterDetail();
        // set GameCenterGroupsResponseIncludedInner to GameCenterDetail
        exampleGameCenterGroupsResponseIncludedInner.setActualInstance(exampleGameCenterDetail);
        // to get back the GameCenterDetail set earlier
        GameCenterDetail testGameCenterDetail = (GameCenterDetail) exampleGameCenterGroupsResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboard
        GameCenterLeaderboard exampleGameCenterLeaderboard = new GameCenterLeaderboard();
        // set GameCenterGroupsResponseIncludedInner to GameCenterLeaderboard
        exampleGameCenterGroupsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboard);
        // to get back the GameCenterLeaderboard set earlier
        GameCenterLeaderboard testGameCenterLeaderboard = (GameCenterLeaderboard) exampleGameCenterGroupsResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboardSet
        GameCenterLeaderboardSet exampleGameCenterLeaderboardSet = new GameCenterLeaderboardSet();
        // set GameCenterGroupsResponseIncludedInner to GameCenterLeaderboardSet
        exampleGameCenterGroupsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboardSet);
        // to get back the GameCenterLeaderboardSet set earlier
        GameCenterLeaderboardSet testGameCenterLeaderboardSet = (GameCenterLeaderboardSet) exampleGameCenterGroupsResponseIncludedInner.getActualInstance();
    }
}
```


