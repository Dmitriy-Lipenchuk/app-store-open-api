

# CiBuildRunsResponseIncludedInner

## oneOf schemas
* [Build](Build.md)
* [CiProduct](CiProduct.md)
* [CiWorkflow](CiWorkflow.md)
* [ScmGitReference](ScmGitReference.md)
* [ScmPullRequest](ScmPullRequest.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.CiBuildRunsResponseIncludedInner;
import org.openapitools.client.model.Build;
import org.openapitools.client.model.CiProduct;
import org.openapitools.client.model.CiWorkflow;
import org.openapitools.client.model.ScmGitReference;
import org.openapitools.client.model.ScmPullRequest;

public class Example {
    public static void main(String[] args) {
        CiBuildRunsResponseIncludedInner exampleCiBuildRunsResponseIncludedInner = new CiBuildRunsResponseIncludedInner();

        // create a new Build
        Build exampleBuild = new Build();
        // set CiBuildRunsResponseIncludedInner to Build
        exampleCiBuildRunsResponseIncludedInner.setActualInstance(exampleBuild);
        // to get back the Build set earlier
        Build testBuild = (Build) exampleCiBuildRunsResponseIncludedInner.getActualInstance();

        // create a new CiProduct
        CiProduct exampleCiProduct = new CiProduct();
        // set CiBuildRunsResponseIncludedInner to CiProduct
        exampleCiBuildRunsResponseIncludedInner.setActualInstance(exampleCiProduct);
        // to get back the CiProduct set earlier
        CiProduct testCiProduct = (CiProduct) exampleCiBuildRunsResponseIncludedInner.getActualInstance();

        // create a new CiWorkflow
        CiWorkflow exampleCiWorkflow = new CiWorkflow();
        // set CiBuildRunsResponseIncludedInner to CiWorkflow
        exampleCiBuildRunsResponseIncludedInner.setActualInstance(exampleCiWorkflow);
        // to get back the CiWorkflow set earlier
        CiWorkflow testCiWorkflow = (CiWorkflow) exampleCiBuildRunsResponseIncludedInner.getActualInstance();

        // create a new ScmGitReference
        ScmGitReference exampleScmGitReference = new ScmGitReference();
        // set CiBuildRunsResponseIncludedInner to ScmGitReference
        exampleCiBuildRunsResponseIncludedInner.setActualInstance(exampleScmGitReference);
        // to get back the ScmGitReference set earlier
        ScmGitReference testScmGitReference = (ScmGitReference) exampleCiBuildRunsResponseIncludedInner.getActualInstance();

        // create a new ScmPullRequest
        ScmPullRequest exampleScmPullRequest = new ScmPullRequest();
        // set CiBuildRunsResponseIncludedInner to ScmPullRequest
        exampleCiBuildRunsResponseIncludedInner.setActualInstance(exampleScmPullRequest);
        // to get back the ScmPullRequest set earlier
        ScmPullRequest testScmPullRequest = (ScmPullRequest) exampleCiBuildRunsResponseIncludedInner.getActualInstance();
    }
}
```


