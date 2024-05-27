package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Googlesearchpageobjects;

public class GoogleSearchPageTest {
private static	WebDriver driver = null ;

public static void main(String[] args) {
	googleSearchTest();
	
}

public static void googleSearchTest() {
	/*
	String projectPath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/");*/
	WebDriver driver = new ChromeDriver();
	 
	Googlesearchpageobjects searchPageObej = new Googlesearchpageobjects (driver);
	driver.get("https://google.com");
	searchPageObej.setTextSearchBox(" A B C D");
	searchPageObej.clickSearchButton();
	driver.close();
}
}
