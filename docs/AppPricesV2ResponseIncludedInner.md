

# AppPricesV2ResponseIncludedInner

## oneOf schemas
* [AppPricePointV3](AppPricePointV3.md)
* [Territory](Territory.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppPricesV2ResponseIncludedInner;
import org.openapitools.client.model.AppPricePointV3;
import org.openapitools.client.model.Territory;

public class Example {
    public static void main(String[] args) {
        AppPricesV2ResponseIncludedInner exampleAppPricesV2ResponseIncludedInner = new AppPricesV2ResponseIncludedInner();

        // create a new AppPricePointV3
        AppPricePointV3 exampleAppPricePointV3 = new AppPricePointV3();
        // set AppPricesV2ResponseIncludedInner to AppPricePointV3
        exampleAppPricesV2ResponseIncludedInner.setActualInstance(exampleAppPricePointV3);
        // to get back the AppPricePointV3 set earlier
        AppPricePointV3 testAppPricePointV3 = (AppPricePointV3) exampleAppPricesV2ResponseIncludedInner.getActualInstance();

        // create a new Territory
        Territory exampleTerritory = new Territory();
        // set AppPricesV2ResponseIncludedInner to Territory
        exampleAppPricesV2ResponseIncludedInner.setActualInstance(exampleTerritory);
        // to get back the Territory set earlier
        Territory testTerritory = (Territory) exampleAppPricesV2ResponseIncludedInner.getActualInstance();
    }
}
```


