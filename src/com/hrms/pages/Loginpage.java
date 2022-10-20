package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.Baseclass;

public class Loginpage extends Baseclass{
	//objects
	static By txt_loginname=By.name("txtUserName");
	static By txt_password=By.name("txtPassword");
	static By btn_login=By.name("Submit"); 
//functions
	public static void login(String un,String pw) {
	driver.findElement(txt_loginname).sendKeys("nareshit");
	driver.findElement(txt_password).sendKeys("nareshit");
	driver.findElement(btn_login).click();
	Reporter.log("login completed");
		
	}

}
