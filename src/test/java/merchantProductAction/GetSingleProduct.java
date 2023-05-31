package merchantProductAction;

import static io.restassured.RestAssured.baseURI;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

/**
 * 
 * @author kishore mallarapu
 *
 */
public class GetSingleProduct {
	@Test
	public void GetSingleProduct() {
		baseURI = "https://www.shoppersstack.com/shopping";
		given().pathParam("productId", 387).when().get("/products/{productId}").then().assertThat().statusCode(200)
				.contentType(ContentType.JSON).log().all();

	}
}