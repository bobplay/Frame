package com.peilei.framework;

import org.junit.After;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driver.Browser;
import driver.DriverFactory;

@Test
public class BaseCase {
	public static RemoteWebDriver driver = null;
	@BeforeClass
	@Parameters("browser")
	public void init(@Optional("IE_BROWER") Browser browser){
		 driver = DriverFactory.getDriver(browser);
		
	}
	@AfterClass
	public void kill(){
		if(driver != null && driver instanceof RemoteWebDriver){
			driver.quit();
		}
	}
}
