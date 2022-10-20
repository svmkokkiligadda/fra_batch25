package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.Baseclass;

public class Verifypage extends Baseclass{
	// verify functions for whole applicatin
	public static void verifyTitle(String Title) {
if(driver.getTitle().equals(Title)){
	Reporter.log( "Title matched");
}

else {
	Reporter.log("Title not matched" );
	Reporter.log("driver.getTitle");
		
}
}
}