package TestNG;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
//import io.restassured.module.jsv.JsonSchemaValidator.*;
//import io.restassured.response.Response;

import java.math.BigDecimal;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
 // @Test
 /* public void Test1() {
	  Response response = RestAssured.get("https://reqres.in/api/users?page=2");  //reqres.in is a mock RESTful web service
	  
	  System.out.println(response.asString());
	  System.out.println(response.getBody().asString());
	  System.out.println(response.getStatusCode());
	  System.out.println(response.getStatusLine());
	  System.out.println(response.getHeader("content-type"));
	  System.out.println(response.getTime());
	  
	  int statusCode = response.getStatusCode();
	  Assert.assertEquals(statusCode, 200);
  }*/
  
  @Test 
  public void Test2() {
	  //Example: get("/lotto").then().body("lotto.lottoId", equalTo(5));
	  given().get("https://reqres.in/api/users?page=2").then().body("data.id[0]", equalTo(9));
	  given().
      	formParam("formParamName", "value1").
      	queryParam("queryParamName", "value2").
      when().
      	post("/something");
  }
  
 /* public void Test3() {
	  
	 // get("/price").then().body("price", is(12.12f));
	  given().
      	config(RestAssured.config().jsonConfig(jsonConfig().numberReturnType(BIG_DECIMAL))).
      when().
      	get("/price").
      then().
      	body("price", is(new BigDecimal(12.12)));
      	
     Authentication:
     -basic auth
      given().auth().basic("username", "password").when().get("/secured/hello").then().statusCode(200);
     -0Auth
      given().auth().oauth2(accessToken)
      
    Request body:
      given().body("some body"). .. // Works for POST, PUT and DELETE requests
	  given().request().body("some body"). .. // More explicit (optional)
      
  }*/
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
