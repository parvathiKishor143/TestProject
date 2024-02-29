package Jira;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Files.Payloads;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class studing2 {
 @ Test (dataProvider="add")
 public static void library(String isbn, String aisle) {
	 
	 RestAssured.baseURI="http://216.10.245.166";
		String response= given().log().all().header("Content-Type","application/json").body(Payloads.Lib(isbn, aisle))
		.when().post("Library/Addbook.php").then().log().all().assertThat().statusCode(200).extract().response().asString();
		System.out.println(response);
		JsonPath jse= new JsonPath(response);

		String id= jse.getString("ID");

		// Resource : /Library/GetBook.php?AuthorName=somename         Method : GET 

		/*String respons=given().log().all().when().get("Library/GetBook.php?ID="+id+"").
		then().log().all().assertThat().statusCode(200).extract().response().asString();
		System.out.println(respons);*/
		
		// 1.	Resource :/Library/DeleteBook.php      Method : POST

		String respons =given().log().all().header("Content-Type","application/json").body("{\r\n"
				+ " \r\n"
				+ "\"ID\" : \""+id+"\"\r\n"
				+ " \r\n"
				+ "} \r\n"
				+ "").when().post("/Library/DeleteBook.php").then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(respons);
		}
 
 @ DataProvider (name="add")
 
 public Object[][] values() {
	 return  new Object[][]{{"bbb9bds","ko27"}};
	
	 
 }

 }

