package merchantProductAction;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

/**
 * 
 * @author kishore mallarapu
 *
 */
public class DeleteProduct {
	@Test
	public void deleteProduct() {
		baseURI = "https://www.shoppersstack.com/shopping";
		given().pathParam("productId", 395).auth().oauth2(
				"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJoYXJzaGl0aGFocm5nb3dkYUBnbWFpbC5jb20gTUVSQ0hBTlQiLCJleHAiOjE2ODE5MjY2NTUsImlhdCI6MTY4MTg5MDY1NX0.pQoUWXmTNVuyCgH43MgzX6GIwxhd65C8py3Qi1PWcUA")
				.queryParam("zoneId", "MYSURU20282").when().delete("/products/{productId}").then().assertThat()
				.statusCode(200).log().all();
		

	}

}
