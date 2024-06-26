

# AppClipsResponseIncludedInner

## oneOf schemas
* [App](App.md)
* [AppClipDefaultExperience](AppClipDefaultExperience.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppClipsResponseIncludedInner;
import org.openapitools.client.model.App;
import org.openapitools.client.model.AppClipDefaultExperience;

public class Example {
    public static void main(String[] args) {
        AppClipsResponseIncludedInner exampleAppClipsResponseIncludedInner = new AppClipsResponseIncludedInner();

        // create a new App
        App exampleApp = new App();
        // set AppClipsResponseIncludedInner to App
        exampleAppClipsResponseIncludedInner.setActualInstance(exampleApp);
        // to get back the App set earlier
        App testApp = (App) exampleAppClipsResponseIncludedInner.getActualInstance();

        // create a new AppClipDefaultExperience
        AppClipDefaultExperience exampleAppClipDefaultExperience = new AppClipDefaultExperience();
        // set AppClipsResponseIncludedInner to AppClipDefaultExperience
        exampleAppClipsResponseIncludedInner.setActualInstance(exampleAppClipDefaultExperience);
        // to get back the AppClipDefaultExperience set earlier
        AppClipDefaultExperience testAppClipDefaultExperience = (AppClipDefaultExperience) exampleAppClipsResponseIncludedInner.getActualInstance();
    }
}
```


