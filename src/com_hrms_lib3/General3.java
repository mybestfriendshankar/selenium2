package com_hrms_lib3;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utlity.Log;

public class General3 extends Global3 {
public void openapplication() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.navigate().to(url);
	   System.out.println("open application");
	   Log.info("Application Open");
}
	public void login() throws InterruptedException {
	driver.findElement(By.name(txt_loginname)).sendKeys(username);	
	driver.findElement(By.name(txt_password)).sendKeys(password);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("login completed");
	Log.info("login completed");
	
	Thread.sleep(3000);
	}
	public void enterframe() throws InterruptedException {
		driver.switchTo().frame(frame_enter);
		System.out.println("enter frame");
		Select st = new Select(driver.findElement(By.name("loc_code")));
		st.selectByVisibleText("Emp. ID");
	System.out.println("emid completed");
	Log.info("employeid completed");
	Thread.sleep(3000);
	}
	public void searchfor() throws InterruptedException {
		driver.findElement(By.name(txt_searchemid)).sendKeys(empid);
		System.out.println("search for employe");
		Log.info("search foe employee");
		Thread.sleep(3000);
	}
	public void btnsearch() throws InterruptedException {
		driver.findElement(By.xpath(btn_search)).click();
		System.out.println("searching completed");
		driver.findElement(By.name("chkLocID[]")).click();
		System.out.println("check box completed");
		Log.info("check box completed");
		Thread.sleep(3000);
	}
	public void btndelete() throws InterruptedException {
		driver.findElement(By.xpath(btn_delete)).click();
		System.out.println("delete button completed");
		Log.info("delete button completed");
		Thread.sleep(3000);
	}
	public void exitframe() {
		driver.switchTo().defaultContent();
		System.out.println("frame exit");
		Log.info("frame completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("logout completed");
		Log.info("logout completd");
	}
	public void closeapplication() {
		driver.close();
		System.out.println("application closed");
		Log.info("application closed");
	}
	
}