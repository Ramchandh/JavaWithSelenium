package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CrmProLogin {

	private WebDriver driver = null;

	@Given("open the crmpro website to test")
	public void open_the_crmpro_website_to_test() {
		System.setProperty("webdriver.chrome.driver",
				"D:/JAVA Projects/JavaWithSelenium/AltiPro/driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.crmpro.com/index.html");
	}

	@When("the url opens login with your credentials")
	public void the_url_opens_login_with_your_credentials() {
		driver.findElement(By.name("username")).sendKeys("ran123");

		driver.findElement(By.name("password")).sendKeys("ran123");
	}

	@Then("verify the title of the page")
	public void verify_the_title_of_the_page() {
		System.out.println(driver.getTitle());
	}

	@Given("open the Automation practice form")
	public void open_the_Automation_practice_form() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("then fill the ram{int} and ram{int}")
	public void then_fill_the_ram_and_ram(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("then fill the admin and admin")
	public void then_fill_the_admin_and_admin() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("then fill the admin{int} and admin{int}")
	public void then_fill_the_admin_and_admin(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
