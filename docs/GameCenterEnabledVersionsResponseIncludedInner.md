

# GameCenterEnabledVersionsResponseIncludedInner

## oneOf schemas
* [App](App.md)
* [GameCenterEnabledVersion](GameCenterEnabledVersion.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.GameCenterEnabledVersionsResponseIncludedInner;
import org.openapitools.client.model.App;
import org.openapitools.client.model.GameCenterEnabledVersion;

public class Example {
    public static void main(String[] args) {
        GameCenterEnabledVersionsResponseIncludedInner exampleGameCenterEnabledVersionsResponseIncludedInner = new GameCenterEnabledVersionsResponseIncludedInner();

        // create a new App
        App exampleApp = new App();
        // set GameCenterEnabledVersionsResponseIncludedInner to App
        exampleGameCenterEnabledVersionsResponseIncludedInner.setActualInstance(exampleApp);
        // to get back the App set earlier
        App testApp = (App) exampleGameCenterEnabledVersionsResponseIncludedInner.getActualInstance();

        // create a new GameCenterEnabledVersion
        GameCenterEnabledVersion exampleGameCenterEnabledVersion = new GameCenterEnabledVersion();
        // set GameCenterEnabledVersionsResponseIncludedInner to GameCenterEnabledVersion
        exampleGameCenterEnabledVersionsResponseIncludedInner.setActualInstance(exampleGameCenterEnabledVersion);
        // to get back the GameCenterEnabledVersion set earlier
        GameCenterEnabledVersion testGameCenterEnabledVersion = (GameCenterEnabledVersion) exampleGameCenterEnabledVersionsResponseIncludedInner.getActualInstance();
    }
}
```


