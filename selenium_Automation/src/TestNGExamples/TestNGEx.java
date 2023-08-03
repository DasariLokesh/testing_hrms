package TestNGExamples;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGEx {
	@BeforeClass                                                            // as well as @AfterClass
	public void login() {
		System.out.println("Login completed");                             // for print o/p in console
		Reporter.log("Login Completed");                                   // for print o/p in -htmlreport
	}
	@AfterClass                                                            // as well as @BeforeClass
	public void logout() {
		System.out.println("Logout Completed");
		Reporter.log("Logout Completed");
	}
	@Test                                                      
	public void addEmp() {
		System.out.println("New Employee is added");
		Reporter.log("New Employee is added");
	}
	@Test(priority=2)                                                      // executes based on priority value
	public void delEmp() {
		System.out.println("Employee is deleted");
		Reporter.log("Employee is deleted");
	}
}
