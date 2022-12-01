package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utility {
	
	RequestSpecification reqSpec;
	RequestSpecBuilder rqBuilder;
	ResponseSpecification respSpec;
	ResponseSpecBuilder respBuilder;
	RequestSpecification myrq;
	RequestSpecBuilder builder;
	public RequestSpecification genReqSpec() {
		//logging
		if (reqSpec ==null){
		
		PrintStream log = null;
		try {
			log = new PrintStream(new FileOutputStream("logging.txt"));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//request specifications
		rqBuilder = new RequestSpecBuilder();
		//rqBuilder.addQueryParam("limit", "3");
		rqBuilder.setContentType(ContentType.JSON);
		//rqBuilder.addParam("res", "jewelery");
		rqBuilder.setBaseUri(getGlobalValue("baseurl"));
		rqBuilder.addFilter(RequestLoggingFilter.logRequestTo(log));
		rqBuilder.addFilter(ResponseLoggingFilter.logResponseTo(log));

		reqSpec =rqBuilder.build();
		return reqSpec;
		}
		return reqSpec;
		
	}
	
	
	public ResponseSpecification genRespSpec() {
		respBuilder = new ResponseSpecBuilder();
		respBuilder.expectStatusCode(200);
		
		respSpec = respBuilder.build();
		return respSpec;
	}
	

	
	public static String getGlobalValue(String key) {
		
		Properties prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("..\\ecomm\\src\\test\\java\\resources\\global.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
		
	}
	
	public String getJsonPath(Response response,String key) {
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		return js.get(key).toString();
		
	}

	public RequestSpecification catSpec() {
		if (myrq ==null){
			
			PrintStream log = null;
			try {
				log = new PrintStream(new FileOutputStream("categoryLogs.txt"));
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		builder = new RequestSpecBuilder();
		builder.setContentType(ContentType.JSON);
		
		builder.setBaseUri(getGlobalValue("baseurl"));
		builder.addPathParam("category", "jewelery");
		builder.addFilter(RequestLoggingFilter.logRequestTo(log));
		builder.addFilter(ResponseLoggingFilter.logResponseTo(log));

		return myrq =	builder.build();
		
	}
		return myrq;
	}
}
