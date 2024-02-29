package Jira;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import java.util.List;

import io.restassured.RestAssured;
import pojo.addPlace;
import pojo.locationn;

public class testSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.baseURI="https://rahulshettyacademy.com";
addPlace a=new addPlace();
locationn l= new locationn();
l.setLat(-38.383494);
l.setLng(33.427362);
a.setLocation(l);
a.setAccuracy(50);
a.setName("Frontline house");
a.setPhone_number("(+91) 983 893 3937");
a.setAddress("29, side layout, cohen 09");
List<String> types= new ArrayList<String>();
types.add("shoe park");
types.add("shop");
a.setTypes(types);
a.setWebsite("http://google.com");
a.setLanguage("French-IN");


given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(a).
when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200).extract().response().asString();


	}

}
