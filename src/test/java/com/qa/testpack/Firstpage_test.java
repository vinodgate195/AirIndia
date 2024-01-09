package com.qa.testpack;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.BaseClass.TestBase;
import com.qa.PageLayer.Firstpage;


public class Firstpage_test extends TestBase {

	Firstpage fst;
	public  Firstpage_test()
	
	{ 
		super();
	}
	
	@BeforeMethod()
	
	public void setup()
	{
		initiliazation();
		 fst = new Firstpage();
	}
	
	@Test 
	public void validatetitle()
	{
	    String title= fst.validatetitle();
		Assert.assertEquals(title, "Air India");
	}
	
	@Test 
	public void validatelogoimage()
	{
		boolean b=fst.logo();
		
		Assert.assertEquals(b,true);
		
	}
	
	

	@Test 
	@Parameters({"url","emaild"})
	public void parameter(String url,String emaild )
	{
		
		driver= new ChromeDriver();
		driver.get(url);
		
	}
	@AfterMethod()
	
	public void quit()
	{
	
    driver.quit();	
	}
	
}
