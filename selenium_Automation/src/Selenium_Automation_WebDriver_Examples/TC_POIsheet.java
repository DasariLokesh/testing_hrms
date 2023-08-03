package Selenium_Automation_WebDriver_Examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
		
public class TC_POIsheet{
	public static void main(String[] args) throws Exception{
		FileInputStream file = new FileInputStream("E:\\POI_sheet.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(file);
		XSSFSheet st = wb.getSheet("Ramesh");
		System.out.println(st.getSheetName());
		System.out.println(st.getLastRowNum());
		System.out.println("Before updating data in file "+ st.getRow(2).getCell(1));
		//Write data to file
		XSSFCell cell = st.getRow(2).getCell(1); 
		cell.setCellValue("Mahesh");
		file.close();
		FileOutputStream file_out = new FileOutputStream("E:\\POI_sheet.xlsx");
		wb.write(file_out);
		System.out.println("After updating file is  -->  "+ cell.getStringCellValue());
		file_out.close();
		
		
	}
	

}
