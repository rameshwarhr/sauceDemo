package Com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomPagePOMClass 
{

	private WebDriver driver;
	public HomPagePOMClass(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement menubutton;
	public void clickMenuButton()
	{
		menubutton.click();
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	public void clickLogoutButton()
	{
		logout.click();
	}
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement blackbag;
	public void clickBlackBag()
	{
		blackbag.click();
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement>multipleAddtocart;
	public void clickAddTocartProduct()
	{
		for(WebElement all:multipleAddtocart)
		{
			all.click();
		}
	}
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement bucket;
	public void clickBucket()
	{
		bucket.click();
	}
	
	public String getCartValue()
	{
		String actResu=bucket.getText();
		return actResu;
	}
	}
