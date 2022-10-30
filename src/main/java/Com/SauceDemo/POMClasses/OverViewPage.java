package Com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverViewPage 
{
	private WebDriver driver;
	
	public OverViewPage(WebDriver driver)
	{
		this. driver = driver;
		PageFactory.initElements(driver, this);
	}
   
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finishButton;
	
	public void clickfinishButton()
	{
		finishButton.click();
	}
	
	
}
