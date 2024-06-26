

# InAppPurchasePriceScheduleCreateRequestIncludedInner

## oneOf schemas
* [InAppPurchasePriceInlineCreate](InAppPurchasePriceInlineCreate.md)
* [TerritoryInlineCreate](TerritoryInlineCreate.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.InAppPurchasePriceScheduleCreateRequestIncludedInner;
import org.openapitools.client.model.InAppPurchasePriceInlineCreate;
import org.openapitools.client.model.TerritoryInlineCreate;

public class Example {
    public static void main(String[] args) {
        InAppPurchasePriceScheduleCreateRequestIncludedInner exampleInAppPurchasePriceScheduleCreateRequestIncludedInner = new InAppPurchasePriceScheduleCreateRequestIncludedInner();

        // create a new InAppPurchasePriceInlineCreate
        InAppPurchasePriceInlineCreate exampleInAppPurchasePriceInlineCreate = new InAppPurchasePriceInlineCreate();
        // set InAppPurchasePriceScheduleCreateRequestIncludedInner to InAppPurchasePriceInlineCreate
        exampleInAppPurchasePriceScheduleCreateRequestIncludedInner.setActualInstance(exampleInAppPurchasePriceInlineCreate);
        // to get back the InAppPurchasePriceInlineCreate set earlier
        InAppPurchasePriceInlineCreate testInAppPurchasePriceInlineCreate = (InAppPurchasePriceInlineCreate) exampleInAppPurchasePriceScheduleCreateRequestIncludedInner.getActualInstance();

        // create a new TerritoryInlineCreate
        TerritoryInlineCreate exampleTerritoryInlineCreate = new TerritoryInlineCreate();
        // set InAppPurchasePriceScheduleCreateRequestIncludedInner to TerritoryInlineCreate
        exampleInAppPurchasePriceScheduleCreateRequestIncludedInner.setActualInstance(exampleTerritoryInlineCreate);
        // to get back the TerritoryInlineCreate set earlier
        TerritoryInlineCreate testTerritoryInlineCreate = (TerritoryInlineCreate) exampleInAppPurchasePriceScheduleCreateRequestIncludedInner.getActualInstance();
    }
}
```


