package com.paytm.qa.testcases;

import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.paytm.qa.base.TestBase;
import com.paytm.qa.pages.HomePage;
import com.paytm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage lp;
	HomePage hp;

	public LoginPageTest()
	{
		super();
	}


	@BeforeMethod
	public void loadingpage()
	{
		initialization();
		hp = new HomePage();
		lp=hp.clickOn_Login_SignUp_Button();
		

	}

	@Test
	public void LoginMethod()
	{
		
		lp.loginwithCredentials();
	}
	
	@AfterMethod
	public void closepage()
	{
		driver.close();
	}
}
