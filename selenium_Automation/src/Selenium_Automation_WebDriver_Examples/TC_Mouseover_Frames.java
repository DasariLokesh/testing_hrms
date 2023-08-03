package Selenium_Automation_WebDriver_Examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class TC_Mouseover_Frames {
	public static void main(String[] args) throws InterruptedException {
	WebDriver obj = new ChromeDriver();
	obj.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("Appplication is opened");
	Thread.sleep(1000);
	obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
	Thread.sleep(1000);
	obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
	obj.findElement(By.name("Submit")).click();
	obj.switchTo().frame("rightMenu");
	obj.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
	obj.findElement(By.name("txtEmpFirstName")).sendKeys("Lokesh");
	Thread.sleep(1000);
	obj.findElement(By.name("txtEmpLastName")).sendKeys("Dasari");
	obj.findElement(By.id("btnEdit")).click();
	System.out.println("Employee added");
	Thread.sleep(3000);
	obj.switchTo().defaultContent();
	//     ******   MOUSEOVER     ********
	Actions obj2 = new Actions(obj);
	obj2.moveToElement(obj.findElement(By.linkText("PIM"))).perform();
	System.out.println("Cursor is moved");
	obj.findElement(By.linkText("Add Employee")).click();
	Thread.sleep(3000);
	System.out.println("Add Employee page is opened");
	Thread.sleep(2000);
	obj.findElement(By.linkText("Logout")).click();
	obj.close();
	System.out.println("Application is closed");
	}
}
