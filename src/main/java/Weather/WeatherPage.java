package Weather;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Core.TestBase;

public class WeatherPage extends TestBase {

	  WebDriver driver = getDriver();
     //WebDriverWait wait = getWebDriverWait();

	 // public WeatherPage(WebDriver driver) {
		//  this.driver = driver;
		  //PageFactory.initElements(driver, this);
		 // }
	  	  
	  
	private By subMenuElement()
	{
		return 	By.xpath("//a[@id='h_sub_menu']");

	}

	public WeatherPage clickSubMenuElement()
	{
		driver.findElement(subMenuElement()).click();
		return  this;
	}

	private By noThanksButtonElement()
	{
		
		return 	(By.xpath("//a[text()='No Thanks']"));

	}
	
	public WeatherPage clickOnNoThanksButton()
	{
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(noThanksButtonElement()));
		if(driver.findElement(noThanksButtonElement()).isDisplayed())
			driver.findElement(noThanksButtonElement()).click();


		return this;
	
}
	private By weatherLinkElement()
	{
		return 	By.xpath("//a[text()='WEATHER']");

	}

	public TemperaturePage clickWeatherLink()
	{
		driver.findElement(weatherLinkElement()).click();
		return  new TemperaturePage();
	}

	
	

}
