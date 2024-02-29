package newTest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import Files.Payloads;
import Files.reusableMethods;

//  ADD PLACE API
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*RestAssured.baseURI="https://rahulshettyacademy.com";
		String response= given().log().all().queryParam("key ", "qaclick123").header("Content_Type","application/json").body(Payloads.addPlace())
		.when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200)
		.body("scope", equalTo("APP")).header("Server", equalTo("Apache/2.4.41 (Ubuntu)")).extract().response().asString();
		JsonPath js=reusableMethods.rawToJson(response);// parsing json
		 
		String placeId=js.getString("place_id");
		System.out.println(placeId);

	

	//  UPDATE PLACE
	String updatedAdress="70 Summer walk, CANNADA";
	given().log().all().queryParam("key", "qaclick123").header("Content_Type","application/json").
	body("{\r\n"
			+ "\"place_id\":\""+placeId+"\",\r\n"
			+ "\"address\":\""+updatedAdress+"\",\r\n"
			+ "\"key\":\"qaclick123\"\r\n"
			+ "}").when().put("/maps/api/place/update/json").then().assertThat().log().all().statusCode(200)
	.body("msg", equalTo("Address successfully updated"));
	
	
	// GET PLACE
	String getResponse=given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
	.when().get("/maps/api/place/get/json")
	.then().assertThat().log().all().statusCode(200).body("address", equalTo("70 Summer walk, CANNADA"))
	.extract().response().asString();
	JsonPath js1=reusableMethods.rawToJson(getResponse);
	
	String actualAddress=js1.get("address");
	System.out.println(actualAddress);
	Assert.assertEquals(actualAddress,updatedAdress );
	
	
	
	
	*/
	// add place	
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String respons=given().log().all().queryParam("Content-Type", "application/json").queryParam("key", "qaclick123")
		.body("{\r\n"
				+ "    \"location\": {\r\n"
				+ "        \"lat\": -38.383494,\r\n"
				+ "        \"lng\": 33.427362\r\n"
				+ "    },\r\n"
				+ "    \"accuracy\": 50,\r\n"
				+ "    \"name\": \"Frontline house\",\r\n"
				+ "    \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "    \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "    \"types\": [\r\n"
				+ "        \"shoe park\",\r\n"
				+ "        \"shop\"\r\n"
				+ "    ],\r\n"
				+ "    \"website\": \"http://google.com\",\r\n"
				+ "    \"language\": \"French-IN\"\r\n"
				+ "}")
		.when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
		.body("scope", equalTo("APP")).extract().response().asString();
		
	
	JsonPath js= new JsonPath(respons);
	String place_id=js.getString("place_id");
	System.out.println(place_id);
	
	// update place
	
	String updatedAdress="70 Summer walk, CANNADA";
	given().log().all().queryParam("key", "qaclick123").header("Content_Type","application/json").
	body("{\r\n"
			+ "\"place_id\":\""+place_id+"\",\r\n"
			+ "\"address\":\""+updatedAdress+"\",\r\n"
			+ "\"key\":\"qaclick123\"\r\n"
			+ "}").when().put("/maps/api/place/update/json").then().assertThat().log().all().statusCode(200)
	.body("msg", equalTo("Address successfully updated"));
	
	// GET place
	
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String respo=given().log().all().queryParam("Content-Type", "application/json").queryParam("key", "qaclick123")
				.queryParam("place_id ", place_id ).when().get("/maps/api/place/get/json").then().log().all()
				.assertThat().statusCode(200).extract().response().asString();
	
	JsonPath j=new JsonPath(respo);
	String j1=j.get("address");
	System.out.println(j1);
	Assert.assertEquals(updatedAdress, j1);
	
	// delete place
	
	
	
	/*RestAssured.baseURI="https://rahulshettyacademy.com";
	String response=given().log().all().queryParam("Content-Type", "application/json").queryParam("key", "qaclick123")
	.body("{\r\n"
			+ "    \"place_id\":\""+place_id+"\"\r\n"
			+ "}\r\n"
			+ "")
			.when().delete("/maps/api/place/delete/json").
	then().log().all().assertThat().statusCode(200).extract().response().asString();*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
