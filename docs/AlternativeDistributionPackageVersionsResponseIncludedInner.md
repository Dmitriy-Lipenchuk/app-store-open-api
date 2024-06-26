

# AlternativeDistributionPackageVersionsResponseIncludedInner

## oneOf schemas
* [AlternativeDistributionPackage](AlternativeDistributionPackage.md)
* [AlternativeDistributionPackageDelta](AlternativeDistributionPackageDelta.md)
* [AlternativeDistributionPackageVariant](AlternativeDistributionPackageVariant.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AlternativeDistributionPackageVersionsResponseIncludedInner;
import org.openapitools.client.model.AlternativeDistributionPackage;
import org.openapitools.client.model.AlternativeDistributionPackageDelta;
import org.openapitools.client.model.AlternativeDistributionPackageVariant;

public class Example {
    public static void main(String[] args) {
        AlternativeDistributionPackageVersionsResponseIncludedInner exampleAlternativeDistributionPackageVersionsResponseIncludedInner = new AlternativeDistributionPackageVersionsResponseIncludedInner();

        // create a new AlternativeDistributionPackage
        AlternativeDistributionPackage exampleAlternativeDistributionPackage = new AlternativeDistributionPackage();
        // set AlternativeDistributionPackageVersionsResponseIncludedInner to AlternativeDistributionPackage
        exampleAlternativeDistributionPackageVersionsResponseIncludedInner.setActualInstance(exampleAlternativeDistributionPackage);
        // to get back the AlternativeDistributionPackage set earlier
        AlternativeDistributionPackage testAlternativeDistributionPackage = (AlternativeDistributionPackage) exampleAlternativeDistributionPackageVersionsResponseIncludedInner.getActualInstance();

        // create a new AlternativeDistributionPackageDelta
        AlternativeDistributionPackageDelta exampleAlternativeDistributionPackageDelta = new AlternativeDistributionPackageDelta();
        // set AlternativeDistributionPackageVersionsResponseIncludedInner to AlternativeDistributionPackageDelta
        exampleAlternativeDistributionPackageVersionsResponseIncludedInner.setActualInstance(exampleAlternativeDistributionPackageDelta);
        // to get back the AlternativeDistributionPackageDelta set earlier
        AlternativeDistributionPackageDelta testAlternativeDistributionPackageDelta = (AlternativeDistributionPackageDelta) exampleAlternativeDistributionPackageVersionsResponseIncludedInner.getActualInstance();

        // create a new AlternativeDistributionPackageVariant
        AlternativeDistributionPackageVariant exampleAlternativeDistributionPackageVariant = new AlternativeDistributionPackageVariant();
        // set AlternativeDistributionPackageVersionsResponseIncludedInner to AlternativeDistributionPackageVariant
        exampleAlternativeDistributionPackageVersionsResponseIncludedInner.setActualInstance(exampleAlternativeDistributionPackageVariant);
        // to get back the AlternativeDistributionPackageVariant set earlier
        AlternativeDistributionPackageVariant testAlternativeDistributionPackageVariant = (AlternativeDistributionPackageVariant) exampleAlternativeDistributionPackageVersionsResponseIncludedInner.getActualInstance();
    }
}
```


