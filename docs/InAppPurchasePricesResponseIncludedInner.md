

# InAppPurchasePricesResponseIncludedInner

## oneOf schemas
* [InAppPurchasePricePoint](InAppPurchasePricePoint.md)
* [Territory](Territory.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.InAppPurchasePricesResponseIncludedInner;
import org.openapitools.client.model.InAppPurchasePricePoint;
import org.openapitools.client.model.Territory;

public class Example {
    public static void main(String[] args) {
        InAppPurchasePricesResponseIncludedInner exampleInAppPurchasePricesResponseIncludedInner = new InAppPurchasePricesResponseIncludedInner();

        // create a new InAppPurchasePricePoint
        InAppPurchasePricePoint exampleInAppPurchasePricePoint = new InAppPurchasePricePoint();
        // set InAppPurchasePricesResponseIncludedInner to InAppPurchasePricePoint
        exampleInAppPurchasePricesResponseIncludedInner.setActualInstance(exampleInAppPurchasePricePoint);
        // to get back the InAppPurchasePricePoint set earlier
        InAppPurchasePricePoint testInAppPurchasePricePoint = (InAppPurchasePricePoint) exampleInAppPurchasePricesResponseIncludedInner.getActualInstance();

        // create a new Territory
        Territory exampleTerritory = new Territory();
        // set InAppPurchasePricesResponseIncludedInner to Territory
        exampleInAppPurchasePricesResponseIncludedInner.setActualInstance(exampleTerritory);
        // to get back the Territory set earlier
        Territory testTerritory = (Territory) exampleInAppPurchasePricesResponseIncludedInner.getActualInstance();
    }
}
```


