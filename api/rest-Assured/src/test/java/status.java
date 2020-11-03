
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class status {
    @Test
    public void statusTestValid(){
        when().
                get("https://api-coffee-testing.herokuapp.com/v1/examen/status")

                .then().
                statusCode(200)
                .body("status", equalTo("Listos para el examen"));

     }}
