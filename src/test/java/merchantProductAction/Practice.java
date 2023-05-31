package merchantProductAction;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Practice {
	@Test
	public void validater() {
		/*
		 * baseURI = "https://reqres.in/"; Response resp =
		 * when().get("api/users?page=2"); //
		 * resp.then().assertThat().body(matchesJsonSchemaInClasspath(h)); //
		 * resp.then().assertThat().statusCode(200).time(Matchers.lessThan(5L), //
		 * TimeUnit.SECONDS);
		 * resp.then().assertThat().log().all().time(Matchers.lessThan(2000L),
		 * TimeUnit.MILLISECONDS) .body(Matchers.instanceOf(Map.class));
		 */
		Response res = given().formParam("jhdbwj", "jffejef").formParam("sajbcsa", "sJSCSCJ")
				.formParam("aajns", "jhcbjss").when().post("jhbchbchc");
		String token = res.jsonPath().get("access_token");

		given().auth().oauth2(token).when().post("jshsj");

	}
}
