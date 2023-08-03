package Selenium_Automation_WebDriver_Examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class TC_practice {
	public static void main(String[] args) throws Exception{
		
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(1000);
	Alert driver1=	driver.switchTo().alert();
	driver1.accept();

	
	
	}

	
}

