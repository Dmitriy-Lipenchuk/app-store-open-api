

# BetaGroupsResponseIncludedInner

## oneOf schemas
* [App](App.md)
* [BetaTester](BetaTester.md)
* [Build](Build.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.BetaGroupsResponseIncludedInner;
import org.openapitools.client.model.App;
import org.openapitools.client.model.BetaTester;
import org.openapitools.client.model.Build;

public class Example {
    public static void main(String[] args) {
        BetaGroupsResponseIncludedInner exampleBetaGroupsResponseIncludedInner = new BetaGroupsResponseIncludedInner();

        // create a new App
        App exampleApp = new App();
        // set BetaGroupsResponseIncludedInner to App
        exampleBetaGroupsResponseIncludedInner.setActualInstance(exampleApp);
        // to get back the App set earlier
        App testApp = (App) exampleBetaGroupsResponseIncludedInner.getActualInstance();

        // create a new BetaTester
        BetaTester exampleBetaTester = new BetaTester();
        // set BetaGroupsResponseIncludedInner to BetaTester
        exampleBetaGroupsResponseIncludedInner.setActualInstance(exampleBetaTester);
        // to get back the BetaTester set earlier
        BetaTester testBetaTester = (BetaTester) exampleBetaGroupsResponseIncludedInner.getActualInstance();

        // create a new Build
        Build exampleBuild = new Build();
        // set BetaGroupsResponseIncludedInner to Build
        exampleBetaGroupsResponseIncludedInner.setActualInstance(exampleBuild);
        // to get back the Build set earlier
        Build testBuild = (Build) exampleBetaGroupsResponseIncludedInner.getActualInstance();
    }
}
```


