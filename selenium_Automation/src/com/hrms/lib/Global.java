package com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Global {
		public WebDriver driver;
		public Select select;
		//  ******** here we need to provide test data and objects related to whole application   *******
	// Test data OR Input data
		public String url = "http://183.82.103.245/nareshit/index.php";
		public String un = "nareshit";
		public String pd = "nareshit";
		public String EFN = "Lokesh";
		public String ELN = "Dasari";
		public String empid = "0798";
		
	// Objects OR Elements
		public String txt_usernname = "txtUserName";
		public String txt_password  = "txtPassword";
		public String btn_login     = "Submit";
		public String link_logout   = "Logout";
		public String txt_empFstName = "txtEmpFirstName";
		public String txt_empLstName = "txtEmpLastName";
		public String btn_save      = "btnEdit";
		public String txt_empid     = "0794";
		public String btn_delete    = "";
		public String sel_checkbox  = "chkLocID[]";
		public String link_text_serby = "Search By:";
		public String link_text_serFor = "Search For:";
		public String select_dropdown  = "loc_code";
		public String txt_searchfor    = "loc_name";
}
