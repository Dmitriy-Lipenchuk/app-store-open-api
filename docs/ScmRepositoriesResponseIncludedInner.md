

# ScmRepositoriesResponseIncludedInner

## oneOf schemas
* [ScmGitReference](ScmGitReference.md)
* [ScmProvider](ScmProvider.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.ScmRepositoriesResponseIncludedInner;
import org.openapitools.client.model.ScmGitReference;
import org.openapitools.client.model.ScmProvider;

public class Example {
    public static void main(String[] args) {
        ScmRepositoriesResponseIncludedInner exampleScmRepositoriesResponseIncludedInner = new ScmRepositoriesResponseIncludedInner();

        // create a new ScmGitReference
        ScmGitReference exampleScmGitReference = new ScmGitReference();
        // set ScmRepositoriesResponseIncludedInner to ScmGitReference
        exampleScmRepositoriesResponseIncludedInner.setActualInstance(exampleScmGitReference);
        // to get back the ScmGitReference set earlier
        ScmGitReference testScmGitReference = (ScmGitReference) exampleScmRepositoriesResponseIncludedInner.getActualInstance();

        // create a new ScmProvider
        ScmProvider exampleScmProvider = new ScmProvider();
        // set ScmRepositoriesResponseIncludedInner to ScmProvider
        exampleScmRepositoriesResponseIncludedInner.setActualInstance(exampleScmProvider);
        // to get back the ScmProvider set earlier
        ScmProvider testScmProvider = (ScmProvider) exampleScmRepositoriesResponseIncludedInner.getActualInstance();
    }
}
```


