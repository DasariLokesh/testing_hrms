package Selenium_Automation_WebDriver_Examples;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_Kb_Actions_Java {
	public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver obj = new ChromeDriver();
	obj.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(2000);
	obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
	Thread.sleep(1000);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	System.out.println("Login is completed");
	Thread.sleep(2000);
	obj.findElement(By.linkText("Logout")).click();
	System.out.println("Logout is completed");
	obj.close();
}
}
