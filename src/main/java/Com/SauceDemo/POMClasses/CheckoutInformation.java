package Com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInformation 
{

	private WebDriver driver;
	public CheckoutInformation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstName;
	public void sendFirstName()
	{
		firstName.sendKeys("bhagvat");
	}
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastName;
	public void sendLastName()
	{
		lastName.sendKeys("Dhade");
	}
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement postelcode;
	public void sendPostelCode()
	
	{
		postelcode.sendKeys("123456");
	}
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebutt;
	public void clickContinueButton()
	{
		continuebutt.click();
	}
	
	
	
	
	
	
	
	
}
