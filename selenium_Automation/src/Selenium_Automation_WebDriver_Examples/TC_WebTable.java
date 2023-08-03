package Selenium_Automation_WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_WebTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj = new ChromeDriver();
		obj.navigate().to("file:///D:/Testing%20Class/WebTable.html");
		int row = obj.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
		System.out.println("Row Count "+ row);
		Thread.sleep(3000);
		int col = obj.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size();
		System.out.println("Column Count "+ col);
		Thread.sleep(3000);
		int row_col = obj.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
		System.out.println("Row & column Count "+ row_col);
		Thread.sleep(3000);
		String celldata = obj.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[2]/td[2]")).getText();
		System.out.println("celldata "+ celldata);
		Thread.sleep(3000);
		for(int i=1;i<=row;i++) {
			String data = obj.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+i+"]")).getText();
			System.out.println("Table Data --> "+ data);
			Thread.sleep(1000);
		}
		obj.close();
		
	}

}
