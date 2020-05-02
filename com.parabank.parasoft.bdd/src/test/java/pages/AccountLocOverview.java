package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLocOverview {
	
	public WebDriver driver;
	
	
	public AccountLocOverview(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Accounts Overview')]")
	@CacheLookup
	WebElement accountOverview;
	
	
	
	public void accountOverview()
	{
		highLightElementMethod(driver,accountOverview);
		accountOverview.click();
	}


	// custom method to highlight click element
		public static void highLightElementMethod(WebDriver driver, WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: #ff33ff; border: 4px solid orange;');",element);
		}
	
	

}
