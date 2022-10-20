package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Baseclass {
	//driver
	public static WebDriver driver;
	//open application
	public static void openApplication() {
System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
driver=new FirefoxDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
Reporter.log("application opened");
	}

	//close application
public static void closeApplicatio() {
driver.close();
Reporter.log("applicatin closed");
}
}


