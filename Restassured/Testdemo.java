package testdemo;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PinterApiTest
{
    @Test
    public void getPhone()
    {
        given()
                .queryParam("id",1)
                .log().all()
                .when()
                .get("http://82.156.74.26:9088/pinter/com/phone/1")
                .then()
                .log().all()
                .statusCode(200)
                .body("message", equalTo("success"))
                .body("data.cpuCore",equalTo("843"))
                .body("data.id",greaterThanOrEqualTo(1));  //lessThanOrEqualTo ,greaterThanOrEqualTo
               
    }
