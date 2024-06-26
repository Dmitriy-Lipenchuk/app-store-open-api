

# InAppPurchasesV2ResponseIncludedInner

## oneOf schemas
* [InAppPurchaseAppStoreReviewScreenshot](InAppPurchaseAppStoreReviewScreenshot.md)
* [InAppPurchaseAvailability](InAppPurchaseAvailability.md)
* [InAppPurchaseContent](InAppPurchaseContent.md)
* [InAppPurchaseLocalization](InAppPurchaseLocalization.md)
* [InAppPurchasePricePoint](InAppPurchasePricePoint.md)
* [InAppPurchasePriceSchedule](InAppPurchasePriceSchedule.md)
* [PromotedPurchase](PromotedPurchase.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.InAppPurchasesV2ResponseIncludedInner;
import org.openapitools.client.model.InAppPurchaseAppStoreReviewScreenshot;
import org.openapitools.client.model.InAppPurchaseAvailability;
import org.openapitools.client.model.InAppPurchaseContent;
import org.openapitools.client.model.InAppPurchaseLocalization;
import org.openapitools.client.model.InAppPurchasePricePoint;
import org.openapitools.client.model.InAppPurchasePriceSchedule;
import org.openapitools.client.model.PromotedPurchase;

public class Example {
    public static void main(String[] args) {
        InAppPurchasesV2ResponseIncludedInner exampleInAppPurchasesV2ResponseIncludedInner = new InAppPurchasesV2ResponseIncludedInner();

        // create a new InAppPurchaseAppStoreReviewScreenshot
        InAppPurchaseAppStoreReviewScreenshot exampleInAppPurchaseAppStoreReviewScreenshot = new InAppPurchaseAppStoreReviewScreenshot();
        // set InAppPurchasesV2ResponseIncludedInner to InAppPurchaseAppStoreReviewScreenshot
        exampleInAppPurchasesV2ResponseIncludedInner.setActualInstance(exampleInAppPurchaseAppStoreReviewScreenshot);
        // to get back the InAppPurchaseAppStoreReviewScreenshot set earlier
        InAppPurchaseAppStoreReviewScreenshot testInAppPurchaseAppStoreReviewScreenshot = (InAppPurchaseAppStoreReviewScreenshot) exampleInAppPurchasesV2ResponseIncludedInner.getActualInstance();

        // create a new InAppPurchaseAvailability
        InAppPurchaseAvailability exampleInAppPurchaseAvailability = new InAppPurchaseAvailability();
        // set InAppPurchasesV2ResponseIncludedInner to InAppPurchaseAvailability
        exampleInAppPurchasesV2ResponseIncludedInner.setActualInstance(exampleInAppPurchaseAvailability);
        // to get back the InAppPurchaseAvailability set earlier
        InAppPurchaseAvailability testInAppPurchaseAvailability = (InAppPurchaseAvailability) exampleInAppPurchasesV2ResponseIncludedInner.getActualInstance();

        // create a new InAppPurchaseContent
        InAppPurchaseContent exampleInAppPurchaseContent = new InAppPurchaseContent();
        // set InAppPurchasesV2ResponseIncludedInner to InAppPurchaseContent
        exampleInAppPurchasesV2ResponseIncludedInner.setActualInstance(exampleInAppPurchaseContent);
        // to get back the InAppPurchaseContent set earlier
        InAppPurchaseContent testInAppPurchaseContent = (InAppPurchaseContent) exampleInAppPurchasesV2ResponseIncludedInner.getActualInstance();

        // create a new InAppPurchaseLocalization
        InAppPurchaseLocalization exampleInAppPurchaseLocalization = new InAppPurchaseLocalization();
        // set InAppPurchasesV2ResponseIncludedInner to InAppPurchaseLocalization
        exampleInAppPurchasesV2ResponseIncludedInner.setActualInstance(exampleInAppPurchaseLocalization);
        // to get back the InAppPurchaseLocalization set earlier
        InAppPurchaseLocalization testInAppPurchaseLocalization = (InAppPurchaseLocalization) exampleInAppPurchasesV2ResponseIncludedInner.getActualInstance();

        // create a new InAppPurchasePricePoint
        InAppPurchasePricePoint exampleInAppPurchasePricePoint = new InAppPurchasePricePoint();
        // set InAppPurchasesV2ResponseIncludedInner to InAppPurchasePricePoint
        exampleInAppPurchasesV2ResponseIncludedInner.setActualInstance(exampleInAppPurchasePricePoint);
        // to get back the InAppPurchasePricePoint set earlier
        InAppPurchasePricePoint testInAppPurchasePricePoint = (InAppPurchasePricePoint) exampleInAppPurchasesV2ResponseIncludedInner.getActualInstance();

        // create a new InAppPurchasePriceSchedule
        InAppPurchasePriceSchedule exampleInAppPurchasePriceSchedule = new InAppPurchasePriceSchedule();
        // set InAppPurchasesV2ResponseIncludedInner to InAppPurchasePriceSchedule
        exampleInAppPurchasesV2ResponseIncludedInner.setActualInstance(exampleInAppPurchasePriceSchedule);
        // to get back the InAppPurchasePriceSchedule set earlier
        InAppPurchasePriceSchedule testInAppPurchasePriceSchedule = (InAppPurchasePriceSchedule) exampleInAppPurchasesV2ResponseIncludedInner.getActualInstance();

        // create a new PromotedPurchase
        PromotedPurchase examplePromotedPurchase = new PromotedPurchase();
        // set InAppPurchasesV2ResponseIncludedInner to PromotedPurchase
        exampleInAppPurchasesV2ResponseIncludedInner.setActualInstance(examplePromotedPurchase);
        // to get back the PromotedPurchase set earlier
        PromotedPurchase testPromotedPurchase = (PromotedPurchase) exampleInAppPurchasesV2ResponseIncludedInner.getActualInstance();
    }
}
```


