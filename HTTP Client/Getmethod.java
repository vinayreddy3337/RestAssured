import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

	public class GetMethod 
  {
		@Test
	public void test12Get() throws ClientProtocolException, IOException
  {
	
	
		CloseableHttpClient  Httpclient= HttpClients.createDefault();
		HttpGet  httpget= new HttpGet("https://reqres.in/api/users?page=2");
		System.out.println("request type: "+httpget.getMethod());
		CloseableHttpResponse response = Httpclient.execute(httpget);
		System.out.println(response);
	}
	}
