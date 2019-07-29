package qa.test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Getweather {
	
	
	@Test
	public void getweatherdetail()
	{
		given()
		.when()
		     .get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		
		.then()
		    .statusCode(200)
		    .statusLine("HTTP/1.1 200 OK")
		    .log().all()
		    .assertThat()
		    .body("City", equalTo("Hyderabad"));
	
		
	}


}
