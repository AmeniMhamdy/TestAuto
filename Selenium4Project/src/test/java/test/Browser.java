package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser {
 
	public static void main(String[] args) throws InterruptedException, IOException {
		
			WebDriver driver = new ChromeDriver();
			/*****************************************/
/*
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
*/
			driver.get("https://google.com");
			String originalWindow = driver.getWindowHandle();

			/*
			driver.navigate().to("https://selenium.dev");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().forward();
			Thread.sleep(1000);
			driver.navigate().refresh();
			
	
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.switchTo().newWindow(WindowType.TAB);
			//TO Switch between windows
			driver.switchTo().window(originalWindow);*/
			
			//driver.navigate().to("https://burguindigital.com/exemple-page-accueil/");
			//driver.findElement(By.linkText("Blog")).click();
			/*****************************************/

			//Store dimensions & query later
			//Get width & height
			/*****************************************/
			/*
			driver.manage().window().getSize().getWidth();
			driver.manage().window().getSize().getHeight();
			Dimension size = driver.manage().window().getSize();
			System.out.println(size.getWidth());
			System.out.println(size.getHeight());
		*/
			//Set window size
			//driver.manage().window().setSize(new Dimension(800, 600));
		
			//Access x and y dimensions individually
			/*int x = driver.manage().window().getPosition().getX();
			int y = driver.manage().window().getPosition().getY();
			Point position = driver.manage().window().getPosition();
			int x1 = position.getX();
			int y1 = position.getY();*/
			
			/*******************************/
			
			//Move the window to the top left of the primary monitor
			//driver.manage().window().setPosition(new Point(500, 100));
			/******************/
			// maximize window
			/*
			driver.manage().window().maximize();
			Thread.sleep(2000);
			// minimize window
			driver.manage().window().minimize();  
			Thread.sleep(2000);
			// fullscreen
			driver.manage().window().fullscreen(); */
			/*******************/
		
			//Take screenshot
		/*
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("./image1.png"));
			
			//Take element screenshot
			WebElement element = driver.findElement(By.cssSelector(".lnXdpd"));
			File scrFile1 = element.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile1, new File("./image2.png"));*/
	
			
			/*********************************/
		
			//Create JavascriptExecutor interface object by Type casting
			JavascriptExecutor js = (JavascriptExecutor)driver;

			//Get return value from script
			WebElement button =driver.findElement(By.name("btnI"));
			String text = (String) js.executeScript("return arguments[0].innerText", button);

			//JavaScript to click element
			js.executeScript("arguments[0].click();", button);

			//Execute JS directly
			js.executeScript("console.log('hello world')");
			
		
			Thread.sleep(2000);
			/*******************************/

			driver.close();
			driver.quit();
	}
}
