
package com.Actitime.Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase5Test {

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
	driver.findElement(By.xpath("//*[@id='ext-comp-1002']/span")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException ex) {
		// TODO Auto-generated catch block
		Thread.currentThread().interrupt();
	}
	driver.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys("Abhishek B");
	driver.findElement(By.xpath("//*[@id='customerLightBox_descriptionField']")).sendKeys("Abhishek B");
	driver.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException ex) {
		// TODO Auto-generated catch block
		Thread.currentThread().interrupt();
	}

	driver.findElement(By.xpath("//*[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr[2]/td[2]/a")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException ex) {
		// TODO Auto-generated catch block
		Thread.currentThread().interrupt();
	}
	
	driver.findElement(By.xpath("//*[@id='projectPopup_projectNameField']")).sendKeys("Acti Time Project");
	driver.findElement(By.xpath("//*[@id='projectPopup_projectDescriptionField']")).sendKeys("Project for Actitime");
	driver.findElement(By.xpath("//*[@id='projectPopup_commitBtn']/div/span")).click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException ex) {
		// TODO Auto-generated catch block
		Thread.currentThread().interrupt();
	}

	String Result = driver.findElement(By.xpath("//*[@id='SuccessMessages']/tbody/tr/td/span")).getText();
	System.out.println(Result);
	CustomAssert.verifyEqual(Result,"Project \"Acti Time Project\" has been successfully created.");

}

@AfterTest
public void closeTest1() throws Exception
{
	driver.close();
	
}
	
	
}
