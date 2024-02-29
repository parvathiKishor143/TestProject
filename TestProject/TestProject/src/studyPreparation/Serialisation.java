package studyPreparation;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo1.GoogleMaps;
import pojo1.Location;

public class Serialisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://rahulshettyacademy.com";
		GoogleMaps google= new GoogleMaps();
		Location Loc= new Location();
		Loc.setLat(-38.383494);
		Loc.setLng(33.427362);
		google.setLocation(Loc);
		google.setAccuracy(50);
		google.setName("Frontline house");
		google.setPhone_number("9838933937");
		google.setAddress("29, side layout, cohen 09");
		List<String> types= new ArrayList<String>();
		types.add("shoe park");
		types.add("shop");
		google.setTypes(types);
		google.setLanguage("French-IN");
		
		
		Response R= given().log().all().queryParam("key ", "qaclick123").header("Content_Type","application/json")
				.body(google).post("/maps/api/place/add/json").then().extract().response();
		String response= R.asString();
		System.out.print(response);
		
	}

}
