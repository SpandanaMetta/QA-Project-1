package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTest;

public class LoginPage extends BaseTest{
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//a[@class='ico-login']")
      WebElement logInButton;
	
	@FindBy (xpath="//input[@id='Email']")
	  WebElement userID;
	
	@FindBy (xpath="//input[@id='Password']")
	  WebElement password;
	
	@FindBy (xpath= "//*[@class='button-1 login-button']")
	  WebElement loginContinue;
	
	@FindBy(xpath="(//a[@class='account'])[1]")
	  WebElement account;
	
	public void logInCredentials(String id,String pass) {
		logInButton.click();
		userID.sendKeys(id);
		password.sendKeys(pass);
	}
	
	public void logIn() {
		loginContinue.click();
	}
	
	public String accountVerify() {
		String acc= account.getText();
		return acc;
	}
}
