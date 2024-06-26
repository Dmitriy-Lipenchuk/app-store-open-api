

# GameCenterAppVersionsResponseIncludedInner

## oneOf schemas
* [AppStoreVersion](AppStoreVersion.md)
* [GameCenterAppVersion](GameCenterAppVersion.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.GameCenterAppVersionsResponseIncludedInner;
import org.openapitools.client.model.AppStoreVersion;
import org.openapitools.client.model.GameCenterAppVersion;

public class Example {
    public static void main(String[] args) {
        GameCenterAppVersionsResponseIncludedInner exampleGameCenterAppVersionsResponseIncludedInner = new GameCenterAppVersionsResponseIncludedInner();

        // create a new AppStoreVersion
        AppStoreVersion exampleAppStoreVersion = new AppStoreVersion();
        // set GameCenterAppVersionsResponseIncludedInner to AppStoreVersion
        exampleGameCenterAppVersionsResponseIncludedInner.setActualInstance(exampleAppStoreVersion);
        // to get back the AppStoreVersion set earlier
        AppStoreVersion testAppStoreVersion = (AppStoreVersion) exampleGameCenterAppVersionsResponseIncludedInner.getActualInstance();

        // create a new GameCenterAppVersion
        GameCenterAppVersion exampleGameCenterAppVersion = new GameCenterAppVersion();
        // set GameCenterAppVersionsResponseIncludedInner to GameCenterAppVersion
        exampleGameCenterAppVersionsResponseIncludedInner.setActualInstance(exampleGameCenterAppVersion);
        // to get back the GameCenterAppVersion set earlier
        GameCenterAppVersion testGameCenterAppVersion = (GameCenterAppVersion) exampleGameCenterAppVersionsResponseIncludedInner.getActualInstance();
    }
}
```


