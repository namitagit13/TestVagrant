package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class TestBase {


	public static WebDriver driver;


	@BeforeMethod
	public void initDriver()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NAMITA\\Desktop\\seleniumclass\\material\\chrome83\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.ndtv.com/");

		driver.manage().window().maximize();

	}

	public WebDriver getDriver()
	{
		return driver;
	}

	public WebDriverWait getWebDriverWait()
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), 60);

		return wait;

		
		
		
		
		
		
	}


}
