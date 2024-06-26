

# AppStoreVersionExperimentTreatmentsResponseIncludedInner

## oneOf schemas
* [AppStoreVersionExperiment](AppStoreVersionExperiment.md)
* [AppStoreVersionExperimentTreatmentLocalization](AppStoreVersionExperimentTreatmentLocalization.md)
* [AppStoreVersionExperimentV2](AppStoreVersionExperimentV2.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppStoreVersionExperimentTreatmentsResponseIncludedInner;
import org.openapitools.client.model.AppStoreVersionExperiment;
import org.openapitools.client.model.AppStoreVersionExperimentTreatmentLocalization;
import org.openapitools.client.model.AppStoreVersionExperimentV2;

public class Example {
    public static void main(String[] args) {
        AppStoreVersionExperimentTreatmentsResponseIncludedInner exampleAppStoreVersionExperimentTreatmentsResponseIncludedInner = new AppStoreVersionExperimentTreatmentsResponseIncludedInner();

        // create a new AppStoreVersionExperiment
        AppStoreVersionExperiment exampleAppStoreVersionExperiment = new AppStoreVersionExperiment();
        // set AppStoreVersionExperimentTreatmentsResponseIncludedInner to AppStoreVersionExperiment
        exampleAppStoreVersionExperimentTreatmentsResponseIncludedInner.setActualInstance(exampleAppStoreVersionExperiment);
        // to get back the AppStoreVersionExperiment set earlier
        AppStoreVersionExperiment testAppStoreVersionExperiment = (AppStoreVersionExperiment) exampleAppStoreVersionExperimentTreatmentsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersionExperimentTreatmentLocalization
        AppStoreVersionExperimentTreatmentLocalization exampleAppStoreVersionExperimentTreatmentLocalization = new AppStoreVersionExperimentTreatmentLocalization();
        // set AppStoreVersionExperimentTreatmentsResponseIncludedInner to AppStoreVersionExperimentTreatmentLocalization
        exampleAppStoreVersionExperimentTreatmentsResponseIncludedInner.setActualInstance(exampleAppStoreVersionExperimentTreatmentLocalization);
        // to get back the AppStoreVersionExperimentTreatmentLocalization set earlier
        AppStoreVersionExperimentTreatmentLocalization testAppStoreVersionExperimentTreatmentLocalization = (AppStoreVersionExperimentTreatmentLocalization) exampleAppStoreVersionExperimentTreatmentsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersionExperimentV2
        AppStoreVersionExperimentV2 exampleAppStoreVersionExperimentV2 = new AppStoreVersionExperimentV2();
        // set AppStoreVersionExperimentTreatmentsResponseIncludedInner to AppStoreVersionExperimentV2
        exampleAppStoreVersionExperimentTreatmentsResponseIncludedInner.setActualInstance(exampleAppStoreVersionExperimentV2);
        // to get back the AppStoreVersionExperimentV2 set earlier
        AppStoreVersionExperimentV2 testAppStoreVersionExperimentV2 = (AppStoreVersionExperimentV2) exampleAppStoreVersionExperimentTreatmentsResponseIncludedInner.getActualInstance();
    }
}
```


