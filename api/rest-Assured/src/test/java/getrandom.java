import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import pojo.Name;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;


public class getrandom extends BaseTest {
    public String namejson = "" ;
    @Test
    public void putnamevalid() {
        String userId =
        given().auth()

                .basic("testuser", "testpass")
                .when()
                .get("https://api-coffee-testing.herokuapp.com/v1/examen/randomName")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .path("name");

        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", userId);
        request.header("Content-Type", "application/json");
        request.body(requestParams.toJSONString());
        Response response = request.post("https://api-coffee-testing.herokuapp.com/v1/examen/sameName");
        response.then().log().body();
        response.then().statusCode(200).body("name",equalTo(userId));



    }




    }

