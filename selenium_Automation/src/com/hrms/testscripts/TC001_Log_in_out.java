package com.hrms.testscripts;


import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001_Log_in_out {
//public static void main(String[] args) {        // when we work with TestNG main method is not needed
	@Test
	public void tc001() {
	DOMConfigurator.configure("log4j.xml");
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.logout();
	obj.closeApplication();
	}
}
