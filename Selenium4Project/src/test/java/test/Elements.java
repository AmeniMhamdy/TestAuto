package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class Elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 	
			 WebDriver driver = new ChromeDriver();
/*
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
	
			driver.get("https://google.com");
			WebElement searchBox= driver.findElement(By.name("q"));
			searchBox.sendKeys("Selenium", Keys.ENTER);*/
			//Optionwithcheck
			
			driver.navigate().to("https://trytestingthis.netlify.app/");
			List<WebElement>options = driver.findElements(By.name("Optionwithcheck[]"));			
			Thread.sleep(2000);
			
			 for(WebElement element : options) {
				   System.out.println(element.getText());
				  }

			
			driver.findElement(By.cssSelector("#fname")).sendKeys("Ameni");
			
			
			Thread.sleep(2000);
			driver.close();
			driver.quit();
	}

}
