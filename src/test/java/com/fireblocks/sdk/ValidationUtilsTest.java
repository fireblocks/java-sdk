import static org.junit.Assert.*;

import com.fireblocks.sdk.ApiException;
import com.fireblocks.sdk.ValidationUtils;
import org.junit.Test;

public class ValidationUtilsTest {

    @Test
    public void testAssertParamExistsAndNotEmpty() {
        String functionName = "testFunction";
        String paramName = "testParam";
        String paramValue = "testValue";

        try {
            ValidationUtils.assertParamExistsAndNotEmpty(functionName, paramName, paramValue);
        } catch (ApiException e) {
            fail("ApiException was not expected.");
        }
    }

    @Test
    public void testAssertParamExistsAndNotEmptyWithEmptyParamValue() {
        String functionName = "testFunction";
        String paramName = "testParam";
        String paramValue = "";

        try {
            ValidationUtils.assertParamExistsAndNotEmpty(functionName, paramName, paramValue);
            fail("ApiException was expected but not thrown.");
        } catch (ApiException e) {
            assertEquals(
                    "The required parameter 'testParam' was empty when calling 'testFunction'",
                    e.getMessage());
        }
    }

    @Test
    public void testAssertParamExists() {
        String functionName = "testFunction";
        String paramName = "testParam";
        Object paramValue = new Object();

        try {
            ValidationUtils.assertParamExists(functionName, paramName, paramValue);
        } catch (ApiException e) {
            fail("ApiException was not expected.");
        }
    }

    @Test
    public void testAssertParamExistsWithNullParamValue() {
        String functionName = "testFunction";
        String paramName = "testParam";
        Object paramValue = null;

        try {
            ValidationUtils.assertParamExists(functionName, paramName, paramValue);
            fail("ApiException was expected but not thrown.");
        } catch (ApiException e) {
            assertEquals(
                    "The required parameter 'testParam' is missing from call to 'testFunction'",
                    e.getMessage());
        }
    }
}
