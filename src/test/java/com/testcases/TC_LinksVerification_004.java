package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.HomePage;

public class TC_LinksVerification_004 extends BaseTest{
	
	@Test
	public void test1() {
		TC_linkTest_001 tc1=new TC_linkTest_001();
		tc1.linkTest();
	}
	
	@Test
	public void test2() {
		HomePage hp = new HomePage(driver);
		hp.verifyLinks();
		
		int expectLinks=(96);
		System.out.println("expect links ="+expectLinks);
		int actualLinks=hp.linksCount();
		System.out.println("actualLinks="+actualLinks);
      		
		Assert.assertEquals(actualLinks, expectLinks);
		
	}

}