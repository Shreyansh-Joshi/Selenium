package Shreyansh.Project1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC001_GET_Request {
	
	@Test
	public void getwhetherdetails()
	{
		Response resp = RestAssured.get("https://www.facebook.com/");
		int code = resp.getStatusCode();
		System.out.println("Status Code Is:"+code);
		Assert.assertEquals(code,200);
	}

}
