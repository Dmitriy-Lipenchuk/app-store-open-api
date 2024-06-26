

# AppCustomProductPageVersionsResponseIncludedInner

## oneOf schemas
* [AppCustomProductPage](AppCustomProductPage.md)
* [AppCustomProductPageLocalization](AppCustomProductPageLocalization.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppCustomProductPageVersionsResponseIncludedInner;
import org.openapitools.client.model.AppCustomProductPage;
import org.openapitools.client.model.AppCustomProductPageLocalization;

public class Example {
    public static void main(String[] args) {
        AppCustomProductPageVersionsResponseIncludedInner exampleAppCustomProductPageVersionsResponseIncludedInner = new AppCustomProductPageVersionsResponseIncludedInner();

        // create a new AppCustomProductPage
        AppCustomProductPage exampleAppCustomProductPage = new AppCustomProductPage();
        // set AppCustomProductPageVersionsResponseIncludedInner to AppCustomProductPage
        exampleAppCustomProductPageVersionsResponseIncludedInner.setActualInstance(exampleAppCustomProductPage);
        // to get back the AppCustomProductPage set earlier
        AppCustomProductPage testAppCustomProductPage = (AppCustomProductPage) exampleAppCustomProductPageVersionsResponseIncludedInner.getActualInstance();

        // create a new AppCustomProductPageLocalization
        AppCustomProductPageLocalization exampleAppCustomProductPageLocalization = new AppCustomProductPageLocalization();
        // set AppCustomProductPageVersionsResponseIncludedInner to AppCustomProductPageLocalization
        exampleAppCustomProductPageVersionsResponseIncludedInner.setActualInstance(exampleAppCustomProductPageLocalization);
        // to get back the AppCustomProductPageLocalization set earlier
        AppCustomProductPageLocalization testAppCustomProductPageLocalization = (AppCustomProductPageLocalization) exampleAppCustomProductPageVersionsResponseIncludedInner.getActualInstance();
    }
}
```


