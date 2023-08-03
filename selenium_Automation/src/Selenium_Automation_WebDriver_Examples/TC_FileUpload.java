package Selenium_Automation_WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj = new ChromeDriver();
		obj.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(2000);
		obj.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("nareshit");
		Thread.sleep(3000);
		obj.findElement(By.xpath("//input[@value='txtPassword']")).sendKeys("nareshit");
		Thread.sleep(1000);
		obj.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(3000);
		obj.switchTo().frame("rightMenu");
		obj.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(3000);
		obj.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("Lokesh");
		Thread.sleep(3000);
		obj.findElement(By.xpath("//input[@name='txtEmpLastName;]")).sendKeys("Dasari");
		Thread.sleep(3000);
		WebElement file = obj.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
		file.sendKeys("E:\\black-panther.jpg");
		System.out.println("file is upload");
		Thread.sleep(3000);
		obj.findElement(By.xpath("//input[@id='btnEdit']")).click();
		Thread.sleep(2000);
		System.out.println("Employee is added succesfully");
		obj.switchTo().defaultContent();
		obj.findElement(By.linkText("Logout")).click();
		obj.close();
		System.out.println("Application is closed");
		
	}
}
