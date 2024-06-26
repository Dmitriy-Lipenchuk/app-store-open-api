

# PreReleaseVersionsResponseIncludedInner

## oneOf schemas
* [App](App.md)
* [Build](Build.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.PreReleaseVersionsResponseIncludedInner;
import org.openapitools.client.model.App;
import org.openapitools.client.model.Build;

public class Example {
    public static void main(String[] args) {
        PreReleaseVersionsResponseIncludedInner examplePreReleaseVersionsResponseIncludedInner = new PreReleaseVersionsResponseIncludedInner();

        // create a new App
        App exampleApp = new App();
        // set PreReleaseVersionsResponseIncludedInner to App
        examplePreReleaseVersionsResponseIncludedInner.setActualInstance(exampleApp);
        // to get back the App set earlier
        App testApp = (App) examplePreReleaseVersionsResponseIncludedInner.getActualInstance();

        // create a new Build
        Build exampleBuild = new Build();
        // set PreReleaseVersionsResponseIncludedInner to Build
        examplePreReleaseVersionsResponseIncludedInner.setActualInstance(exampleBuild);
        // to get back the Build set earlier
        Build testBuild = (Build) examplePreReleaseVersionsResponseIncludedInner.getActualInstance();
    }
}
```


