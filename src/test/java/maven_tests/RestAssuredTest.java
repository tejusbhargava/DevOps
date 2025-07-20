package maven_tests;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class RestAssuredTest {
    @Test(description = "This is a API test")
    @Severity(SeverityLevel.CRITICAL)
    @Epic("Testing API request at Git hub")
    @Feature("To get list of users")
    @Story("User sends API get request")
    @Owner("Tejus RestAssured")
	
	    @BeforeClass
	    public void setup() {
	        RestAssured.baseURI = "https://reqres.in/api";
	    }

	    @Test
	    public void verifyUsersEndpoint() {
	        given()
	            .queryParam("page", 2)
	        .when()
	            .get("/users")
	        .then()
	            .statusCode(200)
	            .body("data", notNullValue());
	        System.out.println("Rest Assured test case executed");
	    }
}
