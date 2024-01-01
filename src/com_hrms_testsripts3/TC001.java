package com_hrms_testsripts3;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com_hrms_lib3.General3;

public class TC001 {
@Test	
	public void tc001() throws InterruptedException {
		
	General3 obj = new General3();
	
DOMConfigurator.configure("Log4j.xml");
obj.openapplication();
obj.login();
obj.enterframe();
obj.searchfor();
obj.btnsearch();
obj.btndelete();
obj.exitframe();
obj.logout();
obj.closeapplication();
	}
}
