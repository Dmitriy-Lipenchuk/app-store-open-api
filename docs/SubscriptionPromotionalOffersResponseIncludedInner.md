

# SubscriptionPromotionalOffersResponseIncludedInner

## oneOf schemas
* [Subscription](Subscription.md)
* [SubscriptionPromotionalOfferPrice](SubscriptionPromotionalOfferPrice.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.SubscriptionPromotionalOffersResponseIncludedInner;
import org.openapitools.client.model.Subscription;
import org.openapitools.client.model.SubscriptionPromotionalOfferPrice;

public class Example {
    public static void main(String[] args) {
        SubscriptionPromotionalOffersResponseIncludedInner exampleSubscriptionPromotionalOffersResponseIncludedInner = new SubscriptionPromotionalOffersResponseIncludedInner();

        // create a new Subscription
        Subscription exampleSubscription = new Subscription();
        // set SubscriptionPromotionalOffersResponseIncludedInner to Subscription
        exampleSubscriptionPromotionalOffersResponseIncludedInner.setActualInstance(exampleSubscription);
        // to get back the Subscription set earlier
        Subscription testSubscription = (Subscription) exampleSubscriptionPromotionalOffersResponseIncludedInner.getActualInstance();

        // create a new SubscriptionPromotionalOfferPrice
        SubscriptionPromotionalOfferPrice exampleSubscriptionPromotionalOfferPrice = new SubscriptionPromotionalOfferPrice();
        // set SubscriptionPromotionalOffersResponseIncludedInner to SubscriptionPromotionalOfferPrice
        exampleSubscriptionPromotionalOffersResponseIncludedInner.setActualInstance(exampleSubscriptionPromotionalOfferPrice);
        // to get back the SubscriptionPromotionalOfferPrice set earlier
        SubscriptionPromotionalOfferPrice testSubscriptionPromotionalOfferPrice = (SubscriptionPromotionalOfferPrice) exampleSubscriptionPromotionalOffersResponseIncludedInner.getActualInstance();
    }
}
```


