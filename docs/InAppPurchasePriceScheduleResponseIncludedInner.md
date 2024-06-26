

# InAppPurchasePriceScheduleResponseIncludedInner

## oneOf schemas
* [InAppPurchasePrice](InAppPurchasePrice.md)
* [InAppPurchaseV2](InAppPurchaseV2.md)
* [Territory](Territory.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.InAppPurchasePriceScheduleResponseIncludedInner;
import org.openapitools.client.model.InAppPurchasePrice;
import org.openapitools.client.model.InAppPurchaseV2;
import org.openapitools.client.model.Territory;

public class Example {
    public static void main(String[] args) {
        InAppPurchasePriceScheduleResponseIncludedInner exampleInAppPurchasePriceScheduleResponseIncludedInner = new InAppPurchasePriceScheduleResponseIncludedInner();

        // create a new InAppPurchasePrice
        InAppPurchasePrice exampleInAppPurchasePrice = new InAppPurchasePrice();
        // set InAppPurchasePriceScheduleResponseIncludedInner to InAppPurchasePrice
        exampleInAppPurchasePriceScheduleResponseIncludedInner.setActualInstance(exampleInAppPurchasePrice);
        // to get back the InAppPurchasePrice set earlier
        InAppPurchasePrice testInAppPurchasePrice = (InAppPurchasePrice) exampleInAppPurchasePriceScheduleResponseIncludedInner.getActualInstance();

        // create a new InAppPurchaseV2
        InAppPurchaseV2 exampleInAppPurchaseV2 = new InAppPurchaseV2();
        // set InAppPurchasePriceScheduleResponseIncludedInner to InAppPurchaseV2
        exampleInAppPurchasePriceScheduleResponseIncludedInner.setActualInstance(exampleInAppPurchaseV2);
        // to get back the InAppPurchaseV2 set earlier
        InAppPurchaseV2 testInAppPurchaseV2 = (InAppPurchaseV2) exampleInAppPurchasePriceScheduleResponseIncludedInner.getActualInstance();

        // create a new Territory
        Territory exampleTerritory = new Territory();
        // set InAppPurchasePriceScheduleResponseIncludedInner to Territory
        exampleInAppPurchasePriceScheduleResponseIncludedInner.setActualInstance(exampleTerritory);
        // to get back the Territory set earlier
        Territory testTerritory = (Territory) exampleInAppPurchasePriceScheduleResponseIncludedInner.getActualInstance();
    }
}
```


