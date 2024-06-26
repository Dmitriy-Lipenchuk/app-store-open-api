

# AppStoreVersionExperimentTreatmentLocalizationsResponseIncludedInner

## oneOf schemas
* [AppPreviewSet](AppPreviewSet.md)
* [AppScreenshotSet](AppScreenshotSet.md)
* [AppStoreVersionExperimentTreatment](AppStoreVersionExperimentTreatment.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppStoreVersionExperimentTreatmentLocalizationsResponseIncludedInner;
import org.openapitools.client.model.AppPreviewSet;
import org.openapitools.client.model.AppScreenshotSet;
import org.openapitools.client.model.AppStoreVersionExperimentTreatment;

public class Example {
    public static void main(String[] args) {
        AppStoreVersionExperimentTreatmentLocalizationsResponseIncludedInner exampleAppStoreVersionExperimentTreatmentLocalizationsResponseIncludedInner = new AppStoreVersionExperimentTreatmentLocalizationsResponseIncludedInner();

        // create a new AppPreviewSet
        AppPreviewSet exampleAppPreviewSet = new AppPreviewSet();
        // set AppStoreVersionExperimentTreatmentLocalizationsResponseIncludedInner to AppPreviewSet
        exampleAppStoreVersionExperimentTreatmentLocalizationsResponseIncludedInner.setActualInstance(exampleAppPreviewSet);
        // to get back the AppPreviewSet set earlier
        AppPreviewSet testAppPreviewSet = (AppPreviewSet) exampleAppStoreVersionExperimentTreatmentLocalizationsResponseIncludedInner.getActualInstance();

        // create a new AppScreenshotSet
        AppScreenshotSet exampleAppScreenshotSet = new AppScreenshotSet();
        // set AppStoreVersionExperimentTreatmentLocalizationsResponseIncludedInner to AppScreenshotSet
        exampleAppStoreVersionExperimentTreatmentLocalizationsResponseIncludedInner.setActualInstance(exampleAppScreenshotSet);
        // to get back the AppScreenshotSet set earlier
        AppScreenshotSet testAppScreenshotSet = (AppScreenshotSet) exampleAppStoreVersionExperimentTreatmentLocalizationsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersionExperimentTreatment
        AppStoreVersionExperimentTreatment exampleAppStoreVersionExperimentTreatment = new AppStoreVersionExperimentTreatment();
        // set AppStoreVersionExperimentTreatmentLocalizationsResponseIncludedInner to AppStoreVersionExperimentTreatment
        exampleAppStoreVersionExperimentTreatmentLocalizationsResponseIncludedInner.setActualInstance(exampleAppStoreVersionExperimentTreatment);
        // to get back the AppStoreVersionExperimentTreatment set earlier
        AppStoreVersionExperimentTreatment testAppStoreVersionExperimentTreatment = (AppStoreVersionExperimentTreatment) exampleAppStoreVersionExperimentTreatmentLocalizationsResponseIncludedInner.getActualInstance();
    }
}
```


