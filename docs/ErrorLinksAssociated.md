

# ErrorLinksAssociated

## oneOf schemas
* [ErrorLinksAssociatedOneOf](ErrorLinksAssociatedOneOf.md)
* [String](String.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.ErrorLinksAssociated;
import org.openapitools.client.model.ErrorLinksAssociatedOneOf;
import org.openapitools.client.model.String;

public class Example {
    public static void main(String[] args) {
        ErrorLinksAssociated exampleErrorLinksAssociated = new ErrorLinksAssociated();

        // create a new ErrorLinksAssociatedOneOf
        ErrorLinksAssociatedOneOf exampleErrorLinksAssociatedOneOf = new ErrorLinksAssociatedOneOf();
        // set ErrorLinksAssociated to ErrorLinksAssociatedOneOf
        exampleErrorLinksAssociated.setActualInstance(exampleErrorLinksAssociatedOneOf);
        // to get back the ErrorLinksAssociatedOneOf set earlier
        ErrorLinksAssociatedOneOf testErrorLinksAssociatedOneOf = (ErrorLinksAssociatedOneOf) exampleErrorLinksAssociated.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set ErrorLinksAssociated to String
        exampleErrorLinksAssociated.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleErrorLinksAssociated.getActualInstance();
    }
}
```


