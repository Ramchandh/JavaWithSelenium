package Alti.AltiPro;

import java.util.concurrent.TimeUnit;

import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	static WebDriver driver = null;

	public static WebDriver ChooseYourBrowser(String browsername, String Appurl) {
		if (browsername.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver","D:/JAVA Projects/JavaWithSelenium/AltiPro/driver/chromedriver.exe" );
			driver = new ChromeDriver();
		}

		else if (browsername.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		}

		else if (browsername.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(Appurl);

		return driver;
	}

}
