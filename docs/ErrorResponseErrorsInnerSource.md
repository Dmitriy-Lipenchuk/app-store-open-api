

# ErrorResponseErrorsInnerSource

## oneOf schemas
* [ErrorSourceParameter](ErrorSourceParameter.md)
* [ErrorSourcePointer](ErrorSourcePointer.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.ErrorResponseErrorsInnerSource;
import org.openapitools.client.model.ErrorSourceParameter;
import org.openapitools.client.model.ErrorSourcePointer;

public class Example {
    public static void main(String[] args) {
        ErrorResponseErrorsInnerSource exampleErrorResponseErrorsInnerSource = new ErrorResponseErrorsInnerSource();

        // create a new ErrorSourceParameter
        ErrorSourceParameter exampleErrorSourceParameter = new ErrorSourceParameter();
        // set ErrorResponseErrorsInnerSource to ErrorSourceParameter
        exampleErrorResponseErrorsInnerSource.setActualInstance(exampleErrorSourceParameter);
        // to get back the ErrorSourceParameter set earlier
        ErrorSourceParameter testErrorSourceParameter = (ErrorSourceParameter) exampleErrorResponseErrorsInnerSource.getActualInstance();

        // create a new ErrorSourcePointer
        ErrorSourcePointer exampleErrorSourcePointer = new ErrorSourcePointer();
        // set ErrorResponseErrorsInnerSource to ErrorSourcePointer
        exampleErrorResponseErrorsInnerSource.setActualInstance(exampleErrorSourcePointer);
        // to get back the ErrorSourcePointer set earlier
        ErrorSourcePointer testErrorSourcePointer = (ErrorSourcePointer) exampleErrorResponseErrorsInnerSource.getActualInstance();
    }
}
```


