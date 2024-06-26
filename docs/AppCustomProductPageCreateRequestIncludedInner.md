

# AppCustomProductPageCreateRequestIncludedInner

## oneOf schemas
* [AppCustomProductPageLocalizationInlineCreate](AppCustomProductPageLocalizationInlineCreate.md)
* [AppCustomProductPageVersionInlineCreate](AppCustomProductPageVersionInlineCreate.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppCustomProductPageCreateRequestIncludedInner;
import org.openapitools.client.model.AppCustomProductPageLocalizationInlineCreate;
import org.openapitools.client.model.AppCustomProductPageVersionInlineCreate;

public class Example {
    public static void main(String[] args) {
        AppCustomProductPageCreateRequestIncludedInner exampleAppCustomProductPageCreateRequestIncludedInner = new AppCustomProductPageCreateRequestIncludedInner();

        // create a new AppCustomProductPageLocalizationInlineCreate
        AppCustomProductPageLocalizationInlineCreate exampleAppCustomProductPageLocalizationInlineCreate = new AppCustomProductPageLocalizationInlineCreate();
        // set AppCustomProductPageCreateRequestIncludedInner to AppCustomProductPageLocalizationInlineCreate
        exampleAppCustomProductPageCreateRequestIncludedInner.setActualInstance(exampleAppCustomProductPageLocalizationInlineCreate);
        // to get back the AppCustomProductPageLocalizationInlineCreate set earlier
        AppCustomProductPageLocalizationInlineCreate testAppCustomProductPageLocalizationInlineCreate = (AppCustomProductPageLocalizationInlineCreate) exampleAppCustomProductPageCreateRequestIncludedInner.getActualInstance();

        // create a new AppCustomProductPageVersionInlineCreate
        AppCustomProductPageVersionInlineCreate exampleAppCustomProductPageVersionInlineCreate = new AppCustomProductPageVersionInlineCreate();
        // set AppCustomProductPageCreateRequestIncludedInner to AppCustomProductPageVersionInlineCreate
        exampleAppCustomProductPageCreateRequestIncludedInner.setActualInstance(exampleAppCustomProductPageVersionInlineCreate);
        // to get back the AppCustomProductPageVersionInlineCreate set earlier
        AppCustomProductPageVersionInlineCreate testAppCustomProductPageVersionInlineCreate = (AppCustomProductPageVersionInlineCreate) exampleAppCustomProductPageCreateRequestIncludedInner.getActualInstance();
    }
}
```


