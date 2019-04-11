package Alti.AltiPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPage {
	
	WebDriver driver;
	
	 public AmazonPage(WebDriver driver) {
		 
		 this.driver=driver;
		
	}
	
	@FindBy(xpath="//*[@id='nav-link-yourAccount']")
	public WebElement Sign_up_Actions;
	
	
	@FindBy(xpath="//*[@id='nav-flyout-ya-newCust']/a")
	public WebElement Start_here_button;
	
	
	public void ClickingSignUp()
	{
		
		
		Actions acc = new Actions(driver);
		
//		WebDriverWait wait = new WebDriverWait(driver, 30);
		
//		wait.until(ExpectedConditions.visibilityOf(Sign_up_Actions));
		
		
		acc.moveToElement(Sign_up_Actions).perform();
		
		
		
//		wait.until(ExpectedConditions.elementToBeClickable(Start_here_button));
		
		Start_here_button.click();
		
	}

}
