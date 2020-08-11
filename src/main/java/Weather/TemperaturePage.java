package Weather;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Core.TestBase;

public class TemperaturePage extends TestBase
{
	//WebDriver driver = getDriver();
	//WebDriverWait wait = getWebDriverWait();
	private String temperature;

	private By cityInputElment()
	{
		return 	By.xpath("//input[@id='searchBox']");

	}

	public TemperaturePage enterCity()
	{
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(cityInputElment()));

		driver.findElement(cityInputElment()).sendKeys("Pune");
		return  new TemperaturePage();
	}

	
	private By CheckBoxcity()
	{
		return 	By.xpath("//input[@id='Pune']");

	}

	public TemperaturePage ClickCityCheckBox()
	{
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(CheckBoxcity()));

		driver.findElement(CheckBoxcity()).click();
		return  new TemperaturePage();
	}

	private By PunemapElement()
	{
		
		return 	(By.xpath("//*[@class='cityText'][contains(text(),'Pune')]"));

	}
	
	public TemperaturePage clickPuneMap()
	{
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(PunemapElement()));
		driver.findElement(PunemapElement()).click();
		return this;
	}
		
		private By getTempElement()
		{
			
			return 	(By.xpath("//*[@id='map_canvas']/div[1]/div[4]/div[12]/div//div/span[1]"));

		}
		
		public TemperaturePage GetTempElementString()
		{
			
			String str = driver.findElement(getTempElement()).getText();
			String str1= str.substring(0,2);
			System.out.println(str1);
			this.temperature = str1;

			return this;
}

 
 public String getTemperature() {
			return temperature;
		}

		public void setTemperature(String temperature) {
			this.temperature = temperature;
		}


{
	 
 }
 }

