package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Waits {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		/*
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("automation step by step" + Keys.ENTER);
		Thread.sleep(2000);*/
		
		/*
		// Explicit wait
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("automation step by step" + Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement myLink = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Automation Step by Step: NEVER STOP LEARNING")));
		myLink.click();*/
		
	
		// fluent wait
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("automation step by step" + Keys.ENTER);
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver> (driver)
		
		 .withTimeout(Duration.ofSeconds(10)) 
         .pollingEvery(Duration.ofSeconds(2)) 
         .ignoring(NoSuchElementException.class);
		
		driver.close();
		driver.quit();
	}

}
