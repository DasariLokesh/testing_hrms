package Selenium_Automation_WebDriver_Examples;
  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TC_DrpDownAllValues { 
	public static void main(String[] args)throws InterruptedException { 
		WebDriver obj = new ChromeDriver();
		  obj.navigate().to("http://183.82.103.245/nareshit/login.php");
		  Thread.sleep(1000);
		  obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
		  Thread.sleep(1000);
		  obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
		  Thread.sleep(1000); obj.findElement(By.name("Submit")).click();
		  System.out.println("Application is open"); 
		  obj.switchTo().frame("rightMenu");
		  WebElement ele = obj.findElement(By.name("loc_code")); 
		  Select sel = new Select(ele); List<WebElement> liop =sel.getOptions(); 
		  for (WebElement all : liop) { 
			  System.out.println((all.getText())); 
			  } 
		  sel.selectByIndex(1);
		  //sel.selectByIndex(2); 
		  //sel.selectByVisibleText("Emp. ID");
		  
		  System.out.println(liop);
		  
		  obj.switchTo().defaultContent(); 
		  obj.findElement(By.linkText("Logout"));
		  Thread.sleep(2000); obj.close();
  
  }
  
}
 