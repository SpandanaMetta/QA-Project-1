package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTest;

public class RegistrationPage extends BaseTest{
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy (xpath = "//a[@class='ico-register']")
WebElement registerButton;

@FindBy (xpath = "//label[@for='gender-female']")
WebElement radio;

@FindBy (xpath = "//input[@id='FirstName']")
WebElement firstName;

@FindBy (xpath = "//input[@id='LastName']")
WebElement lastName;

@FindBy (xpath = "//input[@id='Email']")
WebElement email;

@FindBy (xpath = "//input[@id='Password']")
WebElement password;

@FindBy (xpath = "//input[@id='ConfirmPassword']")
WebElement confirmPassword;

@FindBy (xpath = "//input[@id='register-button']")
WebElement confirmRegister;

@FindBy (xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
WebElement account;


public void registerUser(String first, String last, String mail) {
	registerButton.click();
	radio.click();
	firstName.sendKeys(first);
	lastName.sendKeys(last);
	email.sendKeys(mail);
}
public void userPassword(String pass, String confirmPass) {
	password.sendKeys(pass);
	confirmPassword.sendKeys(confirmPass);
}

public void Register() {
	confirmRegister.click();
}

public String user() {
	String acc = account.getText();
	return acc;
	}

}
