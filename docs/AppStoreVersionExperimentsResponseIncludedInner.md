

# AppStoreVersionExperimentsResponseIncludedInner

## oneOf schemas
* [AppStoreVersion](AppStoreVersion.md)
* [AppStoreVersionExperimentTreatment](AppStoreVersionExperimentTreatment.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppStoreVersionExperimentsResponseIncludedInner;
import org.openapitools.client.model.AppStoreVersion;
import org.openapitools.client.model.AppStoreVersionExperimentTreatment;

public class Example {
    public static void main(String[] args) {
        AppStoreVersionExperimentsResponseIncludedInner exampleAppStoreVersionExperimentsResponseIncludedInner = new AppStoreVersionExperimentsResponseIncludedInner();

        // create a new AppStoreVersion
        AppStoreVersion exampleAppStoreVersion = new AppStoreVersion();
        // set AppStoreVersionExperimentsResponseIncludedInner to AppStoreVersion
        exampleAppStoreVersionExperimentsResponseIncludedInner.setActualInstance(exampleAppStoreVersion);
        // to get back the AppStoreVersion set earlier
        AppStoreVersion testAppStoreVersion = (AppStoreVersion) exampleAppStoreVersionExperimentsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersionExperimentTreatment
        AppStoreVersionExperimentTreatment exampleAppStoreVersionExperimentTreatment = new AppStoreVersionExperimentTreatment();
        // set AppStoreVersionExperimentsResponseIncludedInner to AppStoreVersionExperimentTreatment
        exampleAppStoreVersionExperimentsResponseIncludedInner.setActualInstance(exampleAppStoreVersionExperimentTreatment);
        // to get back the AppStoreVersionExperimentTreatment set earlier
        AppStoreVersionExperimentTreatment testAppStoreVersionExperimentTreatment = (AppStoreVersionExperimentTreatment) exampleAppStoreVersionExperimentsResponseIncludedInner.getActualInstance();
    }
}
```


