package com_hrms_lib3;
import org.openqa.selenium.WebDriver;
public class Global3 {
 public WebDriver driver;
	public String url  = "http://183.82.103.245/nareshit/login.php";
	public String username = "nareshit";
	public String password  = "nareshit";
	public String empid     = "0819";
	
	public String txt_loginname = "txtUserName";
	public String txt_password  = "txtPassword";
	public String btn_login     = "Submit";
	public String frame_enter   ="rightMenu";
	public String  txt_searchemid      =  "loc_name";
	public String btn_search      = "//input[@value='Search']";
	public String btn_delete      = "//input[@value='Delete']";
	public String link_logout      = "Logout";
}

