package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocPage {

	public WebDriver driver;

	public LoginLocPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	@CacheLookup
	WebElement userName;

	@FindBy(name = "password")
	@CacheLookup
	WebElement password;

	@FindBy(xpath = "//input[@class='button']")
	@CacheLookup
	WebElement loginButton;

	@FindBy(xpath = "//a[contains(text(),'Log Out')]")
	@CacheLookup
	WebElement logoutButton;

	public void userName() {
		highLightElementMethod(driver, userName);
		userName.sendKeys("testuser1");
	}

	public void passowrd() {
		highLightElementMethod(driver, password);
		password.sendKeys("Test@123");
	}

	public void loginButton() {
		highLightElementMethod(driver, loginButton);
		loginButton.click();
	}

	public void logoutButton() {
		highLightElementMethod(driver, logoutButton);
		logoutButton.click();
	}

	// custom method to highlight click element
	public static void highLightElementMethod(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: #ff33ff; border: 4px solid orange;');",element);
	}
}
