

# AppClipDefaultExperiencesResponseIncludedInner

## oneOf schemas
* [AppClip](AppClip.md)
* [AppClipAppStoreReviewDetail](AppClipAppStoreReviewDetail.md)
* [AppClipDefaultExperienceLocalization](AppClipDefaultExperienceLocalization.md)
* [AppStoreVersion](AppStoreVersion.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppClipDefaultExperiencesResponseIncludedInner;
import org.openapitools.client.model.AppClip;
import org.openapitools.client.model.AppClipAppStoreReviewDetail;
import org.openapitools.client.model.AppClipDefaultExperienceLocalization;
import org.openapitools.client.model.AppStoreVersion;

public class Example {
    public static void main(String[] args) {
        AppClipDefaultExperiencesResponseIncludedInner exampleAppClipDefaultExperiencesResponseIncludedInner = new AppClipDefaultExperiencesResponseIncludedInner();

        // create a new AppClip
        AppClip exampleAppClip = new AppClip();
        // set AppClipDefaultExperiencesResponseIncludedInner to AppClip
        exampleAppClipDefaultExperiencesResponseIncludedInner.setActualInstance(exampleAppClip);
        // to get back the AppClip set earlier
        AppClip testAppClip = (AppClip) exampleAppClipDefaultExperiencesResponseIncludedInner.getActualInstance();

        // create a new AppClipAppStoreReviewDetail
        AppClipAppStoreReviewDetail exampleAppClipAppStoreReviewDetail = new AppClipAppStoreReviewDetail();
        // set AppClipDefaultExperiencesResponseIncludedInner to AppClipAppStoreReviewDetail
        exampleAppClipDefaultExperiencesResponseIncludedInner.setActualInstance(exampleAppClipAppStoreReviewDetail);
        // to get back the AppClipAppStoreReviewDetail set earlier
        AppClipAppStoreReviewDetail testAppClipAppStoreReviewDetail = (AppClipAppStoreReviewDetail) exampleAppClipDefaultExperiencesResponseIncludedInner.getActualInstance();

        // create a new AppClipDefaultExperienceLocalization
        AppClipDefaultExperienceLocalization exampleAppClipDefaultExperienceLocalization = new AppClipDefaultExperienceLocalization();
        // set AppClipDefaultExperiencesResponseIncludedInner to AppClipDefaultExperienceLocalization
        exampleAppClipDefaultExperiencesResponseIncludedInner.setActualInstance(exampleAppClipDefaultExperienceLocalization);
        // to get back the AppClipDefaultExperienceLocalization set earlier
        AppClipDefaultExperienceLocalization testAppClipDefaultExperienceLocalization = (AppClipDefaultExperienceLocalization) exampleAppClipDefaultExperiencesResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersion
        AppStoreVersion exampleAppStoreVersion = new AppStoreVersion();
        // set AppClipDefaultExperiencesResponseIncludedInner to AppStoreVersion
        exampleAppClipDefaultExperiencesResponseIncludedInner.setActualInstance(exampleAppStoreVersion);
        // to get back the AppStoreVersion set earlier
        AppStoreVersion testAppStoreVersion = (AppStoreVersion) exampleAppClipDefaultExperiencesResponseIncludedInner.getActualInstance();
    }
}
```


