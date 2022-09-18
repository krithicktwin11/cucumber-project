package com.flipkart.objectreprorisity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resource.Commonactions;

public class MobileValidatepage extends Commonactions {
	public MobileValidatepage() {
		PageFactory.initElements(driver, this);
	
}
	@FindBy(name="q")
	private WebElement search;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement close;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getClose() {
		return close;
	}
	
	
	
}