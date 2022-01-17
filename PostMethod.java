import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

public class PostMethod {

	
	
	
	@Test
public void testpostmethod() throws ClientProtocolException, IOException {
	

	
	CloseableHttpClient  Httpclient= HttpClients.createDefault();
	HttpPost  httpPost= new HttpPost("https://reqres.in/api/users?page=2");
	System.out.println("request type: "+httpPost.getMethod());
	CloseableHttpResponse response = Httpclient.execute(http);
	System.out.println(response);
}
}







