package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.HomePage;

public class TC_ValidateMainElements_005 extends BaseTest {
	
	@Test
	public void test1() {
		TC_linkTest_001 tc1=new TC_linkTest_001();
		tc1.linkTest();
	}
	
	@Test
 public void test2() {
	 HomePage hp=new HomePage(driver);
	 hp.validateTexts();
 }
	@Test
	public void test3() {
		 HomePage hp=new HomePage(driver);
		int expect =7;
		int actual=hp.elementsCount();
		Assert.assertEquals(actual, expect);
	}
}