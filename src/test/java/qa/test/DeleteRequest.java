package qa.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class DeleteRequest {
	
	int empid=11234;
	
	@BeforeClass
	public void deletereq()
	{
		
		RestAssured.baseURI="http://dummy/restapiexample.com/v1/employee";
		RestAssured.basePath="/delete/11234";
		
	}
	
	@Test
	public void testdelete()
	{
		
		Response resp=
		given()
		.when().delete()
		.then()
		.statusLine("Rishabh")
		.log().all()
	.extract().response();
		
		
		String jsonasstring=resp.asString();
		
		
		Assert.assertEquals(jsonasstring.contains("deleted"), true );
	}

}
