import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class Putname {

    @Test
    public void putnamevalid() {
        when().
                put("https://api-coffee-testing.herokuapp.com/v1/examen/updateName")

                .then().
                statusCode(406)
                .body("message", equalTo("Name was not provided"));

    }}

