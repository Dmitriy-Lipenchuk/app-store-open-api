

# SubscriptionOfferCodesResponseIncludedInner

## oneOf schemas
* [Subscription](Subscription.md)
* [SubscriptionOfferCodeCustomCode](SubscriptionOfferCodeCustomCode.md)
* [SubscriptionOfferCodeOneTimeUseCode](SubscriptionOfferCodeOneTimeUseCode.md)
* [SubscriptionOfferCodePrice](SubscriptionOfferCodePrice.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.SubscriptionOfferCodesResponseIncludedInner;
import org.openapitools.client.model.Subscription;
import org.openapitools.client.model.SubscriptionOfferCodeCustomCode;
import org.openapitools.client.model.SubscriptionOfferCodeOneTimeUseCode;
import org.openapitools.client.model.SubscriptionOfferCodePrice;

public class Example {
    public static void main(String[] args) {
        SubscriptionOfferCodesResponseIncludedInner exampleSubscriptionOfferCodesResponseIncludedInner = new SubscriptionOfferCodesResponseIncludedInner();

        // create a new Subscription
        Subscription exampleSubscription = new Subscription();
        // set SubscriptionOfferCodesResponseIncludedInner to Subscription
        exampleSubscriptionOfferCodesResponseIncludedInner.setActualInstance(exampleSubscription);
        // to get back the Subscription set earlier
        Subscription testSubscription = (Subscription) exampleSubscriptionOfferCodesResponseIncludedInner.getActualInstance();

        // create a new SubscriptionOfferCodeCustomCode
        SubscriptionOfferCodeCustomCode exampleSubscriptionOfferCodeCustomCode = new SubscriptionOfferCodeCustomCode();
        // set SubscriptionOfferCodesResponseIncludedInner to SubscriptionOfferCodeCustomCode
        exampleSubscriptionOfferCodesResponseIncludedInner.setActualInstance(exampleSubscriptionOfferCodeCustomCode);
        // to get back the SubscriptionOfferCodeCustomCode set earlier
        SubscriptionOfferCodeCustomCode testSubscriptionOfferCodeCustomCode = (SubscriptionOfferCodeCustomCode) exampleSubscriptionOfferCodesResponseIncludedInner.getActualInstance();

        // create a new SubscriptionOfferCodeOneTimeUseCode
        SubscriptionOfferCodeOneTimeUseCode exampleSubscriptionOfferCodeOneTimeUseCode = new SubscriptionOfferCodeOneTimeUseCode();
        // set SubscriptionOfferCodesResponseIncludedInner to SubscriptionOfferCodeOneTimeUseCode
        exampleSubscriptionOfferCodesResponseIncludedInner.setActualInstance(exampleSubscriptionOfferCodeOneTimeUseCode);
        // to get back the SubscriptionOfferCodeOneTimeUseCode set earlier
        SubscriptionOfferCodeOneTimeUseCode testSubscriptionOfferCodeOneTimeUseCode = (SubscriptionOfferCodeOneTimeUseCode) exampleSubscriptionOfferCodesResponseIncludedInner.getActualInstance();

        // create a new SubscriptionOfferCodePrice
        SubscriptionOfferCodePrice exampleSubscriptionOfferCodePrice = new SubscriptionOfferCodePrice();
        // set SubscriptionOfferCodesResponseIncludedInner to SubscriptionOfferCodePrice
        exampleSubscriptionOfferCodesResponseIncludedInner.setActualInstance(exampleSubscriptionOfferCodePrice);
        // to get back the SubscriptionOfferCodePrice set earlier
        SubscriptionOfferCodePrice testSubscriptionOfferCodePrice = (SubscriptionOfferCodePrice) exampleSubscriptionOfferCodesResponseIncludedInner.getActualInstance();
    }
}
```


