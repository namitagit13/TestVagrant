package Test;

import org.testng.annotations.Test;

import Core.TestBase;
import Weather.TemperaturePage;
import Weather.WeatherPage;


public class TestCases extends TestBase {

	@Test
	public void Testpages()
	{

		WeatherPage weatherPage = new WeatherPage();
		TemperaturePage temperaturePage = null;


		weatherPage.clickOnNoThanksButton();

		weatherPage.clickSubMenuElement();
		temperaturePage = weatherPage.clickWeatherLink(); 


		temperaturePage.enterCity();
		temperaturePage.ClickCityCheckBox();
		temperaturePage.clickPuneMap();
		temperaturePage= temperaturePage.GetTempElementString();
		System.out.println(temperaturePage.getTemperature());
		
		Test01_GET objapi = new Test01_GET();
		boolean compareTemp = objapi.test_01().equals(temperaturePage.getTemperature());
		
		System.out.println(compareTemp);
        
		
	}  
	

}
