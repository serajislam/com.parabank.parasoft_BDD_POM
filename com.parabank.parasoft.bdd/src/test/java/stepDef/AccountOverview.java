package stepDef;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AccountLocOverview;
import pages.LoginLocPage;

public class AccountOverview extends BaseClass{

	LoginLocPage lp;
	AccountLocOverview aol;
	public WebDriver driver;

	@Given("^user already login in Account Overview page$")
	public void user_already_login_in_Account_Overview_page() throws InterruptedException, IOException {
		
		/*
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		lp = new LoginLocPage(driver);
		aol = new AccountLocOverview(driver);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		*/
		
		driver = invokeBrowser();
		lp = new LoginLocPage(driver);
		aol = new AccountLocOverview(driver);
		
		Thread.sleep(3000);

		lp.userName();
		Thread.sleep(3000);
		lp.passowrd();
		Thread.sleep(3000);
		lp.loginButton();
		Thread.sleep(3000);
	}

	@When("^user click on Account Overview link$")
	public void user_click_on_Account_Overview_link() {

		aol.accountOverview();

	}

	@Then("^user should click on logout page$")
	public void user_should_click_on_logout_page() throws InterruptedException {

		lp.logoutButton();
		Thread.sleep(3000);

		driver.close();
	}

}
