package Selenium_Automation_WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_TextData_Verify {
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String username = "nareshit";
	static String password = "nareshit";
	static String title1 = "OrangeHRM - New Level of HR Management";
	static String title2 = "OrangeHRM";
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver obj = new ChromeDriver();
		obj.navigate().to(url);
		System.out.println("Application is opened");
		if (obj.getTitle().equals(title1)) {
			System.out.println("Title is matched");
		}
		else {
			System.out.println("Title is not matched");
		}
		Thread.sleep(1000);
		obj.findElement(By.name("txtUserName")).sendKeys(username);
		Thread.sleep(1000);
		obj.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
		obj.findElement(By.name("Submit")).click();
		if (obj.getTitle().equals(title2)) 
			System.out.println("Title is matched inside page");
		else
			System.out.println("Title is not matched inside page");
		Thread.sleep(3000);
		obj.close();
		System.out.println("Application is closed");
		
	}

}
