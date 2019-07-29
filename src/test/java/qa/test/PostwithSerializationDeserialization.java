package qa.test;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import junit.framework.Assert;
import qa.util.Student;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostwithSerializationDeserialization {
	
	Student stu;
	
	@Test(priority=1)
	public void postwithSerializationdeserialization()
	
	{
		stu=new Student();
		
		stu.setEmail("rishabh.goyal1989@gmai.com");
		stu.setFirstname("Rishabh");
		stu.setLastname("Goyal");
		stu.setPassword("123@");
		stu.setUsername("rishengi01");
		
		
		given()
		.contentType(ContentType.JSON)
		.body(stu)
		.when()
		.post("http://restapi.demoqa.com/customer/register")
		.then()
		.statusCode(201)
		.log().all();
		

		
	}
	
	
	@Test(priority=2)
	public void getdatabydeserialization()
	{
		Student stud=get("http://restapi.demoqa.com/customer").as(Student.class);
		System.out.println(stud.getFirstname());
		Assert.assertEquals(stud.getFirstname(), "Rishabh" );
	}

}
