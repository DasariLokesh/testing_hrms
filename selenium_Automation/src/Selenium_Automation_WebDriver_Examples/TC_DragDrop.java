package Selenium_Automation_WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import static org.testng.Assert.assertEquals;

public class TC_DragDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj = new ChromeDriver();
		obj.navigate().to("https://jqueryui.com/droppable/&quot;");	
		System.out.println(obj.getTitle());
		assertEquals(obj.getTitle(),"Page not found | jQuery UI");
		System.out.println("title matched");
		obj.switchTo().frame(0);
		Actions act = new Actions(obj);
		act.dragAndDrop(obj.findElement(By.id("draggable")),obj.findElement(By.id("droppable"))).build().perform();
		System.out.println("drag&Drop");
		Thread.sleep(3000);
		obj.switchTo().defaultContent();
		obj.close();
		
	}
}
