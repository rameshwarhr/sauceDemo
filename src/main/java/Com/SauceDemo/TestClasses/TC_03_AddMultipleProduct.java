package Com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SauceDemo.POMClasses.HomPagePOMClass;
import Com.SauceDemo.Utility.screenShotClass;

public class TC_03_AddMultipleProduct extends TestBaseClass
{

	@Test
	public void addAllproduct() throws InterruptedException, IOException
	{
		HomPagePOMClass hp=new HomPagePOMClass(driver);
		hp.clickAddTocartProduct();
		Thread.sleep(2000);
		screenShotClass.screenshot(driver);
		
		hp.clickBucket();
		Thread.sleep(2000);
		screenShotClass.screenshot(driver);
	
		String expRes="6";
		String act=hp.getCartValue();
		Assert.assertEquals(act,expRes);
		log.info("all product is selected");
		
	}
}
