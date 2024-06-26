

# SubscriptionOfferCodePricesResponseIncludedInner

## oneOf schemas
* [SubscriptionPricePoint](SubscriptionPricePoint.md)
* [Territory](Territory.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.SubscriptionOfferCodePricesResponseIncludedInner;
import org.openapitools.client.model.SubscriptionPricePoint;
import org.openapitools.client.model.Territory;

public class Example {
    public static void main(String[] args) {
        SubscriptionOfferCodePricesResponseIncludedInner exampleSubscriptionOfferCodePricesResponseIncludedInner = new SubscriptionOfferCodePricesResponseIncludedInner();

        // create a new SubscriptionPricePoint
        SubscriptionPricePoint exampleSubscriptionPricePoint = new SubscriptionPricePoint();
        // set SubscriptionOfferCodePricesResponseIncludedInner to SubscriptionPricePoint
        exampleSubscriptionOfferCodePricesResponseIncludedInner.setActualInstance(exampleSubscriptionPricePoint);
        // to get back the SubscriptionPricePoint set earlier
        SubscriptionPricePoint testSubscriptionPricePoint = (SubscriptionPricePoint) exampleSubscriptionOfferCodePricesResponseIncludedInner.getActualInstance();

        // create a new Territory
        Territory exampleTerritory = new Territory();
        // set SubscriptionOfferCodePricesResponseIncludedInner to Territory
        exampleSubscriptionOfferCodePricesResponseIncludedInner.setActualInstance(exampleTerritory);
        // to get back the Territory set earlier
        Territory testTerritory = (Territory) exampleSubscriptionOfferCodePricesResponseIncludedInner.getActualInstance();
    }
}
```


