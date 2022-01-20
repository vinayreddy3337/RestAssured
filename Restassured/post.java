package Rest;

import static io.restassured.RestAssured.*;
import org.junit.Test;

@Test
public class PutPost 
{


baseURI = "https://reqres.in/api";
RequestSpecification request = RestAssured.given();
request.header("Key1", "Value1");
request.header("Key2", ""+Value2+""); //If value is getting capture from other variable
	
JSONObject requestParams = new JSONObject();
requestParams.put("firstname", "George"); 
requestParams.put("lastname", "Jhon");
request.
	body(requestParams.toString());
Response response = request.post(""); 
  
int StatusCode = response.getStatusCode(); 
System.out.println("Status code : " + StatusCode);       
System.out.println("Response body: " + response.body().asString()); //Get Response Body
}

	    }
