

# ReviewSubmissionItemsResponseIncludedInner

## oneOf schemas
* [AppCustomProductPageVersion](AppCustomProductPageVersion.md)
* [AppEvent](AppEvent.md)
* [AppStoreVersion](AppStoreVersion.md)
* [AppStoreVersionExperiment](AppStoreVersionExperiment.md)
* [AppStoreVersionExperimentV2](AppStoreVersionExperimentV2.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.ReviewSubmissionItemsResponseIncludedInner;
import org.openapitools.client.model.AppCustomProductPageVersion;
import org.openapitools.client.model.AppEvent;
import org.openapitools.client.model.AppStoreVersion;
import org.openapitools.client.model.AppStoreVersionExperiment;
import org.openapitools.client.model.AppStoreVersionExperimentV2;

public class Example {
    public static void main(String[] args) {
        ReviewSubmissionItemsResponseIncludedInner exampleReviewSubmissionItemsResponseIncludedInner = new ReviewSubmissionItemsResponseIncludedInner();

        // create a new AppCustomProductPageVersion
        AppCustomProductPageVersion exampleAppCustomProductPageVersion = new AppCustomProductPageVersion();
        // set ReviewSubmissionItemsResponseIncludedInner to AppCustomProductPageVersion
        exampleReviewSubmissionItemsResponseIncludedInner.setActualInstance(exampleAppCustomProductPageVersion);
        // to get back the AppCustomProductPageVersion set earlier
        AppCustomProductPageVersion testAppCustomProductPageVersion = (AppCustomProductPageVersion) exampleReviewSubmissionItemsResponseIncludedInner.getActualInstance();

        // create a new AppEvent
        AppEvent exampleAppEvent = new AppEvent();
        // set ReviewSubmissionItemsResponseIncludedInner to AppEvent
        exampleReviewSubmissionItemsResponseIncludedInner.setActualInstance(exampleAppEvent);
        // to get back the AppEvent set earlier
        AppEvent testAppEvent = (AppEvent) exampleReviewSubmissionItemsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersion
        AppStoreVersion exampleAppStoreVersion = new AppStoreVersion();
        // set ReviewSubmissionItemsResponseIncludedInner to AppStoreVersion
        exampleReviewSubmissionItemsResponseIncludedInner.setActualInstance(exampleAppStoreVersion);
        // to get back the AppStoreVersion set earlier
        AppStoreVersion testAppStoreVersion = (AppStoreVersion) exampleReviewSubmissionItemsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersionExperiment
        AppStoreVersionExperiment exampleAppStoreVersionExperiment = new AppStoreVersionExperiment();
        // set ReviewSubmissionItemsResponseIncludedInner to AppStoreVersionExperiment
        exampleReviewSubmissionItemsResponseIncludedInner.setActualInstance(exampleAppStoreVersionExperiment);
        // to get back the AppStoreVersionExperiment set earlier
        AppStoreVersionExperiment testAppStoreVersionExperiment = (AppStoreVersionExperiment) exampleReviewSubmissionItemsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersionExperimentV2
        AppStoreVersionExperimentV2 exampleAppStoreVersionExperimentV2 = new AppStoreVersionExperimentV2();
        // set ReviewSubmissionItemsResponseIncludedInner to AppStoreVersionExperimentV2
        exampleReviewSubmissionItemsResponseIncludedInner.setActualInstance(exampleAppStoreVersionExperimentV2);
        // to get back the AppStoreVersionExperimentV2 set earlier
        AppStoreVersionExperimentV2 testAppStoreVersionExperimentV2 = (AppStoreVersionExperimentV2) exampleReviewSubmissionItemsResponseIncludedInner.getActualInstance();
    }
}
```


