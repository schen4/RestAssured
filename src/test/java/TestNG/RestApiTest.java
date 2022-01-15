package TestNG;

import org.testng.annotations.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class RestApiTest {

	@Parameters({"API_ENDPOINT"})
	@Test
	public void Test1(String url) {
		given().get(url).then().body("data.id[0]", equalTo(7));
	}
	
	@Test
	public void Test2() {
		Response response = RestAssured.get("https://reqres.in");
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getTime());
		System.out.println(response.getHeader("content-type"));
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	public void Test3() {
		
	}
}
