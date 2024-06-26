

# AppCustomProductPagesResponseIncludedInner

## oneOf schemas
* [App](App.md)
* [AppCustomProductPageVersion](AppCustomProductPageVersion.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppCustomProductPagesResponseIncludedInner;
import org.openapitools.client.model.App;
import org.openapitools.client.model.AppCustomProductPageVersion;

public class Example {
    public static void main(String[] args) {
        AppCustomProductPagesResponseIncludedInner exampleAppCustomProductPagesResponseIncludedInner = new AppCustomProductPagesResponseIncludedInner();

        // create a new App
        App exampleApp = new App();
        // set AppCustomProductPagesResponseIncludedInner to App
        exampleAppCustomProductPagesResponseIncludedInner.setActualInstance(exampleApp);
        // to get back the App set earlier
        App testApp = (App) exampleAppCustomProductPagesResponseIncludedInner.getActualInstance();

        // create a new AppCustomProductPageVersion
        AppCustomProductPageVersion exampleAppCustomProductPageVersion = new AppCustomProductPageVersion();
        // set AppCustomProductPagesResponseIncludedInner to AppCustomProductPageVersion
        exampleAppCustomProductPagesResponseIncludedInner.setActualInstance(exampleAppCustomProductPageVersion);
        // to get back the AppCustomProductPageVersion set earlier
        AppCustomProductPageVersion testAppCustomProductPageVersion = (AppCustomProductPageVersion) exampleAppCustomProductPagesResponseIncludedInner.getActualInstance();
    }
}
```


