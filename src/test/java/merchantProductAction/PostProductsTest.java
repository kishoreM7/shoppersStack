package merchantProductAction;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;

/**
 * 
 * @author kishore mallarapu
 *
 */
public class PostProductsTest {

	@Test
	public void postProductsTest() {

		baseURI = "https://www.shoppersstack.com/shopping";
		/*
		 * HashMap map = new HashMap<>(); map.put("email",
		 * "harshithahrngowda@gmail.com"); map.put("password", "Harshitha@12");
		 * map.put("role", "MERCHANT");
		 * 
		 * given().body(map).contentType(ContentType.JSON).post("/users/login").then().
		 * log().all();
		 */
		File obj = new File("./src/test/resources/merchant.json");

		given().given().body(obj).contentType(ContentType.JSON).auth().oauth2(
				"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJoYXJzaGl0aGFocm5nb3dkYUBnbWFpbC5jb20gTUVSQ0hBTlQiLCJleHAiOjE2ODE5MjY2NTUsImlhdCI6MTY4MTg5MDY1NX0.pQoUWXmTNVuyCgH43MgzX6GIwxhd65C8py3Qi1PWcUA")
				.queryParam("merchantId", 20261).when().post("/products").then().statusCode(201).log().all();

	}

}
