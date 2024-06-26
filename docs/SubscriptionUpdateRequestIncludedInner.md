

# SubscriptionUpdateRequestIncludedInner

## oneOf schemas
* [SubscriptionIntroductoryOfferInlineCreate](SubscriptionIntroductoryOfferInlineCreate.md)
* [SubscriptionPriceInlineCreate](SubscriptionPriceInlineCreate.md)
* [SubscriptionPromotionalOfferInlineCreate](SubscriptionPromotionalOfferInlineCreate.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.SubscriptionUpdateRequestIncludedInner;
import org.openapitools.client.model.SubscriptionIntroductoryOfferInlineCreate;
import org.openapitools.client.model.SubscriptionPriceInlineCreate;
import org.openapitools.client.model.SubscriptionPromotionalOfferInlineCreate;

public class Example {
    public static void main(String[] args) {
        SubscriptionUpdateRequestIncludedInner exampleSubscriptionUpdateRequestIncludedInner = new SubscriptionUpdateRequestIncludedInner();

        // create a new SubscriptionIntroductoryOfferInlineCreate
        SubscriptionIntroductoryOfferInlineCreate exampleSubscriptionIntroductoryOfferInlineCreate = new SubscriptionIntroductoryOfferInlineCreate();
        // set SubscriptionUpdateRequestIncludedInner to SubscriptionIntroductoryOfferInlineCreate
        exampleSubscriptionUpdateRequestIncludedInner.setActualInstance(exampleSubscriptionIntroductoryOfferInlineCreate);
        // to get back the SubscriptionIntroductoryOfferInlineCreate set earlier
        SubscriptionIntroductoryOfferInlineCreate testSubscriptionIntroductoryOfferInlineCreate = (SubscriptionIntroductoryOfferInlineCreate) exampleSubscriptionUpdateRequestIncludedInner.getActualInstance();

        // create a new SubscriptionPriceInlineCreate
        SubscriptionPriceInlineCreate exampleSubscriptionPriceInlineCreate = new SubscriptionPriceInlineCreate();
        // set SubscriptionUpdateRequestIncludedInner to SubscriptionPriceInlineCreate
        exampleSubscriptionUpdateRequestIncludedInner.setActualInstance(exampleSubscriptionPriceInlineCreate);
        // to get back the SubscriptionPriceInlineCreate set earlier
        SubscriptionPriceInlineCreate testSubscriptionPriceInlineCreate = (SubscriptionPriceInlineCreate) exampleSubscriptionUpdateRequestIncludedInner.getActualInstance();

        // create a new SubscriptionPromotionalOfferInlineCreate
        SubscriptionPromotionalOfferInlineCreate exampleSubscriptionPromotionalOfferInlineCreate = new SubscriptionPromotionalOfferInlineCreate();
        // set SubscriptionUpdateRequestIncludedInner to SubscriptionPromotionalOfferInlineCreate
        exampleSubscriptionUpdateRequestIncludedInner.setActualInstance(exampleSubscriptionPromotionalOfferInlineCreate);
        // to get back the SubscriptionPromotionalOfferInlineCreate set earlier
        SubscriptionPromotionalOfferInlineCreate testSubscriptionPromotionalOfferInlineCreate = (SubscriptionPromotionalOfferInlineCreate) exampleSubscriptionUpdateRequestIncludedInner.getActualInstance();
    }
}
```


