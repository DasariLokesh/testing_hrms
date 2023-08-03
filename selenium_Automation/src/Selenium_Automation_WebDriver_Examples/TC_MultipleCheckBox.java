package Selenium_Automation_WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;


public class TC_MultipleCheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj = new ChromeDriver();
		obj.navigate().to("http://183.82.103.245/nareshit/index.php");
		//Thread.sleep(1000);
		obj.findElement(By.name("txtUseName")).sendKeys("nareshit");
		//Thread.sleep(1000);
		obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
		//Thread.sleep(1000);
		obj.findElement(By.name("Submit")).click();
		Thread.sleep(1000);
		obj.switchTo().frame("reightMenu");
		List<WebElement> checkbox = obj.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(2000);
		System.out.println("no of check boxes --> "+ checkbox.size());
		/*for (int i=0; i<checkbox.size(); i++) {
		  if (i%2==1){
			checkbox.get(i).click();
			}
		}*/
		for(WebElement allbox : checkbox) {
			String classvalue = allbox.getAttribute("class");
			if (classvalue == "odd") {
				allbox.click();
			}
		}
		obj.switchTo().defaultContent();
		obj.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);
		obj.close();
		
		
	}

}
