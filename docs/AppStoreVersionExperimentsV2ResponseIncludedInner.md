

# AppStoreVersionExperimentsV2ResponseIncludedInner

## oneOf schemas
* [App](App.md)
* [AppStoreVersion](AppStoreVersion.md)
* [AppStoreVersionExperimentTreatment](AppStoreVersionExperimentTreatment.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppStoreVersionExperimentsV2ResponseIncludedInner;
import org.openapitools.client.model.App;
import org.openapitools.client.model.AppStoreVersion;
import org.openapitools.client.model.AppStoreVersionExperimentTreatment;

public class Example {
    public static void main(String[] args) {
        AppStoreVersionExperimentsV2ResponseIncludedInner exampleAppStoreVersionExperimentsV2ResponseIncludedInner = new AppStoreVersionExperimentsV2ResponseIncludedInner();

        // create a new App
        App exampleApp = new App();
        // set AppStoreVersionExperimentsV2ResponseIncludedInner to App
        exampleAppStoreVersionExperimentsV2ResponseIncludedInner.setActualInstance(exampleApp);
        // to get back the App set earlier
        App testApp = (App) exampleAppStoreVersionExperimentsV2ResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersion
        AppStoreVersion exampleAppStoreVersion = new AppStoreVersion();
        // set AppStoreVersionExperimentsV2ResponseIncludedInner to AppStoreVersion
        exampleAppStoreVersionExperimentsV2ResponseIncludedInner.setActualInstance(exampleAppStoreVersion);
        // to get back the AppStoreVersion set earlier
        AppStoreVersion testAppStoreVersion = (AppStoreVersion) exampleAppStoreVersionExperimentsV2ResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersionExperimentTreatment
        AppStoreVersionExperimentTreatment exampleAppStoreVersionExperimentTreatment = new AppStoreVersionExperimentTreatment();
        // set AppStoreVersionExperimentsV2ResponseIncludedInner to AppStoreVersionExperimentTreatment
        exampleAppStoreVersionExperimentsV2ResponseIncludedInner.setActualInstance(exampleAppStoreVersionExperimentTreatment);
        // to get back the AppStoreVersionExperimentTreatment set earlier
        AppStoreVersionExperimentTreatment testAppStoreVersionExperimentTreatment = (AppStoreVersionExperimentTreatment) exampleAppStoreVersionExperimentsV2ResponseIncludedInner.getActualInstance();
    }
}
```


