package Com.SauceDemo.TestClasses;

import org.testng.annotations.Test;

import Com.SauceDemo.POMClasses.HomPagePOMClass;

public class TC_02_Select_Single_Product extends TestBaseClass
{
	@Test
	public void logoutfunctionality()
	{
		HomPagePOMClass hp= new HomPagePOMClass(driver);
		hp.clickBlackBag();
		log.info("clicked on Bag and product is selected");
	}
}
