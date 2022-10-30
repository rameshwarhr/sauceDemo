package Com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass 
{
	private WebDriver driver;
	
	public LoginPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement userName;
	public void SendUsername()
	{
		userName.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
 private WebElement passWord;
	public void sendPassword()
	{
		passWord.sendKeys("secret_sauce");
	}

	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginbutton;
	public void clickLoginbutton()
	{
		loginbutton.click();
	}
	
	
}
