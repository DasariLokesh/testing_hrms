package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log;



public class General extends Global{
	public void openApplication() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application is opened");
		Reporter.log("Application is opened");
		Log.info("Application is opened");
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application is closed");
		Reporter.log("Application is closed");
		Log.info("Application is closed");
	}
	public void login() {
		driver.findElement(By.name(txt_usernname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pd);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login is completed");	
		Reporter.log("Login is completed");
		Log.info("Login is completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout is done");
		Reporter.log("Logout is done");
		Log.info("Logout is done");
	}
	public void enterToFrame() {
		driver.switchTo().frame("rightMenu");
		System.out.println("Entered into frame");
		Reporter.log("Entered into frame");
		Log.info("Entered into frame");
    }
	public void exitFromFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		Reporter.log("Exit from frame");
		Log.info("Exit from frame");
	}
	public void addEmp() {
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.findElement(By.name(txt_empFstName)).sendKeys(EFN);
		driver.findElement(By.name(txt_empLstName)).sendKeys(ELN);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("Exit from frame");
		Reporter.log("Exit from frame");
		Log.info("Exit from frame");
	}
	public void deleteEmp() {
		driver.findElement(By.name(sel_checkbox)).click();
		driver.findElement(By.xpath("input[@value='Delete']")).click();
		System.out.println("Delete a employee is done");
		Reporter.log("Delete a employee is done");
		Log.info("Delete a employee is done");
		
	}
	public void editEmp() {
		driver.findElement(By.linkText(link_text_serFor));
		select = new Select(driver.findElement(By.name(select_dropdown)));
		select.selectByIndex(1);
		driver.findElement(By.linkText(link_text_serFor)).sendKeys(empid);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		System.out.println("Enter into edit page");
		Reporter.log("Enter into edit page");
		Log.info("Enter into edit page");
	}
}
