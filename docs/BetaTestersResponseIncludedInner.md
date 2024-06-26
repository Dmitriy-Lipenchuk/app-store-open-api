

# BetaTestersResponseIncludedInner

## oneOf schemas
* [App](App.md)
* [BetaGroup](BetaGroup.md)
* [Build](Build.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.BetaTestersResponseIncludedInner;
import org.openapitools.client.model.App;
import org.openapitools.client.model.BetaGroup;
import org.openapitools.client.model.Build;

public class Example {
    public static void main(String[] args) {
        BetaTestersResponseIncludedInner exampleBetaTestersResponseIncludedInner = new BetaTestersResponseIncludedInner();

        // create a new App
        App exampleApp = new App();
        // set BetaTestersResponseIncludedInner to App
        exampleBetaTestersResponseIncludedInner.setActualInstance(exampleApp);
        // to get back the App set earlier
        App testApp = (App) exampleBetaTestersResponseIncludedInner.getActualInstance();

        // create a new BetaGroup
        BetaGroup exampleBetaGroup = new BetaGroup();
        // set BetaTestersResponseIncludedInner to BetaGroup
        exampleBetaTestersResponseIncludedInner.setActualInstance(exampleBetaGroup);
        // to get back the BetaGroup set earlier
        BetaGroup testBetaGroup = (BetaGroup) exampleBetaTestersResponseIncludedInner.getActualInstance();

        // create a new Build
        Build exampleBuild = new Build();
        // set BetaTestersResponseIncludedInner to Build
        exampleBetaTestersResponseIncludedInner.setActualInstance(exampleBuild);
        // to get back the Build set earlier
        Build testBuild = (Build) exampleBetaTestersResponseIncludedInner.getActualInstance();
    }
}
```


