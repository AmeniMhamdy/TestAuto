package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class TestNG_Demo {
	WebDriver driver = null ;

@BeforeTest	
	public void setUpTest() {
	driver = new ChromeDriver();
		/*
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/");*/
		//WebDriver driver = new ChromeDriver();
		
}

@Test
	public  void  googleSearch() {
		
		
		//goto google.com
		driver.get("https://google.com");
		
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		
		
		}
@AfterTest

		public void tearDownTest() {
	if (driver != null) {
		 // Use quit() instead of close() to close all browser windows and end the WebDriver session.
		 driver.quit();
		 // Set driver to null to indicate that the WebDriver session has ended.
		 driver = null;
		 }
		 System.out.println("Test Completed Successfully");
		}
}
