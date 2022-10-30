package Com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.SauceDemo.POMClasses.AddtoCartPagePOMClass;
import Com.SauceDemo.POMClasses.CheckoutInformation;
import Com.SauceDemo.POMClasses.HomPagePOMClass;
import Com.SauceDemo.POMClasses.OverViewPage;
import Com.SauceDemo.Utility.screenShotClass;

public class TC_04_End_TO_End_Functionality extends TestBaseClass
{

	@Test
	public void check_End_TO_End() throws InterruptedException, IOException
	{
		HomPagePOMClass hp = new HomPagePOMClass(driver);
		hp.clickAddTocartProduct();
		screenShotClass.screenshot(driver);
		Thread.sleep(1000);
		
		hp.clickBucket();
		Thread.sleep(1000);
		screenShotClass.screenshot(driver);
		
		AddtoCartPagePOMClass yc= new AddtoCartPagePOMClass (driver);
		yc.clickCheackOutButton();
		screenShotClass.screenshot(driver);
		Thread.sleep(1000);
		
		CheckoutInformation ci = new CheckoutInformation (driver);
		ci.sendFirstName();
		screenShotClass.screenshot(driver);
		Thread.sleep(1000);
		
		ci.sendLastName();
		screenShotClass.screenshot(driver);
		Thread.sleep(1000);
		
		ci.sendPostelCode();
		screenShotClass.screenshot(driver);
		Thread.sleep(1000);
		
		ci.clickContinueButton();
		screenShotClass.screenshot(driver);
		Thread.sleep(1000);
		
		OverViewPage ovp= new OverViewPage (driver);
		ovp.clickfinishButton();
		screenShotClass.screenshot(driver);
		Thread.sleep(1000);
		}
	
}
