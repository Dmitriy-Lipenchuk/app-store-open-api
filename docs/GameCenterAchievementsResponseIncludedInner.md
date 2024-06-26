

# GameCenterAchievementsResponseIncludedInner

## oneOf schemas
* [GameCenterAchievement](GameCenterAchievement.md)
* [GameCenterAchievementLocalization](GameCenterAchievementLocalization.md)
* [GameCenterAchievementRelease](GameCenterAchievementRelease.md)
* [GameCenterDetail](GameCenterDetail.md)
* [GameCenterGroup](GameCenterGroup.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.GameCenterAchievementsResponseIncludedInner;
import org.openapitools.client.model.GameCenterAchievement;
import org.openapitools.client.model.GameCenterAchievementLocalization;
import org.openapitools.client.model.GameCenterAchievementRelease;
import org.openapitools.client.model.GameCenterDetail;
import org.openapitools.client.model.GameCenterGroup;

public class Example {
    public static void main(String[] args) {
        GameCenterAchievementsResponseIncludedInner exampleGameCenterAchievementsResponseIncludedInner = new GameCenterAchievementsResponseIncludedInner();

        // create a new GameCenterAchievement
        GameCenterAchievement exampleGameCenterAchievement = new GameCenterAchievement();
        // set GameCenterAchievementsResponseIncludedInner to GameCenterAchievement
        exampleGameCenterAchievementsResponseIncludedInner.setActualInstance(exampleGameCenterAchievement);
        // to get back the GameCenterAchievement set earlier
        GameCenterAchievement testGameCenterAchievement = (GameCenterAchievement) exampleGameCenterAchievementsResponseIncludedInner.getActualInstance();

        // create a new GameCenterAchievementLocalization
        GameCenterAchievementLocalization exampleGameCenterAchievementLocalization = new GameCenterAchievementLocalization();
        // set GameCenterAchievementsResponseIncludedInner to GameCenterAchievementLocalization
        exampleGameCenterAchievementsResponseIncludedInner.setActualInstance(exampleGameCenterAchievementLocalization);
        // to get back the GameCenterAchievementLocalization set earlier
        GameCenterAchievementLocalization testGameCenterAchievementLocalization = (GameCenterAchievementLocalization) exampleGameCenterAchievementsResponseIncludedInner.getActualInstance();

        // create a new GameCenterAchievementRelease
        GameCenterAchievementRelease exampleGameCenterAchievementRelease = new GameCenterAchievementRelease();
        // set GameCenterAchievementsResponseIncludedInner to GameCenterAchievementRelease
        exampleGameCenterAchievementsResponseIncludedInner.setActualInstance(exampleGameCenterAchievementRelease);
        // to get back the GameCenterAchievementRelease set earlier
        GameCenterAchievementRelease testGameCenterAchievementRelease = (GameCenterAchievementRelease) exampleGameCenterAchievementsResponseIncludedInner.getActualInstance();

        // create a new GameCenterDetail
        GameCenterDetail exampleGameCenterDetail = new GameCenterDetail();
        // set GameCenterAchievementsResponseIncludedInner to GameCenterDetail
        exampleGameCenterAchievementsResponseIncludedInner.setActualInstance(exampleGameCenterDetail);
        // to get back the GameCenterDetail set earlier
        GameCenterDetail testGameCenterDetail = (GameCenterDetail) exampleGameCenterAchievementsResponseIncludedInner.getActualInstance();

        // create a new GameCenterGroup
        GameCenterGroup exampleGameCenterGroup = new GameCenterGroup();
        // set GameCenterAchievementsResponseIncludedInner to GameCenterGroup
        exampleGameCenterAchievementsResponseIncludedInner.setActualInstance(exampleGameCenterGroup);
        // to get back the GameCenterGroup set earlier
        GameCenterGroup testGameCenterGroup = (GameCenterGroup) exampleGameCenterAchievementsResponseIncludedInner.getActualInstance();
    }
}
```


