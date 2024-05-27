package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;
public class GoogleSearchTest {
	private static WebDriver driver = null ;
	public static void main(String[] args) {
	
		googleSearch();
	}

	public static void  googleSearch() {
		
		driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://google.com");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step by Step");
		
		GoogleSearchPage.textbox_search(driver).sendKeys(Keys.ENTER);
		//close browser
		driver.close();
		System.out.println("Test Completed Successfully");
	}
}