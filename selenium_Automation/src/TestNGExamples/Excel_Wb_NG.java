package TestNGExamples;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_Wb_NG {
	WebDriver driver;
	@BeforeClass
	public void startUp() {
		driver = new ChromeDriver();
		System.out.println("Application is opened");
	}
	@AfterClass
	public void tearDown() {
		driver.close();
		System.out.println("Application is closed");
	}
	@Test
	public void tc001() throws Exception{
		FileInputStream file = new FileInputStream("E:\\Excel_Wb_NG.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet(0);
		String username = st.getCell(0,1).getContents();
		String password = st.getCell(1,1).getContents();
		Reporter.log("Username-->"+username);
		Reporter.log("Password-->"+password);
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		System.out.println("Username from Excel");
		Reporter.log("Username from Excel");
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		System.out.println("password from Excel");
		Reporter.log("Password from Excel");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Reporter.log("Login completed");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		Reporter.log("Logout completed");
		
	}

}
