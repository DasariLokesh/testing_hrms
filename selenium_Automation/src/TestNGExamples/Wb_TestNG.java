package TestNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Wb_TestNG {
	WebDriver driver;
	@BeforeClass
	public void startUp() {
		driver = new ChromeDriver();
		System.out.println("Application is opened");
		Reporter.log("Application is opened");
	}
	@AfterClass
	public void tearDown() {
		driver.close();
		System.out.println("Application is closed");
		Reporter.log("Application is closed");
	}
	@Test
	public void tc001() {
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login copleted");
		Reporter.log("Login Completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		Reporter.log("Logout completed");
	}
}
