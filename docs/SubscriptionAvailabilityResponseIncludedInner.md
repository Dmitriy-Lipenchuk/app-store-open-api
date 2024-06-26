

# SubscriptionAvailabilityResponseIncludedInner

## oneOf schemas
* [Subscription](Subscription.md)
* [Territory](Territory.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.SubscriptionAvailabilityResponseIncludedInner;
import org.openapitools.client.model.Subscription;
import org.openapitools.client.model.Territory;

public class Example {
    public static void main(String[] args) {
        SubscriptionAvailabilityResponseIncludedInner exampleSubscriptionAvailabilityResponseIncludedInner = new SubscriptionAvailabilityResponseIncludedInner();

        // create a new Subscription
        Subscription exampleSubscription = new Subscription();
        // set SubscriptionAvailabilityResponseIncludedInner to Subscription
        exampleSubscriptionAvailabilityResponseIncludedInner.setActualInstance(exampleSubscription);
        // to get back the Subscription set earlier
        Subscription testSubscription = (Subscription) exampleSubscriptionAvailabilityResponseIncludedInner.getActualInstance();

        // create a new Territory
        Territory exampleTerritory = new Territory();
        // set SubscriptionAvailabilityResponseIncludedInner to Territory
        exampleSubscriptionAvailabilityResponseIncludedInner.setActualInstance(exampleTerritory);
        // to get back the Territory set earlier
        Territory testTerritory = (Territory) exampleSubscriptionAvailabilityResponseIncludedInner.getActualInstance();
    }
}
```


