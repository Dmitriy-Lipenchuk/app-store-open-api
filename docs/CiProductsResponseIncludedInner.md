

# CiProductsResponseIncludedInner

## oneOf schemas
* [App](App.md)
* [BundleId](BundleId.md)
* [ScmRepository](ScmRepository.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.CiProductsResponseIncludedInner;
import org.openapitools.client.model.App;
import org.openapitools.client.model.BundleId;
import org.openapitools.client.model.ScmRepository;

public class Example {
    public static void main(String[] args) {
        CiProductsResponseIncludedInner exampleCiProductsResponseIncludedInner = new CiProductsResponseIncludedInner();

        // create a new App
        App exampleApp = new App();
        // set CiProductsResponseIncludedInner to App
        exampleCiProductsResponseIncludedInner.setActualInstance(exampleApp);
        // to get back the App set earlier
        App testApp = (App) exampleCiProductsResponseIncludedInner.getActualInstance();

        // create a new BundleId
        BundleId exampleBundleId = new BundleId();
        // set CiProductsResponseIncludedInner to BundleId
        exampleCiProductsResponseIncludedInner.setActualInstance(exampleBundleId);
        // to get back the BundleId set earlier
        BundleId testBundleId = (BundleId) exampleCiProductsResponseIncludedInner.getActualInstance();

        // create a new ScmRepository
        ScmRepository exampleScmRepository = new ScmRepository();
        // set CiProductsResponseIncludedInner to ScmRepository
        exampleCiProductsResponseIncludedInner.setActualInstance(exampleScmRepository);
        // to get back the ScmRepository set earlier
        ScmRepository testScmRepository = (ScmRepository) exampleCiProductsResponseIncludedInner.getActualInstance();
    }
}
```


