package com.Actitime.Sel;

import org.testng.Assert;
import org.testng.Reporter;

public class CustomAssert {

public static void verifyEqual(String actual,String expected){
	try{
		Assert.assertEquals(actual,expected);
	}catch(Error e)
	{
		Reporter.log("Error is :" + e.getLocalizedMessage());
	}
}



}
