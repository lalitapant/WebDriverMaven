package Functionaltestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testcase2 
{
	@Test
	public void validateTitles()
	{
		String actual_tile="Yahoo.com";
		String Exp_Title="Google.com";
		//To report failures we use assertions
		//Assert.assertEquals(actual_tile, Exp_Title);
		Assert.assertTrue(false, "Condition not met");
	}

}
