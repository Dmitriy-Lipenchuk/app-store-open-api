

# AppCustomProductPageLocalizationsResponseIncludedInner

## oneOf schemas
* [AppCustomProductPageVersion](AppCustomProductPageVersion.md)
* [AppPreviewSet](AppPreviewSet.md)
* [AppScreenshotSet](AppScreenshotSet.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppCustomProductPageLocalizationsResponseIncludedInner;
import org.openapitools.client.model.AppCustomProductPageVersion;
import org.openapitools.client.model.AppPreviewSet;
import org.openapitools.client.model.AppScreenshotSet;

public class Example {
    public static void main(String[] args) {
        AppCustomProductPageLocalizationsResponseIncludedInner exampleAppCustomProductPageLocalizationsResponseIncludedInner = new AppCustomProductPageLocalizationsResponseIncludedInner();

        // create a new AppCustomProductPageVersion
        AppCustomProductPageVersion exampleAppCustomProductPageVersion = new AppCustomProductPageVersion();
        // set AppCustomProductPageLocalizationsResponseIncludedInner to AppCustomProductPageVersion
        exampleAppCustomProductPageLocalizationsResponseIncludedInner.setActualInstance(exampleAppCustomProductPageVersion);
        // to get back the AppCustomProductPageVersion set earlier
        AppCustomProductPageVersion testAppCustomProductPageVersion = (AppCustomProductPageVersion) exampleAppCustomProductPageLocalizationsResponseIncludedInner.getActualInstance();

        // create a new AppPreviewSet
        AppPreviewSet exampleAppPreviewSet = new AppPreviewSet();
        // set AppCustomProductPageLocalizationsResponseIncludedInner to AppPreviewSet
        exampleAppCustomProductPageLocalizationsResponseIncludedInner.setActualInstance(exampleAppPreviewSet);
        // to get back the AppPreviewSet set earlier
        AppPreviewSet testAppPreviewSet = (AppPreviewSet) exampleAppCustomProductPageLocalizationsResponseIncludedInner.getActualInstance();

        // create a new AppScreenshotSet
        AppScreenshotSet exampleAppScreenshotSet = new AppScreenshotSet();
        // set AppCustomProductPageLocalizationsResponseIncludedInner to AppScreenshotSet
        exampleAppCustomProductPageLocalizationsResponseIncludedInner.setActualInstance(exampleAppScreenshotSet);
        // to get back the AppScreenshotSet set earlier
        AppScreenshotSet testAppScreenshotSet = (AppScreenshotSet) exampleAppCustomProductPageLocalizationsResponseIncludedInner.getActualInstance();
    }
}
```


