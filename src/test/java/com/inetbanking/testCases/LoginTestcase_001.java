package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.testCases.BaseClass;
import com.inetbanking.pageObjects.LoginPage;

public class LoginTestcase_001 extends BaseClass {
	
	@Test
	public void loginTest()  throws IOException {
		
		driver.get(baseURL);
	 logger.info("url entered successfully");
		LoginPage lp = new LoginPage(driver);
	
		lp.setUserName(username);
		logger.info("enter username");
		lp.setPassword(password);
		logger.info("enter password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test passed");
		}
		
		else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}
		
	}
	

}
