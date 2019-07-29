package qa.test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Simplevalidation {
	
	@Test(priority=1)
	public void validations()
	{
		given()
		
		.when()
		  .get("http://jsonplaceholder.typicode.com/posts/5")
		  
		.then()
		 .statusCode(200)
		 .log().all();
	
		
	}
	
	
	@Test(priority=2)
	public void validations2()
	{
		given()
		
		.when()
		 // .get("http://jsonplaceholder.typicode.com/posts/5")
		  .get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
		 .statusCode(200)
		 .log().all();
	
		
	}
	
	//validate single content
	@Test(priority=3)
	public void validations3()
	{
		given()
		
		.when()
		 // .get("http://jsonplaceholder.typicode.com/posts/5")
		 // .get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.get("https://reqres.in/api/users")
		.then()
		 .statusCode(200)
		 .log().all()
		 .body("data[0].email",equalTo("george.bluth@reqres.in"));
	
		
	}
	
	
	
	//validate multiple content
		@Test(priority=4)
		public void validations4()
		{
			given()
			
			.when()
			 // .get("http://jsonplaceholder.typicode.com/posts/5")
			 // .get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
			.get("https://reqres.in/api/users")
			.then()
			 .statusCode(200)
			 .log().all()
			 .body("data.email",hasItems("george.bluth@reqres.in","janet.weaver@reqres.in"));
		
			
		}
		
		//add param and header
				@Test(priority=5)
				public void validations5()
				{
					given()
					 .header("Content-Type","application/json")
					
					.when()
					 // .get("http://jsonplaceholder.typicode.com/posts/5")
					 // .get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
					.get("https://reqres.in/api/users")
					.then()
					 .statusCode(200)
					 .log().all()
					 .body("data.email",hasItems("george.bluth@reqres.in","janet.weaver@reqres.in"));
				
					
				}
	
	
}
