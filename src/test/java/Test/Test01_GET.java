package Test;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_GET {

	@Test
	String test_01(){



		//Response response = RestAssured.get("api.openweathermap.org/data/2.5/weather?q=pune&appid=7fe67bf08c80ded756e598d6f8fedaea)");

		//RestAssured.given().get("https://api.openweathermap.org/data/2.5/weather?q=pune&appid=7fe67bf08c80ded756e598d6f8fedaea").then().log().all();

		//System.out.println(response.getBody().asString());
		//System.out.println(response.getStatusCode());

        Response response = RestAssured.given().get("https://api.openweathermap.org/data/2.5/weather?q=pune&appid=7fe67bf08c80ded756e598d6f8fedaea");
        
        double temp = response.jsonPath().getDouble("main.temp");
        System.out.println(temp-273.15);
                
        String total2 = String.valueOf(temp);
        return total2;
        
	}
	
	
}