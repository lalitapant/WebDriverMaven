package Functionaltestcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase1 {
	@BeforeTest
	//Made Changes
	public void testDB()
	{
		System.out.println("Connect DB");
		
	}
	@AfterTest
	public void closeDB()
	{
		System.out.println("Close db");
	}
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("Launch Browser");
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		System.out.println("Close Browser");
	}
	@Test(priority=1)
	public void doLogin()
	{
	System.out.println("Dologin");
	}

	@Test(priority=2)
	public void homePage()
	{
		System.out.println("Home Page");
		

	}
	
}
