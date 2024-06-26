

# AppStoreReviewDetailResponseIncludedInner

## oneOf schemas
* [AppStoreReviewAttachment](AppStoreReviewAttachment.md)
* [AppStoreVersion](AppStoreVersion.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppStoreReviewDetailResponseIncludedInner;
import org.openapitools.client.model.AppStoreReviewAttachment;
import org.openapitools.client.model.AppStoreVersion;

public class Example {
    public static void main(String[] args) {
        AppStoreReviewDetailResponseIncludedInner exampleAppStoreReviewDetailResponseIncludedInner = new AppStoreReviewDetailResponseIncludedInner();

        // create a new AppStoreReviewAttachment
        AppStoreReviewAttachment exampleAppStoreReviewAttachment = new AppStoreReviewAttachment();
        // set AppStoreReviewDetailResponseIncludedInner to AppStoreReviewAttachment
        exampleAppStoreReviewDetailResponseIncludedInner.setActualInstance(exampleAppStoreReviewAttachment);
        // to get back the AppStoreReviewAttachment set earlier
        AppStoreReviewAttachment testAppStoreReviewAttachment = (AppStoreReviewAttachment) exampleAppStoreReviewDetailResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersion
        AppStoreVersion exampleAppStoreVersion = new AppStoreVersion();
        // set AppStoreReviewDetailResponseIncludedInner to AppStoreVersion
        exampleAppStoreReviewDetailResponseIncludedInner.setActualInstance(exampleAppStoreVersion);
        // to get back the AppStoreVersion set earlier
        AppStoreVersion testAppStoreVersion = (AppStoreVersion) exampleAppStoreReviewDetailResponseIncludedInner.getActualInstance();
    }
}
```


