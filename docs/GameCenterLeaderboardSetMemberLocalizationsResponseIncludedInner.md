

# GameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner

## oneOf schemas
* [GameCenterLeaderboard](GameCenterLeaderboard.md)
* [GameCenterLeaderboardSet](GameCenterLeaderboardSet.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.GameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner;
import org.openapitools.client.model.GameCenterLeaderboard;
import org.openapitools.client.model.GameCenterLeaderboardSet;

public class Example {
    public static void main(String[] args) {
        GameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner exampleGameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner = new GameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner();

        // create a new GameCenterLeaderboard
        GameCenterLeaderboard exampleGameCenterLeaderboard = new GameCenterLeaderboard();
        // set GameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner to GameCenterLeaderboard
        exampleGameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboard);
        // to get back the GameCenterLeaderboard set earlier
        GameCenterLeaderboard testGameCenterLeaderboard = (GameCenterLeaderboard) exampleGameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboardSet
        GameCenterLeaderboardSet exampleGameCenterLeaderboardSet = new GameCenterLeaderboardSet();
        // set GameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner to GameCenterLeaderboardSet
        exampleGameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboardSet);
        // to get back the GameCenterLeaderboardSet set earlier
        GameCenterLeaderboardSet testGameCenterLeaderboardSet = (GameCenterLeaderboardSet) exampleGameCenterLeaderboardSetMemberLocalizationsResponseIncludedInner.getActualInstance();
    }
}
```


