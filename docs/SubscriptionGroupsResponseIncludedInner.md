

# SubscriptionGroupsResponseIncludedInner

## oneOf schemas
* [Subscription](Subscription.md)
* [SubscriptionGroupLocalization](SubscriptionGroupLocalization.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.SubscriptionGroupsResponseIncludedInner;
import org.openapitools.client.model.Subscription;
import org.openapitools.client.model.SubscriptionGroupLocalization;

public class Example {
    public static void main(String[] args) {
        SubscriptionGroupsResponseIncludedInner exampleSubscriptionGroupsResponseIncludedInner = new SubscriptionGroupsResponseIncludedInner();

        // create a new Subscription
        Subscription exampleSubscription = new Subscription();
        // set SubscriptionGroupsResponseIncludedInner to Subscription
        exampleSubscriptionGroupsResponseIncludedInner.setActualInstance(exampleSubscription);
        // to get back the Subscription set earlier
        Subscription testSubscription = (Subscription) exampleSubscriptionGroupsResponseIncludedInner.getActualInstance();

        // create a new SubscriptionGroupLocalization
        SubscriptionGroupLocalization exampleSubscriptionGroupLocalization = new SubscriptionGroupLocalization();
        // set SubscriptionGroupsResponseIncludedInner to SubscriptionGroupLocalization
        exampleSubscriptionGroupsResponseIncludedInner.setActualInstance(exampleSubscriptionGroupLocalization);
        // to get back the SubscriptionGroupLocalization set earlier
        SubscriptionGroupLocalization testSubscriptionGroupLocalization = (SubscriptionGroupLocalization) exampleSubscriptionGroupsResponseIncludedInner.getActualInstance();
    }
}
```


