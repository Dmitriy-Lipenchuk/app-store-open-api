

# AppClipDefaultExperienceLocalizationsResponseIncludedInner

## oneOf schemas
* [AppClipDefaultExperience](AppClipDefaultExperience.md)
* [AppClipHeaderImage](AppClipHeaderImage.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppClipDefaultExperienceLocalizationsResponseIncludedInner;
import org.openapitools.client.model.AppClipDefaultExperience;
import org.openapitools.client.model.AppClipHeaderImage;

public class Example {
    public static void main(String[] args) {
        AppClipDefaultExperienceLocalizationsResponseIncludedInner exampleAppClipDefaultExperienceLocalizationsResponseIncludedInner = new AppClipDefaultExperienceLocalizationsResponseIncludedInner();

        // create a new AppClipDefaultExperience
        AppClipDefaultExperience exampleAppClipDefaultExperience = new AppClipDefaultExperience();
        // set AppClipDefaultExperienceLocalizationsResponseIncludedInner to AppClipDefaultExperience
        exampleAppClipDefaultExperienceLocalizationsResponseIncludedInner.setActualInstance(exampleAppClipDefaultExperience);
        // to get back the AppClipDefaultExperience set earlier
        AppClipDefaultExperience testAppClipDefaultExperience = (AppClipDefaultExperience) exampleAppClipDefaultExperienceLocalizationsResponseIncludedInner.getActualInstance();

        // create a new AppClipHeaderImage
        AppClipHeaderImage exampleAppClipHeaderImage = new AppClipHeaderImage();
        // set AppClipDefaultExperienceLocalizationsResponseIncludedInner to AppClipHeaderImage
        exampleAppClipDefaultExperienceLocalizationsResponseIncludedInner.setActualInstance(exampleAppClipHeaderImage);
        // to get back the AppClipHeaderImage set earlier
        AppClipHeaderImage testAppClipHeaderImage = (AppClipHeaderImage) exampleAppClipDefaultExperienceLocalizationsResponseIncludedInner.getActualInstance();
    }
}
```


