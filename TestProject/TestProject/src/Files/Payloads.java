package Files;

public class Payloads {

	public static String addPlace() {
		// TODO Auto-generated method stub
return "{\r\n"
		+ "  \"location\": {\r\n"
		+ "    \"lat\": -38.383494,\r\n"
		+ "    \"lng\": 33.427362\r\n"
		+ "  },\r\n"
		+ "  \"accuracy\": 50,\r\n"
		+ "  \"name\": \"Frontline house\",\r\n"
		+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
		+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
		+ "  \"types\": [\r\n"
		+ "    \"shoe park\",\r\n"
		+ "    \"shop\"\r\n"
		+ "  ],\r\n"
		+ "  \"website\": \"http://google.com\",\r\n"
		+ "  \"language\": \"French-IN\"\r\n"
		+ "}\r\n"
		+ "";

}
	
	public static String Courses() {
		return "{\r\n"
				+ "\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\r\n"
				+ "\"purchaseAmount\": 910,\r\n"
				+ "\r\n"
				+ "\"website\": \"rahulshettyacademy.com\"\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "\"courses\": [\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Selenium Python\",\r\n"
				+ "\r\n"
				+ "\"price\": 50,\r\n"
				+ "\r\n"
				+ "\"copies\": 6\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Cypress\",\r\n"
				+ "\r\n"
				+ "\"price\": 40,\r\n"
				+ "\r\n"
				+ "\"copies\": 4\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"RPA\",\r\n"
				+ "\r\n"
				+ "\"price\": 45,\r\n"
				+ "\r\n"
				+ "\"copies\": 10\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "]\r\n"
				+ "\r\n"
				+ "}";

	}
	
	public static String library(String isbn, String aisle) {
		
	/*	String payload="\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "";
		return payload;*/
		
		String payload= "{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}\r\n"
				+ "";
		
		
		return payload;
	}
	
public static String payload() {
		
		String payLoad= "{\r\n"
				+ "\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\r\n"
				+ "\"purchaseAmount\": 910,\r\n"
				+ "\r\n"
				+ "\"website\": \"rahulshettyacademy.com\"\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "\"courses\": [\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Selenium Python\",\r\n"
				+ "\r\n"
				+ "\"price\": 50,\r\n"
				+ "\r\n"
				+ "\"copies\": 6\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Cypress\",\r\n"
				+ "\r\n"
				+ "\"price\": 40,\r\n"
				+ "\r\n"
				+ "\"copies\": 4\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"RPA\",\r\n"
				+ "\r\n"
				+ "\"price\": 45,\r\n"
				+ "\r\n"
				+ "\"copies\": 10\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "]\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "";
		return payLoad;
		
	}


public static String Lib(String isbn, String aisle) {
	
	String Libra="{\r\n"
			+ "\r\n"
			+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
			+ "\"isbn\":\""+isbn+"\",\r\n"
			+ "\"aisle\":\""+aisle+"\",\r\n"
			+ "\"author\":\"John foe\"\r\n"
			+ "}\r\n"
			+ "";
	return Libra;
	
}

public static String login(){
	
	String login= "{\r\n"
			+ "    \"userEmail\": \"parvathikishor@gmail.com\",\r\n"
			+ "    \"userPassword\": \"Krishna@123\"\r\n"
			+ "}";
	return login;
	
}
public static String kkk(){
	
	String login= "{\r\n"
			+ "    \"orders\": [\r\n"
			+ "        \"64c4cd787244490f958f989d\"\r\n"
			+ "    ],\r\n"
			+ "    \"productOrderId\": [\r\n"
			+ "        \"64c4cc327244490f958f977e\"\r\n"
			+ "    ],\r\n"
			+ "    \"message\": \"Order Placed Successfully\"\r\n"
			+ "}";
	return login;
	
}




}


