package com.paytm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.paytm.qa.base.TestBase;

public class HomePage extends TestBase{

	//Below are the Page Objects / Object Repository

	@FindBy(xpath="//*[@class='_3ac-']")
	WebElement loginButton;

	@FindBy(xpath="//*[@class='_160X' and contains(text(),'Broadband')]")
	WebElement broadbandbutton;

	// Initializing the Page Objects
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}

	// Below are the actions on the Home Page (Landing Page)

	public LoginPage clickOn_Login_SignUp_Button()
	{
		try 
		{
			Thread.sleep(5000);
			loginButton.click();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

       return new LoginPage() ;
	}

	public void clickOn_BroadBandButton()
	{

		broadbandbutton.click();
		
	}

	public String getHomePageTitle()
	{
		return driver.getTitle();
	}

}
