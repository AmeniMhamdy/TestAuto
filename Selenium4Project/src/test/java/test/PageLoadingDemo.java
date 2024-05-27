package test;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class PageLoadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeOptions chromeOptions = new ChromeOptions();
		 //Page Loading Strategies
		 //NORMARL EAGER NONE
		 chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
		 
	
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://google.com/");
		 driver.quit();	
	}

}
