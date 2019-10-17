package stepDefinationTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class getinfo {
	
	private Response response;
	private RequestSpecification request;
	
	@Given("^countrycode \"([^\"]*)\" and statecode \"([^\"]*)\"$")
	public void countrycode_and_statecode(String countrycode, String statecode) throws Throwable {
	   request = (RequestSpecification) given()
			   .pathParams("countrycode",countrycode)
			   .pathParams("statecode",statecode);
	}

	@When("^a user go to \"([^\"]*)\"$")
	public void a_user_go_to(String arg1) throws Throwable {
	   response=request.when().get(uri);
	}

	@Then("^GroupKT the statue code is (\\d+)$")
	public void groupkt_the_statue_code_is(int statuscode) throws Throwable {
	    response.then().statusCode(statuscode);
	}

	@Then("^GroupKT response includes \"([^\"]*)\" is USA$")
	public void groupkt_response_includes_is_USA(String path, String expData) throws Throwable {
	    response.then().body(path, is(expData));
	}
}
