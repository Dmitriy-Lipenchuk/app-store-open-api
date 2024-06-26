

# ReviewSubmissionsResponseIncludedInner

## oneOf schemas
* [Actor](Actor.md)
* [App](App.md)
* [AppStoreVersion](AppStoreVersion.md)
* [ReviewSubmissionItem](ReviewSubmissionItem.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.ReviewSubmissionsResponseIncludedInner;
import org.openapitools.client.model.Actor;
import org.openapitools.client.model.App;
import org.openapitools.client.model.AppStoreVersion;
import org.openapitools.client.model.ReviewSubmissionItem;

public class Example {
    public static void main(String[] args) {
        ReviewSubmissionsResponseIncludedInner exampleReviewSubmissionsResponseIncludedInner = new ReviewSubmissionsResponseIncludedInner();

        // create a new Actor
        Actor exampleActor = new Actor();
        // set ReviewSubmissionsResponseIncludedInner to Actor
        exampleReviewSubmissionsResponseIncludedInner.setActualInstance(exampleActor);
        // to get back the Actor set earlier
        Actor testActor = (Actor) exampleReviewSubmissionsResponseIncludedInner.getActualInstance();

        // create a new App
        App exampleApp = new App();
        // set ReviewSubmissionsResponseIncludedInner to App
        exampleReviewSubmissionsResponseIncludedInner.setActualInstance(exampleApp);
        // to get back the App set earlier
        App testApp = (App) exampleReviewSubmissionsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersion
        AppStoreVersion exampleAppStoreVersion = new AppStoreVersion();
        // set ReviewSubmissionsResponseIncludedInner to AppStoreVersion
        exampleReviewSubmissionsResponseIncludedInner.setActualInstance(exampleAppStoreVersion);
        // to get back the AppStoreVersion set earlier
        AppStoreVersion testAppStoreVersion = (AppStoreVersion) exampleReviewSubmissionsResponseIncludedInner.getActualInstance();

        // create a new ReviewSubmissionItem
        ReviewSubmissionItem exampleReviewSubmissionItem = new ReviewSubmissionItem();
        // set ReviewSubmissionsResponseIncludedInner to ReviewSubmissionItem
        exampleReviewSubmissionsResponseIncludedInner.setActualInstance(exampleReviewSubmissionItem);
        // to get back the ReviewSubmissionItem set earlier
        ReviewSubmissionItem testReviewSubmissionItem = (ReviewSubmissionItem) exampleReviewSubmissionsResponseIncludedInner.getActualInstance();
    }
}
```


