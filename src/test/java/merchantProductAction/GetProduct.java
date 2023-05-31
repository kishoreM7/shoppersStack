package merchantProductAction;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

/**
 * 
 * @author kishore mallarapu
 *
 */
public class GetProduct {
	@Test
	public void getProductTest() {
		baseURI = "https://www.shoppersstack.com/shopping";
//		HashMap map = new HashMap<>();
//		map.put("email", "harshithahrngowda@gmail.com");
//		map.put("password", "Harshitha@12");
//		map.put("role", "MERCHANT");

		given().auth().oauth2(
				"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJoYXJzaGl0aGFocm5nb3dkYUBnbWFpbC5jb20gTUVSQ0hBTlQiLCJleHAiOjE2ODE5MjY2NTUsImlhdCI6MTY4MTg5MDY1NX0.pQoUWXmTNVuyCgH43MgzX6GIwxhd65C8py3Qi1PWcUA")
				.queryParam("zoneId", "MYSURU20282").when().get("/products").then().assertThat().statusCode(200)
				.contentType(ContentType.JSON).log().all();

	}

}
