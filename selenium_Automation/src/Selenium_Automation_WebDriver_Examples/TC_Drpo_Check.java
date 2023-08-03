
package Selenium_Automation_WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TC_Drpo_Check {
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj = new ChromeDriver();obj.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(1000);
		obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(2000);
		obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(2000);
		obj.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(2000);
// Enter into frame
		obj.switchTo().frame("rightMenu");
		Select sel = new Select(obj.findElement(By.name("loc_code")));
		//sel.selectByVisibleText("Emp. ID");
		sel.selectByIndex(1);
		//sel.selectByValue("0");
		Thread.sleep(2000);
		obj.findElement(By.name("loc_name")).sendKeys("0590");
		Thread.sleep(2000);
		obj.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
		obj.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(2000);
		obj.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(2000);
		System.out.println("Empployee is deleted");
// Exit from frame
		obj.switchTo().defaultContent();
		obj.findElement(By.linkText("Logout")).click();
		System.out.println("Logout is completed");
		obj.close();
		System.out.println("Application is closed");
		
	}

}
