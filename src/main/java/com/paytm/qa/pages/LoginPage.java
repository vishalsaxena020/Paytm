package com.paytm.qa.pages;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.paytm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Below are the Page Objects / Object Repository
	
	@FindBy(xpath = "//*[@user-actions='login_clicked']")
	WebElement LoginHyperlink;

	@FindBy(name="username")
	WebElement EnterUname;
	
	@FindBy(name="password")
	WebElement EnterPassword;

	@FindBy(xpath  ="//*[@event-action='login_securely_clicked']")
	WebElement loginButton;
	
	@FindBy(name="otp")
	WebElement otpValue;
	
	@FindBy(xpath="//*[@type='submit']")
    WebElement OTPverify;	
	// Initializing the Page Objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Below are the actions on the Home Page (Landing Page) Hello Helo
	
	public void loginwithCredentials()
	{
		driver.switchTo().frame(0);
		LoginHyperlink.click();
		EnterUname.sendKeys(pr.getProperty("uname"));
		EnterPassword.sendKeys(pr.getProperty("pass"));
		loginButton.click();
		String Captcha = JOptionPane.showInputDialog("Please Provide your OTP ->");
		otpValue.sendKeys(Captcha);
		OTPverify.click();
	}
}
