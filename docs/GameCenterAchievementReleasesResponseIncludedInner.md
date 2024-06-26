

# GameCenterAchievementReleasesResponseIncludedInner

## oneOf schemas
* [GameCenterAchievement](GameCenterAchievement.md)
* [GameCenterDetail](GameCenterDetail.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.GameCenterAchievementReleasesResponseIncludedInner;
import org.openapitools.client.model.GameCenterAchievement;
import org.openapitools.client.model.GameCenterDetail;

public class Example {
    public static void main(String[] args) {
        GameCenterAchievementReleasesResponseIncludedInner exampleGameCenterAchievementReleasesResponseIncludedInner = new GameCenterAchievementReleasesResponseIncludedInner();

        // create a new GameCenterAchievement
        GameCenterAchievement exampleGameCenterAchievement = new GameCenterAchievement();
        // set GameCenterAchievementReleasesResponseIncludedInner to GameCenterAchievement
        exampleGameCenterAchievementReleasesResponseIncludedInner.setActualInstance(exampleGameCenterAchievement);
        // to get back the GameCenterAchievement set earlier
        GameCenterAchievement testGameCenterAchievement = (GameCenterAchievement) exampleGameCenterAchievementReleasesResponseIncludedInner.getActualInstance();

        // create a new GameCenterDetail
        GameCenterDetail exampleGameCenterDetail = new GameCenterDetail();
        // set GameCenterAchievementReleasesResponseIncludedInner to GameCenterDetail
        exampleGameCenterAchievementReleasesResponseIncludedInner.setActualInstance(exampleGameCenterDetail);
        // to get back the GameCenterDetail set earlier
        GameCenterDetail testGameCenterDetail = (GameCenterDetail) exampleGameCenterAchievementReleasesResponseIncludedInner.getActualInstance();
    }
}
```


