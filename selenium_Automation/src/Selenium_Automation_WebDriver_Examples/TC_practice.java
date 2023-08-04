package Selenium_Automation_WebDriver_Examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TC_practice {
	public static void main(String[] args) throws Exception{
		
	WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/index.php");
Thread.sleep(1000);
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
Thread.sleep(1000);
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(1000);
driver.findElement(By.name("Submit")).click();
Actions driver1=new Actions(driver);
driver1.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
driver.findElement(By.linkText("Add Employee")).click();
driver.switchTo().frame("rightMenu");
driver.findElement(By.name("txtEmpLastName")).sendKeys("reddy");
Thread.sleep(1000);
driver.findElement(By.name("txtEmpFirstName")).sendKeys("sravan");
Thread.sleep(1000);
WebElement fileinput=driver.findElement(By.name("photofile"));
Thread.sleep(1000);
fileinput.sendKeys("E:\\black-panther.jpg");
System.out.println("file uploaded");
Thread.sleep(1000);
driver.findElement(By.id("btnEdit")).click();
driver.close();

		
	}

		
}
	
	
