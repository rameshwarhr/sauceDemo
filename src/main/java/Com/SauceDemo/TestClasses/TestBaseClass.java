package Com.SauceDemo.TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import Com.SauceDemo.POMClasses.HomPagePOMClass;
import Com.SauceDemo.POMClasses.LoginPagePOMClass;
import Com.SauceDemo.Utility.screenShotClass;

public class TestBaseClass 
{
WebDriver driver;

Logger log;
@BeforeClass
public void browserOpen() throws IOException
{
	log=Logger.getLogger("sauce");
	PropertyConfigurator.configure("log4j.properties");
	
	System.setProperty("webdriver.chrome.driver","C:\\TestingSoftWare\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	log.info("maximize the browser");
	
	driver.get("https://www.saucedemo.com/");
	log.info("url enterd");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	screenShotClass.screenshot(driver);
}
@BeforeMethod
public void setUp() throws InterruptedException, IOException
{
	LoginPagePOMClass lp=new LoginPagePOMClass(driver);
	Thread.sleep(1000);
	screenShotClass.screenshot(driver);
	
	lp.SendUsername();
	log.info("entered userName");
	Thread.sleep(1000);
	screenShotClass.screenshot(driver);
	
	lp.sendPassword();
	log.info("entered password");
	Thread.sleep(1000);
	screenShotClass.screenshot(driver);
	
	lp.clickLoginbutton();
	log.info("clickd on login button");
	Thread.sleep(1000);
	screenShotClass.screenshot(driver);
}

@AfterMethod
public void logout() throws InterruptedException, IOException
{
	
	HomPagePOMClass hp =new HomPagePOMClass(driver);
	Thread.sleep(1000);
	hp.clickMenuButton();
	log.info("clicked on menu button");
	screenShotClass.screenshot(driver);
	
	Thread.sleep(1000);
	hp.clickLogoutButton();
	log.info("clicked on logout button");
	screenShotClass.screenshot(driver);
}
@AfterClass
public void browserClose()
{
	driver.close();
	log.info("browser is closed");
}
	
}
