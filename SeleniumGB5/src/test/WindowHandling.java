package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/User/Desktop/selenium/SeleniumGB5/driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");

		String parentwindowID = driver.getWindowHandle();

		System.out.println(parentwindowID);

		System.out.println(driver.getTitle());

		 driver.findElement(By.xpath("(//*[@class='link3a'])[2]")).click();

		Set<String> childid = driver.getWindowHandles();

		for (String s : childid) {
			System.out.println(s);

			if (!s.equals(parentwindowID)) {
				driver.switchTo().window(s);

			}

		}

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//*[contains(text(),'Reset Login password')]")).click();

		driver.findElement(By.xpath("//*[@id='fldUId']")).sendKeys("Admin");
	}
}
