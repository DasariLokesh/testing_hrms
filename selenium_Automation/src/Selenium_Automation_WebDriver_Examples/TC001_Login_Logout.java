package Selenium_Automation_WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TC001_Login_Logout {
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String userName = "nareshit";
	static String password = "nareshit";
	static String title1 = "OrangeHRM - New Level of HR Management";
	static String title2 = "OrangeHRM";
public static void main(String[] args) throws Exception {
	
	
	
		WebDriver obj = new ChromeDriver();
		//obj.navigate().to("http://183.82.103.245/nareshit/login.php");
		obj.navigate().to(url);
		System.out.println("Appplication is opened");
		Thread.sleep(3000);
		/*if (obj.getTitle().equals("HRMS")) {                                     // verify title using conditinal statements
			System.out.println("Result matched");
		}
		else {
			System.out.println("result not matched ");
			System.out.println(obj.getTitle());*/ 
		if (obj.getTitle().equals(title1)) {                                      // verify title using conditinal statements with variables 
			System.out.println("Title matched in login page");
		}
		else {
			System.out.println("Title not matched in login page");
			System.out.println(obj.getTitle());
		}
		//obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
		obj.findElement(By.name("txtUserName")).sendKeys(userName);
		Thread.sleep(2000);
		//obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
		obj.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		obj.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Application Login");
		//  ****  FRAMES   ******
		obj.switchTo().frame("rightMenu");
		obj.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
		obj.findElement(By.name("txtEmpFirstName")).sendKeys("Lokesh");
		obj.findElement(By.name("txtEmpLastName")).sendKeys("Dasari");
		obj.findElement(By.id("btnEdit")).click();
		System.out.println("Employee added");
		Thread.sleep(3000);
		obj.switchTo().defaultContent();
		/*
		 * if (obj.getTitle().equals("Orange HRM")) {                      // verify title using conditinal statements
		 * System.out.println("Result matched"); } else {
		 * System.out.println("result not matched ");
		 * System.out.println(obj.getTitle()); }
		 */
		if (obj.getTitle().equals(title2)) {                                  // verify title using conditinal statements with variables 
			System.out.println("Title matched inside applicatin page");
		}
		else {
			System.out.println("Title not matched inside applicatin page");
			System.out.println(obj.getTitle());
		}
		Actions obj1 = new Actions(obj);
		obj1.moveToElement(obj.findElement(By.linkText("PIM"))).perform();
		Thread.sleep(2000);
		System.out.println("Cursor Move to PIM");
		obj.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(3000);
		System.out.println("Add Employee page is opened");
		obj.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Application Logout");
		obj.close();
		System.out.println("Application closed --> Browser also closed");

}
}
