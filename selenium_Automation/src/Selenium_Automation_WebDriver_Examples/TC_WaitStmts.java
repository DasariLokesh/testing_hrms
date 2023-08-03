package Selenium_Automation_WebDriver_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_WaitStmts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj = new ChromeDriver();
		obj.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(1000);
		obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(1000);
		obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(1000);
// Wait statements
		WebDriverWait wait = new WebDriverWait(obj,Duration.ofSeconds(4));
		wait.until(ExpectedConditions.elementToBeClickable(obj.findElement(By.name("Submit"))));
		obj.findElement(By.name("Submit")).click();
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		obj.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		obj.close();
		
	}
}
