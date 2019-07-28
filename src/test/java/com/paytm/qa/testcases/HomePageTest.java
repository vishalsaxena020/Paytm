package com.paytm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.paytm.qa.base.TestBase;
import com.paytm.qa.pages.HomePage;
import com.paytm.qa.pages.LoginPage;

public class HomePageTest extends TestBase  {
	
	HomePage hp;
	LoginPage lp;
	
	public HomePageTest()
	{
		super();
	}

	@BeforeMethod
	public void loadingpage()
	{
		initialization();
		 hp = new HomePage();
		
	}
	
	
	@Test( priority=1, enabled=false)
	public void titleCheck()
	{
		hp.getHomePageTitle();
	}
	@Test(priority=2, enabled=false)
	public void broabandpageopen()
	{
		hp.clickOn_BroadBandButton();
	}
	
	@Test(priority=3)
	public void loginpage()
	{
		
		hp.clickOn_Login_SignUp_Button();
	}
	
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.quit();
	}
}

