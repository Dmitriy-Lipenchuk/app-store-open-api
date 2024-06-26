

# CiWorkflowsResponseIncludedInner

## oneOf schemas
* [CiMacOsVersion](CiMacOsVersion.md)
* [CiProduct](CiProduct.md)
* [CiXcodeVersion](CiXcodeVersion.md)
* [ScmRepository](ScmRepository.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.CiWorkflowsResponseIncludedInner;
import org.openapitools.client.model.CiMacOsVersion;
import org.openapitools.client.model.CiProduct;
import org.openapitools.client.model.CiXcodeVersion;
import org.openapitools.client.model.ScmRepository;

public class Example {
    public static void main(String[] args) {
        CiWorkflowsResponseIncludedInner exampleCiWorkflowsResponseIncludedInner = new CiWorkflowsResponseIncludedInner();

        // create a new CiMacOsVersion
        CiMacOsVersion exampleCiMacOsVersion = new CiMacOsVersion();
        // set CiWorkflowsResponseIncludedInner to CiMacOsVersion
        exampleCiWorkflowsResponseIncludedInner.setActualInstance(exampleCiMacOsVersion);
        // to get back the CiMacOsVersion set earlier
        CiMacOsVersion testCiMacOsVersion = (CiMacOsVersion) exampleCiWorkflowsResponseIncludedInner.getActualInstance();

        // create a new CiProduct
        CiProduct exampleCiProduct = new CiProduct();
        // set CiWorkflowsResponseIncludedInner to CiProduct
        exampleCiWorkflowsResponseIncludedInner.setActualInstance(exampleCiProduct);
        // to get back the CiProduct set earlier
        CiProduct testCiProduct = (CiProduct) exampleCiWorkflowsResponseIncludedInner.getActualInstance();

        // create a new CiXcodeVersion
        CiXcodeVersion exampleCiXcodeVersion = new CiXcodeVersion();
        // set CiWorkflowsResponseIncludedInner to CiXcodeVersion
        exampleCiWorkflowsResponseIncludedInner.setActualInstance(exampleCiXcodeVersion);
        // to get back the CiXcodeVersion set earlier
        CiXcodeVersion testCiXcodeVersion = (CiXcodeVersion) exampleCiWorkflowsResponseIncludedInner.getActualInstance();

        // create a new ScmRepository
        ScmRepository exampleScmRepository = new ScmRepository();
        // set CiWorkflowsResponseIncludedInner to ScmRepository
        exampleCiWorkflowsResponseIncludedInner.setActualInstance(exampleScmRepository);
        // to get back the ScmRepository set earlier
        ScmRepository testScmRepository = (ScmRepository) exampleCiWorkflowsResponseIncludedInner.getActualInstance();
    }
}
```


