package com.bank.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bank.pageObjects.LoginPage;

public class TC001_LoginTest extends BaseClass
{
	@Test
	public void loginTest() throws InterruptedException
	{
		logger.info("Inside Test");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Entered Username");
		
		lp.setPassword(password);
		logger.info("Entered Password");
		
		lp.clickSubmit();
		logger.info("Click Submit");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}
}
