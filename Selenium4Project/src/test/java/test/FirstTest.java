package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FirstTest {
	
 public static void main(String[] args) {
	//System.setProperty("webdriver.chome.driver", "./drivers/chromedriver.exe");
	
	//WebDriverManager.chromedriver().driverVersion("114.0.5735.16").setup();
	 WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	driver.get("https://google.com");
	driver.close();
}
}
