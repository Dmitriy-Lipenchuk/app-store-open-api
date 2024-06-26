

# AppEncryptionDeclarationsResponseIncludedInner

## oneOf schemas
* [App](App.md)
* [AppEncryptionDeclarationDocument](AppEncryptionDeclarationDocument.md)
* [Build](Build.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.AppEncryptionDeclarationsResponseIncludedInner;
import org.openapitools.client.model.App;
import org.openapitools.client.model.AppEncryptionDeclarationDocument;
import org.openapitools.client.model.Build;

public class Example {
    public static void main(String[] args) {
        AppEncryptionDeclarationsResponseIncludedInner exampleAppEncryptionDeclarationsResponseIncludedInner = new AppEncryptionDeclarationsResponseIncludedInner();

        // create a new App
        App exampleApp = new App();
        // set AppEncryptionDeclarationsResponseIncludedInner to App
        exampleAppEncryptionDeclarationsResponseIncludedInner.setActualInstance(exampleApp);
        // to get back the App set earlier
        App testApp = (App) exampleAppEncryptionDeclarationsResponseIncludedInner.getActualInstance();

        // create a new AppEncryptionDeclarationDocument
        AppEncryptionDeclarationDocument exampleAppEncryptionDeclarationDocument = new AppEncryptionDeclarationDocument();
        // set AppEncryptionDeclarationsResponseIncludedInner to AppEncryptionDeclarationDocument
        exampleAppEncryptionDeclarationsResponseIncludedInner.setActualInstance(exampleAppEncryptionDeclarationDocument);
        // to get back the AppEncryptionDeclarationDocument set earlier
        AppEncryptionDeclarationDocument testAppEncryptionDeclarationDocument = (AppEncryptionDeclarationDocument) exampleAppEncryptionDeclarationsResponseIncludedInner.getActualInstance();

        // create a new Build
        Build exampleBuild = new Build();
        // set AppEncryptionDeclarationsResponseIncludedInner to Build
        exampleAppEncryptionDeclarationsResponseIncludedInner.setActualInstance(exampleBuild);
        // to get back the Build set earlier
        Build testBuild = (Build) exampleAppEncryptionDeclarationsResponseIncludedInner.getActualInstance();
    }
}
```


