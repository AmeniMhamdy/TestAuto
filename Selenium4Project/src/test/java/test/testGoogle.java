package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
	}

	public static void  googleSearch() {
		/*
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/");*/
		WebDriver driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://google.com");
		
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("btnk")).sendKeys(Keys.ENTER);
		
		//close browser
		driver.close();	}
	
}
