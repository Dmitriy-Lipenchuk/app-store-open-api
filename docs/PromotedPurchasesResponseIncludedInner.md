

# PromotedPurchasesResponseIncludedInner

## oneOf schemas
* [InAppPurchaseV2](InAppPurchaseV2.md)
* [PromotedPurchaseImage](PromotedPurchaseImage.md)
* [Subscription](Subscription.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.PromotedPurchasesResponseIncludedInner;
import org.openapitools.client.model.InAppPurchaseV2;
import org.openapitools.client.model.PromotedPurchaseImage;
import org.openapitools.client.model.Subscription;

public class Example {
    public static void main(String[] args) {
        PromotedPurchasesResponseIncludedInner examplePromotedPurchasesResponseIncludedInner = new PromotedPurchasesResponseIncludedInner();

        // create a new InAppPurchaseV2
        InAppPurchaseV2 exampleInAppPurchaseV2 = new InAppPurchaseV2();
        // set PromotedPurchasesResponseIncludedInner to InAppPurchaseV2
        examplePromotedPurchasesResponseIncludedInner.setActualInstance(exampleInAppPurchaseV2);
        // to get back the InAppPurchaseV2 set earlier
        InAppPurchaseV2 testInAppPurchaseV2 = (InAppPurchaseV2) examplePromotedPurchasesResponseIncludedInner.getActualInstance();

        // create a new PromotedPurchaseImage
        PromotedPurchaseImage examplePromotedPurchaseImage = new PromotedPurchaseImage();
        // set PromotedPurchasesResponseIncludedInner to PromotedPurchaseImage
        examplePromotedPurchasesResponseIncludedInner.setActualInstance(examplePromotedPurchaseImage);
        // to get back the PromotedPurchaseImage set earlier
        PromotedPurchaseImage testPromotedPurchaseImage = (PromotedPurchaseImage) examplePromotedPurchasesResponseIncludedInner.getActualInstance();

        // create a new Subscription
        Subscription exampleSubscription = new Subscription();
        // set PromotedPurchasesResponseIncludedInner to Subscription
        examplePromotedPurchasesResponseIncludedInner.setActualInstance(exampleSubscription);
        // to get back the Subscription set earlier
        Subscription testSubscription = (Subscription) examplePromotedPurchasesResponseIncludedInner.getActualInstance();
    }
}
```


