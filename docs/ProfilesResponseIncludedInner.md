

# ProfilesResponseIncludedInner

## oneOf schemas
* [BundleId](BundleId.md)
* [Certificate](Certificate.md)
* [Device](Device.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.ProfilesResponseIncludedInner;
import org.openapitools.client.model.BundleId;
import org.openapitools.client.model.Certificate;
import org.openapitools.client.model.Device;

public class Example {
    public static void main(String[] args) {
        ProfilesResponseIncludedInner exampleProfilesResponseIncludedInner = new ProfilesResponseIncludedInner();

        // create a new BundleId
        BundleId exampleBundleId = new BundleId();
        // set ProfilesResponseIncludedInner to BundleId
        exampleProfilesResponseIncludedInner.setActualInstance(exampleBundleId);
        // to get back the BundleId set earlier
        BundleId testBundleId = (BundleId) exampleProfilesResponseIncludedInner.getActualInstance();

        // create a new Certificate
        Certificate exampleCertificate = new Certificate();
        // set ProfilesResponseIncludedInner to Certificate
        exampleProfilesResponseIncludedInner.setActualInstance(exampleCertificate);
        // to get back the Certificate set earlier
        Certificate testCertificate = (Certificate) exampleProfilesResponseIncludedInner.getActualInstance();

        // create a new Device
        Device exampleDevice = new Device();
        // set ProfilesResponseIncludedInner to Device
        exampleProfilesResponseIncludedInner.setActualInstance(exampleDevice);
        // to get back the Device set earlier
        Device testDevice = (Device) exampleProfilesResponseIncludedInner.getActualInstance();
    }
}
```


