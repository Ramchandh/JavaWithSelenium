package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BroserLaunching {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/selenium/SeleniumGB5/driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://twitter.com/login?lang=en");
//		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		
		
//		TakesScreenshot tk = (TakesScreenshot) driver;
//		
//		
//		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
//		
//		
//		File f = new File("D:/mynewscreenshot.png");
//		
//		FileUtils.copyFile(screenshotAs, f);
		
		
			
		
		
	}

}
