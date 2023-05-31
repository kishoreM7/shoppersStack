package merchantProductAction;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Hello {
	@Test
	public void hello() {
//		baseURI = "https://reqres.in/";
		Response resp = when().get("https://reqres.in/api/users/2"); //
		File json = new File("./target/schema.json");
		resp.then().assertThat().body(matchesJsonSchemaInClasspath("schema.json")); //
		resp.then().assertThat().statusCode(200);

	}

}
