package Rest;

import  static io.restassured.RestAssured.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class GetTest
{
@Test
	public void testGet() 
  {
		
	baseURI= "https://reqres.in/api";
	
	given().
	get("/users?page=2").
	
then().
statusCOde(200).
body("data[4].first_name".equals("George")).
 	
	
	}
	
	
}
