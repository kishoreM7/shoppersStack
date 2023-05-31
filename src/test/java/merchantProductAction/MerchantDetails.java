package merchantProductAction;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

/**
 * 
 * @author kishore mallarapu
 *
 */
public class MerchantDetails {
	@Test
	public void MerchantDetailsTest() {

		baseURI = "https://www.shoppersstack.com/shopping";
//		HashMap map = new HashMap<>();
//		map.put("email", "harshithahrngowda@gmail.com");
//		map.put("password", "Harshitha@12");
//		map.put("role", "MERCHANT");
//
//		given().body(map).contentType(ContentType.JSON).post("/users/login").then().log().all();
		given().pathParam("merchantId", 20261).auth().oauth2(
				"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJoYXJzaGl0aGFocm5nb3dkYUBnbWFpbC5jb20gTUVSQ0hBTlQiLCJleHAiOjE2ODE5MzI5MDMsImlhdCI6MTY4MTg5NjkwM30.hr_hOvH13zcpQnoQJpnbH_sMp46TRf_hN_LcXeM_4Rs")
				.when().get("/products/merchant/{merchantId}").then().assertThat().statusCode(200).log().all();

	}
}