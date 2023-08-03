package Selenium_Automation_WebDriver_Examples;
 
import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.By; import java.util.*;
  
public class TC_GoogleLinks { 
	public static void main(String[] args) {
  
	  WebDriver obj = new ChromeDriver();
	  obj.navigate().to("https://www.google.com/"); 
	  List<WebElement> ls =obj.findElements(By.tagName("a")); 
	  int no_of_links = ls.size();
	  System.out.println("no of links are -->  " + no_of_links); 
	  for(int i=0;i<=no_of_links; i++) { 
		  System.out.println(i+1+ " " + ls.get(i).getText());
		  }
	  obj.close(); 
  }

}
 