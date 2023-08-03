package Selenium_Automation_WebDriver_Examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.*;
public class TC_WindowHandler {
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj = new ChromeDriver();
		obj.navigate().to("file:///C:/Users/lokes/Downloads/multiplewindows.html");
		Thread.sleep(3000);
		obj.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		obj.findElement(By.id("btn3")).click();
		Thread.sleep(3000);
		ArrayList<String> windinfo = new ArrayList(obj.getWindowHandles()); 
		obj.switchTo().window(windinfo.get(0));
		Thread.sleep(3000);
		obj.close();
		//obj.quit();
	}
}
