package com.qa.testpack;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseClass.TestBase;
import com.qa.PageLayer.Signinpage;

public class Signinpage_Test extends TestBase {

	Signinpage signinpage;
	public Signinpage_Test ()
	
	{
	super();
	}
	
	@BeforeMethod()
	  public void setup1()
	  {
		initiliazation();
		signinpage =new Signinpage ();
		signinpage.clickonsigninlink();
			
	  }
	  
	@Test()
	public void validatetitle()
	{
		
		String signtitle = signinpage.validatetitle();
		
		Assert.assertEquals(signtitle,"Air India");
	}
	
	@Test()
	public void validatjoinbtn()
	{
		boolean b=signinpage.validatesigninbutton();
		Assert.assertEquals(b, true);
	}

	@AfterMethod()
	public void quit()
	{
	driver.quit();
	
	}
		
}
