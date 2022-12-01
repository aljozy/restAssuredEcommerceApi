package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import resources.TestDataBuild;
import resources.Utility;
import static org.junit.Assert.assertEquals;

public class ProdStepDef extends Utility {
	RequestSpecification reqSpec;
	Response response;
	ValidatableResponse vresp;
	TestDataBuild data = new TestDataBuild();
	
	@Given("user is calling product api")
	public void get_all_products_api() {
		
		reqSpec = given().spec(genReqSpec());

	}
	
	@Given("user is add new product with {string} {string}{string}")
	public void user_is_add_new_product_with(String title, String price, String category) {
		reqSpec =given().spec(genReqSpec())
				.when().body(data.myProduct(title, Double.parseDouble(price), category));
				
	}
	
	
	@When("user call the {string} with {string} http method")
	public void user_call_the_with_http_method(String apiName, String method) {
		
		if(method.equalsIgnoreCase("get")) {
		
		response =reqSpec.when().get("/products");
		}
		else if(method.equalsIgnoreCase("post")){
			 response=	reqSpec.post("/products");
			 
		}
		else if(method.equalsIgnoreCase("put")) {
			response = reqSpec.put("/products/1");
		}
		else if(method.equalsIgnoreCase("delete")) {
			response = reqSpec.delete("/products/2");
		}
		else {
			System.err.println("invalid method name");
			System.exit(0);
		}
	}
	@Then("the API call is success with status code {int}")
	public void the_api_call_is_success_with_status_code(int statusCode) {
	   
		assertEquals(response.getStatusCode(),statusCode);
		
	}

	

	
	
	
	
	
	
	@Then("title of the product is {string}")
	public void title_of_the_product_is(String expectedTitle) {
		String actualTitle =getJsonPath(response, "title");
		assertEquals(expectedTitle,actualTitle);
	    
	}

	
	@When("user calling the categories with type jewelery")
	public void user_calling_the_categories_with_type_jewelery(){
	   response= given().spec(catSpec())
			   .when().
	    get("products/category/{category}");
	}
	@Then("user gets all the categories available")
	public void user_gets_all_the_categories_available() {
			response.then().log().body();
	}

	@Given("user update the product details with new data")
	public void user_is_able_to_update_a_product() {
	  
	
	reqSpec=  given().spec(reqSpec)
	  .body(data.updatedProduct());
	  
	  
	}
	




}
