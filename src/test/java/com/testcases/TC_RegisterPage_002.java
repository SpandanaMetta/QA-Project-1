package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.RegistrationPage;

public class TC_RegisterPage_002 extends BaseTest{
	@Test(priority = 1)
	public void test1() {
		TC_linkTest_001 tc1 = new TC_linkTest_001();
		tc1.linkTest();
	}
	
	@Test(priority = 2)
	public void test2() {
		RegistrationPage rg = new RegistrationPage(driver);
		rg.registerUser("spandana", "sai", "hello105@gmail.com");
		rg.userPassword("hi@123", "hi@123");
		rg.Register();
	}
	
	@Test(priority = 3)
	public void testUserVerify() {
		RegistrationPage rp = new RegistrationPage(driver);
		String actualUser = rp.user();
		System.out.println("actual user name is = " + actualUser);
		String expectUser = ("hello105@gmail.com");
		System.out.println("expected user name is = " + expectUser);
		
		Assert.assertEquals(actualUser, expectUser);
	}

}
