package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccountLoc {
	
	public WebDriver driver;
	
	public OpenNewAccountLoc(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Open New Account')]")
	@CacheLookup
	WebElement openNewAccButton;
	
	@FindBy(xpath="//select[@id='type']")
	@CacheLookup
	WebElement selAccType;
	
	@FindBy(xpath="//input[@class='button']")
	@CacheLookup
	WebElement newAccButton;
	
	
	public void openNewAccPage()
	{
		highLightElementMethod(driver,openNewAccButton);
		openNewAccButton.click();
	}
	
	public void accTypePage()
	{
		highLightElementMethod(driver,selAccType);
		Select sel = new Select(selAccType);
		sel.selectByVisibleText("SAVINGS");
	}
	
	public void newAccCreationButton()
	{
		highLightElementMethod(driver,newAccButton);
		newAccButton.click();
	}
	
	public static void highLightElementMethod(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: #ff33ff; border: 4px solid orange;');",element);
	}
	
	
	

}
