

# AppStoreVersionLocalizationsResponseIncludedInner

## oneOf schemas
* [AppPreviewSet](AppPreviewSet.md)
* [AppScreenshotSet](AppScreenshotSet.md)
* [AppStoreVersion](AppStoreVersion.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppStoreVersionLocalizationsResponseIncludedInner;
import org.openapitools.client.model.AppPreviewSet;
import org.openapitools.client.model.AppScreenshotSet;
import org.openapitools.client.model.AppStoreVersion;

public class Example {
    public static void main(String[] args) {
        AppStoreVersionLocalizationsResponseIncludedInner exampleAppStoreVersionLocalizationsResponseIncludedInner = new AppStoreVersionLocalizationsResponseIncludedInner();

        // create a new AppPreviewSet
        AppPreviewSet exampleAppPreviewSet = new AppPreviewSet();
        // set AppStoreVersionLocalizationsResponseIncludedInner to AppPreviewSet
        exampleAppStoreVersionLocalizationsResponseIncludedInner.setActualInstance(exampleAppPreviewSet);
        // to get back the AppPreviewSet set earlier
        AppPreviewSet testAppPreviewSet = (AppPreviewSet) exampleAppStoreVersionLocalizationsResponseIncludedInner.getActualInstance();

        // create a new AppScreenshotSet
        AppScreenshotSet exampleAppScreenshotSet = new AppScreenshotSet();
        // set AppStoreVersionLocalizationsResponseIncludedInner to AppScreenshotSet
        exampleAppStoreVersionLocalizationsResponseIncludedInner.setActualInstance(exampleAppScreenshotSet);
        // to get back the AppScreenshotSet set earlier
        AppScreenshotSet testAppScreenshotSet = (AppScreenshotSet) exampleAppStoreVersionLocalizationsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersion
        AppStoreVersion exampleAppStoreVersion = new AppStoreVersion();
        // set AppStoreVersionLocalizationsResponseIncludedInner to AppStoreVersion
        exampleAppStoreVersionLocalizationsResponseIncludedInner.setActualInstance(exampleAppStoreVersion);
        // to get back the AppStoreVersion set earlier
        AppStoreVersion testAppStoreVersion = (AppStoreVersion) exampleAppStoreVersionLocalizationsResponseIncludedInner.getActualInstance();
    }
}
```


