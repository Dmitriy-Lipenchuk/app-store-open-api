

# AppPriceScheduleResponseIncludedInner

## oneOf schemas
* [App](App.md)
* [AppPriceV2](AppPriceV2.md)
* [Territory](Territory.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppPriceScheduleResponseIncludedInner;
import org.openapitools.client.model.App;
import org.openapitools.client.model.AppPriceV2;
import org.openapitools.client.model.Territory;

public class Example {
    public static void main(String[] args) {
        AppPriceScheduleResponseIncludedInner exampleAppPriceScheduleResponseIncludedInner = new AppPriceScheduleResponseIncludedInner();

        // create a new App
        App exampleApp = new App();
        // set AppPriceScheduleResponseIncludedInner to App
        exampleAppPriceScheduleResponseIncludedInner.setActualInstance(exampleApp);
        // to get back the App set earlier
        App testApp = (App) exampleAppPriceScheduleResponseIncludedInner.getActualInstance();

        // create a new AppPriceV2
        AppPriceV2 exampleAppPriceV2 = new AppPriceV2();
        // set AppPriceScheduleResponseIncludedInner to AppPriceV2
        exampleAppPriceScheduleResponseIncludedInner.setActualInstance(exampleAppPriceV2);
        // to get back the AppPriceV2 set earlier
        AppPriceV2 testAppPriceV2 = (AppPriceV2) exampleAppPriceScheduleResponseIncludedInner.getActualInstance();

        // create a new Territory
        Territory exampleTerritory = new Territory();
        // set AppPriceScheduleResponseIncludedInner to Territory
        exampleAppPriceScheduleResponseIncludedInner.setActualInstance(exampleTerritory);
        // to get back the Territory set earlier
        Territory testTerritory = (Territory) exampleAppPriceScheduleResponseIncludedInner.getActualInstance();
    }
}
```


