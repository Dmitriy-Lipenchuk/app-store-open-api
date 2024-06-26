

# AppStoreVersionsResponseIncludedInner

## oneOf schemas
* [AgeRatingDeclaration](AgeRatingDeclaration.md)
* [AlternativeDistributionPackage](AlternativeDistributionPackage.md)
* [App](App.md)
* [AppClipDefaultExperience](AppClipDefaultExperience.md)
* [AppStoreReviewDetail](AppStoreReviewDetail.md)
* [AppStoreVersionExperiment](AppStoreVersionExperiment.md)
* [AppStoreVersionExperimentV2](AppStoreVersionExperimentV2.md)
* [AppStoreVersionLocalization](AppStoreVersionLocalization.md)
* [AppStoreVersionPhasedRelease](AppStoreVersionPhasedRelease.md)
* [AppStoreVersionSubmission](AppStoreVersionSubmission.md)
* [Build](Build.md)
* [RoutingAppCoverage](RoutingAppCoverage.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppStoreVersionsResponseIncludedInner;
import org.openapitools.client.model.AgeRatingDeclaration;
import org.openapitools.client.model.AlternativeDistributionPackage;
import org.openapitools.client.model.App;
import org.openapitools.client.model.AppClipDefaultExperience;
import org.openapitools.client.model.AppStoreReviewDetail;
import org.openapitools.client.model.AppStoreVersionExperiment;
import org.openapitools.client.model.AppStoreVersionExperimentV2;
import org.openapitools.client.model.AppStoreVersionLocalization;
import org.openapitools.client.model.AppStoreVersionPhasedRelease;
import org.openapitools.client.model.AppStoreVersionSubmission;
import org.openapitools.client.model.Build;
import org.openapitools.client.model.RoutingAppCoverage;

public class Example {
    public static void main(String[] args) {
        AppStoreVersionsResponseIncludedInner exampleAppStoreVersionsResponseIncludedInner = new AppStoreVersionsResponseIncludedInner();

        // create a new AgeRatingDeclaration
        AgeRatingDeclaration exampleAgeRatingDeclaration = new AgeRatingDeclaration();
        // set AppStoreVersionsResponseIncludedInner to AgeRatingDeclaration
        exampleAppStoreVersionsResponseIncludedInner.setActualInstance(exampleAgeRatingDeclaration);
        // to get back the AgeRatingDeclaration set earlier
        AgeRatingDeclaration testAgeRatingDeclaration = (AgeRatingDeclaration) exampleAppStoreVersionsResponseIncludedInner.getActualInstance();

        // create a new AlternativeDistributionPackage
        AlternativeDistributionPackage exampleAlternativeDistributionPackage = new AlternativeDistributionPackage();
        // set AppStoreVersionsResponseIncludedInner to AlternativeDistributionPackage
        exampleAppStoreVersionsResponseIncludedInner.setActualInstance(exampleAlternativeDistributionPackage);
        // to get back the AlternativeDistributionPackage set earlier
        AlternativeDistributionPackage testAlternativeDistributionPackage = (AlternativeDistributionPackage) exampleAppStoreVersionsResponseIncludedInner.getActualInstance();

        // create a new App
        App exampleApp = new App();
        // set AppStoreVersionsResponseIncludedInner to App
        exampleAppStoreVersionsResponseIncludedInner.setActualInstance(exampleApp);
        // to get back the App set earlier
        App testApp = (App) exampleAppStoreVersionsResponseIncludedInner.getActualInstance();

        // create a new AppClipDefaultExperience
        AppClipDefaultExperience exampleAppClipDefaultExperience = new AppClipDefaultExperience();
        // set AppStoreVersionsResponseIncludedInner to AppClipDefaultExperience
        exampleAppStoreVersionsResponseIncludedInner.setActualInstance(exampleAppClipDefaultExperience);
        // to get back the AppClipDefaultExperience set earlier
        AppClipDefaultExperience testAppClipDefaultExperience = (AppClipDefaultExperience) exampleAppStoreVersionsResponseIncludedInner.getActualInstance();

        // create a new AppStoreReviewDetail
        AppStoreReviewDetail exampleAppStoreReviewDetail = new AppStoreReviewDetail();
        // set AppStoreVersionsResponseIncludedInner to AppStoreReviewDetail
        exampleAppStoreVersionsResponseIncludedInner.setActualInstance(exampleAppStoreReviewDetail);
        // to get back the AppStoreReviewDetail set earlier
        AppStoreReviewDetail testAppStoreReviewDetail = (AppStoreReviewDetail) exampleAppStoreVersionsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersionExperiment
        AppStoreVersionExperiment exampleAppStoreVersionExperiment = new AppStoreVersionExperiment();
        // set AppStoreVersionsResponseIncludedInner to AppStoreVersionExperiment
        exampleAppStoreVersionsResponseIncludedInner.setActualInstance(exampleAppStoreVersionExperiment);
        // to get back the AppStoreVersionExperiment set earlier
        AppStoreVersionExperiment testAppStoreVersionExperiment = (AppStoreVersionExperiment) exampleAppStoreVersionsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersionExperimentV2
        AppStoreVersionExperimentV2 exampleAppStoreVersionExperimentV2 = new AppStoreVersionExperimentV2();
        // set AppStoreVersionsResponseIncludedInner to AppStoreVersionExperimentV2
        exampleAppStoreVersionsResponseIncludedInner.setActualInstance(exampleAppStoreVersionExperimentV2);
        // to get back the AppStoreVersionExperimentV2 set earlier
        AppStoreVersionExperimentV2 testAppStoreVersionExperimentV2 = (AppStoreVersionExperimentV2) exampleAppStoreVersionsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersionLocalization
        AppStoreVersionLocalization exampleAppStoreVersionLocalization = new AppStoreVersionLocalization();
        // set AppStoreVersionsResponseIncludedInner to AppStoreVersionLocalization
        exampleAppStoreVersionsResponseIncludedInner.setActualInstance(exampleAppStoreVersionLocalization);
        // to get back the AppStoreVersionLocalization set earlier
        AppStoreVersionLocalization testAppStoreVersionLocalization = (AppStoreVersionLocalization) exampleAppStoreVersionsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersionPhasedRelease
        AppStoreVersionPhasedRelease exampleAppStoreVersionPhasedRelease = new AppStoreVersionPhasedRelease();
        // set AppStoreVersionsResponseIncludedInner to AppStoreVersionPhasedRelease
        exampleAppStoreVersionsResponseIncludedInner.setActualInstance(exampleAppStoreVersionPhasedRelease);
        // to get back the AppStoreVersionPhasedRelease set earlier
        AppStoreVersionPhasedRelease testAppStoreVersionPhasedRelease = (AppStoreVersionPhasedRelease) exampleAppStoreVersionsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersionSubmission
        AppStoreVersionSubmission exampleAppStoreVersionSubmission = new AppStoreVersionSubmission();
        // set AppStoreVersionsResponseIncludedInner to AppStoreVersionSubmission
        exampleAppStoreVersionsResponseIncludedInner.setActualInstance(exampleAppStoreVersionSubmission);
        // to get back the AppStoreVersionSubmission set earlier
        AppStoreVersionSubmission testAppStoreVersionSubmission = (AppStoreVersionSubmission) exampleAppStoreVersionsResponseIncludedInner.getActualInstance();

        // create a new Build
        Build exampleBuild = new Build();
        // set AppStoreVersionsResponseIncludedInner to Build
        exampleAppStoreVersionsResponseIncludedInner.setActualInstance(exampleBuild);
        // to get back the Build set earlier
        Build testBuild = (Build) exampleAppStoreVersionsResponseIncludedInner.getActualInstance();

        // create a new RoutingAppCoverage
        RoutingAppCoverage exampleRoutingAppCoverage = new RoutingAppCoverage();
        // set AppStoreVersionsResponseIncludedInner to RoutingAppCoverage
        exampleAppStoreVersionsResponseIncludedInner.setActualInstance(exampleRoutingAppCoverage);
        // to get back the RoutingAppCoverage set earlier
        RoutingAppCoverage testRoutingAppCoverage = (RoutingAppCoverage) exampleAppStoreVersionsResponseIncludedInner.getActualInstance();
    }
}
```


