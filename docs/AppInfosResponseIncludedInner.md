

# AppInfosResponseIncludedInner

## oneOf schemas
* [AgeRatingDeclaration](AgeRatingDeclaration.md)
* [App](App.md)
* [AppCategory](AppCategory.md)
* [AppInfoLocalization](AppInfoLocalization.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppInfosResponseIncludedInner;
import org.openapitools.client.model.AgeRatingDeclaration;
import org.openapitools.client.model.App;
import org.openapitools.client.model.AppCategory;
import org.openapitools.client.model.AppInfoLocalization;

public class Example {
    public static void main(String[] args) {
        AppInfosResponseIncludedInner exampleAppInfosResponseIncludedInner = new AppInfosResponseIncludedInner();

        // create a new AgeRatingDeclaration
        AgeRatingDeclaration exampleAgeRatingDeclaration = new AgeRatingDeclaration();
        // set AppInfosResponseIncludedInner to AgeRatingDeclaration
        exampleAppInfosResponseIncludedInner.setActualInstance(exampleAgeRatingDeclaration);
        // to get back the AgeRatingDeclaration set earlier
        AgeRatingDeclaration testAgeRatingDeclaration = (AgeRatingDeclaration) exampleAppInfosResponseIncludedInner.getActualInstance();

        // create a new App
        App exampleApp = new App();
        // set AppInfosResponseIncludedInner to App
        exampleAppInfosResponseIncludedInner.setActualInstance(exampleApp);
        // to get back the App set earlier
        App testApp = (App) exampleAppInfosResponseIncludedInner.getActualInstance();

        // create a new AppCategory
        AppCategory exampleAppCategory = new AppCategory();
        // set AppInfosResponseIncludedInner to AppCategory
        exampleAppInfosResponseIncludedInner.setActualInstance(exampleAppCategory);
        // to get back the AppCategory set earlier
        AppCategory testAppCategory = (AppCategory) exampleAppInfosResponseIncludedInner.getActualInstance();

        // create a new AppInfoLocalization
        AppInfoLocalization exampleAppInfoLocalization = new AppInfoLocalization();
        // set AppInfosResponseIncludedInner to AppInfoLocalization
        exampleAppInfosResponseIncludedInner.setActualInstance(exampleAppInfoLocalization);
        // to get back the AppInfoLocalization set earlier
        AppInfoLocalization testAppInfoLocalization = (AppInfoLocalization) exampleAppInfosResponseIncludedInner.getActualInstance();
    }
}
```


