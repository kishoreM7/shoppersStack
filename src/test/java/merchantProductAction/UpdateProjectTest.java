package merchantProductAction;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import java.io.File;
import java.util.HashMap;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

/**
 * 
 * @author kishore mallarapu 404 - un authorised
 */
public class UpdateProjectTest {
	@Test
	public void updateProjectTest() {
		baseURI = "https://www.shoppersstack.com/shopping";
		/*
		 * HashMap map = new HashMap<>(); map.put("email",
		 * "harshithahrngowda@gmail.com"); map.put("password", "Harshitha@12");
		 * map.put("role", "MERCHANT");
		 */

//		given().body(map).contentType(ContentType.JSON).post("/users/login").then().log().all();
		File obj1 = new File("./src/test/resources/update.json");

		given().given().body(obj1).queryParam("productId", 392).contentType(ContentType.JSON).auth().oauth2(
				"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJoYXJzaGl0aGFocm5nb3dkYUBnbWFpbC5jb20gTUVSQ0hBTlQiLCJleHAiOjE2ODE5NDQzODMsImlhdCI6MTY4MTkwODM4M30.qBrncFwQQx8CU_G-W4uDd1OcW8bwuqTNH3HbcU4KIOo")
				.when().put("/products").then().log().all();
	}

}
