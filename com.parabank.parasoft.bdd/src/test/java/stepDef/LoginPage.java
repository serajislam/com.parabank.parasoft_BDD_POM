package stepDef;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import base.BaseClass;
import cucumber.api.java.en.*;
import pages.LoginLocPage;

public class LoginPage extends BaseClass {

	public WebDriver driver;

	LoginLocPage lp;

	@Given("^user already in login page$")
	public void user_already_in_login_page() throws InterruptedException, IOException {

		// Calling invokeBrowser method in BaseClass
		driver = invokeBrowser();

		// Calling LoginLocPage by creating object og LoginLocPage class
		lp = new LoginLocPage(driver);

		Thread.sleep(3000);

	}

	@When("^user enter valid credentials$")
	public void user_enter_valid_credentials() throws InterruptedException {
		lp.userName();
		Thread.sleep(3000);
		lp.passowrd();
		Thread.sleep(3000);

	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws InterruptedException {
		lp.loginButton();
		Thread.sleep(3000);

	}

	@Then("^user click on logout button$")
	public void user_click_on_logout_button() throws InterruptedException {

		lp.logoutButton();
		Thread.sleep(3000);
		driver.close();

	}

}
