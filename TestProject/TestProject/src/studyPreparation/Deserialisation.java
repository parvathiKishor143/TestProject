package studyPreparation;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;
import pojo.getCourse;
import pojo.webAutomation;

public class Deserialisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String expected[]= {"Selenium Webdriver Java","Cypress","Protractorrr"};
		String response=given().formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com").
		formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W").
		formParam("grant_type", "client_credentials").
		formParam("scope", "scope").when()
		.post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token")
		.then().extract().response().asString();
		System.out.println(response);
		JsonPath js= new JsonPath(response);
		
		String access_token=js.getString("access_token");
		System.out.println(access_token);
		
		getCourse response1= given().queryParam("access_token", access_token)
		.when().get("https://rahulshettyacademy.com/oauthapi/getCourseDetails")
		.then().extract().response().as(getCourse.class);
		
		List<webAutomation> webauto= response1.getCourses().getWebAutomation();
		
		ArrayList<String> actual = new ArrayList<String>(); // array list used as the data is dynamic in nature
		for(int i=0;i<webauto.size();i++) {
			actual.add(webauto.get(i).getCourseTitle());
		}
		
		
		List<String> expectedArray= Arrays.asList(expected);// covert to array list 
		
		Assert.assertTrue(actual.equals(expectedArray));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
