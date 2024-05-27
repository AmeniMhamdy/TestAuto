package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		
		 ChromeDriver driver = new ChromeDriver();
	/*
		 // sendKeys()
		 driver.get("http://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);*/
	/*
		
		 //	 keyDown()
		 driver.get("http://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
		 Actions actionProvider = new Actions(driver);
		 Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
		 keydown.perform();*/
	
		
		 //keyUp()
		 driver.get("http://www.google.com");
		 Actions action = new Actions(driver);
		 WebElement search = driver.findElement(By.name("q"));
		 action.keyDown(Keys.SHIFT).sendKeys(search,"selenium")
		 .keyUp(Keys.SHIFT).sendKeys(" selenium").perform();
	
		 Thread.sleep(1000);
		 search.clear();
		 
		 
		 
		 Thread.sleep(1000);
		 driver.quit();


	}

}
