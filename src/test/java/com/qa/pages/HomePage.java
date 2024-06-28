package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTest;

public class HomePage extends BaseTest {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy (tagName= "a")
	 List<WebElement> links;
	
	@FindBy (xpath="//ul[@class='top-menu']/li")
	List<WebElement>mainElements;
	
	public int linksCount() {
		int totalLinks=links.size();
		return totalLinks;
	}

	
	public void verifyLinks(){	
		for(WebElement elements:links) {
			System.out.println(elements.getText());
		}
		
	}
	public int elementsCount() {
		int size=mainElements.size();
		return size;
	}
	public void validateTexts() {
		for(WebElement element:mainElements) {
			System.out.println(element.getText());
		}
	}
}
