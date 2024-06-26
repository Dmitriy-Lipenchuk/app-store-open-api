

# BuildsResponseIncludedInner

## oneOf schemas
* [App](App.md)
* [AppEncryptionDeclaration](AppEncryptionDeclaration.md)
* [AppStoreVersion](AppStoreVersion.md)
* [BetaAppReviewSubmission](BetaAppReviewSubmission.md)
* [BetaBuildLocalization](BetaBuildLocalization.md)
* [BetaGroup](BetaGroup.md)
* [BetaTester](BetaTester.md)
* [BuildBetaDetail](BuildBetaDetail.md)
* [BuildBundle](BuildBundle.md)
* [BuildIcon](BuildIcon.md)
* [PrereleaseVersion](PrereleaseVersion.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.BuildsResponseIncludedInner;
import org.openapitools.client.model.App;
import org.openapitools.client.model.AppEncryptionDeclaration;
import org.openapitools.client.model.AppStoreVersion;
import org.openapitools.client.model.BetaAppReviewSubmission;
import org.openapitools.client.model.BetaBuildLocalization;
import org.openapitools.client.model.BetaGroup;
import org.openapitools.client.model.BetaTester;
import org.openapitools.client.model.BuildBetaDetail;
import org.openapitools.client.model.BuildBundle;
import org.openapitools.client.model.BuildIcon;
import org.openapitools.client.model.PrereleaseVersion;

public class Example {
    public static void main(String[] args) {
        BuildsResponseIncludedInner exampleBuildsResponseIncludedInner = new BuildsResponseIncludedInner();

        // create a new App
        App exampleApp = new App();
        // set BuildsResponseIncludedInner to App
        exampleBuildsResponseIncludedInner.setActualInstance(exampleApp);
        // to get back the App set earlier
        App testApp = (App) exampleBuildsResponseIncludedInner.getActualInstance();

        // create a new AppEncryptionDeclaration
        AppEncryptionDeclaration exampleAppEncryptionDeclaration = new AppEncryptionDeclaration();
        // set BuildsResponseIncludedInner to AppEncryptionDeclaration
        exampleBuildsResponseIncludedInner.setActualInstance(exampleAppEncryptionDeclaration);
        // to get back the AppEncryptionDeclaration set earlier
        AppEncryptionDeclaration testAppEncryptionDeclaration = (AppEncryptionDeclaration) exampleBuildsResponseIncludedInner.getActualInstance();

        // create a new AppStoreVersion
        AppStoreVersion exampleAppStoreVersion = new AppStoreVersion();
        // set BuildsResponseIncludedInner to AppStoreVersion
        exampleBuildsResponseIncludedInner.setActualInstance(exampleAppStoreVersion);
        // to get back the AppStoreVersion set earlier
        AppStoreVersion testAppStoreVersion = (AppStoreVersion) exampleBuildsResponseIncludedInner.getActualInstance();

        // create a new BetaAppReviewSubmission
        BetaAppReviewSubmission exampleBetaAppReviewSubmission = new BetaAppReviewSubmission();
        // set BuildsResponseIncludedInner to BetaAppReviewSubmission
        exampleBuildsResponseIncludedInner.setActualInstance(exampleBetaAppReviewSubmission);
        // to get back the BetaAppReviewSubmission set earlier
        BetaAppReviewSubmission testBetaAppReviewSubmission = (BetaAppReviewSubmission) exampleBuildsResponseIncludedInner.getActualInstance();

        // create a new BetaBuildLocalization
        BetaBuildLocalization exampleBetaBuildLocalization = new BetaBuildLocalization();
        // set BuildsResponseIncludedInner to BetaBuildLocalization
        exampleBuildsResponseIncludedInner.setActualInstance(exampleBetaBuildLocalization);
        // to get back the BetaBuildLocalization set earlier
        BetaBuildLocalization testBetaBuildLocalization = (BetaBuildLocalization) exampleBuildsResponseIncludedInner.getActualInstance();

        // create a new BetaGroup
        BetaGroup exampleBetaGroup = new BetaGroup();
        // set BuildsResponseIncludedInner to BetaGroup
        exampleBuildsResponseIncludedInner.setActualInstance(exampleBetaGroup);
        // to get back the BetaGroup set earlier
        BetaGroup testBetaGroup = (BetaGroup) exampleBuildsResponseIncludedInner.getActualInstance();

        // create a new BetaTester
        BetaTester exampleBetaTester = new BetaTester();
        // set BuildsResponseIncludedInner to BetaTester
        exampleBuildsResponseIncludedInner.setActualInstance(exampleBetaTester);
        // to get back the BetaTester set earlier
        BetaTester testBetaTester = (BetaTester) exampleBuildsResponseIncludedInner.getActualInstance();

        // create a new BuildBetaDetail
        BuildBetaDetail exampleBuildBetaDetail = new BuildBetaDetail();
        // set BuildsResponseIncludedInner to BuildBetaDetail
        exampleBuildsResponseIncludedInner.setActualInstance(exampleBuildBetaDetail);
        // to get back the BuildBetaDetail set earlier
        BuildBetaDetail testBuildBetaDetail = (BuildBetaDetail) exampleBuildsResponseIncludedInner.getActualInstance();

        // create a new BuildBundle
        BuildBundle exampleBuildBundle = new BuildBundle();
        // set BuildsResponseIncludedInner to BuildBundle
        exampleBuildsResponseIncludedInner.setActualInstance(exampleBuildBundle);
        // to get back the BuildBundle set earlier
        BuildBundle testBuildBundle = (BuildBundle) exampleBuildsResponseIncludedInner.getActualInstance();

        // create a new BuildIcon
        BuildIcon exampleBuildIcon = new BuildIcon();
        // set BuildsResponseIncludedInner to BuildIcon
        exampleBuildsResponseIncludedInner.setActualInstance(exampleBuildIcon);
        // to get back the BuildIcon set earlier
        BuildIcon testBuildIcon = (BuildIcon) exampleBuildsResponseIncludedInner.getActualInstance();

        // create a new PrereleaseVersion
        PrereleaseVersion examplePrereleaseVersion = new PrereleaseVersion();
        // set BuildsResponseIncludedInner to PrereleaseVersion
        exampleBuildsResponseIncludedInner.setActualInstance(examplePrereleaseVersion);
        // to get back the PrereleaseVersion set earlier
        PrereleaseVersion testPrereleaseVersion = (PrereleaseVersion) exampleBuildsResponseIncludedInner.getActualInstance();
    }
}
```


