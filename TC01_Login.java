package ABC_Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC01_Login {
	
	WebDriver driver;
	
	@Test
	public void LoginTest() throws Exception
	{
	   System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\firefoxdriver_win64\\geckodriver.exe");
		driver =new ChromeDriver();
		//driver =new FirefoxDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		

	}

}
