package stepDef;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginLocPage;
import pages.OpenNewAccountLoc;

public class OpenNewAccount extends BaseClass{
	
	public WebDriver driver;
	
	LoginLocPage lp;
	OpenNewAccountLoc onal;
	
	@Given("^user already in Account Overview page$")
	public void user_already_in_Account_Overview_page() throws InterruptedException, IOException
	{
		/*
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		lp = new LoginLocPage(driver);
		onal = new OpenNewAccountLoc(driver);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		*/
		
		driver = invokeBrowser();
		lp = new LoginLocPage(driver);
		onal = new OpenNewAccountLoc(driver);
		
		Thread.sleep(3000);
		lp.userName();
		Thread.sleep(3000);
		lp.passowrd();
		Thread.sleep(3000);
		lp.loginButton();

		Thread.sleep(3000);
	}

	@When("^user click on Open New Account$")
	public void user_click_on_Open_New_Account() throws InterruptedException
	{
		//driver.findElement(By.xpath("//a[contains(text(),'Open New Account')]")).click();
		onal.openNewAccPage();
		Thread.sleep(3000);
	}

	@Then("^user click on type of Account drop down and select account type$")
	public void user_click_on_type_of_Account_drop_down_and_select_account_type() throws InterruptedException
	{
		//Select sel = new Select(driver.findElement(By.xpath("//select[@id='type']")));
		//sel.selectByVisibleText("SAVINGS");
		onal.accTypePage();
		Thread.sleep(3000);
		
	}

	@Then("^click on OPEN NEW ACCOUNT button$")
	public void click_on_OPEN_NEW_ACCOUNT_button() throws InterruptedException
	{
		//driver.findElement(By.xpath("//input[@class='button']")).click();
		onal.newAccCreationButton();
		Thread.sleep(3000);
		
	}

	@Then("^user click on logout page$")
	public void user_click_on_logout_page() throws InterruptedException
	{
		//driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		lp.logoutButton();
		Thread.sleep(3000);
		
		driver.close();
	}

}
