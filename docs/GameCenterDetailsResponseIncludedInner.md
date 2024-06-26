

# GameCenterDetailsResponseIncludedInner

## oneOf schemas
* [App](App.md)
* [GameCenterAchievement](GameCenterAchievement.md)
* [GameCenterAchievementRelease](GameCenterAchievementRelease.md)
* [GameCenterAppVersion](GameCenterAppVersion.md)
* [GameCenterGroup](GameCenterGroup.md)
* [GameCenterLeaderboard](GameCenterLeaderboard.md)
* [GameCenterLeaderboardRelease](GameCenterLeaderboardRelease.md)
* [GameCenterLeaderboardSet](GameCenterLeaderboardSet.md)
* [GameCenterLeaderboardSetRelease](GameCenterLeaderboardSetRelease.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.GameCenterDetailsResponseIncludedInner;
import org.openapitools.client.model.App;
import org.openapitools.client.model.GameCenterAchievement;
import org.openapitools.client.model.GameCenterAchievementRelease;
import org.openapitools.client.model.GameCenterAppVersion;
import org.openapitools.client.model.GameCenterGroup;
import org.openapitools.client.model.GameCenterLeaderboard;
import org.openapitools.client.model.GameCenterLeaderboardRelease;
import org.openapitools.client.model.GameCenterLeaderboardSet;
import org.openapitools.client.model.GameCenterLeaderboardSetRelease;

public class Example {
    public static void main(String[] args) {
        GameCenterDetailsResponseIncludedInner exampleGameCenterDetailsResponseIncludedInner = new GameCenterDetailsResponseIncludedInner();

        // create a new App
        App exampleApp = new App();
        // set GameCenterDetailsResponseIncludedInner to App
        exampleGameCenterDetailsResponseIncludedInner.setActualInstance(exampleApp);
        // to get back the App set earlier
        App testApp = (App) exampleGameCenterDetailsResponseIncludedInner.getActualInstance();

        // create a new GameCenterAchievement
        GameCenterAchievement exampleGameCenterAchievement = new GameCenterAchievement();
        // set GameCenterDetailsResponseIncludedInner to GameCenterAchievement
        exampleGameCenterDetailsResponseIncludedInner.setActualInstance(exampleGameCenterAchievement);
        // to get back the GameCenterAchievement set earlier
        GameCenterAchievement testGameCenterAchievement = (GameCenterAchievement) exampleGameCenterDetailsResponseIncludedInner.getActualInstance();

        // create a new GameCenterAchievementRelease
        GameCenterAchievementRelease exampleGameCenterAchievementRelease = new GameCenterAchievementRelease();
        // set GameCenterDetailsResponseIncludedInner to GameCenterAchievementRelease
        exampleGameCenterDetailsResponseIncludedInner.setActualInstance(exampleGameCenterAchievementRelease);
        // to get back the GameCenterAchievementRelease set earlier
        GameCenterAchievementRelease testGameCenterAchievementRelease = (GameCenterAchievementRelease) exampleGameCenterDetailsResponseIncludedInner.getActualInstance();

        // create a new GameCenterAppVersion
        GameCenterAppVersion exampleGameCenterAppVersion = new GameCenterAppVersion();
        // set GameCenterDetailsResponseIncludedInner to GameCenterAppVersion
        exampleGameCenterDetailsResponseIncludedInner.setActualInstance(exampleGameCenterAppVersion);
        // to get back the GameCenterAppVersion set earlier
        GameCenterAppVersion testGameCenterAppVersion = (GameCenterAppVersion) exampleGameCenterDetailsResponseIncludedInner.getActualInstance();

        // create a new GameCenterGroup
        GameCenterGroup exampleGameCenterGroup = new GameCenterGroup();
        // set GameCenterDetailsResponseIncludedInner to GameCenterGroup
        exampleGameCenterDetailsResponseIncludedInner.setActualInstance(exampleGameCenterGroup);
        // to get back the GameCenterGroup set earlier
        GameCenterGroup testGameCenterGroup = (GameCenterGroup) exampleGameCenterDetailsResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboard
        GameCenterLeaderboard exampleGameCenterLeaderboard = new GameCenterLeaderboard();
        // set GameCenterDetailsResponseIncludedInner to GameCenterLeaderboard
        exampleGameCenterDetailsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboard);
        // to get back the GameCenterLeaderboard set earlier
        GameCenterLeaderboard testGameCenterLeaderboard = (GameCenterLeaderboard) exampleGameCenterDetailsResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboardRelease
        GameCenterLeaderboardRelease exampleGameCenterLeaderboardRelease = new GameCenterLeaderboardRelease();
        // set GameCenterDetailsResponseIncludedInner to GameCenterLeaderboardRelease
        exampleGameCenterDetailsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboardRelease);
        // to get back the GameCenterLeaderboardRelease set earlier
        GameCenterLeaderboardRelease testGameCenterLeaderboardRelease = (GameCenterLeaderboardRelease) exampleGameCenterDetailsResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboardSet
        GameCenterLeaderboardSet exampleGameCenterLeaderboardSet = new GameCenterLeaderboardSet();
        // set GameCenterDetailsResponseIncludedInner to GameCenterLeaderboardSet
        exampleGameCenterDetailsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboardSet);
        // to get back the GameCenterLeaderboardSet set earlier
        GameCenterLeaderboardSet testGameCenterLeaderboardSet = (GameCenterLeaderboardSet) exampleGameCenterDetailsResponseIncludedInner.getActualInstance();

        // create a new GameCenterLeaderboardSetRelease
        GameCenterLeaderboardSetRelease exampleGameCenterLeaderboardSetRelease = new GameCenterLeaderboardSetRelease();
        // set GameCenterDetailsResponseIncludedInner to GameCenterLeaderboardSetRelease
        exampleGameCenterDetailsResponseIncludedInner.setActualInstance(exampleGameCenterLeaderboardSetRelease);
        // to get back the GameCenterLeaderboardSetRelease set earlier
        GameCenterLeaderboardSetRelease testGameCenterLeaderboardSetRelease = (GameCenterLeaderboardSetRelease) exampleGameCenterDetailsResponseIncludedInner.getActualInstance();
    }
}
```


