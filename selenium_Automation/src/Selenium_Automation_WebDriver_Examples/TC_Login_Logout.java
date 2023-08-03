package Selenium_Automation_WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_Login_Logout {
public static void main(String[] args) throws Exception{
	WebDriver obj = new ChromeDriver();
	obj.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("Application is opened");
	Thread.sleep(1000);
	obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
	Thread.sleep(1000);
	obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
	obj.findElement(By.name("Submit")).click();
	Thread.sleep(2000);
	obj.findElement(By.linkText("Logout")).click();
	obj.close();
	System.out.println("Application is closed");
}
}
