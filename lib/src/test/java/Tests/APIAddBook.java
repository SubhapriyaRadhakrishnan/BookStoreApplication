package Tests;

import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.json.JsonException;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIAddBook {
	
	@Test
	   public void login() throws JsonException
	   {
		
		RestAssured.baseURI = "https://bookstore.toolsqa.com"; 
		RequestSpecification request = RestAssured.given(); 
		JSONObject requestParams = new JSONObject(); 
		requestParams.put("userId", "TQ123"); 
		requestParams.put("isbn", "9781449325862");
		
		request.header("Content-Type", "application/json");  
		   String son = new Json().toJson(requestParams);
		    request.body(son);
		    Response response = request.post("/BookStore/v1/Books"); 
		    System.out.println("The status received: " + response.statusLine());
		    
		
	}

}
