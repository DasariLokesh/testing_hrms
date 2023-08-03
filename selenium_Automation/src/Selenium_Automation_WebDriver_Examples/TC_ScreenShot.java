package Selenium_Automation_WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

public class TC_ScreenShot {
	public static void main(String[] args) throws IOException {
		
		WebDriver obj = new ChromeDriver();
		try {
		obj.navigate().to("http://183.82.103.245/nareshit/index.php");
		Thread.sleep(1000);
		obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(1000);
		obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(1000);
		obj.findElement(By.name("Submit")).click();
		WebElement element = obj.findElement(By.linkText("PIM"));
		Actions act = new Actions(obj);
		act.moveToElement(element).perform();
		Thread.sleep(1000);
		obj.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(1000);
		System.out.println(("clicked on Submenu"));
		obj.findElement(By.linkText("Logout")).click();
			}
		catch(Exception e) {
			File f1 = ((TakesScreenshot)obj).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("E://TestScerrnShot.png"));
		}
		obj.close();
	}
}
