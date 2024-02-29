package eComerze;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import Files.Payloads;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import pojo.Createorder;
import pojo.Login;
import pojo.Loginresponse;
import pojo.Orders;

public class Ecomerse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		// LOGIN
		/*String response_login=given().log().all().headers("Content-Type","application/json").body(Payloads.login()).when().post("api/ecom/auth/login")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath jse=new JsonPath(response_login);
		String token= jse.get("token").toString();
		System.out.println("token is " +token);
		String userId= jse.get("userId ").toString();
		System.out.println("userId is" +userId);
		String message= jse.get("message").toString();
		System.out.println("message is " +message);*/
		
		//using spec builders
		
		RequestSpecification req= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").setContentType(ContentType.JSON).build();
		Login login= new Login();
		login.setUserEmail("parvathikishor@gmail.com");
		login.setUserPassword("Krishna@123");
		RequestSpecification login_req=given().log().all().spec(req).body(login);
		Loginresponse login_res=login_req.when().post("api/ecom/auth/login").then().log().all().extract().response().as(Loginresponse.class);
		String token= login_res.getToken();
		System.out.println("token is " +token);
		String userId= login_res.getUserId();
		System.out.println("userId is " +userId);
		 
		
		//Create Product
		
		RequestSpecification res_createProduct= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("Authorization", token).build();
		
		RequestSpecification resq_createProduct=given().log().all().spec(res_createProduct).param("productName", "Laptop")
				.param("productAddedBy", userId).param("productCategory", "fashion")
				.param("productSubCategory", "shirts").param("productPrice", "11500")
				.param("productDescription", "Lenova").param("productFor", "men")
				.multiPart("productImage", new File("C:\\pic.jpg"));
		String response_createProduct= resq_createProduct.when().post("/api/ecom/product/add-product").then().log().all().extract().response().asString();
		JsonPath jse=new JsonPath(response_createProduct);
		String productId=jse.get("productId");
		System.out.println("productId is " +productId);
		
		//Create order
		Createorder cr= new Createorder();
		Orders o= new Orders();
		o.setCountry("Benin");
		o.setProductOrderedId(productId);
		List<Orders> orderDetailList= new ArrayList<Orders>();
		orderDetailList.add(o);
	
		cr.setOrders(orderDetailList);
		
		RequestSpecification resq_CreateOrder=given().log().all().spec(res_createProduct).header("Content-Type","application/json")
				.body(cr);
		
		String response_CreateOrder=resq_CreateOrder.when().post("/api/ecom/order/create-order").then().log().all().extract().response().asString();
		JsonPath jse1=new JsonPath(response_CreateOrder);
		String orders=jse1.getString("orders");
		String order=orders.replaceAll("\\W", "");
		System.out.println("orders no is " +order);
		
		
		
		//Get Product 
		 RequestSpecification res_delete= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				 .setContentType(ContentType.JSON).addHeader("Authorization", token).build();
		 
		 RequestSpecification request_delete= given().log().all().spec(res_delete).queryParam("id",order);
		 request_delete.when().get("/api/ecom/order/get-orders-details").then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		
		//Delete Product
		 
			 RequestSpecification request_deletereq=given().log().all().spec(res_delete).pathParam("productId", productId);
		String h= request_deletereq.when().delete("api/ecom/product/delete-product/{productId}").then().log().all().extract().response().asString();
		 
		 
		 
		 
		 
		 
		 
	}

}
