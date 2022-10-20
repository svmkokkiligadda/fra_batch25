package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.Loginpage;
import com.hrms.pages.Logoutpage;
import com.hrms.pages.Verifypage;
import com.hrms.utility.Baseclass;

public class TC001 {
@Test
public static void tc001() {
	//Testbsteps
	Baseclass.openApplication();
	Verifypage.verifyTitle("HRMS");
	Loginpage.login("nareshit","narestit");
	Verifypage.verifyTitle("Orange HRMS");
	Logoutpage.logout();
	Baseclass.closeApplicatio();
}
}
