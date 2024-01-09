package com.qa.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static Properties prop;
	public static WebDriver  driver;
	
	public TestBase()
	{
	
	 prop=new Properties();	
		
	try {
		FileInputStream file= new FileInputStream("C:\\Users\\vinod.gate\\eclipse-workspace\\project2\\src\\main\\java\\com\\qa\\EnvironmentalVariable\\config.properties");
		prop.load(file);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		
	}
	
	
	
	public static void initiliazation ()
	{
		String Browser =prop.getProperty("browser");
		if (Browser.equals("chrome"))
		{
	   driver= new ChromeDriver();
	   }
		
		else if (Browser.equals("FF"))
		{
			driver= new FirefoxDriver();	
			System.setProperty("webdriver.gecko.driver", "");
			
		}
			
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.manage().deleteAllCookies();
	   driver.get(prop.getProperty("url"));
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
