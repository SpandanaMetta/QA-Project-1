package com.testcases;

import org.testng.annotations.Test;

import com.qa.base.BaseTest;

public class TC_linkTest_001 extends BaseTest{
	
	@Test
	public void linkTest() {
		driver.get("https://demowebshop.tricentis.com/");
	}
}
