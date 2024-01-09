package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BaseClass.TestBase;

public class Firstpage extends TestBase {

	
	@FindBy(id="signIn")
	
	WebElement signinbtn;
	
	@FindBy(xpath="//a[@id= \"topMenulogoDark\"]//img")
	
	WebElement airindiaimage;
	
	public  Firstpage()
	{
	
	PageFactory.initElements(driver, this);
	
	}
	
	public String validatetitle()
	{
		
	return driver.getTitle();
	
	}	
	
	public boolean logo()
	{
		
		 return airindiaimage.isDisplayed();
	
	
	}
	public Signinpage clickonlogin()
	
	{
		signinbtn.click();
	  return new Signinpage();
	}
	
}
