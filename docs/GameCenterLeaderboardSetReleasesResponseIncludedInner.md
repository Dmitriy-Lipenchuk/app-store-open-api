

# GameCenterLeaderboardSetReleasesResponseIncludedInner

## oneOf schemas
* [GameCenterDetail](GameCenterDetail.md)
* [GameCenterLeaderboardSet](GameCenterLeaderboardSet.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.GameCenterLeaderboardSetReleasesResponseIncludedInner;
import org.openapitools.client.model.GameCenterDetail;
import org.openapitools.client.model.GameCenterLeaderboardSet;

public class Example {
    public static void main(String[] args) {
        GameCenterLeaderboardSetReleasesResponseIncludedInner exampleGameCenterLeaderboardSetReleasesResponseIncludedInner = new GameCenterLeaderboardSetReleasesResponseIncludedInner();

        // create a new GameCenterDetail
        GameCenterDetail exampleGameCenterDetail = new GameCenterDetail();
        // set GameCenterLeaderboardSetReleasesResponseIncludedInner to GameCenterDetail
        exampleGameCenterLeaderboardSetReleasesResponseIncludedInner.setActualInstance(exampleGameCenterDetail);
        // to get back the GameCenterDetail set earlier
        GameCenterDetail testGameCenterDetail = (GameCenterDetail) exampleGameCenterLeaderboardSetReleasesResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboardSet
        GameCenterLeaderboardSet exampleGameCenterLeaderboardSet = new GameCenterLeaderboardSet();
        // set GameCenterLeaderboardSetReleasesResponseIncludedInner to GameCenterLeaderboardSet
        exampleGameCenterLeaderboardSetReleasesResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboardSet);
        // to get back the GameCenterLeaderboardSet set earlier
        GameCenterLeaderboardSet testGameCenterLeaderboardSet = (GameCenterLeaderboardSet) exampleGameCenterLeaderboardSetReleasesResponseIncludedInner.getActualInstance();
    }
}
```


