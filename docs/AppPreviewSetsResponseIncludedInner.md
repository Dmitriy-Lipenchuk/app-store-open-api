

# AppPreviewSetsResponseIncludedInner

## oneOf schemas
* [AppCustomProductPageLocalization](AppCustomProductPageLocalization.md)
* [AppPreview](AppPreview.md)
* [AppStoreVersionExperimentTreatmentLocalization](AppStoreVersionExperimentTreatmentLocalization.md)
* [AppStoreVersionLocalization](AppStoreVersionLocalization.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppPreviewSetsResponseIncludedInner;
import org.openapitools.client.model.AppCustomProductPageLocalization;
import org.openapitools.client.model.AppPreview;
import org.openapitools.client.model.AppStoreVersionExperimentTreatmentLocalization;
import org.openapitools.client.model.AppStoreVersionLocalization;

public class Example {
    public static void main(String[] args) {
        AppPreviewSetsResponseIncludedInner exampleAppPreviewSetsResponseIncludedInner = new AppPreviewSetsResponseIncludedInner();

        // create a new AppCustomProductPageLocalization
        AppCustomProductPageLocalization exampleAppCustomProductPageLocalization = new AppCustomProductPageLocalization();
        // set AppPreviewSetsResponseIncludedInner to AppCustomProductPageLocalization
        exampleAppPreviewSetsResponseIncludedInner.setActualInstance(exampleAppCustomProductPageLocalization);
        // to get back the AppCustomProductPageLocalization set earlier
        AppCustomProductPageLocalization testAppCustomProductPageLocalization = (AppCustomProductPageLocalization) exampleAppPreviewSetsResponseIncludedInner.getActualInstance();

        // create a new AppPreview
        AppPreview exampleAppPreview = new AppPreview();
        // set AppPreviewSetsResponseIncludedInner to AppPreview
        exampleAppPreviewSetsResponseIncludedInner.setActualInstance(exampleAppPreview);
        // to get back the AppPreview set earlier
        AppPreview testAppPreview = (AppPreview) exampleAppPreviewSetsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersionExperimentTreatmentLocalization
        AppStoreVersionExperimentTreatmentLocalization exampleAppStoreVersionExperimentTreatmentLocalization = new AppStoreVersionExperimentTreatmentLocalization();
        // set AppPreviewSetsResponseIncludedInner to AppStoreVersionExperimentTreatmentLocalization
        exampleAppPreviewSetsResponseIncludedInner.setActualInstance(exampleAppStoreVersionExperimentTreatmentLocalization);
        // to get back the AppStoreVersionExperimentTreatmentLocalization set earlier
        AppStoreVersionExperimentTreatmentLocalization testAppStoreVersionExperimentTreatmentLocalization = (AppStoreVersionExperimentTreatmentLocalization) exampleAppPreviewSetsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersionLocalization
        AppStoreVersionLocalization exampleAppStoreVersionLocalization = new AppStoreVersionLocalization();
        // set AppPreviewSetsResponseIncludedInner to AppStoreVersionLocalization
        exampleAppPreviewSetsResponseIncludedInner.setActualInstance(exampleAppStoreVersionLocalization);
        // to get back the AppStoreVersionLocalization set earlier
        AppStoreVersionLocalization testAppStoreVersionLocalization = (AppStoreVersionLocalization) exampleAppPreviewSetsResponseIncludedInner.getActualInstance();
    }
}
```


