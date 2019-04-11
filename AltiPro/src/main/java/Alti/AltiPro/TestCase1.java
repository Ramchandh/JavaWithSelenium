package Alti.AltiPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test
	public void Testcase()
	{
		WebDriver driver = BaseClass.ChooseYourBrowser("chrome", "https://www.amazon.in/");
		
		AmazonPage amazonobj = PageFactory.initElements(driver, AmazonPage.class);
		
		amazonobj.ClickingSignUp();
		
	}
	

}
