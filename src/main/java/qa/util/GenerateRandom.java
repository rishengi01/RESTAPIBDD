package qa.util;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class GenerateRandom {
	
	public static String getfirstname()
	{
		String firstnamestring= RandomStringUtils.randomAlphabetic(1);
		
		return ("Rishabh"+firstnamestring);
		
	}
	
	public static String getlastname()
	{
		String lastnamestring= RandomStringUtils.randomAlphabetic(1);
		
		return ("Goyal"+lastnamestring);
		
	}
	
	public static String getusername()
	{
		String usernamestring= RandomStringUtils.randomAlphabetic(3);
		
		return ("John"+usernamestring);
		
	}
	
	public static String getpassword()
	{
		String passwordstring= RandomStringUtils.randomAlphabetic(3);
		
		return ("John"+passwordstring);
		
	}
	
	public static String getemail()
	{
		String getemailstring= RandomStringUtils.randomAlphabetic(3);
		
		return (getemailstring+"gmail.com");
		
	}
	
	
	

}
