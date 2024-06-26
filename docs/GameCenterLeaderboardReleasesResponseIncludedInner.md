

# GameCenterLeaderboardReleasesResponseIncludedInner

## oneOf schemas
* [GameCenterDetail](GameCenterDetail.md)
* [GameCenterLeaderboard](GameCenterLeaderboard.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.GameCenterLeaderboardReleasesResponseIncludedInner;
import org.openapitools.client.model.GameCenterDetail;
import org.openapitools.client.model.GameCenterLeaderboard;

public class Example {
    public static void main(String[] args) {
        GameCenterLeaderboardReleasesResponseIncludedInner exampleGameCenterLeaderboardReleasesResponseIncludedInner = new GameCenterLeaderboardReleasesResponseIncludedInner();

        // create a new GameCenterDetail
        GameCenterDetail exampleGameCenterDetail = new GameCenterDetail();
        // set GameCenterLeaderboardReleasesResponseIncludedInner to GameCenterDetail
        exampleGameCenterLeaderboardReleasesResponseIncludedInner.setActualInstance(exampleGameCenterDetail);
        // to get back the GameCenterDetail set earlier
        GameCenterDetail testGameCenterDetail = (GameCenterDetail) exampleGameCenterLeaderboardReleasesResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboard
        GameCenterLeaderboard exampleGameCenterLeaderboard = new GameCenterLeaderboard();
        // set GameCenterLeaderboardReleasesResponseIncludedInner to GameCenterLeaderboard
        exampleGameCenterLeaderboardReleasesResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboard);
        // to get back the GameCenterLeaderboard set earlier
        GameCenterLeaderboard testGameCenterLeaderboard = (GameCenterLeaderboard) exampleGameCenterLeaderboardReleasesResponseIncludedInner.getActualInstance();
    }
}
```


