import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

/**
 * This class created to test the Login API method which was given as a Test
 */
public class TestEzyAPI {

    /**
     * Incorrect Payload Format. Positive Test
     */
    @Test
    public void test_LoginAPI() {

        given().
                when().
                post("https://r8alxaspi1.execute-api.ap-southeast-2.amazonaws.com/api/ezypay/login?username=test-user&password=abc123").
                then().
                assertThat().statusCode(415);
    }

    /**
     * Negative Test
     */
    @Test
    public void test_LoginInvalidErrorCode() {
        given().
                when().
                post("https://r8alxaspi1.execute-api.ap-southeast-2.amazonaws.com/api/ezypay/login").
                then().
                assertThat().statusCode(500);
    }



}
