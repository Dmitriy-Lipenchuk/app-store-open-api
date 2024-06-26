

# GameCenterLeaderboardLocalizationsResponseIncludedInner

## oneOf schemas
* [GameCenterLeaderboard](GameCenterLeaderboard.md)
* [GameCenterLeaderboardImage](GameCenterLeaderboardImage.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.GameCenterLeaderboardLocalizationsResponseIncludedInner;
import org.openapitools.client.model.GameCenterLeaderboard;
import org.openapitools.client.model.GameCenterLeaderboardImage;

public class Example {
    public static void main(String[] args) {
        GameCenterLeaderboardLocalizationsResponseIncludedInner exampleGameCenterLeaderboardLocalizationsResponseIncludedInner = new GameCenterLeaderboardLocalizationsResponseIncludedInner();

        // create a new GameCenterLeaderboard
        GameCenterLeaderboard exampleGameCenterLeaderboard = new GameCenterLeaderboard();
        // set GameCenterLeaderboardLocalizationsResponseIncludedInner to GameCenterLeaderboard
        exampleGameCenterLeaderboardLocalizationsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboard);
        // to get back the GameCenterLeaderboard set earlier
        GameCenterLeaderboard testGameCenterLeaderboard = (GameCenterLeaderboard) exampleGameCenterLeaderboardLocalizationsResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboardImage
        GameCenterLeaderboardImage exampleGameCenterLeaderboardImage = new GameCenterLeaderboardImage();
        // set GameCenterLeaderboardLocalizationsResponseIncludedInner to GameCenterLeaderboardImage
        exampleGameCenterLeaderboardLocalizationsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboardImage);
        // to get back the GameCenterLeaderboardImage set earlier
        GameCenterLeaderboardImage testGameCenterLeaderboardImage = (GameCenterLeaderboardImage) exampleGameCenterLeaderboardLocalizationsResponseIncludedInner.getActualInstance();
    }
}
```


