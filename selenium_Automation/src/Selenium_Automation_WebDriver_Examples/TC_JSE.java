package Selenium_Automation_WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class TC_JSE {
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj = new ChromeDriver();
		obj.navigate().to("http://183.82.103.245/nareshit/login.php");
		obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
		obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
		WebElement login = obj.findElement(By.name("Submit"));
		JavascriptExecutor jse = (JavascriptExecutor)obj;
		jse.executeScript("arguments[0],click();",login);
		Thread.sleep(3000);
		System.out.println("Login is completed using JavascriptExecutor");
		WebElement logout = obj.findElement(By.linkText("Logout"));
		JavascriptExecutor jse1 = (JavascriptExecutor)obj;
		jse1.executeScript("arguments[0],click();",logout);
		System.out.println("Logout is done using JavascriptExecutor");
		obj.close();
	}

}
