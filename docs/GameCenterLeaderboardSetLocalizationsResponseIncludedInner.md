

# GameCenterLeaderboardSetLocalizationsResponseIncludedInner

## oneOf schemas
* [GameCenterLeaderboardSet](GameCenterLeaderboardSet.md)
* [GameCenterLeaderboardSetImage](GameCenterLeaderboardSetImage.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.GameCenterLeaderboardSetLocalizationsResponseIncludedInner;
import org.openapitools.client.model.GameCenterLeaderboardSet;
import org.openapitools.client.model.GameCenterLeaderboardSetImage;

public class Example {
    public static void main(String[] args) {
        GameCenterLeaderboardSetLocalizationsResponseIncludedInner exampleGameCenterLeaderboardSetLocalizationsResponseIncludedInner = new GameCenterLeaderboardSetLocalizationsResponseIncludedInner();

        // create a new GameCenterLeaderboardSet
        GameCenterLeaderboardSet exampleGameCenterLeaderboardSet = new GameCenterLeaderboardSet();
        // set GameCenterLeaderboardSetLocalizationsResponseIncludedInner to GameCenterLeaderboardSet
        exampleGameCenterLeaderboardSetLocalizationsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboardSet);
        // to get back the GameCenterLeaderboardSet set earlier
        GameCenterLeaderboardSet testGameCenterLeaderboardSet = (GameCenterLeaderboardSet) exampleGameCenterLeaderboardSetLocalizationsResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboardSetImage
        GameCenterLeaderboardSetImage exampleGameCenterLeaderboardSetImage = new GameCenterLeaderboardSetImage();
        // set GameCenterLeaderboardSetLocalizationsResponseIncludedInner to GameCenterLeaderboardSetImage
        exampleGameCenterLeaderboardSetLocalizationsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboardSetImage);
        // to get back the GameCenterLeaderboardSetImage set earlier
        GameCenterLeaderboardSetImage testGameCenterLeaderboardSetImage = (GameCenterLeaderboardSetImage) exampleGameCenterLeaderboardSetLocalizationsResponseIncludedInner.getActualInstance();
    }
}
```


