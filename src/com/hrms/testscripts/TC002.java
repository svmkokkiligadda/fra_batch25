package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.Addemppage;
import com.hrms.pages.Loginpage;
import com.hrms.pages.Logoutpage;
import com.hrms.pages.Verifypage;
import com.hrms.utility.Baseclass;

public class TC002 {
	@Test
	public void tc002() {
		Baseclass.openApplication();
		Loginpage.login("nareshit","nareshit");
		Verifypage.verifyTitle("HRMS");
		Addemppage.addemp("suresh","selenium");
		Verifypage.verifyTitle(" Orange HRMS");
		Logoutpage.logout();
		Baseclass.closeApplicatio();
		
	}

}
