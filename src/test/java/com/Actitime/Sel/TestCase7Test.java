package com.Actitime.Sel;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestCase7Test {

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
	driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[2]/td/div[3]/a")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException ex) {
		// TODO Auto-generated catch block
		Thread.currentThread().interrupt();
	}

	driver.findElement(By.xpath("//*[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr[3]/td[6]/input")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException ex) {
		// TODO Auto-generated catch block
		Thread.currentThread().interrupt();
	}
	
	driver.findElement(By.xpath("//*[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr[6]/td/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]/input")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException ex) {
		// TODO Auto-generated catch block
		Thread.currentThread().interrupt();
	}

	driver.findElement(By.xpath("//*[@id='operationConfirmDialogDiv']/div/table/tbody/tr[2]/td/table/tbody/tr[5]/td/table/tbody/tr/td[1]/input")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException ex) {
		// TODO Auto-generated catch block
		Thread.currentThread().interrupt();
	}
	
	String Result = driver.findElement(By.xpath("//*[@id='SuccessMessages']/tbody/tr/td/span")).getText();
	System.out.println(Result);
	CustomAssert.verifyEqual(Result,"Selected projects have been successfully deleted.");

}

@AfterTest
public void closeTest1() throws Exception
{
	driver.close();
	
}
	
	
}
