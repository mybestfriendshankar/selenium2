package com_hrms_testsripts3;

import org.testng.annotations.Test;

import com_hrms_lib3.General3;

public class TC002 {

	//public static void main(String[] args) throws InterruptedException {

	@Test	
		public void tc002() throws InterruptedException  {
	General3 obj = new General3();	
	obj.openapplication();
	obj.login();
	obj.logout();
	obj.closeapplication();	
	}
}