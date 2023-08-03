package Selenium_Automation_WebDriver_Examples;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class TC_JXLReadExcel {
	public static void main(String[] args) throws Exception{
		FileInputStream file = new FileInputStream("E:\\JXL_Sheet.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet(0);                                   // passing index or sheet name
		/*
		 * int row =1;                                                        // for single row data
		 * String emp_name = st.getCell(0,row).getContents(); 
		 * String emp_id = st.getCell(1,row).getContents(); 
		 * String emp_depart = st.getCell(2,row).getContents();
		 * System.out.println(emp_name+"||"+emp_id+"||"+emp_depart);
		 */
		int row_count = st.getRows();
		for (int i=1; i<row_count; i++) {
			String emp_name = st.getCell(0,i).getContents();                                      // for all rows data
			String emp_id   = st.getCell(1,i).getContents(); 
			String emp_depart = st.getCell(2,i).getContents();
			System.out.println(emp_name+"||"+emp_id+"||"+emp_depart);
			
		}
	}

}
