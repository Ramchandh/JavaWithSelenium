package Sample.TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PhpTravels {
	
	@Test
	public void DemoMethod()
	{
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "D:/JAVA Projects/JavaWithSelenium/TestNGDemo/driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.phptravels.net/");
		
		System.out.println(driver.getTitle());
	}

}
