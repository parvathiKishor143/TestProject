package Jira;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import Files.Payloads;
import Files.reusableMethods;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

public class Studing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*JsonPath jse= new JsonPath(Payloads.payload());

//1. Print No of courses returned by API
int noCopies= jse.getInt("courses.size()");
System.out.println("No of courses returned by API" +noCopies);
		
// 2.Print Purchase Amount	
int purchaseAmount=jse.getInt("dashboard.purchaseAmount");
System.out.println("Purchase Amount " +purchaseAmount);

//3. Print Title of the first course
String Title="";

for(int i=0; i<=noCopies;i++) {
	 Title=jse.get("courses.title[0]").toString();
	 
	}
System.out.println(Title);

//4. Print All course titles and their respective Prices

for(int i=0; i<noCopies;i++) {
	 Title=jse.get("courses.title["+i+"]");
	 System.out.println(Title);
	 System.out.println(jse.get("courses.price["+i+"]").toString());
	}

//5. Print no of copies sold by RPA Course
for(int i=0; i<noCopies;i++) {
	 Title=jse.get("courses.title["+i+"]");
	
	 if(Title.equalsIgnoreCase("RPA")) {
		 System.out.println(jse.get("courses.copies["+i+"]").toString());
		 break;
	 }

}

// 6. Verify if Sum of all Course prices matches with Purchase Amount
int sum=0;

for(int i=0;i<noCopies;i++) {
	int copies=jse.get("courses.copies["+i+"]");
	int price=jse.get("courses.price["+i+"]");
	int av=copies*price;
	sum=sum+av;
}
System.out.println(sum);
Assert.assertEquals(purchaseAmount, sum);

//**************************************************************************
		
		
		String url= "https://rahulshettyacademy.com/getCourse.php?code=4%2F0AZEOvhUML0LyeO6rKmD74C8WaMZsE0_QhO1brEtyjZBqqfkvO5q2RPtpjXJL6fBMdhGxWA&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=none";		
		String cod= url.split("code=")[1];
		String code=cod.split("&scope=")[0];
		
		
		
		String resp= given().log().all().urlEncodingEnabled(false).queryParam("code", code)
				
		.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
        .queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
        .queryParams("grant_type", "authorization_code")
        .queryParams("state", "verifyfjdss")
        //.queryParams("session_state", "ff4a89d1f7011eb34eef8cf02ce4353316d9744b..7eb8")
        .queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php").when()
        .post("https://www.googleapis.com/oauth2/v4/token").then().log().all().extract().response().asString();
		
		JsonPath jse=new JsonPath(resp);
		String accessToken= jse.getString("access_token");
		System.out.println(accessToken);
		
		given().header("Content_Type","application/json")
		.queryParam("access_token", accessToken).expect().defaultParser(Parser.JSON).when().
		get("https://rahulshettyacademy.com/getCourse.php").then().log().all().extract().response().asString();*/
		
		
		JsonPath jse= new JsonPath(Payloads.kkk());
		String f=jse.getString("orders");
		String fi= f.replaceAll("\\W", "");
		System.out.println(fi);
		
		
		
		
		
		
	}
	
















	
}
