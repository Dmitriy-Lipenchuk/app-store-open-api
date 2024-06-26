

# BundleIdsResponseIncludedInner

## oneOf schemas
* [App](App.md)
* [BundleIdCapability](BundleIdCapability.md)
* [Profile](Profile.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.BundleIdsResponseIncludedInner;
import org.openapitools.client.model.App;
import org.openapitools.client.model.BundleIdCapability;
import org.openapitools.client.model.Profile;

public class Example {
    public static void main(String[] args) {
        BundleIdsResponseIncludedInner exampleBundleIdsResponseIncludedInner = new BundleIdsResponseIncludedInner();

        // create a new App
        App exampleApp = new App();
        // set BundleIdsResponseIncludedInner to App
        exampleBundleIdsResponseIncludedInner.setActualInstance(exampleApp);
        // to get back the App set earlier
        App testApp = (App) exampleBundleIdsResponseIncludedInner.getActualInstance();

        // create a new BundleIdCapability
        BundleIdCapability exampleBundleIdCapability = new BundleIdCapability();
        // set BundleIdsResponseIncludedInner to BundleIdCapability
        exampleBundleIdsResponseIncludedInner.setActualInstance(exampleBundleIdCapability);
        // to get back the BundleIdCapability set earlier
        BundleIdCapability testBundleIdCapability = (BundleIdCapability) exampleBundleIdsResponseIncludedInner.getActualInstance();

        // create a new Profile
        Profile exampleProfile = new Profile();
        // set BundleIdsResponseIncludedInner to Profile
        exampleBundleIdsResponseIncludedInner.setActualInstance(exampleProfile);
        // to get back the Profile set earlier
        Profile testProfile = (Profile) exampleBundleIdsResponseIncludedInner.getActualInstance();
    }
}
```


