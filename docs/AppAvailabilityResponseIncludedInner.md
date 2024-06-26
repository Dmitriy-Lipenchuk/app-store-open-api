

# AppAvailabilityResponseIncludedInner

## oneOf schemas
* [App](App.md)
* [Territory](Territory.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppAvailabilityResponseIncludedInner;
import org.openapitools.client.model.App;
import org.openapitools.client.model.Territory;

public class Example {
    public static void main(String[] args) {
        AppAvailabilityResponseIncludedInner exampleAppAvailabilityResponseIncludedInner = new AppAvailabilityResponseIncludedInner();

        // create a new App
        App exampleApp = new App();
        // set AppAvailabilityResponseIncludedInner to App
        exampleAppAvailabilityResponseIncludedInner.setActualInstance(exampleApp);
        // to get back the App set earlier
        App testApp = (App) exampleAppAvailabilityResponseIncludedInner.getActualInstance();

        // create a new Territory
        Territory exampleTerritory = new Territory();
        // set AppAvailabilityResponseIncludedInner to Territory
        exampleAppAvailabilityResponseIncludedInner.setActualInstance(exampleTerritory);
        // to get back the Territory set earlier
        Territory testTerritory = (Territory) exampleAppAvailabilityResponseIncludedInner.getActualInstance();
    }
}
```


