

# SubscriptionIntroductoryOffersResponseIncludedInner

## oneOf schemas
* [Subscription](Subscription.md)
* [SubscriptionPricePoint](SubscriptionPricePoint.md)
* [Territory](Territory.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.SubscriptionIntroductoryOffersResponseIncludedInner;
import org.openapitools.client.model.Subscription;
import org.openapitools.client.model.SubscriptionPricePoint;
import org.openapitools.client.model.Territory;

public class Example {
    public static void main(String[] args) {
        SubscriptionIntroductoryOffersResponseIncludedInner exampleSubscriptionIntroductoryOffersResponseIncludedInner = new SubscriptionIntroductoryOffersResponseIncludedInner();

        // create a new Subscription
        Subscription exampleSubscription = new Subscription();
        // set SubscriptionIntroductoryOffersResponseIncludedInner to Subscription
        exampleSubscriptionIntroductoryOffersResponseIncludedInner.setActualInstance(exampleSubscription);
        // to get back the Subscription set earlier
        Subscription testSubscription = (Subscription) exampleSubscriptionIntroductoryOffersResponseIncludedInner.getActualInstance();

        // create a new SubscriptionPricePoint
        SubscriptionPricePoint exampleSubscriptionPricePoint = new SubscriptionPricePoint();
        // set SubscriptionIntroductoryOffersResponseIncludedInner to SubscriptionPricePoint
        exampleSubscriptionIntroductoryOffersResponseIncludedInner.setActualInstance(exampleSubscriptionPricePoint);
        // to get back the SubscriptionPricePoint set earlier
        SubscriptionPricePoint testSubscriptionPricePoint = (SubscriptionPricePoint) exampleSubscriptionIntroductoryOffersResponseIncludedInner.getActualInstance();

        // create a new Territory
        Territory exampleTerritory = new Territory();
        // set SubscriptionIntroductoryOffersResponseIncludedInner to Territory
        exampleSubscriptionIntroductoryOffersResponseIncludedInner.setActualInstance(exampleTerritory);
        // to get back the Territory set earlier
        Territory testTerritory = (Territory) exampleSubscriptionIntroductoryOffersResponseIncludedInner.getActualInstance();
    }
}
```


