

# GameCenterAchievementLocalizationsResponseIncludedInner

## oneOf schemas
* [GameCenterAchievement](GameCenterAchievement.md)
* [GameCenterAchievementImage](GameCenterAchievementImage.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.GameCenterAchievementLocalizationsResponseIncludedInner;
import org.openapitools.client.model.GameCenterAchievement;
import org.openapitools.client.model.GameCenterAchievementImage;

public class Example {
    public static void main(String[] args) {
        GameCenterAchievementLocalizationsResponseIncludedInner exampleGameCenterAchievementLocalizationsResponseIncludedInner = new GameCenterAchievementLocalizationsResponseIncludedInner();

        // create a new GameCenterAchievement
        GameCenterAchievement exampleGameCenterAchievement = new GameCenterAchievement();
        // set GameCenterAchievementLocalizationsResponseIncludedInner to GameCenterAchievement
        exampleGameCenterAchievementLocalizationsResponseIncludedInner.setActualInstance(exampleGameCenterAchievement);
        // to get back the GameCenterAchievement set earlier
        GameCenterAchievement testGameCenterAchievement = (GameCenterAchievement) exampleGameCenterAchievementLocalizationsResponseIncludedInner.getActualInstance();

        // create a new GameCenterAchievementImage
        GameCenterAchievementImage exampleGameCenterAchievementImage = new GameCenterAchievementImage();
        // set GameCenterAchievementLocalizationsResponseIncludedInner to GameCenterAchievementImage
        exampleGameCenterAchievementLocalizationsResponseIncludedInner.setActualInstance(exampleGameCenterAchievementImage);
        // to get back the GameCenterAchievementImage set earlier
        GameCenterAchievementImage testGameCenterAchievementImage = (GameCenterAchievementImage) exampleGameCenterAchievementLocalizationsResponseIncludedInner.getActualInstance();
    }
}
```


