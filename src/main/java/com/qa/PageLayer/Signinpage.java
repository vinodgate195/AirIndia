package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BaseClass.TestBase;

public class Signinpage extends TestBase{

	
	
  @FindBy(id="signIn")
	
	WebElement signlink;
	
	@FindBy(id="signInName")
	
	WebElement email;
	

	@FindBy(xpath="//input[@id='password']")
	
	WebElement password;
	
	
@FindBy(xpath="//button[@id=\"next\"]")
	
	WebElement signinbutton;
	
	public Signinpage()
	{
	PageFactory.initElements(driver, this);
	
	}
	
	public signinpage2  clickonsigninlink()
	{
		signlink.click();
		return new signinpage2 ();
				
		
	}
	
	public String validatetitle()
	{
		
		String signintitle =driver.getTitle();
		return signintitle;
	}
	
	
	public boolean validatesigninbutton()
	
	{
		
	return	signinbutton.isDisplayed();
		
	}
	public Homepage clickonsign()
	{
	
		email.sendKeys("vinodgate68@gmail.com");
		password.sendKeys("Vinod@555");
		return new Homepage();
	
	}
}
