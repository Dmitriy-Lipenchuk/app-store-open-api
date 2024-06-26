

# AppScreenshotSetsResponseIncludedInner

## oneOf schemas
* [AppCustomProductPageLocalization](AppCustomProductPageLocalization.md)
* [AppScreenshot](AppScreenshot.md)
* [AppStoreVersionExperimentTreatmentLocalization](AppStoreVersionExperimentTreatmentLocalization.md)
* [AppStoreVersionLocalization](AppStoreVersionLocalization.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppScreenshotSetsResponseIncludedInner;
import org.openapitools.client.model.AppCustomProductPageLocalization;
import org.openapitools.client.model.AppScreenshot;
import org.openapitools.client.model.AppStoreVersionExperimentTreatmentLocalization;
import org.openapitools.client.model.AppStoreVersionLocalization;

public class Example {
    public static void main(String[] args) {
        AppScreenshotSetsResponseIncludedInner exampleAppScreenshotSetsResponseIncludedInner = new AppScreenshotSetsResponseIncludedInner();

        // create a new AppCustomProductPageLocalization
        AppCustomProductPageLocalization exampleAppCustomProductPageLocalization = new AppCustomProductPageLocalization();
        // set AppScreenshotSetsResponseIncludedInner to AppCustomProductPageLocalization
        exampleAppScreenshotSetsResponseIncludedInner.setActualInstance(exampleAppCustomProductPageLocalization);
        // to get back the AppCustomProductPageLocalization set earlier
        AppCustomProductPageLocalization testAppCustomProductPageLocalization = (AppCustomProductPageLocalization) exampleAppScreenshotSetsResponseIncludedInner.getActualInstance();

        // create a new AppScreenshot
        AppScreenshot exampleAppScreenshot = new AppScreenshot();
        // set AppScreenshotSetsResponseIncludedInner to AppScreenshot
        exampleAppScreenshotSetsResponseIncludedInner.setActualInstance(exampleAppScreenshot);
        // to get back the AppScreenshot set earlier
        AppScreenshot testAppScreenshot = (AppScreenshot) exampleAppScreenshotSetsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersionExperimentTreatmentLocalization
        AppStoreVersionExperimentTreatmentLocalization exampleAppStoreVersionExperimentTreatmentLocalization = new AppStoreVersionExperimentTreatmentLocalization();
        // set AppScreenshotSetsResponseIncludedInner to AppStoreVersionExperimentTreatmentLocalization
        exampleAppScreenshotSetsResponseIncludedInner.setActualInstance(exampleAppStoreVersionExperimentTreatmentLocalization);
        // to get back the AppStoreVersionExperimentTreatmentLocalization set earlier
        AppStoreVersionExperimentTreatmentLocalization testAppStoreVersionExperimentTreatmentLocalization = (AppStoreVersionExperimentTreatmentLocalization) exampleAppScreenshotSetsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersionLocalization
        AppStoreVersionLocalization exampleAppStoreVersionLocalization = new AppStoreVersionLocalization();
        // set AppScreenshotSetsResponseIncludedInner to AppStoreVersionLocalization
        exampleAppScreenshotSetsResponseIncludedInner.setActualInstance(exampleAppStoreVersionLocalization);
        // to get back the AppStoreVersionLocalization set earlier
        AppStoreVersionLocalization testAppStoreVersionLocalization = (AppStoreVersionLocalization) exampleAppScreenshotSetsResponseIncludedInner.getActualInstance();
    }
}
```


