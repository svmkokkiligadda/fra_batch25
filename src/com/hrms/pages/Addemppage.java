package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.Baseclass;

public class Addemppage extends Baseclass{
	static By btn_addemp=By.xpath("//input[@value='Add']");
	static By txt_EFN=By.name("txtEmpFirstName");
	static By txt_ELN=By.name("txtEmpLastName");
	static By btn_save=By.id("btnEdit");
	public void enterframe() {
		driver.switchTo().frame("rightMenu");
		Reporter.log("enter into frame");
	}
	public void exitframe() {
		driver.switchTo().defaultContent();
		Reporter.log("exit from  frame");	
	}
	public static void addemp(String firstname,String lastname) {
		driver.findElement(btn_addemp).click();
		driver.findElement(txt_EFN).sendKeys("suresh");
		driver.findElement(txt_ELN).sendKeys("selenium");
		driver.findElement(btn_save).click();
		Reporter.log("new employee added");
	}
}
		
				
				
				
				
				
				
				
				
				
		
		


	

