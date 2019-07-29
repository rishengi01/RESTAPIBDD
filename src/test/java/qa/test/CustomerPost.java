package qa.test;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import qa.util.GenerateRandom;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CustomerPost {

	public static HashMap<String,String> map=new HashMap<String, String>();
	@BeforeClass
	public void postdata()
	{
		
		
	
		map.put("FirstName", GenerateRandom.getfirstname());
		map.put("LastName", GenerateRandom.getlastname());
		map.put("Username", GenerateRandom.getusername());
		map.put("Password", GenerateRandom.getpassword());
		map.put("Email", GenerateRandom.getemail());
		
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
		
	}
	
	@Test
	public void testpost()
	{
	 
		
		given().contentType("application/json")
		  .body(map)
		.when()
		.post()
		
		.then()
		.statusCode(201)
		.body("SuccessCode", equalTo("OPERATION_SUCCESS"));
		
		
		
		
		
	}
	
	
	
	
	
	
}
