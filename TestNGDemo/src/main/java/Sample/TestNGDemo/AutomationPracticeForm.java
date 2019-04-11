package Sample.TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationPracticeForm {

	@Test
	public void DemoForm() {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"D:/JAVA Projects/JavaWithSelenium/TestNGDemo/driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/automation-practice-form/");

		System.out.println(driver.getTitle());
	}

}
