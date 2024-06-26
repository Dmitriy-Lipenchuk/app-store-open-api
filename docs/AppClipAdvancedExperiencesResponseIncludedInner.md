

# AppClipAdvancedExperiencesResponseIncludedInner

## oneOf schemas
* [AppClip](AppClip.md)
* [AppClipAdvancedExperienceImage](AppClipAdvancedExperienceImage.md)
* [AppClipAdvancedExperienceLocalization](AppClipAdvancedExperienceLocalization.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppClipAdvancedExperiencesResponseIncludedInner;
import org.openapitools.client.model.AppClip;
import org.openapitools.client.model.AppClipAdvancedExperienceImage;
import org.openapitools.client.model.AppClipAdvancedExperienceLocalization;

public class Example {
    public static void main(String[] args) {
        AppClipAdvancedExperiencesResponseIncludedInner exampleAppClipAdvancedExperiencesResponseIncludedInner = new AppClipAdvancedExperiencesResponseIncludedInner();

        // create a new AppClip
        AppClip exampleAppClip = new AppClip();
        // set AppClipAdvancedExperiencesResponseIncludedInner to AppClip
        exampleAppClipAdvancedExperiencesResponseIncludedInner.setActualInstance(exampleAppClip);
        // to get back the AppClip set earlier
        AppClip testAppClip = (AppClip) exampleAppClipAdvancedExperiencesResponseIncludedInner.getActualInstance();

        // create a new AppClipAdvancedExperienceImage
        AppClipAdvancedExperienceImage exampleAppClipAdvancedExperienceImage = new AppClipAdvancedExperienceImage();
        // set AppClipAdvancedExperiencesResponseIncludedInner to AppClipAdvancedExperienceImage
        exampleAppClipAdvancedExperiencesResponseIncludedInner.setActualInstance(exampleAppClipAdvancedExperienceImage);
        // to get back the AppClipAdvancedExperienceImage set earlier
        AppClipAdvancedExperienceImage testAppClipAdvancedExperienceImage = (AppClipAdvancedExperienceImage) exampleAppClipAdvancedExperiencesResponseIncludedInner.getActualInstance();

        // create a new AppClipAdvancedExperienceLocalization
        AppClipAdvancedExperienceLocalization exampleAppClipAdvancedExperienceLocalization = new AppClipAdvancedExperienceLocalization();
        // set AppClipAdvancedExperiencesResponseIncludedInner to AppClipAdvancedExperienceLocalization
        exampleAppClipAdvancedExperiencesResponseIncludedInner.setActualInstance(exampleAppClipAdvancedExperienceLocalization);
        // to get back the AppClipAdvancedExperienceLocalization set earlier
        AppClipAdvancedExperienceLocalization testAppClipAdvancedExperienceLocalization = (AppClipAdvancedExperienceLocalization) exampleAppClipAdvancedExperiencesResponseIncludedInner.getActualInstance();
    }
}
```


