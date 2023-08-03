package Selenium_Automation_WebDriver_Examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class TC_Alert {
	public static void main(String[] args) throws Exception{
		WebDriver obj = new ChromeDriver();
		obj.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(2000);
		obj.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(3000);
// Click on login without giving password
		 obj.findElement(By.name("Submit")).click(); // for checking alert is coming or not 
		 System.out.println("Login Completed");
// Adding Alert for accepting alerts in for required data input  
		Alert ale = obj.switchTo().alert();
		System.out.println(ale.getText());
		Thread.sleep(5000);
		ale.accept();
		Thread.sleep(2000);
		obj.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(2000);
		obj.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		Thread.sleep(3000);
		obj.findElement(By.linkText("Logout")).click();
		System.out.println("Logout is completed");
		obj.close();
		System.out.println("Application is closed");
	}

}
