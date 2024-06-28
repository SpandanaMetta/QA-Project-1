package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.LoginPage;

public class TC_LogInPageTest_003 extends BaseTest {
   public LoginPage lp; 
	
	@Test(priority =1)
	public void test1() {
		TC_linkTest_001 tc1=new TC_linkTest_001();
		tc1.linkTest();
	}

	@Test(priority =2)
	public void test2() {
		 lp=new LoginPage(driver);
		 lp.logInCredentials("hello105@gmail.com", "hi@123");
		 lp.logIn();
	}
	
	@Test(priority =3)
	public void test3() {
		lp=new LoginPage(driver);
		
	    String actualUserId=lp.accountVerify();
	    System.out.println("actual user id="+actualUserId);
		String expectUserId="hello105@gmail.com";
	   System.out.println("expect user id="+expectUserId);
		
		Assert.assertEquals(actualUserId, expectUserId);
	}
}