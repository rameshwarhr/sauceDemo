package Com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPagePOMClass 
{
	private WebDriver driver;
	
	public AddtoCartPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
// cheack Out button
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement check;
	public void clickCheackOutButton()
	{
		check.click();
	}
	
	// continue shopping
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement continuebutton;
	public void clickContinueButton()
	{
		continuebutton.click();
	}
}
