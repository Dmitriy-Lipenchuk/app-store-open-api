

# AppEventLocalizationsResponseIncludedInner

## oneOf schemas
* [AppEvent](AppEvent.md)
* [AppEventScreenshot](AppEventScreenshot.md)
* [AppEventVideoClip](AppEventVideoClip.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppEventLocalizationsResponseIncludedInner;
import org.openapitools.client.model.AppEvent;
import org.openapitools.client.model.AppEventScreenshot;
import org.openapitools.client.model.AppEventVideoClip;

public class Example {
    public static void main(String[] args) {
        AppEventLocalizationsResponseIncludedInner exampleAppEventLocalizationsResponseIncludedInner = new AppEventLocalizationsResponseIncludedInner();

        // create a new AppEvent
        AppEvent exampleAppEvent = new AppEvent();
        // set AppEventLocalizationsResponseIncludedInner to AppEvent
        exampleAppEventLocalizationsResponseIncludedInner.setActualInstance(exampleAppEvent);
        // to get back the AppEvent set earlier
        AppEvent testAppEvent = (AppEvent) exampleAppEventLocalizationsResponseIncludedInner.getActualInstance();

        // create a new AppEventScreenshot
        AppEventScreenshot exampleAppEventScreenshot = new AppEventScreenshot();
        // set AppEventLocalizationsResponseIncludedInner to AppEventScreenshot
        exampleAppEventLocalizationsResponseIncludedInner.setActualInstance(exampleAppEventScreenshot);
        // to get back the AppEventScreenshot set earlier
        AppEventScreenshot testAppEventScreenshot = (AppEventScreenshot) exampleAppEventLocalizationsResponseIncludedInner.getActualInstance();

        // create a new AppEventVideoClip
        AppEventVideoClip exampleAppEventVideoClip = new AppEventVideoClip();
        // set AppEventLocalizationsResponseIncludedInner to AppEventVideoClip
        exampleAppEventLocalizationsResponseIncludedInner.setActualInstance(exampleAppEventVideoClip);
        // to get back the AppEventVideoClip set earlier
        AppEventVideoClip testAppEventVideoClip = (AppEventVideoClip) exampleAppEventLocalizationsResponseIncludedInner.getActualInstance();
    }
}
```


