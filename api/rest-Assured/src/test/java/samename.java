import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class samename {
    @Test
    public void putnamevalid() {
        when().
                get("https://api-coffee-testing.herokuapp.com/v1/examen/randomName")

                .then().
                statusCode(401)
                .body("message", equalTo("Please login first"));

    }}

