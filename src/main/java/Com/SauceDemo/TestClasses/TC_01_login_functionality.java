package Com.SauceDemo.TestClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SauceDemo.POMClasses.LoginPagePOMClass;

public class TC_01_login_functionality extends TestBaseClass
{
	// WebDriver driver;
	@Test
	public void setUP()
	{
		String expResult="Swag Labs";
		System.out.println(expResult);
		String actResult=driver.getTitle();
		System.out.println(actResult);
		Assert.assertEquals(expResult, actResult);
		log.info("validation checked");
		
		
	}

}
