

# AppPriceScheduleCreateRequestIncludedInner

## oneOf schemas
* [AppPriceV2InlineCreate](AppPriceV2InlineCreate.md)
* [TerritoryInlineCreate](TerritoryInlineCreate.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppPriceScheduleCreateRequestIncludedInner;
import org.openapitools.client.model.AppPriceV2InlineCreate;
import org.openapitools.client.model.TerritoryInlineCreate;

public class Example {
    public static void main(String[] args) {
        AppPriceScheduleCreateRequestIncludedInner exampleAppPriceScheduleCreateRequestIncludedInner = new AppPriceScheduleCreateRequestIncludedInner();

        // create a new AppPriceV2InlineCreate
        AppPriceV2InlineCreate exampleAppPriceV2InlineCreate = new AppPriceV2InlineCreate();
        // set AppPriceScheduleCreateRequestIncludedInner to AppPriceV2InlineCreate
        exampleAppPriceScheduleCreateRequestIncludedInner.setActualInstance(exampleAppPriceV2InlineCreate);
        // to get back the AppPriceV2InlineCreate set earlier
        AppPriceV2InlineCreate testAppPriceV2InlineCreate = (AppPriceV2InlineCreate) exampleAppPriceScheduleCreateRequestIncludedInner.getActualInstance();

        // create a new TerritoryInlineCreate
        TerritoryInlineCreate exampleTerritoryInlineCreate = new TerritoryInlineCreate();
        // set AppPriceScheduleCreateRequestIncludedInner to TerritoryInlineCreate
        exampleAppPriceScheduleCreateRequestIncludedInner.setActualInstance(exampleTerritoryInlineCreate);
        // to get back the TerritoryInlineCreate set earlier
        TerritoryInlineCreate testTerritoryInlineCreate = (TerritoryInlineCreate) exampleAppPriceScheduleCreateRequestIncludedInner.getActualInstance();
    }
}
```


