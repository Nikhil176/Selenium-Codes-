package com.Actitime.Sel;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestCase9Test {

	WebDriver driver;
	
@BeforeTest
public void startWebDriver() throws Exception
{ 
	driver = new FirefoxDriver();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException ex) {
		// TODO Auto-generated catch block
		Thread.currentThread().interrupt();
	}
	
	driver.navigate().to("http://localhost/login.do");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	try {
		Thread.sleep(7000);
	} catch (InterruptedException ex) {
		// TODO Auto-generated catch block
		Thread.currentThread().interrupt();
	}
}

@Test
public void execTest1() throws Exception
{
	driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException ex) {
		// TODO Auto-generated catch block
		Thread.currentThread().interrupt();
	}
	
	
	driver.findElement(By.xpath("//*[@id='taskNameCell3']/table/tbody/tr/td/a")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException ex) {
		// TODO Auto-generated catch block
		Thread.currentThread().interrupt();
	}
	driver.findElement(By.xpath("//*[@id='editTaskPopup_nameField']")).clear();
	driver.findElement(By.xpath("//*[@id='editTaskPopup_nameField']")).sendKeys("Edited Actitime Task");
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException ex) {
		// TODO Auto-generated catch block
		Thread.currentThread().interrupt();
	}
	
	driver.findElement(By.xpath("//*[@id='editTaskPopup_commitBtn']")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException ex) {
		// TODO Auto-generated catch block
		Thread.currentThread().interrupt();
	}
	
	String Result = driver.findElement(By.xpath("//*[@id='SuccessMessages']/tbody/tr/td/span")).getText();
	System.out.println(Result);
	CustomAssert.verifyEqual(Result,"Your changes have been saved.");
	
}

@AfterTest
public void closeTest1() throws Exception
{
	driver.close();
	
}
	
	
}